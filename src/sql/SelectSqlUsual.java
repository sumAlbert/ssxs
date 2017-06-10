package sql;

import entity.Student;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/10.
 */
public class SelectSqlUsual {
    private Connection connection;
    private ArrayList<String> columnName;
    private ArrayList<String> columnType;
    private ArrayList<Student> students;
    private HashMap<String,Integer> dbCountTotalMap=new HashMap<String,Integer>();

    public SelectSqlUsual(){
        connection=(new BaseConnection("ssxs")).getConnection();
    }

    public void getDBTableUsual(String itemID,String tableName,String limit,String page,ArrayList<String> condition_keys,ArrayList<String> condition_values){
        int limitNum=Integer.parseInt(limit);
        int pageNum=Integer.parseInt(page);
        int startNum=(pageNum-1)*limitNum;
        columnName=new ArrayList<String>();
        columnType=new ArrayList<String>();
        students=new ArrayList<Student>();
        String schoolID="";
        String majorID="";
        String condition="";
        for(int i=0;i<condition_keys.size();i++){
            condition+=" and "+condition_keys.get(i)+" = '"+condition_values.get(i)+"'";
        }
        try{
            DatabaseMetaData dmd = connection.getMetaData();
            Statement statement=connection.createStatement();
            String sql="";
            ResultSet rs;
            if(tableName.equals("student"))
            {
                sql="select * from (student natural join school) natural join major where itemID = '"+itemID+"'"+condition+" limit "+startNum+","+limitNum;
                rs= dmd.getColumns( null,"%","student","%");
                while( rs.next())
                {
                    String strFieldName = rs.getString( 4 );
                    String strFieldType = rs.getString( "TYPE_NAME");
                    columnName.add(strFieldName);
                    columnType.add(strFieldType);
                }
                rs= dmd.getColumns( null,"%","major","%");
                while( rs.next())
                {
                    String strFieldName = rs.getString( 4 );
                    String strFieldType = rs.getString( "TYPE_NAME");
                    System.out.println("123");
                    if(!columnName.contains(strFieldName)) {
                        columnName.add(strFieldName);
                        columnType.add(strFieldType);
                    }
                }
                rs= dmd.getColumns( null,"%","school","%");
                while( rs.next())
                {
                    String strFieldName = rs.getString( 4 );
                    String strFieldType = rs.getString( "TYPE_NAME");
                    if(!columnName.contains(strFieldName)) {
                        columnName.add(strFieldName);
                        columnType.add(strFieldType);
                    }
                }
            }
            else
            {
                sql="select * from "+tableName+" where itemID = '"+itemID+"'"+condition+" limit "+startNum+","+limitNum;
                rs = dmd.getColumns( null,"%",tableName,"%");
                while( rs.next())
                {
                    String strFieldName = rs.getString( 4 );
                    String strFieldType = rs.getString( "TYPE_NAME");
                    if(!columnName.contains(strFieldName)) {
                        columnName.add(strFieldName);
                        columnType.add(strFieldType);
                    }
                    System.out.println("123");
                }
            }
            System.out.println(sql);
            rs=statement.executeQuery(sql);
            while(rs.next()){
                Map<String,String> map=new HashMap<String,String>();
                for(int i=0;i<columnName.size();i++){
                    String key=columnName.get(i);
                    String value=rs.getString(columnName.get(i));
                    map.put(key,value);
                }
                Student student=new Student(map);
                student.setDisplayAttrList(columnName);
                students.add(student);
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }

    public void getDBCountTotals(String itemID,String tableName){
        try{
            Statement statement=connection.createStatement();
            String sql="";
            ResultSet resultSet;
            if(tableName.equals("student")){
                sql="select count(*) from (student natural join school) natural join major where itemID = '"+itemID+"'";
                resultSet=statement.executeQuery(sql);
                while(resultSet.next()){
                    dbCountTotalMap.put(tableName,new Integer(resultSet.getString("count(*)")));
                }
            }
            else if(tableName.equals("major")){
                sql="select count(*) from (major natural join school) where itemID = '"+itemID+"'";
                resultSet=statement.executeQuery(sql);
                while(resultSet.next()){
                    dbCountTotalMap.put(tableName,new Integer(resultSet.getString("count(*)")));
                }
            }
        }
        catch(Exception exception){

        }
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
    public HashMap<String,Integer> getDbCountTotalMap(){
        return this.dbCountTotalMap;
    }

    public void setStudents(ArrayList<Student> students){
        this.students=students;
    }
    public void setDbCountTotalMap(HashMap<String,Integer> dbCountTotalMap){
        this.dbCountTotalMap=dbCountTotalMap;
    }
}
