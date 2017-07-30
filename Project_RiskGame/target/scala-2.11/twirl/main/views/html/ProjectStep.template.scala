
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ProjectStep_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class ProjectStep extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.InitialGameStat,play.twirl.api.HtmlFormat.Appendable] {

  /*(hm: Map[models.Phase, List[models.ProjectStep]])*/
  def apply/*2.2*/(model: models.InitialGameStat):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.33*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Project Steps</title>
        <link rel="shortcut icon" href="">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" hredef="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        """),format.raw/*12.114*/("""
        """),format.raw/*13.9*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*15.101*/("""" />
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*16.72*/("""" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.at("stylesheets/demo.css")),format.raw/*17.95*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.at("stylesheets/style.css")),format.raw/*18.96*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.55*/routes/*19.61*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*19.105*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*20.55*/routes/*20.61*/.Assets.at("stylesheets/flipclock.css")),format.raw/*20.100*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*21.55*/routes/*21.61*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*21.101*/("""" />
        """),format.raw/*22.112*/("""
        """),format.raw/*23.9*/("""<script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*23.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("javascripts/flipclock.js")),format.raw/*24.67*/(""""></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.at("javascripts/html2canvas.js")),format.raw/*25.69*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.at("javascripts/html2canvas.svg.js")),format.raw/*26.73*/(""""></script>
        <script type="text/javascript" charset="utf-8" src=""""),_display_(/*27.62*/routes/*27.68*/.Application.gameJs()),format.raw/*27.89*/(""""></script>
        """),format.raw/*28.117*/("""
        """),format.raw/*29.111*/("""
        """),format.raw/*30.9*/("""<style type="text/css">

        .container > header """),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""
            """),format.raw/*33.13*/("""padding: 0px 0px 0px 0px !important;

        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""

        """),format.raw/*37.9*/("""td """),format.raw/*37.12*/("""{"""),format.raw/*37.13*/("""
            """),format.raw/*38.13*/("""padding-right: 20px;
            padding-bottom: 20px;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""

        """),format.raw/*42.9*/(""".ProjectStepStyle"""),format.raw/*42.26*/("""{"""),format.raw/*42.27*/("""
            """),format.raw/*43.13*/("""background: #F25827;
            border-color:#F05C2B;
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/("""

        """),format.raw/*47.9*/(""".sweet-alert """),format.raw/*47.22*/("""{"""),format.raw/*47.23*/("""
            """),format.raw/*48.13*/("""position: absolute;
            height:200px;
            width: 230px;
            top:410px;
            left:277px;"""),format.raw/*52.24*/("""}"""),format.raw/*52.25*/("""

        """),format.raw/*54.9*/(""".ProjectStepStyle:hover,
        .ProjectStepStyle:focus,
        .ProjectStepStyle:active,
        .ProjectStepStyle.active """),format.raw/*57.34*/("""{"""),format.raw/*57.35*/("""
            """),format.raw/*58.13*/("""background: #F53C00 !important;
            border-color:#F53C00 !important;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""
        """),format.raw/*61.9*/(""".ProjectStepStyle:active,
        .ProjectStepStyle.active """),format.raw/*62.34*/("""{"""),format.raw/*62.35*/("""
            """),format.raw/*63.13*/("""background: #F53C00 !important;
            border-color:#F53C00 !important;
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/("""

        """),format.raw/*67.9*/(""".ProjectStepStyle.disabled,
        .ProjectStepStyle[disabled]"""),format.raw/*68.36*/("""{"""),format.raw/*68.37*/("""
            """),format.raw/*69.13*/("""background: #595a5b !important;
            border-color:#595a5b !important;
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""

        """),format.raw/*73.9*/(""":disabled """),format.raw/*73.19*/("""{"""),format.raw/*73.20*/("""
            """),format.raw/*74.13*/("""background: #595a5b !important;
            border-color:#595a5b !important;
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""
        """),format.raw/*77.9*/("""hr """),format.raw/*77.12*/("""{"""),format.raw/*77.13*/("""
  """),format.raw/*78.3*/("""margin-top: 7px;
  margin-bottom: 2px;
  border: 0;
  border-top: 1px solid #eeeeee;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""




        """),format.raw/*87.9*/(""".stepStyle"""),format.raw/*87.19*/("""{"""),format.raw/*87.20*/("""
            """),format.raw/*88.13*/("""/* BUTTON STYLING */
            border-top: 1px solid #fff;
            box-shadow: 0 5px 8px #002851, 0 8px 0 #002851, -2px 1px 0 #003872, 2px 1px 0 #003872, 0px 8px 10px #000, 0 10px 30px #1b1b1b;
            /*background: red;*/
            /* FONT STYLING */

            text-decoration: none;
            color: #14467a;
            font-weight: bold;
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/("""
        """),format.raw/*98.9*/(""".stepStyle:hover"""),format.raw/*98.25*/("""{"""),format.raw/*98.26*/("""
            """),format.raw/*99.13*/("""/* BUTTON SHADOW */
            box-shadow: 0 6px 6px #002851, 0 6px 0 #002851, -1px 0px 0 #003872, 0px 0px 0 #003872, 0px 7px 8px #000, 0 7px 20px #1b1b1b;
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""
        """),format.raw/*102.9*/("""/* BLUE GRADIENT ON BUTTON */
        .grad """),format.raw/*103.15*/("""{"""),format.raw/*103.16*/("""
            """),format.raw/*104.13*/("""background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(114,184,255,1)), color-stop(100%,rgba(64,150,238,1)));
            background: linear-gradient(to bottom, rgba(114,184,255,1) 0%,rgba(64,150,238,1) 100%);
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/("""

        """),format.raw/*108.9*/("""/* ANIMATE THE BUTTON */
        .transition,
        .transition:hover,
        """),format.raw/*111.9*/("""{"""),format.raw/*111.10*/("""
            """),format.raw/*112.13*/("""-webkit-transition: all 0.3s ease-in-out;
            -moz-transition: all 0.3s ease-in-out;
            -o-transition: all 0.3s ease-in-out;
            transition: all 0.3s ease-in-out;
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/("""

        """),format.raw/*118.9*/(""".highlight """),format.raw/*118.20*/("""{"""),format.raw/*118.21*/("""
            """),format.raw/*119.13*/("""position: relative;
            margin: -200px auto 0 auto;
            width: 500px;
            height: 400px;
            opacity: 0.4;
            background: -moz-radial-gradient(top, ellipse cover, rgba(255,255,255,1) 0%, rgba(255,255,255,0) 100%);
            background: -webkit-gradient(radial, top top, 0px, center center, 100%, color-stop(0%,rgba(255,255,255,1)), color-stop(100%,rgba(255,255,255,0)));
            background: -webkit-radial-gradient(top, ellipse cover, rgba(255,255,255,0.3) 0px,rgba(255,255,255,0) 275px);
        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/("""
        """),format.raw/*128.9*/(""".phaseStyle"""),format.raw/*128.20*/("""{"""),format.raw/*128.21*/("""
            """),format.raw/*129.13*/("""/* BUTTON STYLING */
            border-top: 1px solid #fff;
            box-shadow: 0 5px 8px #EDBF5C, 0 8px 0 #EDBF5C, -2px 1px 0 #EDBF5C, 2px 1px 0 #EDBF5C, 0px 8px 10px #000, 0 10px 30px #EDBF5C;

            /* FONT STYLING */

            text-decoration: none;
            color: #14467a;
            font-weight: bold;
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/("""

        """),format.raw/*140.9*/(""".phaseStyle:hover"""),format.raw/*140.26*/("""{"""),format.raw/*140.27*/("""
            """),format.raw/*141.13*/("""/* BUTTON SHADOW */
            color: #ffffff;
            box-shadow: 0 6px 6px #EDBF5C, 0 6px 0 #EDBF5C, -1px 0px 0 #EDBF5C, 0px 0px 0 #EDBF5C, 0px 7px 8px #000, 0 7px 20px #EDBF5C;
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/("""
        """),format.raw/*145.9*/(""".modalHeader"""),format.raw/*145.21*/("""{"""),format.raw/*145.22*/("""
            """),format.raw/*146.13*/("""background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(114,184,255,1)), color-stop(100%,rgba(64,150,238,1)));
            background: linear-gradient(to bottom, rgba(114,184,255,1) 0%,rgba(64,150,238,1) 100%);
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/("""




        """),format.raw/*153.9*/("""</style>


    </head>
    <script>


            function myfunc() """),format.raw/*160.31*/("""{"""),format.raw/*160.32*/("""

                """),format.raw/*162.17*/("""alert("aaaaaaaa");
            """),format.raw/*163.13*/("""}"""),format.raw/*163.14*/("""
            """),format.raw/*164.13*/("""var lastclickedTab;

            function onProjectStepTabClick()"""),format.raw/*166.45*/("""{"""),format.raw/*166.46*/("""

                """),format.raw/*168.17*/("""lastclickedTab="projectStep";
            """),format.raw/*169.13*/("""}"""),format.raw/*169.14*/("""
            """),format.raw/*170.13*/("""function onRiskDashboardClick()"""),format.raw/*170.44*/("""{"""),format.raw/*170.45*/("""
                """),format.raw/*171.17*/("""lastclickedTab="riskDashboard";
                $.ajax("""),format.raw/*172.24*/("""{"""),format.raw/*172.25*/("""
                    """),format.raw/*173.21*/("""type: 'POST',
                    url: '"""),_display_(/*174.28*/routes/*174.34*/.GameController.getRiskCards()),format.raw/*174.64*/("""',
//                     data : '',
                    data: JSON.stringify(''),
                    // dataType: 'json',
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*179.46*/("""{"""),format.raw/*179.47*/("""
"""),format.raw/*180.1*/("""//                        alert(data);
                        var result = " ";
                        $("#grid-basic tbody") .empty();
                        var firstRisk=data[0].riskId;
                        for (i = 0; i < data.length; i++) """),format.raw/*184.59*/("""{"""),format.raw/*184.60*/("""

                            """),format.raw/*186.29*/("""var obj = data[i];
//                            obj.isComplete = obj.isComplete === 'false' ? "Not Completed" : "Completed";
                            var isCompleted="";
                            var isDisabled="";
//                            alert(obj.budget+" "+obj.personnel);
                            if(obj.complete)"""),format.raw/*191.45*/("""{"""),format.raw/*191.46*/("""
"""),format.raw/*192.1*/("""//                                alert('object is true')
                                isCompleted="Completed"
                                isDisabled="disabled='true'";
                            """),format.raw/*195.29*/("""}"""),format.raw/*195.30*/("""else"""),format.raw/*195.34*/("""{"""),format.raw/*195.35*/("""
                                """),format.raw/*196.33*/("""isCompleted="Pending"
                            """),format.raw/*197.29*/("""}"""),format.raw/*197.30*/("""



                            """),format.raw/*201.29*/("""var eligibleBudget=0;
                            var eligibleCapabilityBonus=0;
                            var eligibleCapabilityPoints=0;
                            var eligiblePersonnelRemaining=0;
////                            alert('hereee');
                            eligibleBudget= parseInt(document.getElementById('budgetremaining').innerHTML) - obj.budget;
                            eligibleCapabilityBonus= parseInt(document.getElementById('capabilitybonus').innerHTML) + obj.capabilityBonus;
                            eligibleCapabilityPoints= parseInt(document.getElementById('capabilitypoints').innerHTML) + obj.capabilityPoints;
                            eligiblePersonnelRemaining= parseInt(document.getElementById('personnelremaining').innerHTML) - obj.personnel;

//                            alert(eligibleBudget+" "+eligiblePersonnelRemaining);
////
                            var setClassColor;
                            var buttonDisable;
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*215.81*/("""{"""),format.raw/*215.82*/("""
                                """),format.raw/*216.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*219.29*/("""}"""),format.raw/*219.30*/("""else"""),format.raw/*219.34*/("""{"""),format.raw/*219.35*/("""
                                """),format.raw/*220.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*222.29*/("""}"""),format.raw/*222.30*/("""
"""),format.raw/*223.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);




//                            result=result+"<button id='"+obj.riskId+"' onclick='onRiskClick(id)'>"+obj.riskDescription+"</button><br/>";

                            appendquery = "<tr><td>" + obj.riskId + "</td><td style='text-align:left'><a id='"+obj.riskId+"' href='#' onclick='onRiskClick(id)' >"+obj.riskDescription+"</a></td><td>" + isCompleted + "</td>" +
                                    "<td><button "+isDisabled+"" +
                                    "  class='open-riskDialog btn btn-warning' href='#riskDialog'" +
                                    "data-toggle='modal' "+
                                    " data-buttondisable='"+buttonDisable+"'" +
                                    "data-risk='" + obj.riskId +
                                    "' data-budget='Budget:' data-budgetvalue='" + obj.budget +
                                    "' data-personnel='Personnel:' data-personnelvalue='" + obj.personnel +
                                    "' " +
//                                    "onclick=onMitigateRisk('"+obj.riskId+"')" +
                                    ">Mitigate</button></td></tr>";
                            $("#grid-basic tbody").append(appendquery);

                        """),format.raw/*246.25*/("""}"""),format.raw/*246.26*/("""
                        """),format.raw/*247.25*/("""document.getElementById('risks').innerHTML = result;
                        onRiskClick(firstRisk);
                    """),format.raw/*249.21*/("""}"""),format.raw/*249.22*/(""",
                    error: function (data) """),format.raw/*250.44*/("""{"""),format.raw/*250.45*/("""
                        """),format.raw/*251.25*/("""alert("error");
                        //setError('Make call failed');
                    """),format.raw/*253.21*/("""}"""),format.raw/*253.22*/("""
                """),format.raw/*254.17*/("""}"""),format.raw/*254.18*/(""");

            """),format.raw/*256.13*/("""}"""),format.raw/*256.14*/("""

            """),format.raw/*258.13*/("""$(document).on("click", ".open-riskDialog", function () """),format.raw/*258.69*/("""{"""),format.raw/*258.70*/("""
             """),format.raw/*259.14*/("""//   alert($(this).data('risk'));

//                var title = $(this).data('title');

                var riskId=$(this).data('risk');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*269.42*/("""{"""),format.raw/*269.43*/("""
                    """),format.raw/*270.21*/("""document.getElementById("isRiskDisabled").innerHTML="You don't have enough resources to mitigate this risk!";
                """),format.raw/*271.17*/("""}"""),format.raw/*271.18*/("""else"""),format.raw/*271.22*/("""{"""),format.raw/*271.23*/("""
                    """),format.raw/*272.21*/("""document.getElementById("isRiskDisabled").innerHTML="";
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/("""
                """),format.raw/*274.17*/("""var projectStepId = $(this).data('id');
//                $(".perform-risk").attr("id",projectStepId);
                $(".perform-risk").attr("disabled",buttonDisabled);
//                alert(buttonDisabled);


                $(".perform-risk").attr("id",riskId);
                $("#RiskBudget").text(budget);
                $("#RiskBudgetValue").text(budgetValue);
                $("#riskwindowtitle").text(riskId);
                $("#RiskPersonnel").text(personnel);
                $("#RiskPersonnelValue").text(personnelValue);
//                $("#ProjectStepId").val(projectStepId);
//                alert("<button id='"+projectStepId+"' class='btn btn-success perform-step'  style='margin-bottom: 20px' onclick='onPerformStep("+"\""+projectStepId+"\""+")' >Perform this Step</button>");
//


            """),format.raw/*291.13*/("""}"""),format.raw/*291.14*/(""");

            function onMitigateRisk(id)"""),format.raw/*293.40*/("""{"""),format.raw/*293.41*/("""
"""),format.raw/*294.1*/("""//                alert(id);
                onRiskClick(id);
                onPerformStep(id);

                $('#btnMitigateRisk').val(id);
                $('#btnMitigateRisk').trigger('click');
            """),format.raw/*300.13*/("""}"""),format.raw/*300.14*/("""


            """),format.raw/*303.13*/("""var riskClicked="";
            var totalSteps=0;
            var stepsDone=0;
            var onlyPlanning=true;
            function onRiskClick(id)"""),format.raw/*307.37*/("""{"""),format.raw/*307.38*/("""
"""),format.raw/*308.1*/("""//                alert("fghjh "+id);
                riskClicked=id;
                var obj = """),format.raw/*310.27*/("""{"""),format.raw/*310.28*/("""
                    """),format.raw/*311.21*/("""'riskid': id
                """),format.raw/*312.17*/("""}"""),format.raw/*312.18*/("""
                """),format.raw/*313.17*/("""$.ajax("""),format.raw/*313.24*/("""{"""),format.raw/*313.25*/("""
                    """),format.raw/*314.21*/("""type: 'POST',
                    url: '"""),_display_(/*315.28*/routes/*315.34*/.GameController.getMitigationSteps()),format.raw/*315.70*/("""',
//                     data : '',
                    data: JSON.stringify(obj),
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*319.46*/("""{"""),format.raw/*319.47*/("""

                        """),format.raw/*321.25*/("""totalSteps=data.length;
                        stepsDone=0;
                        var result = "";
                        for (i = 0; i < data.length; i++) """),format.raw/*324.59*/("""{"""),format.raw/*324.60*/("""
                            """),format.raw/*325.29*/("""var obj = data[i];

                            var status;
                            if(obj.status)"""),format.raw/*328.43*/("""{"""),format.raw/*328.44*/("""
                                """),format.raw/*329.33*/("""stepsDone++;
                                obj.status="disabled='true'";
                            """),format.raw/*331.29*/("""}"""),format.raw/*331.30*/("""

"""),format.raw/*333.1*/("""//                                result= result+"<h1>"+obj.projectStepName+"</h1>";
//                            alert();


                            var eligibleBudget=0;
                            var eligibleCapabilityBonus=0;
                            var eligibleCapabilityPoints=0;
                            var eligiblePersonnelRemaining=0;
////                            alert('hereee');
                            eligibleBudget= parseInt(document.getElementById('budgetremaining').innerHTML) - obj.budget;
                            eligibleCapabilityBonus= parseInt(document.getElementById('capabilitybonus').innerHTML) + obj.capabilityBonus;
                            eligibleCapabilityPoints= parseInt(document.getElementById('capabilitypoints').innerHTML) + obj.capabilityPoints;
                            eligiblePersonnelRemaining= parseInt(document.getElementById('personnelremaining').innerHTML) - obj.personnel;

//                            alert(eligibleBudget+" "+eligiblePersonnelRemaining);
////
                            var setClassColor;
                            var buttonDisable;
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*351.81*/("""{"""),format.raw/*351.82*/("""
                                """),format.raw/*352.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*355.29*/("""}"""),format.raw/*355.30*/("""else"""),format.raw/*355.34*/("""{"""),format.raw/*355.35*/("""
                                """),format.raw/*356.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*358.29*/("""}"""),format.raw/*358.30*/("""
"""),format.raw/*359.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);
                            if(onlyPlanning)"""),format.raw/*363.45*/("""{"""),format.raw/*363.46*/("""
                                """),format.raw/*364.33*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*364.62*/("""{"""),format.raw/*364.63*/("""
                                    """),format.raw/*365.37*/("""result = result + "<button " +
                                            " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                            " style='white-space: normal;height:55px; ' " +
                                            " class='open-EditTodo col-md-3 btn btn-success "+setClassColor+"'" +
                                            " data-toggle='modal' " +obj.status+
                                            " data-buttondisable='"+buttonDisable+"'" +
                                            "data-title='" + obj.projectStepName +
                                            "'data-id='" + obj.projectStepId +
                                            "'data-budget='Budget:' data-budgetvalue='" + obj.budget +
                                            "'data-capabilitypoints='Capability Points:' data-capabilitypointsvalue='" + obj.capabilityPoints +
                                            "'data-personnel='Personnel:' data-personnelvalue='" + obj.personnel +
                                            "'data-capabilitybonus='Capability Bonus:' data-capabilitybonusvalue='" + obj.capabilityBonus +
                                            "'data-level='Level:' data-levelvalue='" + obj.level +
                                            "'data-id='" + obj.projectStepId +
                                            "'" +
//                                            "data-todo='"""),format.raw/*380.59*/("""{"""),format.raw/*380.60*/("""'id':12,'todo':'xyz'"""),format.raw/*380.80*/("""}"""),format.raw/*380.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*385.33*/("""}"""),format.raw/*385.34*/("""else"""),format.raw/*385.38*/("""{"""),format.raw/*385.39*/("""
                                    """),format.raw/*386.37*/("""result = result + "<button disabled" +
                                            " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                            " style='white-space: normal;height:55px; ' " +
                                            " class='open-EditTodo col-md-3 btn btn-success "+setClassColor+"'" +
                                            " data-toggle='modal' " +obj.status+
                                            " data-buttondisable='"+buttonDisable+"'" +
                                            "data-title='" + obj.projectStepName +
                                            "'data-id='" + obj.projectStepId +
                                            "'data-budget='Budget:' data-budgetvalue='" + obj.budget +
                                            "'data-capabilitypoints='Capability Points:' data-capabilitypointsvalue='" + obj.capabilityPoints +
                                            "'data-personnel='Personnel:' data-personnelvalue='" + obj.personnel +
                                            "'data-capabilitybonus='Capability Bonus:' data-capabilitybonusvalue='" + obj.capabilityBonus +
                                            "'data-level='Level:' data-levelvalue='" + obj.level +
                                            "'data-id='" + obj.projectStepId +
                                            "'" +
//                                            "data-todo='"""),format.raw/*401.59*/("""{"""),format.raw/*401.60*/("""'id':12,'todo':'xyz'"""),format.raw/*401.80*/("""}"""),format.raw/*401.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*406.33*/("""}"""),format.raw/*406.34*/("""


                            """),format.raw/*409.29*/("""}"""),format.raw/*409.30*/("""else"""),format.raw/*409.34*/("""{"""),format.raw/*409.35*/("""
                                """),format.raw/*410.33*/("""result = result + "<button " +
                                        " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                        " style='white-space: normal;height:55px; ' " +
                                        " class='open-EditTodo col-md-3 btn btn-success "+setClassColor+"'" +
                                        " data-toggle='modal' " +obj.status+
                                        " data-buttondisable='"+buttonDisable+"'" +
                                        "data-title='" + obj.projectStepName +
                                        "'data-id='" + obj.projectStepId +
                                        "'data-budget='Budget:' data-budgetvalue='" + obj.budget +
                                        "'data-capabilitypoints='Capability Points:' data-capabilitypointsvalue='" + obj.capabilityPoints +
                                        "'data-personnel='Personnel:' data-personnelvalue='" + obj.personnel +
                                        "'data-capabilitybonus='Capability Bonus:' data-capabilitybonusvalue='" + obj.capabilityBonus +
                                        "'data-level='Level:' data-levelvalue='" + obj.level +
                                        "'data-id='" + obj.projectStepId +
                                        "'" +
//                                            "data-todo='"""),format.raw/*425.59*/("""{"""),format.raw/*425.60*/("""'id':12,'todo':'xyz'"""),format.raw/*425.80*/("""}"""),format.raw/*425.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button>";
//
                            """),format.raw/*430.29*/("""}"""),format.raw/*430.30*/("""


                        """),format.raw/*433.25*/("""}"""),format.raw/*433.26*/("""
"""),format.raw/*434.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*438.21*/("""}"""),format.raw/*438.22*/(""",
                    error: function (data) """),format.raw/*439.44*/("""{"""),format.raw/*439.45*/("""
                        """),format.raw/*440.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*442.21*/("""}"""),format.raw/*442.22*/("""
                """),format.raw/*443.17*/("""}"""),format.raw/*443.18*/(""");

            """),format.raw/*445.13*/("""}"""),format.raw/*445.14*/("""


            """),format.raw/*448.13*/("""function onPerformStep(id)"""),format.raw/*448.39*/("""{"""),format.raw/*448.40*/("""

"""),format.raw/*450.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*454.43*/("""{"""),format.raw/*454.44*/("""
                    """),format.raw/*455.21*/("""var obj = """),format.raw/*455.31*/("""{"""),format.raw/*455.32*/("""
                        """),format.raw/*456.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*458.35*/model/*458.40*/.getGameId),format.raw/*458.50*/(""",
                        'skipturn':'false',
                        'isProduction':isProduction,
                        'riskmitigatedcount': parseInt($('#txtRisk').val()),
                        'oneturn':document.getElementById('oneTurn').innerHTML,
                        'twoturn':document.getElementById('twoTurn').innerHTML,
                        'type': 'production',
                        'budget': document.getElementById('budgetremaining').innerHTML,
                        'capabilitybonus': document.getElementById('capabilitybonus').innerHTML,
                        'capabilitypoints': document.getElementById('capabilitypoints').innerHTML,
                        'personnel' :document.getElementById('personnelremaining').innerHTML,
                        'turnno': document.getElementById('turnNo').innerHTML,
                        'timetaken': 3,
                        'performedsteps': 0,
                        'totalsteps':totalSteps
                    """),format.raw/*473.21*/("""}"""),format.raw/*473.22*/(""";
                """),format.raw/*474.17*/("""}"""),format.raw/*474.18*/("""

                """),format.raw/*476.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*476.77*/("""{"""),format.raw/*476.78*/("""
"""),format.raw/*477.1*/("""//                    alert(id);
                    var obj = """),format.raw/*478.31*/("""{"""),format.raw/*478.32*/("""
                        """),format.raw/*479.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*481.35*/model/*481.40*/.getGameId),format.raw/*481.50*/(""",
                        'skipturn':'true',
                        'isProduction':isProduction,
                        'riskmitigatedcount': parseInt($('#txtRisk').val()),
                        'oneturn':document.getElementById('oneTurn').innerHTML,
                        'twoturn':document.getElementById('twoTurn').innerHTML,
                        'type': 'skipstep',
                        'budget': document.getElementById('budgetremaining').innerHTML,
                        'capabilitybonus': document.getElementById('capabilitybonus').innerHTML,
                        'capabilitypoints': document.getElementById('capabilitypoints').innerHTML,
                        'personnel' :document.getElementById('personnelremaining').innerHTML,
                        'turnno': document.getElementById('turnNo').innerHTML,
                        'timetaken': 3,
                        'performedsteps': 0,
                        'totalsteps':totalSteps
                    """),format.raw/*496.21*/("""}"""),format.raw/*496.22*/(""";
                """),format.raw/*497.17*/("""}"""),format.raw/*497.18*/("""

                """),format.raw/*499.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*499.49*/("""{"""),format.raw/*499.50*/("""
"""),format.raw/*500.1*/("""//                    alert(id);
                    var obj = """),format.raw/*501.31*/("""{"""),format.raw/*501.32*/("""
                        """),format.raw/*502.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*504.35*/model/*504.40*/.getGameId),format.raw/*504.50*/(""",
                        'skipturn':'false',
                        'isProduction':isProduction,
                        'riskmitigatedcount': parseInt($('#txtRisk').val()),
                        'oneturn':document.getElementById('oneTurn').innerHTML,
                        'twoturn':document.getElementById('twoTurn').innerHTML,
                        'type': 'risk',
                        'budget': document.getElementById('budgetremaining').innerHTML,
                        'capabilitybonus': document.getElementById('capabilitybonus').innerHTML,
                        'capabilitypoints': document.getElementById('capabilitypoints').innerHTML,
                        'personnel' :document.getElementById('personnelremaining').innerHTML,
                        'turnno': document.getElementById('turnNo').innerHTML,
                        'timetaken': 3,
                        'performedsteps': stepsDone,
                        'totalsteps':totalSteps
                    """),format.raw/*519.21*/("""}"""),format.raw/*519.22*/(""";
                """),format.raw/*520.17*/("""}"""),format.raw/*520.18*/(""" """),format.raw/*520.19*/("""else"""),format.raw/*520.23*/("""{"""),format.raw/*520.24*/("""
                    """),format.raw/*521.21*/("""var obj = """),format.raw/*521.31*/("""{"""),format.raw/*521.32*/("""
                        """),format.raw/*522.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*524.35*/model/*524.40*/.getGameId),format.raw/*524.50*/(""",
                        'skipturn':'false',
                        'isProduction':isProduction,
                        'riskmitigatedcount': parseInt($('#txtRisk').val()),
                        'oneturn':document.getElementById('oneTurn').innerHTML,
                        'twoturn':document.getElementById('twoTurn').innerHTML,
                        'type': 'projectstep',
                        'budget': document.getElementById('budgetremaining').innerHTML,
                        'capabilitybonus': document.getElementById('capabilitybonus').innerHTML,
                        'capabilitypoints': document.getElementById('capabilitypoints').innerHTML,
                        'personnel' :document.getElementById('personnelremaining').innerHTML,
                        'turnno': document.getElementById('turnNo').innerHTML,
                        'timetaken': 3,
                        'performedsteps': 0,
                        'totalsteps':1
                    """),format.raw/*539.21*/("""}"""),format.raw/*539.22*/(""";
                """),format.raw/*540.17*/("""}"""),format.raw/*540.18*/("""

                """),format.raw/*542.17*/("""$.ajax("""),format.raw/*542.24*/("""{"""),format.raw/*542.25*/("""
                    """),format.raw/*543.21*/("""type: 'POST',
                    url: '"""),_display_(/*544.28*/routes/*544.34*/.GameController.performStep()),format.raw/*544.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*549.46*/("""{"""),format.raw/*549.47*/("""
                        """),format.raw/*550.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        document.getElementById('prevstep').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*553.50*/("""{"""),format.raw/*553.51*/("""
"""),format.raw/*554.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*555.34*/("""{"""),format.raw/*555.35*/("""
                                        """),format.raw/*556.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*561.37*/("""}"""),format.raw/*561.38*/(""",
                                    function(isConfirm)"""),format.raw/*562.56*/("""{"""),format.raw/*562.57*/("""
                                        """),format.raw/*563.41*/("""if (isConfirm) """),format.raw/*563.56*/("""{"""),format.raw/*563.57*/("""
"""),format.raw/*564.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*567.41*/("""}"""),format.raw/*567.42*/("""
                                    """),format.raw/*568.37*/("""}"""),format.raw/*568.38*/(""");
                        """),format.raw/*569.25*/("""}"""),format.raw/*569.26*/("""


                       """),format.raw/*572.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*573.25*/("""{"""),format.raw/*573.26*/("""
                           """),format.raw/*574.28*/("""// $('#updateactivity').trigger('click');

                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*578.56*/("""{"""),format.raw/*578.57*/("""
                                """),format.raw/*579.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*580.29*/("""}"""),format.raw/*580.30*/("""
                            """),format.raw/*581.29*/("""if(data.oops_points !=0) """),format.raw/*581.54*/("""{"""),format.raw/*581.55*/("""
                                """),format.raw/*582.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*583.29*/("""}"""),format.raw/*583.30*/("""
                            """),format.raw/*584.29*/("""if(data.oops_bonus !=0) """),format.raw/*584.53*/("""{"""),format.raw/*584.54*/("""
                                """),format.raw/*585.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*586.29*/("""}"""),format.raw/*586.30*/("""
                            """),format.raw/*587.29*/("""if(data.oops_budget !=0) """),format.raw/*587.54*/("""{"""),format.raw/*587.55*/("""
                                """),format.raw/*588.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*589.29*/("""}"""),format.raw/*589.30*/("""
                            """),format.raw/*590.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*592.36*/("""{"""),format.raw/*592.37*/("""   """),format.raw/*592.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*592.128*/("""}"""),format.raw/*592.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*599.25*/("""}"""),format.raw/*599.26*/("""
                        """),format.raw/*600.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*600.61*/("""{"""),format.raw/*600.62*/("""

                            """),format.raw/*602.29*/("""var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*604.60*/("""{"""),format.raw/*604.61*/("""
                                """),format.raw/*605.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*606.29*/("""}"""),format.raw/*606.30*/("""
                            """),format.raw/*607.29*/("""if(data.surprise_points !=0) """),format.raw/*607.58*/("""{"""),format.raw/*607.59*/("""
                                """),format.raw/*608.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*609.29*/("""}"""),format.raw/*609.30*/("""
                            """),format.raw/*610.29*/("""if(data.surprise_bonus !=0) """),format.raw/*610.57*/("""{"""),format.raw/*610.58*/("""
                                """),format.raw/*611.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*612.29*/("""}"""),format.raw/*612.30*/("""
                            """),format.raw/*613.29*/("""if(data.surprise_budget !=0) """),format.raw/*613.58*/("""{"""),format.raw/*613.59*/("""
                                """),format.raw/*614.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*615.29*/("""}"""),format.raw/*615.30*/("""
                            """),format.raw/*616.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*618.36*/("""{"""),format.raw/*618.37*/("""   """),format.raw/*618.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*618.135*/("""}"""),format.raw/*618.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*626.25*/("""}"""),format.raw/*626.26*/("""
                        """),format.raw/*627.25*/("""else if(data.steptype == "production")"""),format.raw/*627.63*/("""{"""),format.raw/*627.64*/("""
                            """),format.raw/*628.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*629.52*/("""{"""),format.raw/*629.53*/("""
                                """),format.raw/*630.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*631.29*/("""}"""),format.raw/*631.30*/("""
                            """),format.raw/*632.29*/("""else"""),format.raw/*632.33*/("""{"""),format.raw/*632.34*/("""
                                """),format.raw/*633.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*634.29*/("""}"""),format.raw/*634.30*/("""

                            """),format.raw/*636.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*638.25*/("""}"""),format.raw/*638.26*/("""
                        """),format.raw/*639.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*639.61*/("""{"""),format.raw/*639.62*/("""
                            """),format.raw/*640.29*/("""if($('#btnIsProduction').val() != "true")"""),format.raw/*640.70*/("""{"""),format.raw/*640.71*/("""
                                """),format.raw/*641.33*/("""//swal("""),format.raw/*641.40*/("""{"""),format.raw/*641.41*/("""   """),format.raw/*641.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*641.118*/("""}"""),format.raw/*641.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*644.29*/("""}"""),format.raw/*644.30*/("""

                        """),format.raw/*646.25*/("""}"""),format.raw/*646.26*/("""
                        """),format.raw/*647.25*/("""else if(data.steptype == "risk")"""),format.raw/*647.57*/("""{"""),format.raw/*647.58*/("""
                            """),format.raw/*648.29*/("""if(data.risk_status == "success")"""),format.raw/*648.62*/("""{"""),format.raw/*648.63*/("""
                                """),format.raw/*649.33*/("""//swal("""),format.raw/*649.40*/("""{"""),format.raw/*649.41*/("""   """),format.raw/*649.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*649.142*/("""}"""),format.raw/*649.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*652.29*/("""}"""),format.raw/*652.30*/("""
                            """),format.raw/*653.29*/("""else"""),format.raw/*653.33*/("""{"""),format.raw/*653.34*/("""
                                """),format.raw/*654.33*/("""//swal("""),format.raw/*654.40*/("""{"""),format.raw/*654.41*/("""   """),format.raw/*654.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*654.127*/("""}"""),format.raw/*654.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*657.29*/("""}"""),format.raw/*657.30*/("""
                        """),format.raw/*658.25*/("""}"""),format.raw/*658.26*/("""
                        """),format.raw/*659.25*/("""else
                        """),format.raw/*660.25*/("""{"""),format.raw/*660.26*/("""
                            """),format.raw/*661.29*/("""//swal("""),format.raw/*661.36*/("""{"""),format.raw/*661.37*/("""   """),format.raw/*661.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*661.134*/("""}"""),format.raw/*661.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*664.25*/("""}"""),format.raw/*664.26*/("""
                        """),format.raw/*665.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*676.91*/("""{"""),format.raw/*676.92*/("""

                            """),format.raw/*678.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*680.25*/("""}"""),format.raw/*680.26*/("""
                        """),format.raw/*681.25*/("""refreshProjectSteps();


                    """),format.raw/*684.21*/("""}"""),format.raw/*684.22*/(""",
                    error: function (data) """),format.raw/*685.44*/("""{"""),format.raw/*685.45*/("""
                      """),format.raw/*686.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*689.21*/("""}"""),format.raw/*689.22*/("""
                """),format.raw/*690.17*/("""}"""),format.raw/*690.18*/(""");
            """),format.raw/*691.13*/("""}"""),format.raw/*691.14*/("""

            """),format.raw/*693.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*695.47*/("""{"""),format.raw/*695.48*/("""

                 """),format.raw/*697.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*702.27*/("""{"""),format.raw/*702.28*/("""
                    """),format.raw/*703.21*/("""'phaseId': clicked_id
                """),format.raw/*704.17*/("""}"""),format.raw/*704.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*706.43*/("""{"""),format.raw/*706.44*/("""
                    """),format.raw/*707.21*/("""swal("""),format.raw/*707.26*/("""{"""),format.raw/*707.27*/("""   """),format.raw/*707.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*707.232*/("""}"""),format.raw/*707.233*/(""", function()"""),format.raw/*707.245*/("""{"""),format.raw/*707.246*/("""

               """),format.raw/*709.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*711.74*/("""{"""),format.raw/*711.75*/("""
                            """),format.raw/*712.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*715.25*/("""}"""),format.raw/*715.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*717.61*/("""{"""),format.raw/*717.62*/("""
                            """),format.raw/*718.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*720.54*/("""{"""),format.raw/*720.55*/("""
                                """),format.raw/*721.33*/("""riskcount++;
                            """),format.raw/*722.29*/("""}"""),format.raw/*722.30*/("""
                        """),format.raw/*723.25*/("""}"""),format.raw/*723.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*729.48*/("""{"""),format.raw/*729.49*/("""
                        """),format.raw/*730.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*731.21*/("""}"""),format.raw/*731.22*/("""
                        """),format.raw/*732.25*/("""}"""),format.raw/*732.26*/(""");
                """),format.raw/*733.17*/("""}"""),format.raw/*733.18*/("""

                """),format.raw/*735.17*/("""else """),format.raw/*735.22*/("""{"""),format.raw/*735.23*/("""

                    """),format.raw/*737.21*/("""$.ajax("""),format.raw/*737.28*/("""{"""),format.raw/*737.29*/("""
                        """),format.raw/*738.25*/("""type: 'POST',
                        url: '"""),_display_(/*739.32*/routes/*739.38*/.GameController.getProjectSteps()),format.raw/*739.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*744.50*/("""{"""),format.raw/*744.51*/("""
"""),format.raw/*745.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*748.63*/("""{"""),format.raw/*748.64*/("""
                                """),format.raw/*749.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*750.61*/("""{"""),format.raw/*750.62*/("""
                                    """),format.raw/*751.37*/("""if (obj.status) """),format.raw/*751.53*/("""{"""),format.raw/*751.54*/("""
                                        """),format.raw/*752.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*753.37*/("""}"""),format.raw/*753.38*/("""
                                """),format.raw/*754.33*/("""}"""),format.raw/*754.34*/("""
"""),format.raw/*755.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*757.49*/("""{"""),format.raw/*757.50*/("""
                                    """),format.raw/*758.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*759.33*/("""}"""),format.raw/*759.34*/("""


                                """),format.raw/*762.33*/("""var eligibleBudget = 0;
                                var eligibleCapabilityBonus = 0;
                                var eligibleCapabilityPoints = 0;
                                var eligiblePersonnelRemaining = 0;
////                            alert('hereee');
                                eligibleBudget = parseInt(document.getElementById('budgetremaining').innerHTML) - obj.budget;
                                eligibleCapabilityBonus = parseInt(document.getElementById('capabilitybonus').innerHTML) + obj.capabilityBonus;
                                eligibleCapabilityPoints = parseInt(document.getElementById('capabilitypoints').innerHTML) + obj.capabilityPoints;
                                eligiblePersonnelRemaining = parseInt(document.getElementById('personnelremaining').innerHTML) - obj.personnel;

//                            alert(eligibleBudget+" "+eligiblePersonnelRemaining);
////
                                var setClassColor;
                                var buttonDisable;
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*776.91*/("""{"""),format.raw/*776.92*/("""
                                    """),format.raw/*777.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*780.33*/("""}"""),format.raw/*780.34*/(""" """),format.raw/*780.35*/("""else """),format.raw/*780.40*/("""{"""),format.raw/*780.41*/("""
                                    """),format.raw/*781.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*783.33*/("""}"""),format.raw/*783.34*/("""
"""),format.raw/*784.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

                                result = result + "<button " +
                                        " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                        " style='white-space: normal;height:55px ' " +
                                        " class='open-EditTodo col-md-3 btn btn-success " + setClassColor + "'" +
                                        " data-toggle='modal' " + obj.status +
                                        " data-buttondisable='" + buttonDisable + "'" +
                                        "data-title='" + obj.projectStepName +
                                        "'data-id='" + obj.projectStepId +
                                        "'data-budget='Budget:' data-budgetvalue='" + obj.budget +
                                        "'data-capabilitypoints='Capability Points:' data-capabilitypointsvalue='" + obj.capabilityPoints +
                                        "'data-personnel='Personnel:' data-personnelvalue='" + obj.personnel +
                                        "'data-capabilitybonus='Capability Bonus:' data-capabilitybonusvalue='" + obj.capabilityBonus +
                                        "'data-level='Level:' data-levelvalue='" + obj.level +
                                        "'data-id='" + obj.projectStepId +
                                        "'" +
//                                            "data-todo='"""),format.raw/*804.59*/("""{"""),format.raw/*804.60*/("""'id':12,'todo':'xyz'"""),format.raw/*804.80*/("""}"""),format.raw/*804.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*810.29*/("""}"""),format.raw/*810.30*/("""

"""),format.raw/*812.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;

                        """),format.raw/*817.25*/("""}"""),format.raw/*817.26*/(""",
                        error: function (data) """),format.raw/*818.48*/("""{"""),format.raw/*818.49*/("""
                            """),format.raw/*819.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*821.25*/("""}"""),format.raw/*821.26*/("""
                    """),format.raw/*822.21*/("""}"""),format.raw/*822.22*/(""");
                """),format.raw/*823.17*/("""}"""),format.raw/*823.18*/("""
            """),format.raw/*824.13*/("""}"""),format.raw/*824.14*/("""

            """),format.raw/*826.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*826.67*/("""{"""),format.raw/*826.68*/("""
"""),format.raw/*827.1*/("""//                alert($(this).data('title'));

                var title = $(this).data('title');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var capabilityPoints = $(this).data('capabilitypoints');
                var capabilityPointsValue = $(this).data('capabilitypointsvalue');
                var capabilityBonus = $(this).data('capabilitybonus');
                var capabilityBonusValue = $(this).data('capabilitybonusvalue');

                var level = $(this).data('level');
                var levelValue = $(this).data('levelvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
//                alert(buttonDisabled);
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*843.42*/("""{"""),format.raw/*843.43*/("""
                    """),format.raw/*844.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*845.17*/("""}"""),format.raw/*845.18*/("""else"""),format.raw/*845.22*/("""{"""),format.raw/*845.23*/("""
                    """),format.raw/*846.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*847.17*/("""}"""),format.raw/*847.18*/("""
                """),format.raw/*848.17*/("""var projectStepId = $(this).data('id');
                $(".perform-step").attr("id",projectStepId);
                $(".perform-step").attr("disabled",buttonDisabled);
                $("#windowtitle").text(title);
                $("#Budget").text(budget);
                $("#BudgetValue").text(budgetValue);
                $("#CapabilityPoints").text(capabilityPoints);
                $("#CapabilityPointsValue").text(capabilityPointsValue);
                $("#CapabilityBonus").text(capabilityBonus);
                $("#CapabilityBonusValue").text(capabilityBonusValue);
                $("#Level").text(level);
                $("#LevelValue").text(levelValue);
                $("#Personnel").text(personnel);
                $("#PersonnelValue").text(personnelValue);
                $("#ProjectStepId").val(projectStepId);
//                alert("<button id='"+projectStepId+"' class='btn btn-success perform-step'  style='margin-bottom: 20px' onclick='onPerformStep("+"\""+projectStepId+"\""+")' >Perform this Step</button>");
//


            """),format.raw/*867.13*/("""}"""),format.raw/*867.14*/(""");




            function totalGameTimer() """),format.raw/*872.39*/("""{"""),format.raw/*872.40*/("""

                """),format.raw/*874.17*/("""var sec = 0;

                function pad(val) """),format.raw/*876.35*/("""{"""),format.raw/*876.36*/("""
                    """),format.raw/*877.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*878.17*/("""}"""),format.raw/*878.18*/("""

                """),format.raw/*880.17*/("""var timer = setInterval(function () """),format.raw/*880.53*/("""{"""),format.raw/*880.54*/("""
                    """),format.raw/*881.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*883.17*/("""}"""),format.raw/*883.18*/(""", 1000);

                setTimeout(function () """),format.raw/*885.40*/("""{"""),format.raw/*885.41*/("""
                    """),format.raw/*886.21*/("""clearInterval(timer);
                """),format.raw/*887.17*/("""}"""),format.raw/*887.18*/(""", 50000000);
            """),format.raw/*888.13*/("""}"""),format.raw/*888.14*/("""
            """),format.raw/*889.13*/("""function refreshProjectSteps()"""),format.raw/*889.43*/("""{"""),format.raw/*889.44*/("""
                """),format.raw/*890.65*/("""
                """),format.raw/*891.17*/("""var result="";
            """),_display_(/*892.14*/for(phases <- model.getPhases()) yield /*892.46*/ {_display_(Seq[Any](format.raw/*892.48*/("""

                """),format.raw/*894.17*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                        "style='background-color: #DB8B00 !important;'" +
                        "onclick='onPhaseClick(id)' " +
                        "id='"""),_display_(/*897.31*/phases/*897.37*/.getPhaseId),format.raw/*897.48*/("""'>"""),_display_(/*897.51*/phases/*897.57*/.getPhaseName),format.raw/*897.70*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";


                """)))}),format.raw/*900.18*/("""
                """),format.raw/*901.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*904.13*/("""}"""),format.raw/*904.14*/("""

            """),format.raw/*906.13*/("""function newfunc()"""),format.raw/*906.31*/("""{"""),format.raw/*906.32*/("""
                """),format.raw/*907.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*909.13*/("""}"""),format.raw/*909.14*/("""
    """),format.raw/*910.5*/("""</script>
    <body style="background-image: url("""),_display_(/*911.41*/routes/*911.47*/.Assets.at("images/bg.jpg")),format.raw/*911.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*914.68*/model/*914.73*/.getUserName()),format.raw/*914.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*915.64*/model/*915.69*/.getGameId()),format.raw/*915.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*916.60*/model/*916.65*/.getTurnNo()),format.raw/*916.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*917.68*/model/*917.73*/.getTimeForEachMove()),format.raw/*917.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*922.64*/routes/*922.70*/.DashboardController.viewDashboard()),format.raw/*922.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*930.51*/("""
                """),format.raw/*931.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*931.95*/model/*931.100*/.getGameId()),format.raw/*931.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*934.44*/model/*934.49*/.getStepsForEachPlayer()),format.raw/*934.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*941.126*/model/*941.131*/.getUserName().split("@")/*941.156*/(0)),format.raw/*941.159*/("""!</div>
                    <div style=" display: inline-block;" class="btn-group">
                        <button type="button"
                        class=" dropdown-toggle glyphicon glyphicon-cog" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false">

                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="#" onclick="window.open('/assets/images/Players_manual.pdf', '_blank', 'toolbar=0,location=0,menubar=0');">Help</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#" onclick="window.open('/assets/images/Riskdesc.pdf', '_blank', 'toolbar=0,location=0,menubar=0');">Risk Description</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a id="lnkLeave" href="#">Leave Game</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="/logout" >Logout</a></li>
                        </ul>
                    </div>
                </div>
            </header>




            <div class="col-xs-12" style="height: 10px;"></div>

            <header>

                    <!--// start of big1 div -->
                <div class="col-md-2" style="border-right: 1px dashed #969C9E;padding: 0px 0px 0px 0px !important;">

                  <div class="panel panel-default" style="font-size: 12px;">
                      <div class="panel-heading" style="background-color: #A8A2A3">
                          <h4 class="panel-title">Action Details</h4>
                      </div>
                      <div class="panel-body" style="height: 170px; overflow-wrap: break-word;text-align:justify;">
                          <div style=" display: inline-block;text-align:center;">Current Turn No: </div>

                 <div style=" display: inline-block;text-align:justify" id="turnNo">1</div>

                          <input type ="text" hidden id="btnIsProduction" value="false"/>
                          <hr>
                          <div>Previous step Name:</div>

                            <div id="prevstep"> </div>
                            <hr>
                          <div>Your last turn status:</div>

                            <div id="swalmessages">  </div>

                            <div id="myCurrentTurn" style="display: none;">
                            </div>
                      </div>
                  </div>
 <div class="panel panel-default">
                      <div class="panel-heading" style="background-color: #A8A2A3;">
                          <h4 class="panel-title">Alert Messages</h4>
                      </div>
                      <div class="panel-body" style="height: 200px; overflow-wrap: break-word;text-align:justify;">
                          
                      </div>
                  </div>

                      <!-- \\ end of second div -->



                        <!-- //second div -->


                        <!-- \\ start of third div -->
                        <div class="panel panel-default" style="margin-bottom: 5px; background: beige;padding: 0px 0px 0px 0px !important;">
                            <div class="panel-heading" style="background-color: #A8A2A3">
                                <h4 class="panel-title">Chat</h4>
                            </div>
                            <div id="chatArea" class="panel-body" style="height: 100px;font-size: 12px;
                                border: 1px solid transparent;
                                background-size: 100% 100%; overflow-wrap: break-word;overflow-y: scroll;text-align: left">
                            </div>

                        </div>

                        <textarea id="txtMessage" placeholder="Enter text (max 250 characters) and hit enter." style="width:223px;margin-bottom:20px;">

                        </textarea>
                        <div>
                            """),format.raw/*1026.105*/("""
                        """),format.raw/*1027.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1044.126*/model/*1044.131*/.getBudget()),format.raw/*1044.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1046.141*/model/*1046.146*/.getCapabilityPoints()),format.raw/*1046.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1048.139*/model/*1048.144*/.getCapabilityBonus()),format.raw/*1048.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1053.180*/model/*1053.185*/.getResources),format.raw/*1053.198*/("""</div>
                                                  <div>No. of resources who will return after </div>
                                                  <div style=" display: inline-block;">One Turn:</div><div style=" display: inline-block; float: right" id="oneTurn">0</div><br/>
                                                  <div style=" display: inline-block;">Two Turns:</div><div style=" display: inline-block; float: right" id="twoTurn">0</div>

                                                </div>
                                                <div style="display:inline-block;position:absolute;top:0;right:0;">

                                                  <div class="col-md-3 mytimer" style="zoom: 0.4;padding:0" hidden>

                                                  </div>
                                                  <input type ="text" hidden id="btnIsProduction" value="false"/>



                                                </div>

                                          </div>


<div></div>


                                              """),format.raw/*1076.138*/("""


                                          """),format.raw/*1079.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1089.83*/model/*1089.88*/.getBudget()),format.raw/*1089.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1090.84*/model/*1090.89*/.getCapabilityPoints()),format.raw/*1090.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1091.83*/model/*1091.88*/.getCapabilityBonus()),format.raw/*1091.109*/("""</div>
                                                          <div>Risks Mitigated</div>

                                                          <div style="height: 30px;"></div>
                                                          <div style="font-weight: bolder;
                                                              font-size: large" >
                                                              <h2>Project Steps Completed</h2>
                                                          </div>
                                                          <div>Planning: 2/ 10</div>
                                                          <div>Requirements: 2/9</div>
                                                          <div>Design: </div>
                                                          <div>Implementation</div>
                                                          <div>Testing</div>
                                                      </div>

                                                  </div>

                                              </div>
                                          </div>

                                          <!-- //end  of first div -->
                                          <br>
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" onclick="onProjectStepTabClick()" href="#projectSteps">Project Steps</a></li>
                        <li><a data-toggle="tab" href="#riskDashboard" onclick="onRiskDashboardClick()">Risk Dashboard</a></li>
                        <button class="btn btn-danger" id="btnSkip" onclick="onPerformStep(id)" style="float:right">Skip Turn</button>
                        <button style="display: none" class="btn btn-danger" id="btnSkipTimeout" onclick="onPerformStep(id)">Timeout button</button>

                    </ul>
                    <div class="tab-content">
                        <div id="projectSteps" class="tab-pane fade in active">
                            <div class="col-md-12" style="border: 1px solid transparent">

                                <div style="height: 10px; "></div>

                                <div id="listOfProjectSteps">


                                    """),_display_(/*1129.38*/for(phase <- model.getPhases()) yield /*1129.69*/ {_display_(Seq[Any](format.raw/*1129.71*/("""
                                        """),_display_(/*1130.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1130.95*/{_display_(Seq[Any](format.raw/*1130.96*/("""

                                            """),format.raw/*1132.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1135.49*/phase/*1135.54*/.getPhaseId),format.raw/*1135.65*/(""">"""),_display_(/*1135.67*/phase/*1135.72*/.getPhaseName()),format.raw/*1135.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1137.42*/else/*1137.46*/{_display_(Seq[Any](format.raw/*1137.47*/("""
                                            """),format.raw/*1138.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1141.49*/phase/*1141.54*/.getPhaseId),format.raw/*1141.65*/(""">"""),_display_(/*1141.67*/phase/*1141.72*/.getPhaseName()),format.raw/*1141.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1143.42*/("""

                                    """)))}),format.raw/*1145.38*/("""


                                """),format.raw/*1148.33*/("""</div>





                            </div>

                            <div class="col-md-12" style="border: 1px solid transparent;
                                height: 400px">
                                <hr style="width: 100%;
                                    color: black;
                                    height: 0.5px;
                                    background-color: black;" />
                                <div id="desc"></div>
                                <div class="col-md-12" style="height: 10px;"> </div>

                                <div id="results"></div>
                            </div>



                        </div>
                        <div id="riskDashboard" class="tab-pane fade">

                            <div id="risks"></div>
                            <input type="text" id="txtRiskCount" hidden value="0" />

                            <table id="grid-basic" class="table table-condensed table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th style="font-weight: bold; background-color: #7cbcd6" data-column-id="riskidcolumn" >Risk ID</th>
                                        <th style="font-weight: bold; background-color: #7cbcd6" data-column-id="riskcolumn" data-formatter="link" data-order="desc">Risk Description</th>
                                        <th style="font-weight: bold;background-color: #7cbcd6" data-column-id="statuscolumn">Status</th>
                                        <th style="font-weight: bold;background-color: #7cbcd6" data-column-id="mitigatecolumn"></th>

                                    </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>

                            <br/>
                            <div id="stepForRisk"></div>

                            <br/><br/>
                            <div id="risksteps"></div>

                        </div>
                    </div>



                </div>



                    <!-- \\ end of center div - phases and steps -->


                <div class="col-md-2" style="border-left: 1px Dashed #969C9E;
                    border-width: thin;padding: 0px 0px 0px 0px !important;">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Active Players </h4>
                        </div>
                        <div id="activePlayersList" class="panel-body" style="height: 200px;overflow-wrap: break-word;">
                            user1<br/>
                            user2<br/>
                        </div>
                    </div>
                    """),format.raw/*1219.51*/("""
                    """),format.raw/*1220.55*/("""
                    """),format.raw/*1221.52*/("""
                    """),format.raw/*1222.105*/("""




                    """),format.raw/*1227.21*/("""<div class="panel panel-default" >
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Action Log </h4>
                        </div>
                        <div class="panel-body" style="height: 300px;font-size: 12px; overflow-wrap: break-word;overflow-y: scroll" id="activity-log">

                        </div>
                    </div>


                </div>

            </header>


                <!-- This will be displayed if he is the observer -->

            <div class="clearfix"></div>
            <div class="clearfix"></div>
            <div class="clearfix"></div>
            <div class="clearfix"></div>




            <div class="modal fade" tabindex="-1" role="dialog" style="margin-top: 150px;" id="editTodoDialog">
                <div class="modal-dialog" align="center">
                    <div class="modal-content" style="width: 350px;">
                        <div class="modal-header modalHeader" align="left" >
                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">
                                Close</span></button>
                            <h4 id="windowtitle" class="modal-title" ></h4>


                        </div>
                        <div class="modal-body" align="center" style="display: inline">

                            <table>
                                <tr>
                                    <td><h5 id="Budget" > </h5></td>
                                    <td><h5 id="BudgetValue"></h5></td>
                                </tr>
                                <tr>
                                    <td><h5 id="CapabilityPoints" > </h5></td>
                                    <td><h5 id="CapabilityPointsValue"></h5></td>
                                </tr>
                                <tr>
                                    <td><h5 id="CapabilityBonus" > </h5></td>
                                    <td><h5 id="CapabilityBonusValue"></h5></td>
                                </tr>
                                <tr>
                                    <td><h5 id="Level" > </h5></td>
                                    <td><h5 id="LevelValue"></h5></td>
                                </tr>
                                <tr>
                                    <td><h5 id="Personnel" > </h5></td>
                                    <td> <h5 id="PersonnelValue"></h5></td>
                                </tr>

                            </table>

                            <input type="hidden" id="ProjectStepId" value="">
                           <!-- <div class="sweet-alert"> -->
                            <div class="col-xs-12" style="height: 10px;"></div>
                            <div id="performstep"></div>
                            <button disabled=""  id="" class="btn btn-success perform-step"  style="margin-bottom: 10px" onclick="onPerformStep(id)" >Perform this Step</button>
                            <button data-dismiss="modal" class="btn btn-danger"  style="margin-bottom: 10px" aria-label="Close">Cancel</button>

                            <button disabled="" hidden  id="updateactivity" class=""  style="margin-bottom: 10px"  ></button>
                            <input type="text" hidden id="oopsmsg" />
                            <input type="text" hidden id="isoops" />
                            <div id="isDisabled" style="color: #8b0000;"></div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="modal fade" tabindex="-1" role="dialog" style="margin-top: 150px;" id="riskDialog">
                <div class="modal-dialog" align="center">
                    <div class="modal-content" style="width: 350px;">
                        <div class="modal-header modalHeader" align="left" >
                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">
                                Close</span></button>
                            <h4 id="riskwindowtitle" class="modal-title" >new window</h4>


                        </div>
                        <div class="modal-body" align="center" style="display: inline">

                            <table>
                                <tr>
                                    <td><h5 id="RiskBudget" > </h5></td>
                                    <td><h5 id="RiskBudgetValue"></h5></td>
                                </tr>

                                <tr>
                                    <td><h5 id="RiskPersonnel" > </h5></td>
                                    <td> <h5 id="RiskPersonnelValue"></h5></td>
                                </tr>

                            </table>

                            <input type="hidden" id="ProjectStepId" value="">

                            <div class="col-xs-12" style="height: 30px;"></div>
                            <div id="performstep"></div>
                            <button id="performrisk" class="btn btn-success perform-risk"  style="margin-bottom: 10px" onclick="onMitigateRisk(id)" >Perform this Risk</button>
                            <button data-dismiss="modal" class="btn btn-danger"  style="margin-bottom: 10px" aria-label="Close">Cancel</button>
                            <div id="isRiskDisabled" style="color: #8b0000;"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(model:models.InitialGameStat): play.twirl.api.HtmlFormat.Appendable = apply(model)

  def f:((models.InitialGameStat) => play.twirl.api.HtmlFormat.Appendable) = (model) => apply(model)

  def ref: this.type = this

}


}

/*(hm: Map[models.Phase, List[models.ProjectStep]])*/
object ProjectStep extends ProjectStep_Scope0.ProjectStep
              /*
                  -- GENERATED --
                  DATE: Sat Jul 29 21:31:36 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: f5e451f7bd7daeb8f208ff1e05a885e19d3a6459
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10645->6402|10675->6403|10722->6421|10782->6452|10812->6453|10854->6466|10948->6531|10978->6532|11025->6550|11096->6592|11126->6593|11168->6606|11228->6637|11258->6638|11304->6655|11388->6710|11418->6711|11468->6732|11537->6773|11553->6779|11605->6809|11856->7031|11886->7032|11915->7033|12194->7283|12224->7284|12283->7314|12644->7646|12674->7647|12703->7648|12936->7852|12966->7853|12999->7857|13029->7858|13091->7891|13170->7941|13200->7942|13261->7974|14347->9031|14377->9032|14439->9065|14679->9276|14709->9277|14742->9281|14772->9282|14834->9315|14964->9416|14994->9417|15023->9418|16578->10944|16608->10945|16662->10970|16812->11091|16842->11092|16916->11137|16946->11138|17000->11163|17121->11255|17151->11256|17197->11273|17227->11274|17272->11290|17302->11291|17345->11305|17430->11361|17460->11362|17503->11376|18022->11866|18052->11867|18102->11888|18257->12014|18287->12015|18320->12019|18350->12020|18400->12041|18501->12113|18531->12114|18577->12131|19427->12952|19457->12953|19529->12996|19559->12997|19588->12998|19830->13211|19860->13212|19904->13227|20083->13377|20113->13378|20142->13379|20267->13475|20297->13476|20347->13497|20405->13526|20435->13527|20481->13544|20517->13551|20547->13552|20597->13573|20666->13614|20682->13620|20740->13656|20951->13838|20981->13839|21036->13865|21225->14025|21255->14026|21313->14055|21444->14157|21474->14158|21536->14191|21668->14294|21698->14295|21728->14297|22968->15508|22998->15509|23060->15542|23300->15753|23330->15754|23363->15758|23393->15759|23455->15792|23585->15893|23615->15894|23644->15895|24006->16228|24036->16229|24098->16262|24156->16291|24186->16292|24252->16329|25741->17789|25771->17790|25820->17810|25850->17811|26204->18136|26234->18137|26267->18141|26297->18142|26363->18179|27860->19647|27890->19648|27939->19668|27969->19669|28323->19994|28353->19995|28413->20026|28443->20027|28476->20031|28506->20032|28568->20065|30001->21469|30031->21470|30080->21490|30110->21491|30448->21800|30478->21801|30534->21828|30564->21829|30593->21830|30905->22113|30935->22114|31009->22159|31039->22160|31093->22185|31228->22291|31258->22292|31304->22309|31334->22310|31379->22326|31409->22327|31453->22342|31508->22368|31538->22369|31568->22371|31931->22705|31961->22706|32011->22727|32050->22737|32080->22738|32134->22763|32253->22854|32268->22859|32300->22869|33321->23861|33351->23862|33398->23880|33428->23881|33475->23899|33564->23959|33594->23960|33623->23961|33715->24024|33745->24025|33799->24050|33918->24141|33933->24146|33965->24156|34983->25145|35013->25146|35060->25164|35090->25165|35137->25183|35198->25215|35228->25216|35257->25217|35349->25280|35379->25281|35433->25306|35548->25393|35563->25398|35595->25408|36618->26402|36648->26403|36695->26421|36725->26422|36755->26423|36788->26427|36818->26428|36868->26449|36907->26459|36937->26460|36991->26485|37106->26572|37121->26577|37153->26587|38166->27571|38196->27572|38243->27590|38273->27591|38320->27609|38356->27616|38386->27617|38436->27638|38505->27679|38521->27685|38572->27714|38834->27947|38864->27948|38918->27973|39195->28221|39225->28222|39254->28223|39368->28308|39398->28309|39468->28350|39841->28694|39871->28695|39957->28752|39987->28753|40057->28794|40101->28809|40131->28810|40160->28811|40368->28990|40398->28991|40464->29028|40494->29029|40550->29056|40580->29057|40635->29083|40721->29140|40751->29141|40808->29169|40992->29324|41022->29325|41084->29358|41199->29444|41229->29445|41287->29474|41341->29499|41371->29500|41433->29533|41555->29626|41585->29627|41643->29656|41696->29680|41726->29681|41788->29714|41908->29805|41938->29806|41996->29835|42050->29860|42080->29861|42142->29894|42254->29977|42284->29978|42342->30007|42462->30098|42492->30099|42524->30102|42642->30190|42673->30191|43206->30695|43236->30696|43290->30721|43355->30757|43385->30758|43444->30788|43563->30878|43593->30879|43655->30912|43774->31002|43804->31003|43862->31032|43920->31061|43950->31062|44012->31095|44138->31192|44168->31193|44226->31222|44283->31250|44313->31251|44375->31284|44499->31379|44529->31380|44587->31409|44645->31438|44675->31439|44737->31472|44853->31559|44883->31560|44941->31589|45061->31680|45091->31681|45123->31684|45248->31779|45279->31780|45883->32355|45913->32356|45967->32381|46034->32419|46064->32420|46122->32449|46221->32519|46251->32520|46313->32553|46482->32693|46512->32694|46570->32723|46603->32727|46633->32728|46695->32761|46859->32896|46889->32897|46948->32927|47113->33063|47143->33064|47197->33089|47262->33125|47292->33126|47350->33155|47420->33196|47450->33197|47512->33230|47548->33237|47578->33238|47610->33241|47714->33315|47745->33316|47954->33496|47984->33497|48039->33523|48069->33524|48123->33549|48184->33581|48214->33582|48272->33611|48334->33644|48364->33645|48426->33678|48462->33685|48492->33686|48524->33689|48652->33787|48683->33788|48898->33974|48928->33975|48986->34004|49019->34008|49049->34009|49111->34042|49147->34049|49177->34050|49209->34053|49322->34136|49353->34137|49568->34323|49598->34324|49652->34349|49682->34350|49736->34375|49794->34404|49824->34405|49882->34434|49918->34441|49948->34442|49980->34445|50104->34539|50135->34540|50343->34719|50373->34720|50427->34745|51278->35567|51308->35568|51367->35598|51504->35706|51534->35707|51588->35732|51662->35777|51692->35778|51766->35823|51796->35824|51848->35847|52034->36004|52064->36005|52110->36022|52140->36023|52184->36038|52214->36039|52257->36053|52392->36159|52422->36160|52470->36179|52714->36394|52744->36395|52794->36416|52861->36454|52891->36455|52965->36500|52995->36501|53045->36522|53079->36527|53109->36528|53141->36531|53373->36733|53404->36734|53446->36746|53477->36747|53523->36764|53768->36980|53798->36981|53856->37010|53958->37083|53988->37084|54125->37192|54155->37193|54213->37222|54342->37322|54372->37323|54434->37356|54504->37397|54534->37398|54588->37423|54618->37424|54973->37750|55003->37751|55057->37776|55211->37901|55241->37902|55295->37927|55325->37928|55373->37947|55403->37948|55450->37966|55484->37971|55514->37972|55565->37994|55601->38001|55631->38002|55685->38027|55758->38072|55774->38078|55829->38111|56118->38371|56148->38372|56177->38373|56432->38599|56462->38600|56524->38633|56632->38712|56662->38713|56728->38750|56773->38766|56803->38767|56873->38808|56961->38867|56991->38868|57053->38901|57083->38902|57112->38903|57286->39048|57316->39049|57382->39086|57474->39149|57504->39150|57568->39185|58712->40300|58742->40301|58808->40338|59060->40561|59090->40562|59120->40563|59154->40568|59184->40569|59250->40606|59392->40719|59422->40720|59451->40721|61215->42456|61245->42457|61294->42477|61324->42478|61823->42948|61853->42949|61883->42951|62227->43266|62257->43267|62335->43316|62365->43317|62423->43346|62552->43446|62582->43447|62632->43468|62662->43469|62710->43488|62740->43489|62782->43502|62812->43503|62855->43517|62938->43571|62968->43572|62997->43573|63940->44487|63970->44488|64020->44509|64176->44636|64206->44637|64239->44641|64269->44642|64319->44663|64416->44731|64446->44732|64492->44749|65580->45808|65610->45809|65684->45854|65714->45855|65761->45873|65838->45921|65868->45922|65918->45943|65997->45993|66027->45994|66074->46012|66139->46048|66169->46049|66219->46070|66424->46246|66454->46247|66532->46296|66562->46297|66612->46318|66679->46356|66709->46357|66763->46382|66793->46383|66835->46396|66894->46426|66924->46427|66970->46492|67016->46509|67072->46537|67121->46569|67162->46571|67209->46589|67460->46812|67476->46818|67509->46829|67540->46832|67556->46838|67591->46851|67705->46933|67751->46950|67892->47062|67922->47063|67965->47077|68012->47095|68042->47096|68088->47113|68169->47165|68199->47166|68232->47171|68310->47221|68326->47227|68375->47254|68629->47480|68644->47485|68680->47499|68775->47566|68790->47571|68824->47583|68915->47646|68930->47651|68964->47663|69063->47734|69078->47739|69121->47760|69350->47961|69366->47967|69425->48003|69682->48265|69728->48282|69834->48360|69850->48365|69885->48377|70076->48540|70091->48545|70137->48569|70602->49005|70618->49010|70654->49035|70680->49038|74781->53184|74836->53209|75505->53848|75522->53853|75558->53865|75792->54069|75809->54074|75855->54096|76087->54298|76104->54303|76149->54324|76585->54730|76602->54735|76639->54748|77761->55930|77836->55975|78704->56814|78720->56819|78756->56831|78875->56921|78891->56926|78937->56948|79055->57037|79071->57042|79116->57063|81428->59346|81477->59377|81519->59379|81590->59421|81654->59474|81695->59475|81771->59521|82051->59772|82067->59777|82101->59788|82132->59790|82148->59795|82186->59810|82354->59957|82369->59961|82410->59962|82485->60007|82780->60273|82796->60278|82830->60289|82861->60291|82877->60296|82915->60311|83095->60458|83167->60497|83232->60532|86158->63458|86209->63513|86260->63565|86312->63670|86367->63695
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|190->160|190->160|192->162|193->163|193->163|194->164|196->166|196->166|198->168|199->169|199->169|200->170|200->170|200->170|201->171|202->172|202->172|203->173|204->174|204->174|204->174|209->179|209->179|210->180|214->184|214->184|216->186|221->191|221->191|222->192|225->195|225->195|225->195|225->195|226->196|227->197|227->197|231->201|245->215|245->215|246->216|249->219|249->219|249->219|249->219|250->220|252->222|252->222|253->223|276->246|276->246|277->247|279->249|279->249|280->250|280->250|281->251|283->253|283->253|284->254|284->254|286->256|286->256|288->258|288->258|288->258|289->259|299->269|299->269|300->270|301->271|301->271|301->271|301->271|302->272|303->273|303->273|304->274|321->291|321->291|323->293|323->293|324->294|330->300|330->300|333->303|337->307|337->307|338->308|340->310|340->310|341->311|342->312|342->312|343->313|343->313|343->313|344->314|345->315|345->315|345->315|349->319|349->319|351->321|354->324|354->324|355->325|358->328|358->328|359->329|361->331|361->331|363->333|381->351|381->351|382->352|385->355|385->355|385->355|385->355|386->356|388->358|388->358|389->359|393->363|393->363|394->364|394->364|394->364|395->365|410->380|410->380|410->380|410->380|415->385|415->385|415->385|415->385|416->386|431->401|431->401|431->401|431->401|436->406|436->406|439->409|439->409|439->409|439->409|440->410|455->425|455->425|455->425|455->425|460->430|460->430|463->433|463->433|464->434|468->438|468->438|469->439|469->439|470->440|472->442|472->442|473->443|473->443|475->445|475->445|478->448|478->448|478->448|480->450|484->454|484->454|485->455|485->455|485->455|486->456|488->458|488->458|488->458|503->473|503->473|504->474|504->474|506->476|506->476|506->476|507->477|508->478|508->478|509->479|511->481|511->481|511->481|526->496|526->496|527->497|527->497|529->499|529->499|529->499|530->500|531->501|531->501|532->502|534->504|534->504|534->504|549->519|549->519|550->520|550->520|550->520|550->520|550->520|551->521|551->521|551->521|552->522|554->524|554->524|554->524|569->539|569->539|570->540|570->540|572->542|572->542|572->542|573->543|574->544|574->544|574->544|579->549|579->549|580->550|583->553|583->553|584->554|585->555|585->555|586->556|591->561|591->561|592->562|592->562|593->563|593->563|593->563|594->564|597->567|597->567|598->568|598->568|599->569|599->569|602->572|603->573|603->573|604->574|608->578|608->578|609->579|610->580|610->580|611->581|611->581|611->581|612->582|613->583|613->583|614->584|614->584|614->584|615->585|616->586|616->586|617->587|617->587|617->587|618->588|619->589|619->589|620->590|622->592|622->592|622->592|622->592|622->592|629->599|629->599|630->600|630->600|630->600|632->602|634->604|634->604|635->605|636->606|636->606|637->607|637->607|637->607|638->608|639->609|639->609|640->610|640->610|640->610|641->611|642->612|642->612|643->613|643->613|643->613|644->614|645->615|645->615|646->616|648->618|648->618|648->618|648->618|648->618|656->626|656->626|657->627|657->627|657->627|658->628|659->629|659->629|660->630|661->631|661->631|662->632|662->632|662->632|663->633|664->634|664->634|666->636|668->638|668->638|669->639|669->639|669->639|670->640|670->640|670->640|671->641|671->641|671->641|671->641|671->641|671->641|674->644|674->644|676->646|676->646|677->647|677->647|677->647|678->648|678->648|678->648|679->649|679->649|679->649|679->649|679->649|679->649|682->652|682->652|683->653|683->653|683->653|684->654|684->654|684->654|684->654|684->654|684->654|687->657|687->657|688->658|688->658|689->659|690->660|690->660|691->661|691->661|691->661|691->661|691->661|691->661|694->664|694->664|695->665|706->676|706->676|708->678|710->680|710->680|711->681|714->684|714->684|715->685|715->685|716->686|719->689|719->689|720->690|720->690|721->691|721->691|723->693|725->695|725->695|727->697|732->702|732->702|733->703|734->704|734->704|736->706|736->706|737->707|737->707|737->707|737->707|737->707|737->707|737->707|737->707|739->709|741->711|741->711|742->712|745->715|745->715|747->717|747->717|748->718|750->720|750->720|751->721|752->722|752->722|753->723|753->723|759->729|759->729|760->730|761->731|761->731|762->732|762->732|763->733|763->733|765->735|765->735|765->735|767->737|767->737|767->737|768->738|769->739|769->739|769->739|774->744|774->744|775->745|778->748|778->748|779->749|780->750|780->750|781->751|781->751|781->751|782->752|783->753|783->753|784->754|784->754|785->755|787->757|787->757|788->758|789->759|789->759|792->762|806->776|806->776|807->777|810->780|810->780|810->780|810->780|810->780|811->781|813->783|813->783|814->784|834->804|834->804|834->804|834->804|840->810|840->810|842->812|847->817|847->817|848->818|848->818|849->819|851->821|851->821|852->822|852->822|853->823|853->823|854->824|854->824|856->826|856->826|856->826|857->827|873->843|873->843|874->844|875->845|875->845|875->845|875->845|876->846|877->847|877->847|878->848|897->867|897->867|902->872|902->872|904->874|906->876|906->876|907->877|908->878|908->878|910->880|910->880|910->880|911->881|913->883|913->883|915->885|915->885|916->886|917->887|917->887|918->888|918->888|919->889|919->889|919->889|920->890|921->891|922->892|922->892|922->892|924->894|927->897|927->897|927->897|927->897|927->897|927->897|930->900|931->901|934->904|934->904|936->906|936->906|936->906|937->907|939->909|939->909|940->910|941->911|941->911|941->911|944->914|944->914|944->914|945->915|945->915|945->915|946->916|946->916|946->916|947->917|947->917|947->917|952->922|952->922|952->922|960->930|961->931|961->931|961->931|961->931|964->934|964->934|964->934|971->941|971->941|971->941|971->941|1056->1026|1057->1027|1074->1044|1074->1044|1074->1044|1076->1046|1076->1046|1076->1046|1078->1048|1078->1048|1078->1048|1083->1053|1083->1053|1083->1053|1106->1076|1109->1079|1119->1089|1119->1089|1119->1089|1120->1090|1120->1090|1120->1090|1121->1091|1121->1091|1121->1091|1159->1129|1159->1129|1159->1129|1160->1130|1160->1130|1160->1130|1162->1132|1165->1135|1165->1135|1165->1135|1165->1135|1165->1135|1165->1135|1167->1137|1167->1137|1167->1137|1168->1138|1171->1141|1171->1141|1171->1141|1171->1141|1171->1141|1171->1141|1173->1143|1175->1145|1178->1148|1249->1219|1250->1220|1251->1221|1252->1222|1257->1227
                  -- GENERATED --
              */
          