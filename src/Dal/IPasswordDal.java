package Dal;

import Model.PasswordRecord;

import java.sql.Statement;
import java.util.List;


//Password record repository methods interface
public interface IPasswordDal {
    List<PasswordRecord> getAllSocialMediaRecords(Statement statement);

    PasswordRecord getSocialMediaRecordByRecordId(Statement statement, String recordId);

    List<PasswordRecord> getSocialMediaRecordsByUserId(Statement statement, String userId);

    List<PasswordRecord> getSocialMediaRecordsBySocialMediaSiteName(Statement statement, String socialMediaSiteName, String userId);

    String getSocialMediaNameByRecordId(Statement statement, String recordId);

    String getSocialMediaLinkByRecordId(Statement statement, String recordId);

    String getSocialMediaUsernameByRecordId(Statement statement, String recordId);

    String getSocialMediaPasswordContentByRecordId(Statement statement, String recordId);

    void updateSocialMediaNameByRecordId(Statement statement, String recordId, String SocialMediaSiteName);

    void updateSocialMediaLinkByRecordId(Statement statement, String recordId, String SocialMediaSiteLink);

    void updateSocialMediaUsernameByRecordId(Statement statement, String recordId, String SocialMediaUsername);

    void updateSocialMediaPasswordContentByRecordId(Statement statement, String recordId, String SocialMediaPasswordContent);

    void deleteSocialMediaRecordByRecordId(Statement statement, String recordId);

    void addSocialMediaRecordByRecordId(Statement statement, Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUserName, String socialMediaPassword);
}
