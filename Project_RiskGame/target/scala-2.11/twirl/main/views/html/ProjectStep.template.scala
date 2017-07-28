
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
            """),format.raw/*33.13*/("""padding: 0px 30px 10px 30px !important;

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

                            swal("""),format.raw/*591.34*/("""{"""),format.raw/*591.35*/("""   """),format.raw/*591.38*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*591.126*/("""}"""),format.raw/*591.127*/(""");

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

                            swal("""),format.raw/*617.34*/("""{"""),format.raw/*617.35*/("""   """),format.raw/*617.38*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*617.133*/("""}"""),format.raw/*617.134*/(""");
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*623.25*/("""}"""),format.raw/*623.26*/("""
                        """),format.raw/*624.25*/("""else if(data.steptype == "production")"""),format.raw/*624.63*/("""{"""),format.raw/*624.64*/("""
                            """),format.raw/*625.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*626.52*/("""{"""),format.raw/*626.53*/("""
                                """),format.raw/*627.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*628.29*/("""}"""),format.raw/*628.30*/("""
                            """),format.raw/*629.29*/("""else"""),format.raw/*629.33*/("""{"""),format.raw/*629.34*/("""
                                """),format.raw/*630.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*631.29*/("""}"""),format.raw/*631.30*/("""

                            """),format.raw/*633.29*/("""swal(alertmsg);
                        """),format.raw/*634.25*/("""}"""),format.raw/*634.26*/("""
                        """),format.raw/*635.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*635.61*/("""{"""),format.raw/*635.62*/("""
                            """),format.raw/*636.29*/("""if($('#btnIsProduction').val() != "true")"""),format.raw/*636.70*/("""{"""),format.raw/*636.71*/("""
                                """),format.raw/*637.33*/("""swal("""),format.raw/*637.38*/("""{"""),format.raw/*637.39*/("""   """),format.raw/*637.42*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*637.116*/("""}"""),format.raw/*637.117*/(""");
                            """),format.raw/*638.29*/("""}"""),format.raw/*638.30*/("""

                        """),format.raw/*640.25*/("""}"""),format.raw/*640.26*/("""
                        """),format.raw/*641.25*/("""else if(data.steptype == "risk")"""),format.raw/*641.57*/("""{"""),format.raw/*641.58*/("""
                            """),format.raw/*642.29*/("""if(data.risk_status == "success")"""),format.raw/*642.62*/("""{"""),format.raw/*642.63*/("""
                                """),format.raw/*643.33*/("""swal("""),format.raw/*643.38*/("""{"""),format.raw/*643.39*/("""   """),format.raw/*643.42*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*643.140*/("""}"""),format.raw/*643.141*/(""");
                            """),format.raw/*644.29*/("""}"""),format.raw/*644.30*/("""
                            """),format.raw/*645.29*/("""else"""),format.raw/*645.33*/("""{"""),format.raw/*645.34*/("""
                                """),format.raw/*646.33*/("""swal("""),format.raw/*646.38*/("""{"""),format.raw/*646.39*/("""   """),format.raw/*646.42*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*646.125*/("""}"""),format.raw/*646.126*/(""");
                            """),format.raw/*647.29*/("""}"""),format.raw/*647.30*/("""
                        """),format.raw/*648.25*/("""}"""),format.raw/*648.26*/("""
                        """),format.raw/*649.25*/("""else
                        """),format.raw/*650.25*/("""{"""),format.raw/*650.26*/("""
                            """),format.raw/*651.29*/("""swal("""),format.raw/*651.34*/("""{"""),format.raw/*651.35*/("""   """),format.raw/*651.38*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*651.132*/("""}"""),format.raw/*651.133*/(""");

                        """),format.raw/*653.25*/("""}"""),format.raw/*653.26*/("""
                        """),format.raw/*654.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*665.91*/("""{"""),format.raw/*665.92*/("""

                            """),format.raw/*667.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*669.25*/("""}"""),format.raw/*669.26*/("""
                        """),format.raw/*670.25*/("""refreshProjectSteps();


                    """),format.raw/*673.21*/("""}"""),format.raw/*673.22*/(""",
                    error: function (data) """),format.raw/*674.44*/("""{"""),format.raw/*674.45*/("""
                      """),format.raw/*675.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*678.21*/("""}"""),format.raw/*678.22*/("""
                """),format.raw/*679.17*/("""}"""),format.raw/*679.18*/(""");
            """),format.raw/*680.13*/("""}"""),format.raw/*680.14*/("""

            """),format.raw/*682.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*684.47*/("""{"""),format.raw/*684.48*/("""

                 """),format.raw/*686.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*691.27*/("""{"""),format.raw/*691.28*/("""
                    """),format.raw/*692.21*/("""'phaseId': clicked_id
                """),format.raw/*693.17*/("""}"""),format.raw/*693.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*695.43*/("""{"""),format.raw/*695.44*/("""
                    """),format.raw/*696.21*/("""swal("""),format.raw/*696.26*/("""{"""),format.raw/*696.27*/("""   """),format.raw/*696.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*696.232*/("""}"""),format.raw/*696.233*/(""", function()"""),format.raw/*696.245*/("""{"""),format.raw/*696.246*/("""

               """),format.raw/*698.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*700.74*/("""{"""),format.raw/*700.75*/("""
                            """),format.raw/*701.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*704.25*/("""}"""),format.raw/*704.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*706.61*/("""{"""),format.raw/*706.62*/("""
                            """),format.raw/*707.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*709.54*/("""{"""),format.raw/*709.55*/("""
                                """),format.raw/*710.33*/("""riskcount++;
                            """),format.raw/*711.29*/("""}"""),format.raw/*711.30*/("""
                        """),format.raw/*712.25*/("""}"""),format.raw/*712.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*718.48*/("""{"""),format.raw/*718.49*/("""
                        """),format.raw/*719.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*720.21*/("""}"""),format.raw/*720.22*/("""
                        """),format.raw/*721.25*/("""}"""),format.raw/*721.26*/(""");
                """),format.raw/*722.17*/("""}"""),format.raw/*722.18*/("""

                """),format.raw/*724.17*/("""else """),format.raw/*724.22*/("""{"""),format.raw/*724.23*/("""

                    """),format.raw/*726.21*/("""$.ajax("""),format.raw/*726.28*/("""{"""),format.raw/*726.29*/("""
                        """),format.raw/*727.25*/("""type: 'POST',
                        url: '"""),_display_(/*728.32*/routes/*728.38*/.GameController.getProjectSteps()),format.raw/*728.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*733.50*/("""{"""),format.raw/*733.51*/("""
"""),format.raw/*734.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*737.63*/("""{"""),format.raw/*737.64*/("""
                                """),format.raw/*738.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*739.61*/("""{"""),format.raw/*739.62*/("""
                                    """),format.raw/*740.37*/("""if (obj.status) """),format.raw/*740.53*/("""{"""),format.raw/*740.54*/("""
                                        """),format.raw/*741.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*742.37*/("""}"""),format.raw/*742.38*/("""
                                """),format.raw/*743.33*/("""}"""),format.raw/*743.34*/("""
"""),format.raw/*744.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*746.49*/("""{"""),format.raw/*746.50*/("""
                                    """),format.raw/*747.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*748.33*/("""}"""),format.raw/*748.34*/("""


                                """),format.raw/*751.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*765.91*/("""{"""),format.raw/*765.92*/("""
                                    """),format.raw/*766.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*769.33*/("""}"""),format.raw/*769.34*/(""" """),format.raw/*769.35*/("""else """),format.raw/*769.40*/("""{"""),format.raw/*769.41*/("""
                                    """),format.raw/*770.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*772.33*/("""}"""),format.raw/*772.34*/("""
"""),format.raw/*773.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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
//                                            "data-todo='"""),format.raw/*793.59*/("""{"""),format.raw/*793.60*/("""'id':12,'todo':'xyz'"""),format.raw/*793.80*/("""}"""),format.raw/*793.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*799.29*/("""}"""),format.raw/*799.30*/("""

"""),format.raw/*801.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;

                        """),format.raw/*806.25*/("""}"""),format.raw/*806.26*/(""",
                        error: function (data) """),format.raw/*807.48*/("""{"""),format.raw/*807.49*/("""
                            """),format.raw/*808.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*810.25*/("""}"""),format.raw/*810.26*/("""
                    """),format.raw/*811.21*/("""}"""),format.raw/*811.22*/(""");
                """),format.raw/*812.17*/("""}"""),format.raw/*812.18*/("""
            """),format.raw/*813.13*/("""}"""),format.raw/*813.14*/("""

            """),format.raw/*815.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*815.67*/("""{"""),format.raw/*815.68*/("""
"""),format.raw/*816.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*832.42*/("""{"""),format.raw/*832.43*/("""
                    """),format.raw/*833.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*834.17*/("""}"""),format.raw/*834.18*/("""else"""),format.raw/*834.22*/("""{"""),format.raw/*834.23*/("""
                    """),format.raw/*835.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*836.17*/("""}"""),format.raw/*836.18*/("""
                """),format.raw/*837.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*856.13*/("""}"""),format.raw/*856.14*/(""");




            function totalGameTimer() """),format.raw/*861.39*/("""{"""),format.raw/*861.40*/("""

                """),format.raw/*863.17*/("""var sec = 0;

                function pad(val) """),format.raw/*865.35*/("""{"""),format.raw/*865.36*/("""
                    """),format.raw/*866.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*867.17*/("""}"""),format.raw/*867.18*/("""

                """),format.raw/*869.17*/("""var timer = setInterval(function () """),format.raw/*869.53*/("""{"""),format.raw/*869.54*/("""
                    """),format.raw/*870.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*872.17*/("""}"""),format.raw/*872.18*/(""", 1000);

                setTimeout(function () """),format.raw/*874.40*/("""{"""),format.raw/*874.41*/("""
                    """),format.raw/*875.21*/("""clearInterval(timer);
                """),format.raw/*876.17*/("""}"""),format.raw/*876.18*/(""", 50000000);
            """),format.raw/*877.13*/("""}"""),format.raw/*877.14*/("""
            """),format.raw/*878.13*/("""function refreshProjectSteps()"""),format.raw/*878.43*/("""{"""),format.raw/*878.44*/("""
                """),format.raw/*879.65*/("""
                """),format.raw/*880.17*/("""var result="";
            """),_display_(/*881.14*/for(phases <- model.getPhases()) yield /*881.46*/ {_display_(Seq[Any](format.raw/*881.48*/("""

                """),format.raw/*883.17*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                        "style='background-color: #DB8B00 !important;'" +
                        "onclick='onPhaseClick(id)' " +
                        "id='"""),_display_(/*886.31*/phases/*886.37*/.getPhaseId),format.raw/*886.48*/("""'>"""),_display_(/*886.51*/phases/*886.57*/.getPhaseName),format.raw/*886.70*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";


                """)))}),format.raw/*889.18*/("""
                """),format.raw/*890.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*893.13*/("""}"""),format.raw/*893.14*/("""

            """),format.raw/*895.13*/("""function newfunc()"""),format.raw/*895.31*/("""{"""),format.raw/*895.32*/("""
                """),format.raw/*896.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*898.13*/("""}"""),format.raw/*898.14*/("""
    """),format.raw/*899.5*/("""</script>
    <body style="background-image: url("""),_display_(/*900.41*/routes/*900.47*/.Assets.at("images/bg.jpg")),format.raw/*900.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*903.68*/model/*903.73*/.getUserName()),format.raw/*903.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*904.64*/model/*904.69*/.getGameId()),format.raw/*904.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*905.60*/model/*905.65*/.getTurnNo()),format.raw/*905.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*906.68*/model/*906.73*/.getTimeForEachMove()),format.raw/*906.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" >

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*911.64*/routes/*911.70*/.DashboardController.viewDashboard()),format.raw/*911.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*919.51*/("""
                """),format.raw/*920.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*920.95*/model/*920.100*/.getGameId()),format.raw/*920.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*923.44*/model/*923.49*/.getStepsForEachPlayer()),format.raw/*923.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*930.126*/model/*930.131*/.getUserName().split("@")/*930.156*/(0)),format.raw/*930.159*/("""!</div>
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




            <div class="col-xs-12" style="height: 30px;"></div>

            <header>

                    <!--// start of big1 div -->
                <div class="col-md-2" style="border-right: 1px dashed #969C9E">

                  <div class="panel panel-default">
                      <div class="panel-heading" style="background-color: #A8A2A3">
                          <h4 class="panel-title">Current Action</h4>
                      </div>
                      <div class="panel-body" style="height: 350px;width:200px; overflow-wrap: break-word;overflow-y: scroll">
                          <div style=" display: inline-block;">Turn No: </div><div style=" display: inline-block;" id="turnNo">1</div>


                          <input type ="text" hidden id="btnIsProduction" value="false"/>
                          <div>Your last turn:</div>
                          <div id="myCurrentTurn"></div>

                      </div>

                  </div>

                      <!-- \\ end of second div -->



                        <!-- //second div -->


                        <!-- \\ start of third div -->
                        <div class="panel panel-default" style="width:195px;margin-bottom: 5px; background: beige;">
                            <div class="panel-heading" style="background-color: #A8A2A3">
                                <h4 class="panel-title">Chat</h4>
                            </div>
                            <div id="chatArea" class="panel-body" style="height: 100px;font-size: 12px;
                                border: 1px solid transparent;
                                background-size: 100% 100%; overflow-wrap: break-word;overflow-y: scroll;text-align: left">
                            </div>

                        </div>

                        <textarea id="txtMessage" placeholder="Enter text (max 250 characters) and hit enter." style="width:195px;margin-bottom:20px;">

                        </textarea>
                        <div>
                            """),format.raw/*999.105*/("""
                        """),format.raw/*1000.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1017.126*/model/*1017.131*/.getBudget()),format.raw/*1017.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1019.141*/model/*1019.146*/.getCapabilityPoints()),format.raw/*1019.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1021.139*/model/*1021.144*/.getCapabilityBonus()),format.raw/*1021.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1026.180*/model/*1026.185*/.getResources),format.raw/*1026.198*/("""</div>
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


                                              """),format.raw/*1049.138*/("""


                                          """),format.raw/*1052.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1062.83*/model/*1062.88*/.getBudget()),format.raw/*1062.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1063.84*/model/*1063.89*/.getCapabilityPoints()),format.raw/*1063.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1064.83*/model/*1064.88*/.getCapabilityBonus()),format.raw/*1064.109*/("""</div>
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


                                    """),_display_(/*1102.38*/for(phase <- model.getPhases()) yield /*1102.69*/ {_display_(Seq[Any](format.raw/*1102.71*/("""
                                        """),_display_(/*1103.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1103.95*/{_display_(Seq[Any](format.raw/*1103.96*/("""

                                            """),format.raw/*1105.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1108.49*/phase/*1108.54*/.getPhaseId),format.raw/*1108.65*/(""">"""),_display_(/*1108.67*/phase/*1108.72*/.getPhaseName()),format.raw/*1108.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1110.42*/else/*1110.46*/{_display_(Seq[Any](format.raw/*1110.47*/("""
                                            """),format.raw/*1111.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1114.49*/phase/*1114.54*/.getPhaseId),format.raw/*1114.65*/(""">"""),_display_(/*1114.67*/phase/*1114.72*/.getPhaseName()),format.raw/*1114.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1116.42*/("""

                                    """)))}),format.raw/*1118.38*/("""


                                """),format.raw/*1121.33*/("""</div>





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
                    border-width: thin">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Active Players </h4>
                        </div>
                        <div id="activePlayersList" class="panel-body" style="height: 60px;overflow-wrap: break-word;overflow-y: scroll">
                            user1<br/>
                            user2<br/>
                        </div>
                    </div>
                    """),format.raw/*1192.51*/("""
                    """),format.raw/*1193.55*/("""
                    """),format.raw/*1194.52*/("""
                    """),format.raw/*1195.105*/("""




                    """),format.raw/*1200.21*/("""<div class="panel panel-default" style="width:195px;overflow-y: scroll">
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
                  DATE: Fri Jul 28 19:30:27 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: 6ce720a0ffa3be981f6e5c39fd0237562bdd65aa
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3954->2488|3983->2489|4020->2499|4051->2502|4080->2503|4121->2516|4211->2579|4240->2580|4277->2590|4322->2607|4351->2608|4392->2621|4482->2684|4511->2685|4548->2695|4589->2708|4618->2709|4660->2723|4804->2839|4833->2840|4870->2850|5023->2975|5052->2976|5093->2989|5205->3074|5234->3075|5270->3084|5357->3143|5386->3144|5427->3157|5539->3242|5568->3243|5605->3253|5696->3316|5725->3317|5766->3330|5878->3415|5907->3416|5944->3426|5982->3436|6011->3437|6052->3450|6164->3535|6193->3536|6229->3545|6260->3548|6289->3549|6319->3552|6431->3637|6459->3638|6499->3651|6537->3661|6566->3662|6607->3675|7001->4042|7030->4043|7066->4052|7110->4068|7139->4069|7180->4082|7373->4247|7403->4248|7440->4257|7513->4301|7543->4302|7585->4315|7855->4557|7885->4558|7923->4568|8032->4649|8062->4650|8104->4663|8328->4859|8358->4860|8396->4870|8436->4881|8466->4882|8508->4895|9080->5439|9110->5440|9147->5449|9187->5460|9217->5461|9259->5474|9622->5809|9652->5810|9690->5820|9736->5837|9766->5838|9808->5851|10029->6044|10059->6045|10096->6054|10137->6066|10167->6067|10209->6080|10479->6322|10509->6323|10550->6336|10647->6404|10677->6405|10724->6423|10784->6454|10814->6455|10856->6468|10950->6533|10980->6534|11027->6552|11098->6594|11128->6595|11170->6608|11230->6639|11260->6640|11306->6657|11390->6712|11420->6713|11470->6734|11539->6775|11555->6781|11607->6811|11858->7033|11888->7034|11917->7035|12196->7285|12226->7286|12285->7316|12646->7648|12676->7649|12705->7650|12938->7854|12968->7855|13001->7859|13031->7860|13093->7893|13172->7943|13202->7944|13263->7976|14349->9033|14379->9034|14441->9067|14681->9278|14711->9279|14744->9283|14774->9284|14836->9317|14966->9418|14996->9419|15025->9420|16580->10946|16610->10947|16664->10972|16814->11093|16844->11094|16918->11139|16948->11140|17002->11165|17123->11257|17153->11258|17199->11275|17229->11276|17274->11292|17304->11293|17347->11307|17432->11363|17462->11364|17505->11378|18024->11868|18054->11869|18104->11890|18259->12016|18289->12017|18322->12021|18352->12022|18402->12043|18503->12115|18533->12116|18579->12133|19429->12954|19459->12955|19531->12998|19561->12999|19590->13000|19832->13213|19862->13214|19906->13229|20085->13379|20115->13380|20144->13381|20269->13477|20299->13478|20349->13499|20407->13528|20437->13529|20483->13546|20519->13553|20549->13554|20599->13575|20668->13616|20684->13622|20742->13658|20953->13840|20983->13841|21038->13867|21227->14027|21257->14028|21315->14057|21446->14159|21476->14160|21538->14193|21670->14296|21700->14297|21730->14299|22970->15510|23000->15511|23062->15544|23302->15755|23332->15756|23365->15760|23395->15761|23457->15794|23587->15895|23617->15896|23646->15897|24008->16230|24038->16231|24100->16264|24158->16293|24188->16294|24254->16331|25743->17791|25773->17792|25822->17812|25852->17813|26206->18138|26236->18139|26269->18143|26299->18144|26365->18181|27862->19649|27892->19650|27941->19670|27971->19671|28325->19996|28355->19997|28415->20028|28445->20029|28478->20033|28508->20034|28570->20067|30003->21471|30033->21472|30082->21492|30112->21493|30450->21802|30480->21803|30536->21830|30566->21831|30595->21832|30907->22115|30937->22116|31011->22161|31041->22162|31095->22187|31230->22293|31260->22294|31306->22311|31336->22312|31381->22328|31411->22329|31455->22344|31510->22370|31540->22371|31570->22373|31933->22707|31963->22708|32013->22729|32052->22739|32082->22740|32136->22765|32255->22856|32270->22861|32302->22871|33323->23863|33353->23864|33400->23882|33430->23883|33477->23901|33566->23961|33596->23962|33625->23963|33717->24026|33747->24027|33801->24052|33920->24143|33935->24148|33967->24158|34985->25147|35015->25148|35062->25166|35092->25167|35139->25185|35200->25217|35230->25218|35259->25219|35351->25282|35381->25283|35435->25308|35550->25395|35565->25400|35597->25410|36620->26404|36650->26405|36697->26423|36727->26424|36757->26425|36790->26429|36820->26430|36870->26451|36909->26461|36939->26462|36993->26487|37108->26574|37123->26579|37155->26589|38168->27573|38198->27574|38245->27592|38275->27593|38322->27611|38358->27618|38388->27619|38438->27640|38507->27681|38523->27687|38574->27716|38836->27949|38866->27950|38920->27975|39110->28136|39140->28137|39169->28138|39283->28223|39313->28224|39383->28265|39756->28609|39786->28610|39872->28667|39902->28668|39972->28709|40016->28724|40046->28725|40075->28726|40283->28905|40313->28906|40379->28943|40409->28944|40465->28971|40495->28972|40550->28998|40636->29055|40666->29056|40723->29084|40907->29239|40937->29240|40999->29273|41114->29359|41144->29360|41202->29389|41256->29414|41286->29415|41348->29448|41470->29541|41500->29542|41558->29571|41611->29595|41641->29596|41703->29629|41823->29720|41853->29721|41911->29750|41965->29775|41995->29776|42057->29809|42169->29892|42199->29893|42257->29922|42375->30011|42405->30012|42437->30015|42555->30103|42586->30104|43006->30495|43036->30496|43090->30521|43155->30557|43185->30558|43244->30588|43363->30678|43393->30679|43455->30712|43574->30802|43604->30803|43662->30832|43720->30861|43750->30862|43812->30895|43938->30992|43968->30993|44026->31022|44083->31050|44113->31051|44175->31084|44299->31179|44329->31180|44387->31209|44445->31238|44475->31239|44537->31272|44653->31359|44683->31360|44741->31389|44859->31478|44889->31479|44921->31482|45046->31577|45077->31578|45503->31975|45533->31976|45587->32001|45654->32039|45684->32040|45742->32069|45841->32139|45871->32140|45933->32173|46102->32313|46132->32314|46190->32343|46223->32347|46253->32348|46315->32381|46479->32516|46509->32517|46568->32547|46637->32587|46667->32588|46721->32613|46786->32649|46816->32650|46874->32679|46944->32720|46974->32721|47036->32754|47070->32759|47100->32760|47132->32763|47236->32837|47267->32838|47327->32869|47357->32870|47412->32896|47442->32897|47496->32922|47557->32954|47587->32955|47645->32984|47707->33017|47737->33018|47799->33051|47833->33056|47863->33057|47895->33060|48023->33158|48054->33159|48114->33190|48144->33191|48202->33220|48235->33224|48265->33225|48327->33258|48361->33263|48391->33264|48423->33267|48536->33350|48567->33351|48627->33382|48657->33383|48711->33408|48741->33409|48795->33434|48853->33463|48883->33464|48941->33493|48975->33498|49005->33499|49037->33502|49161->33596|49192->33597|49249->33625|49279->33626|49333->33651|50184->34473|50214->34474|50273->34504|50410->34612|50440->34613|50494->34638|50568->34683|50598->34684|50672->34729|50702->34730|50754->34753|50940->34910|50970->34911|51016->34928|51046->34929|51090->34944|51120->34945|51163->34959|51298->35065|51328->35066|51376->35085|51620->35300|51650->35301|51700->35322|51767->35360|51797->35361|51871->35406|51901->35407|51951->35428|51985->35433|52015->35434|52047->35437|52279->35639|52310->35640|52352->35652|52383->35653|52429->35670|52674->35886|52704->35887|52762->35916|52864->35989|52894->35990|53031->36098|53061->36099|53119->36128|53248->36228|53278->36229|53340->36262|53410->36303|53440->36304|53494->36329|53524->36330|53879->36656|53909->36657|53963->36682|54117->36807|54147->36808|54201->36833|54231->36834|54279->36853|54309->36854|54356->36872|54390->36877|54420->36878|54471->36900|54507->36907|54537->36908|54591->36933|54664->36978|54680->36984|54735->37017|55024->37277|55054->37278|55083->37279|55338->37505|55368->37506|55430->37539|55538->37618|55568->37619|55634->37656|55679->37672|55709->37673|55779->37714|55867->37773|55897->37774|55959->37807|55989->37808|56018->37809|56192->37954|56222->37955|56288->37992|56380->38055|56410->38056|56474->38091|57618->39206|57648->39207|57714->39244|57966->39467|57996->39468|58026->39469|58060->39474|58090->39475|58156->39512|58298->39625|58328->39626|58357->39627|60121->41362|60151->41363|60200->41383|60230->41384|60729->41854|60759->41855|60789->41857|61133->42172|61163->42173|61241->42222|61271->42223|61329->42252|61458->42352|61488->42353|61538->42374|61568->42375|61616->42394|61646->42395|61688->42408|61718->42409|61761->42423|61844->42477|61874->42478|61903->42479|62846->43393|62876->43394|62926->43415|63082->43542|63112->43543|63145->43547|63175->43548|63225->43569|63322->43637|63352->43638|63398->43655|64486->44714|64516->44715|64590->44760|64620->44761|64667->44779|64744->44827|64774->44828|64824->44849|64903->44899|64933->44900|64980->44918|65045->44954|65075->44955|65125->44976|65330->45152|65360->45153|65438->45202|65468->45203|65518->45224|65585->45262|65615->45263|65669->45288|65699->45289|65741->45302|65800->45332|65830->45333|65876->45398|65922->45415|65978->45443|66027->45475|66068->45477|66115->45495|66366->45718|66382->45724|66415->45735|66446->45738|66462->45744|66497->45757|66611->45839|66657->45856|66798->45968|66828->45969|66871->45983|66918->46001|66948->46002|66994->46019|67075->46071|67105->46072|67138->46077|67216->46127|67232->46133|67281->46160|67535->46386|67550->46391|67586->46405|67681->46472|67696->46477|67730->46489|67821->46552|67836->46557|67870->46569|67969->46640|67984->46645|68027->46666|68212->46823|68228->46829|68287->46865|68544->47127|68590->47144|68696->47222|68712->47227|68747->47239|68938->47402|68953->47407|68999->47431|69464->47867|69480->47872|69516->47897|69542->47900|72791->51195|72846->51220|73515->51859|73532->51864|73568->51876|73802->52080|73819->52085|73865->52107|74097->52309|74114->52314|74159->52335|74595->52741|74612->52746|74649->52759|75771->53941|75846->53986|76714->54825|76730->54830|76766->54842|76885->54932|76901->54937|76947->54959|77065->55048|77081->55053|77126->55074|79438->57357|79487->57388|79529->57390|79600->57432|79664->57485|79705->57486|79781->57532|80061->57783|80077->57788|80111->57799|80142->57801|80158->57806|80196->57821|80364->57968|80379->57972|80420->57973|80495->58018|80790->58284|80806->58289|80840->58300|80871->58302|80887->58307|80925->58322|81105->58469|81177->58508|81242->58543|84148->61449|84199->61504|84250->61556|84302->61661|84357->61686
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|190->160|190->160|192->162|193->163|193->163|194->164|196->166|196->166|198->168|199->169|199->169|200->170|200->170|200->170|201->171|202->172|202->172|203->173|204->174|204->174|204->174|209->179|209->179|210->180|214->184|214->184|216->186|221->191|221->191|222->192|225->195|225->195|225->195|225->195|226->196|227->197|227->197|231->201|245->215|245->215|246->216|249->219|249->219|249->219|249->219|250->220|252->222|252->222|253->223|276->246|276->246|277->247|279->249|279->249|280->250|280->250|281->251|283->253|283->253|284->254|284->254|286->256|286->256|288->258|288->258|288->258|289->259|299->269|299->269|300->270|301->271|301->271|301->271|301->271|302->272|303->273|303->273|304->274|321->291|321->291|323->293|323->293|324->294|330->300|330->300|333->303|337->307|337->307|338->308|340->310|340->310|341->311|342->312|342->312|343->313|343->313|343->313|344->314|345->315|345->315|345->315|349->319|349->319|351->321|354->324|354->324|355->325|358->328|358->328|359->329|361->331|361->331|363->333|381->351|381->351|382->352|385->355|385->355|385->355|385->355|386->356|388->358|388->358|389->359|393->363|393->363|394->364|394->364|394->364|395->365|410->380|410->380|410->380|410->380|415->385|415->385|415->385|415->385|416->386|431->401|431->401|431->401|431->401|436->406|436->406|439->409|439->409|439->409|439->409|440->410|455->425|455->425|455->425|455->425|460->430|460->430|463->433|463->433|464->434|468->438|468->438|469->439|469->439|470->440|472->442|472->442|473->443|473->443|475->445|475->445|478->448|478->448|478->448|480->450|484->454|484->454|485->455|485->455|485->455|486->456|488->458|488->458|488->458|503->473|503->473|504->474|504->474|506->476|506->476|506->476|507->477|508->478|508->478|509->479|511->481|511->481|511->481|526->496|526->496|527->497|527->497|529->499|529->499|529->499|530->500|531->501|531->501|532->502|534->504|534->504|534->504|549->519|549->519|550->520|550->520|550->520|550->520|550->520|551->521|551->521|551->521|552->522|554->524|554->524|554->524|569->539|569->539|570->540|570->540|572->542|572->542|572->542|573->543|574->544|574->544|574->544|579->549|579->549|580->550|582->552|582->552|583->553|584->554|584->554|585->555|590->560|590->560|591->561|591->561|592->562|592->562|592->562|593->563|596->566|596->566|597->567|597->567|598->568|598->568|601->571|602->572|602->572|603->573|607->577|607->577|608->578|609->579|609->579|610->580|610->580|610->580|611->581|612->582|612->582|613->583|613->583|613->583|614->584|615->585|615->585|616->586|616->586|616->586|617->587|618->588|618->588|619->589|621->591|621->591|621->591|621->591|621->591|628->598|628->598|629->599|629->599|629->599|631->601|633->603|633->603|634->604|635->605|635->605|636->606|636->606|636->606|637->607|638->608|638->608|639->609|639->609|639->609|640->610|641->611|641->611|642->612|642->612|642->612|643->613|644->614|644->614|645->615|647->617|647->617|647->617|647->617|647->617|653->623|653->623|654->624|654->624|654->624|655->625|656->626|656->626|657->627|658->628|658->628|659->629|659->629|659->629|660->630|661->631|661->631|663->633|664->634|664->634|665->635|665->635|665->635|666->636|666->636|666->636|667->637|667->637|667->637|667->637|667->637|667->637|668->638|668->638|670->640|670->640|671->641|671->641|671->641|672->642|672->642|672->642|673->643|673->643|673->643|673->643|673->643|673->643|674->644|674->644|675->645|675->645|675->645|676->646|676->646|676->646|676->646|676->646|676->646|677->647|677->647|678->648|678->648|679->649|680->650|680->650|681->651|681->651|681->651|681->651|681->651|681->651|683->653|683->653|684->654|695->665|695->665|697->667|699->669|699->669|700->670|703->673|703->673|704->674|704->674|705->675|708->678|708->678|709->679|709->679|710->680|710->680|712->682|714->684|714->684|716->686|721->691|721->691|722->692|723->693|723->693|725->695|725->695|726->696|726->696|726->696|726->696|726->696|726->696|726->696|726->696|728->698|730->700|730->700|731->701|734->704|734->704|736->706|736->706|737->707|739->709|739->709|740->710|741->711|741->711|742->712|742->712|748->718|748->718|749->719|750->720|750->720|751->721|751->721|752->722|752->722|754->724|754->724|754->724|756->726|756->726|756->726|757->727|758->728|758->728|758->728|763->733|763->733|764->734|767->737|767->737|768->738|769->739|769->739|770->740|770->740|770->740|771->741|772->742|772->742|773->743|773->743|774->744|776->746|776->746|777->747|778->748|778->748|781->751|795->765|795->765|796->766|799->769|799->769|799->769|799->769|799->769|800->770|802->772|802->772|803->773|823->793|823->793|823->793|823->793|829->799|829->799|831->801|836->806|836->806|837->807|837->807|838->808|840->810|840->810|841->811|841->811|842->812|842->812|843->813|843->813|845->815|845->815|845->815|846->816|862->832|862->832|863->833|864->834|864->834|864->834|864->834|865->835|866->836|866->836|867->837|886->856|886->856|891->861|891->861|893->863|895->865|895->865|896->866|897->867|897->867|899->869|899->869|899->869|900->870|902->872|902->872|904->874|904->874|905->875|906->876|906->876|907->877|907->877|908->878|908->878|908->878|909->879|910->880|911->881|911->881|911->881|913->883|916->886|916->886|916->886|916->886|916->886|916->886|919->889|920->890|923->893|923->893|925->895|925->895|925->895|926->896|928->898|928->898|929->899|930->900|930->900|930->900|933->903|933->903|933->903|934->904|934->904|934->904|935->905|935->905|935->905|936->906|936->906|936->906|941->911|941->911|941->911|949->919|950->920|950->920|950->920|950->920|953->923|953->923|953->923|960->930|960->930|960->930|960->930|1029->999|1030->1000|1047->1017|1047->1017|1047->1017|1049->1019|1049->1019|1049->1019|1051->1021|1051->1021|1051->1021|1056->1026|1056->1026|1056->1026|1079->1049|1082->1052|1092->1062|1092->1062|1092->1062|1093->1063|1093->1063|1093->1063|1094->1064|1094->1064|1094->1064|1132->1102|1132->1102|1132->1102|1133->1103|1133->1103|1133->1103|1135->1105|1138->1108|1138->1108|1138->1108|1138->1108|1138->1108|1138->1108|1140->1110|1140->1110|1140->1110|1141->1111|1144->1114|1144->1114|1144->1114|1144->1114|1144->1114|1144->1114|1146->1116|1148->1118|1151->1121|1222->1192|1223->1193|1224->1194|1225->1195|1230->1200
                  -- GENERATED --
              */
          