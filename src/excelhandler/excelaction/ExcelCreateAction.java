package excelhandler.excelaction;

import com.opensymphony.xwork2.ActionContext;
import entity.User;
import excelhandler.ExcelCreate;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/4.
 */
public class ExcelCreateAction {
    private String result;
    public String create(){
        String name;
//        ExcelCreate excelCreate=new ExcelCreate();
        ActionContext ac=ActionContext.getContext();
        Map session=ac.getSession();
        User user=(User)session.get("userInfo");
        name=user.getItems().get(0).getItemID().substring(2);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","names");
        JSONObject jsonObject=JSONObject.fromObject(map);
        result=jsonObject.toString();
        return "true";
    }

    public void setResult(String result){
        this.result=result;
    }
    public String getResult(){
        return result;
    }

}
