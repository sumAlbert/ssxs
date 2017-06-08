package sql;

import java.sql.*;

/**
 * Created by dell2 on 2017/6/1.
 */
public class InsertSqlUsual {
    private Connection connection;
    private ResultSet resultSet;
    public InsertSqlUsual(){
        try{
            connection=new BaseConnection("ssxs").getConnection();
            Statement statement=connection.createStatement();
            String sql="select * from user";
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                String temp=resultSet.getString("name");
                System.out.println(temp);
            }
            System.out.println("123");
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
