package data.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.server.ws.Data;
import data.server.ws.DataService;
import data.server.ws.HealthMeasureHistory;
import data.server.ws.User;

import javax.xml.ws.Holder;
import java.util.Date;
import java.util.List;

/**
 * Created by bishruti on 1/14/16.
 */
public class UserImplementation {
    public static DataService service = new DataService();
    public static Data userData = service.getDataImplementationPort();
    public static ObjectMapper userMapper = new ObjectMapper();

    public static List<User> getListOfUser() throws Exception {
        List<User> userList = userData.readUserList();
        if (userList == null) {
            return null;
        } else {
            return userList;
        }
    }

    public static User getUserDetail(int uId) throws Exception {
        User user = userData.readUser(uId);
        if (user == null) {
            return null;
        } else {
            return user;
        }
    }

    public static void createUser(User userDetail) throws Exception {
        userData.createUser(createNewUser(userDetail.getFirstName(),
                userDetail.getLastName(),
                userDetail.getBirthDate(),
                userDetail.getBloodGroup(),
                userDetail.getAddress(),
                userDetail.getCurrentHealth()));
    }

    public static void updateUser(int userId, User userDetail) throws Exception {
        userData.updateUser(updateUserDetail(userId,
                userDetail.getFirstName(),
                userDetail.getLastName(),
                userDetail.getBirthDate(),
                userDetail.getBloodGroup(),
                userDetail.getAddress()));
    }

    public static void deleteUser(int userId) throws Exception {
        userData.deleteUser(userId);
    }

    public static List<HealthMeasureHistory> getUserHistory(int uId, String measureType) throws Exception {
        List<HealthMeasureHistory> healthMeasureHistory = userData.readUserHistory(uId, measureType);
        if (healthMeasureHistory == null) {
            return null;
        } else {
            return healthMeasureHistory;
        }
    }

    public static List<HealthMeasureHistory> getUserMeasure(int uId, String measureType, int hmhId) throws Exception {
        List<HealthMeasureHistory> healthMeasureHistory = userData.readUserMeasure(uId, measureType, hmhId);
        if (healthMeasureHistory == null) {
            return null;
        } else {
            return healthMeasureHistory;
        }
    }

    public static void createUserMeasure(int uId, HealthMeasureHistory healthMeasureHistoryDetails) throws Exception {
        userData.saveUserMeasure(uId, createNewHealthMeasureHistory(healthMeasureHistoryDetails.getMeasureType(),
                healthMeasureHistoryDetails.getMeasureValue(),
                healthMeasureHistoryDetails.getMeasureValueType()));
    }

    public static void updateUserMeasure(int uId, HealthMeasureHistory healthMeasureHistoryDetails, int hmhId) throws Exception {
        userData.updateUserMeasure(uId, updateHealthMeasureHistory(hmhId, healthMeasureHistoryDetails.getMeasureType(),
                healthMeasureHistoryDetails.getMeasureValue(),
                healthMeasureHistoryDetails.getMeasureValueType()));
    }

    public static void deleteUserMeasure(int uId, int hmhId) throws Exception {
        userData.deleteMeasure(uId, hmhId);
    }

    public static Holder<User> createNewUser(String firstName,
                                             String lastName,
                                             Date birthDate,
                                             String bloodGroup,
                                             String address,
                                             User.CurrentHealth currentHealth) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBirthDate(birthDate);
        user.setBloodGroup(bloodGroup);
        user.setAddress(address);
        user.setCurrentHealth(currentHealth);
        Holder<User> userHolder = new Holder<User>(user);
        return userHolder;
    }

    public static Holder<User> updateUserDetail(int uId,
                                                String firstname,
                                                String lastname,
                                                Date birthdate,
                                                String bloodGroup,
                                                String address) {
        User user = new User();
        user.setUId(uId);
        if (firstname != null) {
            user.setFirstName(firstname);
        }
        if (lastname != null) {
            user.setLastName(lastname);
        }
        if (birthdate != null) {
            user.setBirthDate(birthdate);
        }
        if (bloodGroup != null) {
            user.setBloodGroup(bloodGroup);
        }
        if (address != null) {
            user.setAddress(address);
        }
        Holder<User> userHolder = new Holder<User>(user);
        return userHolder;
    }

    public static Holder<HealthMeasureHistory> createNewHealthMeasureHistory(String measureType, String measureValue, String measureValueType) {
        HealthMeasureHistory healthMeasureHistory = new HealthMeasureHistory();
        healthMeasureHistory.setMeasureType(measureType);
        healthMeasureHistory.setMeasureValue(measureValue);
        healthMeasureHistory.setMeasureValueType(measureValueType);
        Holder<HealthMeasureHistory> healthMeasureHistoryHolder = new Holder<HealthMeasureHistory>(healthMeasureHistory);
        return healthMeasureHistoryHolder;
    }

    public static Holder<HealthMeasureHistory> updateHealthMeasureHistory(int hmhId,
                                                                          String measureType,
                                                                          String measureValue,
                                                                          String measureValueType) {
        HealthMeasureHistory healthMeasureHistory = new HealthMeasureHistory();
        healthMeasureHistory.setHmhId(hmhId);
        if (measureType != null) {
            healthMeasureHistory.setMeasureType(measureType);
        }
        if (measureValue != null) {
            healthMeasureHistory.setMeasureValue(measureValue);
        }
        if (measureValueType != null) {
            healthMeasureHistory.setMeasureValueType(measureValueType);
        }
        Holder<HealthMeasureHistory> healthMeasureHistoryHolder = new Holder<HealthMeasureHistory>(healthMeasureHistory);
        return healthMeasureHistoryHolder;
    }
}