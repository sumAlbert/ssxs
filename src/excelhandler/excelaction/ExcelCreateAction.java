package excelhandler.excelaction;

import com.opensymphony.xwork2.ActionContext;
import entity.User;
import excelhandler.ExcelCreate;
import excelhandler.excelentity.ExcelColumn;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/4.
 */
public class ExcelCreateAction {
    private String result;
    private ArrayList<ExcelColumn> ALEC=new ArrayList<ExcelColumn>();
    private String[] religion={"无宗教信仰","佛教","喇嘛教","道教","天主教","基督教","东正教","伊斯兰教","其他"};
    private String[] politic={"共青团员","群众","预备党员","党员"};
    private String[] sex={"男","女"};
    private String[] booleans={"是","否"};
    private String[] kind={"艺术类","体育","本科一批","国家专项","本科提前","民族预科","综合录取","南疆计划","本科零批次"};
    private String[] bloodType={"O","A","B","AB"};
    private String[] subject={"文史类","理工类","体育类","艺术类"};
    public String create(){
        ActionContext ac=ActionContext.getContext();
        HttpServletRequest request = ServletActionContext.getRequest();
        String auto=request.getParameter("type");
        Map session=ac.getSession();
        User user=(User)session.get("userInfo");
        String name=user.getItems().get(0).getItemID().substring(2);
        String excelName="ex"+name+".xlsx";
        setALEC();
        ExcelCreate excelCreate=new ExcelCreate(excelName,ALEC);
        excelCreate.create(auto);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name",excelName);
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

    public void setALEC(){
        ExcelColumn excelColumn=new ExcelColumn("学号");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("学校");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("专业");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("入学年份",3);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("籍贯");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("专业类别",1,subject);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("出生日期",3);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("姓名");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("曾用名");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("性别",1,sex);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("身份证号码");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("民族");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("政治面貌",1,politic);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("宗教信仰",1,religion);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("高考分数");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("血型",1,bloodType);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("身高(cm)");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("是否独生子女",1,booleans);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("是否残疾人",1,booleans);
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("联系电话");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("信箱");
        ALEC.add(excelColumn);
        excelColumn=new ExcelColumn("批次",1,kind);
        ALEC.add(excelColumn);
    }
}
