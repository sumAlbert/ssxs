package excelhandler;



import entity.Student;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sql.InsertSqlUsual;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell2 on 2017/5/31.
 */
public class ExcelHandler {
    private List<Student> students=new ArrayList<Student>();
    private XSSFWorkbook xssfWorkbook;
    public ExcelHandler(){
        try{
            InsertSqlUsual insertSqlUsual=new InsertSqlUsual();
            InputStream is=this.getClass().getResourceAsStream("student.xlsx");
            xssfWorkbook=new XSSFWorkbook(is);
            is.close();
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        List<String> list=new ArrayList<String>();
        CellStyle defaultCellStyle;
        Object object;
        XSSFSheet xssfSheet;
        XSSFRow xssfRow;
        XSSFCell xssfCell;
//        defaultCellStyle=xssfWorkbook.createCellStyle();
//        DataFormat dataFormat=xssfWorkbook.createDataFormat();
//        defaultCellStyle.setDataFormat(dataFormat.getFormat("@"));
        xssfSheet=xssfWorkbook.getSheetAt(0);
        if(xssfSheet!=null) {
            for (int i = 1; i <= xssfSheet.getLastRowNum(); i++) {
                xssfRow = xssfSheet.getRow(i);
                list.clear();
                if (xssfRow != null) {
                    for (int j = xssfRow.getFirstCellNum(); j < xssfRow.getLastCellNum(); j++) {
                        xssfCell = xssfRow.getCell(j);
                        if(xssfCell!=null) {
                            switch (xssfCell.getCellTypeEnum()) {
                                case STRING:
                                    object = xssfCell.getStringCellValue();
                                    list.add(String.valueOf(object));
                                    break;
                                case NUMERIC:
                                    object = xssfCell.getNumericCellValue();
                                    list.add(String.valueOf(object));
                                    break;
                                default:
                                    list.add("");
                                    break;
                            }
                        }
                        else{
                            list.add("");
                        }
                    }
                }
                Student student=new Student(list);
                students.add(student);
            }
        }
    }
}
