package Business.Implementations;

import Business.IUserManager;
import Dal.IUserDal;
import Model.PasswordRecord;
import Model.User;

import java.sql.Statement;
import java.util.List;

public class UserManager implements IUserManager {

    @Override
    public List<User> getAllUsers(IUserDal userDal, Statement statement) {
        List<User> allUsers = userDal.getAllUsers(statement);
        return allUsers;
    }

    @Override
    public User getUserByUserId(IUserDal userDal, Statement statement, String userId) throws Exception {
        User user = null ;
        if(userId.length() == 11){
            user = userDal.getUserByUserId(statement, userId);
            return user;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public User getUserByUserEmail(IUserDal userDal, Statement statement, String userEmail) {
        User user = userDal.getUserByUserEmail(statement, userEmail);
        return user;
    }

    @Override
    public String getUserNameByUserId(IUserDal userDal, Statement statement, String userId) throws Exception {
        String userName = null ;
        if(userId.length() == 11){
            userName = userDal.getUserNameByUserId(statement, userId);
            return userName;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public String getUserSurnameByUserId(IUserDal userDal, Statement statement, String userId) throws Exception {
        String userSurname = null ;
        if(userId.length() == 11){
            userSurname = userDal.getUserSurnameByUserId(statement, userId);
            return userSurname;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public String getUserEmailByUserId(IUserDal userDal, Statement statement, String userId) throws Exception {
        String userEmail = null ;
        if(userId.length() == 11){
            userEmail = userDal.getUserEmailByUserId(statement, userId);
            return userEmail;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public String getUserPasswordByUserId(IUserDal userDal, Statement statement, String userId) throws Exception {
        String userPassword = null ;
        if(userId.length() == 11){
            userPassword = userDal.getUserPasswordByUserId(statement, userId);
            return userPassword;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public Long getUserIdByUserEmailAndPassword(IUserDal userDal, Statement statement, String userEmail, String userPassword) {
        Long userId = null ;
        userId = userDal.getUserIdByUserEmailAndPassword(statement,userEmail,userPassword);
        return userId;
    }

    @Override
    public void updateUserNameByUserId(IUserDal userDal, Statement statement, String userId, String userName) throws Exception {
        if(userId.length() == 11){
            userDal.updateUserNameByUserId(statement,userId,userName);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public void updateUserSurnameByUserId(IUserDal userDal, Statement statement, String userId, String userSurname) throws Exception {
        if(userId.length() == 11){
            userDal.updateUserSurnameByUserId(statement,userId,userSurname);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public void updateUserEmailByUserId(IUserDal userDal, Statement statement, String userId, String userEmail) throws Exception {
        if(userId.length() == 11){
            userDal.updateUserEmailByUserId(statement,userId,userEmail);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public void updateUserPasswordByUserId(IUserDal userDal, Statement statement, String userId, String userPassword) throws Exception {
        if(userId.length() == 11){
            userDal.updateUserPasswordByUserId(statement,userId,userPassword);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public void deleteUserByUserId(IUserDal userDal, Statement statement, String userId) throws Exception {
        if(userId.length() == 11){
            userDal.deleteUserByUserId(statement,userId);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public void addUser(IUserDal userDal, Statement statement, Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser) throws Exception {
        if(userId.toString().length() == 11){
            userDal.addUser(statement,userId,nameOfUser,lastnameOfUser,emailOfUser,passwordOfUser);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }
}
