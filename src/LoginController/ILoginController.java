package LoginController;

import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

//User entrance and creation of user interface controller interface
public interface ILoginController {

    //Method that gets user information from console
    List<String> getCredentials(Scanner scanner);

    //Method that creates user interface according to user information
    void createUserInterface();

    //Method that creates statement objects to use in transactions
    Statement createConnection();
}
