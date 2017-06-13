package entity.item.action;

import entity.Item;
import hash.HashNum;
import net.sf.json.JSONObject;
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

    public boolean saveItem(String itemID, String displayIDOrder, JSONObject jsonObject){
        boolean result=true;
        try{
            Statement statement=connection.createStatement();
            String sql="";
            if(displayIDOrder.equals("")){
                return result;
            }
            String[] displayIDOrders=displayIDOrder.split(",");
            HashNum hashNum=new HashNum();
            String displayIDOrdersInsert="";
            for(int i=0;i<displayIDOrders.length;i++){
                String displayKindID=displayIDOrders[i];
                String displayID="dpI"+hashNum.getHashNum(10);
                if(i==0){
                    displayIDOrdersInsert+=displayID;
                }
                else{
                    displayIDOrdersInsert+=","+displayID;
                }
                JSONObject tempJDON=jsonObject.getJSONObject(displayKindID);
                String displayTitle=tempJDON.getString("title");
                String displayInfo=tempJDON.getString("info");
                sql="insert into display values ('"+displayID+"','"+displayKindID+"','"+displayTitle+"','"+displayInfo+"')";
                statement.execute(sql);
            }
            sql="update item set displayIDOrder = '"+displayIDOrdersInsert+"' where itemID = '"+itemID+"'";
            statement.execute(sql);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return result;
    }
}
