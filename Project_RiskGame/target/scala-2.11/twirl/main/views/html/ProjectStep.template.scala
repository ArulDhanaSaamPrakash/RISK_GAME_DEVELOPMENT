
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

var isImplementedBeforeProduction=false;
var isOOPSCard=false;
var isSurpriseCard=false;
var isSkipped=false;
var c=1;
var cr=1;
var cd=1;
var ci=1;
var cp=1;
var ct=1;
var isImplementationPlanningDone=false;
var isDesignPlanningDone=false;
var isTestingPlanningDone=false;
var isProductionPlanningDone=false;
var isRequirementPlanningDone=false;




            function myfunc() """),format.raw/*178.31*/("""{"""),format.raw/*178.32*/("""

                """),format.raw/*180.17*/("""alert("aaaaaaaa");
            """),format.raw/*181.13*/("""}"""),format.raw/*181.14*/("""
            """),format.raw/*182.13*/("""var lastclickedTab;

            function onProjectStepTabClick()"""),format.raw/*184.45*/("""{"""),format.raw/*184.46*/("""

                """),format.raw/*186.17*/("""lastclickedTab="projectStep";
            """),format.raw/*187.13*/("""}"""),format.raw/*187.14*/("""
            """),format.raw/*188.13*/("""var isCompleted="";
            function onRiskDashboardClick()"""),format.raw/*189.44*/("""{"""),format.raw/*189.45*/("""
                """),format.raw/*190.17*/("""lastclickedTab="riskDashboard";
                $.ajax("""),format.raw/*191.24*/("""{"""),format.raw/*191.25*/("""
                    """),format.raw/*192.21*/("""type: 'POST',
                    url: '"""),_display_(/*193.28*/routes/*193.34*/.GameController.getRiskCards()),format.raw/*193.64*/("""',
//                     data : '',
                    data: JSON.stringify(''),
                    // dataType: 'json',
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*198.46*/("""{"""),format.raw/*198.47*/("""
"""),format.raw/*199.1*/("""//                        alert(data);
                        var result = " ";
                        $("#grid-basic tbody") .empty();
                        var firstRisk=data[0].riskId;
                        for (i = 0; i < data.length; i++) """),format.raw/*203.59*/("""{"""),format.raw/*203.60*/("""

                            """),format.raw/*205.29*/("""var obj = data[i];
//                            obj.isComplete = obj.isComplete === 'false' ? "Not Completed" : "Completed";

                            var isDisabled="";
//                            alert(obj.budget+" "+obj.personnel);
                            if(obj.complete)"""),format.raw/*210.45*/("""{"""),format.raw/*210.46*/("""
"""),format.raw/*211.1*/("""//                                alert('object is true')
                                isCompleted="Completed"
                                isDisabled="disabled='true'";
                            """),format.raw/*214.29*/("""}"""),format.raw/*214.30*/("""else"""),format.raw/*214.34*/("""{"""),format.raw/*214.35*/("""
                                """),format.raw/*215.33*/("""isCompleted="Pending"
                            """),format.raw/*216.29*/("""}"""),format.raw/*216.30*/("""



                            """),format.raw/*220.29*/("""var eligibleBudget=0;
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*234.81*/("""{"""),format.raw/*234.82*/("""
                                """),format.raw/*235.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*238.29*/("""}"""),format.raw/*238.30*/("""else"""),format.raw/*238.34*/("""{"""),format.raw/*238.35*/("""
                                """),format.raw/*239.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*241.29*/("""}"""),format.raw/*241.30*/("""
"""),format.raw/*242.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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

                        """),format.raw/*265.25*/("""}"""),format.raw/*265.26*/("""
                        """),format.raw/*266.25*/("""document.getElementById('risks').innerHTML = result;
                        onRiskClick(firstRisk);
                    """),format.raw/*268.21*/("""}"""),format.raw/*268.22*/(""",
                    error: function (data) """),format.raw/*269.44*/("""{"""),format.raw/*269.45*/("""
                        """),format.raw/*270.25*/("""alert("error");
                        //setError('Make call failed');
                    """),format.raw/*272.21*/("""}"""),format.raw/*272.22*/("""
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/(""");

            """),format.raw/*275.13*/("""}"""),format.raw/*275.14*/("""

            """),format.raw/*277.13*/("""$(document).on("click", ".open-riskDialog", function () """),format.raw/*277.69*/("""{"""),format.raw/*277.70*/("""
             """),format.raw/*278.14*/("""//   alert($(this).data('risk'));

//                var title = $(this).data('title');

                var riskId=$(this).data('risk');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*288.42*/("""{"""),format.raw/*288.43*/("""
                    """),format.raw/*289.21*/("""document.getElementById("isRiskDisabled").innerHTML="You don't have enough resources to mitigate this risk!";
                """),format.raw/*290.17*/("""}"""),format.raw/*290.18*/("""else"""),format.raw/*290.22*/("""{"""),format.raw/*290.23*/("""
                    """),format.raw/*291.21*/("""document.getElementById("isRiskDisabled").innerHTML="";
                """),format.raw/*292.17*/("""}"""),format.raw/*292.18*/("""
                """),format.raw/*293.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*310.13*/("""}"""),format.raw/*310.14*/(""");

            function onMitigateRisk(id)"""),format.raw/*312.40*/("""{"""),format.raw/*312.41*/("""
"""),format.raw/*313.1*/("""//                alert(id);
                onRiskClick(id);
                onPerformStep(id);

                $('#btnMitigateRisk').val(id);
                $('#btnMitigateRisk').trigger('click');
            """),format.raw/*319.13*/("""}"""),format.raw/*319.14*/("""


            """),format.raw/*322.13*/("""var riskClicked="";
            var totalSteps=0;
            var stepsDone=0;
            var onlyPlanning=true;
            function onRiskClick(id)"""),format.raw/*326.37*/("""{"""),format.raw/*326.38*/("""
"""),format.raw/*327.1*/("""//                alert("fghjh "+id);
                riskClicked=id;
                var obj = """),format.raw/*329.27*/("""{"""),format.raw/*329.28*/("""
                    """),format.raw/*330.21*/("""'riskid': id
                """),format.raw/*331.17*/("""}"""),format.raw/*331.18*/("""
                """),format.raw/*332.17*/("""$.ajax("""),format.raw/*332.24*/("""{"""),format.raw/*332.25*/("""
                    """),format.raw/*333.21*/("""type: 'POST',
                    url: '"""),_display_(/*334.28*/routes/*334.34*/.GameController.getMitigationSteps()),format.raw/*334.70*/("""',
//                     data : '',
                    data: JSON.stringify(obj),
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*338.46*/("""{"""),format.raw/*338.47*/("""

                        """),format.raw/*340.25*/("""totalSteps=data.length;
                        stepsDone=0;
                        var result = "";
                        for (i = 0; i < data.length; i++) """),format.raw/*343.59*/("""{"""),format.raw/*343.60*/("""
                            """),format.raw/*344.29*/("""var obj = data[i];

                            var status;
                            if(obj.status)"""),format.raw/*347.43*/("""{"""),format.raw/*347.44*/("""
                                """),format.raw/*348.33*/("""stepsDone++;
                                obj.status="disabled='true'";
                            """),format.raw/*350.29*/("""}"""),format.raw/*350.30*/("""

"""),format.raw/*352.1*/("""//                                result= result+"<h1>"+obj.projectStepName+"</h1>";
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*370.81*/("""{"""),format.raw/*370.82*/("""
                                """),format.raw/*371.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*374.29*/("""}"""),format.raw/*374.30*/("""else"""),format.raw/*374.34*/("""{"""),format.raw/*374.35*/("""
                                """),format.raw/*375.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*377.29*/("""}"""),format.raw/*377.30*/("""
"""),format.raw/*378.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);
                            if(onlyPlanning)"""),format.raw/*382.45*/("""{"""),format.raw/*382.46*/("""
                                """),format.raw/*383.33*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*383.62*/("""{"""),format.raw/*383.63*/("""
                                    """),format.raw/*384.37*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*399.59*/("""{"""),format.raw/*399.60*/("""'id':12,'todo':'xyz'"""),format.raw/*399.80*/("""}"""),format.raw/*399.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*404.33*/("""}"""),format.raw/*404.34*/("""else"""),format.raw/*404.38*/("""{"""),format.raw/*404.39*/("""
                                    """),format.raw/*405.37*/("""result = result + "<button disabled" +
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
//                                            "data-todo='"""),format.raw/*420.59*/("""{"""),format.raw/*420.60*/("""'id':12,'todo':'xyz'"""),format.raw/*420.80*/("""}"""),format.raw/*420.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*425.33*/("""}"""),format.raw/*425.34*/("""


                            """),format.raw/*428.29*/("""}"""),format.raw/*428.30*/("""else"""),format.raw/*428.34*/("""{"""),format.raw/*428.35*/("""
                                """),format.raw/*429.33*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*444.59*/("""{"""),format.raw/*444.60*/("""'id':12,'todo':'xyz'"""),format.raw/*444.80*/("""}"""),format.raw/*444.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button>";
//
                            """),format.raw/*449.29*/("""}"""),format.raw/*449.30*/("""


                        """),format.raw/*452.25*/("""}"""),format.raw/*452.26*/("""
"""),format.raw/*453.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*457.21*/("""}"""),format.raw/*457.22*/(""",
                    error: function (data) """),format.raw/*458.44*/("""{"""),format.raw/*458.45*/("""
                        """),format.raw/*459.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*461.21*/("""}"""),format.raw/*461.22*/("""
                """),format.raw/*462.17*/("""}"""),format.raw/*462.18*/(""");

            """),format.raw/*464.13*/("""}"""),format.raw/*464.14*/("""


            """),format.raw/*467.13*/("""function onPerformStep(id)"""),format.raw/*467.39*/("""{"""),format.raw/*467.40*/("""

"""),format.raw/*469.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*473.43*/("""{"""),format.raw/*473.44*/("""
                    """),format.raw/*474.21*/("""var obj = """),format.raw/*474.31*/("""{"""),format.raw/*474.32*/("""
                        """),format.raw/*475.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*477.35*/model/*477.40*/.getGameId),format.raw/*477.50*/(""",
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
                    """),format.raw/*492.21*/("""}"""),format.raw/*492.22*/(""";
                """),format.raw/*493.17*/("""}"""),format.raw/*493.18*/("""

                """),format.raw/*495.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*495.77*/("""{"""),format.raw/*495.78*/("""
"""),format.raw/*496.1*/("""//                    alert(id);
                    var obj = """),format.raw/*497.31*/("""{"""),format.raw/*497.32*/("""
                        """),format.raw/*498.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*500.35*/model/*500.40*/.getGameId),format.raw/*500.50*/(""",
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
                    """),format.raw/*515.21*/("""}"""),format.raw/*515.22*/(""";
                """),format.raw/*516.17*/("""}"""),format.raw/*516.18*/("""

                """),format.raw/*518.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*518.49*/("""{"""),format.raw/*518.50*/("""
"""),format.raw/*519.1*/("""//                    alert(id);
                    var obj = """),format.raw/*520.31*/("""{"""),format.raw/*520.32*/("""
                        """),format.raw/*521.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*523.35*/model/*523.40*/.getGameId),format.raw/*523.50*/(""",
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
                    """),format.raw/*538.21*/("""}"""),format.raw/*538.22*/(""";
                """),format.raw/*539.17*/("""}"""),format.raw/*539.18*/(""" """),format.raw/*539.19*/("""else"""),format.raw/*539.23*/("""{"""),format.raw/*539.24*/("""
                    """),format.raw/*540.21*/("""var obj = """),format.raw/*540.31*/("""{"""),format.raw/*540.32*/("""
                        """),format.raw/*541.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*543.35*/model/*543.40*/.getGameId),format.raw/*543.50*/(""",
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
                    """),format.raw/*558.21*/("""}"""),format.raw/*558.22*/(""";
                """),format.raw/*559.17*/("""}"""),format.raw/*559.18*/("""

                """),format.raw/*561.17*/("""$.ajax("""),format.raw/*561.24*/("""{"""),format.raw/*561.25*/("""
                    """),format.raw/*562.21*/("""type: 'POST',
                    url: '"""),_display_(/*563.28*/routes/*563.34*/.GameController.performStep()),format.raw/*563.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*568.46*/("""{"""),format.raw/*568.47*/("""
                        """),format.raw/*569.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        document.getElementById('prevstep').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*572.50*/("""{"""),format.raw/*572.51*/("""
"""),format.raw/*573.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*574.34*/("""{"""),format.raw/*574.35*/("""
                                        """),format.raw/*575.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*580.37*/("""}"""),format.raw/*580.38*/(""",
                                    function(isConfirm)"""),format.raw/*581.56*/("""{"""),format.raw/*581.57*/("""
                                        """),format.raw/*582.41*/("""if (isConfirm) """),format.raw/*582.56*/("""{"""),format.raw/*582.57*/("""
"""),format.raw/*583.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*586.41*/("""}"""),format.raw/*586.42*/("""
                                    """),format.raw/*587.37*/("""}"""),format.raw/*587.38*/(""");
                        """),format.raw/*588.25*/("""}"""),format.raw/*588.26*/("""


                       """),format.raw/*591.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*592.25*/("""{"""),format.raw/*592.26*/("""
                           """),format.raw/*593.28*/("""// $('#updateactivity').trigger('click');
                           isOOPSCard=true;
                           console.log(isOOPSCard+"   hello am as ");
                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*598.56*/("""{"""),format.raw/*598.57*/("""
                                """),format.raw/*599.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*600.29*/("""}"""),format.raw/*600.30*/("""
                            """),format.raw/*601.29*/("""if(data.oops_points !=0) """),format.raw/*601.54*/("""{"""),format.raw/*601.55*/("""
                                """),format.raw/*602.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*603.29*/("""}"""),format.raw/*603.30*/("""
                            """),format.raw/*604.29*/("""if(data.oops_bonus !=0) """),format.raw/*604.53*/("""{"""),format.raw/*604.54*/("""
                                """),format.raw/*605.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*606.29*/("""}"""),format.raw/*606.30*/("""
                            """),format.raw/*607.29*/("""if(data.oops_budget !=0) """),format.raw/*607.54*/("""{"""),format.raw/*607.55*/("""
                                """),format.raw/*608.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*609.29*/("""}"""),format.raw/*609.30*/("""
                            """),format.raw/*610.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*612.36*/("""{"""),format.raw/*612.37*/("""   """),format.raw/*612.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*612.128*/("""}"""),format.raw/*612.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*619.25*/("""}"""),format.raw/*619.26*/("""
                        """),format.raw/*620.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*620.61*/("""{"""),format.raw/*620.62*/("""
                            """),format.raw/*621.29*/("""isSurpriseCard=true;
                            var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*624.60*/("""{"""),format.raw/*624.61*/("""
                                """),format.raw/*625.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*626.29*/("""}"""),format.raw/*626.30*/("""
                            """),format.raw/*627.29*/("""if(data.surprise_points !=0) """),format.raw/*627.58*/("""{"""),format.raw/*627.59*/("""
                                """),format.raw/*628.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*629.29*/("""}"""),format.raw/*629.30*/("""
                            """),format.raw/*630.29*/("""if(data.surprise_bonus !=0) """),format.raw/*630.57*/("""{"""),format.raw/*630.58*/("""
                                """),format.raw/*631.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*632.29*/("""}"""),format.raw/*632.30*/("""
                            """),format.raw/*633.29*/("""if(data.surprise_budget !=0) """),format.raw/*633.58*/("""{"""),format.raw/*633.59*/("""
                                """),format.raw/*634.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*635.29*/("""}"""),format.raw/*635.30*/("""
                            """),format.raw/*636.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*638.36*/("""{"""),format.raw/*638.37*/("""   """),format.raw/*638.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*638.135*/("""}"""),format.raw/*638.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*646.25*/("""}"""),format.raw/*646.26*/("""
                        """),format.raw/*647.25*/("""else if(data.steptype == "production")"""),format.raw/*647.63*/("""{"""),format.raw/*647.64*/("""
                            """),format.raw/*648.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*649.52*/("""{"""),format.raw/*649.53*/("""
                                """),format.raw/*650.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*651.29*/("""}"""),format.raw/*651.30*/("""
                            """),format.raw/*652.29*/("""else"""),format.raw/*652.33*/("""{"""),format.raw/*652.34*/("""
                                """),format.raw/*653.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*654.29*/("""}"""),format.raw/*654.30*/("""

                            """),format.raw/*656.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*658.25*/("""}"""),format.raw/*658.26*/("""
                        """),format.raw/*659.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*659.61*/("""{"""),format.raw/*659.62*/("""
                          """),format.raw/*660.27*/("""isSkipped=true;
                            if($('#btnIsProduction').val() != "true")"""),format.raw/*661.70*/("""{"""),format.raw/*661.71*/("""
                                """),format.raw/*662.33*/("""//swal("""),format.raw/*662.40*/("""{"""),format.raw/*662.41*/("""   """),format.raw/*662.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*662.118*/("""}"""),format.raw/*662.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*665.29*/("""}"""),format.raw/*665.30*/("""

                        """),format.raw/*667.25*/("""}"""),format.raw/*667.26*/("""
                        """),format.raw/*668.25*/("""else if(data.steptype == "risk")"""),format.raw/*668.57*/("""{"""),format.raw/*668.58*/("""
                            """),format.raw/*669.29*/("""if(data.risk_status == "success")"""),format.raw/*669.62*/("""{"""),format.raw/*669.63*/("""
                                """),format.raw/*670.33*/("""//swal("""),format.raw/*670.40*/("""{"""),format.raw/*670.41*/("""   """),format.raw/*670.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*670.142*/("""}"""),format.raw/*670.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*673.29*/("""}"""),format.raw/*673.30*/("""
                            """),format.raw/*674.29*/("""else"""),format.raw/*674.33*/("""{"""),format.raw/*674.34*/("""
                                """),format.raw/*675.33*/("""//swal("""),format.raw/*675.40*/("""{"""),format.raw/*675.41*/("""   """),format.raw/*675.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*675.127*/("""}"""),format.raw/*675.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*678.29*/("""}"""),format.raw/*678.30*/("""
                        """),format.raw/*679.25*/("""}"""),format.raw/*679.26*/("""
                        """),format.raw/*680.25*/("""else
                        """),format.raw/*681.25*/("""{"""),format.raw/*681.26*/("""
                            """),format.raw/*682.29*/("""//swal("""),format.raw/*682.36*/("""{"""),format.raw/*682.37*/("""   """),format.raw/*682.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*682.134*/("""}"""),format.raw/*682.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*685.25*/("""}"""),format.raw/*685.26*/("""
                        """),format.raw/*686.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*697.91*/("""{"""),format.raw/*697.92*/("""

                            """),format.raw/*699.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*701.25*/("""}"""),format.raw/*701.26*/("""
                    """),format.raw/*702.21*/("""//    refreshProjectSteps();


                    """),format.raw/*705.21*/("""}"""),format.raw/*705.22*/(""",
                    error: function (data) """),format.raw/*706.44*/("""{"""),format.raw/*706.45*/("""
                      """),format.raw/*707.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*710.21*/("""}"""),format.raw/*710.22*/("""
                """),format.raw/*711.17*/("""}"""),format.raw/*711.18*/(""");
            """),format.raw/*712.13*/("""}"""),format.raw/*712.14*/("""

            """),format.raw/*714.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*716.47*/("""{"""),format.raw/*716.48*/("""

                 """),format.raw/*718.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*723.27*/("""{"""),format.raw/*723.28*/("""
                    """),format.raw/*724.21*/("""'phaseId': clicked_id
                """),format.raw/*725.17*/("""}"""),format.raw/*725.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*727.43*/("""{"""),format.raw/*727.44*/("""
                    """),format.raw/*728.21*/("""swal("""),format.raw/*728.26*/("""{"""),format.raw/*728.27*/("""   """),format.raw/*728.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*728.232*/("""}"""),format.raw/*728.233*/(""", function()"""),format.raw/*728.245*/("""{"""),format.raw/*728.246*/("""

               """),format.raw/*730.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*732.74*/("""{"""),format.raw/*732.75*/("""
                            """),format.raw/*733.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*736.25*/("""}"""),format.raw/*736.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*738.61*/("""{"""),format.raw/*738.62*/("""
                            """),format.raw/*739.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*741.54*/("""{"""),format.raw/*741.55*/("""
                                """),format.raw/*742.33*/("""riskcount++;
                            """),format.raw/*743.29*/("""}"""),format.raw/*743.30*/("""
                        """),format.raw/*744.25*/("""}"""),format.raw/*744.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*750.48*/("""{"""),format.raw/*750.49*/("""
                        """),format.raw/*751.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*752.21*/("""}"""),format.raw/*752.22*/("""
                        """),format.raw/*753.25*/("""}"""),format.raw/*753.26*/(""");
                """),format.raw/*754.17*/("""}"""),format.raw/*754.18*/("""

                """),format.raw/*756.17*/("""else """),format.raw/*756.22*/("""{"""),format.raw/*756.23*/("""

                    """),format.raw/*758.21*/("""$.ajax("""),format.raw/*758.28*/("""{"""),format.raw/*758.29*/("""
                        """),format.raw/*759.25*/("""type: 'POST',
                        url: '"""),_display_(/*760.32*/routes/*760.38*/.GameController.getProjectSteps()),format.raw/*760.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*765.50*/("""{"""),format.raw/*765.51*/("""
"""),format.raw/*766.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*769.63*/("""{"""),format.raw/*769.64*/("""
                                """),format.raw/*770.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*771.61*/("""{"""),format.raw/*771.62*/("""
                                    """),format.raw/*772.37*/("""if (obj.status) """),format.raw/*772.53*/("""{"""),format.raw/*772.54*/("""
                                        """),format.raw/*773.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*774.37*/("""}"""),format.raw/*774.38*/("""
                                """),format.raw/*775.33*/("""}"""),format.raw/*775.34*/("""
"""),format.raw/*776.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*778.49*/("""{"""),format.raw/*778.50*/("""
                                    """),format.raw/*779.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*780.33*/("""}"""),format.raw/*780.34*/("""


                                """),format.raw/*783.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*797.91*/("""{"""),format.raw/*797.92*/("""
                                    """),format.raw/*798.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*801.33*/("""}"""),format.raw/*801.34*/(""" """),format.raw/*801.35*/("""else """),format.raw/*801.40*/("""{"""),format.raw/*801.41*/("""
                                    """),format.raw/*802.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*804.33*/("""}"""),format.raw/*804.34*/("""
"""),format.raw/*805.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

if(isOOPSCard)
"""),format.raw/*811.1*/("""{"""),format.raw/*811.2*/("""
  """),format.raw/*812.3*/("""isOOPSCard=false;
"""),format.raw/*813.1*/("""}"""),format.raw/*813.2*/("""
"""),format.raw/*814.1*/("""if(isSurpriseCard)
"""),format.raw/*815.1*/("""{"""),format.raw/*815.2*/("""
  """),format.raw/*816.3*/("""isSurpriseCard=false;
"""),format.raw/*817.1*/("""}"""),format.raw/*817.2*/("""

"""),format.raw/*819.1*/("""if(isSkipped)
"""),format.raw/*820.1*/("""{"""),format.raw/*820.2*/("""
  """),format.raw/*821.3*/("""isSkipped=false;
"""),format.raw/*822.1*/("""}"""),format.raw/*822.2*/("""

"""),format.raw/*824.1*/("""if((obj.projectStepId == 'CPSM25' || obj.projectStepId == 'CPSM26' ||obj.projectStepId == 'CPSM27' ||obj.projectStepId == 'CPSM28' ||obj.projectStepId == 'CPSM29' ||obj.projectStepId == 'CPSM30' ||obj.projectStepId == 'CPSM31' ||obj.projectStepId == 'CPSM32' ||obj.projectStepId == 'CPSM33'
  || obj.projectStepId == 'CPSM34' ||obj.projectStepId == 'CPSM35'
   ||obj.projectStepId == 'CPSM36')&&(obj.status == "disabled='true'")
   &&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(c==1))
"""),format.raw/*828.1*/("""{"""),format.raw/*828.2*/("""
"""),format.raw/*829.1*/("""isImplementedBeforeProduction=true;
c=2;
console.log(isImplementedBeforeProduction+" i am inside if condition");
"""),format.raw/*832.1*/("""}"""),format.raw/*832.2*/("""

"""),format.raw/*834.1*/("""if((obj.projectStepId == 'CPSM16')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cr==1))
"""),format.raw/*836.1*/("""{"""),format.raw/*836.2*/("""
"""),format.raw/*837.1*/("""cr=2;
isRequirementPlanningDone=true;
"""),format.raw/*839.1*/("""}"""),format.raw/*839.2*/("""
"""),format.raw/*840.1*/("""if((obj.projectStepId == 'CPSM17')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ct==1))
"""),format.raw/*842.1*/("""{"""),format.raw/*842.2*/("""
"""),format.raw/*843.1*/("""ct=2;
isTestingPlanningDone=true;
"""),format.raw/*845.1*/("""}"""),format.raw/*845.2*/("""
"""),format.raw/*846.1*/("""if((obj.projectStepId == 'CPSM18')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ci==1))
"""),format.raw/*848.1*/("""{"""),format.raw/*848.2*/("""
"""),format.raw/*849.1*/("""ci=2;
isImplementationPlanningDone=true;
"""),format.raw/*851.1*/("""}"""),format.raw/*851.2*/("""
"""),format.raw/*852.1*/("""if((obj.projectStepId == 'CPSM19')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cd==1))
"""),format.raw/*854.1*/("""{"""),format.raw/*854.2*/("""
"""),format.raw/*855.1*/("""cd=2;
isDesignPlanningDone=true;
"""),format.raw/*857.1*/("""}"""),format.raw/*857.2*/("""
"""),format.raw/*858.1*/("""if((obj.projectStepId == 'CPSM20')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cp==1))
"""),format.raw/*860.1*/("""{"""),format.raw/*860.2*/("""
"""),format.raw/*861.1*/("""cp=2;
isProductionPlanningDone=true;
"""),format.raw/*863.1*/("""}"""),format.raw/*863.2*/("""



"""),format.raw/*867.1*/("""isSkipped=true;
isOOPSCard=true;
isSurpriseCard=true;


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
//                                            "data-todo='"""),format.raw/*887.59*/("""{"""),format.raw/*887.60*/("""'id':12,'todo':'xyz'"""),format.raw/*887.80*/("""}"""),format.raw/*887.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*893.29*/("""}"""),format.raw/*893.30*/("""

"""),format.raw/*895.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;


                            """),format.raw/*901.77*/("""
                            """),format.raw/*902.29*/("""var result="";
                            var count=0;
                        """),_display_(/*904.26*/for(phases <- model.getPhases()) yield /*904.58*/ {_display_(Seq[Any](format.raw/*904.60*/("""

                  """),format.raw/*906.19*/("""count++;
                  if(count==1)
                  """),format.raw/*908.19*/("""{"""),format.raw/*908.20*/("""
                  """),format.raw/*909.19*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                      "style='background-color: #DB8B00 !important;'" +
                      "onclick='onPhaseClick(id)' " +
                      "id='"""),_display_(/*912.29*/phases/*912.35*/.getPhaseId),format.raw/*912.46*/("""'>"""),_display_(/*912.49*/phases/*912.55*/.getPhaseName),format.raw/*912.68*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                  """),format.raw/*913.19*/("""}"""),format.raw/*913.20*/("""
                  """),format.raw/*914.19*/("""else if(count==2)
                  """),format.raw/*915.19*/("""{"""),format.raw/*915.20*/("""
                    """),format.raw/*916.21*/("""if(isRequirementPlanningDone)
                    """),format.raw/*917.21*/("""{"""),format.raw/*917.22*/("""
                      """),format.raw/*918.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*921.33*/phases/*921.39*/.getPhaseId),format.raw/*921.50*/("""'>"""),_display_(/*921.53*/phases/*921.59*/.getPhaseName),format.raw/*921.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*922.21*/("""}"""),format.raw/*922.22*/("""
                    """),format.raw/*923.21*/("""else """),format.raw/*923.26*/("""{"""),format.raw/*923.27*/("""
                      """),format.raw/*924.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*927.35*/phases/*927.41*/.getPhaseId),format.raw/*927.52*/("""'>"""),_display_(/*927.55*/phases/*927.61*/.getPhaseName),format.raw/*927.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*929.21*/("""}"""),format.raw/*929.22*/("""
                  """),format.raw/*930.19*/("""}"""),format.raw/*930.20*/("""
                  """),format.raw/*931.19*/("""else if(count==3)
                  """),format.raw/*932.19*/("""{"""),format.raw/*932.20*/("""
                    """),format.raw/*933.21*/("""if(isDesignPlanningDone)
                    """),format.raw/*934.21*/("""{"""),format.raw/*934.22*/("""
                      """),format.raw/*935.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*938.33*/phases/*938.39*/.getPhaseId),format.raw/*938.50*/("""'>"""),_display_(/*938.53*/phases/*938.59*/.getPhaseName),format.raw/*938.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*939.21*/("""}"""),format.raw/*939.22*/("""
                    """),format.raw/*940.21*/("""else """),format.raw/*940.26*/("""{"""),format.raw/*940.27*/("""
                      """),format.raw/*941.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*944.35*/phases/*944.41*/.getPhaseId),format.raw/*944.52*/("""'>"""),_display_(/*944.55*/phases/*944.61*/.getPhaseName),format.raw/*944.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*946.21*/("""}"""),format.raw/*946.22*/("""
                  """),format.raw/*947.19*/("""}"""),format.raw/*947.20*/("""
                  """),format.raw/*948.19*/("""else if(count==4)
                  """),format.raw/*949.19*/("""{"""),format.raw/*949.20*/("""
                    """),format.raw/*950.21*/("""if(isImplementationPlanningDone)
                    """),format.raw/*951.21*/("""{"""),format.raw/*951.22*/("""
                      """),format.raw/*952.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*955.33*/phases/*955.39*/.getPhaseId),format.raw/*955.50*/("""'>"""),_display_(/*955.53*/phases/*955.59*/.getPhaseName),format.raw/*955.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*956.21*/("""}"""),format.raw/*956.22*/("""
                    """),format.raw/*957.21*/("""else """),format.raw/*957.26*/("""{"""),format.raw/*957.27*/("""
                      """),format.raw/*958.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*961.35*/phases/*961.41*/.getPhaseId),format.raw/*961.52*/("""'>"""),_display_(/*961.55*/phases/*961.61*/.getPhaseName),format.raw/*961.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*963.21*/("""}"""),format.raw/*963.22*/("""
                  """),format.raw/*964.19*/("""}"""),format.raw/*964.20*/("""
                  """),format.raw/*965.19*/("""else if(count==5)
                  """),format.raw/*966.19*/("""{"""),format.raw/*966.20*/("""
                    """),format.raw/*967.21*/("""if(isTestingPlanningDone)
                    """),format.raw/*968.21*/("""{"""),format.raw/*968.22*/("""
                      """),format.raw/*969.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*972.33*/phases/*972.39*/.getPhaseId),format.raw/*972.50*/("""'>"""),_display_(/*972.53*/phases/*972.59*/.getPhaseName),format.raw/*972.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*973.21*/("""}"""),format.raw/*973.22*/("""
                    """),format.raw/*974.21*/("""else """),format.raw/*974.26*/("""{"""),format.raw/*974.27*/("""
                      """),format.raw/*975.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*978.35*/phases/*978.41*/.getPhaseId),format.raw/*978.52*/("""'>"""),_display_(/*978.55*/phases/*978.61*/.getPhaseName),format.raw/*978.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*980.21*/("""}"""),format.raw/*980.22*/("""
                  """),format.raw/*981.19*/("""}"""),format.raw/*981.20*/("""
                  """),format.raw/*982.19*/("""else if(count==6)
                  """),format.raw/*983.19*/("""{"""),format.raw/*983.20*/("""
                    """),format.raw/*984.21*/("""console.log(isProductionPlanningDone+" i am is production planning"+isImplementedBeforeProduction+" i am before guy");
                    if(isImplementedBeforeProduction && isProductionPlanningDone)
                    """),format.raw/*986.21*/("""{"""),format.raw/*986.22*/("""
                    """),format.raw/*987.21*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*990.33*/phases/*990.39*/.getPhaseId),format.raw/*990.50*/("""'>"""),_display_(/*990.53*/phases/*990.59*/.getPhaseName),format.raw/*990.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*991.21*/("""}"""),format.raw/*991.22*/("""
                    """),format.raw/*992.21*/("""else """),format.raw/*992.26*/("""{"""),format.raw/*992.27*/("""
                    """),format.raw/*993.21*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*996.33*/phases/*996.39*/.getPhaseId),format.raw/*996.50*/("""'>"""),_display_(/*996.53*/phases/*996.59*/.getPhaseName),format.raw/*996.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*998.21*/("""}"""),format.raw/*998.22*/("""
                  """),format.raw/*999.19*/("""}"""),format.raw/*999.20*/("""

                            """)))}),format.raw/*1001.30*/("""

                            """),format.raw/*1003.29*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
                  //                alert(result);







                        """),format.raw/*1012.25*/("""}"""),format.raw/*1012.26*/(""",
                        error: function (data) """),format.raw/*1013.48*/("""{"""),format.raw/*1013.49*/("""
                            """),format.raw/*1014.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*1016.25*/("""}"""),format.raw/*1016.26*/("""
                    """),format.raw/*1017.21*/("""}"""),format.raw/*1017.22*/(""");
                """),format.raw/*1018.17*/("""}"""),format.raw/*1018.18*/("""





            """),format.raw/*1024.13*/("""}"""),format.raw/*1024.14*/("""

            """),format.raw/*1026.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*1026.67*/("""{"""),format.raw/*1026.68*/("""
"""),format.raw/*1027.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*1043.42*/("""{"""),format.raw/*1043.43*/("""
                    """),format.raw/*1044.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*1045.17*/("""}"""),format.raw/*1045.18*/("""else"""),format.raw/*1045.22*/("""{"""),format.raw/*1045.23*/("""
                    """),format.raw/*1046.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*1047.17*/("""}"""),format.raw/*1047.18*/("""
                """),format.raw/*1048.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*1067.13*/("""}"""),format.raw/*1067.14*/(""");




            function totalGameTimer() """),format.raw/*1072.39*/("""{"""),format.raw/*1072.40*/("""

                """),format.raw/*1074.17*/("""var sec = 0;

                function pad(val) """),format.raw/*1076.35*/("""{"""),format.raw/*1076.36*/("""
                    """),format.raw/*1077.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*1078.17*/("""}"""),format.raw/*1078.18*/("""

                """),format.raw/*1080.17*/("""var timer = setInterval(function () """),format.raw/*1080.53*/("""{"""),format.raw/*1080.54*/("""
                    """),format.raw/*1081.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*1083.17*/("""}"""),format.raw/*1083.18*/(""", 1000);

                setTimeout(function () """),format.raw/*1085.40*/("""{"""),format.raw/*1085.41*/("""
                    """),format.raw/*1086.21*/("""clearInterval(timer);
                """),format.raw/*1087.17*/("""}"""),format.raw/*1087.18*/(""", 50000000);
            """),format.raw/*1088.13*/("""}"""),format.raw/*1088.14*/("""
            """),format.raw/*1089.13*/("""function refreshProjectSteps()"""),format.raw/*1089.43*/("""{"""),format.raw/*1089.44*/("""
                """),format.raw/*1090.65*/("""
                """),format.raw/*1091.17*/("""var result="";
                var count=0;
            """),_display_(/*1093.14*/for(phases <- model.getPhases()) yield /*1093.46*/ {_display_(Seq[Any](format.raw/*1093.48*/("""

"""),format.raw/*1095.1*/("""count++;
if(count<6)
"""),format.raw/*1097.1*/("""{"""),format.raw/*1097.2*/("""
  """),format.raw/*1098.3*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
          "style='background-color: #DB8B00 !important;'" +
          "onclick='onPhaseClick(id)' " +
          "id='"""),_display_(/*1101.17*/phases/*1101.23*/.getPhaseId),format.raw/*1101.34*/("""'>"""),_display_(/*1101.37*/phases/*1101.43*/.getPhaseName),format.raw/*1101.56*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
"""),format.raw/*1102.1*/("""}"""),format.raw/*1102.2*/("""
"""),format.raw/*1103.1*/("""else """),format.raw/*1103.6*/("""{"""),format.raw/*1103.7*/("""
  """),format.raw/*1104.3*/("""console.log(isImplementedBeforeProduction);
  console.log("i am here in");
  if(isImplementedBeforeProduction)
  """),format.raw/*1107.3*/("""{"""),format.raw/*1107.4*/("""
    """),format.raw/*1108.5*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1111.19*/phases/*1111.25*/.getPhaseId),format.raw/*1111.36*/("""'>"""),_display_(/*1111.39*/phases/*1111.45*/.getPhaseName),format.raw/*1111.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
  """),format.raw/*1112.3*/("""}"""),format.raw/*1112.4*/("""
  """),format.raw/*1113.3*/("""else """),format.raw/*1113.8*/("""{"""),format.raw/*1113.9*/("""
    """),format.raw/*1114.5*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1117.19*/phases/*1117.25*/.getPhaseId),format.raw/*1117.36*/("""'>"""),_display_(/*1117.39*/phases/*1117.45*/.getPhaseName),format.raw/*1117.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

  """),format.raw/*1119.3*/("""}"""),format.raw/*1119.4*/("""
"""),format.raw/*1120.1*/("""}"""),format.raw/*1120.2*/("""








                """)))}),format.raw/*1129.18*/("""

                """),format.raw/*1131.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*1134.13*/("""}"""),format.raw/*1134.14*/("""

            """),format.raw/*1136.13*/("""function newfunc()"""),format.raw/*1136.31*/("""{"""),format.raw/*1136.32*/("""
                """),format.raw/*1137.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*1139.13*/("""}"""),format.raw/*1139.14*/("""
    """),format.raw/*1140.5*/("""</script>
    <body style="background-image: url("""),_display_(/*1141.41*/routes/*1141.47*/.Assets.at("images/bg.jpg")),format.raw/*1141.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*1144.68*/model/*1144.73*/.getUserName()),format.raw/*1144.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*1145.64*/model/*1145.69*/.getGameId()),format.raw/*1145.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*1146.60*/model/*1146.65*/.getTurnNo()),format.raw/*1146.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*1147.68*/model/*1147.73*/.getTimeForEachMove()),format.raw/*1147.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*1152.64*/routes/*1152.70*/.DashboardController.viewDashboard()),format.raw/*1152.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*1160.51*/("""
                """),format.raw/*1161.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*1161.95*/model/*1161.100*/.getGameId()),format.raw/*1161.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*1164.44*/model/*1164.49*/.getStepsForEachPlayer()),format.raw/*1164.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*1171.126*/model/*1171.131*/.getUserName().split("@")/*1171.156*/(0)),format.raw/*1171.159*/("""!</div>
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
                            """),format.raw/*1256.105*/("""
                        """),format.raw/*1257.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1274.126*/model/*1274.131*/.getBudget()),format.raw/*1274.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1276.141*/model/*1276.146*/.getCapabilityPoints()),format.raw/*1276.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1278.139*/model/*1278.144*/.getCapabilityBonus()),format.raw/*1278.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1283.180*/model/*1283.185*/.getResources),format.raw/*1283.198*/("""</div>
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


                                              """),format.raw/*1306.138*/("""


                                          """),format.raw/*1309.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1319.83*/model/*1319.88*/.getBudget()),format.raw/*1319.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1320.84*/model/*1320.89*/.getCapabilityPoints()),format.raw/*1320.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1321.83*/model/*1321.88*/.getCapabilityBonus()),format.raw/*1321.109*/("""</div>
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


                                    """),_display_(/*1359.38*/for(phase <- model.getPhases()) yield /*1359.69*/ {_display_(Seq[Any](format.raw/*1359.71*/("""
                                        """),_display_(/*1360.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1360.95*/{_display_(Seq[Any](format.raw/*1360.96*/("""

                                            """),format.raw/*1362.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1365.49*/phase/*1365.54*/.getPhaseId),format.raw/*1365.65*/(""">"""),_display_(/*1365.67*/phase/*1365.72*/.getPhaseName()),format.raw/*1365.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1367.42*/else/*1367.46*/{_display_(Seq[Any](format.raw/*1367.47*/("""
                                            """),format.raw/*1368.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1371.49*/phase/*1371.54*/.getPhaseId),format.raw/*1371.65*/(""">"""),_display_(/*1371.67*/phase/*1371.72*/.getPhaseName()),format.raw/*1371.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1373.42*/("""

                                    """)))}),format.raw/*1375.38*/("""


                                """),format.raw/*1378.33*/("""</div>





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
                    """),format.raw/*1449.51*/("""
                    """),format.raw/*1450.55*/("""
                    """),format.raw/*1451.52*/("""
                    """),format.raw/*1452.105*/("""




                    """),format.raw/*1457.21*/("""<div class="panel panel-default" >
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
                  DATE: Sat Jul 29 22:53:45 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: daec0d4b5fd01b31fbcad7f12effc6fda1303163
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10995->6752|11025->6753|11072->6771|11132->6802|11162->6803|11204->6816|11298->6881|11328->6882|11375->6900|11446->6942|11476->6943|11518->6956|11610->7019|11640->7020|11686->7037|11770->7092|11800->7093|11850->7114|11919->7155|11935->7161|11987->7191|12238->7413|12268->7414|12297->7415|12576->7665|12606->7666|12665->7696|12979->7981|13009->7982|13038->7983|13271->8187|13301->8188|13334->8192|13364->8193|13426->8226|13505->8276|13535->8277|13596->8309|14682->9366|14712->9367|14774->9400|15014->9611|15044->9612|15077->9616|15107->9617|15169->9650|15299->9751|15329->9752|15358->9753|16913->11279|16943->11280|16997->11305|17147->11426|17177->11427|17251->11472|17281->11473|17335->11498|17456->11590|17486->11591|17532->11608|17562->11609|17607->11625|17637->11626|17680->11640|17765->11696|17795->11697|17838->11711|18357->12201|18387->12202|18437->12223|18592->12349|18622->12350|18655->12354|18685->12355|18735->12376|18836->12448|18866->12449|18912->12466|19762->13287|19792->13288|19864->13331|19894->13332|19923->13333|20165->13546|20195->13547|20239->13562|20418->13712|20448->13713|20477->13714|20602->13810|20632->13811|20682->13832|20740->13861|20770->13862|20816->13879|20852->13886|20882->13887|20932->13908|21001->13949|21017->13955|21075->13991|21286->14173|21316->14174|21371->14200|21560->14360|21590->14361|21648->14390|21779->14492|21809->14493|21871->14526|22003->14629|22033->14630|22063->14632|23303->15843|23333->15844|23395->15877|23635->16088|23665->16089|23698->16093|23728->16094|23790->16127|23920->16228|23950->16229|23979->16230|24341->16563|24371->16564|24433->16597|24491->16626|24521->16627|24587->16664|26076->18124|26106->18125|26155->18145|26185->18146|26539->18471|26569->18472|26602->18476|26632->18477|26698->18514|28195->19982|28225->19983|28274->20003|28304->20004|28658->20329|28688->20330|28748->20361|28778->20362|28811->20366|28841->20367|28903->20400|30336->21804|30366->21805|30415->21825|30445->21826|30783->22135|30813->22136|30869->22163|30899->22164|30928->22165|31240->22448|31270->22449|31344->22494|31374->22495|31428->22520|31563->22626|31593->22627|31639->22644|31669->22645|31714->22661|31744->22662|31788->22677|31843->22703|31873->22704|31903->22706|32266->23040|32296->23041|32346->23062|32385->23072|32415->23073|32469->23098|32588->23189|32603->23194|32635->23204|33656->24196|33686->24197|33733->24215|33763->24216|33810->24234|33899->24294|33929->24295|33958->24296|34050->24359|34080->24360|34134->24385|34253->24476|34268->24481|34300->24491|35318->25480|35348->25481|35395->25499|35425->25500|35472->25518|35533->25550|35563->25551|35592->25552|35684->25615|35714->25616|35768->25641|35883->25728|35898->25733|35930->25743|36953->26737|36983->26738|37030->26756|37060->26757|37090->26758|37123->26762|37153->26763|37203->26784|37242->26794|37272->26795|37326->26820|37441->26907|37456->26912|37488->26922|38501->27906|38531->27907|38578->27925|38608->27926|38655->27944|38691->27951|38721->27952|38771->27973|38840->28014|38856->28020|38907->28049|39169->28282|39199->28283|39253->28308|39530->28556|39560->28557|39589->28558|39703->28643|39733->28644|39803->28685|40176->29029|40206->29030|40292->29087|40322->29088|40392->29129|40436->29144|40466->29145|40495->29146|40703->29325|40733->29326|40799->29363|40829->29364|40885->29391|40915->29392|40970->29418|41056->29475|41086->29476|41143->29504|41440->29772|41470->29773|41532->29806|41647->29892|41677->29893|41735->29922|41789->29947|41819->29948|41881->29981|42003->30074|42033->30075|42091->30104|42144->30128|42174->30129|42236->30162|42356->30253|42386->30254|42444->30283|42498->30308|42528->30309|42590->30342|42702->30425|42732->30426|42790->30455|42910->30546|42940->30547|42972->30550|43090->30638|43121->30639|43654->31143|43684->31144|43738->31169|43803->31205|43833->31206|43891->31235|44059->31374|44089->31375|44151->31408|44270->31498|44300->31499|44358->31528|44416->31557|44446->31558|44508->31591|44634->31688|44664->31689|44722->31718|44779->31746|44809->31747|44871->31780|44995->31875|45025->31876|45083->31905|45141->31934|45171->31935|45233->31968|45349->32055|45379->32056|45437->32085|45557->32176|45587->32177|45619->32180|45744->32275|45775->32276|46379->32851|46409->32852|46463->32877|46530->32915|46560->32916|46618->32945|46717->33015|46747->33016|46809->33049|46978->33189|47008->33190|47066->33219|47099->33223|47129->33224|47191->33257|47355->33392|47385->33393|47444->33423|47609->33559|47639->33560|47693->33585|47758->33621|47788->33622|47844->33649|47958->33734|47988->33735|48050->33768|48086->33775|48116->33776|48148->33779|48252->33853|48283->33854|48492->34034|48522->34035|48577->34061|48607->34062|48661->34087|48722->34119|48752->34120|48810->34149|48872->34182|48902->34183|48964->34216|49000->34223|49030->34224|49062->34227|49190->34325|49221->34326|49436->34512|49466->34513|49524->34542|49557->34546|49587->34547|49649->34580|49685->34587|49715->34588|49747->34591|49860->34674|49891->34675|50106->34861|50136->34862|50190->34887|50220->34888|50274->34913|50332->34942|50362->34943|50420->34972|50456->34979|50486->34980|50518->34983|50642->35077|50673->35078|50881->35257|50911->35258|50965->35283|51816->36105|51846->36106|51905->36136|52042->36244|52072->36245|52122->36266|52202->36317|52232->36318|52306->36363|52336->36364|52388->36387|52574->36544|52604->36545|52650->36562|52680->36563|52724->36578|52754->36579|52797->36593|52932->36699|52962->36700|53010->36719|53254->36934|53284->36935|53334->36956|53401->36994|53431->36995|53505->37040|53535->37041|53585->37062|53619->37067|53649->37068|53681->37071|53913->37273|53944->37274|53986->37286|54017->37287|54063->37304|54308->37520|54338->37521|54396->37550|54498->37623|54528->37624|54665->37732|54695->37733|54753->37762|54882->37862|54912->37863|54974->37896|55044->37937|55074->37938|55128->37963|55158->37964|55513->38290|55543->38291|55597->38316|55751->38441|55781->38442|55835->38467|55865->38468|55913->38487|55943->38488|55990->38506|56024->38511|56054->38512|56105->38534|56141->38541|56171->38542|56225->38567|56298->38612|56314->38618|56369->38651|56658->38911|56688->38912|56717->38913|56972->39139|57002->39140|57064->39173|57172->39252|57202->39253|57268->39290|57313->39306|57343->39307|57413->39348|57501->39407|57531->39408|57593->39441|57623->39442|57652->39443|57826->39588|57856->39589|57922->39626|58014->39689|58044->39690|58108->39725|59252->40840|59282->40841|59348->40878|59600->41101|59630->41102|59660->41103|59694->41108|59724->41109|59790->41146|59932->41259|59962->41260|59991->41261|60324->41566|60353->41567|60384->41570|60430->41588|60459->41589|60488->41590|60535->41609|60564->41610|60595->41613|60645->41635|60674->41636|60704->41638|60746->41652|60775->41653|60806->41656|60851->41673|60880->41674|60910->41676|61428->42166|61457->42167|61486->42168|61627->42281|61656->42282|61686->42284|61843->42413|61872->42414|61901->42415|61967->42453|61996->42454|62025->42455|62182->42584|62211->42585|62240->42586|62302->42620|62331->42621|62360->42622|62517->42751|62546->42752|62575->42753|62644->42794|62673->42795|62702->42796|62859->42925|62888->42926|62917->42927|62978->42960|63007->42961|63036->42962|63193->43091|63222->43092|63251->43093|63316->43130|63345->43131|63377->43135|64907->44636|64937->44637|64986->44657|65016->44658|65515->45128|65545->45129|65575->45131|65924->45499|65982->45528|66091->45609|66140->45641|66181->45643|66230->45663|66317->45721|66347->45722|66395->45741|66640->45958|66656->45964|66689->45975|66720->45978|66736->45984|66771->45997|66881->46078|66911->46079|66959->46098|67024->46134|67054->46135|67104->46156|67183->46206|67213->46207|67265->46230|67522->46459|67538->46465|67571->46476|67602->46479|67618->46485|67653->46498|67765->46581|67795->46582|67845->46603|67879->46608|67909->46609|67961->46632|68240->46883|68256->46889|68289->46900|68320->46903|68336->46909|68371->46922|68484->47006|68514->47007|68562->47026|68592->47027|68640->47046|68705->47082|68735->47083|68785->47104|68859->47149|68889->47150|68941->47173|69198->47402|69214->47408|69247->47419|69278->47422|69294->47428|69329->47441|69441->47524|69471->47525|69521->47546|69555->47551|69585->47552|69637->47575|69916->47826|69932->47832|69965->47843|69996->47846|70012->47852|70047->47865|70160->47949|70190->47950|70238->47969|70268->47970|70316->47989|70381->48025|70411->48026|70461->48047|70543->48100|70573->48101|70625->48124|70882->48353|70898->48359|70931->48370|70962->48373|70978->48379|71013->48392|71125->48475|71155->48476|71205->48497|71239->48502|71269->48503|71321->48526|71600->48777|71616->48783|71649->48794|71680->48797|71696->48803|71731->48816|71844->48900|71874->48901|71922->48920|71952->48921|72000->48940|72065->48976|72095->48977|72145->48998|72220->49044|72250->49045|72302->49068|72559->49297|72575->49303|72608->49314|72639->49317|72655->49323|72690->49336|72802->49419|72832->49420|72882->49441|72916->49446|72946->49447|72998->49470|73277->49721|73293->49727|73326->49738|73357->49741|73373->49747|73408->49760|73521->49844|73551->49845|73599->49864|73629->49865|73677->49884|73742->49920|73772->49921|73822->49942|74072->50163|74102->50164|74152->50185|74409->50414|74425->50420|74458->50431|74489->50434|74505->50440|74540->50453|74652->50536|74682->50537|74732->50558|74766->50563|74796->50564|74846->50585|75119->50830|75135->50836|75168->50847|75199->50850|75215->50856|75250->50869|75363->50953|75393->50954|75441->50973|75471->50974|75535->51005|75595->51035|75773->51183|75804->51184|75883->51233|75914->51234|75973->51263|76103->51363|76134->51364|76185->51385|76216->51386|76265->51405|76296->51406|76344->51424|76375->51425|76419->51439|76503->51493|76534->51494|76564->51495|77508->52409|77539->52410|77590->52431|77747->52558|77778->52559|77812->52563|77843->52564|77894->52585|77992->52653|78023->52654|78070->52671|79159->53730|79190->53731|79265->53776|79296->53777|79344->53795|79422->53843|79453->53844|79504->53865|79584->53915|79615->53916|79663->53934|79729->53970|79760->53971|79811->53992|80017->54168|80048->54169|80127->54218|80158->54219|80209->54240|80277->54278|80308->54279|80363->54304|80394->54305|80437->54318|80497->54348|80528->54349|80575->54414|80622->54431|80708->54488|80758->54520|80800->54522|80831->54524|80881->54545|80911->54546|80943->54549|81153->54730|81170->54736|81204->54747|81236->54750|81253->54756|81289->54769|81381->54832|81411->54833|81441->54834|81475->54839|81505->54840|81537->54843|81679->54956|81709->54957|81743->54962|81959->55149|81976->55155|82010->55166|82042->55169|82059->55175|82095->55188|82189->55253|82219->55254|82251->55257|82285->55262|82315->55263|82349->55268|82581->55471|82598->55477|82632->55488|82664->55491|82681->55497|82717->55510|82812->55576|82842->55577|82872->55578|82902->55579|82961->55605|83009->55623|83151->55735|83182->55736|83226->55750|83274->55768|83305->55769|83352->55786|83434->55838|83465->55839|83499->55844|83578->55894|83595->55900|83645->55927|83900->56153|83916->56158|83953->56172|84049->56239|84065->56244|84100->56256|84192->56319|84208->56324|84243->56336|84343->56407|84359->56412|84403->56433|84633->56634|84650->56640|84710->56676|84968->56938|85015->56955|85122->57033|85139->57038|85175->57050|85367->57213|85383->57218|85430->57242|85896->57678|85913->57683|85950->57708|85977->57711|90052->61831|90107->61856|90776->62495|90793->62500|90829->62512|91063->62716|91080->62721|91126->62743|91358->62945|91375->62950|91420->62971|91856->63377|91873->63382|91910->63395|93032->64577|93107->64622|93975->65461|93991->65466|94027->65478|94146->65568|94162->65573|94208->65595|94326->65684|94342->65689|94387->65710|96699->67993|96748->68024|96790->68026|96861->68068|96925->68121|96966->68122|97042->68168|97322->68419|97338->68424|97372->68435|97403->68437|97419->68442|97457->68457|97625->68604|97640->68608|97681->68609|97756->68654|98051->68920|98067->68925|98101->68936|98132->68938|98148->68943|98186->68958|98366->69105|98438->69144|98503->69179|101429->72105|101480->72160|101531->72212|101583->72317|101638->72342
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|208->178|208->178|210->180|211->181|211->181|212->182|214->184|214->184|216->186|217->187|217->187|218->188|219->189|219->189|220->190|221->191|221->191|222->192|223->193|223->193|223->193|228->198|228->198|229->199|233->203|233->203|235->205|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|246->216|246->216|250->220|264->234|264->234|265->235|268->238|268->238|268->238|268->238|269->239|271->241|271->241|272->242|295->265|295->265|296->266|298->268|298->268|299->269|299->269|300->270|302->272|302->272|303->273|303->273|305->275|305->275|307->277|307->277|307->277|308->278|318->288|318->288|319->289|320->290|320->290|320->290|320->290|321->291|322->292|322->292|323->293|340->310|340->310|342->312|342->312|343->313|349->319|349->319|352->322|356->326|356->326|357->327|359->329|359->329|360->330|361->331|361->331|362->332|362->332|362->332|363->333|364->334|364->334|364->334|368->338|368->338|370->340|373->343|373->343|374->344|377->347|377->347|378->348|380->350|380->350|382->352|400->370|400->370|401->371|404->374|404->374|404->374|404->374|405->375|407->377|407->377|408->378|412->382|412->382|413->383|413->383|413->383|414->384|429->399|429->399|429->399|429->399|434->404|434->404|434->404|434->404|435->405|450->420|450->420|450->420|450->420|455->425|455->425|458->428|458->428|458->428|458->428|459->429|474->444|474->444|474->444|474->444|479->449|479->449|482->452|482->452|483->453|487->457|487->457|488->458|488->458|489->459|491->461|491->461|492->462|492->462|494->464|494->464|497->467|497->467|497->467|499->469|503->473|503->473|504->474|504->474|504->474|505->475|507->477|507->477|507->477|522->492|522->492|523->493|523->493|525->495|525->495|525->495|526->496|527->497|527->497|528->498|530->500|530->500|530->500|545->515|545->515|546->516|546->516|548->518|548->518|548->518|549->519|550->520|550->520|551->521|553->523|553->523|553->523|568->538|568->538|569->539|569->539|569->539|569->539|569->539|570->540|570->540|570->540|571->541|573->543|573->543|573->543|588->558|588->558|589->559|589->559|591->561|591->561|591->561|592->562|593->563|593->563|593->563|598->568|598->568|599->569|602->572|602->572|603->573|604->574|604->574|605->575|610->580|610->580|611->581|611->581|612->582|612->582|612->582|613->583|616->586|616->586|617->587|617->587|618->588|618->588|621->591|622->592|622->592|623->593|628->598|628->598|629->599|630->600|630->600|631->601|631->601|631->601|632->602|633->603|633->603|634->604|634->604|634->604|635->605|636->606|636->606|637->607|637->607|637->607|638->608|639->609|639->609|640->610|642->612|642->612|642->612|642->612|642->612|649->619|649->619|650->620|650->620|650->620|651->621|654->624|654->624|655->625|656->626|656->626|657->627|657->627|657->627|658->628|659->629|659->629|660->630|660->630|660->630|661->631|662->632|662->632|663->633|663->633|663->633|664->634|665->635|665->635|666->636|668->638|668->638|668->638|668->638|668->638|676->646|676->646|677->647|677->647|677->647|678->648|679->649|679->649|680->650|681->651|681->651|682->652|682->652|682->652|683->653|684->654|684->654|686->656|688->658|688->658|689->659|689->659|689->659|690->660|691->661|691->661|692->662|692->662|692->662|692->662|692->662|692->662|695->665|695->665|697->667|697->667|698->668|698->668|698->668|699->669|699->669|699->669|700->670|700->670|700->670|700->670|700->670|700->670|703->673|703->673|704->674|704->674|704->674|705->675|705->675|705->675|705->675|705->675|705->675|708->678|708->678|709->679|709->679|710->680|711->681|711->681|712->682|712->682|712->682|712->682|712->682|712->682|715->685|715->685|716->686|727->697|727->697|729->699|731->701|731->701|732->702|735->705|735->705|736->706|736->706|737->707|740->710|740->710|741->711|741->711|742->712|742->712|744->714|746->716|746->716|748->718|753->723|753->723|754->724|755->725|755->725|757->727|757->727|758->728|758->728|758->728|758->728|758->728|758->728|758->728|758->728|760->730|762->732|762->732|763->733|766->736|766->736|768->738|768->738|769->739|771->741|771->741|772->742|773->743|773->743|774->744|774->744|780->750|780->750|781->751|782->752|782->752|783->753|783->753|784->754|784->754|786->756|786->756|786->756|788->758|788->758|788->758|789->759|790->760|790->760|790->760|795->765|795->765|796->766|799->769|799->769|800->770|801->771|801->771|802->772|802->772|802->772|803->773|804->774|804->774|805->775|805->775|806->776|808->778|808->778|809->779|810->780|810->780|813->783|827->797|827->797|828->798|831->801|831->801|831->801|831->801|831->801|832->802|834->804|834->804|835->805|841->811|841->811|842->812|843->813|843->813|844->814|845->815|845->815|846->816|847->817|847->817|849->819|850->820|850->820|851->821|852->822|852->822|854->824|858->828|858->828|859->829|862->832|862->832|864->834|866->836|866->836|867->837|869->839|869->839|870->840|872->842|872->842|873->843|875->845|875->845|876->846|878->848|878->848|879->849|881->851|881->851|882->852|884->854|884->854|885->855|887->857|887->857|888->858|890->860|890->860|891->861|893->863|893->863|897->867|917->887|917->887|917->887|917->887|923->893|923->893|925->895|931->901|932->902|934->904|934->904|934->904|936->906|938->908|938->908|939->909|942->912|942->912|942->912|942->912|942->912|942->912|943->913|943->913|944->914|945->915|945->915|946->916|947->917|947->917|948->918|951->921|951->921|951->921|951->921|951->921|951->921|952->922|952->922|953->923|953->923|953->923|954->924|957->927|957->927|957->927|957->927|957->927|957->927|959->929|959->929|960->930|960->930|961->931|962->932|962->932|963->933|964->934|964->934|965->935|968->938|968->938|968->938|968->938|968->938|968->938|969->939|969->939|970->940|970->940|970->940|971->941|974->944|974->944|974->944|974->944|974->944|974->944|976->946|976->946|977->947|977->947|978->948|979->949|979->949|980->950|981->951|981->951|982->952|985->955|985->955|985->955|985->955|985->955|985->955|986->956|986->956|987->957|987->957|987->957|988->958|991->961|991->961|991->961|991->961|991->961|991->961|993->963|993->963|994->964|994->964|995->965|996->966|996->966|997->967|998->968|998->968|999->969|1002->972|1002->972|1002->972|1002->972|1002->972|1002->972|1003->973|1003->973|1004->974|1004->974|1004->974|1005->975|1008->978|1008->978|1008->978|1008->978|1008->978|1008->978|1010->980|1010->980|1011->981|1011->981|1012->982|1013->983|1013->983|1014->984|1016->986|1016->986|1017->987|1020->990|1020->990|1020->990|1020->990|1020->990|1020->990|1021->991|1021->991|1022->992|1022->992|1022->992|1023->993|1026->996|1026->996|1026->996|1026->996|1026->996|1026->996|1028->998|1028->998|1029->999|1029->999|1031->1001|1033->1003|1042->1012|1042->1012|1043->1013|1043->1013|1044->1014|1046->1016|1046->1016|1047->1017|1047->1017|1048->1018|1048->1018|1054->1024|1054->1024|1056->1026|1056->1026|1056->1026|1057->1027|1073->1043|1073->1043|1074->1044|1075->1045|1075->1045|1075->1045|1075->1045|1076->1046|1077->1047|1077->1047|1078->1048|1097->1067|1097->1067|1102->1072|1102->1072|1104->1074|1106->1076|1106->1076|1107->1077|1108->1078|1108->1078|1110->1080|1110->1080|1110->1080|1111->1081|1113->1083|1113->1083|1115->1085|1115->1085|1116->1086|1117->1087|1117->1087|1118->1088|1118->1088|1119->1089|1119->1089|1119->1089|1120->1090|1121->1091|1123->1093|1123->1093|1123->1093|1125->1095|1127->1097|1127->1097|1128->1098|1131->1101|1131->1101|1131->1101|1131->1101|1131->1101|1131->1101|1132->1102|1132->1102|1133->1103|1133->1103|1133->1103|1134->1104|1137->1107|1137->1107|1138->1108|1141->1111|1141->1111|1141->1111|1141->1111|1141->1111|1141->1111|1142->1112|1142->1112|1143->1113|1143->1113|1143->1113|1144->1114|1147->1117|1147->1117|1147->1117|1147->1117|1147->1117|1147->1117|1149->1119|1149->1119|1150->1120|1150->1120|1159->1129|1161->1131|1164->1134|1164->1134|1166->1136|1166->1136|1166->1136|1167->1137|1169->1139|1169->1139|1170->1140|1171->1141|1171->1141|1171->1141|1174->1144|1174->1144|1174->1144|1175->1145|1175->1145|1175->1145|1176->1146|1176->1146|1176->1146|1177->1147|1177->1147|1177->1147|1182->1152|1182->1152|1182->1152|1190->1160|1191->1161|1191->1161|1191->1161|1191->1161|1194->1164|1194->1164|1194->1164|1201->1171|1201->1171|1201->1171|1201->1171|1286->1256|1287->1257|1304->1274|1304->1274|1304->1274|1306->1276|1306->1276|1306->1276|1308->1278|1308->1278|1308->1278|1313->1283|1313->1283|1313->1283|1336->1306|1339->1309|1349->1319|1349->1319|1349->1319|1350->1320|1350->1320|1350->1320|1351->1321|1351->1321|1351->1321|1389->1359|1389->1359|1389->1359|1390->1360|1390->1360|1390->1360|1392->1362|1395->1365|1395->1365|1395->1365|1395->1365|1395->1365|1395->1365|1397->1367|1397->1367|1397->1367|1398->1368|1401->1371|1401->1371|1401->1371|1401->1371|1401->1371|1401->1371|1403->1373|1405->1375|1408->1378|1479->1449|1480->1450|1481->1451|1482->1452|1487->1457
                  -- GENERATED --
              */
          