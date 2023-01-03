package Model;

public class User {

    //User properties
    private final Long userId;
    private String nameOfUser;
    private String lastnameOfUser;
    private String emailOfUser;
    private String passwordOfUser;

    //Full-arg constructor
    public User(Long userId, String nameOfUser, String lastnameOfUser, String emailOfUser, String passwordOfUser) {
        this.userId = userId;
        this.nameOfUser = nameOfUser;
        this.lastnameOfUser = lastnameOfUser;
        this.emailOfUser = emailOfUser;
        this.passwordOfUser = passwordOfUser;
    }
}
