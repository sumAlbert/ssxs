package entity;

import java.util.ArrayList;

/**
 * Created by dell2 on 2017/6/4.
 */
public class User {
    private String userID;
    private String email;
    private String pw;
    private ArrayList<Item> items;

    /**构造函数*/
    public User(){
        super();
        email="";
        pw="";
        items=new ArrayList<>();
    }
    /**get函数*/
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPw(){
        return this.pw;
    }
    public String getUserID(){
        return this.userID;
    }
    /**set函数*/
    public void setUserID(String userID){
        this.userID=userID;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPw(String pw){
        this.pw=pw;
    }
    public void setItems(ArrayList<Item> items){
        this.items=items;
    }

    public boolean createItems(){
        Item item=new Item();
        items.add(item);
        return true;
    }

}
