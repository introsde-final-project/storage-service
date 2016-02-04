package data.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.server.ws.Data;
import data.server.ws.DataService;
import data.server.ws.Goal;

import javax.xml.ws.Holder;
import java.util.List;

/**
 * Created by bishruti on 1/14/16.
 */
public class GoalImplementation {
    public static DataService service = new DataService();
    public static Data goalData = service.getDataImplementationPort();
    public static ObjectMapper goalMapper = new ObjectMapper();

    /*  Request to obtain all the goals and their details in the list.
        Expected Input: -
        Expected Output: List of goals (String) */

    public static List<Goal> getGoalList() throws Exception {
        List<Goal> goal = goalData.readGoalList();
        if (goal == null) {
            return null;
        }
        else {
            return goal;
        }
    }

    /* Request to obtain a goal and the details associated to that goal from the list.
       Expected Input: goalId (Integer)
       Expected Output: Goal and the details associated to that goal. (String) */

    public static Goal getGoalById(Integer goalId) throws Exception {
        Goal goal = goalData.readGoal(goalId);
        if (goal == null) {
            return null;
        }
        else {
            return goal;
        }
    }

     /* Request to obtain a goal and the details associated to that goal from the list by goalName.
        Expected Input: goalName (String)
        Expected Output: Goal and the details associated to that goal. (String) */

    public static Goal getGoalByName(String goalName) throws Exception {
        Goal goal = goalData.readGoalByName(goalName);
        if (goal == null) {
            return null;
        }
        else {
            return goal;
        }
    }

    /*  Request to add a new goal in the list.
        Expected Input: Goal (Object)
        Expected Output: Newly created Goal with the details associated to that goal. (String) */

    public static void createGoal(Goal goal) throws Exception {
        goalData.createGoal(createNewGoal(goal.getGoalName(), goal.getGoalDescription()));
    }

    /*  Request to edit a goal in the list.
        Expected Input: goalId (Integer) and Goal (Object)
        Expected Output: Edited Goal with the details associated to that goal. (String) */

    public static void updateGoal(int goalId, Goal goal) throws Exception {
        goalData.updateGoal(updateGoalDetails(goalId, goal.getGoalName(), goal.getGoalDescription()));
    }

    /*  Request to delete a goal from the list.
        Expected Input: goalId (Integer)
        Expected Output: Response Message. */

    public static void deleteGoal(Integer goalId) throws Exception {
        goalData.deleteGoal(goalId);
    }

    //**********************************************************************************************************
    // HELPER METHODS
    //**********************************************************************************************************

    public static Holder<Goal> createNewGoal(String goalName, String goalDescription) {
        Goal goal = new Goal();
        goal.setGoalName(goalName);
        goal.setGoalDescription(goalDescription);
        Holder<Goal> goalHolder = new Holder<Goal>(goal);
        return goalHolder;
    }

    public static Holder<Goal> updateGoalDetails(int goalId, String goalName, String goalDescription) {
        Goal goal = new Goal();
        goal.setGoalId(goalId);
        goal.setGoalName(goalName);
        goal.setGoalDescription(goalDescription);
        Holder<Goal> goalHolder = new Holder<Goal>(goal);
        return goalHolder;
    }
}

