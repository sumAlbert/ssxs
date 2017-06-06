package entity;

/**
 * Created by dell2 on 2017/6/6.
 */
public class Major {
    private String majorId;
    private String majorKind;
    private String majorName;

    public Major(){
        super();
    }
    public Major(String majorName,String majorKind){
        this.majorKind=majorKind;
        this.majorName=majorName;
    }
    public boolean equals(Major major){
        boolean result=true;
        if(!this.majorName.equals(major.majorName)){
            result=false;
        }
        if(!this.majorKind.equals(major.majorKind)){
            result=false;
        }
        return result;
    }
    public void setMajorId(String majorId){
        this.majorId=majorId;
    }
    public void setMajorKind(String majorKind){
        this.majorKind=majorKind;
    }
    public void setMajorName(String majorName){
        this.majorName=majorName;
    }

    public String getMajorId(){
        return majorId;
    }
    public String getMajorKind(){
        return majorKind;
    }
    public String getMajorName(){
        return majorName;
    }
}
