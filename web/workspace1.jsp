<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 2017/5/31
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>述说新生</title>
</head>
<body>
    <a href="./css/<s:property value="name"></s:property> ">123</a>
</body>
</html>
<!--
package entity;

import java.util.ArrayList;
import java.util.List;

/**
* Created by dell2 on 2017/6/1.
*/
public class Student {
private List<String> attrList=new ArrayList<String>();
private boolean vaild;
private String studentID;
private String schoolID;
private String majorID;
private String dataForEnter;
private String birthday;
private String subject;
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
private String kind;
public Student(List<String> attrList){
for(int i=0;i<attrList.size();i++){
switch(i){
case 0:
this.setStudentID((String)attrList.get(0));
break;
case 1:
this.setSchoolID((String)attrList.get(1));
break;
case 2:
this.setDataForEnter((String)attrList.get(2));
break;
case 3:
this.setBirthPlace((String)attrList.get(3));
break;
case 4:
this.setSubject((String)attrList.get(4));
break;
case 5:
this.setBirthday((String)attrList.get(5));
break;
case 6:
this.setName((String)attrList.get(6));
break;
case 7:
this.setEverName((String)attrList.get(7));
break;
case 8:
this.setGender((String)attrList.get(8));
break;
case 9:
this.setIDNumber((String)attrList.get(9));
break;
case 10:
this.setNation((String)attrList.get(10));
break;
case 11:
this.setPolitical((String)attrList.get(11));
break;
case 12:
this.setReligion((String)attrList.get(12));
break;
case 13:
this.setScores((String)attrList.get(13));
break;
case 14:
this.setBloodType((String)attrList.get(14));
break;
case 15:
this.setHeight((String)attrList.get(15));
break;
case 16:
if(((String)attrList.get(16)).equals("是"))
this.setOnlyChild(true);
else
this.setOnlyChild(false);
break;
case 17:
if(((String)attrList.get(17)).equals("是"))
this.setDisabled(true);
else
this.setDisabled(false);
break;
case 18:
this.setTel((String)attrList.get(18));
break;
case 19:
this.setEmail((String)attrList.get(19));
break;
case 20:
this.setKind((String)attrList.get(20));
default:
break;
}
}
}

public void setKind(String kind){
this.kind=kind;
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
public void setSubject(String subject){
this.subject=subject;
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

public String getKind(){
return kind;
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
public String getSubject()
{
return this.subject;
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
}
-->