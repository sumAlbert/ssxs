package entity.user.action;

import entity.Item;
import entity.User;
import entity.item.action.ItemHandler;
import sql.BaseConnection;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by dell2 on 2017/6/6.
 */
public class UserHandler {
    private Connection connection;

    public UserHandler(){
        super();
        connection=new BaseConnection("ssxs").getConnection();
    }

    public User login(String email, String pw){
        User user=new User();
        try{
            Statement statement=connection.createStatement();
            String sql="select * from user where email = '"+email+"' and pw = '"+pw+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                user.setEmail(resultSet.getString("email"));
                user.setPw(resultSet.getString("pw"));
                user.setUserID(resultSet.getString("userID"));
                user.setItems(getUserItems(resultSet.getString("userID")));
                sql="update user set loginState=1";
                statement.execute(sql);
                break;
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return user;
    }

    public ArrayList<Item> getUserItems(String userID){
        ArrayList<Item> items=new ArrayList<Item>();
        try{
            Statement statement=connection.createStatement();
            String sql="select * from has_item where userID = '"+userID+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                String itemID=resultSet.getString("itemID");
                Item item=(new ItemHandler()).getItem(itemID);
                items.add(item);
                break;
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return items;
    }

}
