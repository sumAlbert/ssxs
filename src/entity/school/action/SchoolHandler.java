package entity.school.action;

import entity.School;
import sql.BaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by dell2 on 2017/6/9.
 */
public class SchoolHandler {
    private String schoolName;
    private String schoolKind;
    private String schoolProvince;
    private String schoolID;
    private String itemID;
    private Connection connection;
    private School school;

    public SchoolHandler(){
        super();
        connection=new BaseConnection("ssxs").getConnection();
    }


    public void setItemID(String itemID){
        this.itemID=itemID;
    }
    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }
    public void setSchoolKind(String schoolKind){
        this.schoolKind=schoolKind;
    }
    public void setSchoolProvince(String schoolProvince){
        this.schoolProvince=schoolProvince;
    }
    public void setSchoolID(String schoolID){
        this.schoolID=schoolID;
    }
    public void setSchool(School school){
        this.school=school;
    }

    public String getSchoolName(){
        return this.schoolName;
    }
    public String getSchoolKind(){
        return this.schoolKind;
    }
    public String getSchoolProvince(){
        return this.schoolProvince;
    }
    public String getSchoolID(){
        return this.schoolID;
    }
    public String getItemID(){
        return this.itemID;
    }
    public School getSchool(){
        return this.school;
    }

    public void insert(){
        try{
            Statement statement=connection.createStatement();
            String sql="update school set schoolName = '"+schoolName+"', schoolLocation= '"+schoolProvince+"',schoolKind = '"+schoolKind+"' where schoolID = '"+schoolID+"'";
            System.out.println(sql);
            statement.execute(sql);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
