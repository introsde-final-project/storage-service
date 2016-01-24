package storage.server.resources;

import data.server.UserImplementation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

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

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getListOfUser() throws Exception {
        String userList = UserImplementation.getListOfUser();
        if (userList != null) {
            return Response.ok(userList).build();
        }
        else {
            return Response.status(404).build();
        }
    }

    @Path("{uId}")
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getUserDetail(@PathParam("uId") int uId) throws Exception {
        String user = UserImplementation.getUserDetail(uId);
        if (user != null) {
            return Response.ok(user).build();
        }
        else {
            return Response.status(404).build();
        }

    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void createUser(String user) throws Exception {
        System.out.println("Creating new user...");
        UserImplementation.createUser(user);
    }

    @Path("{uId}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateGoal(@PathParam("uId") int uId, String user) throws Exception {
        System.out.println("Updating user...");
        UserImplementation.updateUser(uId, user);
    }

    @Path("{uId}")
    @DELETE
    public void deleteUser(@PathParam("uId") int uId) throws Exception {
        System.out.println("Deleting user...");
        UserImplementation.deleteUser(uId);
    }

    @Path("{uId}/{measuretype}")
    public HealthMeasureHistoryResource getUserHealthMeasureHistory(@PathParam("uId") int uId, @PathParam("measuretype") String measuretype) {
        return new HealthMeasureHistoryResource(uriInfo, request, uId, measuretype);
    }
}
