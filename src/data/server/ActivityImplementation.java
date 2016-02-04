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

    /* Request to obtain all the activities and their details in the list.
       Expected Input: -
       Expected Output: List of activities (String) */

    public static List<Activity> getActivityList() throws Exception {
        List<Activity> activity = activityData.readActivityList();
        if (activity == null) {
            return null;
        }
        else {
            return activity;
        }
    }

    /* Request to obtain an activity and the details associated to that activity from the list.
       Expected Input: activityId (Integer)
       Expected Output: Activity and the details associated to that activity. (String) */

    public static Activity getActivityById(Integer activityId) throws Exception {
        Activity activity = activityData.readActivity(activityId);
        if (activity == null) {
            return null;
        }
        else {
            return activity;
        }
    }

    /* Request to obtain an activity and the details associated to that activity from the list by activityName.
       Expected Input: activityName (String)
       Expected Output: Activity and the details associated to that activity. (String) */

    public static Activity getActivityByName(String activityName) throws Exception {
        Activity activity = activityData.readActivityByName(activityName);
        if (activity == null) {
            return null;
        }
        else {
            return activity;
        }
    }

    /*  Request to add a new activity in the list.
        Expected Input: Activity (Object)
        Expected Output: Newly created Activity with the details associated to that activity. (String) */

    public static void createActivity(Activity activity) throws Exception {
        activityData.createActivity(createNewActivity(activity.getActivityName(), activity.getActivityDescription()));
    }

    /*  Request to edit an activity in the list.
        Expected Input: activityId (Integer) and Activity (Object)
        Expected Output: Edited activity with the details associated to that activity. (String) */

    public static void updateActivity(int activityId, Activity activity) throws Exception {
        activityData.updateActivity(updateActivityDetails(activityId, activity.getActivityName(), activity.getActivityDescription()));
    }

    /*  Request to delete an activity from the list.
        Expected Input: activityId (Integer)
        Expected Output: Response Message. */

    public static void deleteActivity(Integer activityId) throws Exception {
        activityData.deleteActivity(activityId);
    }

    //**********************************************************************************************************
    // HELPER METHODS
    //**********************************************************************************************************

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
