package shushuoxinsheng.startup.action;


import entity.Student;
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


    public String execute() throws Exception {
        // TODO Auto-generated method stub
        HttpServletRequest request = ServletActionContext.getRequest();
        String page=request.getParameter("page");
        String limit=request.getParameter("limit");
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
        int limitNum=Integer.parseInt(limit);
        SelectSqlUsual selectSqlUsual=new SelectSqlUsual();
        selectSqlUsual.getDBTableUsual(itemID,tableName,limit,page);
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
