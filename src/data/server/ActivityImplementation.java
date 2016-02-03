package data.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.server.ws.Activity;
import data.server.ws.Data;
import data.server.ws.DataService;

import javax.xml.ws.Holder;
import java.util.List;

/**
 * Created by bishruti on 1/14/16.
 */
public class ActivityImplementation {
    public static DataService service = new DataService();
    public static Data activityData = service.getDataImplementationPort();
    public static ObjectMapper activityMapper = new ObjectMapper();

    public static List<Activity> getActivityList() throws Exception {
        List<Activity> activity = activityData.readActivityList();
        if (activity == null) {
            return null;
        }
        else {
            return activity;
        }
    }

    public static Activity getActivityById(Integer activityId) throws Exception {
        Activity activity = activityData.readActivity(activityId);
        if (activity == null) {
            return null;
        }
        else {
            return activity;
        }
    }

    public static Activity getActivityByName(String activityName) throws Exception {
        Activity activity = activityData.readActivityByName(activityName);
        if (activity == null) {
            return null;
        }
        else {
            return activity;
        }
    }

    public static void createActivity(Activity activity) throws Exception {
        activityData.createActivity(createNewActivity(activity.getActivityName(), activity.getActivityDescription()));
    }

    public static void updateActivity(int activityId, Activity activity) throws Exception {
        activityData.updateActivity(updateActivityDetails(activityId, activity.getActivityName(), activity.getActivityDescription()));
    }

    public static void deleteActivity(Integer activityId) throws Exception {
        activityData.deleteActivity(activityId);
    }

    public static Holder<Activity> createNewActivity(String activityName, String activityDescription) {
        Activity activity = new Activity();
        activity.setActivityName(activityName);
        activity.setActivityDescription(activityDescription);
        Holder<Activity> activityHolder = new Holder<Activity>(activity);
        return activityHolder;
    }

    public static Holder<Activity> updateActivityDetails(int activitylId, String activityName, String activityDescription) {
        Activity activity = new Activity();
        activity.setActivityId(activitylId);
        activity.setActivityName(activityName);
        activity.setActivityDescription(activityDescription);
        Holder<Activity> activityHolder = new Holder<Activity>(activity);
        return activityHolder;
    }
}
