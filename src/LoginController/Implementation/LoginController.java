package LoginController.Implementation;

import LoginController.ILoginController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginController implements ILoginController {

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

    @Override
    public void createUserInterface() {
        
    }

    @Override
    public Statement createConnection() {
        String url = "jdbc:mysql://localhost:8111/passwordmanagement";
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
