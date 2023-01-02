package UserInterfaceController.Implementations;

import Business.IPasswordManager;
import Dal.Implementations.PasswordRecordDal;
import Model.PasswordRecord;
import UserInterfaceController.IInterfaceController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class UserInterface implements IInterfaceController {

    private String userId;
    private Statement statement;
    private IPasswordManager passwordManager;

    public UserInterface(String userId, Statement statement, IPasswordManager passwordManager) {
        this.userId = userId;
        this.statement = statement;
        this.passwordManager = passwordManager;
    }

    @Override
    public void createPortal(Scanner scanner) {
        List<PasswordRecord> passwordRecordList = null;
        while(true){
            printPortalMethods();
            int menuChoice = scanner.nextInt();
            switch (menuChoice){
                case 1:
                    passwordRecordList = null;
                    try {
                        passwordRecordList = passwordManager.getSocialMediaRecordsByUserId(new PasswordRecordDal(),statement,userId);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(passwordRecordList.toString());
                    break;
                case 2:
                    System.out.println("Enter record id : ");
                    String recordId = scanner.next();
                    PasswordRecord passwordRecord = passwordManager.getSocialMediaRecordByRecordId(new PasswordRecordDal(), statement, recordId);
                    System.out.println(passwordRecord.toString());
                    break;
                case 3:
                    passwordRecordList = null;
                    try {
                        System.out.println("Enter social media name : ");
                        String socialMediaNameSearch = scanner.next();
                        passwordRecordList = passwordManager.getSocialMediaRecordsBySocialMediaSiteName(new PasswordRecordDal(),statement,socialMediaNameSearch,userId);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(passwordRecordList.toString());
                    break;
                case 4:
                    System.out.println("Enter social media name : ");
                    String socialMediaName = scanner.next();
                    System.out.println("Enter social media link : ");
                    String socialMediaLink = scanner.next();
                    System.out.println("Enter social media username : ");
                    String socialMediaUsername = scanner.next();
                    System.out.println("Enter social media password : ");
                    String socialMediaPassword = scanner.next();
                    try {
                        passwordManager.addSocialMediaRecordByRecordId(new PasswordRecordDal(), statement, (long) getRecordId(), Long.valueOf(userId),socialMediaName,socialMediaLink,socialMediaUsername,socialMediaPassword);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    System.out.println("Enter record id : ");
                    String recordIdDeleted = scanner.next();
                    passwordManager.deleteSocialMediaRecordByRecordId(new PasswordRecordDal(), statement, recordIdDeleted);
                    break;
                case 6:
                    System.out.println("System is closing....");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Enter valid menu option");
                    break;
            }
        }
    }

    @Override
    public void printPortalMethods() {
        String portalMethods = "1)Display My All Passwords\n2)Display My Password By Id\n3)Display My Passwords By Social Media Site Name\n4)Create New Password\n5)Delete My Password By Id\n6)Close the System";
        System.out.println(portalMethods);
    }
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
        return recordId+1;
    }
}
