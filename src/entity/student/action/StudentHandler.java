package entity.student.action;

import entity.Item;
import entity.User;
import sql.BaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by dell2 on 2017/6/7.
 */
public class StudentHandler {
    private Connection connection;

    public StudentHandler(){
        super();
        connection=new BaseConnection("ssxs").getConnection();
    }

    public boolean studentsIntoSql(User user, Item item){
        boolean result=true;
        String tableName="stu"+item.getItemID().substring(3);
        try{
            Statement statement=connection.createStatement();
            String sql="";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return result;
    }
}
