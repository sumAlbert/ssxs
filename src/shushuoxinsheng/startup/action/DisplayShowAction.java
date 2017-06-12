package shushuoxinsheng.startup.action;

import entity.analyse.Analyse;
import entity.analyse.AnalyseHandler;
import entity.display.Display;
import entity.display.DisplayHandler;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by dell2 on 2017/6/11.
 */
public class DisplayShowAction {
    private List<Display> displayIDOrderList=new ArrayList<>();
    private List<Analyse> analyseList=new ArrayList<>();
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        String itemID="iID1234567890";
        String displayIDOrder="dpI1234567890,dpI1234567891,dpI1234567892,dpI1234567893,dpI1234567894,dpI1234567895,dpI1234567896,dpI1234567897,dpI1234567898,dpI1234567899";
        String[] displayIDOrders=displayIDOrder.split(",");
        DisplayHandler displayHandler=new DisplayHandler();
        AnalyseHandler analyseHandler=new AnalyseHandler();
        for(int i=0;i<displayIDOrders.length;i++){
            Display display=displayHandler.getDisplay(displayIDOrders[i]);
            Analyse analyse=analyseHandler.getAnalyse(display,itemID);
            analyse.limitSize(12);
            analyseList.add(analyse);
            displayIDOrderList.add(display);
        }
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("analyse",analyseList);
        request.setAttribute("displayIDOrder",displayIDOrderList);
        return SUCCESS;
    }

    public void setDisplayIDOrderList(List<Display> displayIDOrderList){
        this.displayIDOrderList=displayIDOrderList;
    }
    public void setAnalyseList(List<Analyse> analyseList){
        this.analyseList=analyseList;
    }
    public List<Display> getDisplayIDOrderList(){
        return this.displayIDOrderList;
    }
    public List<Analyse> getAnalyseList(){
        return this.analyseList;
    }
}
