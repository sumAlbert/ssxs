package shushuoxinsheng.startup.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Item;
import entity.User;
import entity.item.action.ItemHandler;
import entity.user.action.UserHandler;
import hash.HashNum;

import java.util.Map;

/**
 * Created by dell2 on 2017/5/9.
 */
public class StartupAction extends ActionSupport{
    private String email;
    private String pw;
    private String kind;

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        String email="123456@qq.com";
        String pw="123456";
        String itemID="iID1234567890";
        String kind="0";
        User user=(new UserHandler()).login(email,pw);
        Item item=(new ItemHandler()).getItem(itemID);
        if(user!=null){
            ActionContext actionContext=ActionContext.getContext();
            Map session=actionContext.getSession();
            session.put("userInfo",user);
            if(item!=null)
            {
                session.put("itemInfo",item);
            }
        }
        return SUCCESS;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void setPw(String pw){
        this.pw=pw;
    }
    public void setKind(String kind){
        this.kind=kind;
    }

    public String getEmail(){
        return this.email;
    }
    public String getPw(){
        return this.pw;
    }
    public String getKind(){
        return this.kind;
    }
}
