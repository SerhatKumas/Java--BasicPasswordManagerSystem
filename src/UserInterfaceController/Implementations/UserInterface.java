package UserInterfaceController.Implementations;

import Business.IPasswordManager;
import Model.User;
import UserInterfaceController.IInterfaceController;

import java.sql.Statement;

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
    public void createPortal() {

    }

    @Override
    public void printPortalMethods() {
        String portalMethods = "1)Display My All Passwords\n2)Display My Password By Id\n3)Display My Passwords By Social Media Site Name\n4)Create New Password\n5)Delete My Password By Id\n6)Download All My Passwords To My Computer";
        System.out.println(portalMethods);
    }
}
