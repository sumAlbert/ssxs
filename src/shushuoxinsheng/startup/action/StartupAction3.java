package shushuoxinsheng.startup.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell2 on 2017/5/9.
 */
public class StartupAction3 extends ActionSupport{
    private int size=300;
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
            int temp_i=i%10;
            for(int j=1;j<=size;j++){
                switch (temp_i){
                    case 1:
                        if(line1(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 2:
                        if(line2(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 3:
                        if(line3(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 4:
                        if(line4(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 5:
                        if(line5(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 6:
                        if(line6(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 7:
                        if(line7(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 8:
                        if(line8(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    case 9:
                        if(line9(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
                        }
                        break;
                    default:
                        if(line1(j))
                        {
                            result.add(this.T);
                        }
                        else{
                            result.add(this.W);
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
        return false;
    }
    public boolean line2(int position){
        int temp=position%17;
        switch (temp){
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }
    public boolean line3(int position){
        int temp=position%17;
        switch (temp){
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }
    public boolean line4(int position){
        int temp=position%17;
        switch (temp){
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }
    public boolean line5(int position){
        int temp=position%17;
        switch (temp){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }
    public boolean line6(int position){
        int temp=position%17;
        switch (temp){
            case 5:
            case 9:
                return true;
            default:
                return false;
        }
    }
    public boolean line7(int position){
        int temp=position%17;
        switch (temp){
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }
    public boolean line8(int position){
        int temp=position%17;
        switch (temp){
            case 3:
            case 11:
                return true;
            default:
                return false;
        }
    }
    public boolean line9(int position){
        int temp=position%17;
        if(temp>=1&&temp<=13)
            return true;
        else
            return false;
    }
}
