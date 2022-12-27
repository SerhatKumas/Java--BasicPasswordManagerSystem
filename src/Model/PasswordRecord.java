package Model;

public class PasswordRecord {

    private final Long recordId;
    private final Long userId;
    private String socialMediaSiteName;
    private String socialMediaSiteLink;
    private String socialMediaUserName;
    private String socialMediaPassword;

    public PasswordRecord(Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUserName, String socialMediaPassword) {
        this.recordId = recordId;
        this.userId = userId;
        this.socialMediaSiteName = socialMediaSiteName;
        this.socialMediaSiteLink = socialMediaSiteLink;
        this.socialMediaUserName = socialMediaUserName;
        this.socialMediaPassword = socialMediaPassword;
    }
}
