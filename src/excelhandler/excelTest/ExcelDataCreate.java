package excelhandler.excelTest;

import excelhandler.excelentity.ExcelColumn;

import java.util.ArrayList;

/**
 * Created by dell2 on 2017/6/13.
 */
public class ExcelDataCreate {
    private ArrayList<String> excelRow;
    private String school;
    private String yearForEnter;
    private String preStudnetID="101525";
    private int index=1;
    private String[] major={"哲学","经济学","金融学类","法学","教育技术学","艺术教育","学前教育","对外汉语","数学","计算机科学","软件","设计"};


    public ExcelDataCreate(){
        createPreStudentID(5);
        yearForEnter="2017";
        excelRow=new ArrayList<>();
    }
    public ArrayList<String> createExcelRow(ArrayList<ExcelColumn> ALEC){
        excelRow=new ArrayList<>();
        for(int i=0;i<ALEC.size();i++){
            ExcelColumn excelColumn=ALEC.get(i);
            String value="";
            switch (excelColumn.getName()){
                case "学号":
                    value=preStudnetID+createStudentID();
                    break;
                case "学校":
                    value=school;
                    break;
                case "专业":
                    value=createMajor();
                    break;
                case "入学年份":
                    value=createDateEnter();
                    break;
                default:
                    break;
            }
            excelRow.add(value);
        }
        return excelRow;
    }
    /*自助生成*/
    public String createPreStudentID(int num){
        String str="";
        for(int i=0;i<num;i++) {
            if (i == 0) {
                str += String.valueOf(1 + (int) (9 * Math.random()));
            } else {
                str += String.valueOf((int) (10 * Math.random()));

            }
        }
        preStudnetID=str;
        return preStudnetID;
    }
    public String createStudentID(){
        String result="";
        if(index<10){
            result+="0000"+index;
        }
        else if(index<100){
            result+="000"+index;
        }
        else if(index<1000){
            result+="00"+index;
        }
        else if(index<10000){
            result+="0"+index;
        }
        else{
            result+=index;
        }
        return result;
    }
    public String createMajor(){
        String result="";
        int random=createNumMinSome();
        if(random<50){
            result=major[0];
        }else if(random<120){
            result=major[1];
        }else if(random<200){
            result=major[2];
        }else if(random<250){
            result=major[3];
        }else if(random<300){
            result=major[4];
        }else if(random<360){
            result=major[5];
        }else if(random<400){
            result=major[6];
        }else if(random<500){
            result=major[7];
        }else if(random<600){
            result=major[8];
        }else if(random<730){
            result=major[9];
        }else if(random<800){
            result=major[10];
        }else{
            result=major[11];
        }
        return result;
    }
    public String createDateEnter(){
        String result;
        int temp=1+createNumMinSome(20);
        String day;
        if(temp<10){
            day="0"+String.valueOf(temp);
        }
        else{
            day=String.valueOf(temp);
        }
        result=yearForEnter+"-09-"+day;
        return result;
    }
    /*辅助生成*/
    public int createNumMinSome(int num){
        return (int)Math.floor(num*Math.random());
    }
    public int createNumMinSome(){
        return (int)Math.floor(1000*Math.random());
    }
    /*get/set*/
    public void setExcelRow(ArrayList<String> excelRow){
        this.excelRow=excelRow;
    }
    public void setPreStudnetID(String preStudnetID){
        this.preStudnetID=preStudnetID;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public void setYearForEnter(String yearForEnter){
        this.yearForEnter=yearForEnter;
    }

    public ArrayList<String> getExcelRow(){
        return this.excelRow;
    }
    public String getPreStudnetID(){
        return this.preStudnetID;
    }
    public int getIndex(){
        return this.index;
    }
    public String getSchool(){
        return this.school;
    }
    public String getYearForEnter(){
        return this.yearForEnter;
    }
}
