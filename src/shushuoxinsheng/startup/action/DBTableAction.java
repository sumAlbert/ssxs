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
    private int pageNum;
    private int limitNum;
    private String tableName;

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        HttpServletRequest request = ServletActionContext.getRequest();
        String itemID="iID1234567890";
        pageNum=0;
        limitNum=12;
        tableName="student";
        String page=String.valueOf(pageNum);
        String limit=String.valueOf(limitNum);
        SelectSqlUsual selectSqlUsual=new SelectSqlUsual();
        selectSqlUsual.getDBTableUsual(itemID,tableName,limit,page);
        selectSqlUsual.getDBCountTotals(itemID,"student");
        selectSqlUsual.getDBCountTotals(itemID,"major");
        studentCountTotal=selectSqlUsual.getDbCountTotalMap().get("student").intValue();
        majorCountTotal=selectSqlUsual.getDbCountTotalMap().get("major").intValue();
        students=selectSqlUsual.getStudents();
        request.setAttribute("students",students);
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

    public void setStudents(ArrayList<Student> students){
        this.students=students;
    }
    public void setMajorCountTotal(int majorCountTotal){
        this.majorCountTotal=majorCountTotal;
    }
    public void setStudentCountTotal(int studentCountTotal){
        this.studentCountTotal=studentCountTotal;
    }
}
