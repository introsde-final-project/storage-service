package data.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.server.ws.Data;
import data.server.ws.DataService;
import data.server.ws.User;

import java.util.List;
/**
 * Created by bishruti on 1/14/16.
 */
public class DataImplementation {
    public static DataService service = new DataService();
    public static Data data = service.getDataImplementationPort();
    public static ObjectMapper mapper = new ObjectMapper();

    public static String getListOfUser() throws Exception {
        List<User> user = data.readUserList();
        if (user == null) {
            return null;
        }
        else {
            String userList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            return userList;
        }
    }

    public static String getUserDetail(Integer uId) throws Exception {
        User user = data.readUser(uId);
        if (user == null) {
            return null;
        }
        else {
            String userDetail = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            return userDetail;
        }
    }

    /*public static String getGoalList() throws Exception {
        List<Goal> goal = data.readGoalList();
        if (goal == null) {
            return null;
        }
        else {
            String goalList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(goal);
            return goalList;
        }
    }

    public static String getGoal(Integer goalId) throws Exception {
        Goal goal = data.readGoal(goalId);
        if (goal == null) {
            return null;
        }
        else {
            String goalDetail = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(goal);
            return goalDetail;
        }
    }*/



}
