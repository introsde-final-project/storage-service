package storage.server.resources;

import data.server.ActivityImplementation;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bishruti on 1/14/16.
 */

@Stateless // Works only inside a Java EE application
@LocalBean // Works only inside a Java EE application
@Path("/activity")
public class ActivityResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivityList() throws Exception {
        System.out.println("Getting the list of activities...");
        String activityList = ActivityImplementation.getActivityList();
        if (activityList != null) {
            return Response.ok(activityList).build();
        } else {
            return Response.status(404).build();
        }
    }

    //    @Path("{activityId}")
    @Path("101")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivityById() throws Exception {
        System.out.println("Getting activity with id: 1 ...");
        String activity = ActivityImplementation.getActivityById(101);
        if (activity != null) {
            return Response.ok(activity).build();
        } else {
            return Response.status(404).build();
        }
    }

    //    @Path("{activityName}")
    String activityN = "walk-green";
    @Path("walk-green")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivityByName() throws Exception {
        System.out.println("Getting activity with the name: " + activityN +" ...");
        String activity = ActivityImplementation.getActivityByName(activityN);
        if (activity != null) {
            return Response.ok(activity).build();
        } else {
            return Response.status(404).build();
        }

    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void createActivity(String activity) throws Exception {
        System.out.println("Creating new activity...");
        ActivityImplementation.createActivity(activity);
    }

    //    @Path("{goalId}")
    @Path("1")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateActivity(String activity) throws Exception {
        System.out.println("Updating activity...");
        ActivityImplementation.updateActivity(1, activity);
    }

    //    @Path("{goalId}")
    @Path("101")
    @DELETE
    public void deleteActivity() throws Exception {
        System.out.println("Deleting activity...");
        ActivityImplementation.deleteActivity(101);
    }
}
