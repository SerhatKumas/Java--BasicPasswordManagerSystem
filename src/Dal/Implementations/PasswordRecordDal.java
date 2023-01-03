package Dal.Implementations;

import Dal.IPasswordDal;
import Model.PasswordRecord;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

//Database, password record objects access layer implementation with jConnector and Mysql
public class PasswordRecordDal implements IPasswordDal {
    @Override
    public List<Model.PasswordRecord> getAllSocialMediaRecords(Statement statement) {
        List<PasswordRecord> passwordRecordList = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM passwordrecordtable");
            passwordRecordList = new LinkedList<PasswordRecord>();
            while (resultSet.next()) {
                passwordRecordList.add(new PasswordRecord(resultSet.getLong(1), resultSet.getLong(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return passwordRecordList;
    }

    @Override
    public Model.PasswordRecord getSocialMediaRecordByRecordId(Statement statement, String recordId) {
        PasswordRecord passwordRecord = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM passwordrecordtable WHERE PasswordRecordId = '" + recordId + "'");
            while (resultSet.next()) {
                passwordRecord = new PasswordRecord(resultSet.getLong(1), resultSet.getLong(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return passwordRecord;
    }

    @Override
    public List<Model.PasswordRecord> getSocialMediaRecordsByUserId(Statement statement, String userId) {
        List<PasswordRecord> passwordRecordList = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM passwordrecordtable WHERE UserId = '" + userId + "'");
            passwordRecordList = new LinkedList<PasswordRecord>();
            while (resultSet.next()) {
                passwordRecordList.add(new PasswordRecord(resultSet.getLong(1), resultSet.getLong(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return passwordRecordList;
    }

    @Override
    public List<PasswordRecord> getSocialMediaRecordsBySocialMediaSiteName(Statement statement, String socialMediaSiteName, String userId) {
        List<PasswordRecord> passwordRecordList = null;
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM passwordrecordtable WHERE SocialMediaSiteName = '" + socialMediaSiteName + "' AND UserId = '" + userId + "'");
            passwordRecordList = new LinkedList<PasswordRecord>();
            while (resultSet.next()) {
                passwordRecordList.add(new PasswordRecord(resultSet.getLong(1), resultSet.getLong(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return passwordRecordList;
    }

    @Override
    public String getSocialMediaNameByRecordId(Statement statement, String recordId) {
        String SocialMediaSiteName = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT SocialMediaSiteName FROM passwordrecordtable WHERE PasswordRecordId = '" + recordId + "'");
            while (resultSet.next()) {
                SocialMediaSiteName = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return SocialMediaSiteName;
    }

    @Override
    public String getSocialMediaLinkByRecordId(Statement statement, String recordId) {
        String SocialMediaSiteLink = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT SocialMediaSiteLink FROM passwordrecordtable WHERE PasswordRecordId = '" + recordId + "'");
            while (resultSet.next()) {
                SocialMediaSiteLink = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return SocialMediaSiteLink;
    }

    @Override
    public String getSocialMediaUsernameByRecordId(Statement statement, String recordId) {
        String SocialMediaUsername = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT SocialMediaUsername FROM passwordrecordtable WHERE PasswordRecordId = '" + recordId + "'");
            while (resultSet.next()) {
                SocialMediaUsername = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return SocialMediaUsername;
    }

    @Override
    public String getSocialMediaPasswordContentByRecordId(Statement statement, String recordId) {
        String SocialMediaPasswordContent = "";
        try {
            ResultSet resultSet = statement.executeQuery("SELECT SocialMediaPasswordContent FROM passwordrecordtable WHERE PasswordRecordId = '" + recordId + "'");
            while (resultSet.next()) {
                SocialMediaPasswordContent = resultSet.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return SocialMediaPasswordContent;
    }

    @Override
    public void updateSocialMediaNameByRecordId(Statement statement, String recordId, String socialMediaSiteName) {
        try {
            statement.executeUpdate("UPDATE passwordrecordtable SET SocialMediaSiteName = '" + socialMediaSiteName + "' WHERE PasswordRecordId ='" + recordId + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateSocialMediaLinkByRecordId(Statement statement, String recordId, String socialMediaSiteLink) {
        try {
            statement.executeUpdate("UPDATE passwordrecordtable SET SocialMediaSiteLink = '" + socialMediaSiteLink + "' WHERE PasswordRecordId ='" + recordId + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateSocialMediaUsernameByRecordId(Statement statement, String recordId, String socialMediaUsername) {
        try {
            statement.executeUpdate("UPDATE passwordrecordtable SET SocialMediaUsername = '" + socialMediaUsername + "' WHERE PasswordRecordId ='" + recordId + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateSocialMediaPasswordContentByRecordId(Statement statement, String recordId, String socialMediaPasswordContent) {
        try {
            statement.executeUpdate("UPDATE passwordrecordtable SET SocialMediaPasswordContent = '" + socialMediaPasswordContent + "' WHERE PasswordRecordId ='" + recordId + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteSocialMediaRecordByRecordId(Statement statement, String recordId) {
        try {
            statement.execute("DELETE FROM passwordrecordtable WHERE PasswordRecordId ='" + recordId + "'");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addSocialMediaRecordByRecordId(Statement statement, Long recordId, Long userId, String socialMediaSiteName, String socialMediaSiteLink, String socialMediaUsername, String socialMediaPassword) {
        try {
            statement.execute("INSERT INTO passwordrecordtable (PasswordRecordId, UserId, SocialMediaSiteName, SocialMediaSiteLink, SocialMediaUsername, SocialMediaPasswordContent) VALUES ('" + recordId + "', '" + userId + "', '" + socialMediaSiteName + "', '" + socialMediaSiteLink + "','" + socialMediaUsername + "','" + socialMediaPassword + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
