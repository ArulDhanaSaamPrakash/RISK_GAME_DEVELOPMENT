
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
            """),format.raw/*48.13*/("""position: fixed;
            height:210px;
            width: 180px;
            top:340px;
            left:340px;"""),format.raw/*52.24*/("""}"""),format.raw/*52.25*/("""

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
                        if(data.complete=="true")"""),format.raw/*552.50*/("""{"""),format.raw/*552.51*/("""
"""),format.raw/*553.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*554.34*/("""{"""),format.raw/*554.35*/("""
                                        """),format.raw/*555.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*560.37*/("""}"""),format.raw/*560.38*/(""",
                                    function(isConfirm)"""),format.raw/*561.56*/("""{"""),format.raw/*561.57*/("""
                                        """),format.raw/*562.41*/("""if (isConfirm) """),format.raw/*562.56*/("""{"""),format.raw/*562.57*/("""
"""),format.raw/*563.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*566.41*/("""}"""),format.raw/*566.42*/("""
                                    """),format.raw/*567.37*/("""}"""),format.raw/*567.38*/(""");
                        """),format.raw/*568.25*/("""}"""),format.raw/*568.26*/("""


                       """),format.raw/*571.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*572.25*/("""{"""),format.raw/*572.26*/("""
                           """),format.raw/*573.28*/("""// $('#updateactivity').trigger('click');

                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*577.56*/("""{"""),format.raw/*577.57*/("""
                                """),format.raw/*578.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*579.29*/("""}"""),format.raw/*579.30*/("""
                            """),format.raw/*580.29*/("""if(data.oops_points !=0) """),format.raw/*580.54*/("""{"""),format.raw/*580.55*/("""
                                """),format.raw/*581.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*582.29*/("""}"""),format.raw/*582.30*/("""
                            """),format.raw/*583.29*/("""if(data.oops_bonus !=0) """),format.raw/*583.53*/("""{"""),format.raw/*583.54*/("""
                                """),format.raw/*584.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*585.29*/("""}"""),format.raw/*585.30*/("""
                            """),format.raw/*586.29*/("""if(data.oops_budget !=0) """),format.raw/*586.54*/("""{"""),format.raw/*586.55*/("""
                                """),format.raw/*587.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*588.29*/("""}"""),format.raw/*588.30*/("""
                            """),format.raw/*589.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*591.36*/("""{"""),format.raw/*591.37*/("""   """),format.raw/*591.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*591.128*/("""}"""),format.raw/*591.129*/(""");
                            document.getElementById('swalmessages').innerHTML = alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*598.25*/("""}"""),format.raw/*598.26*/("""
                        """),format.raw/*599.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*599.61*/("""{"""),format.raw/*599.62*/("""

                            """),format.raw/*601.29*/("""var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*603.60*/("""{"""),format.raw/*603.61*/("""
                                """),format.raw/*604.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*605.29*/("""}"""),format.raw/*605.30*/("""
                            """),format.raw/*606.29*/("""if(data.surprise_points !=0) """),format.raw/*606.58*/("""{"""),format.raw/*606.59*/("""
                                """),format.raw/*607.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*608.29*/("""}"""),format.raw/*608.30*/("""
                            """),format.raw/*609.29*/("""if(data.surprise_bonus !=0) """),format.raw/*609.57*/("""{"""),format.raw/*609.58*/("""
                                """),format.raw/*610.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*611.29*/("""}"""),format.raw/*611.30*/("""
                            """),format.raw/*612.29*/("""if(data.surprise_budget !=0) """),format.raw/*612.58*/("""{"""),format.raw/*612.59*/("""
                                """),format.raw/*613.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*614.29*/("""}"""),format.raw/*614.30*/("""
                            """),format.raw/*615.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*617.36*/("""{"""),format.raw/*617.37*/("""   """),format.raw/*617.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*617.135*/("""}"""),format.raw/*617.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*625.25*/("""}"""),format.raw/*625.26*/("""
                        """),format.raw/*626.25*/("""else if(data.steptype == "production")"""),format.raw/*626.63*/("""{"""),format.raw/*626.64*/("""
                            """),format.raw/*627.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*628.52*/("""{"""),format.raw/*628.53*/("""
                                """),format.raw/*629.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*630.29*/("""}"""),format.raw/*630.30*/("""
                            """),format.raw/*631.29*/("""else"""),format.raw/*631.33*/("""{"""),format.raw/*631.34*/("""
                                """),format.raw/*632.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*633.29*/("""}"""),format.raw/*633.30*/("""

                            """),format.raw/*635.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*637.25*/("""}"""),format.raw/*637.26*/("""
                        """),format.raw/*638.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*638.61*/("""{"""),format.raw/*638.62*/("""
                            """),format.raw/*639.29*/("""if($('#btnIsProduction').val() != "true")"""),format.raw/*639.70*/("""{"""),format.raw/*639.71*/("""
                                """),format.raw/*640.33*/("""//swal("""),format.raw/*640.40*/("""{"""),format.raw/*640.41*/("""   """),format.raw/*640.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*640.118*/("""}"""),format.raw/*640.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*643.29*/("""}"""),format.raw/*643.30*/("""

                        """),format.raw/*645.25*/("""}"""),format.raw/*645.26*/("""
                        """),format.raw/*646.25*/("""else if(data.steptype == "risk")"""),format.raw/*646.57*/("""{"""),format.raw/*646.58*/("""
                            """),format.raw/*647.29*/("""if(data.risk_status == "success")"""),format.raw/*647.62*/("""{"""),format.raw/*647.63*/("""
                                """),format.raw/*648.33*/("""//swal("""),format.raw/*648.40*/("""{"""),format.raw/*648.41*/("""   """),format.raw/*648.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*648.142*/("""}"""),format.raw/*648.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*651.29*/("""}"""),format.raw/*651.30*/("""
                            """),format.raw/*652.29*/("""else"""),format.raw/*652.33*/("""{"""),format.raw/*652.34*/("""
                                """),format.raw/*653.33*/("""//swal("""),format.raw/*653.40*/("""{"""),format.raw/*653.41*/("""   """),format.raw/*653.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*653.127*/("""}"""),format.raw/*653.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*656.29*/("""}"""),format.raw/*656.30*/("""
                        """),format.raw/*657.25*/("""}"""),format.raw/*657.26*/("""
                        """),format.raw/*658.25*/("""else
                        """),format.raw/*659.25*/("""{"""),format.raw/*659.26*/("""
                            """),format.raw/*660.29*/("""//swal("""),format.raw/*660.36*/("""{"""),format.raw/*660.37*/("""   """),format.raw/*660.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*660.134*/("""}"""),format.raw/*660.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*663.25*/("""}"""),format.raw/*663.26*/("""
                        """),format.raw/*664.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*675.91*/("""{"""),format.raw/*675.92*/("""

                            """),format.raw/*677.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*679.25*/("""}"""),format.raw/*679.26*/("""
                        """),format.raw/*680.25*/("""refreshProjectSteps();


                    """),format.raw/*683.21*/("""}"""),format.raw/*683.22*/(""",
                    error: function (data) """),format.raw/*684.44*/("""{"""),format.raw/*684.45*/("""
                      """),format.raw/*685.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*688.21*/("""}"""),format.raw/*688.22*/("""
                """),format.raw/*689.17*/("""}"""),format.raw/*689.18*/(""");
            """),format.raw/*690.13*/("""}"""),format.raw/*690.14*/("""

            """),format.raw/*692.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*694.47*/("""{"""),format.raw/*694.48*/("""

                 """),format.raw/*696.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*701.27*/("""{"""),format.raw/*701.28*/("""
                    """),format.raw/*702.21*/("""'phaseId': clicked_id
                """),format.raw/*703.17*/("""}"""),format.raw/*703.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*705.43*/("""{"""),format.raw/*705.44*/("""
                    """),format.raw/*706.21*/("""swal("""),format.raw/*706.26*/("""{"""),format.raw/*706.27*/("""   """),format.raw/*706.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*706.232*/("""}"""),format.raw/*706.233*/(""", function()"""),format.raw/*706.245*/("""{"""),format.raw/*706.246*/("""

               """),format.raw/*708.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*710.74*/("""{"""),format.raw/*710.75*/("""
                            """),format.raw/*711.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*714.25*/("""}"""),format.raw/*714.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*716.61*/("""{"""),format.raw/*716.62*/("""
                            """),format.raw/*717.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*719.54*/("""{"""),format.raw/*719.55*/("""
                                """),format.raw/*720.33*/("""riskcount++;
                            """),format.raw/*721.29*/("""}"""),format.raw/*721.30*/("""
                        """),format.raw/*722.25*/("""}"""),format.raw/*722.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*728.48*/("""{"""),format.raw/*728.49*/("""
                        """),format.raw/*729.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*730.21*/("""}"""),format.raw/*730.22*/("""
                        """),format.raw/*731.25*/("""}"""),format.raw/*731.26*/(""");
                """),format.raw/*732.17*/("""}"""),format.raw/*732.18*/("""

                """),format.raw/*734.17*/("""else """),format.raw/*734.22*/("""{"""),format.raw/*734.23*/("""

                    """),format.raw/*736.21*/("""$.ajax("""),format.raw/*736.28*/("""{"""),format.raw/*736.29*/("""
                        """),format.raw/*737.25*/("""type: 'POST',
                        url: '"""),_display_(/*738.32*/routes/*738.38*/.GameController.getProjectSteps()),format.raw/*738.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*743.50*/("""{"""),format.raw/*743.51*/("""
"""),format.raw/*744.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*747.63*/("""{"""),format.raw/*747.64*/("""
                                """),format.raw/*748.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*749.61*/("""{"""),format.raw/*749.62*/("""
                                    """),format.raw/*750.37*/("""if (obj.status) """),format.raw/*750.53*/("""{"""),format.raw/*750.54*/("""
                                        """),format.raw/*751.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*752.37*/("""}"""),format.raw/*752.38*/("""
                                """),format.raw/*753.33*/("""}"""),format.raw/*753.34*/("""
"""),format.raw/*754.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*756.49*/("""{"""),format.raw/*756.50*/("""
                                    """),format.raw/*757.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*758.33*/("""}"""),format.raw/*758.34*/("""


                                """),format.raw/*761.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*775.91*/("""{"""),format.raw/*775.92*/("""
                                    """),format.raw/*776.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*779.33*/("""}"""),format.raw/*779.34*/(""" """),format.raw/*779.35*/("""else """),format.raw/*779.40*/("""{"""),format.raw/*779.41*/("""
                                    """),format.raw/*780.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*782.33*/("""}"""),format.raw/*782.34*/("""
"""),format.raw/*783.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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
//                                            "data-todo='"""),format.raw/*803.59*/("""{"""),format.raw/*803.60*/("""'id':12,'todo':'xyz'"""),format.raw/*803.80*/("""}"""),format.raw/*803.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*809.29*/("""}"""),format.raw/*809.30*/("""

"""),format.raw/*811.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;

                        """),format.raw/*816.25*/("""}"""),format.raw/*816.26*/(""",
                        error: function (data) """),format.raw/*817.48*/("""{"""),format.raw/*817.49*/("""
                            """),format.raw/*818.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*820.25*/("""}"""),format.raw/*820.26*/("""
                    """),format.raw/*821.21*/("""}"""),format.raw/*821.22*/(""");
                """),format.raw/*822.17*/("""}"""),format.raw/*822.18*/("""
            """),format.raw/*823.13*/("""}"""),format.raw/*823.14*/("""

            """),format.raw/*825.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*825.67*/("""{"""),format.raw/*825.68*/("""
"""),format.raw/*826.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*842.42*/("""{"""),format.raw/*842.43*/("""
                    """),format.raw/*843.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*844.17*/("""}"""),format.raw/*844.18*/("""else"""),format.raw/*844.22*/("""{"""),format.raw/*844.23*/("""
                    """),format.raw/*845.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*846.17*/("""}"""),format.raw/*846.18*/("""
                """),format.raw/*847.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*866.13*/("""}"""),format.raw/*866.14*/(""");




            function totalGameTimer() """),format.raw/*871.39*/("""{"""),format.raw/*871.40*/("""

                """),format.raw/*873.17*/("""var sec = 0;

                function pad(val) """),format.raw/*875.35*/("""{"""),format.raw/*875.36*/("""
                    """),format.raw/*876.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*877.17*/("""}"""),format.raw/*877.18*/("""

                """),format.raw/*879.17*/("""var timer = setInterval(function () """),format.raw/*879.53*/("""{"""),format.raw/*879.54*/("""
                    """),format.raw/*880.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*882.17*/("""}"""),format.raw/*882.18*/(""", 1000);

                setTimeout(function () """),format.raw/*884.40*/("""{"""),format.raw/*884.41*/("""
                    """),format.raw/*885.21*/("""clearInterval(timer);
                """),format.raw/*886.17*/("""}"""),format.raw/*886.18*/(""", 50000000);
            """),format.raw/*887.13*/("""}"""),format.raw/*887.14*/("""
            """),format.raw/*888.13*/("""function refreshProjectSteps()"""),format.raw/*888.43*/("""{"""),format.raw/*888.44*/("""
                """),format.raw/*889.65*/("""
                """),format.raw/*890.17*/("""var result="";
            """),_display_(/*891.14*/for(phases <- model.getPhases()) yield /*891.46*/ {_display_(Seq[Any](format.raw/*891.48*/("""

                """),format.raw/*893.17*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                        "style='background-color: #DB8B00 !important;'" +
                        "onclick='onPhaseClick(id)' " +
                        "id='"""),_display_(/*896.31*/phases/*896.37*/.getPhaseId),format.raw/*896.48*/("""'>"""),_display_(/*896.51*/phases/*896.57*/.getPhaseName),format.raw/*896.70*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";


                """)))}),format.raw/*899.18*/("""
                """),format.raw/*900.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*903.13*/("""}"""),format.raw/*903.14*/("""

            """),format.raw/*905.13*/("""function newfunc()"""),format.raw/*905.31*/("""{"""),format.raw/*905.32*/("""
                """),format.raw/*906.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*908.13*/("""}"""),format.raw/*908.14*/("""
    """),format.raw/*909.5*/("""</script>
    <body style="background-image: url("""),_display_(/*910.41*/routes/*910.47*/.Assets.at("images/bg.jpg")),format.raw/*910.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*913.68*/model/*913.73*/.getUserName()),format.raw/*913.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*914.64*/model/*914.69*/.getGameId()),format.raw/*914.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*915.60*/model/*915.65*/.getTurnNo()),format.raw/*915.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*916.68*/model/*916.73*/.getTimeForEachMove()),format.raw/*916.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*921.64*/routes/*921.70*/.DashboardController.viewDashboard()),format.raw/*921.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*929.51*/("""
                """),format.raw/*930.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*930.95*/model/*930.100*/.getGameId()),format.raw/*930.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*933.44*/model/*933.49*/.getStepsForEachPlayer()),format.raw/*933.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*940.126*/model/*940.131*/.getUserName().split("@")/*940.156*/(0)),format.raw/*940.159*/("""!</div>
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

                  <div class="panel panel-default">
                      <div class="panel-heading" style="background-color: #A8A2A3">
                          <h4 class="panel-title">Current Action</h4>
                      </div>
                      <div class="panel-body" style="height: 350px; overflow-wrap: break-word;text-align:justify;">
                          <div style=" display: inline-block;text-align:center;">Current Turn No: </div>

                 <div style=" display: inline-block;text-align:justify" id="turnNo">1</div>






                          <input type ="text" hidden id="btnIsProduction" value="false"/>
                          <div>Your last turn status:</div>

                            <div id="swalmessages">  </div>

                            <div id="myCurrentTurn" style="display: none;">
                            </div>
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
                            """),format.raw/*1018.105*/("""
                        """),format.raw/*1019.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1036.126*/model/*1036.131*/.getBudget()),format.raw/*1036.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1038.141*/model/*1038.146*/.getCapabilityPoints()),format.raw/*1038.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1040.139*/model/*1040.144*/.getCapabilityBonus()),format.raw/*1040.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1045.180*/model/*1045.185*/.getResources),format.raw/*1045.198*/("""</div>
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


                                              """),format.raw/*1068.138*/("""


                                          """),format.raw/*1071.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1081.83*/model/*1081.88*/.getBudget()),format.raw/*1081.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1082.84*/model/*1082.89*/.getCapabilityPoints()),format.raw/*1082.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1083.83*/model/*1083.88*/.getCapabilityBonus()),format.raw/*1083.109*/("""</div>
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


                                    """),_display_(/*1121.38*/for(phase <- model.getPhases()) yield /*1121.69*/ {_display_(Seq[Any](format.raw/*1121.71*/("""
                                        """),_display_(/*1122.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1122.95*/{_display_(Seq[Any](format.raw/*1122.96*/("""

                                            """),format.raw/*1124.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1127.49*/phase/*1127.54*/.getPhaseId),format.raw/*1127.65*/(""">"""),_display_(/*1127.67*/phase/*1127.72*/.getPhaseName()),format.raw/*1127.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1129.42*/else/*1129.46*/{_display_(Seq[Any](format.raw/*1129.47*/("""
                                            """),format.raw/*1130.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1133.49*/phase/*1133.54*/.getPhaseId),format.raw/*1133.65*/(""">"""),_display_(/*1133.67*/phase/*1133.72*/.getPhaseName()),format.raw/*1133.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1135.42*/("""

                                    """)))}),format.raw/*1137.38*/("""


                                """),format.raw/*1140.33*/("""</div>





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
                    """),format.raw/*1211.51*/("""
                    """),format.raw/*1212.55*/("""
                    """),format.raw/*1213.52*/("""
                    """),format.raw/*1214.105*/("""




                    """),format.raw/*1219.21*/("""<div class="panel panel-default" >
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
                  DATE: Sat Jul 29 02:40:36 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: d87b485ba108fd4c94ad8eb2d2ebb59f63e72b08
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4799->2834|4828->2835|4865->2845|5018->2970|5047->2971|5088->2984|5200->3069|5229->3070|5265->3079|5352->3138|5381->3139|5422->3152|5534->3237|5563->3238|5600->3248|5691->3311|5720->3312|5761->3325|5873->3410|5902->3411|5939->3421|5977->3431|6006->3432|6047->3445|6159->3530|6188->3531|6224->3540|6255->3543|6284->3544|6314->3547|6426->3632|6454->3633|6494->3646|6532->3656|6561->3657|6602->3670|6996->4037|7025->4038|7061->4047|7105->4063|7134->4064|7175->4077|7368->4242|7398->4243|7435->4252|7508->4296|7538->4297|7580->4310|7850->4552|7880->4553|7918->4563|8027->4644|8057->4645|8099->4658|8323->4854|8353->4855|8391->4865|8431->4876|8461->4877|8503->4890|9075->5434|9105->5435|9142->5444|9182->5455|9212->5456|9254->5469|9617->5804|9647->5805|9685->5815|9731->5832|9761->5833|9803->5846|10024->6039|10054->6040|10091->6049|10132->6061|10162->6062|10204->6075|10474->6317|10504->6318|10545->6331|10642->6399|10672->6400|10719->6418|10779->6449|10809->6450|10851->6463|10945->6528|10975->6529|11022->6547|11093->6589|11123->6590|11165->6603|11225->6634|11255->6635|11301->6652|11385->6707|11415->6708|11465->6729|11534->6770|11550->6776|11602->6806|11853->7028|11883->7029|11912->7030|12191->7280|12221->7281|12280->7311|12641->7643|12671->7644|12700->7645|12933->7849|12963->7850|12996->7854|13026->7855|13088->7888|13167->7938|13197->7939|13258->7971|14344->9028|14374->9029|14436->9062|14676->9273|14706->9274|14739->9278|14769->9279|14831->9312|14961->9413|14991->9414|15020->9415|16575->10941|16605->10942|16659->10967|16809->11088|16839->11089|16913->11134|16943->11135|16997->11160|17118->11252|17148->11253|17194->11270|17224->11271|17269->11287|17299->11288|17342->11302|17427->11358|17457->11359|17500->11373|18019->11863|18049->11864|18099->11885|18254->12011|18284->12012|18317->12016|18347->12017|18397->12038|18498->12110|18528->12111|18574->12128|19424->12949|19454->12950|19526->12993|19556->12994|19585->12995|19827->13208|19857->13209|19901->13224|20080->13374|20110->13375|20139->13376|20264->13472|20294->13473|20344->13494|20402->13523|20432->13524|20478->13541|20514->13548|20544->13549|20594->13570|20663->13611|20679->13617|20737->13653|20948->13835|20978->13836|21033->13862|21222->14022|21252->14023|21310->14052|21441->14154|21471->14155|21533->14188|21665->14291|21695->14292|21725->14294|22965->15505|22995->15506|23057->15539|23297->15750|23327->15751|23360->15755|23390->15756|23452->15789|23582->15890|23612->15891|23641->15892|24003->16225|24033->16226|24095->16259|24153->16288|24183->16289|24249->16326|25738->17786|25768->17787|25817->17807|25847->17808|26201->18133|26231->18134|26264->18138|26294->18139|26360->18176|27857->19644|27887->19645|27936->19665|27966->19666|28320->19991|28350->19992|28410->20023|28440->20024|28473->20028|28503->20029|28565->20062|29998->21466|30028->21467|30077->21487|30107->21488|30445->21797|30475->21798|30531->21825|30561->21826|30590->21827|30902->22110|30932->22111|31006->22156|31036->22157|31090->22182|31225->22288|31255->22289|31301->22306|31331->22307|31376->22323|31406->22324|31450->22339|31505->22365|31535->22366|31565->22368|31928->22702|31958->22703|32008->22724|32047->22734|32077->22735|32131->22760|32250->22851|32265->22856|32297->22866|33318->23858|33348->23859|33395->23877|33425->23878|33472->23896|33561->23956|33591->23957|33620->23958|33712->24021|33742->24022|33796->24047|33915->24138|33930->24143|33962->24153|34980->25142|35010->25143|35057->25161|35087->25162|35134->25180|35195->25212|35225->25213|35254->25214|35346->25277|35376->25278|35430->25303|35545->25390|35560->25395|35592->25405|36615->26399|36645->26400|36692->26418|36722->26419|36752->26420|36785->26424|36815->26425|36865->26446|36904->26456|36934->26457|36988->26482|37103->26569|37118->26574|37150->26584|38163->27568|38193->27569|38240->27587|38270->27588|38317->27606|38353->27613|38383->27614|38433->27635|38502->27676|38518->27682|38569->27711|38831->27944|38861->27945|38915->27970|39105->28131|39135->28132|39164->28133|39278->28218|39308->28219|39378->28260|39751->28604|39781->28605|39867->28662|39897->28663|39967->28704|40011->28719|40041->28720|40070->28721|40278->28900|40308->28901|40374->28938|40404->28939|40460->28966|40490->28967|40545->28993|40631->29050|40661->29051|40718->29079|40902->29234|40932->29235|40994->29268|41109->29354|41139->29355|41197->29384|41251->29409|41281->29410|41343->29443|41465->29536|41495->29537|41553->29566|41606->29590|41636->29591|41698->29624|41818->29715|41848->29716|41906->29745|41960->29770|41990->29771|42052->29804|42164->29887|42194->29888|42252->29917|42372->30008|42402->30009|42434->30012|42552->30100|42583->30101|43092->30581|43122->30582|43176->30607|43241->30643|43271->30644|43330->30674|43449->30764|43479->30765|43541->30798|43660->30888|43690->30889|43748->30918|43806->30947|43836->30948|43898->30981|44024->31078|44054->31079|44112->31108|44169->31136|44199->31137|44261->31170|44385->31265|44415->31266|44473->31295|44531->31324|44561->31325|44623->31358|44739->31445|44769->31446|44827->31475|44947->31566|44977->31567|45009->31570|45134->31665|45165->31666|45742->32214|45772->32215|45826->32240|45893->32278|45923->32279|45981->32308|46080->32378|46110->32379|46172->32412|46341->32552|46371->32553|46429->32582|46462->32586|46492->32587|46554->32620|46718->32755|46748->32756|46807->32786|46972->32922|47002->32923|47056->32948|47121->32984|47151->32985|47209->33014|47279->33055|47309->33056|47371->33089|47407->33096|47437->33097|47469->33100|47573->33174|47604->33175|47813->33355|47843->33356|47898->33382|47928->33383|47982->33408|48043->33440|48073->33441|48131->33470|48193->33503|48223->33504|48285->33537|48321->33544|48351->33545|48383->33548|48511->33646|48542->33647|48757->33833|48787->33834|48845->33863|48878->33867|48908->33868|48970->33901|49006->33908|49036->33909|49068->33912|49181->33995|49212->33996|49427->34182|49457->34183|49511->34208|49541->34209|49595->34234|49653->34263|49683->34264|49741->34293|49777->34300|49807->34301|49839->34304|49963->34398|49994->34399|50202->34578|50232->34579|50286->34604|51137->35426|51167->35427|51226->35457|51363->35565|51393->35566|51447->35591|51521->35636|51551->35637|51625->35682|51655->35683|51707->35706|51893->35863|51923->35864|51969->35881|51999->35882|52043->35897|52073->35898|52116->35912|52251->36018|52281->36019|52329->36038|52573->36253|52603->36254|52653->36275|52720->36313|52750->36314|52824->36359|52854->36360|52904->36381|52938->36386|52968->36387|53000->36390|53232->36592|53263->36593|53305->36605|53336->36606|53382->36623|53627->36839|53657->36840|53715->36869|53817->36942|53847->36943|53984->37051|54014->37052|54072->37081|54201->37181|54231->37182|54293->37215|54363->37256|54393->37257|54447->37282|54477->37283|54832->37609|54862->37610|54916->37635|55070->37760|55100->37761|55154->37786|55184->37787|55232->37806|55262->37807|55309->37825|55343->37830|55373->37831|55424->37853|55460->37860|55490->37861|55544->37886|55617->37931|55633->37937|55688->37970|55977->38230|56007->38231|56036->38232|56291->38458|56321->38459|56383->38492|56491->38571|56521->38572|56587->38609|56632->38625|56662->38626|56732->38667|56820->38726|56850->38727|56912->38760|56942->38761|56971->38762|57145->38907|57175->38908|57241->38945|57333->39008|57363->39009|57427->39044|58571->40159|58601->40160|58667->40197|58919->40420|58949->40421|58979->40422|59013->40427|59043->40428|59109->40465|59251->40578|59281->40579|59310->40580|61074->42315|61104->42316|61153->42336|61183->42337|61682->42807|61712->42808|61742->42810|62086->43125|62116->43126|62194->43175|62224->43176|62282->43205|62411->43305|62441->43306|62491->43327|62521->43328|62569->43347|62599->43348|62641->43361|62671->43362|62714->43376|62797->43430|62827->43431|62856->43432|63799->44346|63829->44347|63879->44368|64035->44495|64065->44496|64098->44500|64128->44501|64178->44522|64275->44590|64305->44591|64351->44608|65439->45667|65469->45668|65543->45713|65573->45714|65620->45732|65697->45780|65727->45781|65777->45802|65856->45852|65886->45853|65933->45871|65998->45907|66028->45908|66078->45929|66283->46105|66313->46106|66391->46155|66421->46156|66471->46177|66538->46215|66568->46216|66622->46241|66652->46242|66694->46255|66753->46285|66783->46286|66829->46351|66875->46368|66931->46396|66980->46428|67021->46430|67068->46448|67319->46671|67335->46677|67368->46688|67399->46691|67415->46697|67450->46710|67564->46792|67610->46809|67751->46921|67781->46922|67824->46936|67871->46954|67901->46955|67947->46972|68028->47024|68058->47025|68091->47030|68169->47080|68185->47086|68234->47113|68488->47339|68503->47344|68539->47358|68634->47425|68649->47430|68683->47442|68774->47505|68789->47510|68823->47522|68922->47593|68937->47598|68980->47619|69209->47820|69225->47826|69284->47862|69541->48124|69587->48141|69693->48219|69709->48224|69744->48236|69935->48399|69950->48404|69996->48428|70461->48864|70477->48869|70513->48894|70539->48897|74028->52431|74083->52456|74752->53095|74769->53100|74805->53112|75039->53316|75056->53321|75102->53343|75334->53545|75351->53550|75396->53571|75832->53977|75849->53982|75886->53995|77008->55177|77083->55222|77951->56061|77967->56066|78003->56078|78122->56168|78138->56173|78184->56195|78302->56284|78318->56289|78363->56310|80675->58593|80724->58624|80766->58626|80837->58668|80901->58721|80942->58722|81018->58768|81298->59019|81314->59024|81348->59035|81379->59037|81395->59042|81433->59057|81601->59204|81616->59208|81657->59209|81732->59254|82027->59520|82043->59525|82077->59536|82108->59538|82124->59543|82162->59558|82342->59705|82414->59744|82479->59779|85405->62705|85456->62760|85507->62812|85559->62917|85614->62942
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|190->160|190->160|192->162|193->163|193->163|194->164|196->166|196->166|198->168|199->169|199->169|200->170|200->170|200->170|201->171|202->172|202->172|203->173|204->174|204->174|204->174|209->179|209->179|210->180|214->184|214->184|216->186|221->191|221->191|222->192|225->195|225->195|225->195|225->195|226->196|227->197|227->197|231->201|245->215|245->215|246->216|249->219|249->219|249->219|249->219|250->220|252->222|252->222|253->223|276->246|276->246|277->247|279->249|279->249|280->250|280->250|281->251|283->253|283->253|284->254|284->254|286->256|286->256|288->258|288->258|288->258|289->259|299->269|299->269|300->270|301->271|301->271|301->271|301->271|302->272|303->273|303->273|304->274|321->291|321->291|323->293|323->293|324->294|330->300|330->300|333->303|337->307|337->307|338->308|340->310|340->310|341->311|342->312|342->312|343->313|343->313|343->313|344->314|345->315|345->315|345->315|349->319|349->319|351->321|354->324|354->324|355->325|358->328|358->328|359->329|361->331|361->331|363->333|381->351|381->351|382->352|385->355|385->355|385->355|385->355|386->356|388->358|388->358|389->359|393->363|393->363|394->364|394->364|394->364|395->365|410->380|410->380|410->380|410->380|415->385|415->385|415->385|415->385|416->386|431->401|431->401|431->401|431->401|436->406|436->406|439->409|439->409|439->409|439->409|440->410|455->425|455->425|455->425|455->425|460->430|460->430|463->433|463->433|464->434|468->438|468->438|469->439|469->439|470->440|472->442|472->442|473->443|473->443|475->445|475->445|478->448|478->448|478->448|480->450|484->454|484->454|485->455|485->455|485->455|486->456|488->458|488->458|488->458|503->473|503->473|504->474|504->474|506->476|506->476|506->476|507->477|508->478|508->478|509->479|511->481|511->481|511->481|526->496|526->496|527->497|527->497|529->499|529->499|529->499|530->500|531->501|531->501|532->502|534->504|534->504|534->504|549->519|549->519|550->520|550->520|550->520|550->520|550->520|551->521|551->521|551->521|552->522|554->524|554->524|554->524|569->539|569->539|570->540|570->540|572->542|572->542|572->542|573->543|574->544|574->544|574->544|579->549|579->549|580->550|582->552|582->552|583->553|584->554|584->554|585->555|590->560|590->560|591->561|591->561|592->562|592->562|592->562|593->563|596->566|596->566|597->567|597->567|598->568|598->568|601->571|602->572|602->572|603->573|607->577|607->577|608->578|609->579|609->579|610->580|610->580|610->580|611->581|612->582|612->582|613->583|613->583|613->583|614->584|615->585|615->585|616->586|616->586|616->586|617->587|618->588|618->588|619->589|621->591|621->591|621->591|621->591|621->591|628->598|628->598|629->599|629->599|629->599|631->601|633->603|633->603|634->604|635->605|635->605|636->606|636->606|636->606|637->607|638->608|638->608|639->609|639->609|639->609|640->610|641->611|641->611|642->612|642->612|642->612|643->613|644->614|644->614|645->615|647->617|647->617|647->617|647->617|647->617|655->625|655->625|656->626|656->626|656->626|657->627|658->628|658->628|659->629|660->630|660->630|661->631|661->631|661->631|662->632|663->633|663->633|665->635|667->637|667->637|668->638|668->638|668->638|669->639|669->639|669->639|670->640|670->640|670->640|670->640|670->640|670->640|673->643|673->643|675->645|675->645|676->646|676->646|676->646|677->647|677->647|677->647|678->648|678->648|678->648|678->648|678->648|678->648|681->651|681->651|682->652|682->652|682->652|683->653|683->653|683->653|683->653|683->653|683->653|686->656|686->656|687->657|687->657|688->658|689->659|689->659|690->660|690->660|690->660|690->660|690->660|690->660|693->663|693->663|694->664|705->675|705->675|707->677|709->679|709->679|710->680|713->683|713->683|714->684|714->684|715->685|718->688|718->688|719->689|719->689|720->690|720->690|722->692|724->694|724->694|726->696|731->701|731->701|732->702|733->703|733->703|735->705|735->705|736->706|736->706|736->706|736->706|736->706|736->706|736->706|736->706|738->708|740->710|740->710|741->711|744->714|744->714|746->716|746->716|747->717|749->719|749->719|750->720|751->721|751->721|752->722|752->722|758->728|758->728|759->729|760->730|760->730|761->731|761->731|762->732|762->732|764->734|764->734|764->734|766->736|766->736|766->736|767->737|768->738|768->738|768->738|773->743|773->743|774->744|777->747|777->747|778->748|779->749|779->749|780->750|780->750|780->750|781->751|782->752|782->752|783->753|783->753|784->754|786->756|786->756|787->757|788->758|788->758|791->761|805->775|805->775|806->776|809->779|809->779|809->779|809->779|809->779|810->780|812->782|812->782|813->783|833->803|833->803|833->803|833->803|839->809|839->809|841->811|846->816|846->816|847->817|847->817|848->818|850->820|850->820|851->821|851->821|852->822|852->822|853->823|853->823|855->825|855->825|855->825|856->826|872->842|872->842|873->843|874->844|874->844|874->844|874->844|875->845|876->846|876->846|877->847|896->866|896->866|901->871|901->871|903->873|905->875|905->875|906->876|907->877|907->877|909->879|909->879|909->879|910->880|912->882|912->882|914->884|914->884|915->885|916->886|916->886|917->887|917->887|918->888|918->888|918->888|919->889|920->890|921->891|921->891|921->891|923->893|926->896|926->896|926->896|926->896|926->896|926->896|929->899|930->900|933->903|933->903|935->905|935->905|935->905|936->906|938->908|938->908|939->909|940->910|940->910|940->910|943->913|943->913|943->913|944->914|944->914|944->914|945->915|945->915|945->915|946->916|946->916|946->916|951->921|951->921|951->921|959->929|960->930|960->930|960->930|960->930|963->933|963->933|963->933|970->940|970->940|970->940|970->940|1048->1018|1049->1019|1066->1036|1066->1036|1066->1036|1068->1038|1068->1038|1068->1038|1070->1040|1070->1040|1070->1040|1075->1045|1075->1045|1075->1045|1098->1068|1101->1071|1111->1081|1111->1081|1111->1081|1112->1082|1112->1082|1112->1082|1113->1083|1113->1083|1113->1083|1151->1121|1151->1121|1151->1121|1152->1122|1152->1122|1152->1122|1154->1124|1157->1127|1157->1127|1157->1127|1157->1127|1157->1127|1157->1127|1159->1129|1159->1129|1159->1129|1160->1130|1163->1133|1163->1133|1163->1133|1163->1133|1163->1133|1163->1133|1165->1135|1167->1137|1170->1140|1241->1211|1242->1212|1243->1213|1244->1214|1249->1219
                  -- GENERATED --
              */
          