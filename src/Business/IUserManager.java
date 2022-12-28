package Business;

import Dal.IUserDal;
import Model.User;

import java.sql.Statement;
import java.util.List;

public interface IUserManager {
    List<User> getAllUsers(IUserDal userDal, Statement statement);
    User getUserByUserId(IUserDal userDal, Statement statement, String userId) throws Exception;
    User getUserByUserEmail(IUserDal userDal, Statement statement, String userEmail);
    String getUserNameByUserId(IUserDal userDal, Statement statement, String userId) throws Exception;
    String getUserSurnameByUserId(IUserDal userDal, Statement statement, String userId) throws Exception;
    String getUserEmailByUserId(IUserDal userDal, Statement statement, String userId) throws Exception;
    String getUserPasswordByUserId(IUserDal userDal, Statement statement, String userId) throws Exception;
    Long getUserIdByUserEmailAndPassword(IUserDal userDal, Statement statement, String userEmail, String userPassword);
    void updateUserNameByUserId(IUserDal userDal, Statement statement, String userId, String userName) throws Exception;
    void updateUserSurnameByUserId(IUserDal userDal, Statement statement, String userId, String userSurname) throws Exception;
    void updateUserEmailByUserId(IUserDal userDal, Statement statement, String userId, String userEmail) throws Exception;
    void updateUserPasswordByUserId(IUserDal userDal, Statement statement, String userId, String userPassword) throws Exception;
    void deleteUserByUserId(IUserDal userDal, Statement statement, String userId) throws Exception;
    void addUser(IUserDal userDal, Statement statement, Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser) throws Exception;
}
