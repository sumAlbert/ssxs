package excelhandler.excelaction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import excelhandler.ExcelHandler;
import net.sf.json.JSONObject;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 * Created by dell2 on 2017/6/6.
 */
public class ExcelReceiveAction extends ActionSupport {
    private File excel_input;
    // 上传文件存储目录
    private String excelName;
    private String result;
    private String workspace2Kind="1";

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        ActionContext ac=ActionContext.getContext();
        Map session=ac.getSession();
        User user=(User)session.get("userInfo");
        excelName="ex"+user.getItems().get(0).getItemID()+".xlsx";
        String uploadPath = getServletContext().getRealPath("/upload");
        if(excel_input!=null){
            File saveFile=new File(uploadPath,excelName);
            if (!saveFile.getParentFile().exists())
                saveFile.getParentFile().mkdirs();
            FileUtils.copyFile(excel_input,saveFile);
        }
        return SUCCESS;
    }

    public void setExcel_input(File excel_input){
        this.excel_input=excel_input;
    }
    public File getExcel_input(){
        return excel_input;
    }
    public void setResult(String result){
        this.result=result;
    }
    public String getResult(){
        return result;
    }
    public void setWorkspace2Kind(String workspace2Kind){
        this.workspace2Kind=workspace2Kind;
    }
    public String getWorkspace2Kind(){
        return workspace2Kind;
    }

    public String enterSql(){
        ActionContext ac=ActionContext.getContext();
        Map session=ac.getSession();
        User user=(User)session.get("userInfo");
        String excelName="ex"+user.getItems().get(0).getItemID()+".xlsx";
        String savePath=getServletContext().getRealPath("/upload");
        try{
            excelName=URLDecoder.decode(excelName,"utf-8");
            ExcelHandler excelHandler=new ExcelHandler(savePath+"/"+excelName);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        Map map=new HashMap();
        map.put("result","enterSqlSuccess");
        JSONObject jsonObject=JSONObject.fromObject(map);
        result=jsonObject.toString();
        return "true";
    }
}