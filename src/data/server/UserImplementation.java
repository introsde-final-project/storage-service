package data.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.server.ws.Data;
import data.server.ws.DataService;
import data.server.ws.HealthMeasureHistory;
import data.server.ws.User;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.util.List;

/**
 * Created by bishruti on 1/14/16.
 */
public class UserImplementation {
    public static DataService service = new DataService();
    public static Data userData = service.getDataImplementationPort();
    public static ObjectMapper userMapper = new ObjectMapper();

    public static String getListOfUser() throws Exception {
        List<User> user = userData.readUserList();
        if (user == null) {
            return null;
        }
        else {
            String userList = userMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            return userList;
        }
    }

    public static String getUserDetail(Integer uId) throws Exception {
        User user = userData.readUser(uId);
        if (user == null) {
            return null;
        }
        else {
            String userDetail = userMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            return userDetail;
        }
    }

    public static void createUser(String user) throws Exception {
        User userDetail = userMapper.readValue(user, User.class);
        userData.createUser(createNewUser(userDetail.getFirstName(),
                userDetail.getLastName(),
                userDetail.getBirthDate(),
                userDetail.getBloodGroup(),
                userDetail.getAddress(),
                userDetail.getCurrentHealth()));
    }

    public static void updateUser(int userId, String user) throws Exception {
        User userDetail = userMapper.readValue(user, User.class);
        userData.updateUser(updateUserDetail(userId,
                userDetail.getFirstName(),
                userDetail.getLastName(),
                userDetail.getBirthDate(),
                userDetail.getBloodGroup(),
                userDetail.getAddress()));
    }

    public static void deleteUser(Integer userId) throws Exception {
        userData.deleteUser(userId);
    }

    public static String getUserHistory(Integer uId, String measureType) throws Exception {
        List<HealthMeasureHistory> healthMeasureHistory = userData.readUserHistory(uId, measureType);
        if (healthMeasureHistory == null) {
            return null;
        }
        else {
            String healthMeasureHistoryDetail = userMapper.writerWithDefaultPrettyPrinter().writeValueAsString(healthMeasureHistory);
            return healthMeasureHistoryDetail;
        }
    }

    public static Holder<User> createNewUser(String firstName,
                                             String lastName,
                                             XMLGregorianCalendar birthDate,
                                             String bloodGroup,
                                             String address,
                                             User.CurrentHealth currentHealth) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        try {
            user.setBirthDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(String.valueOf(birthDate)));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        user.setBloodGroup(bloodGroup);
        user.setAddress(address);
        user.setCurrentHealth(currentHealth);
        Holder<User> userHolder = new Holder<User>(user);
        return userHolder;
    }

    public static Holder<User> updateUserDetail(int uId,
                                                String firstname,
                                                String lastname,
                                                XMLGregorianCalendar birthdate,
                                                String bloodGroup,
                                                String address) {
        User user = new User();
        user.setUId(uId);
        user.setFirstName(firstname);
        user.setLastName(lastname);
        try {
            user.setBirthDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(String.valueOf(birthdate)));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        user.setBloodGroup(bloodGroup);
        user.setAddress(address);
        Holder<User> userHolder = new Holder<User>(user);
        return userHolder;
    }
}
