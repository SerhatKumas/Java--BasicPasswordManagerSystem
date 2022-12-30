package Business;

import Dal.IPasswordDal;
import Model.PasswordRecord;

import java.sql.Statement;
import java.util.List;

public interface IPasswordManager {

    List<PasswordRecord> getAllSocialMediaRecords(IPasswordDal passwordDal, Statement statement);
    PasswordRecord getSocialMediaRecordByRecordId(IPasswordDal passwordDal, Statement statement, String recordId);
    List<PasswordRecord> getSocialMediaRecordsByUserId(IPasswordDal passwordDal, Statement statement, String userId) throws Exception;
    List<PasswordRecord> getSocialMediaRecordsBySocialMediaSiteName(IPasswordDal passwordDal, Statement statement, String socialMediaSiteName, String userId) throws Exception;
    String getSocialMediaNameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId);
    String getSocialMediaLinkByRecordId(IPasswordDal passwordDal, Statement statement, String recordId);
    String getSocialMediaUsernameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId);
    String getSocialMediaPasswordContentByRecordId(IPasswordDal passwordDal, Statement statement, String recordId);
    void updateSocialMediaNameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaSiteName);
    void updateSocialMediaLinkByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaSiteLink);
    void updateSocialMediaUsernameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaUsername);
    void updateSocialMediaPasswordContentByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaPasswordContent);
    void deleteSocialMediaRecordByRecordId(IPasswordDal passwordDal, Statement statement, String recordId);
    void addSocialMediaRecordByRecordId(IPasswordDal passwordDal, Statement statement, Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUserName, String socialMediaPassword) throws Exception;
}
