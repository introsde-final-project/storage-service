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
//        Integer uId = mapper.readValue(i, Integer.class);
        User user = data.readUser(uId);
        if (user == null) {
            return null;
        }
        else {
            String userDetial = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            return userDetial;
        }
    }

}
