package entity.display;

/**
 * Created by dell2 on 2017/6/11.
 */
public class Display {
    private String displayID;
    private String displayKindId;
    private String displayTitle;
    private String displayInfo;

    public void setDisplayID(String displayID){
        this.displayID=displayID;
    }
    public void setDisplayKindId(String displayKindId){
        this.displayKindId=displayKindId;
    }
    public void setDisplayTitle(String displayTitle){
        this.displayTitle=displayTitle;
    }
    public void setDisplayInfo(String displayInfo){
        this.displayInfo=displayInfo;
    }

    public String getDisplayID(){
        return this.displayID;
    }
    public String getDisplayKindId(){
        return this.displayKindId;
    }
    public String getDisplayTitle(){
        return this.displayTitle;
    }
    public String getDisplayInfo(){
        return this.displayInfo;
    }
}
