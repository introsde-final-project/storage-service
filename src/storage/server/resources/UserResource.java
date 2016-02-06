package storage.server.resources;

import data.server.UserImplementation;
import data.server.ws.User;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

/**
 * Created by bishruti on 1/14/16.
 */

@Stateless // Used only if the the application is deployed in a Java EE container
@LocalBean // Used only if the the application is deployed in a Java EE container
@Path("/user")
public class UserResource {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    /*  Request to obtain all the users and their details in the list.
        Expected Input: -
        Expected Output: List of users (String) */

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getListOfUser() throws Exception {
        List<User> userList = UserImplementation.getListOfUser();
        if (userList != null) {
            System.out.println("Generating the list of users...");
            return Response.ok(userList).build();
        }
        else {
            return Response.status(404).build();
        }
    }

    /* Request to obtain a user and the details associated to that user from the list.
       Expected Input: uId (Integer)
       Expected Output: User and the details associated to that user. (String) */

    @Path("{uId}")
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getUserDetail(@PathParam("uId") int uId) throws Exception {
        User user = UserImplementation.getUserDetail(uId);
        if (user != null) {
            System.out.println("Getting the info of the user with id: " + uId + "...");
            return Response.ok(user).build();
        }
        else {
            return Response.status(404).build();
        }

    }

    /*  Request to add a new user in the list.
        Expected Input: User (Object)
        Expected Output: Newly created User with the details associated to that user. (String) */

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response createUser(User user) throws Exception {
        System.out.println("Creating new user...");
        User newUser = UserImplementation.createUser(user);
        if (newUser != null) {
            System.out.println("Getting the info of the new user.");
            return Response.ok(newUser).build();
        }
        else {
            return Response.status(404).build();
        }
    }

     /*  Request to edit a user in the list.
        Expected Input: uId (Integer) and User (Object)
        Expected Output: Edited User with the details associated to that user. (String) */

    @Path("{uId}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateUser(@PathParam("uId") int uId, User user) throws Exception {
        System.out.println("Updating user...");
        UserImplementation.updateUser(uId, user);
    }

    /*  Request to delete a user from the list.
        Expected Input: uId (Integer)
        Expected Output: Response Message. */

    @Path("{uId}")
    @DELETE
    public void deleteUser(@PathParam("uId") int uId) throws Exception {
        System.out.println("Deleting user...");
        UserImplementation.deleteUser(uId);
    }

    /* Navigates to HealthMeasureHistoryResource if both uId and measuretype is obtained */
    @Path("{uId}/{measuretype}")
    public HealthMeasureHistoryResource getUserHistory(@PathParam("uId") int uId, @PathParam("measuretype") String measuretype) {
        return new HealthMeasureHistoryResource(uriInfo, request, uId, measuretype);
    }

}
