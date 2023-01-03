package Model;

public class PasswordRecord {

    //Password Record Properties
    private final Long recordId;
    private final Long userId;
    private String socialMediaSiteName;
    private String socialMediaSiteLink;
    private String socialMediaUsername;
    private String socialMediaPassword;

    //Full-arg constructor
    public PasswordRecord(Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUsername, String socialMediaPassword) {
        this.recordId = recordId;
        this.userId = userId;
        this.socialMediaSiteName = socialMediaSiteName;
        this.socialMediaSiteLink = socialMediaSiteLink;
        this.socialMediaUsername = socialMediaUsername;
        this.socialMediaPassword = socialMediaPassword;
    }
}
