package entity;

import hash.HashNum;

import java.util.ArrayList;

/**
 * Created by dell2 on 2017/6/4.
 */
public class Item {
    private String itemID;
    private ArrayList<Integer> displayIDOrder;

    public Item(){
        super();
        itemID= HashNum.getHashNum(8);
        itemID="It"+itemID;
    }

    public void setItemID(String itemID){
        this.itemID=itemID;
    }
    public void setDisplayIDOrder(ArrayList<Integer> displayIDOrder){
        this.displayIDOrder=displayIDOrder;
    }

    public String getItemID(){
        return this.itemID;
    }
    public ArrayList<Integer> getDisplayIDOrder(){
        return this.displayIDOrder;
    }
}
