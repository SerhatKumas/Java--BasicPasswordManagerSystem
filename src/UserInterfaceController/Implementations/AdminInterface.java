package UserInterfaceController.Implementations;

import Business.*;
import Dal.Implementations.*;
import Model.*;
import UserInterfaceController.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class AdminInterface implements IInterfaceController {
    private Statement statement;
    private IPasswordManager passwordManager;
    private IUserManager userManager;

    //Full-arg Constructor
    public AdminInterface(Statement statement, IPasswordManager passwordManager, IUserManager userManager) {
        this.statement = statement;
        this.passwordManager = passwordManager;
        this.userManager = userManager;
    }

    //Portal runner method
    @Override
    public void createPortal(Scanner scanner) {
        List<PasswordRecord> passwordRecordList = null;
        List<User> userList = null;
        String userId = "";
        String recordId = "";
        User user = null;
        while (true) {
            printPortalMethods();
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
                //Display All Passwords In The System
                case 1:
                    passwordRecordList = passwordManager.getAllSocialMediaRecords(new PasswordRecordDal(), statement);
                    System.out.println(passwordRecordList.toString());
                    break;
                //Display User's All Passwords By User Id
                case 2:
                    System.out.println("Enter user id : ");
                    userId = scanner.next();
                    try {
                        passwordRecordList = passwordManager.getSocialMediaRecordsByUserId(new PasswordRecordDal(), statement, userId);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(passwordRecordList.toString());
                    break;
                //Display User's Password By Password Id
                case 3:
                    System.out.println("Enter record id : ");
                    recordId = scanner.next();
                    PasswordRecord passwordRecord = passwordManager.getSocialMediaRecordByRecordId(new PasswordRecordDal(), statement, recordId);
                    System.out.println(passwordRecord.toString());
                    break;
                //Display Specific User's Passwords By User Id and Social Media Site Name
                case 4:
                    try {
                        System.out.println("Enter social media name : ");
                        String socialMediaNameSearch = scanner.next();
                        System.out.println("Enter social media name : ");
                        String socialMediaName = scanner.next();
                        passwordRecordList = passwordManager.getSocialMediaRecordsBySocialMediaSiteName(new PasswordRecordDal(), statement, socialMediaNameSearch, socialMediaName);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(passwordRecordList.toString());
                    break;
                //Create New Password
                case 5:
                    System.out.println("Enter user id : ");
                    userId = scanner.next();
                    System.out.println("Enter social media name : ");
                    String socialMediaName = scanner.next();
                    System.out.println("Enter social media link : ");
                    String socialMediaLink = scanner.next();
                    System.out.println("Enter social media username : ");
                    String socialMediaUsername = scanner.next();
                    System.out.println("Enter social media password : ");
                    String socialMediaPassword = scanner.next();
                    try {
                        passwordManager.addSocialMediaRecordByRecordId(new PasswordRecordDal(), statement, (long) getRecordId(), Long.valueOf(userId), socialMediaName, socialMediaLink, socialMediaUsername, socialMediaPassword);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                //Delete Password By Id
                case 6:
                    System.out.println("Enter record id : ");
                    recordId = scanner.next();
                    passwordManager.deleteSocialMediaRecordByRecordId(new PasswordRecordDal(), statement, recordId);
                    break;
                //Display All User In The System
                case 7:
                    userList = userManager.getAllUsers(new UserDal(), statement);
                    System.out.println(userList.toString());
                    break;
                //Display User By Id
                case 8:
                    System.out.println("Enter user id : ");
                    userId = scanner.next();
                    try {
                        user = userManager.getUserByUserId(new UserDal(), statement, userId);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(user.toString());
                    break;
                //Create New User
                case 9:
                    System.out.println("Enter user name : ");
                    String userName = scanner.next();
                    System.out.println("Enter user surname : ");
                    String userSurname = scanner.next();
                    System.out.println("Enter user email : ");
                    String userEmail = scanner.next();
                    System.out.println("Enter user password : ");
                    String userPassword = scanner.next();
                    try {
                        userManager.addUser(new UserDal(), statement, (long) getUserId(), userName, userSurname, userEmail, userPassword);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                //Delete User By Id
                case 10:
                    System.out.println("Enter user id : ");
                    userId = scanner.next();
                    try {
                        userManager.deleteUserByUserId(new UserDal(), statement, userId);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                //Exit the System
                case 11:
                    System.out.println("System is closing...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Enter valid menu option");
                    break;
            }
        }
    }

    //Method that prints all portal methods in String format
    @Override
    public void printPortalMethods() {
        String portalMethods = """
                1)Display All Passwords In The System
                2)Display User's All Passwords By User Id
                3)Display User's Password By Password Id
                4)Display Specific User's Passwords By User Id and Social Media Site Name
                5)Create New Password
                6)Delete Password By Id
                7)Display All User In The System
                8)Display User By Id
                9)Create New User
                10)Delete User By Id
                11)Exit the System""";
        System.out.println(portalMethods);
    }

    //Methods that gets number of record from database
    @Override
    public int getRecordId() {
        ResultSet rs;
        int recordId;
        try {
            rs = statement.executeQuery("select count(*) from passwordrecordtable");
            rs.next();
            recordId = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return recordId + 1;
    }

    //Methods that gets number of record from database
    private int getUserId() {
        ResultSet rs;
        int recordId;
        try {
            rs = statement.executeQuery("select count(*) from usertable");
            rs.next();
            recordId = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return recordId + 1;
    }

}
