package excelhandler;

import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.net.URLDecoder;

import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 * Created by dell2 on 2017/6/3.
 */
public class ExcelCreate {
    private static FileOutputStream fileOutputStream=null;
    private static String[] strings={ "A", "B", "C", "D", "E" };
    public static void create(){
        try {
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
            XSSFSheet xssfSheet=xssfWorkbook.createSheet("sheet1");
            CellStyle cellStyle = xssfWorkbook.createCellStyle();
            DataFormat format = xssfWorkbook.createDataFormat();

            cellStyle.setDataFormat(format.getFormat("@"));
            xssfSheet.setColumnWidth(0,3000);
            xssfSheet.setDefaultColumnStyle(0, cellStyle);
            xssfSheet.setColumnWidth(1,3000);
            xssfSheet.setDefaultColumnStyle(1, cellStyle);

            XSSFDataValidationConstraint constraint =new XSSFDataValidationConstraint(strings);
            CellRangeAddressList regions = new CellRangeAddressList(3, 30000, 4, 6);
            DataValidationHelper help = new XSSFDataValidationHelper((XSSFSheet)xssfSheet);
            DataValidation data_validation_list = help.createValidation(constraint,regions);
            xssfSheet.addValidationData(data_validation_list);
            String savePath=getServletContext().getRealPath("/WEB-INF/upload");
            String xlsxName="lalaaa123.xlsx";
            xlsxName= URLDecoder.decode(xlsxName,"utf-8");

            fileOutputStream=new FileOutputStream(savePath+"/"+xlsxName);
            xssfWorkbook.write(fileOutputStream);
            fileOutputStream.close();

        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
