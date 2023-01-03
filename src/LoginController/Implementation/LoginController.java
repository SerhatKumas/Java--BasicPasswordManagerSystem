package LoginController.Implementation;

import Business.Implementations.PasswordManager;
import LoginController.ILoginController;
import UserInterfaceController.Implementations.UserInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginController implements ILoginController {

    //Method that gets user information from console
    @Override
    public List<String> getCredentials(Scanner scanner) {
        List<String> credentials = new ArrayList<>();
        System.out.println("Enter User Id : ");
        String id = scanner.next();
        credentials.add(id.trim());
        System.out.println("Enter User Password : ");
        String password = scanner.next();
        credentials.add(password.trim());
        return credentials;
    }

    //Method that creates user interface according to user information
    @Override
    public void createUserInterface() {
        List<String> credentials = getCredentials(new Scanner(System.in));
        Statement statement = createConnection();
        try {
            ResultSet rs = statement.executeQuery("select count(*) from usertable where UserId = '" + credentials.get(0) + "' AND UserPassword = '" + credentials.get(1) + "'");
            if (rs.next()) {
                UserInterface userInterface = new UserInterface(credentials.get(0), statement, new PasswordManager());
                userInterface.createPortal(new Scanner(System.in));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Method that creates statement objects to use in transactions
    @Override
    public Statement createConnection() {
        String url = "jdbc:mysql://localhost:8111/passwordmanagersystem";
        String username = "root";
        String password = "";
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return statement;
    }
}
