package excelhandler.excelTest;

import excelhandler.excelentity.ExcelColumn;

import java.util.ArrayList;

/**
 * Created by dell2 on 2017/6/13.
 */
public class ExcelDataCreate {
    private ArrayList<String> excelRow;
    private String school;
    private String yearForEnter="";
    private String preStudnetID="101525";
    private int birthYearStandard=1996;
    private String IDbirthPart="19960823";
    private int index=1;
    private String[] major={"哲学","经济学","金融学类","法学","教育技术学","艺术教育","学前教育","对外汉语","数学","计算机科学","软件","设计"};
    private String[] firstName={"李","王","张","陈","刘","杨","赵","黄","吴","周","朱","徐","孙","胡","朱","高","林","何","郭","马","罗","梁","宋","郑","谢","韩","唐","冯","萧"
            ,"程","袁","邓","许","沈","曾","彭","吕","苏","卢","蒋","丁","章","黄"};
    private String[] middleName={"安","铁","一","小","炎","琪","蓓","艾","贝","柏","本","碧","博","逸","达","世","宇","昂","彩","天","楚","想","容","妍","闱","淦","凤","典","晨"
            ,"炳","丹","飞","芳","艳","川","冬","桂","彧","芬","灵","春","豆","恩","大"};
    private String[] province={"北京","辽宁","浙江","河南","海南","西藏","新疆","天津","吉林","安徽","湖北","重庆","陕西","河北","吉林","福建","湖南"
            ,"四川","甘肃","山西","上海","江西","广东","贵州","青海","内蒙古","江苏","宁夏","山东","广西","云南"};
    private int[] provinceCount={20,69,172,175,18,6,74,22,84,177,21,107,36,60,23,105,64,179,41,59,522,126,45,92,7,39,68,16,116,60,64};
    private String[] majorKind={"文史类","理工类","体育类","艺术类"};
    private String[] perID={"362301","152345","587453","245789","412589","623485","784563","845963","952145"};
    private String[] nation={"壮族","满族","回族","土家族","维吾尔族","蒙古族","藏族","汉族"};
    private String[] patch={"本科一批","体育","国家专项","本科提前","民族预科"};

