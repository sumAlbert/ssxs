package hash;

/**
 * Created by dell2 on 2017/6/4.
 */
public class HashNum {
    public String getStudentIDHashNum(int num){
        String result;
        String randomNum;
        if(num>8){
            randomNum=String.valueOf(10000000+(int)Math.floor(Math.random()*90000000));
            String timeMillis=String.valueOf(System.currentTimeMillis());
            String randomTime=timeMillis.substring(timeMillis.length()-num+8);
            result=randomTime+randomNum;
        }
        else{
            result="";
        }
        return result;
    }
    public String getHashNum(int num){
        String result;
        String randomNum;
        if(num>5){
            randomNum=String.valueOf(10000+(int)Math.floor(Math.random()*90000));
            String timeMillis=String.valueOf(System.currentTimeMillis());
            String randomTime=timeMillis.substring(timeMillis.length()-num+5);
            result=randomTime+randomNum;
        }
        else{
            result="";
        }
        return result;
    }
}
