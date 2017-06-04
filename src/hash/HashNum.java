package hash;

/**
 * Created by dell2 on 2017/6/4.
 */
public class HashNum {
    public String getHashNum(int num){
        String result;
        String randomNum;
        if(num>5){
            randomNum=String.valueOf(10+(int)Math.floor(Math.random()*90));
            String timeMillis=String.valueOf(System.currentTimeMillis());
            String randomTime=timeMillis.substring(timeMillis.length()-num-3);
            randomTime=randomTime.substring(0,timeMillis.length()-num+1);
            result=randomTime+randomNum;
        }
        else{
            result="";
        }
        return result;
    }
}
