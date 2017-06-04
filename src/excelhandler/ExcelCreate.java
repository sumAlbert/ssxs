package excelhandler;

import excelhandler.excelentity.ExcelColumn;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;

import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 * Created by dell2 on 2017/6/3.
 */
public class ExcelCreate {
    private FileOutputStream fileOutputStream=null;
    private ArrayList<ExcelColumn> ALEC;
    private String name;
    private XSSFWorkbook xssfWorkbook;
    private XSSFSheet xssfSheet;
    public ExcelCreate(String name,ArrayList<ExcelColumn> ALEC){
        this.name=name;
        this.ALEC=ALEC;
    }
    public String create(){
        try{
            xssfWorkbook=new XSSFWorkbook();
            xssfSheet=xssfWorkbook.createSheet("sheet1");
            setStyle();
            setColumnHeader();
//            CellStyle cellStyle = xssfWorkbook.createCellStyle();
//            DataFormat format = xssfWorkbook.createDataFormat();
//            cellStyle.setDataFormat(format.getFormat("@"));

//            xssfSheet.setColumnWidth(0,3000);
//            xssfSheet.setDefaultColumnStyle(0, cellStyle);
//            xssfSheet.setColumnWidth(1,3000);
//            xssfSheet.setDefaultColumnStyle(1, cellStyle);

//            XSSFDataValidationConstraint constraint =new XSSFDataValidationConstraint(strings);
//            CellRangeAddressList regions = new CellRangeAddressList(3, 30000, 4, 6);
//            DataValidationHelper help = new XSSFDataValidationHelper((XSSFSheet)xssfSheet);
//            DataValidation data_validation_list = help.createValidation(constraint,regions);
//            xssfSheet.addValidationData(data_validation_list);
            String savePath=getServletContext().getRealPath("/download");
            name= URLDecoder.decode(name,"utf-8");
            fileOutputStream=new FileOutputStream(savePath+"/"+name);
            xssfWorkbook.write(fileOutputStream);
            fileOutputStream.close();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return "true";
    }
    public void setColumnHeader(){
        XSSFRow xssfRow=xssfSheet.createRow(0);
        for(int i=0;i<ALEC.size();i++){
            ExcelColumn excelColumn=ALEC.get(i);
            XSSFCell xssfCell=xssfRow.createCell(i);
            xssfCell.setCellValue(excelColumn.getName());
        }
    }
    public void setStyle(){
        CellStyle cellStyle = xssfWorkbook.createCellStyle();
        DataFormat format = xssfWorkbook.createDataFormat();
        for(int i=0;i<ALEC.size();i++){
            ExcelColumn excelColumn=ALEC.get(i);
            switch (excelColumn.getKind()){
                case 1:
                    String[] strings=excelColumn.getItemList();
                    XSSFDataValidationConstraint constraint =new XSSFDataValidationConstraint(strings);
                    CellRangeAddressList regions = new CellRangeAddressList(1, 30000,i,i);
                    DataValidationHelper help = new XSSFDataValidationHelper((XSSFSheet)xssfSheet);
                    DataValidation data_validation_list = help.createValidation(constraint,regions);
                    xssfSheet.addValidationData(data_validation_list);
                    break;
                case 2:
                    cellStyle.setDataFormat(format.getFormat("@"));
                    xssfSheet.setColumnWidth(i,excelColumn.getLength());
                    xssfSheet.setDefaultColumnStyle(i, cellStyle);
                    break;
                case 3:
                    cellStyle.setDataFormat(format.getFormat("yyyy-MM-dd"));
                    xssfSheet.setColumnWidth(i,excelColumn.getLength());
                    xssfSheet.setDefaultColumnStyle(i, cellStyle);
                    break;
                default:
                    break;
            }
        }
    }
}

