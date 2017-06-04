package shushuoxinsheng.startup.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import java.util.Map;

/**
 * Created by dell2 on 2017/5/9.
 */
public class StartupAction extends ActionSupport{

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        User user=new User();
        ActionContext actionContext=ActionContext.getContext();
        Map session=actionContext.getSession();
        user.createItems();
        session.put("userInfo",user);
        return SUCCESS;
    }
}
