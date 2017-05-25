package shushuoxinsheng.startup.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell2 on 2017/5/9.
 */
public class StartupAction extends ActionSupport{
    private int size=1000;
    private static final String W="point_white";
    private static final String T="point_transparent";
    private List<String> result;
    private String result_inner="";
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        result=new ArrayList<String>();
        init();
        ActionContext.getContext().getSession().put("result", result);
        ActionContext.getContext().getSession().put("size", size);
        return SUCCESS;
    }
    public void init(){
        for(int i=1;i<=size;i++){
            int temp_i=i%5;
            for(int j=1;j<=size;j++){
                switch (temp_i){
                    case 1:
                        if(line2(j)){
                            result.add(this.W);
                        }
                        else{
                            result.add(this.T);
                        }
                        break;
                    case 2:
                        if(line3(j)){
                            result.add(this.W);
                        }
                        else{
                            result.add(this.T);
                        }
                        break;
                    case 3:
                        if(line3(j)){
                            result.add(this.W);
                        }
                        else{
                            result.add(this.T);
                        }
                        break;
                    case 4:
                        if(line5(j)){
                            result.add(this.W);
                        }
                        else{
                            result.add(this.T);
                        }
                        break;
                    case 0:
                        if(line6(j)){
                            result.add(this.W);
                        }
                        else{
                            result.add(this.T);
                        }
                        break;
                }
            }
        }
    }
    public void setResult_inner(String result_inner){
        this.result_inner=result_inner;
    }
    public String getResult_inner(){
        return result_inner;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void setResult(List<String> result){
        this.result=result;
    }
    public List<String> getResult(){
        return result;

    }
    public boolean line1(int position){
        return true;
    }
    public boolean line2(int position){
        int temp=position%6;
        switch (temp){
            case 3:
            case 5:
                return false;
            default:
                return true;
        }
    }
    public boolean line3(int position){
        int temp=position%6;
        switch (temp){
            case 1:
                return true;
            default:
                return false;
        }
    }
    public boolean line5(int position){
        int temp=position%6;
        switch (temp){
            case 3:
            case 4:
            case 5:
                return false;
            default:
                return true;
        }
    }
    public boolean line6(int position){
        int temp=position%6;
        switch (temp){
            case 4:
                return false;
            default:
                return true;
        }
    }
}
