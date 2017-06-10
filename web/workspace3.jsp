<%@ page import="entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="excelhandler.excelentity.ExcelColumnNameArr" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 2017/6/10
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Student> students=(ArrayList<Student>)request.getAttribute("students");
    List<String> displayList=students.get(0).getDisplayList();
    ExcelColumnNameArr excelColumnNameArr=new ExcelColumnNameArr();
%>
<!DOCTYPE html>
<html>
<head>
    <title>ssxs</title>
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0"/>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="./css/workspace3.css">
    <script type="text/javascript" src="./js/jquery-3.2.0.min.js"></script>
    <script type="text/javascript" src="./js/workspace3.js"></script>
</head>
<body>
<div class="main-hidden">
    <div class="panel-filter">
        <div class="panel-filter-header">
            <div class="panel-filter-name">数据筛选</div>
            <div class="panel-filter-close"></div>
        </div>
        <div class="panel-filter-content">
            <div class="input-line">
                <div class="input-list">
                    <input type="text" class="input-list-item">
                    <input type="text" class="input-list-item" value="=">
                    <input type="text" class="input-list-item">
                </div>
                <div class="input-close"></div>
            </div>
            <div class="input-line-control">
                <div class="input-line-add"></div>添加搜索条件
            </div>
        </div>
        <div class="panel-filter-verify">
            <div class="panel-filter-button">确认</div>
        </div>
    </div>
</div>
<div class="main">
    <div class="table-list">
        <div class="table-list-box">
            <div class="table-button">重新导入</div>
            <div class="table-infos">
                <div class="table-info table-info-active">
                    <div class="table-name">student</div>
                    <div class="table-count"><s:property value="studentCountTotal"></s:property></div>
                </div>
                <div class="table-info">
                    <div class="table-name">major</div>
                    <div class="table-count"><s:property value="majorCountTotal"></s:property></div>
                </div>
            </div>
            <div class="table-button-control">控制台</div>
            <div class="table-button">返回</div>
        </div>
    </div>
    <div class="workspace">
        <div class="workspace-menu">
            <div class="menu-button-list-left">
                <div class="menu-button">添加列</div><!--
				--><div class="menu-button">删除列</div><!--
				--><div class="menu-button" id="menu-button-filter">筛选</div>
            </div>
            <div class="menu-right">
                <input type="text" name="">条/页
            </div>
        </div>
        <div class="workspace-content">
            <div class="excel-main">
                <div class="excel-header">
                    <div class="excel-header-cell excel-header-cell-0" style="min-width: 30px;max-width: 30px"></div>
                    <s:iterator value='students' id="st" status="st_status" begin="0" end="0">
                        <s:iterator value="#st.getDisplayList()" id="st_al" status="st_al_status">
                            <div class="excel-header-cell">
                                <s:property value="#st_al"></s:property>
                            </div>
                        </s:iterator>
                    </s:iterator>
                </div>
                <div class="excel-content">
                <%
                    for(int i=0;i<students.size();i++){
                    Student student=students.get(i);
                    String stuID=student.getStuID();
                %>
                    <div class="excel-line">
                        <div class="hidden-info"><%=stuID%></div>
                        <div class="excel-cell excel-cell-0" style="min-width: 30px;max-width: 30px">
                            <input type="checkbox" name="">
                        </div>
                        <%
                            for(int j=0;j<displayList.size();j++){
                                String e=excelColumnNameArr.getC2E().get(displayList.get(j));
                                Map<String,String> initMap=student.getInitMap();
                                String e_data=initMap.get(e);
                        %>
                        <div class="excel-cell">
                            <div class="hidden-info"><%=e%></div>
                            <input type="text" name="" value='<%=e_data%>' readonly>
                        </div>
                        <%
                            }
                        %>
                    </div>
                <%
                    }
                %>
                </div>
            </div>
        </div>
        <div class="workspace-pick">
            <div class="pick-left">
                <div class="pick-left-button">修改</div>
            </div>
            <div class="pick-middle">
                <input type="text" name="">页/1000页
            </div>
            <div class="pick-right">
                <div class="pick-button">上一页</div><!--
				--><div class="pick-button">下一页</div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
