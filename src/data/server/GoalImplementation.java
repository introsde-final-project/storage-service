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

    public static String getGoalList() throws Exception {
        List<Goal> goal = goalData.readGoalList();
        if (goal == null) {
            return null;
        }
        else {
            String goalList = goalMapper.writerWithDefaultPrettyPrinter().writeValueAsString(goal);
            return goalList;
        }
    }

    public static String getGoalById(Integer goalId) throws Exception {
        Goal goal = goalData.readGoal(goalId);
        if (goal == null) {
            return null;
        }
        else {
            String goalDetail = goalMapper.writerWithDefaultPrettyPrinter().writeValueAsString(goal);
            return goalDetail;
        }
    }

    public static String getGoalByName(String goalName) throws Exception {
        Goal goal = goalData.readGoalByName(goalName);
        if (goal == null) {
            return null;
        }
        else {
            String goalDetail = goalMapper.writerWithDefaultPrettyPrinter().writeValueAsString(goal);
            return goalDetail;
        }
    }

    public static void createGoal(String goal) throws Exception {
        Goal goalDetail = goalMapper.readValue(goal, Goal.class);
        goalData.createGoal(createNewGoal(goalDetail.getGoalName(), goalDetail.getGoalDescription()));
    }

    public static void updateGoal(int goalId, String goal) throws Exception {
        Goal goalDetail = goalMapper.readValue(goal, Goal.class);
        goalData.updateGoal(updateGoalDetails(goalId, goalDetail.getGoalName(), goalDetail.getGoalDescription()));
    }

    public static void deleteGoal(Integer goalId) throws Exception {
        goalData.deleteGoal(goalId);
    }

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

