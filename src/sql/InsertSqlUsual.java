package sql;

import java.sql.*;

/**
 * Created by dell2 on 2017/6/1.
 */
public class InsertSqlUsual {
    private final String USER="root";
    private final String PASS="";
    private final String DB_URL="jdbc:mysql://localhost:3306/teambox1?useUnicode=true&characterEncoding=UTF-8";
    private Connection connection;
    private ResultSet resultSet;
    public InsertSqlUsual(){
        try{
            connection=new BaseConnection("teambox1").getConnection();
            Statement statement=connection.createStatement();
            String sql="select * from users";
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
