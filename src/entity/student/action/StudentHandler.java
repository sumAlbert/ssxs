package entity.student.action;

import entity.Item;
import entity.Major;
import entity.Student;
import entity.User;
import sql.BaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/7.
 */
public class StudentHandler {
    private Connection connection;
    private List<Student> students;
    private List<Major> majors;

    public StudentHandler(){
        super();
        connection=new BaseConnection("ssxs").getConnection();
    }

    public void setStudents(List<Student> students){
        this.students=students;
    }
    public void setMajors(List<Major> majors){
        this.majors=majors;
    }
    public List<Student> getStudents(){
        return students;
    }
    public List<Major> getMajors(){
        return majors;
    }

    public boolean studentsIntoSql(){
        boolean result=true;
        Student student;
        try{
            Statement statement=connection.createStatement();
            String sql="delete from student where itemID= '"+students.get(0).getItemID()+"'";
            statement.execute(sql);
            for(int i=0;i<students.size();i++)
            {
                String keys="(";
                String values="(";
                student=students.get(i);
                Iterator iterator=student.getInitMap().entrySet().iterator();
                Major major=new Major();
                while(iterator.hasNext()){
                    Map.Entry<String,String> entry=(Map.Entry<String,String>)iterator.next();
                    String key=entry.getKey();
                    String value=entry.getValue();
                    switch (key){
                        case "studentID":
                            keys+="studentID,";
                            values+="'"+value+"',";
                            break;
                        case "majorName":
                            major.setMajorName(value);
                            break;
                        case "dataForEnter":
                            keys+="dataForEnter,";
                            values+="'"+value+"',";
                            break;
                        case "birthPlace":
                            keys+="birthPlace,";
                            values+="'"+value+"',";
                            break;
                        case "majorKind":
                            major.setMajorKind(value);
                            break;
                        case "birthday":
                            keys+="birthday,";
                            values+="'"+value+"',";
                            break;
                        case "name":
                            keys+="name,";
                            values+="'"+value+"',";
                            break;
                        case "everName":
                            keys+="everName,";
                            values+="'"+value+"',";
                            break;
                        case "gender":
                            keys+="gender,";
                            if(value.equals("男")){
                                values+="1,";
                            }
                            else{
                                values+="2,";
                            }
                            break;
                        case "IDNumber":
                            keys+="IDNumber,";
                            values+="'"+value+"',";
                            break;
                        case "nation":
                            keys+="nation,";
                            values+="'"+value+"',";
                            break;
                        case "political":
                            keys+="political,";
                            values+="'"+value+"',";
                            break;
                        case "religion":
                            keys+="religion,";
                            values+="'"+value+"',";
                            break;
                        case "scores":
                            keys+="scores,";
                            values+=""+value+",";
                            break;
                        case "bloodType":
                            keys+="bloodType,";
                            values+="'"+value+"',";
                            break;
                        case "height":
                            keys+="height,";
                            values+=""+value+",";
                            break;
                        case "onlyChild":
                            keys+="onlyChild,";
                            if(value.equals("是"))
                                values+="1,";
                            else
                                values+="0,";
                            break;
                        case "disabled":
                            keys+="disabled,";
                            if(value.equals("是"))
                                values+="1,";
                            else
                                values+="0,";
                            break;
                        case "tel":
                            keys+="tel,";
                            values+="'"+value+"',";
                            break;
                        case "email":
                            keys+="email,";
                            values+="'"+value+"',";
                            break;
                        case "batch":
                            keys+="batch,";
                            values+="'"+value+"',";
                            break;
                        case "schoolID":
                            keys+="schoolID,";
                            values+="'"+value+"',";
                            break;
                        case "majorID":
                            keys+="majorID,";
                            values+="'"+value+"',";
                            major.setMajorId(value);
                            break;
                        case "stuID":
                            keys+="stuID,";
                            values+="'"+value+"',";
                            break;
                        case "itemID":
                            keys+="itemID,";
                            values+="'"+value+"',";
                            break;
                        default:
                            System.out.println(key+":"+value);
                            break;
                    }
                }
                keys=keys.substring(0,keys.length()-1);
                values=values.substring(0,values.length()-1);
                keys+=")";
                values+=")";
                sql="insert into student "+keys+" values "+values;
                statement.execute(sql);
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return result;
    }
}
