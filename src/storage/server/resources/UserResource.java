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
//    @Path("102")
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getUserDetail(@PathParam("uId") int uId) throws Exception {
        System.out.println("#####################");
        System.out.println(uId);
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

    //    @Path("{goalId}")
    @Path("102")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateGoal(String user) throws Exception {
        System.out.println("Updating user...");
        UserImplementation.updateUser(102, user);
    }

    @Path("103")
    @DELETE
    public void deleteUser() throws Exception {
        System.out.println("Deleting user...");
        UserImplementation.deleteUser(103);
    }
}
