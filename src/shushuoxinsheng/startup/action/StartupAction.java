package shushuoxinsheng.startup.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import excelhandler.ExcelCreate;
import excelhandler.ExcelHandler;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell2 on 2017/5/9.
 */
public class StartupAction extends ActionSupport{

    private String name;
    public String execute() throws Exception {
        // TODO Auto-generated method stub
//        ExcelHandler eh=new ExcelHandler();
//        ExcelCreate.create();
        name="lalaaa.xlsx";
        return SUCCESS;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
