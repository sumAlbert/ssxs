package entity;

import hash.HashNum;

import java.util.ArrayList;

/**
 * Created by dell2 on 2017/6/4.
 */
public class Item {
    private String itemID;
    private ArrayList<Integer> displayIDOrder;
    private String displayOrderStr;

    public Item(){
        super();
        HashNum hashNum=new HashNum();
        itemID= hashNum.getHashNum(8);
        itemID="It"+itemID;
    }

    public void setItemID(String itemID){
        this.itemID=itemID;
    }
    public void setDisplayIDOrder(ArrayList<Integer> displayIDOrder){
        this.displayIDOrder=displayIDOrder;
    }
    public void setDisplayOrderStr(String displayOrderStr){
        this.displayOrderStr=displayOrderStr;
    }

    public String getItemID(){
        return this.itemID;
    }
    public ArrayList<Integer> getDisplayIDOrder(){
        return this.displayIDOrder;
    }
    public String getDisplayOrderStr(){
        return this.displayOrderStr;
    }
}
