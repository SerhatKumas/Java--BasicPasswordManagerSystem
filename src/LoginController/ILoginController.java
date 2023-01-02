package LoginController;

import UserInterfaceController.IInterfaceController;

import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public interface ILoginController {
    List<String> getCredentials(Scanner scanner);
    void createUserInterface();
    Statement createConnection();
}
