package Dal.Implementations;

import Dal.IUserDal;
import Model.User;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class UserDal implements IUserDal {
    @Override
    public List<User> getAllUsers(Statement statement) {
        List<User> userList = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usertable");
            userList = new LinkedList<User>();
            while (resultSet.next()) {
                userList.add(new User(resultSet.getLong(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return userList;
    }

    @Override
    public User getUserByUserId(Statement statement, String userId) {
        User user = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usertable WHERE UserId = '"+userId+"'");
            while (resultSet.next()) {
                user = new User(resultSet.getLong(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    @Override
    public User getUserByUserEmail(Statement statement, String userEmail) {
        User user = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usertable WHERE UserEmail = '"+userEmail+"'");
            while (resultSet.next()) {
                user = new User(resultSet.getLong(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    @Override
    public String getUserNameByUserId(Statement statement, String userId) {
        String userName = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT UserName FROM usertable WHERE UserId = '"+userId+"'");
            while (resultSet.next()) {
                userName = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return userName;
    }

    @Override
    public String getUserSurnameByUserId(Statement statement, String userId) {
        String userSurname = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT UserSurname FROM usertable WHERE UserId = '"+userId+"'");
            while (resultSet.next()) {
                userSurname = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return userSurname;
    }

    @Override
    public String getUserEmailByUserId(Statement statement, String userId) {
        String userEmail = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT UserEmail FROM usertable WHERE UserId = '"+userId+"'");
            while (resultSet.next()) {
                userEmail = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return userEmail;
    }

    @Override
    public String getUserPasswordByUserId(Statement statement, String userId) {
        String userPassword = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT UserPassword FROM usertable WHERE UserId = '"+userId+"'");
            while (resultSet.next()) {
                userPassword = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return userPassword;
    }

    @Override
    public Long getUserIdByUserEmailAndPassword(Statement statement, String userEmail, String userPassword) {
        Long userId = 0L;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT UserId FROM usertable WHERE UserEmail = '"+userEmail+"' AND UserPassword ='"+userPassword+"'");
            while (resultSet.next()) {
                userId = resultSet.getLong(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return userId;
    }

    @Override
    public void updateUserNameByUserId(Statement statement, String userId, String userName) {
        try {
            statement.executeUpdate("UPDATE usertable SET UserName = '"+userName+"' WHERE userId ='"+userId+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateUserSurnameByUserId(Statement statement, String userId, String userSurname) {
        try {
            statement.executeUpdate("UPDATE usertable SET UserSurname = '"+userSurname+"' WHERE userId ='"+userId+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateUserEmailByUserId(Statement statement, String userId, String userEmail) {
        try {
            statement.executeUpdate("UPDATE usertable SET UserEmail = '"+userEmail+"' WHERE userId ='"+userId+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateUserPasswordByUserId(Statement statement, String userId, String userPassword) {
        try {
            statement.executeUpdate("UPDATE usertable SET UserPassword = '"+userPassword+"' WHERE userId ='"+userId+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteUserByUserId(Statement statement, String userId) {
        try {
            statement.execute("DELETE FROM usertable WHERE userId ='"+userId+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addUser(Statement statement, Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser) {
        try {
            statement.execute("INSERT INTO usertable (UserId, UserName, UserSurname, UserEmail, UserPassword) VALUES ('"+userId+"', '"+nameOfUser+"', '"+lastnameOfUser+"', '"+emailOfUser+"','"+passwordOfUser+"')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
