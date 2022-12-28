package Dal;

import Model.PasswordRecord;
import Model.User;

import javax.swing.plaf.nimbus.State;
import java.sql.Statement;
import java.util.List;

public interface IUserDal {
    List<User> getAllUsers();
    User getUserByUserId(Statement statement, String userId);
    User getUserByUserEmail(Statement statement, String userEmail);
    String getUserNameByUserId(Statement statement, String userId);
    String getUserSurnameByUserId(Statement statement, String userId);
    String getUserEmailByUserId(Statement statement, String userId);
    String getUserPasswordByUserId(Statement statement, String userId);
    Long getUserIdByUserEmailAndPassword(Statement statement, String userId);
    void updateUserNameByUserId(Statement statement, String userId);
    void updateUserSurnameByUserId(Statement statement, String userId);
    void updateUserEmailByUserId(Statement statement, String userId);
    void updateUserPasswordByUserId(Statement statement, String userId);
    void deleteUserByUserId(Statement statement, String userId);
    void addUser(Statement statement, Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser);

}
