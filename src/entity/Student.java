package entity;

import com.opensymphony.xwork2.ActionContext;
import hash.HashNum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/1.
 */
public class Student {
    private List<String> attrList=new ArrayList<String>();
    private Map<String,String> initMap;
    private boolean vaild;

    /**Excel中读取到的属性*/
    private String studentID;
    private String dataForEnter;
    private String birthday;
    private String birthPlace;
    private String name;
    private String everName;
    private String gender;
    private String IDNumber;
    private String nation;
    private String political;
    private String religion;
    private String scores;
    private String bloodType;
    private String height;
    private boolean onlyChild;
    private boolean disabled;
    private String tel;
    private String email;
    private String schoolName;
    private String majorName;
    private String majorKind;
    private String batch;
    //数据库元素
    private String schoolID;
    private String majorID;
    private String stuID;
    private String itemID;

    public Student(){
        super();
    }
    public Student(Map<String,String> initMap){
        HashNum hashNum=new HashNum();
        stuID="stu"+hashNum.getHashNum(10);
        this.initMap=initMap;
        Iterator iterator=initMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=(Map.Entry<String,String>)iterator.next();
            String key=entry.getKey();
            String value=entry.getValue();
            switch (key){
                case "studentID":
                    this.setStudentID(value);
                    break;
                case "schoolName":
                    this.setSchoolName(value);
                    break;
                case "majorName":
                    this.setMajorName(value);
                    break;
                case "dataForEnter":
                    this.setDataForEnter(value);
                    break;
                case "birthPlace":
                    this.setBirthPlace(value);
                    break;
                case "majorKind":
                    this.setMajorKind(value);
                    break;
                case "birthday":
                    this.setBirthday(value);
                    break;
                case "name":
                    this.setName(value);
                    break;
                case "everName":
                    this.setEverName(value);
                    break;
                case "gender":
                    this.setGender(value);
                    break;
                case "IDNumber":
                    this.setIDNumber(value);
                    break;
                case "nation":
                    this.setNation(value);
                    break;
                case "political":
                    this.setPolitical(value);
                    break;
                case "religion":
                    this.setReligion(value);
                    break;
                case "scores":
                    this.setScores(value);
                    break;
                case "bloodType":
                    this.setBloodType(value);
                    break;
                case "height":
                    this.setHeight(value);
                    break;
                case "onlyChild":
                    if(value.equals("是"))
                        this.setOnlyChild(true);
                    else
                        this.setOnlyChild(false);
                    break;
                case "disabled":
                    if(value.equals("是"))
                        this.setDisabled(true);
                    else
                        this.setDisabled(false);
                    break;
                case "tel":
                    this.setTel(value);
                    break;
                case "email":
                    this.setEmail(value);
                    break;
                case "batch":
                    this.setBatch(value);
                    break;
                case "schoolID":
                    this.setSchoolID(value);
                    break;
                case "majorID":
                    this.setMajorID(value);
                    break;
                case "stuID":
                    this.setStuID(value);
                    break;
                case "itemID":
                    this.setItemID(value);
                    break;
                default:
                    System.out.println(value);
                    break;
            }
        }
        this.initMap.put("stuID",stuID);
    }

    public void setInitMap(Map<String,String> initMap){
        this.initMap=initMap;
    }
    public void setItemID(String itemID){
        this.itemID=itemID;
    }
    public void setBatch(String batch){
        this.batch=batch;
    }
    public void setMajorKind(String majorKind){
        this.majorKind=majorKind;
    }
    public void setMajorName(String majorName){
        this.majorName=majorName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }
    public void setBirthday(String birthPlace){
        this.birthday=birthPlace;
    }
    public void setVaild(boolean vaild){
        this.vaild=vaild;
    }
    public void setAttrList(List<String> attrList){
        this.attrList=attrList;
    }
    public void setStudentID(String studentID){
        this.studentID=studentID;
    }
    public void setSchoolID(String schoolID){
        this.schoolID=schoolID;
    }
    public void setMajorID(String majorID){
        this.majorID=majorID;
    }
    public void setDataForEnter(String dataForEnter){
        this.dataForEnter=dataForEnter;
    }
    public void setBirthPlace(String birthPlace)
    {
        this.birthPlace=birthPlace;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEverName(String everName)
    {
        this.everName=everName;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setIDNumber(String IDNumber)
    {
        this.IDNumber=IDNumber;
    }
    public void setNation(String nation)
    {
        this.nation=nation;
    }
    public void setPolitical(String political)
    {
        this.political=political;
    }
    public void setReligion(String religion)
    {
        this.religion=religion;
    }
    public void setScores(String scores)
    {
        this.scores=scores;
    }
    public void setBloodType(String bloodType)
    {
        this.bloodType=bloodType;
    }
    public void setHeight(String height)
    {
        this.height=height;
    }
    public void setOnlyChild(boolean onlyChild)
    {
        this.onlyChild=onlyChild;
    }
    public void setDisabled(boolean disabled)
    {
        this.disabled=disabled;
    }
    public void setTel(String tel)
    {
        this.tel=tel;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setStuID(String stuID){
        this.stuID=stuID;
    }

    public String getBatch(){
        return this.batch;
    }
    public String getMajorKind(){
        return this.majorKind;
    }
    public String getMajorName(){
        return this.majorName;
    }
    public String getSchoolName(){
        return this.schoolName;
    }
    public String getBirthday(){return this.birthday;}
    public String getStudentID()
    {
        return this.studentID;
    }
    public String getSchoolID()
    {
        return this.schoolID;
    }
    public String getMajorID()
    {
        return this.majorID;
    }
    public String getDataForEnter()
    {
        return this.dataForEnter;
    }
    public String getBirthPlace()
    {
        return birthPlace;
    }
    public String getName()
    {
        return name;
    }
    public String getEverName()
    {
        return everName;
    }
    public String getGender()
    {
        return gender;
    }
    public String getIDNumber()
    {
        return IDNumber;
    }
    public String getNation()
    {
        return nation;
    }
    public String getPolitical()
    {
        return political;
    }
    public String getReligion()
    {
        return religion;
    }
    public String getScores()
    {
        return scores;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public String getHeight()
    {
        return height;
    }
    public String getTel()
    {
        return tel;
    }
    public String getEmail()
    {
        return email;
    }
    public boolean getOnlyChild(){
        return this.onlyChild;
    }
    public boolean getDisabled(){
        return this.disabled;
    }
    public boolean getVaild(){return this.vaild;}
    public List<String> getAttrList(){return this.attrList;}
    public String getStuID(){
        return this.stuID;
    }
    public String getItemID(){
        return this.itemID;
    }
    public Map<String,String> getInitMap(){
        return this.initMap;
    }
}