package UserInterfaceController;

import java.util.Scanner;

public interface IInterfaceController {
    //Method that creates user portal
    void createPortal(Scanner scanner);
    //Method that prints all portal methods in String format
    void printPortalMethods();
    //Methods that gets count(*) from
    int getRecordId();
}
