package Business;

import Dal.IUserDal;
import Model.User;

import java.sql.Statement;
import java.util.List;

public interface IUserManager {
    List<User> getAllUsers(IUserDal userDal, Statement statement);
    User getUserByUserId(IUserDal userDal, Statement statement, String userId);
    User getUserByUserEmail(IUserDal userDal, Statement statement, String userEmail);
    String getUserNameByUserId(IUserDal userDal, Statement statement, String userId);
    String getUserSurnameByUserId(IUserDal userDal, Statement statement, String userId);
    String getUserEmailByUserId(IUserDal userDal, Statement statement, String userId);
    String getUserPasswordByUserId(IUserDal userDal, Statement statement, String userId);
    Long getUserIdByUserEmailAndPassword(IUserDal userDal, Statement statement, String userEmail, String userPassword);
    void updateUserNameByUserId(IUserDal userDal, Statement statement, String userId, String userName);
    void updateUserSurnameByUserId(IUserDal userDal, Statement statement, String userId, String userSurname);
    void updateUserEmailByUserId(IUserDal userDal, Statement statement, String userId, String userEmail);
    void updateUserPasswordByUserId(IUserDal userDal, Statement statement, String userId, String userPassword);
    void deleteUserByUserId(IUserDal userDal, Statement statement, String userId);
    void addUser(IUserDal userDal, Statement statement, Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser);
}
