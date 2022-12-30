package Business.Implementations;

import Business.IPasswordManager;
import Dal.IPasswordDal;
import Model.PasswordRecord;

import java.sql.Statement;
import java.util.List;

public class PasswordManager implements IPasswordManager {
    @Override
    public List<PasswordRecord> getAllSocialMediaRecords(IPasswordDal passwordDal, Statement statement) {
        List<PasswordRecord> allSocialMediaRecords = passwordDal.getAllSocialMediaRecords(statement);
        return allSocialMediaRecords;
    }

    @Override
    public PasswordRecord getSocialMediaRecordByRecordId(IPasswordDal passwordDal, Statement statement, String recordId) {
        PasswordRecord passwordRecord = passwordDal.getSocialMediaRecordByRecordId(statement, recordId);
        return passwordRecord;
    }

    @Override
    public List<PasswordRecord> getSocialMediaRecordsByUserId(IPasswordDal passwordDal, Statement statement, String userId) throws Exception {
        List<PasswordRecord> allSocialMediaRecords = null ;
        if(userId.length() == 11){
            allSocialMediaRecords = passwordDal.getSocialMediaRecordsByUserId(statement, userId);
            return allSocialMediaRecords;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public List<PasswordRecord> getSocialMediaRecordsBySocialMediaSiteName(IPasswordDal passwordDal, Statement statement, String socialMediaSiteName, String userId) throws Exception {
        List<PasswordRecord> allSocialMediaRecords = null ;
        if(userId.length() == 11){
            allSocialMediaRecords = passwordDal.getSocialMediaRecordsBySocialMediaSiteName(statement,socialMediaSiteName, userId);
            return allSocialMediaRecords;
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }

    @Override
    public String getSocialMediaNameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId) {
        String socialMediaSiteName = passwordDal.getSocialMediaNameByRecordId(statement, recordId);
        return socialMediaSiteName;
    }

    @Override
    public String getSocialMediaLinkByRecordId(IPasswordDal passwordDal, Statement statement, String recordId) {
        String socialMediaSiteLink = passwordDal.getSocialMediaLinkByRecordId(statement, recordId);
        return socialMediaSiteLink;
    }

    @Override
    public String getSocialMediaUsernameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId) {
        String socialMediaUsername = passwordDal.getSocialMediaUsernameByRecordId(statement, recordId);
        return socialMediaUsername;
    }

    @Override
    public String getSocialMediaPasswordContentByRecordId(IPasswordDal passwordDal, Statement statement, String recordId) {
        String socialMediaPasswordContent = passwordDal.getSocialMediaPasswordContentByRecordId(statement, recordId);
        return socialMediaPasswordContent;
    }

    @Override
    public void updateSocialMediaNameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaSiteName) {
        passwordDal.updateSocialMediaNameByRecordId(statement, recordId, socialMediaSiteName);
    }

    @Override
    public void updateSocialMediaLinkByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaSiteLink) {
        passwordDal.updateSocialMediaLinkByRecordId(statement, recordId, socialMediaSiteLink);
    }

    @Override
    public void updateSocialMediaUsernameByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaUsername) {
        passwordDal.updateSocialMediaUsernameByRecordId(statement, recordId, socialMediaUsername);
    }

    @Override
    public void updateSocialMediaPasswordContentByRecordId(IPasswordDal passwordDal, Statement statement, String recordId, String socialMediaPasswordContent) {
        passwordDal.updateSocialMediaPasswordContentByRecordId(statement, recordId, socialMediaPasswordContent);
    }

    @Override
    public void deleteSocialMediaRecordByRecordId(IPasswordDal passwordDal, Statement statement, String recordId) {
        passwordDal.deleteSocialMediaRecordByRecordId(statement, recordId);
    }

    @Override
    public void addSocialMediaRecordByRecordId(IPasswordDal passwordDal, Statement statement, Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUserName, String socialMediaPassword) throws Exception {
        if (userId.toString().length() == 11){
            passwordDal.addSocialMediaRecordByRecordId(statement, recordId, userId, socialMediaSiteName, socialMediaSiteLink, socialMediaUserName, socialMediaPassword);
        }
        else {
            throw new Exception("User Id has to 11 character");
        }
    }
}
