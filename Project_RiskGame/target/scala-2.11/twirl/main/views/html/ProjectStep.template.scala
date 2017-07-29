
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

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

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




            <div class="col-xs-12" style="height: 10px;"></div>

            <header>

                    <!--// start of big1 div -->
                <div class="col-md-2" style="border-right: 1px dashed #969C9E;padding: 0px 0px 0px 0px !important;">

                  <div class="panel panel-default">
                      <div class="panel-heading" style="background-color: #A8A2A3">
                          <h4 class="panel-title">Current Action</h4>
                      </div>
                      <div class="panel-body" style="height: 350px; overflow-wrap: break-word;text-align:justify;">
                          <div style=" display: inline-block;text-align:justify;">Turn No: </div>

                 <div style=" display: inline-block;text-align:justify" id="turnNo">1</div>






                          <input type ="text" hidden id="btnIsProduction" value="false"/>
                          <div>Your last turn:</div>

                            <div id="swalmessages"> This is another Div..  </div>
                        <!--  <div id="myCurrentTurn"></div> //-->

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
                            """),format.raw/*1007.105*/("""
                        """),format.raw/*1008.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1025.126*/model/*1025.131*/.getBudget()),format.raw/*1025.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1027.141*/model/*1027.146*/.getCapabilityPoints()),format.raw/*1027.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1029.139*/model/*1029.144*/.getCapabilityBonus()),format.raw/*1029.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1034.180*/model/*1034.185*/.getResources),format.raw/*1034.198*/("""</div>
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


                                              """),format.raw/*1057.138*/("""


                                          """),format.raw/*1060.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1070.83*/model/*1070.88*/.getBudget()),format.raw/*1070.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1071.84*/model/*1071.89*/.getCapabilityPoints()),format.raw/*1071.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1072.83*/model/*1072.88*/.getCapabilityBonus()),format.raw/*1072.109*/("""</div>
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


                                    """),_display_(/*1110.38*/for(phase <- model.getPhases()) yield /*1110.69*/ {_display_(Seq[Any](format.raw/*1110.71*/("""
                                        """),_display_(/*1111.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1111.95*/{_display_(Seq[Any](format.raw/*1111.96*/("""

                                            """),format.raw/*1113.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1116.49*/phase/*1116.54*/.getPhaseId),format.raw/*1116.65*/(""">"""),_display_(/*1116.67*/phase/*1116.72*/.getPhaseName()),format.raw/*1116.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1118.42*/else/*1118.46*/{_display_(Seq[Any](format.raw/*1118.47*/("""
                                            """),format.raw/*1119.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1122.49*/phase/*1122.54*/.getPhaseId),format.raw/*1122.65*/(""">"""),_display_(/*1122.67*/phase/*1122.72*/.getPhaseName()),format.raw/*1122.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1124.42*/("""

                                    """)))}),format.raw/*1126.38*/("""


                                """),format.raw/*1129.33*/("""</div>





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
                    """),format.raw/*1200.51*/("""
                    """),format.raw/*1201.55*/("""
                    """),format.raw/*1202.52*/("""
                    """),format.raw/*1203.105*/("""




                    """),format.raw/*1208.21*/("""<div class="panel panel-default" >
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
                  DATE: Fri Jul 28 22:19:02 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: b7355eb946fda0c3425e19c50f6d65d2d3b096bb
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4799->2834|4828->2835|4865->2845|5018->2970|5047->2971|5088->2984|5200->3069|5229->3070|5265->3079|5352->3138|5381->3139|5422->3152|5534->3237|5563->3238|5600->3248|5691->3311|5720->3312|5761->3325|5873->3410|5902->3411|5939->3421|5977->3431|6006->3432|6047->3445|6159->3530|6188->3531|6224->3540|6255->3543|6284->3544|6314->3547|6426->3632|6454->3633|6494->3646|6532->3656|6561->3657|6602->3670|6996->4037|7025->4038|7061->4047|7105->4063|7134->4064|7175->4077|7368->4242|7398->4243|7435->4252|7508->4296|7538->4297|7580->4310|7850->4552|7880->4553|7918->4563|8027->4644|8057->4645|8099->4658|8323->4854|8353->4855|8391->4865|8431->4876|8461->4877|8503->4890|9075->5434|9105->5435|9142->5444|9182->5455|9212->5456|9254->5469|9617->5804|9647->5805|9685->5815|9731->5832|9761->5833|9803->5846|10024->6039|10054->6040|10091->6049|10132->6061|10162->6062|10204->6075|10474->6317|10504->6318|10545->6331|10642->6399|10672->6400|10719->6418|10779->6449|10809->6450|10851->6463|10945->6528|10975->6529|11022->6547|11093->6589|11123->6590|11165->6603|11225->6634|11255->6635|11301->6652|11385->6707|11415->6708|11465->6729|11534->6770|11550->6776|11602->6806|11853->7028|11883->7029|11912->7030|12191->7280|12221->7281|12280->7311|12641->7643|12671->7644|12700->7645|12933->7849|12963->7850|12996->7854|13026->7855|13088->7888|13167->7938|13197->7939|13258->7971|14344->9028|14374->9029|14436->9062|14676->9273|14706->9274|14739->9278|14769->9279|14831->9312|14961->9413|14991->9414|15020->9415|16575->10941|16605->10942|16659->10967|16809->11088|16839->11089|16913->11134|16943->11135|16997->11160|17118->11252|17148->11253|17194->11270|17224->11271|17269->11287|17299->11288|17342->11302|17427->11358|17457->11359|17500->11373|18019->11863|18049->11864|18099->11885|18254->12011|18284->12012|18317->12016|18347->12017|18397->12038|18498->12110|18528->12111|18574->12128|19424->12949|19454->12950|19526->12993|19556->12994|19585->12995|19827->13208|19857->13209|19901->13224|20080->13374|20110->13375|20139->13376|20264->13472|20294->13473|20344->13494|20402->13523|20432->13524|20478->13541|20514->13548|20544->13549|20594->13570|20663->13611|20679->13617|20737->13653|20948->13835|20978->13836|21033->13862|21222->14022|21252->14023|21310->14052|21441->14154|21471->14155|21533->14188|21665->14291|21695->14292|21725->14294|22965->15505|22995->15506|23057->15539|23297->15750|23327->15751|23360->15755|23390->15756|23452->15789|23582->15890|23612->15891|23641->15892|24003->16225|24033->16226|24095->16259|24153->16288|24183->16289|24249->16326|25726->17774|25756->17775|25805->17795|25835->17796|26189->18121|26219->18122|26252->18126|26282->18127|26348->18164|27833->19620|27863->19621|27912->19641|27942->19642|28296->19967|28326->19968|28386->19999|28416->20000|28449->20004|28479->20005|28541->20038|29962->21430|29992->21431|30041->21451|30071->21452|30409->21761|30439->21762|30495->21789|30525->21790|30554->21791|30866->22074|30896->22075|30970->22120|31000->22121|31054->22146|31189->22252|31219->22253|31265->22270|31295->22271|31340->22287|31370->22288|31414->22303|31469->22329|31499->22330|31529->22332|31892->22666|31922->22667|31972->22688|32011->22698|32041->22699|32095->22724|32214->22815|32229->22820|32261->22830|33282->23822|33312->23823|33359->23841|33389->23842|33436->23860|33525->23920|33555->23921|33584->23922|33676->23985|33706->23986|33760->24011|33879->24102|33894->24107|33926->24117|34944->25106|34974->25107|35021->25125|35051->25126|35098->25144|35159->25176|35189->25177|35218->25178|35310->25241|35340->25242|35394->25267|35509->25354|35524->25359|35556->25369|36579->26363|36609->26364|36656->26382|36686->26383|36716->26384|36749->26388|36779->26389|36829->26410|36868->26420|36898->26421|36952->26446|37067->26533|37082->26538|37114->26548|38127->27532|38157->27533|38204->27551|38234->27552|38281->27570|38317->27577|38347->27578|38397->27599|38466->27640|38482->27646|38533->27675|38795->27908|38825->27909|38879->27934|39069->28095|39099->28096|39128->28097|39242->28182|39272->28183|39342->28224|39715->28568|39745->28569|39831->28626|39861->28627|39931->28668|39975->28683|40005->28684|40034->28685|40242->28864|40272->28865|40338->28902|40368->28903|40424->28930|40454->28931|40509->28957|40595->29014|40625->29015|40682->29043|40866->29198|40896->29199|40958->29232|41073->29318|41103->29319|41161->29348|41215->29373|41245->29374|41307->29407|41429->29500|41459->29501|41517->29530|41570->29554|41600->29555|41662->29588|41782->29679|41812->29680|41870->29709|41924->29734|41954->29735|42016->29768|42128->29851|42158->29852|42216->29881|42334->29970|42364->29971|42396->29974|42514->30062|42545->30063|42965->30454|42995->30455|43049->30480|43114->30516|43144->30517|43203->30547|43322->30637|43352->30638|43414->30671|43533->30761|43563->30762|43621->30791|43679->30820|43709->30821|43771->30854|43897->30951|43927->30952|43985->30981|44042->31009|44072->31010|44134->31043|44258->31138|44288->31139|44346->31168|44404->31197|44434->31198|44496->31231|44612->31318|44642->31319|44700->31348|44818->31437|44848->31438|44880->31441|45005->31536|45036->31537|45462->31934|45492->31935|45546->31960|45613->31998|45643->31999|45701->32028|45800->32098|45830->32099|45892->32132|46061->32272|46091->32273|46149->32302|46182->32306|46212->32307|46274->32340|46438->32475|46468->32476|46527->32506|46596->32546|46626->32547|46680->32572|46745->32608|46775->32609|46833->32638|46903->32679|46933->32680|46995->32713|47029->32718|47059->32719|47091->32722|47195->32796|47226->32797|47286->32828|47316->32829|47371->32855|47401->32856|47455->32881|47516->32913|47546->32914|47604->32943|47666->32976|47696->32977|47758->33010|47792->33015|47822->33016|47854->33019|47982->33117|48013->33118|48073->33149|48103->33150|48161->33179|48194->33183|48224->33184|48286->33217|48320->33222|48350->33223|48382->33226|48495->33309|48526->33310|48586->33341|48616->33342|48670->33367|48700->33368|48754->33393|48812->33422|48842->33423|48900->33452|48934->33457|48964->33458|48996->33461|49120->33555|49151->33556|49208->33584|49238->33585|49292->33610|50143->34432|50173->34433|50232->34463|50369->34571|50399->34572|50453->34597|50527->34642|50557->34643|50631->34688|50661->34689|50713->34712|50899->34869|50929->34870|50975->34887|51005->34888|51049->34903|51079->34904|51122->34918|51257->35024|51287->35025|51335->35044|51579->35259|51609->35260|51659->35281|51726->35319|51756->35320|51830->35365|51860->35366|51910->35387|51944->35392|51974->35393|52006->35396|52238->35598|52269->35599|52311->35611|52342->35612|52388->35629|52633->35845|52663->35846|52721->35875|52823->35948|52853->35949|52990->36057|53020->36058|53078->36087|53207->36187|53237->36188|53299->36221|53369->36262|53399->36263|53453->36288|53483->36289|53838->36615|53868->36616|53922->36641|54076->36766|54106->36767|54160->36792|54190->36793|54238->36812|54268->36813|54315->36831|54349->36836|54379->36837|54430->36859|54466->36866|54496->36867|54550->36892|54623->36937|54639->36943|54694->36976|54983->37236|55013->37237|55042->37238|55297->37464|55327->37465|55389->37498|55497->37577|55527->37578|55593->37615|55638->37631|55668->37632|55738->37673|55826->37732|55856->37733|55918->37766|55948->37767|55977->37768|56151->37913|56181->37914|56247->37951|56339->38014|56369->38015|56433->38050|57577->39165|57607->39166|57673->39203|57925->39426|57955->39427|57985->39428|58019->39433|58049->39434|58115->39471|58257->39584|58287->39585|58316->39586|60080->41321|60110->41322|60159->41342|60189->41343|60688->41813|60718->41814|60748->41816|61092->42131|61122->42132|61200->42181|61230->42182|61288->42211|61417->42311|61447->42312|61497->42333|61527->42334|61575->42353|61605->42354|61647->42367|61677->42368|61720->42382|61803->42436|61833->42437|61862->42438|62805->43352|62835->43353|62885->43374|63041->43501|63071->43502|63104->43506|63134->43507|63184->43528|63281->43596|63311->43597|63357->43614|64445->44673|64475->44674|64549->44719|64579->44720|64626->44738|64703->44786|64733->44787|64783->44808|64862->44858|64892->44859|64939->44877|65004->44913|65034->44914|65084->44935|65289->45111|65319->45112|65397->45161|65427->45162|65477->45183|65544->45221|65574->45222|65628->45247|65658->45248|65700->45261|65759->45291|65789->45292|65835->45357|65881->45374|65937->45402|65986->45434|66027->45436|66074->45454|66325->45677|66341->45683|66374->45694|66405->45697|66421->45703|66456->45716|66570->45798|66616->45815|66757->45927|66787->45928|66830->45942|66877->45960|66907->45961|66953->45978|67034->46030|67064->46031|67097->46036|67175->46086|67191->46092|67240->46119|67494->46345|67509->46350|67545->46364|67640->46431|67655->46436|67689->46448|67780->46511|67795->46516|67829->46528|67928->46599|67943->46604|67986->46625|68215->46826|68231->46832|68290->46868|68547->47130|68593->47147|68699->47225|68715->47230|68750->47242|68941->47405|68956->47410|69002->47434|69467->47870|69483->47875|69519->47900|69545->47903|72998->51401|73053->51426|73722->52065|73739->52070|73775->52082|74009->52286|74026->52291|74072->52313|74304->52515|74321->52520|74366->52541|74802->52947|74819->52952|74856->52965|75978->54147|76053->54192|76921->55031|76937->55036|76973->55048|77092->55138|77108->55143|77154->55165|77272->55254|77288->55259|77333->55280|79645->57563|79694->57594|79736->57596|79807->57638|79871->57691|79912->57692|79988->57738|80268->57989|80284->57994|80318->58005|80349->58007|80365->58012|80403->58027|80571->58174|80586->58178|80627->58179|80702->58224|80997->58490|81013->58495|81047->58506|81078->58508|81094->58513|81132->58528|81312->58675|81384->58714|81449->58749|84375->61675|84426->61730|84477->61782|84529->61887|84584->61912
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|190->160|190->160|192->162|193->163|193->163|194->164|196->166|196->166|198->168|199->169|199->169|200->170|200->170|200->170|201->171|202->172|202->172|203->173|204->174|204->174|204->174|209->179|209->179|210->180|214->184|214->184|216->186|221->191|221->191|222->192|225->195|225->195|225->195|225->195|226->196|227->197|227->197|231->201|245->215|245->215|246->216|249->219|249->219|249->219|249->219|250->220|252->222|252->222|253->223|276->246|276->246|277->247|279->249|279->249|280->250|280->250|281->251|283->253|283->253|284->254|284->254|286->256|286->256|288->258|288->258|288->258|289->259|299->269|299->269|300->270|301->271|301->271|301->271|301->271|302->272|303->273|303->273|304->274|321->291|321->291|323->293|323->293|324->294|330->300|330->300|333->303|337->307|337->307|338->308|340->310|340->310|341->311|342->312|342->312|343->313|343->313|343->313|344->314|345->315|345->315|345->315|349->319|349->319|351->321|354->324|354->324|355->325|358->328|358->328|359->329|361->331|361->331|363->333|381->351|381->351|382->352|385->355|385->355|385->355|385->355|386->356|388->358|388->358|389->359|393->363|393->363|394->364|394->364|394->364|395->365|410->380|410->380|410->380|410->380|415->385|415->385|415->385|415->385|416->386|431->401|431->401|431->401|431->401|436->406|436->406|439->409|439->409|439->409|439->409|440->410|455->425|455->425|455->425|455->425|460->430|460->430|463->433|463->433|464->434|468->438|468->438|469->439|469->439|470->440|472->442|472->442|473->443|473->443|475->445|475->445|478->448|478->448|478->448|480->450|484->454|484->454|485->455|485->455|485->455|486->456|488->458|488->458|488->458|503->473|503->473|504->474|504->474|506->476|506->476|506->476|507->477|508->478|508->478|509->479|511->481|511->481|511->481|526->496|526->496|527->497|527->497|529->499|529->499|529->499|530->500|531->501|531->501|532->502|534->504|534->504|534->504|549->519|549->519|550->520|550->520|550->520|550->520|550->520|551->521|551->521|551->521|552->522|554->524|554->524|554->524|569->539|569->539|570->540|570->540|572->542|572->542|572->542|573->543|574->544|574->544|574->544|579->549|579->549|580->550|582->552|582->552|583->553|584->554|584->554|585->555|590->560|590->560|591->561|591->561|592->562|592->562|592->562|593->563|596->566|596->566|597->567|597->567|598->568|598->568|601->571|602->572|602->572|603->573|607->577|607->577|608->578|609->579|609->579|610->580|610->580|610->580|611->581|612->582|612->582|613->583|613->583|613->583|614->584|615->585|615->585|616->586|616->586|616->586|617->587|618->588|618->588|619->589|621->591|621->591|621->591|621->591|621->591|628->598|628->598|629->599|629->599|629->599|631->601|633->603|633->603|634->604|635->605|635->605|636->606|636->606|636->606|637->607|638->608|638->608|639->609|639->609|639->609|640->610|641->611|641->611|642->612|642->612|642->612|643->613|644->614|644->614|645->615|647->617|647->617|647->617|647->617|647->617|653->623|653->623|654->624|654->624|654->624|655->625|656->626|656->626|657->627|658->628|658->628|659->629|659->629|659->629|660->630|661->631|661->631|663->633|664->634|664->634|665->635|665->635|665->635|666->636|666->636|666->636|667->637|667->637|667->637|667->637|667->637|667->637|668->638|668->638|670->640|670->640|671->641|671->641|671->641|672->642|672->642|672->642|673->643|673->643|673->643|673->643|673->643|673->643|674->644|674->644|675->645|675->645|675->645|676->646|676->646|676->646|676->646|676->646|676->646|677->647|677->647|678->648|678->648|679->649|680->650|680->650|681->651|681->651|681->651|681->651|681->651|681->651|683->653|683->653|684->654|695->665|695->665|697->667|699->669|699->669|700->670|703->673|703->673|704->674|704->674|705->675|708->678|708->678|709->679|709->679|710->680|710->680|712->682|714->684|714->684|716->686|721->691|721->691|722->692|723->693|723->693|725->695|725->695|726->696|726->696|726->696|726->696|726->696|726->696|726->696|726->696|728->698|730->700|730->700|731->701|734->704|734->704|736->706|736->706|737->707|739->709|739->709|740->710|741->711|741->711|742->712|742->712|748->718|748->718|749->719|750->720|750->720|751->721|751->721|752->722|752->722|754->724|754->724|754->724|756->726|756->726|756->726|757->727|758->728|758->728|758->728|763->733|763->733|764->734|767->737|767->737|768->738|769->739|769->739|770->740|770->740|770->740|771->741|772->742|772->742|773->743|773->743|774->744|776->746|776->746|777->747|778->748|778->748|781->751|795->765|795->765|796->766|799->769|799->769|799->769|799->769|799->769|800->770|802->772|802->772|803->773|823->793|823->793|823->793|823->793|829->799|829->799|831->801|836->806|836->806|837->807|837->807|838->808|840->810|840->810|841->811|841->811|842->812|842->812|843->813|843->813|845->815|845->815|845->815|846->816|862->832|862->832|863->833|864->834|864->834|864->834|864->834|865->835|866->836|866->836|867->837|886->856|886->856|891->861|891->861|893->863|895->865|895->865|896->866|897->867|897->867|899->869|899->869|899->869|900->870|902->872|902->872|904->874|904->874|905->875|906->876|906->876|907->877|907->877|908->878|908->878|908->878|909->879|910->880|911->881|911->881|911->881|913->883|916->886|916->886|916->886|916->886|916->886|916->886|919->889|920->890|923->893|923->893|925->895|925->895|925->895|926->896|928->898|928->898|929->899|930->900|930->900|930->900|933->903|933->903|933->903|934->904|934->904|934->904|935->905|935->905|935->905|936->906|936->906|936->906|941->911|941->911|941->911|949->919|950->920|950->920|950->920|950->920|953->923|953->923|953->923|960->930|960->930|960->930|960->930|1037->1007|1038->1008|1055->1025|1055->1025|1055->1025|1057->1027|1057->1027|1057->1027|1059->1029|1059->1029|1059->1029|1064->1034|1064->1034|1064->1034|1087->1057|1090->1060|1100->1070|1100->1070|1100->1070|1101->1071|1101->1071|1101->1071|1102->1072|1102->1072|1102->1072|1140->1110|1140->1110|1140->1110|1141->1111|1141->1111|1141->1111|1143->1113|1146->1116|1146->1116|1146->1116|1146->1116|1146->1116|1146->1116|1148->1118|1148->1118|1148->1118|1149->1119|1152->1122|1152->1122|1152->1122|1152->1122|1152->1122|1152->1122|1154->1124|1156->1126|1159->1129|1230->1200|1231->1201|1232->1202|1233->1203|1238->1208
                  -- GENERATED --
              */
          