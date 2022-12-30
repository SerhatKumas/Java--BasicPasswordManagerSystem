package LoginController;

import java.sql.Statement;

public interface ILoginController {
    void getCredentials();
    void createUserInterface();
    Statement createConnection();
}
