package excelhandler.excelaction;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

/**
 * Created by dell2 on 2017/6/6.
 */
public class ExcelReceiveAction extends ActionSupport {
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        DiskFileItemFactory factory = new DiskFileItemFactory();
        return SUCCESS;
    }
}
