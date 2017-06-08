package excelhandler;



import com.opensymphony.xwork2.ActionContext;
import entity.Item;
import entity.Major;
import entity.Student;
import entity.User;
import excelhandler.excelentity.ExcelColumnNameArr;
import excelhandler.excelsql.CreateTableSql;
import hash.HashNum;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sql.InsertSqlUsual;


import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by dell2 on 2017/5/31.
 */
public class ExcelHandler {
    private HashNum hashNum=new HashNum();
    private List<Student> students=new ArrayList<Student>();
    private List<String> columnHeader=new ArrayList<String>();
    private Map<String,HashMap<String,String>> majorMap=new HashMap<String,HashMap<String,String>>();
    private XSSFWorkbook xssfWorkbook;
    private String path;

    public ExcelHandler(String path){
        /*读取excel并得到student实体*/
        ActionContext ac=ActionContext.getContext();
        Map session=ac.getSession();
        String schoolId=((Item)session.get("itemInfo")).getItemID().substring(3);
        String itemID=((Item)session.get("itemInfo")).getItemID();
        this.path=path;
        try{
            InputStream is=new FileInputStream(path);
            xssfWorkbook=new XSSFWorkbook(is);
            is.close();
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        List<String> list=new ArrayList<String>();
        Map<String,String> map=new HashMap<String,String>();
        Object object;
        XSSFSheet xssfSheet;
        XSSFRow xssfRow;
        XSSFCell xssfCell;
        int lastColumn=0;
        xssfSheet=xssfWorkbook.getSheetAt(0);
        if(xssfSheet!=null){
            xssfRow=xssfSheet.getRow(0);
            if(xssfRow!=null) {
                lastColumn=xssfRow.getLastCellNum();
                for (int i = xssfRow.getFirstCellNum();i<xssfRow.getLastCellNum(); i++) {
                    xssfCell = xssfRow.getCell(i);
                    if(xssfCell!=null){
                        switch (xssfCell.getCellTypeEnum()){
                            case STRING:
                                object=xssfCell.getStringCellValue();
                                columnHeader.add(String.valueOf(object));
                                break;
                            default:
                                columnHeader.add("");
                        }
                    }

                }
            }
        }
        if(xssfSheet!=null) {
            for (int i = 1; i <= xssfSheet.getLastRowNum(); i++) {
                xssfRow = xssfSheet.getRow(i);
                map.clear();
                if (xssfRow != null) {
                    String tempMajorKind="";
                    String tempMajorName="";
                    for (int j = xssfRow.getFirstCellNum(); j < lastColumn; j++) {
                        xssfCell = xssfRow.getCell(j);
                        String key=columnHeader.get(j);
                        key=C2E(key);
                        if(xssfCell!=null) {
                            switch (xssfCell.getCellTypeEnum()) {
                                case STRING:
                                    object = xssfCell.getStringCellValue();
                                    map.put(key,String.valueOf(object));
                                    if(key.equals("majorKind")){
                                        tempMajorKind=String.valueOf(object);
                                    }
                                    if(key.equals("majorName")){
                                        tempMajorName=String.valueOf(object);
                                    }
                                    break;
                                case NUMERIC:
                                    object = xssfCell.getNumericCellValue();
                                    map.put(key,String.valueOf(object));
                                    break;
                                case FORMULA:
                                    object=xssfCell.getDateCellValue();
                                    Date data=(Date)object;
                                    String dataResult=data.toString();
                                    map.put(key,dataResult);
                                    break;
                                default:
                                    map.put("","");
                                    break;
                            }
                        }
                        else{
                            map.put("","");
                        }
                        if(j==lastColumn-1){
                            String majorIDResult="";
                             HashMap<String,String> existMajorKindMap=majorMap.get(tempMajorName);
                             if(existMajorKindMap==null){
                                String majorID="mID"+hashNum.getHashNum(8);
                                HashMap<String,String> secondHashMap=new HashMap<String,String>();
                                 secondHashMap.put(tempMajorKind,majorID);
                                majorMap.put(tempMajorName,secondHashMap);
                                 majorIDResult=majorID;
                             }
                             else{
                                 String oldMajorID=existMajorKindMap.get(tempMajorKind);
                                 if(oldMajorID==null){
                                     String majorID="mID"+hashNum.getHashNum(10);
                                     existMajorKindMap.put(tempMajorKind,majorID);
                                     majorIDResult=majorID;
                                 }
                                 else{
                                     majorIDResult=oldMajorID;
                                 }
                             }
                             map.put("majorID",majorIDResult);
                             map.put("schoolID","sID"+schoolId);
                             map.put("itemID",itemID);
                        }
                    }
                }
                Student student=new Student(map);
                students.add(student);
            }
        }
        /*导入数据库*/
        insertSchInfo2db();
    }

    public String C2E(String str){
        String result;
        ExcelColumnNameArr excelColumnNameArr=new ExcelColumnNameArr();
        result=excelColumnNameArr.getC2E().get(str);
        return result;
    }

    public void insertSchInfo2db(){
        String schoolName="华东师范大学";
        String schoolKind="985";
        String schoolProvince="上海";
    }
}