    public ExcelDataCreate(){
        createPreStudentID(5);
        createDateEnter();
        yearForEnter="2017";
        excelRow=new ArrayList<>();
    }
    public ArrayList<String> createExcelRow(ArrayList<ExcelColumn> ALEC){
        excelRow=new ArrayList<>();
        for(int i=0;i<ALEC.size();i++){
            ExcelColumn excelColumn=ALEC.get(i);
            String value="";
            switch (excelColumn.getName()){
                case "学号":
                    value=preStudnetID+createStudentID();
                    break;
                case "学校":
                    value=school;
                    break;
                case "专业":
                    value=createMajor();
                    break;
                case "入学年份":
                    value="2016-09-06";
                    break;
                case "姓名":
                    value=createName();
                    break;
                case "籍贯":
                    value=createProvince();
                    break;
                case "专业类别":
                    value=createMajorKind();
                    break;
                case "出生日期":
                    value=createBirthday();
                    break;
                case "曾用名":
                    value="无";
                    break;
                case "性别":
                    value=createGender();
                    break;
                case "身份证号码":
                    value=createID();
                    break;
                case "民族":
                    value=createNation();
                    break;
                case "政治面貌":
                    value=createPolitical();
                    break;
                case "宗教信仰":
                    value=createReligion();
                    break;
                case "高考分数":
                    value=createScore();
                    break;
                case "血型":
                    value=createBlood();
                    break;
                case "身高(cm)":
                    value=createHeight();
                    break;
                case "是否独生子女":
                    value=createOnly();
                    break;
                case "是否残疾人":
                    value="否";
                    break;
                case "联系电话":
                    value=createTel();
                    break;
                case "信箱":
                    value=createEmail();
                    break;
                case "批次":
                    value=createPatch();
                    break;
                default:
                    break;
            }
            excelRow.add(value);
        }
        index++;
        return excelRow;
    }
    /*自助生成*/
    public String createPreStudentID(int num){
        String str="";
        for(int i=0;i<num;i++) {
            if (i == 0) {
                str += String.valueOf(1 + (int) (9 * Math.random()));
            } else {
                str += String.valueOf((int) (10 * Math.random()));

            }
        }
        preStudnetID=str;
        return preStudnetID;
    }
    public String createStudentID(){
        String result="";
        if(index<10){
            result+="0000"+index;
        }
        else if(index<100){
            result+="000"+index;
        }
        else if(index<1000){
            result+="00"+index;
        }
        else if(index<10000){
            result+="0"+index;
        }
        else{
            result+=index;
        }
        return result;
    }
    public String createMajor(){
        String result="";
        int random=createNumMinSome();
        if(random<50){
            result=major[0];
        }else if(random<120){
            result=major[1];
        }else if(random<200){
            result=major[2];
        }else if(random<250){
            result=major[3];
        }else if(random<300){
            result=major[4];
        }else if(random<360){
            result=major[5];
        }else if(random<400){
            result=major[6];
        }else if(random<500){
            result=major[7];
        }else if(random<600){
            result=major[8];
        }else if(random<730){
            result=major[9];
        }else if(random<800){
            result=major[10];
        }else{
            result=major[11];
        }
        return result;
    }
    public String createDateEnter(){
        String result;
        int temp=1+createNumMinSome(20);
        String day;
        if(temp<10){
            day="0"+String.valueOf(temp);
        }
        else{
            day=String.valueOf(temp);
        }
        result=yearForEnter+"-09-"+day;
        return result;
    }
    public String createName(){
        String result="";
        int equal=0;
        int random=createNumMinSome();
        if(random<95){
            result+=firstName[0];
        }else if(random<183){
            result+=firstName[1];
        }else if(random<267){
            result+=firstName[2];
        }else if(random<331){
            result+=firstName[3];
        }else if(random<385){
            result+=firstName[4];
        }else if(random<422){
            result+=firstName[5];
        }else if(random<449){
            result+=firstName[6];
        }else if(random<475){
            result+=firstName[7];
        }else if(random<500){
            result+=firstName[8];
        }else if(random<524){
            result+=firstName[9];
        }else{
            equal=createNumMinSome(firstName.length-12);
            result+=firstName[equal+10];
        }
        equal=createNumMinSome(middleName.length-1);
        result+=middleName[equal];
        equal=createNumMinSome();
        if(equal<900){
            equal=createNumMinSome(middleName.length-1);
            result+=middleName[equal];
        }
        return result;
    }
    public String createProvince(){
        String result="";
        int[] provinceTotal=new int[provinceCount.length];
        int tempTotal=0;
        int random=createNumMinSome(2666);
        for(int i=0;i<provinceCount.length;i++){
            tempTotal+=provinceCount[i];
            provinceTotal[i]=tempTotal;
        }
        for(int i=0;i<provinceTotal.length;i++){
            if(random<provinceTotal[i]){
                result+=province[i];
                break;
            }
        }
        return result;
    }
    public String createMajorKind(){
        String result="";
        int random=createNumMinSome(1732);
        if(random<844){
            result+=majorKind[0];
        }else if(random<1443){
            result+=majorKind[1];
        }else if(random<1647){
            result+=majorKind[2];
        }else{
            result+=majorKind[3];
        }
        return result;
    }
    public String createBirthday(){
        String result="";
        IDbirthPart="";
        int random=createNumMinSome();
        int year=birthYearStandard;
        if(random<10){
            year-=3;
        }else if(random<50){
            year-=2;
        }else if(random<200){
            year-=1;
        }else if(random<800){
            year=year;
        }else if(random<950){
            year+=1;
        }else if(random<990){
            year+=2;
        }else{
            year+=3;
        }
        IDbirthPart+=String.valueOf(year);
        result+=String.valueOf(year);
        int temp=1+createNumMinSome(12);
        if(temp<10){
            result+=("-0"+String.valueOf(temp));
            IDbirthPart+=("0"+String.valueOf(temp));
        }
        else{
            result+=("-"+String.valueOf(temp));
            IDbirthPart+=(String.valueOf(temp));
        }
        if(temp==2)
            temp=1+createNumMinSome(28);
        else
            temp=1+createNumMinSome(30);
        if(temp<10){
            result+=("-0"+String.valueOf(temp));
            IDbirthPart+=("0"+String.valueOf(temp));
        }
        else{
            result+=("-"+String.valueOf(temp));
            IDbirthPart+=(String.valueOf(temp));
        }
        return result;
    }
    public String createGender(){
        String result="";
        int random=createNumMinSome();
        if(random<650){
            result="男";
        }
        else{
            result="女";
        }
        return result;
    }
    public String createID(){
        String result="";
        int random=createNumMinSome(9);
        result+=perID[random]+IDbirthPart;
        for(int i=0;i<4;i++){
            random=createNumMinSome(10);
            result+=String.valueOf(random);
        }
        return result;
    }
    public String createNation(){
        String result="";
        int random=createNumMinSome(800);
        if(random>=8){
            result+="汉族";
        }
        else{
            result+=nation[random];
        }
        return result;
    }
    public String createPolitical(){
        String result="";
        int random=createNumMinSome();
        if(random<=990){
            result+="共青团员";
        }
        else if(random<=997){
            result+="预备党员";
        }else{
            result+="群众";
        }
        return result;
    }
    public String createReligion(){
        String result="";
        int random=createNumMinSome();
        if(random<=920){
            result+="无宗教信仰";
        }
        else if(random<=970){
            result+="佛教";
        }else if(random<=990){
            result+="基督教";
        }else{
            result+="道教";
        }
        return result;
    }
    public String createScore(){
        String result="";
        int random=610+createNumMinSome(30);
        result=String.valueOf(random);
        return result;
    }
    public String createBlood(){
        String result="";
        int random=createNumMinSome();
        if(random<410){
            result+="O";
        }else if(random<680){
            result+="A";
        }else if(random<920){
            result+="B";
        }else{
            result+="AB";
        }
        return result;
    }
    public String createHeight(){
        String result="";
        int random=150+createNumMinSome(40);
        result=String.valueOf(random);
        return result;
    }
    public String createOnly(){
        String result="";
        int random=createNumMinSome();
        if(random<230){
            result+="是";
        }
        else{
            result+="否";
        }
        return result;
    }
    public String createTel(){
        String result="";
        int random=createNumMinSome(5);
        String[] preTel={"153","133","136","182","150"};
        result+=preTel[random];
        random=createNumMinSome(9000)+1000;
        result+=String.valueOf(random);
        random=createNumMinSome(9000)+1000;
        result+=String.valueOf(random);
        return result;
    }
    public String createEmail(){
        String result="";
        int random=createNumMinSome(9000)+1000;
        result+=String.valueOf(random);
        random=createNumMinSome(9000)+1000;
        result+=String.valueOf(random);
        random=createNumMinSome();
        String[] preTel={"@qq.com","@163.com","@126.com","@sina.com"};
        if(random<750){
            result+=preTel[0];
        }else if(random<850){
            result+=preTel[1];
        }else if(random<950){
            result+=preTel[2];
        }else{
            result+=preTel[3];
        }
        return result;
    }
    public String createPatch(){
        String result="";
        int random=createNumMinSome();
        if(random<35){
            result+=patch[1];
        }else if(random<100){
            result+=patch[3];
        }else if(random<150){
            result+=patch[4];
        }else if(random<300){
            result+=patch[2];
        }else{
            result+=patch[0];
        }
        return result;
    }
    /*辅助生成*/
    public int createNumMinSome(int num){
        return (int)Math.floor(num*Math.random());
    }
    public int createNumMinSome(){
        return (int)Math.floor(1000*Math.random());
    }
    /*get/set*/
    public void setExcelRow(ArrayList<String> excelRow){
        this.excelRow=excelRow;
    }
    public void setPreStudnetID(String preStudnetID){
        this.preStudnetID=preStudnetID;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public void setYearForEnter(String yearForEnter){
        this.yearForEnter=yearForEnter;
    }
    public void setBirthYearStandard(int birthYearStandard){
        this.birthYearStandard=birthYearStandard;
    }

    public ArrayList<String> getExcelRow(){
        return this.excelRow;
    }
    public String getPreStudnetID(){
        return this.preStudnetID;
    }
    public int getIndex(){
        return this.index;
    }
    public String getSchool(){
        return this.school;
    }
    public String getYearForEnter(){
        return this.yearForEnter;
    }
    public int getBirthYearStandard(){
        return this.birthYearStandard;
    }
}
