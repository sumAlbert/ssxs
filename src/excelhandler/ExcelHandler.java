package excelhandler;



import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell2 on 2017/5/31.
 */
public class ExcelHandler {
    private XSSFWorkbook xssfWorkbook;
    public ExcelHandler(){
        try{
            InputStream is=this.getClass().getResourceAsStream("test.xlsx");
            xssfWorkbook=new XSSFWorkbook(is);
            is.close();
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        List<String> list=new ArrayList<String>();
        Object object;
        XSSFSheet xssfSheet;
        XSSFRow xssfRow;
        XSSFCell xssfCell;
        xssfSheet=xssfWorkbook.getSheetAt(0);
        if(xssfSheet!=null) {
            for (int i = 1; i <= xssfSheet.getLastRowNum(); i++) {
                xssfRow = xssfSheet.getRow(i);
                if (xssfRow != null) {
                    for (int j = xssfRow.getFirstCellNum(); j < xssfRow.getLastCellNum(); j++) {
                        xssfCell = xssfRow.getCell(j);
                        if(xssfCell!=null) {
                            switch (xssfCell.getCellTypeEnum()) {
                                case STRING:
                                    object = xssfCell.getStringCellValue();
                                    list.add(String.valueOf(object) + "string");
                                    break;
                                case NUMERIC:
                                    object = xssfCell.getNumericCellValue();
                                    list.add(String.valueOf(object) + "numeric");
                                    break;
                                default:
                                    list.add(xssfCell.getCellTypeEnum().toString());
                                    break;
                            }
                        }
                        else{
                            list.add("空白");
                        }
                    }
                }
            }
        }
        System.out.print("");
    }
}
