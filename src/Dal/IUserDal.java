package Dal;

import Model.User;

import java.sql.Statement;
import java.util.List;

//User repository methods interface
public interface IUserDal {
    List<User> getAllUsers(Statement statement);

    User getUserByUserId(Statement statement, String userId);

    User getUserByUserEmail(Statement statement, String userEmail);

    String getUserNameByUserId(Statement statement, String userId);

    String getUserSurnameByUserId(Statement statement, String userId);

    String getUserEmailByUserId(Statement statement, String userId);

    String getUserPasswordByUserId(Statement statement, String userId);

    Long getUserIdByUserEmailAndPassword(Statement statement, String userEmail, String userPassword);

    void updateUserNameByUserId(Statement statement, String userId, String userName);

    void updateUserSurnameByUserId(Statement statement, String userId, String userSurname);

    void updateUserEmailByUserId(Statement statement, String userId, String userEmail);

    void updateUserPasswordByUserId(Statement statement, String userId, String userPassword);

    void deleteUserByUserId(Statement statement, String userId);

    void addUser(Statement statement, Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser);

}
