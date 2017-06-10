package shushuoxinsheng.startup.action;


import entity.Student;
import excelhandler.excelentity.ExcelColumnNameArr;
import org.apache.struts2.ServletActionContext;
import sql.SelectSqlUsual;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by dell2 on 2017/6/10.
 */
public class DBTableAction {
    private ArrayList<Student> students;
    private int studentCountTotal;
    private int majorCountTotal;
    private String page;
    private String limit;
    private String tableName;
    private int pageUpper;
    private String pageNum;
    private String limitNumShow;
    private ArrayList<String> condition_keys;
    private ArrayList<String> condition_values;


    public String execute() throws Exception {
        // TODO Auto-generated method stub
        HttpServletRequest request = ServletActionContext.getRequest();
        ExcelColumnNameArr excelColumnNameArr=new ExcelColumnNameArr();
        condition_keys=new ArrayList<String>();
        condition_values=new ArrayList<String>();
        String page=request.getParameter("page");
        String limit=request.getParameter("limit");
        String request_key=request.getParameter("request_key");
        String request_value=request.getParameter("request_value");
        tableName=request.getParameter("tableName");
        String itemID="iID1234567890";
        if(page==null){
            page="1";
        }
        if(limit==null){
            limit="12";
        }
        if(tableName==null){
            tableName="student";
        }
        if(request_key==null||request_value==null){
            request_key="";
            request_value="";
        }
        else
        {
            String[] request_keys=request_key.split(",");
            String[] request_values=request_value.split(",");
            for(int i=0;i<request_keys.length;i++){
                String request_keys_e=excelColumnNameArr.getC2E().get(request_keys[i]);
                String request_values_e=request_values[i];
                if(request_keys_e!=null&&!request_keys_e.equals("")&&request_keys_e!=null&&!request_values_e.equals("")){
                    condition_keys.add(request_keys_e);
                    condition_values.add(request_values_e);
                }
            }
        }
        int limitNum=Integer.parseInt(limit);
        SelectSqlUsual selectSqlUsual=new SelectSqlUsual();
        selectSqlUsual.getDBTableUsual(itemID,tableName,limit,page,condition_keys,condition_values);
        selectSqlUsual.getDBCountTotals(itemID,"student");
        selectSqlUsual.getDBCountTotals(itemID,"major");
        studentCountTotal=selectSqlUsual.getDbCountTotalMap().get("student").intValue();
        majorCountTotal=selectSqlUsual.getDbCountTotalMap().get("major").intValue();
        students=selectSqlUsual.getStudents();
        request.setAttribute("students",students);
        switch (tableName){
            case "major":
                pageUpper=majorCountTotal/limitNum+1;
                break;
            case "student":
                pageUpper=studentCountTotal/limitNum+1;
                break;
            default:
                pageUpper=studentCountTotal/limitNum+1;
                break;
        }
        pageNum=page;
        limitNumShow=limit;
        return SUCCESS;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public int getMajorCountTotal(){
        return this.majorCountTotal;
    }
    public int getStudentCountTotal(){
        return this.studentCountTotal;
    }
    public String getPage(){
        return this.page;
    }
    public String getLimit(){
        return this.limit;
    }
    public String getTableName(){
        return this.tableName;
    }
    public int getPageUpper(){
        return this.pageUpper;
    }
    public String getPageNum(){
        return this.pageNum;
    }
    public String getLimitNumShow(){
        return this.limitNumShow;
    }

    public void setPageNum(String pageNum){
        this.pageNum=pageNum;
    }
    public void setStudents(ArrayList<Student> students){
        this.students=students;
    }
    public void setMajorCountTotal(int majorCountTotal){
        this.majorCountTotal=majorCountTotal;
    }
    public void setStudentCountTotal(int studentCountTotal){
        this.studentCountTotal=studentCountTotal;
    }
    public void setPage(String page){
        this.page=page;
    }
    public void setTableName(String tableName){
        this.tableName=tableName;
    }
    public void setPageUpper(int pageUpper){
        this.pageUpper=pageUpper;
    }
    public void setLimit(String limit){
        this.limit=limit;
    }
    public void setLimitNumShow(String limitNumShow){
        this.limitNumShow=limitNumShow;
    }
}
