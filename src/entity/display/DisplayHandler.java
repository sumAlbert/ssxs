package entity.display;

import sql.BaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by dell2 on 2017/6/11.
 */
public class DisplayHandler {
    private Connection connection;
    public DisplayHandler(){
        connection=new BaseConnection("ssxs").getConnection();
    }

    public Display getDisplay(String displayID){
        Display display=new Display();
        try
        {
            Statement statement=connection.createStatement();
            String sql="select * from display where displayID = '"+displayID+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                String displayKindID=resultSet.getString("displayKindID");
                String displayTitle=resultSet.getString("displayTitle");
                String displayInfo=resultSet.getString("displayInfo");
                display.setDisplayID(displayID);
                display.setDisplayInfo(displayInfo);
                display.setDisplayKindId(displayKindID);
                display.setDisplayTitle(displayTitle);
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return display;
    }
}
