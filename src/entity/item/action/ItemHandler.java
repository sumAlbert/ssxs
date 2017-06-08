package entity.item.action;

import entity.Item;
import sql.BaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by dell2 on 2017/6/6.
 */
public class ItemHandler {
    private Connection connection;

    public ItemHandler(){
        super();
        connection=new BaseConnection("ssxs").getConnection();
    }

    public Item getItem(String itemID){
        Item item=new Item();
        try{
            Statement statement=connection.createStatement();
            String sql="select * from item where itemID = '"+itemID+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                item.setItemID(resultSet.getString("itemID"));
                break;
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return item;
    }
}
