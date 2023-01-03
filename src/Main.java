import LoginController.Implementation.LoginController;
import UserInterfaceController.Implementations.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Program runner
        LoginController loginController = new LoginController();
        loginController.createUserInterface();
    }
}