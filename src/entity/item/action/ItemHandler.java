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

    public boolean saveItem(String itemID,String displayIDOrder){
        boolean result=true;
        try{
            Statement statement=connection.createStatement();
            String sql="select count(*) from item where itemID = '"+itemID+"'";
            String count="0";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                count=resultSet.getString("count(*)");
            }
            if(count.equals("0")){
                sql="insert into item values ('"+itemID+"','"+displayIDOrder+"')";
            }
            else{
                sql="update item set displayIDOrder = '"+displayIDOrder+"' where itemID = '"+itemID+"'";
            }
            statement.execute(sql);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return result;
    }
}
