package storage.server.resources;

import data.server.ActivityImplementation;
import data.server.ws.Activity;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by bishruti on 1/14/16.
 */

@Stateless // Works only inside a Java EE application
@LocalBean // Works only inside a Java EE application
@Path("/activity")
public class ActivityResource {

    /* Request to obtain all the activities and their details in the list.
       Expected Input: -
       Expected Output: List of activities (String) */

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivityList() throws Exception {
        System.out.println("Getting the list of activities...");
        List<Activity> activityList = ActivityImplementation.getActivityList();
        if (activityList != null) {
            return Response.ok(activityList).build();
        } else {
            return Response.status(404).build();
        }
    }

    /* Request to obtain an activity and the details associated to that activity from the list.
       Expected Input: activityId (Integer)
       Expected Output: Activity and the details associated to that activity. (String) */

    @Path("{activityId}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivityById(@PathParam("activityId") int activityId) throws Exception {
        System.out.println("Getting activity with id: "+ activityId + " ...");
        Activity activity = ActivityImplementation.getActivityById(activityId);
        if (activity != null) {
            return Response.ok(activity).build();
        } else {
            return Response.status(404).build();
        }
    }

    /* Request to obtain an activity and the details associated to that activity from the list by activityName.
       Expected Input: activityName (String)
       Expected Output: Activity and the details associated to that activity. (String) */

    @Path("name/{activityName}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getActivityByName(@PathParam("activityName") String activityName) throws Exception {
        System.out.println("Getting activity with the name: " + activityName +" ...");
        Activity activity = ActivityImplementation.getActivityByName(activityName);
        if (activity != null) {
            return Response.ok(activity).build();
        } else {
            return Response.status(404).build();
        }

    }

    /*  Request to add a new activity in the list.
        Expected Input: Activity (Object)
        Expected Output: Newly created Activity with the details associated to that activity. (String) */

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void createActivity(Activity activity) throws Exception {
        System.out.println("Creating new activity...");
        ActivityImplementation.createActivity(activity);
    }

    /*  Request to edit an activity in the list.
        Expected Input: activityId (Integer) and Activity (Object)
        Expected Output: Edited activity with the details associated to that activity. (String) */

    @Path("{activityId}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateActivity(@PathParam("activityId") int activityId, Activity activity) throws Exception {
        System.out.println("Updating activity...");
        ActivityImplementation.updateActivity(activityId, activity);
    }

    /*  Request to delete an activity from the list.
        Expected Input: activityId (Integer)
        Expected Output: Response Message. */

    @Path("{activityId}")
    @DELETE
    public void deleteActivity(@PathParam("activityId") int activityId) throws Exception {
        System.out.println("Deleting activity...");
        ActivityImplementation.deleteActivity(activityId);
    }
}
