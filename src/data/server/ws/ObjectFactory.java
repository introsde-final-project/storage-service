
package data.server.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the data.server.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://ws.server.data/", "deleteMeasureResponse");
    private final static QName _ReadUserHistoryResponse_QNAME = new QName("http://ws.server.data/", "readUserHistoryResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://ws.server.data/", "updateUserResponse");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://ws.server.data/", "readGoalResponse");
    private final static QName _ReadActivityByNameResponse_QNAME = new QName("http://ws.server.data/", "readActivityByNameResponse");
    private final static QName _ReadActivityList_QNAME = new QName("http://ws.server.data/", "readActivityList");
    private final static QName _ReadUserResponse_QNAME = new QName("http://ws.server.data/", "readUserResponse");
    private final static QName _SaveUserMeasureResponse_QNAME = new QName("http://ws.server.data/", "saveUserMeasureResponse");
    private final static QName _ReadActivityByName_QNAME = new QName("http://ws.server.data/", "readActivityByName");
    private final static QName _CreateActivityResponse_QNAME = new QName("http://ws.server.data/", "createActivityResponse");
    private final static QName _UpdateActivity_QNAME = new QName("http://ws.server.data/", "updateActivity");
    private final static QName _ReadActivityListResponse_QNAME = new QName("http://ws.server.data/", "readActivityListResponse");
    private final static QName _ReadGoalList_QNAME = new QName("http://ws.server.data/", "readGoalList");
    private final static QName _DeleteActivityResponse_QNAME = new QName("http://ws.server.data/", "deleteActivityResponse");
    private final static QName _ReadActivity_QNAME = new QName("http://ws.server.data/", "readActivity");
    private final static QName _ReadGoal_QNAME = new QName("http://ws.server.data/", "readGoal");
    private final static QName _ReadUser_QNAME = new QName("http://ws.server.data/", "readUser");
    private final static QName _DeleteMeasure_QNAME = new QName("http://ws.server.data/", "deleteMeasure");
    private final static QName _ReadActivityResponse_QNAME = new QName("http://ws.server.data/", "readActivityResponse");
    private final static QName _UpdateUserMeasure_QNAME = new QName("http://ws.server.data/", "updateUserMeasure");
    private final static QName _ReadGoalListResponse_QNAME = new QName("http://ws.server.data/", "readGoalListResponse");
    private final static QName _ReadUserMeasure_QNAME = new QName("http://ws.server.data/", "readUserMeasure");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.server.data/", "deleteGoalResponse");
    private final static QName _ReadUserListResponse_QNAME = new QName("http://ws.server.data/", "readUserListResponse");
    private final static QName _ReadGoalByNameResponse_QNAME = new QName("http://ws.server.data/", "readGoalByNameResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.server.data/", "deleteUserResponse");
    private final static QName _CreateUser_QNAME = new QName("http://ws.server.data/", "createUser");
    private final static QName _CreateGoal_QNAME = new QName("http://ws.server.data/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.server.data/", "deleteGoal");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.server.data/", "deleteUser");
    private final static QName _ReadUserHistory_QNAME = new QName("http://ws.server.data/", "readUserHistory");
    private final static QName _SaveUserMeasure_QNAME = new QName("http://ws.server.data/", "saveUserMeasure");
    private final static QName _DeleteActivity_QNAME = new QName("http://ws.server.data/", "deleteActivity");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://ws.server.data/", "createGoalResponse");
    private final static QName _ReadGoalByName_QNAME = new QName("http://ws.server.data/", "readGoalByName");
    private final static QName _UpdateGoal_QNAME = new QName("http://ws.server.data/", "updateGoal");
    private final static QName _ReadUserMeasureResponse_QNAME = new QName("http://ws.server.data/", "readUserMeasureResponse");
    private final static QName _UpdateActivityResponse_QNAME = new QName("http://ws.server.data/", "updateActivityResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://ws.server.data/", "updateUser");
    private final static QName _ReadUserList_QNAME = new QName("http://ws.server.data/", "readUserList");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.server.data/", "createUserResponse");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://ws.server.data/", "updateGoalResponse");
    private final static QName _UpdateUserMeasureResponse_QNAME = new QName("http://ws.server.data/", "updateUserMeasureResponse");
    private final static QName _CreateActivity_QNAME = new QName("http://ws.server.data/", "createActivity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: data.server.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ReadUserListResponse }
     * 
     */
    public ReadUserListResponse createReadUserListResponse() {
        return new ReadUserListResponse();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link ReadUserMeasure }
     * 
     */
    public ReadUserMeasure createReadUserMeasure() {
        return new ReadUserMeasure();
    }

    /**
     * Create an instance of {@link ReadGoalListResponse }
     * 
     */
    public ReadGoalListResponse createReadGoalListResponse() {
        return new ReadGoalListResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link ReadActivityResponse }
     * 
     */
    public ReadActivityResponse createReadActivityResponse() {
        return new ReadActivityResponse();
    }

    /**
     * Create an instance of {@link UpdateUserMeasure }
     * 
     */
    public UpdateUserMeasure createUpdateUserMeasure() {
        return new UpdateUserMeasure();
    }

    /**
     * Create an instance of {@link ReadUser }
     * 
     */
    public ReadUser createReadUser() {
        return new ReadUser();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link DeleteActivityResponse }
     * 
     */
    public DeleteActivityResponse createDeleteActivityResponse() {
        return new DeleteActivityResponse();
    }

    /**
     * Create an instance of {@link ReadActivity }
     * 
     */
    public ReadActivity createReadActivity() {
        return new ReadActivity();
    }

    /**
     * Create an instance of {@link ReadGoalList }
     * 
     */
    public ReadGoalList createReadGoalList() {
        return new ReadGoalList();
    }

    /**
     * Create an instance of {@link ReadActivityListResponse }
     * 
     */
    public ReadActivityListResponse createReadActivityListResponse() {
        return new ReadActivityListResponse();
    }

    /**
     * Create an instance of {@link CreateActivityResponse }
     * 
     */
    public CreateActivityResponse createCreateActivityResponse() {
        return new CreateActivityResponse();
    }

    /**
     * Create an instance of {@link UpdateActivity }
     * 
     */
    public UpdateActivity createUpdateActivity() {
        return new UpdateActivity();
    }

    /**
     * Create an instance of {@link ReadActivityByName }
     * 
     */
    public ReadActivityByName createReadActivityByName() {
        return new ReadActivityByName();
    }

    /**
     * Create an instance of {@link SaveUserMeasureResponse }
     * 
     */
    public SaveUserMeasureResponse createSaveUserMeasureResponse() {
        return new SaveUserMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadUserResponse }
     * 
     */
    public ReadUserResponse createReadUserResponse() {
        return new ReadUserResponse();
    }

    /**
     * Create an instance of {@link ReadActivityByNameResponse }
     * 
     */
    public ReadActivityByNameResponse createReadActivityByNameResponse() {
        return new ReadActivityByNameResponse();
    }

    /**
     * Create an instance of {@link ReadActivityList }
     * 
     */
    public ReadActivityList createReadActivityList() {
        return new ReadActivityList();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link ReadUserHistoryResponse }
     * 
     */
    public ReadUserHistoryResponse createReadUserHistoryResponse() {
        return new ReadUserHistoryResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link CreateActivity }
     * 
     */
    public CreateActivity createCreateActivity() {
        return new CreateActivity();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link UpdateUserMeasureResponse }
     * 
     */
    public UpdateUserMeasureResponse createUpdateUserMeasureResponse() {
        return new UpdateUserMeasureResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link ReadUserList }
     * 
     */
    public ReadUserList createReadUserList() {
        return new ReadUserList();
    }

    /**
     * Create an instance of {@link ReadUserMeasureResponse }
     * 
     */
    public ReadUserMeasureResponse createReadUserMeasureResponse() {
        return new ReadUserMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdateActivityResponse }
     * 
     */
    public UpdateActivityResponse createUpdateActivityResponse() {
        return new UpdateActivityResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link ReadGoalByName }
     * 
     */
    public ReadGoalByName createReadGoalByName() {
        return new ReadGoalByName();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link DeleteActivity }
     * 
     */
    public DeleteActivity createDeleteActivity() {
        return new DeleteActivity();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link ReadUserHistory }
     * 
     */
    public ReadUserHistory createReadUserHistory() {
        return new ReadUserHistory();
    }

    /**
     * Create an instance of {@link SaveUserMeasure }
     * 
     */
    public SaveUserMeasure createSaveUserMeasure() {
        return new SaveUserMeasure();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link ReadGoalByNameResponse }
     * 
     */
    public ReadGoalByNameResponse createReadGoalByNameResponse() {
        return new ReadGoalByNameResponse();
    }

    /**
     * Create an instance of {@link HealthProfile }
     * 
     */
    public HealthProfile createHealthProfile() {
        return new HealthProfile();
    }

    /**
     * Create an instance of {@link HealthMeasureHistory }
     * 
     */
    public HealthMeasureHistory createHealthMeasureHistory() {
        return new HealthMeasureHistory();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link User.CurrentHealth }
     * 
     */
    public User.CurrentHealth createUserCurrentHealth() {
        return new User.CurrentHealth();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserHistoryResponse")
    public JAXBElement<ReadUserHistoryResponse> createReadUserHistoryResponse(ReadUserHistoryResponse value) {
        return new JAXBElement<ReadUserHistoryResponse>(_ReadUserHistoryResponse_QNAME, ReadUserHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivityByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readActivityByNameResponse")
    public JAXBElement<ReadActivityByNameResponse> createReadActivityByNameResponse(ReadActivityByNameResponse value) {
        return new JAXBElement<ReadActivityByNameResponse>(_ReadActivityByNameResponse_QNAME, ReadActivityByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivityList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readActivityList")
    public JAXBElement<ReadActivityList> createReadActivityList(ReadActivityList value) {
        return new JAXBElement<ReadActivityList>(_ReadActivityList_QNAME, ReadActivityList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserResponse")
    public JAXBElement<ReadUserResponse> createReadUserResponse(ReadUserResponse value) {
        return new JAXBElement<ReadUserResponse>(_ReadUserResponse_QNAME, ReadUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "saveUserMeasureResponse")
    public JAXBElement<SaveUserMeasureResponse> createSaveUserMeasureResponse(SaveUserMeasureResponse value) {
        return new JAXBElement<SaveUserMeasureResponse>(_SaveUserMeasureResponse_QNAME, SaveUserMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivityByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readActivityByName")
    public JAXBElement<ReadActivityByName> createReadActivityByName(ReadActivityByName value) {
        return new JAXBElement<ReadActivityByName>(_ReadActivityByName_QNAME, ReadActivityByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "createActivityResponse")
    public JAXBElement<CreateActivityResponse> createCreateActivityResponse(CreateActivityResponse value) {
        return new JAXBElement<CreateActivityResponse>(_CreateActivityResponse_QNAME, CreateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateActivity")
    public JAXBElement<UpdateActivity> createUpdateActivity(UpdateActivity value) {
        return new JAXBElement<UpdateActivity>(_UpdateActivity_QNAME, UpdateActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivityListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readActivityListResponse")
    public JAXBElement<ReadActivityListResponse> createReadActivityListResponse(ReadActivityListResponse value) {
        return new JAXBElement<ReadActivityListResponse>(_ReadActivityListResponse_QNAME, ReadActivityListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readGoalList")
    public JAXBElement<ReadGoalList> createReadGoalList(ReadGoalList value) {
        return new JAXBElement<ReadGoalList>(_ReadGoalList_QNAME, ReadGoalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteActivityResponse")
    public JAXBElement<DeleteActivityResponse> createDeleteActivityResponse(DeleteActivityResponse value) {
        return new JAXBElement<DeleteActivityResponse>(_DeleteActivityResponse_QNAME, DeleteActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readActivity")
    public JAXBElement<ReadActivity> createReadActivity(ReadActivity value) {
        return new JAXBElement<ReadActivity>(_ReadActivity_QNAME, ReadActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUser")
    public JAXBElement<ReadUser> createReadUser(ReadUser value) {
        return new JAXBElement<ReadUser>(_ReadUser_QNAME, ReadUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readActivityResponse")
    public JAXBElement<ReadActivityResponse> createReadActivityResponse(ReadActivityResponse value) {
        return new JAXBElement<ReadActivityResponse>(_ReadActivityResponse_QNAME, ReadActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateUserMeasure")
    public JAXBElement<UpdateUserMeasure> createUpdateUserMeasure(UpdateUserMeasure value) {
        return new JAXBElement<UpdateUserMeasure>(_UpdateUserMeasure_QNAME, UpdateUserMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readGoalListResponse")
    public JAXBElement<ReadGoalListResponse> createReadGoalListResponse(ReadGoalListResponse value) {
        return new JAXBElement<ReadGoalListResponse>(_ReadGoalListResponse_QNAME, ReadGoalListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserMeasure")
    public JAXBElement<ReadUserMeasure> createReadUserMeasure(ReadUserMeasure value) {
        return new JAXBElement<ReadUserMeasure>(_ReadUserMeasure_QNAME, ReadUserMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserListResponse")
    public JAXBElement<ReadUserListResponse> createReadUserListResponse(ReadUserListResponse value) {
        return new JAXBElement<ReadUserListResponse>(_ReadUserListResponse_QNAME, ReadUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readGoalByNameResponse")
    public JAXBElement<ReadGoalByNameResponse> createReadGoalByNameResponse(ReadGoalByNameResponse value) {
        return new JAXBElement<ReadGoalByNameResponse>(_ReadGoalByNameResponse_QNAME, ReadGoalByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserHistory")
    public JAXBElement<ReadUserHistory> createReadUserHistory(ReadUserHistory value) {
        return new JAXBElement<ReadUserHistory>(_ReadUserHistory_QNAME, ReadUserHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUserMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "saveUserMeasure")
    public JAXBElement<SaveUserMeasure> createSaveUserMeasure(SaveUserMeasure value) {
        return new JAXBElement<SaveUserMeasure>(_SaveUserMeasure_QNAME, SaveUserMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "deleteActivity")
    public JAXBElement<DeleteActivity> createDeleteActivity(DeleteActivity value) {
        return new JAXBElement<DeleteActivity>(_DeleteActivity_QNAME, DeleteActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readGoalByName")
    public JAXBElement<ReadGoalByName> createReadGoalByName(ReadGoalByName value) {
        return new JAXBElement<ReadGoalByName>(_ReadGoalByName_QNAME, ReadGoalByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserMeasureResponse")
    public JAXBElement<ReadUserMeasureResponse> createReadUserMeasureResponse(ReadUserMeasureResponse value) {
        return new JAXBElement<ReadUserMeasureResponse>(_ReadUserMeasureResponse_QNAME, ReadUserMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateActivityResponse")
    public JAXBElement<UpdateActivityResponse> createUpdateActivityResponse(UpdateActivityResponse value) {
        return new JAXBElement<UpdateActivityResponse>(_UpdateActivityResponse_QNAME, UpdateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "readUserList")
    public JAXBElement<ReadUserList> createReadUserList(ReadUserList value) {
        return new JAXBElement<ReadUserList>(_ReadUserList_QNAME, ReadUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "updateUserMeasureResponse")
    public JAXBElement<UpdateUserMeasureResponse> createUpdateUserMeasureResponse(UpdateUserMeasureResponse value) {
        return new JAXBElement<UpdateUserMeasureResponse>(_UpdateUserMeasureResponse_QNAME, UpdateUserMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.data/", name = "createActivity")
    public JAXBElement<CreateActivity> createCreateActivity(CreateActivity value) {
        return new JAXBElement<CreateActivity>(_CreateActivity_QNAME, CreateActivity.class, null, value);
    }

}
