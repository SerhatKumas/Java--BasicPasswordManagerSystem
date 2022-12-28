package Dal.Implementations;

import Dal.IPasswordDal;

import java.sql.Statement;
import java.util.List;

public class PasswordRecord implements IPasswordDal {
    @Override
    public List<Model.PasswordRecord> getAllSocialMediaRecords(Statement statement) {
        return null;
    }

    @Override
    public Model.PasswordRecord getSocialMediaRecordByRecordId(Statement statement, String recordId) {
        return null;
    }

    @Override
    public List<Model.PasswordRecord> getSocialMediaRecordsByUserId(Statement statement, String userId) {
        return null;
    }

    @Override
    public String getSocialMediaNameByRecordId(Statement statement, String recordId) {
        return null;
    }

    @Override
    public String getSocialMediaLinkByRecordId(Statement statement, String recordId) {
        return null;
    }

    @Override
    public String getSocialMediaUsernameByRecordId(Statement statement, String recordId) {
        return null;
    }

    @Override
    public String getSocialMediaPasswordContentByRecordId(Statement statement, String recordId) {
        return null;
    }

    @Override
    public void updateSocialMediaNameByRecordId(Statement statement, String recordId) {

    }

    @Override
    public void updateSocialMediaLinkByRecordId(Statement statement, String recordId) {

    }

    @Override
    public void updateSocialMediaUsernameByRecordId(Statement statement, String recordId) {

    }

    @Override
    public void updateSocialMediaPasswordContentByRecordId(Statement statement, String recordId) {

    }

    @Override
    public void deleteSocialMediaRecordByRecordId(Statement statement, String recordId) {

    }

    @Override
    public void addSocialMediaRecordByRecordId(Statement statement, Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUserName, String socialMediaPassword) {

    }
}
