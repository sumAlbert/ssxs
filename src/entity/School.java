package entity;

/**
 * Created by dell2 on 2017/6/13.
 */
public class School {
    private String schoolID;
    private String schoolKind;
    private String schoolName;
    private String schoolLocation;
    private String itemID;

    public void setSchoolID(String schoolID){
        this.schoolID=schoolID;
    }
    public void setSchoolKind(String schoolKind){
        this.schoolKind=schoolKind;
    }
    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }
    public void setSchoolLocation(String schoolLocation){
        this.schoolLocation=schoolLocation;
    }
    public void setItemID(String itemID){
        this.itemID=itemID;
    }

    public String getSchoolID(){
        return this.schoolID;
    }
    public String getSchoolKind(){
        return this.schoolKind;
    }
    public String getSchoolName(){
        return this.schoolName;
    }
    public String getSchoolLocation(){
        return this.schoolLocation;
    }
    public String getItemID(){
        return this.itemID;
    }
}
