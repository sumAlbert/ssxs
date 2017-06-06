<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 2017/5/31
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ssxs</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0"/>
    <link rel="stylesheet" type="text/css" href="./css/workspace.css">
</head>
<body>
<div class="main">
    <div class="main-content">
        <div class="work-items">
            <div class="work-item work-item-active">
                <div class="work-item-icon"></div>
                <div class="work-item-label">页面模板</div>
            </div>
            <div class="work-item work-item-inactive">
                <div class="work-item-icon"></div>
                <div class="work-item-label">自定义</div>
            </div>
            <div class="work-item work-item-inactive">
                <div class="work-item-icon"></div>
                <div class="work-item-label">数据上传</div>
            </div>
            <div class="work-item work-item-inactive">
                <div class="work-item-icon"></div>
                <div class="work-item-label">保存本地</div>
            </div>
        </div>
        <div class="work-content">
            <div class="page-model work-content-item">
                <div class="page-model-labels">
                    <div class="page-model-label page-model-label-active">姓名</div>
                    <div class="page-model-label page-model-label-inactive">生源地</div>
                    <div class="page-model-label page-model-label-inactive">性别</div>
                    <div class="page-model-label page-model-label-inactive">年龄</div>
                    <div class="page-model-label page-model-label-inactive">星座</div>
                    <div class="page-model-label page-model-label-inactive">专业选择</div>
                    <div class="page-model-label page-model-label-inactive">录取分数线</div>
                    <div class="page-model-label page-model-label-inactive">高中文理科</div>
                </div>
                <div class="page-model-content">
                    <div class="page-model-content-item">
                        <div class="page-model-content-item-card">
                            <div class="page-model-content-item-img">
                                <img src="./pic/hot-firstName.png">
                            </div>
                            <div class="page-model-content-item-label">新生最热姓氏</div>
                            <div class="page-model-content-item-info">通过对新生姓名的统计，得到学校新生中出现最多姓氏</div>
                        </div>
                        <div class="page-model-content-item-card">
                            <div class="page-model-content-item-img">
                                <img src="./pic/name-again.png">
                            </div>
                            <div class="page-model-content-item-label">最重名</div>
                            <div class="page-model-content-item-info">通过对新生姓名的统计，得到学校新生出现最多次的姓名</div>
                        </div>
                    </div>
                    <div class="page-model-content-item">
                        <div class="page-model-content-item-card">
                            <div class="page-model-content-item-img">
                                <img src="./pic/cake-analyse.png">
                            </div>
                            <div class="page-model-content-item-label">生源地饼图分析</div>
                            <div class="page-model-content-item-info">通过饼状图对生源地的学生信息进行分析</div>
                        </div>
                        <div class="page-model-content-item-card">
                            <div class="page-model-content-item-img">
                                <img src="./pic/China-map.png">
                            </div>
                            <div class="page-model-content-item-label">生源地分析</div>
                            <div class="page-model-content-item-info">分析各省的生源地情况</div>
                        </div>
                    </div>
                    <div class="page-model-content-item ">
                    </div>
                    <div class="page-model-content-item ">
                    </div>
                    <div class="page-model-content-item ">
                    </div>
                    <div class="page-model-content-item ">
                    </div>
                    <div class="page-model-content-item ">
                    </div>
                    <div class="page-model-content-item ">
                    </div>
                </div>
            </div>
            <div class="diy work-content-item">
                <div class="diy-line diy-item-label">自定义数据分析</div>
                <div class="diy-line diy-items-line">
                    <div class="diy-item-left">名称</div>
                    <div class="diy-item-right">
                        <div class="diy-item-right-box input-box">
                            <input type="text" class="diy-item-name" placeholder="请输入自定义数据名称">
                        </div>
                    </div>
                </div>
                <div class="diy-line diy-items-line">
                    <div class="diy-item-left">数据源</div>
                    <div class="diy-item-right">
                        <div class="diy-item-right-box drop-down-box">
                            <div class="drop-down-left"><div>15级数据源</div></div>
                            <div class="drop-down-right triangle-box">
                                <div class="triangle"></div>
                            </div>
                        </div>
                        <div class="drop-down-items"></div>
                    </div>
                </div>
                <div class="diy-line diy-items-line">
                    <div class="diy-item-left">分析项</div>
                    <div class="diy-item-right">
                        <div class="diy-item-right-box drop-down-box">
                            <div class="drop-down-left"><div>出生月份</div></div>
                            <div class="drop-down-right triangle-box">
                                <div class="triangle"></div>
                            </div>
                        </div>
                        <div class="drop-down-items"></div>
                    </div>
                </div>
                <div class="diy-line diy-items-line">
                    <div class="diy-item-left">分析特征</div>
                    <div class="diy-item-right">
                        <div class="diy-item-right-box drop-down-box">
                            <div class="drop-down-left"><div>出现次数最多</div></div>
                            <div class="drop-down-right triangle-box">
                                <div class="triangle"></div>
                            </div>
                        </div>
                        <div class="drop-down-items"></div>
                    </div>
                </div>
                <div class="diy-line diy-items-line">
                    <div class="diy-item-left">限制项</div>
                    <div class="diy-item-right">
                        <div class="diy-item-right-box drop-down-box">
                            <div class="drop-down-left"><div>专业相同</div></div>
                            <div class="drop-down-right triangle-box">
                                <div class="triangle"></div>
                            </div>
                        </div>
                        <div class="drop-down-items"></div>
                    </div>
                </div>
            </div>
            <div class="update work-content-item">
                <div class="update-labels">
                    <div class="update-label update-label-active">待上传</div>
                    <div class="update-label update-label-inactive">已上传</div>
                </div>
                <form class="update-content update-wait" method="POST" enctype="multipart/form-data" id="excel_table" action="excelReceive.action">
                    <div class="update-content-info">华师大15级各专业</br>最多出生月份
                    </div>
                    <div class="update-buttons">
                        <div class="update-button" id="downloadExcel">下载表格</div>
                        <div class="update-button"><input type="file" name="excel_input" id="excel_input" onchange="excelSubmit()">上传数据</div>
                    </div>
                </form>
                <div class="update-content update-finish"></div>
            </div>
            <div class="save-local work-content-item"></div>
        </div>
        <div class="work-display">
            <div class="work-display-model-default">
                <img src="./pic/work-model-default.png">
            </div>
            <div class="work-display-model"></div>
        </div>
        <div class="work-buttons">
            <div class="button-list">
                <div class="button">
                    <div class="button-img"></div>
                    <div class="button-label">撤销</div>
                </div>
                <div class="button">
                    <div class="button-img"></div>
                    <div class="button-label">重做</div>
                </div>
                <div class="button">
                    <div class="button-img"></div>
                    <div class="button-label">退出</div>
                </div>
                <div class="button">
                    <div class="button-img"></div>
                    <div class="button-label">设置</div>
                </div>
            </div>
        </div>
    </div>
    <div class="main-cloth">
        <div class="wait">
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="./js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="./js/workspace.js"></script>
</html>