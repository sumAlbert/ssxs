package entity.major.action;

import entity.Major;
import sql.BaseConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

/**
 * Created by dell2 on 2017/6/9.
 */
public class MajorHandler {
    private List<Major> majors;
    private Connection connection;

    public MajorHandler(){
        super();
        connection=new BaseConnection("ssxs").getConnection();
    }

    public void setMajors(List<Major> majors){
        this.majors=majors;
    }
    public List<Major> getMajors(){
        return this.majors;
    }

    public void majorsIntoSql(){
        try{
            Statement statement=connection.createStatement();
            String sql;
            sql="delete from major where schoolID='"+majors.get(0).getSchoolID()+"'";
            statement.execute(sql);
            for(int i=0;i<majors.size();i++)
            {
                Major major=majors.get(i);
                String values="('"+major.getMajorId()+"',";
                if(major.getMajorName()==null){
                    values+="null,";
                }
                else{
                    values+="'"+major.getMajorName()+"',";
                }
                if(major.getMajorKind()==null){
                    values+="null,";
                }
                else{
                    values+="'"+major.getMajorKind()+"',";
                }
                values+="'"+major.getSchoolID()+"')";
                sql="insert into major values "+values;
                statement.execute(sql);
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
