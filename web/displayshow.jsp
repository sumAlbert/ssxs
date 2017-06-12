<%@ page import="entity.analyse.Analyse" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.display.Display" %><%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 2017/6/11
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Analyse> analyseList=(List<Analyse>)request.getAttribute("analyse");
    List<Display> displayList=(List<Display>)request.getAttribute("displayIDOrder");
    boolean onlyChildFlag=false;
    boolean yearFlag=false;
    String isOnlyChild="100";
    String notOnlyChild="100";
    String yearInfoKey="";
    String yearInfoValue="";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0"/>
<link rel="stylesheet" type="text/css" href="./css/displayshow.css">
<body>
<div class="display-main">
    <div class="show-main">
        <div class="show-header">
            <p class="show-title">数说你想知道的华东师范大学2016年本科新生</p>
            <div class="show-delimiter1"></div>
            <p class="show-time">2017-6-2 &nbsp;&nbsp;<span>华东师范大学</span></p>
        </div>
        <div class="show-content">
            <div class="show-info">
                <p>	“很高兴遇见你”，最年轻的ECNUers！2016级华东师大本科新生入校刚满三日，彼此还很陌生？那么，让我们通过数据“动新闻”，多角度了解华东师大2016级新鲜人。</p>
            </div>
            <%
                for(int i=0;i<analyseList.size();i++) {
                    int temp;
                    Display display = displayList.get(i);
                    Analyse analyse = analyseList.get(i);
                    List<String> name=analyse.getName();
                    List<String> count=analyse.getCount_save();
                    List<String> scale=analyse.getScale_save();
                    List<String> pers=analyse.getPercent_save();
                    String info = analyse.getDisplayKindInfo();
                    switch (display.getDisplayKindId()) {
                        default:
                            break;
                        case "dd00004":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-firstname">
                        <%
                            for(int j=0;j<5;j++){
                        %>
                        <p><%=name.get(j)%></p>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                        break;
                        case "dd00001":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-againname">
                        <p><%=name.get(0)%></p>
                        <p>
                            <img src="./icon/close-yello.png">
                        </p>
                        <p><%=count.get(0)%></p>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                        break;
                        case "dd00008":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-political">
                        <p><%=name.get(0)%></p>
                        <p>
                            <img src="./icon/close-yello.png">
                        </p>
                        <p><%=count.get(0)%></p>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                        break;
                        case "dd00009":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-starts">
                        <%
                            for(int j=0;j<name.size();j++){
                        %>
                        <div class="display-starts-wrap">
                            <img src="./pic/starts/<%=analyse.startsC2E(name.get(j))%>">
                            <p><%=name.get(j)%></p>
                            <p>(<%=pers.get(j)%>)</p>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                    break;
                case "dd00002":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-blood">
                        <%
                            for(int j=0;j<name.size();j++){
                        %>
                        <div class="display-blood-wrap">
                            <p><%=name.get(j)%></p>
                            <p>(<%=pers.get(j)%>)</p>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                    break;
                case "dd00003":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-email">
                        <%

                            if(name.size()>=3){
                                temp=3;
                            }
                            else{
                                temp=name.size();
                            }
                            for(int j=0;j<temp;j++){
                        %>
                        <div class="display-email-wrap">
                            <p><%=name.get(j)%></p>
                            <p>(<%=pers.get(j)%>)</p>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                    break;
                case "dd00005":
            %>
            <div class="show-cards">
                <div class="show-kind-name">性别分布</div>
                <div class="show-cards-main">
                    <div class="display-gender">
                        <%
                            for(int j=0;j<analyse.getHundredLine(scale.get(0));j++){
                        %>
                        <div class="display-gender-wrap">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                        </div>
                        <%
                            }
                        %>
                        <div class="display-gender-wrap">
                            <%
                                for(int j=0;j<analyse.getHundredSingleLineNum(scale.get(0));j++){
                            %>
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(0))%>">
                            <%
                                }
                                for(int j=0;j<analyse.getHundredSingleAnoLineNum(scale.get(0));j++){
                            %>
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <%
                                }
                            %>
                        </div>
                        <%
                            for(int j=0;j<analyse.getHundredAnoLine(scale.get(0));j++){
                        %>
                        <div class="display-gender-wrap">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                            <img src="./pic/gender/<%=analyse.genderC2E(name.get(1))%>">
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                    break;
                case "dd00006":
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-major">
                        <%
                            for(int j=0;j<name.size();j++){
                        %>
                        <div class="display-major-wrap">
                            <img src="./pic/major_kind/<%=analyse.majorKindC2E(name.get(j))%>">
                            <p><%=name.get(j)%></p>
                            <p>(<%=pers.get(j)%>)</p>
                        </div>
                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                    break;
                case "dd00007":
                    onlyChildFlag=true;
                    if(name.get(0).equals("1")){
                        isOnlyChild=count.get(0);
                        notOnlyChild=count.get(1);
                    }
                    else{
                        isOnlyChild=count.get(1);
                        notOnlyChild=count.get(0);
                    }
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-onlyChild">
                        <div class="display-onlyChild-pie">
                            <canvas id="display-onlyChild-pie" height="150px" width="150px"></canvas>
                        </div>
                        <div class="display-onlyChild-pie-info">
                            <div class="display-onlyChild-pie-flag">
                                <span></span>&nbsp;独生子女&nbsp;<%=isOnlyChild%>
                            </div>
                            <div class="display-onlyChild-pie-flag">
                                <span></span>&nbsp;非独生子女&nbsp;<%=notOnlyChild%></div>
                        </div>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                    break;
                case "dd00010":
                    yearFlag=true;
                    Analyse yearAnalyse=new Analyse();
                    yearAnalyse.getYearInfo(analyse);
                    yearInfoKey=yearAnalyse.getResult_key();
                    yearInfoValue=yearAnalyse.getResult_value();
            %>
            <div class="show-cards">
                <div class="show-kind-name"><%=info%></div>
                <div class="show-cards-main">
                    <div class="display-year">
                        <div class="display-year-bar">
                            <canvas id="display-year-bar" height="150px" width="200px"></canvas>
                        </div>
                    </div>
                </div>
                <div class="show-cards-title"><%=display.getDisplayTitle()%></div>
                <div class="show-cards-info"><%=display.getDisplayInfo()%></div>
            </div>
            <%
                }
                }
            %>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="./js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="./js/displayshow.js"></script>
<script type="text/javascript" src="./js/Chart.js"></script>
<script type="text/javascript">
    <%
        if(onlyChildFlag){
    %>
    var onlyChild_pieData=[
        {
            value:<%=isOnlyChild%>,
            color:"#F38630"
        },
        {
            value:<%=notOnlyChild%>,
            color : "#E0E4CC"
        }
    ];
    var onlyChild_pie=new Chart(document.getElementById("display-onlyChild-pie").getContext("2d")).Pie(onlyChild_pieData);
    <%
        }
        if(yearFlag){
    %>
    var year_barData={
        labels: <%=yearInfoKey%>,
        datasets:[{
            fillColor : "#66cccc",
            strokeColor : "#99cccc",
            data : <%=yearInfoValue%>
        }]
    }
    var year_bar=new Chart(document.getElementById("display-year-bar").getContext("2d")).Bar(year_barData);
    <%
        }
    %>
</script>
</html>
