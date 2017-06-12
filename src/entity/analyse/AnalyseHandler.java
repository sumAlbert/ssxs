package entity.analyse;

import entity.display.Display;
import sql.BaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/12.
 */
public class AnalyseHandler {
    private Connection connection;
    public AnalyseHandler(){
        connection=new BaseConnection("ssxs").getConnection();
    }

    public Analyse getAnalyse(Display display,String itemID){
        Analyse analyse=new Analyse();
        List<String> counts=new ArrayList<String>();
        List<String> names=new ArrayList<String>();
        List<String> scales=new ArrayList<String>();
        List<String> percents=new ArrayList<String>();
        String displayKindId=display.getDisplayKindId();
        try
        {
            Statement statement=connection.createStatement();
            String sql="select * from displayKind where displayKindId = '"+displayKindId+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            String displayKindInfo="";
            String displayKindView="";
            while(resultSet.next()){
                displayKindInfo=resultSet.getString("displayKindInfo");
                displayKindView=resultSet.getString("displayKindView");
            }
            analyse.setDisplayKindInfo(displayKindInfo);
            if(!displayKindView.equals("")){
                int total=0;
                sql="select * from "+displayKindView+"_view where itemID = '"+itemID+"' order by count desc";
                resultSet=statement.executeQuery(sql);
                while(resultSet.next()){
                    String count=resultSet.getString("count");
                    String name=resultSet.getString("name");
                    total+=Integer.valueOf(count);
                    counts.add(count);
                    names.add(name);
                }
                analyse.setCount_save(counts);
                analyse.setName(names);
                DecimalFormat df1= new DecimalFormat("######0.00");
                for(int i=0;i<counts.size();i++){
                    Double scale=Double.valueOf(counts.get(i))/total;
                    String value=df1.format(scale);
                    scale=scale*100;
                    String value_per=df1.format(scale);
                    percents.add(value_per+"%");
                    scales.add(value);
                }
                analyse.setScale_save(scales);
                analyse.setPercent_save(percents);
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return analyse;
    }
}
