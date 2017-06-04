package excelhandler.excelentity;

/**
 * Created by dell2 on 2017/6/4.
 */
public class ExcelColumn {
    /**
     * int kind------------------------格式：1-下拉列表，2-普通文本
     * int length----------------------单元格长度
     * String[] itemList---------------下拉菜单选项
     */
    private int kind;
    private String[] itemList;
    private int length;

    /**set函数*/
    public void setKind(int kind){
        this.kind=kind;
    }
    public void setItemList(String[] itemList){
        this.itemList=itemList;
    }
    public void setLength(int length){
        this.length=length;
    }
    /**get函数*/
    public String[] getItemList(){
        return this.itemList;
    }
    public int getKind(){
        return this.kind;
    }
    public int getLength(){
        return this.length;
    }
}
