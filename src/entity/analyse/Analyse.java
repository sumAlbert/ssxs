package entity.analyse;


import entity.display.Display;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by dell2 on 2017/6/12.
 */
public class Analyse {
    private List<String> name;
    private List<String> scale_save;
    private List<String> count_save;
    private List<String> percent_save;
    private String displayKindInfo;
    private String result_key="";
    private String result_value="";


    public void setName(List<String> name){
        this.name=name;
    }
    public void setDisplayKindInfo(String displayKindInfo){
        this.displayKindInfo=displayKindInfo;
    }
    public void setScale_save(List<String> scale_save){
        this.scale_save=scale_save;
    }
    public void setCount_save(List<String> count_save){
        this.count_save=count_save;
    }
    public void setPercent_save(List<String> percent_save){
        this.percent_save=percent_save;
    }

    public String getDisplayKindInfo(){ return this.displayKindInfo;}
    public List<String> getName(){
        return this.name;
    }
    public List<String> getScale_save(){
        return this.scale_save;
    }
    public List<String> getCount_save(){
        return this.count_save;
    }
    public List<String> getPercent_save(){
        return this.percent_save;
    }

    public void limitSize(int num){
        List<String> temp_name=new ArrayList<>();
        List<String> temp_scale_save=new ArrayList<>();
        List<String> temp_count_save=new ArrayList<>();
        if(name.size()>num){
            for(int i=0;i<num;i++){
                temp_name.add(name.get(i));
                temp_count_save.add(count_save.get(i));
                temp_scale_save.add(scale_save.get(i));
            }
            name=temp_name;
            count_save=temp_count_save;
            scale_save=temp_scale_save;
        }
    }


    public String startsC2E(String C){
        String E;
        switch (C){
            case "白羊座":
                E="starts_1.png";
                break;
            case "金牛座":
                E="starts_2.png";
                break;
            case "双子座":
                E="starts_3.png";
                break;
            case "巨蟹座":
                E="starts_4.png";
                break;
            case "狮子座":
                E="starts_5.png";
                break;
            case "处女座":
                E="starts_6.png";
                break;
            case "天秤座":
                E="starts_7.png";
                break;
            case "天蝎座":
                E="starts_8.png";
                break;
            case "射手座":
                E="starts_9.png";
                break;
            case "摩羯座":
                E="starts_10.png";
                break;
            case "水平座":
                E="starts_11.png";
                break;
            case "双鱼座":
                E="starts_12.png";
                break;
            default:
                E="starts_1.png";
        }
        return E;
    }
    public String genderC2E(String C){
        String E;
        switch (C){
            case "1":
                E="male.png";
                break;
            case "2":
                E="female.png";
                break;
            default:
                E="male.png";
        }
        return E;
    }
    public String majorKindC2E(String C){
        String E;
        switch (C){
            case "文科类":
                E="major_kind_1.png";
                break;
            case "艺术类":
                E="major_kind_3.png";
                break;
            case "体育类":
                E="major_kind_4.png";
                break;
            case "理工类":
                E="major_kind_2.png";
                break;
            default:
                E="major_kind_1.png";
        }
        return E;
    }


    public void getYearInfo(Analyse analyse){
        result_key="[";
        result_value="[";
        int[] year_int=new int[analyse.name.size()];
        Map<Integer,String> save_info=new HashMap<>();
        for(int i=0;i<analyse.name.size();i++){
            Integer integer=new Integer(analyse.name.get(i));
            year_int[i]=Integer.parseInt(analyse.name.get(i));
            save_info.put(integer,analyse.count_save.get(i));
        }
        Arrays.sort(year_int);
        for(int i=0;i<year_int.length;i++){
            Integer integer=new Integer(year_int[i]);
            String value=String.valueOf(save_info.get(integer));
            String key=String.valueOf(integer);
            if(i==0){
                result_key=result_key+"\""+key+"\"";
                result_value+=value;
            }
            else{
                result_key=result_key+",\""+key+"\"";
                result_value=result_value+","+value;
            }
        }
        result_key+="]";
        result_value+="]";
    }

    public int getHundredLine(String n){
        String line=n.substring(2,3);
        return Integer.valueOf(line);
    }
    public int getHundredSingleLineNum(String n){
        String line=n.substring(3,4);
        return Integer.valueOf(line);
    }
    public int getHundredSingleAnoLineNum(String n){
        String line=n.substring(3,4);
        return (10-Integer.valueOf(line));
    }
    public int getHundredAnoLine(String n){
        String line=n.substring(2,3);
        return (9-Integer.valueOf(line));
    }
    public String getResult_key(){
        return this.result_key;
    }
    public String getResult_value(){
        return this.result_value;
    }
}
