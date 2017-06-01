package entity;

/**
 * Created by dell2 on 2017/6/1.
 */
public class student {
    private String studentID;
    private String schoolID;
    private String majorID;
    private String dataForEnter;
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

    public void setStudentID(String studentID){
        this.setStudentID(studentID);
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
    private void setBirthPlace(String birthPlace)
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
}
