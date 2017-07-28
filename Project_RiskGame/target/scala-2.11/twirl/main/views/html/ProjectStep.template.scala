
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
                                            " style='white-space: normal; ' " +
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
                                            " style='white-space: normal; ' " +
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
                                        " style='white-space: normal; ' " +
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
                  DATE: Fri Jul 28 18:16:59 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: 000ea38750b425c7b4d8514f58de64df0a67d27e
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3954->2488|3983->2489|4020->2499|4051->2502|4080->2503|4121->2516|4211->2579|4240->2580|4277->2590|4322->2607|4351->2608|4392->2621|4482->2684|4511->2685|4548->2695|4589->2708|4618->2709|4660->2723|4804->2839|4833->2840|4870->2850|5023->2975|5052->2976|5093->2989|5205->3074|5234->3075|5270->3084|5357->3143|5386->3144|5427->3157|5539->3242|5568->3243|5605->3253|5696->3316|5725->3317|5766->3330|5878->3415|5907->3416|5944->3426|5982->3436|6011->3437|6052->3450|6164->3535|6193->3536|6229->3545|6260->3548|6289->3549|6319->3552|6431->3637|6459->3638|6499->3651|6537->3661|6566->3662|6607->3675|7001->4042|7030->4043|7066->4052|7110->4068|7139->4069|7180->4082|7373->4247|7403->4248|7440->4257|7513->4301|7543->4302|7585->4315|7855->4557|7885->4558|7923->4568|8032->4649|8062->4650|8104->4663|8328->4859|8358->4860|8396->4870|8436->4881|8466->4882|8508->4895|9080->5439|9110->5440|9147->5449|9187->5460|9217->5461|9259->5474|9622->5809|9652->5810|9690->5820|9736->5837|9766->5838|9808->5851|10029->6044|10059->6045|10096->6054|10137->6066|10167->6067|10209->6080|10479->6322|10509->6323|10550->6336|10647->6404|10677->6405|10724->6423|10784->6454|10814->6455|10856->6468|10950->6533|10980->6534|11027->6552|11098->6594|11128->6595|11170->6608|11230->6639|11260->6640|11306->6657|11390->6712|11420->6713|11470->6734|11539->6775|11555->6781|11607->6811|11858->7033|11888->7034|11917->7035|12196->7285|12226->7286|12285->7316|12646->7648|12676->7649|12705->7650|12938->7854|12968->7855|13001->7859|13031->7860|13093->7893|13172->7943|13202->7944|13263->7976|14349->9033|14379->9034|14441->9067|14681->9278|14711->9279|14744->9283|14774->9284|14836->9317|14966->9418|14996->9419|15025->9420|16580->10946|16610->10947|16664->10972|16814->11093|16844->11094|16918->11139|16948->11140|17002->11165|17123->11257|17153->11258|17199->11275|17229->11276|17274->11292|17304->11293|17347->11307|17432->11363|17462->11364|17505->11378|18024->11868|18054->11869|18104->11890|18259->12016|18289->12017|18322->12021|18352->12022|18402->12043|18503->12115|18533->12116|18579->12133|19429->12954|19459->12955|19531->12998|19561->12999|19590->13000|19832->13213|19862->13214|19906->13229|20085->13379|20115->13380|20144->13381|20269->13477|20299->13478|20349->13499|20407->13528|20437->13529|20483->13546|20519->13553|20549->13554|20599->13575|20668->13616|20684->13622|20742->13658|20953->13840|20983->13841|21038->13867|21227->14027|21257->14028|21315->14057|21446->14159|21476->14160|21538->14193|21670->14296|21700->14297|21730->14299|22970->15510|23000->15511|23062->15544|23302->15755|23332->15756|23365->15760|23395->15761|23457->15794|23587->15895|23617->15896|23646->15897|24008->16230|24038->16231|24100->16264|24158->16293|24188->16294|24254->16331|25731->17779|25761->17780|25810->17800|25840->17801|26194->18126|26224->18127|26257->18131|26287->18132|26353->18169|27838->19625|27868->19626|27917->19646|27947->19647|28301->19972|28331->19973|28391->20004|28421->20005|28454->20009|28484->20010|28546->20043|29967->21435|29997->21436|30046->21456|30076->21457|30414->21766|30444->21767|30500->21794|30530->21795|30559->21796|30871->22079|30901->22080|30975->22125|31005->22126|31059->22151|31194->22257|31224->22258|31270->22275|31300->22276|31345->22292|31375->22293|31419->22308|31474->22334|31504->22335|31534->22337|31897->22671|31927->22672|31977->22693|32016->22703|32046->22704|32100->22729|32219->22820|32234->22825|32266->22835|33287->23827|33317->23828|33364->23846|33394->23847|33441->23865|33530->23925|33560->23926|33589->23927|33681->23990|33711->23991|33765->24016|33884->24107|33899->24112|33931->24122|34949->25111|34979->25112|35026->25130|35056->25131|35103->25149|35164->25181|35194->25182|35223->25183|35315->25246|35345->25247|35399->25272|35514->25359|35529->25364|35561->25374|36584->26368|36614->26369|36661->26387|36691->26388|36721->26389|36754->26393|36784->26394|36834->26415|36873->26425|36903->26426|36957->26451|37072->26538|37087->26543|37119->26553|38132->27537|38162->27538|38209->27556|38239->27557|38286->27575|38322->27582|38352->27583|38402->27604|38471->27645|38487->27651|38538->27680|38800->27913|38830->27914|38884->27939|39074->28100|39104->28101|39133->28102|39247->28187|39277->28188|39347->28229|39720->28573|39750->28574|39836->28631|39866->28632|39936->28673|39980->28688|40010->28689|40039->28690|40247->28869|40277->28870|40343->28907|40373->28908|40429->28935|40459->28936|40514->28962|40600->29019|40630->29020|40687->29048|40871->29203|40901->29204|40963->29237|41078->29323|41108->29324|41166->29353|41220->29378|41250->29379|41312->29412|41434->29505|41464->29506|41522->29535|41575->29559|41605->29560|41667->29593|41787->29684|41817->29685|41875->29714|41929->29739|41959->29740|42021->29773|42133->29856|42163->29857|42221->29886|42339->29975|42369->29976|42401->29979|42519->30067|42550->30068|42970->30459|43000->30460|43054->30485|43119->30521|43149->30522|43208->30552|43327->30642|43357->30643|43419->30676|43538->30766|43568->30767|43626->30796|43684->30825|43714->30826|43776->30859|43902->30956|43932->30957|43990->30986|44047->31014|44077->31015|44139->31048|44263->31143|44293->31144|44351->31173|44409->31202|44439->31203|44501->31236|44617->31323|44647->31324|44705->31353|44823->31442|44853->31443|44885->31446|45010->31541|45041->31542|45467->31939|45497->31940|45551->31965|45618->32003|45648->32004|45706->32033|45805->32103|45835->32104|45897->32137|46066->32277|46096->32278|46154->32307|46187->32311|46217->32312|46279->32345|46443->32480|46473->32481|46532->32511|46601->32551|46631->32552|46685->32577|46750->32613|46780->32614|46838->32643|46908->32684|46938->32685|47000->32718|47034->32723|47064->32724|47096->32727|47200->32801|47231->32802|47291->32833|47321->32834|47376->32860|47406->32861|47460->32886|47521->32918|47551->32919|47609->32948|47671->32981|47701->32982|47763->33015|47797->33020|47827->33021|47859->33024|47987->33122|48018->33123|48078->33154|48108->33155|48166->33184|48199->33188|48229->33189|48291->33222|48325->33227|48355->33228|48387->33231|48500->33314|48531->33315|48591->33346|48621->33347|48675->33372|48705->33373|48759->33398|48817->33427|48847->33428|48905->33457|48939->33462|48969->33463|49001->33466|49125->33560|49156->33561|49213->33589|49243->33590|49297->33615|50148->34437|50178->34438|50237->34468|50374->34576|50404->34577|50458->34602|50532->34647|50562->34648|50636->34693|50666->34694|50718->34717|50904->34874|50934->34875|50980->34892|51010->34893|51054->34908|51084->34909|51127->34923|51262->35029|51292->35030|51340->35049|51584->35264|51614->35265|51664->35286|51731->35324|51761->35325|51835->35370|51865->35371|51915->35392|51949->35397|51979->35398|52011->35401|52243->35603|52274->35604|52316->35616|52347->35617|52393->35634|52638->35850|52668->35851|52726->35880|52828->35953|52858->35954|52995->36062|53025->36063|53083->36092|53212->36192|53242->36193|53304->36226|53374->36267|53404->36268|53458->36293|53488->36294|53843->36620|53873->36621|53927->36646|54081->36771|54111->36772|54165->36797|54195->36798|54243->36817|54273->36818|54320->36836|54354->36841|54384->36842|54435->36864|54471->36871|54501->36872|54555->36897|54628->36942|54644->36948|54699->36981|54988->37241|55018->37242|55047->37243|55302->37469|55332->37470|55394->37503|55502->37582|55532->37583|55598->37620|55643->37636|55673->37637|55743->37678|55831->37737|55861->37738|55923->37771|55953->37772|55982->37773|56156->37918|56186->37919|56252->37956|56344->38019|56374->38020|56438->38055|57582->39170|57612->39171|57678->39208|57930->39431|57960->39432|57990->39433|58024->39438|58054->39439|58120->39476|58262->39589|58292->39590|58321->39591|60085->41326|60115->41327|60164->41347|60194->41348|60693->41818|60723->41819|60753->41821|61097->42136|61127->42137|61205->42186|61235->42187|61293->42216|61422->42316|61452->42317|61502->42338|61532->42339|61580->42358|61610->42359|61652->42372|61682->42373|61725->42387|61808->42441|61838->42442|61867->42443|62810->43357|62840->43358|62890->43379|63046->43506|63076->43507|63109->43511|63139->43512|63189->43533|63286->43601|63316->43602|63362->43619|64450->44678|64480->44679|64554->44724|64584->44725|64631->44743|64708->44791|64738->44792|64788->44813|64867->44863|64897->44864|64944->44882|65009->44918|65039->44919|65089->44940|65294->45116|65324->45117|65402->45166|65432->45167|65482->45188|65549->45226|65579->45227|65633->45252|65663->45253|65705->45266|65764->45296|65794->45297|65840->45362|65886->45379|65942->45407|65991->45439|66032->45441|66079->45459|66330->45682|66346->45688|66379->45699|66410->45702|66426->45708|66461->45721|66575->45803|66621->45820|66762->45932|66792->45933|66835->45947|66882->45965|66912->45966|66958->45983|67039->46035|67069->46036|67102->46041|67180->46091|67196->46097|67245->46124|67499->46350|67514->46355|67550->46369|67645->46436|67660->46441|67694->46453|67785->46516|67800->46521|67834->46533|67933->46604|67948->46609|67991->46630|68176->46787|68192->46793|68251->46829|68508->47091|68554->47108|68660->47186|68676->47191|68711->47203|68902->47366|68917->47371|68963->47395|69428->47831|69444->47836|69480->47861|69506->47864|72755->51159|72810->51184|73479->51823|73496->51828|73532->51840|73766->52044|73783->52049|73829->52071|74061->52273|74078->52278|74123->52299|74559->52705|74576->52710|74613->52723|75735->53905|75810->53950|76678->54789|76694->54794|76730->54806|76849->54896|76865->54901|76911->54923|77029->55012|77045->55017|77090->55038|79402->57321|79451->57352|79493->57354|79564->57396|79628->57449|79669->57450|79745->57496|80025->57747|80041->57752|80075->57763|80106->57765|80122->57770|80160->57785|80328->57932|80343->57936|80384->57937|80459->57982|80754->58248|80770->58253|80804->58264|80835->58266|80851->58271|80889->58286|81069->58433|81141->58472|81206->58507|84112->61413|84163->61468|84214->61520|84266->61625|84321->61650
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|190->160|190->160|192->162|193->163|193->163|194->164|196->166|196->166|198->168|199->169|199->169|200->170|200->170|200->170|201->171|202->172|202->172|203->173|204->174|204->174|204->174|209->179|209->179|210->180|214->184|214->184|216->186|221->191|221->191|222->192|225->195|225->195|225->195|225->195|226->196|227->197|227->197|231->201|245->215|245->215|246->216|249->219|249->219|249->219|249->219|250->220|252->222|252->222|253->223|276->246|276->246|277->247|279->249|279->249|280->250|280->250|281->251|283->253|283->253|284->254|284->254|286->256|286->256|288->258|288->258|288->258|289->259|299->269|299->269|300->270|301->271|301->271|301->271|301->271|302->272|303->273|303->273|304->274|321->291|321->291|323->293|323->293|324->294|330->300|330->300|333->303|337->307|337->307|338->308|340->310|340->310|341->311|342->312|342->312|343->313|343->313|343->313|344->314|345->315|345->315|345->315|349->319|349->319|351->321|354->324|354->324|355->325|358->328|358->328|359->329|361->331|361->331|363->333|381->351|381->351|382->352|385->355|385->355|385->355|385->355|386->356|388->358|388->358|389->359|393->363|393->363|394->364|394->364|394->364|395->365|410->380|410->380|410->380|410->380|415->385|415->385|415->385|415->385|416->386|431->401|431->401|431->401|431->401|436->406|436->406|439->409|439->409|439->409|439->409|440->410|455->425|455->425|455->425|455->425|460->430|460->430|463->433|463->433|464->434|468->438|468->438|469->439|469->439|470->440|472->442|472->442|473->443|473->443|475->445|475->445|478->448|478->448|478->448|480->450|484->454|484->454|485->455|485->455|485->455|486->456|488->458|488->458|488->458|503->473|503->473|504->474|504->474|506->476|506->476|506->476|507->477|508->478|508->478|509->479|511->481|511->481|511->481|526->496|526->496|527->497|527->497|529->499|529->499|529->499|530->500|531->501|531->501|532->502|534->504|534->504|534->504|549->519|549->519|550->520|550->520|550->520|550->520|550->520|551->521|551->521|551->521|552->522|554->524|554->524|554->524|569->539|569->539|570->540|570->540|572->542|572->542|572->542|573->543|574->544|574->544|574->544|579->549|579->549|580->550|582->552|582->552|583->553|584->554|584->554|585->555|590->560|590->560|591->561|591->561|592->562|592->562|592->562|593->563|596->566|596->566|597->567|597->567|598->568|598->568|601->571|602->572|602->572|603->573|607->577|607->577|608->578|609->579|609->579|610->580|610->580|610->580|611->581|612->582|612->582|613->583|613->583|613->583|614->584|615->585|615->585|616->586|616->586|616->586|617->587|618->588|618->588|619->589|621->591|621->591|621->591|621->591|621->591|628->598|628->598|629->599|629->599|629->599|631->601|633->603|633->603|634->604|635->605|635->605|636->606|636->606|636->606|637->607|638->608|638->608|639->609|639->609|639->609|640->610|641->611|641->611|642->612|642->612|642->612|643->613|644->614|644->614|645->615|647->617|647->617|647->617|647->617|647->617|653->623|653->623|654->624|654->624|654->624|655->625|656->626|656->626|657->627|658->628|658->628|659->629|659->629|659->629|660->630|661->631|661->631|663->633|664->634|664->634|665->635|665->635|665->635|666->636|666->636|666->636|667->637|667->637|667->637|667->637|667->637|667->637|668->638|668->638|670->640|670->640|671->641|671->641|671->641|672->642|672->642|672->642|673->643|673->643|673->643|673->643|673->643|673->643|674->644|674->644|675->645|675->645|675->645|676->646|676->646|676->646|676->646|676->646|676->646|677->647|677->647|678->648|678->648|679->649|680->650|680->650|681->651|681->651|681->651|681->651|681->651|681->651|683->653|683->653|684->654|695->665|695->665|697->667|699->669|699->669|700->670|703->673|703->673|704->674|704->674|705->675|708->678|708->678|709->679|709->679|710->680|710->680|712->682|714->684|714->684|716->686|721->691|721->691|722->692|723->693|723->693|725->695|725->695|726->696|726->696|726->696|726->696|726->696|726->696|726->696|726->696|728->698|730->700|730->700|731->701|734->704|734->704|736->706|736->706|737->707|739->709|739->709|740->710|741->711|741->711|742->712|742->712|748->718|748->718|749->719|750->720|750->720|751->721|751->721|752->722|752->722|754->724|754->724|754->724|756->726|756->726|756->726|757->727|758->728|758->728|758->728|763->733|763->733|764->734|767->737|767->737|768->738|769->739|769->739|770->740|770->740|770->740|771->741|772->742|772->742|773->743|773->743|774->744|776->746|776->746|777->747|778->748|778->748|781->751|795->765|795->765|796->766|799->769|799->769|799->769|799->769|799->769|800->770|802->772|802->772|803->773|823->793|823->793|823->793|823->793|829->799|829->799|831->801|836->806|836->806|837->807|837->807|838->808|840->810|840->810|841->811|841->811|842->812|842->812|843->813|843->813|845->815|845->815|845->815|846->816|862->832|862->832|863->833|864->834|864->834|864->834|864->834|865->835|866->836|866->836|867->837|886->856|886->856|891->861|891->861|893->863|895->865|895->865|896->866|897->867|897->867|899->869|899->869|899->869|900->870|902->872|902->872|904->874|904->874|905->875|906->876|906->876|907->877|907->877|908->878|908->878|908->878|909->879|910->880|911->881|911->881|911->881|913->883|916->886|916->886|916->886|916->886|916->886|916->886|919->889|920->890|923->893|923->893|925->895|925->895|925->895|926->896|928->898|928->898|929->899|930->900|930->900|930->900|933->903|933->903|933->903|934->904|934->904|934->904|935->905|935->905|935->905|936->906|936->906|936->906|941->911|941->911|941->911|949->919|950->920|950->920|950->920|950->920|953->923|953->923|953->923|960->930|960->930|960->930|960->930|1029->999|1030->1000|1047->1017|1047->1017|1047->1017|1049->1019|1049->1019|1049->1019|1051->1021|1051->1021|1051->1021|1056->1026|1056->1026|1056->1026|1079->1049|1082->1052|1092->1062|1092->1062|1092->1062|1093->1063|1093->1063|1093->1063|1094->1064|1094->1064|1094->1064|1132->1102|1132->1102|1132->1102|1133->1103|1133->1103|1133->1103|1135->1105|1138->1108|1138->1108|1138->1108|1138->1108|1138->1108|1138->1108|1140->1110|1140->1110|1140->1110|1141->1111|1144->1114|1144->1114|1144->1114|1144->1114|1144->1114|1144->1114|1146->1116|1148->1118|1151->1121|1222->1192|1223->1193|1224->1194|1225->1195|1230->1200
                  -- GENERATED --
              */
          