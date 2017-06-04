package excelhandler.excelentity;

/**
 * Created by dell2 on 2017/6/4.
 */
public class ExcelColumn {
    /**
     * int kind------------------------格式：1-下拉列表，2-普通文本,3-日期
     * int length----------------------单元格长度
     * String[] itemList---------------下拉菜单选项
     */
    public static final int ST_LENGTH=2800;
    public static final int LA_LENGTH=3500;
    private int kind;
    private String[] itemList;
    private int length;
    private String name;

    public ExcelColumn(String name){
        this.name=name;
        this.kind=2;
        this.itemList=null;
        this.length=ST_LENGTH;
    }
    public ExcelColumn(String name,int kind){
        this.name=name;
        this.kind=kind;
        this.length=ST_LENGTH;
        this.itemList=null;
    }
    public ExcelColumn(String name,int kind,int length){
        this.name=name;
        this.kind=kind;
        this.length=length;
        this.itemList=null;
    }
    public ExcelColumn(String name,int kind,String[] itemList){
        this.name=name;
        this.kind=kind;
        this.length=ST_LENGTH;
        this.itemList=itemList;
    }
    public ExcelColumn(String name,int kind,int length,String[] itemList){
        this.name=name;
        this.kind=kind;
        this.length=length;
        this.itemList=itemList;
    }
    /**set函数*/
    public void setName(String name){
        this.name=name;
    }
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
    public String getName(){
        return this.name;
    }
}
