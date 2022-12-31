package UserInterfaceController.Implementations;

import Business.IPasswordManager;
import Business.IUserManager;
import UserInterfaceController.IInterfaceController;

import java.sql.Statement;

public class AdminInterface implements IInterfaceController {
    private Statement statement;
    private IPasswordManager passwordManager;
    private IUserManager userManager;

    public AdminInterface(Statement statement, IPasswordManager passwordManager, IUserManager userManager) {
        this.statement = statement;
        this.passwordManager = passwordManager;
        this.userManager = userManager;
    }

    @Override
    public void createPortal() {

    }

    @Override
    public void printPortalMethods() {
        String portalMethods = "1)Display All Passwords In The System\n2)Display User's All Passwords By User Id\n3)Display User's Password By Password Id\n4)Display All Passwords By Social Media Site Name\n5)Display Specific User's Passwords By User Id and Social Media Site Name\n6)Create New Password\n7)Create New User\n8)Delete Password By Id\n9)Delete User and It's All Passwords";
        System.out.println(portalMethods);
    }
}
