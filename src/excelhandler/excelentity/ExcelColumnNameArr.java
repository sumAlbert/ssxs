package excelhandler.excelentity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/6.
 */
public class ExcelColumnNameArr {
    private Map<String,String> E2C;
    private Map<String,String> C2E;
    public ExcelColumnNameArr(){
        E2C=new HashMap<String,String>();
        C2E=new HashMap<String,String>();
        initE2C();
        initC2E();
    }
    private void initE2C(){
        E2C.put("studentID","学号");
        E2C.put("schoolName","学校");
        E2C.put("majorName","专业");
        E2C.put("dataForEnter","入学年份");
        E2C.put("birthPlace","籍贯");
        E2C.put("majorKind","专业类别");
        E2C.put("birthday","出生日期");
        E2C.put("name","姓名");
        E2C.put("everName","曾用名");
        E2C.put("gender","性别");
        E2C.put("IDNumber","身份证号码");
        E2C.put("nation","民族");
        E2C.put("political","政治面貌");
        E2C.put("religion","宗教信仰");
        E2C.put("scores","高考分数");
        E2C.put("bloodType","血型");
        E2C.put("height","身高(cm)");
        E2C.put("onlyChild","是否独生子女");
        E2C.put("disabled","是否残疾人");
        E2C.put("tel","联系电话");
        E2C.put("email","信箱");
        E2C.put("batch","批次");

    }
    private void initC2E(){
        C2E.put("学号","studentID");
        C2E.put("学校","schoolName");
        C2E.put("专业","majorName");
        C2E.put("入学年份","dataForEnter");
        C2E.put("籍贯","birthPlace");
        C2E.put("专业类别","majorKind");
        C2E.put("出生日期","birthday");
        C2E.put("姓名","name");
        C2E.put("曾用名","everName");
        C2E.put("性别","gender");
        C2E.put("身份证号码","IDNumber");
        C2E.put("民族","nation");
        C2E.put("政治面貌","political");
        C2E.put("宗教信仰","religion");
        C2E.put("高考分数","scores");
        C2E.put("血型","bloodType");
        C2E.put("身高(cm)","height");
        C2E.put("是否独生子女","onlyChild");
        C2E.put("是否残疾人","disabled");
        C2E.put("联系电话","tel");
        C2E.put("信箱","email");
        C2E.put("批次","batch");
    }

    public Map<String,String> getC2E(){
        return this.C2E;
    }
    public Map<String,String> getE2C(){
        return this.E2C;
    }
}
