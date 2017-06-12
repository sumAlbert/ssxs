package sql;

import com.opensymphony.xwork2.ActionContext;
import entity.Item;
import entity.Student;
import entity.item.action.ItemHandler;
import entity.student.action.StudentHandler;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/10.
 */
public class WebSqlChange {
    private String result;
    private ArrayList<Student> students;
    private Connection connection;

    public WebSqlChange(){
        connection=new BaseConnection("ssxs").getConnection();
    }

    public String dbDeleteSql(){
        HttpServletRequest request =  ServletActionContext.getRequest();
        String node=request.getParameter("node");
        JSONObject jsonObject=JSONObject.fromObject(node);
        JSONArray jsonArray=JSONArray.fromObject(jsonObject.get("student"));
        students=new ArrayList<Student>();
        for(int i=0;i<jsonArray.size();i++){
            Map<String,String> initMap=new HashMap<String,String>();
            JSONObject jsonObjectTemp=jsonArray.getJSONObject(i);
            Iterator<String> keys=jsonObjectTemp.keys();
            while(keys.hasNext()){
                String key=keys.next();
                String value=jsonObjectTemp.getString(key);
                initMap.put(key,value);
            }
            Student student=new Student(initMap);
            students.add(student);
        }
        StudentHandler studentHandler=new StudentHandler();
        studentHandler.deleteStudents(students);
        Map map= new HashMap();
        map.put("result","success");
        jsonObject=JSONObject.fromObject(map);
        result=jsonObject.toString();
        return "true";
    }
    public String dbChangeSql(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String node=request.getParameter("node");
        JSONObject jsonObject=JSONObject.fromObject(node);
        JSONArray jsonArray=JSONArray.fromObject(jsonObject.get("student"));
        students=new ArrayList<Student>();
        for(int i=0;i<jsonArray.size();i++){
            Map<String,String> initMap=new HashMap<String,String>();
            JSONObject jsonObjectTemp=jsonArray.getJSONObject(i);
            Iterator<String> keys=jsonObjectTemp.keys();
            System.out.println("123");
            while(keys.hasNext()){
                String key=keys.next();
                String value=jsonObjectTemp.getString(key);
                initMap.put(key,value);
            }
            Student student=new Student(initMap);
            students.add(student);
        }
        StudentHandler studentHandler=new StudentHandler();
        studentHandler.changeStudents(students);
        Map map= new HashMap();
        map.put("result","success");
        jsonObject=JSONObject.fromObject(map);
        result=jsonObject.toString();
        return "true";
    }
    public String dbDisplaySave(){
        HttpServletRequest request = ServletActionContext.getRequest();
        ActionContext ac=ActionContext.getContext();
        Map session=ac.getSession();
        Item item=(Item)session.get("itemInfo");
        String itemID=item.getItemID();
        String order=request.getParameter("displayIDOrder");
        ItemHandler itemHandler=new ItemHandler();
        itemHandler.saveItem(itemID,order);
        Map map= new HashMap();
        map.put("result","success");
        JSONObject jsonObject=JSONObject.fromObject(map);
        result=jsonObject.toString();
        return "true";
    }

    public void setResult(String result){
        this.result=result;
    }
    public void setStudents(ArrayList<Student> students){
        this.students=students;
    }

    public String getResult(){
        return this.result;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
}
