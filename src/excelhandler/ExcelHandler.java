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
        XSSFSheet xssfSheet;
        XSSFRow xssfRow;
        XSSFCell xssfCell;
        xssfSheet=xssfWorkbook.getSheetAt(0);
        for(int i=xssfSheet.getFirstRowNum();i<=xssfSheet.getLastRowNum();i++){
            xssfRow=xssfSheet.getRow(i);
            for(int j=xssfRow.getFirstCellNum();j<xssfRow.getLastCellNum();j++){
                xssfCell=xssfRow.getCell(j);
                list.add(xssfCell.getCellTypeEnum().toString());
            }
        }
        System.out.println("123");
    }
}
