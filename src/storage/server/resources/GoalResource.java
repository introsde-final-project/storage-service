package storage.server.resources;

import data.server.GoalImplementation;

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
@Path("/goal")
public class GoalResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getGoalList() throws Exception {
        System.out.println("Getting the list of goal...");
        String goalList = GoalImplementation.getGoalList();
        if (goalList != null) {
            return Response.ok(goalList).build();
        } else {
            return Response.status(404).build();
        }
    }

    @Path("{goalId}")
//    @Path("1")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getGoalById(@PathParam("goalId") int goalId) throws Exception {
        System.out.println("Getting goal with id: 1 ...");
        String goal = GoalImplementation.getGoalById(goalId);
        if (goal != null) {
            return Response.ok(goal).build();
        } else {
            return Response.status(404).build();
        }

    }

    //    @Path("{goalName}")
//    String goalN = "dec-weight";
    @Path("name/{goalName}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getGoalByName(@PathParam("goalName") String goalName) throws Exception {
        System.out.println("Getting goal with the name: " + goalName +" ...");
        String goal = GoalImplementation.getGoalByName(goalName);
        if (goal != null) {
            return Response.ok(goal).build();
        } else {
            return Response.status(404).build();
        }

    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void createGoal(String goal) throws Exception {
        System.out.println("Creating new goal...");
        GoalImplementation.createGoal(goal);
    }

    @Path("{goalId}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public void updateGoal(@PathParam("goalId") int goalId, String goal) throws Exception {
        System.out.println("Updating goal...");
        GoalImplementation.updateGoal(goalId, goal);
    }

    @Path("{goalId}")
    @DELETE
    public void deleteGoal(@PathParam("goalId") int goalId) throws Exception {
        System.out.println("Deleting goal...");
        GoalImplementation.deleteGoal(goalId);
    }
}