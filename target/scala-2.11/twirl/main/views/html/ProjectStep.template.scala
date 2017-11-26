
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
            top:425px;
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
                            var tempStatus="riskStatus"+obj.riskId;

                            appendquery = "<tr><td>" + obj.riskId + "</td><td style='text-align:left'><a id='"+obj.riskId+"' href='#' onclick='onRiskClick(id)' >"+obj.riskDescription+"</a></td><td id="+tempStatus+">" + isCompleted + "</td>" +
                                    "<td><button style='float:right;background-color: #4CAF50;border-color: #4CAF50;'"+isDisabled+"" +
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

                        """),format.raw/*266.25*/("""}"""),format.raw/*266.26*/("""
                        """),format.raw/*267.25*/("""document.getElementById('risks').innerHTML = result;
                        onRiskClick(firstRisk);
                    """),format.raw/*269.21*/("""}"""),format.raw/*269.22*/(""",
                    error: function (data) """),format.raw/*270.44*/("""{"""),format.raw/*270.45*/("""
                        """),format.raw/*271.25*/("""alert("error");
                        //setError('Make call failed');
                    """),format.raw/*273.21*/("""}"""),format.raw/*273.22*/("""
                """),format.raw/*274.17*/("""}"""),format.raw/*274.18*/(""");

            """),format.raw/*276.13*/("""}"""),format.raw/*276.14*/("""

            """),format.raw/*278.13*/("""$(document).on("click", ".open-riskDialog", function () """),format.raw/*278.69*/("""{"""),format.raw/*278.70*/("""
             """),format.raw/*279.14*/("""//   alert($(this).data('risk'));

//                var title = $(this).data('title');

                var riskId=$(this).data('risk');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*289.42*/("""{"""),format.raw/*289.43*/("""
                    """),format.raw/*290.21*/("""document.getElementById("isRiskDisabled").innerHTML="You don't have enough resources to mitigate this risk!";
                """),format.raw/*291.17*/("""}"""),format.raw/*291.18*/("""else"""),format.raw/*291.22*/("""{"""),format.raw/*291.23*/("""
                    """),format.raw/*292.21*/("""document.getElementById("isRiskDisabled").innerHTML="";
                """),format.raw/*293.17*/("""}"""),format.raw/*293.18*/("""
                """),format.raw/*294.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*311.13*/("""}"""),format.raw/*311.14*/(""");

            function onMitigateRisk(id)"""),format.raw/*313.40*/("""{"""),format.raw/*313.41*/("""
"""),format.raw/*314.1*/("""//                alert(id);
                onRiskClick(id);
                onPerformStep(id);

                $('#btnMitigateRisk').val(id);
                $('#btnMitigateRisk').trigger('click');
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/("""


            """),format.raw/*323.13*/("""var riskClicked="";
            var totalSteps=0;
            var stepsDone=0;
            var onlyPlanning=true;
            function onRiskClick(id)"""),format.raw/*327.37*/("""{"""),format.raw/*327.38*/("""
"""),format.raw/*328.1*/("""//                alert("fghjh "+id);
                riskClicked=id;
                var obj = """),format.raw/*330.27*/("""{"""),format.raw/*330.28*/("""
                    """),format.raw/*331.21*/("""'riskid': id
                """),format.raw/*332.17*/("""}"""),format.raw/*332.18*/("""
                """),format.raw/*333.17*/("""$.ajax("""),format.raw/*333.24*/("""{"""),format.raw/*333.25*/("""
                    """),format.raw/*334.21*/("""type: 'POST',
                    url: '"""),_display_(/*335.28*/routes/*335.34*/.GameController.getMitigationSteps()),format.raw/*335.70*/("""',
//                     data : '',
                    data: JSON.stringify(obj),
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*339.46*/("""{"""),format.raw/*339.47*/("""

                        """),format.raw/*341.25*/("""totalSteps=data.length;
                        stepsDone=0;
                        var result = "";
                        for (i = 0; i < data.length; i++) """),format.raw/*344.59*/("""{"""),format.raw/*344.60*/("""
                            """),format.raw/*345.29*/("""var obj = data[i];

                            var status;
                            if(obj.status)"""),format.raw/*348.43*/("""{"""),format.raw/*348.44*/("""
                                """),format.raw/*349.33*/("""stepsDone++;
                                obj.status="disabled='true'";
                            """),format.raw/*351.29*/("""}"""),format.raw/*351.30*/("""

"""),format.raw/*353.1*/("""//                                result= result+"<h1>"+obj.projectStepName+"</h1>";
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*371.81*/("""{"""),format.raw/*371.82*/("""
                                """),format.raw/*372.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*375.29*/("""}"""),format.raw/*375.30*/("""else"""),format.raw/*375.34*/("""{"""),format.raw/*375.35*/("""
                                """),format.raw/*376.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*378.29*/("""}"""),format.raw/*378.30*/("""
"""),format.raw/*379.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);
                            if(onlyPlanning)"""),format.raw/*383.45*/("""{"""),format.raw/*383.46*/("""
                                """),format.raw/*384.33*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*384.62*/("""{"""),format.raw/*384.63*/("""
                                    """),format.raw/*385.37*/("""result = result + "<button " +
                                            " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                            " style='white-space: normal;height:70px; ' " +
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
//                                            "data-todo='"""),format.raw/*400.59*/("""{"""),format.raw/*400.60*/("""'id':12,'todo':'xyz'"""),format.raw/*400.80*/("""}"""),format.raw/*400.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*405.33*/("""}"""),format.raw/*405.34*/("""else"""),format.raw/*405.38*/("""{"""),format.raw/*405.39*/("""
                                    """),format.raw/*406.37*/("""result = result + "<button disabled" +
                                            " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                 
                                            " style='white-space: normal;height:70px; background-color: red !important;' " +
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
//                                            "data-todo='"""),format.raw/*422.59*/("""{"""),format.raw/*422.60*/("""'id':12,'todo':'xyz'"""),format.raw/*422.80*/("""}"""),format.raw/*422.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*427.33*/("""}"""),format.raw/*427.34*/("""


                            """),format.raw/*430.29*/("""}"""),format.raw/*430.30*/("""
                            """),format.raw/*431.29*/("""else """),format.raw/*431.34*/("""{"""),format.raw/*431.35*/("""

                              """),format.raw/*433.31*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*433.60*/("""{"""),format.raw/*433.61*/("""
                                  """),format.raw/*434.35*/("""result = result + "<button " +
                                          " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                          " style='white-space: normal;height:70px; ' " +
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
                            //                                            "data-todo='"""),format.raw/*449.87*/("""{"""),format.raw/*449.88*/("""'id':12,'todo':'xyz'"""),format.raw/*449.108*/("""}"""),format.raw/*449.109*/("""'"+
                                          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                          "  id='todolink'>" + obj.projectStepName +
                                          "</button>";
                            //
                              """),format.raw/*454.31*/("""}"""),format.raw/*454.32*/("""
                              """),format.raw/*455.31*/("""else """),format.raw/*455.36*/("""{"""),format.raw/*455.37*/("""
                                      """),format.raw/*456.39*/("""if(isImplementationPlanningDone||isDesignPlanningDone||isTestingPlanningDone||isRequirementPlanningDone||isProductionPlanningDone)
                                        """),format.raw/*457.41*/("""{"""),format.raw/*457.42*/("""
                                                """),format.raw/*458.49*/("""if(isImplementationPlanningDone && obj.phaseName=="IMPLEMENTATION")
                                                      """),format.raw/*459.55*/("""{"""),format.raw/*459.56*/("""
                                                                    """),format.raw/*460.69*/("""result = result + "<button " +
                                                                              " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                              " style='white-space: normal;height:70px; ' " +
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
                                                                //                                            "data-todo='"""),format.raw/*475.123*/("""{"""),format.raw/*475.124*/("""'id':12,'todo':'xyz'"""),format.raw/*475.144*/("""}"""),format.raw/*475.145*/("""'"+
                                                                              "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                              "  id='todolink'>" + obj.projectStepName +
                                                                              "</button>";

                                                                """),format.raw/*480.65*/("""}"""),format.raw/*480.66*/("""
                                                      """),format.raw/*481.55*/("""else if(obj.phaseName=="IMPLEMENTATION")"""),format.raw/*481.95*/("""{"""),format.raw/*481.96*/("""
                                                        """),format.raw/*482.57*/("""result = result + "<button disabled" +
                                                                  " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                  " style='white-space: normal;height:70px; background-color: red !important;' " +
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
                                                    //                                            "data-todo='"""),format.raw/*497.111*/("""{"""),format.raw/*497.112*/("""'id':12,'todo':'xyz'"""),format.raw/*497.132*/("""}"""),format.raw/*497.133*/("""'"+
                                                                  "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                  "  id='todolink'>" + obj.projectStepName +
                                                                  "</button>";
                                                      """),format.raw/*501.55*/("""}"""),format.raw/*501.56*/("""


                                                                """),format.raw/*504.65*/("""if(isDesignPlanningDone && obj.phaseName=="DESIGN")
                                                                """),format.raw/*505.65*/("""{"""),format.raw/*505.66*/("""

                                                                      """),format.raw/*507.71*/("""result = result + "<button " +
                                                                              " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                              " style='white-space: normal;height:70px; ' " +
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
                                                                //                                            "data-todo='"""),format.raw/*522.123*/("""{"""),format.raw/*522.124*/("""'id':12,'todo':'xyz'"""),format.raw/*522.144*/("""}"""),format.raw/*522.145*/("""'"+
                                                                              "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                              "  id='todolink'>" + obj.projectStepName +
                                                                              "</button>";
                                                                //

                                                                """),format.raw/*528.65*/("""}"""),format.raw/*528.66*/("""
                                                                """),format.raw/*529.65*/("""else if(obj.phaseName=="DESIGN")
                                                                """),format.raw/*530.65*/("""{"""),format.raw/*530.66*/("""
                                                                  """),format.raw/*531.67*/("""result = result + "<button disabled" +
                                                                          " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                          " style='white-space: normal;height:70px; background-color: red !important;' " +
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
                                                            //                                            "data-todo='"""),format.raw/*546.119*/("""{"""),format.raw/*546.120*/("""'id':12,'todo':'xyz'"""),format.raw/*546.140*/("""}"""),format.raw/*546.141*/("""'"+
                                                                          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                          "  id='todolink'>" + obj.projectStepName +
                                                                          "</button>";
                                                                """),format.raw/*550.65*/("""}"""),format.raw/*550.66*/("""



                                                                """),format.raw/*554.65*/("""//next one

                                                                if(isTestingPlanningDone && obj.phaseName=="TESTING")
                                                                """),format.raw/*557.65*/("""{"""),format.raw/*557.66*/("""

                                                                      """),format.raw/*559.71*/("""result = result + "<button " +
                                                                              " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                              " style='white-space: normal;height:70px; ' " +
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
                                                                //                                            "data-todo='"""),format.raw/*574.123*/("""{"""),format.raw/*574.124*/("""'id':12,'todo':'xyz'"""),format.raw/*574.144*/("""}"""),format.raw/*574.145*/("""'"+
                                                                              "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                              "  id='todolink'>" + obj.projectStepName +
                                                                              "</button>";
                                                                //

                                                                """),format.raw/*580.65*/("""}"""),format.raw/*580.66*/("""
                                                                """),format.raw/*581.65*/("""else if(obj.phaseName=="TESTING")
                                                                """),format.raw/*582.65*/("""{"""),format.raw/*582.66*/("""
                                                                  """),format.raw/*583.67*/("""result = result + "<button disabled" +
                                                                          " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                         " style='white-space: normal;height:70px; background-color: red !important;' " +
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
                                                            //                                            "data-todo='"""),format.raw/*598.119*/("""{"""),format.raw/*598.120*/("""'id':12,'todo':'xyz'"""),format.raw/*598.140*/("""}"""),format.raw/*598.141*/("""'"+
                                                                          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                          "  id='todolink'>" + obj.projectStepName +
                                                                          "</button>";
                                                                """),format.raw/*602.65*/("""}"""),format.raw/*602.66*/("""

                                                                """),format.raw/*604.65*/("""if(isRequirementPlanningDone && obj.phaseName=="REQUIREMENTS")
                                                                                """),format.raw/*605.81*/("""{"""),format.raw/*605.82*/("""

                                                                                          """),format.raw/*607.91*/("""result = result + "<button " +
                                                                                                        " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                                                        " style='white-space: normal;height:70px; ' " +
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
                                                                                              //                                            "data-todo='"""),format.raw/*622.153*/("""{"""),format.raw/*622.154*/("""'id':12,'todo':'xyz'"""),format.raw/*622.174*/("""}"""),format.raw/*622.175*/("""'"+
                                                                                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                                                            "  id='todolink'>" + obj.projectStepName +
                                                                                                            "</button>";
                                                                                              //

                                                                              """),format.raw/*628.79*/("""}"""),format.raw/*628.80*/("""
                                                                              """),format.raw/*629.79*/("""else if(obj.phaseName=="REQUIREMENTS")
                                                                              """),format.raw/*630.79*/("""{"""),format.raw/*630.80*/("""
                                                                                """),format.raw/*631.81*/("""result = result + "<button disabled" +
                                                                                              " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                                                                              " style='white-space: normal;height:70px; background-color: red !important;' " +
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
                                                                                    //                                            "data-todo='"""),format.raw/*646.143*/("""{"""),format.raw/*646.144*/("""'id':12,'todo':'xyz'"""),format.raw/*646.164*/("""}"""),format.raw/*646.165*/("""'"+
                                                                                                  "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                                                  "  id='todolink'>" + obj.projectStepName +
                                                                                                  "</button>";
                                                                              """),format.raw/*650.79*/("""}"""),format.raw/*650.80*/("""
                                                                """),format.raw/*651.65*/("""//next oneTurn


                                                              """),format.raw/*654.63*/("""}"""),format.raw/*654.64*/("""
                                                              """),format.raw/*655.63*/("""else """),format.raw/*655.68*/("""{"""),format.raw/*655.69*/("""



  """),format.raw/*659.3*/("""//This is else part
  result = result + "<button disabled" +
          " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
         " style='white-space: normal;height:70px; background-color: red !important;' " +
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
  //                                            "data-todo='"""),format.raw/*675.61*/("""{"""),format.raw/*675.62*/("""'id':12,'todo':'xyz'"""),format.raw/*675.82*/("""}"""),format.raw/*675.83*/("""'"+
          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
          "  id='todolink'>" + obj.projectStepName +
          "</button>";


                                                              """),format.raw/*681.63*/("""}"""),format.raw/*681.64*/("""



                              """),format.raw/*685.31*/("""}"""),format.raw/*685.32*/("""













                            """),format.raw/*699.29*/("""}"""),format.raw/*699.30*/("""














                        """),format.raw/*714.25*/("""}"""),format.raw/*714.26*/("""
"""),format.raw/*715.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*719.21*/("""}"""),format.raw/*719.22*/(""",
                    error: function (data) """),format.raw/*720.44*/("""{"""),format.raw/*720.45*/("""
                        """),format.raw/*721.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*723.21*/("""}"""),format.raw/*723.22*/("""
                """),format.raw/*724.17*/("""}"""),format.raw/*724.18*/(""");

            """),format.raw/*726.13*/("""}"""),format.raw/*726.14*/("""


            """),format.raw/*729.13*/("""function onPerformStep(id)"""),format.raw/*729.39*/("""{"""),format.raw/*729.40*/("""

"""),format.raw/*731.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*735.43*/("""{"""),format.raw/*735.44*/("""
                    """),format.raw/*736.21*/("""var obj = """),format.raw/*736.31*/("""{"""),format.raw/*736.32*/("""
                        """),format.raw/*737.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*739.35*/model/*739.40*/.getGameId),format.raw/*739.50*/(""",
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
                    """),format.raw/*754.21*/("""}"""),format.raw/*754.22*/(""";
                """),format.raw/*755.17*/("""}"""),format.raw/*755.18*/("""

                """),format.raw/*757.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*757.77*/("""{"""),format.raw/*757.78*/("""
"""),format.raw/*758.1*/("""//                    alert(id);
                    var obj = """),format.raw/*759.31*/("""{"""),format.raw/*759.32*/("""
                        """),format.raw/*760.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*762.35*/model/*762.40*/.getGameId),format.raw/*762.50*/(""",
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
                    """),format.raw/*777.21*/("""}"""),format.raw/*777.22*/(""";
                """),format.raw/*778.17*/("""}"""),format.raw/*778.18*/("""

                """),format.raw/*780.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*780.49*/("""{"""),format.raw/*780.50*/("""
"""),format.raw/*781.1*/("""//                    alert(id);
                    var obj = """),format.raw/*782.31*/("""{"""),format.raw/*782.32*/("""
                        """),format.raw/*783.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*785.35*/model/*785.40*/.getGameId),format.raw/*785.50*/(""",
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
                    """),format.raw/*800.21*/("""}"""),format.raw/*800.22*/(""";
                """),format.raw/*801.17*/("""}"""),format.raw/*801.18*/(""" """),format.raw/*801.19*/("""else"""),format.raw/*801.23*/("""{"""),format.raw/*801.24*/("""
                    """),format.raw/*802.21*/("""var obj = """),format.raw/*802.31*/("""{"""),format.raw/*802.32*/("""
                        """),format.raw/*803.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*805.35*/model/*805.40*/.getGameId),format.raw/*805.50*/(""",
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
                    """),format.raw/*820.21*/("""}"""),format.raw/*820.22*/(""";
                """),format.raw/*821.17*/("""}"""),format.raw/*821.18*/("""

                """),format.raw/*823.17*/("""$.ajax("""),format.raw/*823.24*/("""{"""),format.raw/*823.25*/("""
                    """),format.raw/*824.21*/("""type: 'POST',
                    url: '"""),_display_(/*825.28*/routes/*825.34*/.GameController.performStep()),format.raw/*825.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*830.46*/("""{"""),format.raw/*830.47*/("""
                        """),format.raw/*831.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        document.getElementById('prevstep').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*834.50*/("""{"""),format.raw/*834.51*/("""
"""),format.raw/*835.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*836.34*/("""{"""),format.raw/*836.35*/("""
                                        """),format.raw/*837.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*842.37*/("""}"""),format.raw/*842.38*/(""",
                                    function(isConfirm)"""),format.raw/*843.56*/("""{"""),format.raw/*843.57*/("""
                                        """),format.raw/*844.41*/("""if (isConfirm) """),format.raw/*844.56*/("""{"""),format.raw/*844.57*/("""
"""),format.raw/*845.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*848.41*/("""}"""),format.raw/*848.42*/("""
                                    """),format.raw/*849.37*/("""}"""),format.raw/*849.38*/(""");
                        """),format.raw/*850.25*/("""}"""),format.raw/*850.26*/("""


                       """),format.raw/*853.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*854.25*/("""{"""),format.raw/*854.26*/("""
                           """),format.raw/*855.28*/("""// $('#updateactivity').trigger('click');
                           isOOPSCard=true;
                           console.log(isOOPSCard+"   hello am as ");
                            var alertmsg = "You lost ";

                           console.log(data.oops_resource);

                           console.log(document.getElementById('budgetremaining').innerHTML);


                            if(data.oops_resource !=0) """),format.raw/*865.56*/("""{"""),format.raw/*865.57*/("""
                                """),format.raw/*866.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*867.29*/("""}"""),format.raw/*867.30*/("""
                            """),format.raw/*868.29*/("""if(data.oops_points !=0) """),format.raw/*868.54*/("""{"""),format.raw/*868.55*/("""
                                """),format.raw/*869.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*870.29*/("""}"""),format.raw/*870.30*/("""
                            """),format.raw/*871.29*/("""if(data.oops_bonus !=0) """),format.raw/*871.53*/("""{"""),format.raw/*871.54*/("""
                                """),format.raw/*872.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*873.29*/("""}"""),format.raw/*873.30*/("""
                            
                            """),format.raw/*875.29*/("""if(data.oops_budget !=0) """),format.raw/*875.54*/("""{"""),format.raw/*875.55*/("""
                                """),format.raw/*876.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*877.29*/("""}"""),format.raw/*877.30*/("""
                            """),format.raw/*878.29*/("""alertmsg=alertmsg+ data.oops_message+ " ,";
                            
                            if(data.oops_resource ==0 && data.oops_points ==0 && data.oops_bonus ==0 && data.oops_budget ==0)
                            """),format.raw/*881.29*/("""{"""),format.raw/*881.30*/("""
                            	"""),format.raw/*882.30*/("""alertmsg="But the problem has been avoided since you mitigated a RISK!.    ";
                            """),format.raw/*883.29*/("""}"""),format.raw/*883.30*/("""


                            """),format.raw/*886.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);


                            



                           // swal("""),format.raw/*893.36*/("""{"""),format.raw/*893.37*/("""   """),format.raw/*893.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*893.128*/("""}"""),format.raw/*893.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*900.25*/("""}"""),format.raw/*900.26*/("""
                        """),format.raw/*901.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*901.61*/("""{"""),format.raw/*901.62*/("""
                            """),format.raw/*902.29*/("""isSurpriseCard=true;
                            var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*905.60*/("""{"""),format.raw/*905.61*/("""
                                """),format.raw/*906.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*907.29*/("""}"""),format.raw/*907.30*/("""
                            """),format.raw/*908.29*/("""if(data.surprise_points !=0) """),format.raw/*908.58*/("""{"""),format.raw/*908.59*/("""
                                """),format.raw/*909.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*910.29*/("""}"""),format.raw/*910.30*/("""
                            """),format.raw/*911.29*/("""if(data.surprise_bonus !=0) """),format.raw/*911.57*/("""{"""),format.raw/*911.58*/("""
                                """),format.raw/*912.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*913.29*/("""}"""),format.raw/*913.30*/("""
                            """),format.raw/*914.29*/("""if(data.surprise_budget !=0) """),format.raw/*914.58*/("""{"""),format.raw/*914.59*/("""
                                """),format.raw/*915.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*916.29*/("""}"""),format.raw/*916.30*/("""

                            """),format.raw/*918.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*920.36*/("""{"""),format.raw/*920.37*/("""   """),format.raw/*920.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*920.135*/("""}"""),format.raw/*920.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*928.25*/("""}"""),format.raw/*928.26*/("""
                        """),format.raw/*929.25*/("""else if(data.steptype == "production")"""),format.raw/*929.63*/("""{"""),format.raw/*929.64*/("""
                            """),format.raw/*930.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*931.52*/("""{"""),format.raw/*931.53*/("""
                                """),format.raw/*932.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*933.29*/("""}"""),format.raw/*933.30*/("""
                            """),format.raw/*934.29*/("""else"""),format.raw/*934.33*/("""{"""),format.raw/*934.34*/("""
                                """),format.raw/*935.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*936.29*/("""}"""),format.raw/*936.30*/("""

                            """),format.raw/*938.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*940.25*/("""}"""),format.raw/*940.26*/("""
                        """),format.raw/*941.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*941.61*/("""{"""),format.raw/*941.62*/("""
                          """),format.raw/*942.27*/("""isSkipped=true;
                            if($('#btnIsProduction').val() != "true")"""),format.raw/*943.70*/("""{"""),format.raw/*943.71*/("""
                                """),format.raw/*944.33*/("""//swal("""),format.raw/*944.40*/("""{"""),format.raw/*944.41*/("""   """),format.raw/*944.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*944.118*/("""}"""),format.raw/*944.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*947.29*/("""}"""),format.raw/*947.30*/("""

                        """),format.raw/*949.25*/("""}"""),format.raw/*949.26*/("""
                        """),format.raw/*950.25*/("""else if(data.steptype == "risk")"""),format.raw/*950.57*/("""{"""),format.raw/*950.58*/("""
                            """),format.raw/*951.29*/("""if(data.risk_status == "success")"""),format.raw/*951.62*/("""{"""),format.raw/*951.63*/("""
                                """),format.raw/*952.33*/("""//swal("""),format.raw/*952.40*/("""{"""),format.raw/*952.41*/("""   """),format.raw/*952.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*952.142*/("""}"""),format.raw/*952.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*955.29*/("""}"""),format.raw/*955.30*/("""
                            """),format.raw/*956.29*/("""else"""),format.raw/*956.33*/("""{"""),format.raw/*956.34*/("""
                                """),format.raw/*957.33*/("""//swal("""),format.raw/*957.40*/("""{"""),format.raw/*957.41*/("""   """),format.raw/*957.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*957.127*/("""}"""),format.raw/*957.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*960.29*/("""}"""),format.raw/*960.30*/("""
                        """),format.raw/*961.25*/("""}"""),format.raw/*961.26*/("""
                        """),format.raw/*962.25*/("""else
                        """),format.raw/*963.25*/("""{"""),format.raw/*963.26*/("""
                            """),format.raw/*964.29*/("""//swal("""),format.raw/*964.36*/("""{"""),format.raw/*964.37*/("""   """),format.raw/*964.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*964.134*/("""}"""),format.raw/*964.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*967.25*/("""}"""),format.raw/*967.26*/("""
                        """),format.raw/*968.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*979.91*/("""{"""),format.raw/*979.92*/("""

                            """),format.raw/*981.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*983.25*/("""}"""),format.raw/*983.26*/("""
                    """),format.raw/*984.21*/("""//    refreshProjectSteps();


                    """),format.raw/*987.21*/("""}"""),format.raw/*987.22*/(""",
                    error: function (data) """),format.raw/*988.44*/("""{"""),format.raw/*988.45*/("""
                      """),format.raw/*989.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*992.21*/("""}"""),format.raw/*992.22*/("""
                """),format.raw/*993.17*/("""}"""),format.raw/*993.18*/(""");
            """),format.raw/*994.13*/("""}"""),format.raw/*994.14*/("""

            """),format.raw/*996.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*998.47*/("""{"""),format.raw/*998.48*/("""

                 """),format.raw/*1000.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*1005.27*/("""{"""),format.raw/*1005.28*/("""
                    """),format.raw/*1006.21*/("""'phaseId': clicked_id
                """),format.raw/*1007.17*/("""}"""),format.raw/*1007.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*1009.43*/("""{"""),format.raw/*1009.44*/("""
                    """),format.raw/*1010.21*/("""swal("""),format.raw/*1010.26*/("""{"""),format.raw/*1010.27*/("""   """),format.raw/*1010.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*1010.232*/("""}"""),format.raw/*1010.233*/(""", function()"""),format.raw/*1010.245*/("""{"""),format.raw/*1010.246*/("""

               """),format.raw/*1012.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*1014.74*/("""{"""),format.raw/*1014.75*/("""
                            """),format.raw/*1015.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*1018.25*/("""}"""),format.raw/*1018.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*1020.61*/("""{"""),format.raw/*1020.62*/("""
                            """),format.raw/*1021.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*1023.54*/("""{"""),format.raw/*1023.55*/("""
                                """),format.raw/*1024.33*/("""riskcount++;
                            """),format.raw/*1025.29*/("""}"""),format.raw/*1025.30*/("""
                        """),format.raw/*1026.25*/("""}"""),format.raw/*1026.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*1032.48*/("""{"""),format.raw/*1032.49*/("""
                        """),format.raw/*1033.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*1034.21*/("""}"""),format.raw/*1034.22*/("""
                        """),format.raw/*1035.25*/("""}"""),format.raw/*1035.26*/(""");
                """),format.raw/*1036.17*/("""}"""),format.raw/*1036.18*/("""

                """),format.raw/*1038.17*/("""else """),format.raw/*1038.22*/("""{"""),format.raw/*1038.23*/("""

                    """),format.raw/*1040.21*/("""$.ajax("""),format.raw/*1040.28*/("""{"""),format.raw/*1040.29*/("""
                        """),format.raw/*1041.25*/("""type: 'POST',
                        url: '"""),_display_(/*1042.32*/routes/*1042.38*/.GameController.getProjectSteps()),format.raw/*1042.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*1047.50*/("""{"""),format.raw/*1047.51*/("""
"""),format.raw/*1048.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*1051.63*/("""{"""),format.raw/*1051.64*/("""
                                """),format.raw/*1052.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*1053.61*/("""{"""),format.raw/*1053.62*/("""
                                    """),format.raw/*1054.37*/("""if (obj.status) """),format.raw/*1054.53*/("""{"""),format.raw/*1054.54*/("""
                                        """),format.raw/*1055.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*1056.37*/("""}"""),format.raw/*1056.38*/("""
                                """),format.raw/*1057.33*/("""}"""),format.raw/*1057.34*/("""
"""),format.raw/*1058.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*1060.49*/("""{"""),format.raw/*1060.50*/("""
                                    """),format.raw/*1061.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*1062.33*/("""}"""),format.raw/*1062.34*/("""


                                """),format.raw/*1065.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*1079.91*/("""{"""),format.raw/*1079.92*/("""
                                    """),format.raw/*1080.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*1083.33*/("""}"""),format.raw/*1083.34*/(""" """),format.raw/*1083.35*/("""else """),format.raw/*1083.40*/("""{"""),format.raw/*1083.41*/("""
                                    """),format.raw/*1084.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*1086.33*/("""}"""),format.raw/*1086.34*/("""
"""),format.raw/*1087.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

if(isOOPSCard)
"""),format.raw/*1093.1*/("""{"""),format.raw/*1093.2*/("""
  """),format.raw/*1094.3*/("""isOOPSCard=false;
"""),format.raw/*1095.1*/("""}"""),format.raw/*1095.2*/("""
"""),format.raw/*1096.1*/("""if(isSurpriseCard)
"""),format.raw/*1097.1*/("""{"""),format.raw/*1097.2*/("""
  """),format.raw/*1098.3*/("""isSurpriseCard=false;
"""),format.raw/*1099.1*/("""}"""),format.raw/*1099.2*/("""

"""),format.raw/*1101.1*/("""if(isSkipped)
"""),format.raw/*1102.1*/("""{"""),format.raw/*1102.2*/("""
  """),format.raw/*1103.3*/("""isSkipped=false;
"""),format.raw/*1104.1*/("""}"""),format.raw/*1104.2*/("""

"""),format.raw/*1106.1*/("""if((obj.projectStepId == 'CPSM25' || obj.projectStepId == 'CPSM26' ||obj.projectStepId == 'CPSM27' ||obj.projectStepId == 'CPSM28' ||obj.projectStepId == 'CPSM29' ||obj.projectStepId == 'CPSM30' ||obj.projectStepId == 'CPSM31' ||obj.projectStepId == 'CPSM32' ||obj.projectStepId == 'CPSM33'
  || obj.projectStepId == 'CPSM34' ||obj.projectStepId == 'CPSM35'
   ||obj.projectStepId == 'CPSM36')&&(obj.status == "disabled='true'")
   &&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(c==1))
"""),format.raw/*1110.1*/("""{"""),format.raw/*1110.2*/("""
"""),format.raw/*1111.1*/("""isImplementedBeforeProduction=true;
c=2;
console.log(isImplementedBeforeProduction+" i am inside if condition");
"""),format.raw/*1114.1*/("""}"""),format.raw/*1114.2*/("""

"""),format.raw/*1116.1*/("""if((obj.projectStepId == 'CPSM16')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cr==1))
"""),format.raw/*1118.1*/("""{"""),format.raw/*1118.2*/("""
"""),format.raw/*1119.1*/("""cr=2;
isRequirementPlanningDone=true;
"""),format.raw/*1121.1*/("""}"""),format.raw/*1121.2*/("""
"""),format.raw/*1122.1*/("""if((obj.projectStepId == 'CPSM17')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ct==1))
"""),format.raw/*1124.1*/("""{"""),format.raw/*1124.2*/("""
"""),format.raw/*1125.1*/("""ct=2;
isTestingPlanningDone=true;
"""),format.raw/*1127.1*/("""}"""),format.raw/*1127.2*/("""
"""),format.raw/*1128.1*/("""if((obj.projectStepId == 'CPSM18')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ci==1))
"""),format.raw/*1130.1*/("""{"""),format.raw/*1130.2*/("""
"""),format.raw/*1131.1*/("""ci=2;
isImplementationPlanningDone=true;
"""),format.raw/*1133.1*/("""}"""),format.raw/*1133.2*/("""
"""),format.raw/*1134.1*/("""if((obj.projectStepId == 'CPSM19')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cd==1))
"""),format.raw/*1136.1*/("""{"""),format.raw/*1136.2*/("""
"""),format.raw/*1137.1*/("""cd=2;
isDesignPlanningDone=true;
"""),format.raw/*1139.1*/("""}"""),format.raw/*1139.2*/("""
"""),format.raw/*1140.1*/("""if((obj.projectStepId == 'CPSM20')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cp==1))
"""),format.raw/*1142.1*/("""{"""),format.raw/*1142.2*/("""
"""),format.raw/*1143.1*/("""cp=2;
isProductionPlanningDone=true;
"""),format.raw/*1145.1*/("""}"""),format.raw/*1145.2*/("""



"""),format.raw/*1149.1*/("""isSkipped=true;
isOOPSCard=true;
isSurpriseCard=true;


                                result = result + "<button " +
                                        " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                        " style='white-space: normal;height:70px;padding-bottom: 10px; ' " +
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
//                                            "data-todo='"""),format.raw/*1169.59*/("""{"""),format.raw/*1169.60*/("""'id':12,'todo':'xyz'"""),format.raw/*1169.80*/("""}"""),format.raw/*1169.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:70px;padding-bottom: 80px; '></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*1175.29*/("""}"""),format.raw/*1175.30*/("""

"""),format.raw/*1177.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;


                            """),format.raw/*1183.77*/("""
                            """),format.raw/*1184.29*/("""var result="";
                            var count=0;
                        """),_display_(/*1186.26*/for(phases <- model.getPhases()) yield /*1186.58*/ {_display_(Seq[Any](format.raw/*1186.60*/("""

                  """),format.raw/*1188.19*/("""count++;
                  if(count==1)
                  """),format.raw/*1190.19*/("""{"""),format.raw/*1190.20*/("""
                  """),format.raw/*1191.19*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                      "style='background-color: #4CAF50;border-color: #4CAF50;'" +
                      "onclick='onPhaseClick(id)' " +
                      "id='"""),_display_(/*1194.29*/phases/*1194.35*/.getPhaseId),format.raw/*1194.46*/("""'>"""),_display_(/*1194.49*/phases/*1194.55*/.getPhaseName),format.raw/*1194.68*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                  """),format.raw/*1195.19*/("""}"""),format.raw/*1195.20*/("""
                  """),format.raw/*1196.19*/("""else if(count==2)
                  """),format.raw/*1197.19*/("""{"""),format.raw/*1197.20*/("""
                    """),format.raw/*1198.21*/("""if(isRequirementPlanningDone)
                    """),format.raw/*1199.21*/("""{"""),format.raw/*1199.22*/("""
                      """),format.raw/*1200.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #4CAF50;border-color: #4CAF50;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1203.33*/phases/*1203.39*/.getPhaseId),format.raw/*1203.50*/("""'>"""),_display_(/*1203.53*/phases/*1203.59*/.getPhaseName),format.raw/*1203.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1204.21*/("""}"""),format.raw/*1204.22*/("""
                    """),format.raw/*1205.21*/("""else """),format.raw/*1205.26*/("""{"""),format.raw/*1205.27*/("""
                      """),format.raw/*1206.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: red !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1209.35*/phases/*1209.41*/.getPhaseId),format.raw/*1209.52*/("""'>"""),_display_(/*1209.55*/phases/*1209.61*/.getPhaseName),format.raw/*1209.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1211.21*/("""}"""),format.raw/*1211.22*/("""
                  """),format.raw/*1212.19*/("""}"""),format.raw/*1212.20*/("""
                  """),format.raw/*1213.19*/("""else if(count==3)
                  """),format.raw/*1214.19*/("""{"""),format.raw/*1214.20*/("""
                    """),format.raw/*1215.21*/("""if(isDesignPlanningDone)
                    """),format.raw/*1216.21*/("""{"""),format.raw/*1216.22*/("""
                      """),format.raw/*1217.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #4CAF50;border-color: #4CAF50;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1220.33*/phases/*1220.39*/.getPhaseId),format.raw/*1220.50*/("""'>"""),_display_(/*1220.53*/phases/*1220.59*/.getPhaseName),format.raw/*1220.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1221.21*/("""}"""),format.raw/*1221.22*/("""
                    """),format.raw/*1222.21*/("""else """),format.raw/*1222.26*/("""{"""),format.raw/*1222.27*/("""
                      """),format.raw/*1223.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: red !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1226.35*/phases/*1226.41*/.getPhaseId),format.raw/*1226.52*/("""'>"""),_display_(/*1226.55*/phases/*1226.61*/.getPhaseName),format.raw/*1226.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1228.21*/("""}"""),format.raw/*1228.22*/("""
                  """),format.raw/*1229.19*/("""}"""),format.raw/*1229.20*/("""
                  """),format.raw/*1230.19*/("""else if(count==4)
                  """),format.raw/*1231.19*/("""{"""),format.raw/*1231.20*/("""
                    """),format.raw/*1232.21*/("""if(isImplementationPlanningDone)
                    """),format.raw/*1233.21*/("""{"""),format.raw/*1233.22*/("""
                      """),format.raw/*1234.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #4CAF50;border-color: #4CAF50;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1237.33*/phases/*1237.39*/.getPhaseId),format.raw/*1237.50*/("""'>"""),_display_(/*1237.53*/phases/*1237.59*/.getPhaseName),format.raw/*1237.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1238.21*/("""}"""),format.raw/*1238.22*/("""
                    """),format.raw/*1239.21*/("""else """),format.raw/*1239.26*/("""{"""),format.raw/*1239.27*/("""
                      """),format.raw/*1240.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: red !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1243.35*/phases/*1243.41*/.getPhaseId),format.raw/*1243.52*/("""'>"""),_display_(/*1243.55*/phases/*1243.61*/.getPhaseName),format.raw/*1243.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1245.21*/("""}"""),format.raw/*1245.22*/("""
                  """),format.raw/*1246.19*/("""}"""),format.raw/*1246.20*/("""
                  """),format.raw/*1247.19*/("""else if(count==5)
                  """),format.raw/*1248.19*/("""{"""),format.raw/*1248.20*/("""
                    """),format.raw/*1249.21*/("""if(isTestingPlanningDone)
                    """),format.raw/*1250.21*/("""{"""),format.raw/*1250.22*/("""
                      """),format.raw/*1251.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #4CAF50;border-color: #4CAF50;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1254.33*/phases/*1254.39*/.getPhaseId),format.raw/*1254.50*/("""'>"""),_display_(/*1254.53*/phases/*1254.59*/.getPhaseName),format.raw/*1254.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1255.21*/("""}"""),format.raw/*1255.22*/("""
                    """),format.raw/*1256.21*/("""else """),format.raw/*1256.26*/("""{"""),format.raw/*1256.27*/("""
                      """),format.raw/*1257.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: red !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1260.35*/phases/*1260.41*/.getPhaseId),format.raw/*1260.52*/("""'>"""),_display_(/*1260.55*/phases/*1260.61*/.getPhaseName),format.raw/*1260.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1262.21*/("""}"""),format.raw/*1262.22*/("""
                  """),format.raw/*1263.19*/("""}"""),format.raw/*1263.20*/("""
                  """),format.raw/*1264.19*/("""else if(count==6)
                  """),format.raw/*1265.19*/("""{"""),format.raw/*1265.20*/("""
                    """),format.raw/*1266.21*/("""console.log(isProductionPlanningDone+" i am is production planning"+isImplementedBeforeProduction+" i am before guy");
                    if(isImplementedBeforeProduction && isProductionPlanningDone)
                    """),format.raw/*1268.21*/("""{"""),format.raw/*1268.22*/("""
                    """),format.raw/*1269.21*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #4CAF50;border-color: #4CAF50;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1272.33*/phases/*1272.39*/.getPhaseId),format.raw/*1272.50*/("""'>"""),_display_(/*1272.53*/phases/*1272.59*/.getPhaseName),format.raw/*1272.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1273.21*/("""}"""),format.raw/*1273.22*/("""
                    """),format.raw/*1274.21*/("""else """),format.raw/*1274.26*/("""{"""),format.raw/*1274.27*/("""
                    """),format.raw/*1275.21*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                          "style='background-color: red !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1278.33*/phases/*1278.39*/.getPhaseId),format.raw/*1278.50*/("""'>"""),_display_(/*1278.53*/phases/*1278.59*/.getPhaseName),format.raw/*1278.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1280.21*/("""}"""),format.raw/*1280.22*/("""
                  """),format.raw/*1281.19*/("""}"""),format.raw/*1281.20*/("""

                            """)))}),format.raw/*1283.30*/("""

                            """),format.raw/*1285.29*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
                  //                alert(result);







                        """),format.raw/*1294.25*/("""}"""),format.raw/*1294.26*/(""",
                        error: function (data) """),format.raw/*1295.48*/("""{"""),format.raw/*1295.49*/("""
                            """),format.raw/*1296.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*1298.25*/("""}"""),format.raw/*1298.26*/("""
                    """),format.raw/*1299.21*/("""}"""),format.raw/*1299.22*/(""");
                """),format.raw/*1300.17*/("""}"""),format.raw/*1300.18*/("""





            """),format.raw/*1306.13*/("""}"""),format.raw/*1306.14*/("""

            """),format.raw/*1308.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*1308.67*/("""{"""),format.raw/*1308.68*/("""
"""),format.raw/*1309.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*1325.42*/("""{"""),format.raw/*1325.43*/("""
                    """),format.raw/*1326.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*1327.17*/("""}"""),format.raw/*1327.18*/("""else"""),format.raw/*1327.22*/("""{"""),format.raw/*1327.23*/("""
                    """),format.raw/*1328.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*1329.17*/("""}"""),format.raw/*1329.18*/("""
                """),format.raw/*1330.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*1349.13*/("""}"""),format.raw/*1349.14*/(""");




            function totalGameTimer() """),format.raw/*1354.39*/("""{"""),format.raw/*1354.40*/("""

                """),format.raw/*1356.17*/("""var sec = 0;

                function pad(val) """),format.raw/*1358.35*/("""{"""),format.raw/*1358.36*/("""
                    """),format.raw/*1359.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*1360.17*/("""}"""),format.raw/*1360.18*/("""

                """),format.raw/*1362.17*/("""var timer = setInterval(function () """),format.raw/*1362.53*/("""{"""),format.raw/*1362.54*/("""
                    """),format.raw/*1363.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*1365.17*/("""}"""),format.raw/*1365.18*/(""", 1000);

                setTimeout(function () """),format.raw/*1367.40*/("""{"""),format.raw/*1367.41*/("""
                    """),format.raw/*1368.21*/("""clearInterval(timer);
                """),format.raw/*1369.17*/("""}"""),format.raw/*1369.18*/(""", 50000000);
            """),format.raw/*1370.13*/("""}"""),format.raw/*1370.14*/("""
            """),format.raw/*1371.13*/("""function refreshProjectSteps()"""),format.raw/*1371.43*/("""{"""),format.raw/*1371.44*/("""
                """),format.raw/*1372.65*/("""
                """),format.raw/*1373.17*/("""var result="";
                var count=0;
            """),_display_(/*1375.14*/for(phases <- model.getPhases()) yield /*1375.46*/ {_display_(Seq[Any](format.raw/*1375.48*/("""

"""),format.raw/*1377.1*/("""count++;
if(count<6)
"""),format.raw/*1379.1*/("""{"""),format.raw/*1379.2*/("""
  """),format.raw/*1380.3*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
          "style='background-color: #DB8B00 !important;'" +
          "onclick='onPhaseClick(id)' " +
          "id='"""),_display_(/*1383.17*/phases/*1383.23*/.getPhaseId),format.raw/*1383.34*/("""'>"""),_display_(/*1383.37*/phases/*1383.43*/.getPhaseName),format.raw/*1383.56*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
"""),format.raw/*1384.1*/("""}"""),format.raw/*1384.2*/("""
"""),format.raw/*1385.1*/("""else """),format.raw/*1385.6*/("""{"""),format.raw/*1385.7*/("""
  """),format.raw/*1386.3*/("""console.log(isImplementedBeforeProduction);
  console.log("i am here in");
  if(isImplementedBeforeProduction)
  """),format.raw/*1389.3*/("""{"""),format.raw/*1389.4*/("""
    """),format.raw/*1390.5*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1393.19*/phases/*1393.25*/.getPhaseId),format.raw/*1393.36*/("""'>"""),_display_(/*1393.39*/phases/*1393.45*/.getPhaseName),format.raw/*1393.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
  """),format.raw/*1394.3*/("""}"""),format.raw/*1394.4*/("""
  """),format.raw/*1395.3*/("""else """),format.raw/*1395.8*/("""{"""),format.raw/*1395.9*/("""
    """),format.raw/*1396.5*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1399.19*/phases/*1399.25*/.getPhaseId),format.raw/*1399.36*/("""'>"""),_display_(/*1399.39*/phases/*1399.45*/.getPhaseName),format.raw/*1399.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

  """),format.raw/*1401.3*/("""}"""),format.raw/*1401.4*/("""
"""),format.raw/*1402.1*/("""}"""),format.raw/*1402.2*/("""








                """)))}),format.raw/*1411.18*/("""

                """),format.raw/*1413.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*1416.13*/("""}"""),format.raw/*1416.14*/("""

            """),format.raw/*1418.13*/("""function newfunc()"""),format.raw/*1418.31*/("""{"""),format.raw/*1418.32*/("""
                """),format.raw/*1419.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*1421.13*/("""}"""),format.raw/*1421.14*/("""
    """),format.raw/*1422.5*/("""</script>
    <body style="background-image: url("""),_display_(/*1423.41*/routes/*1423.47*/.Assets.at("images/bg.jpg")),format.raw/*1423.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*1426.68*/model/*1426.73*/.getUserName()),format.raw/*1426.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*1427.64*/model/*1427.69*/.getGameId()),format.raw/*1427.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*1428.60*/model/*1428.65*/.getTurnNo()),format.raw/*1428.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*1429.68*/model/*1429.73*/.getTimeForEachMove()),format.raw/*1429.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*1434.64*/routes/*1434.70*/.DashboardController.viewDashboard()),format.raw/*1434.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*1442.51*/("""
                """),format.raw/*1443.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*1443.95*/model/*1443.100*/.getGameId()),format.raw/*1443.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*1446.44*/model/*1446.49*/.getStepsForEachPlayer()),format.raw/*1446.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
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
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*1469.126*/model/*1469.131*/.getUserName().split("@")/*1469.156*/(0)),format.raw/*1469.159*/("""!</div>

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
                      <div class="panel-body" style="height: 185px; overflow-wrap: break-word;text-align:justify;">
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
                            """),format.raw/*1539.105*/("""
                        """),format.raw/*1540.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1557.126*/model/*1557.131*/.getBudget()),format.raw/*1557.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1559.141*/model/*1559.146*/.getCapabilityPoints()),format.raw/*1559.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1561.139*/model/*1561.144*/.getCapabilityBonus()),format.raw/*1561.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1566.180*/model/*1566.185*/.getResources),format.raw/*1566.198*/("""</div>
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


                                              """),format.raw/*1589.138*/("""


                                          """),format.raw/*1592.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1602.83*/model/*1602.88*/.getBudget()),format.raw/*1602.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1603.84*/model/*1603.89*/.getCapabilityPoints()),format.raw/*1603.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1604.83*/model/*1604.88*/.getCapabilityBonus()),format.raw/*1604.109*/("""</div>
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
                        <button class="btn btn-danger" id="btnSkip" onclick="onPerformStep(id)" style="float:right;background-color: #4CAF50;border-color: #4CAF50;">Skip Turn</button>
                        <button style="display: none" class="btn btn-danger" id="btnSkipTimeout" onclick="onPerformStep(id)">Timeout button</button>

                    </ul>
                    <div class="tab-content">
                        <div id="projectSteps" class="tab-pane fade in active">
                            <div class="col-md-12" style="border: 1px solid transparent">

                                <div style="height: 10px; "></div>

                                <div id="listOfProjectSteps">


                                    """),_display_(/*1642.38*/for(phase <- model.getPhases()) yield /*1642.69*/ {_display_(Seq[Any](format.raw/*1642.71*/("""
                                        """),_display_(/*1643.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1643.95*/{_display_(Seq[Any](format.raw/*1643.96*/("""

                                            """),format.raw/*1645.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1648.49*/phase/*1648.54*/.getPhaseId),format.raw/*1648.65*/(""">"""),_display_(/*1648.67*/phase/*1648.72*/.getPhaseName()),format.raw/*1648.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1650.42*/else/*1650.46*/{_display_(Seq[Any](format.raw/*1650.47*/("""
                                            """),format.raw/*1651.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1654.49*/phase/*1654.54*/.getPhaseId),format.raw/*1654.65*/(""">"""),_display_(/*1654.67*/phase/*1654.72*/.getPhaseName()),format.raw/*1654.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1656.42*/("""

                                    """)))}),format.raw/*1658.38*/("""


                                """),format.raw/*1661.33*/("""</div>





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

                            
                            <div id="stepForRisk"></div>

                            <br/>
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
                    """),format.raw/*1732.51*/("""
                    """),format.raw/*1733.55*/("""
                    """),format.raw/*1734.52*/("""
                    """),format.raw/*1735.105*/("""




                    """),format.raw/*1740.21*/("""<div class="panel panel-default" >
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
                  DATE: Sat Nov 25 15:40:01 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/ProjectStep.scala.html
                  HASH: 35cc15328426c68f237d627a4901d0860b89eeac
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10995->6752|11025->6753|11072->6771|11132->6802|11162->6803|11204->6816|11298->6881|11328->6882|11375->6900|11446->6942|11476->6943|11518->6956|11610->7019|11640->7020|11686->7037|11770->7092|11800->7093|11850->7114|11919->7155|11935->7161|11987->7191|12238->7413|12268->7414|12297->7415|12576->7665|12606->7666|12665->7696|12979->7981|13009->7982|13038->7983|13271->8187|13301->8188|13334->8192|13364->8193|13426->8226|13505->8276|13535->8277|13596->8309|14682->9366|14712->9367|14774->9400|15014->9611|15044->9612|15077->9616|15107->9617|15169->9650|15299->9751|15329->9752|15358->9753|17067->11433|17097->11434|17151->11459|17301->11580|17331->11581|17405->11626|17435->11627|17489->11652|17610->11744|17640->11745|17686->11762|17716->11763|17761->11779|17791->11780|17834->11794|17919->11850|17949->11851|17992->11865|18511->12355|18541->12356|18591->12377|18746->12503|18776->12504|18809->12508|18839->12509|18889->12530|18990->12602|19020->12603|19066->12620|19916->13441|19946->13442|20018->13485|20048->13486|20077->13487|20319->13700|20349->13701|20393->13716|20572->13866|20602->13867|20631->13868|20756->13964|20786->13965|20836->13986|20894->14015|20924->14016|20970->14033|21006->14040|21036->14041|21086->14062|21155->14103|21171->14109|21229->14145|21440->14327|21470->14328|21525->14354|21714->14514|21744->14515|21802->14544|21933->14646|21963->14647|22025->14680|22157->14783|22187->14784|22217->14786|23457->15997|23487->15998|23549->16031|23789->16242|23819->16243|23852->16247|23882->16248|23944->16281|24074->16382|24104->16383|24133->16384|24495->16717|24525->16718|24587->16751|24645->16780|24675->16781|24741->16818|26230->18278|26260->18279|26309->18299|26339->18300|26693->18625|26723->18626|26756->18630|26786->18631|26852->18668|28416->20203|28446->20204|28495->20224|28525->20225|28879->20550|28909->20551|28969->20582|28999->20583|29057->20612|29091->20617|29121->20618|29182->20650|29240->20679|29270->20680|29334->20715|30823->22175|30853->22176|30903->22196|30934->22197|31308->22542|31338->22543|31398->22574|31432->22579|31462->22580|31530->22619|31730->22790|31760->22791|31838->22840|31989->22962|32019->22963|32117->23032|34147->25032|34178->25033|34228->25053|34259->25054|34745->25511|34775->25512|34859->25567|34928->25607|34958->25608|35044->25665|36935->27526|36966->27527|37016->27547|37047->27548|37486->27958|37516->27959|37612->28026|37757->28142|37787->28143|37888->28215|39918->30215|39949->30216|39999->30236|40030->30237|40583->30761|40613->30762|40707->30827|40833->30924|40863->30925|40959->30992|42970->32973|43001->32974|43051->32994|43082->32995|43555->33439|43585->33440|43682->33508|43905->33702|43935->33703|44036->33775|46066->35775|46097->35776|46147->35796|46178->35797|46731->36321|46761->36322|46855->36387|46982->36485|47012->36486|47108->36553|49118->38533|49149->38534|49199->38554|49230->38555|49703->38999|49733->39000|49828->39066|50000->39209|50030->39210|50151->39302|52595->41716|52626->41717|52676->41737|52707->41738|53394->42396|53424->42397|53532->42476|53678->42593|53708->42594|53818->42675|56153->44980|56184->44981|56234->45001|56265->45002|56824->45532|56854->45533|56948->45598|57056->45677|57086->45678|57178->45741|57212->45746|57242->45747|57276->45753|58353->46801|58383->46802|58432->46822|58462->46823|58743->47075|58773->47076|58836->47110|58866->47111|58937->47153|58967->47154|59035->47193|59065->47194|59094->47195|59406->47478|59436->47479|59510->47524|59540->47525|59594->47550|59729->47656|59759->47657|59805->47674|59835->47675|59880->47691|59910->47692|59954->47707|60009->47733|60039->47734|60069->47736|60432->48070|60462->48071|60512->48092|60551->48102|60581->48103|60635->48128|60754->48219|60769->48224|60801->48234|61822->49226|61852->49227|61899->49245|61929->49246|61976->49264|62065->49324|62095->49325|62124->49326|62216->49389|62246->49390|62300->49415|62419->49506|62434->49511|62466->49521|63484->50510|63514->50511|63561->50529|63591->50530|63638->50548|63699->50580|63729->50581|63758->50582|63850->50645|63880->50646|63934->50671|64049->50758|64064->50763|64096->50773|65119->51767|65149->51768|65196->51786|65226->51787|65256->51788|65289->51792|65319->51793|65369->51814|65408->51824|65438->51825|65492->51850|65607->51937|65622->51942|65654->51952|66667->52936|66697->52937|66744->52955|66774->52956|66821->52974|66857->52981|66887->52982|66937->53003|67006->53044|67022->53050|67073->53079|67335->53312|67365->53313|67419->53338|67696->53586|67726->53587|67755->53588|67869->53673|67899->53674|67969->53715|68342->54059|68372->54060|68458->54117|68488->54118|68558->54159|68602->54174|68632->54175|68661->54176|68869->54355|68899->54356|68965->54393|68995->54394|69051->54421|69081->54422|69136->54448|69222->54505|69252->54506|69309->54534|69763->54959|69793->54960|69855->54993|69970->55079|70000->55080|70058->55109|70112->55134|70142->55135|70204->55168|70326->55261|70356->55262|70414->55291|70467->55315|70497->55316|70559->55349|70679->55440|70709->55441|70796->55499|70850->55524|70880->55525|70942->55558|71054->55641|71084->55642|71142->55671|71398->55898|71428->55899|71487->55929|71622->56035|71652->56036|71712->56067|71865->56191|71895->56192|71927->56195|72045->56283|72076->56284|72609->56788|72639->56789|72693->56814|72758->56850|72788->56851|72846->56880|73014->57019|73044->57020|73106->57053|73225->57143|73255->57144|73313->57173|73371->57202|73401->57203|73463->57236|73589->57333|73619->57334|73677->57363|73734->57391|73764->57392|73826->57425|73950->57520|73980->57521|74038->57550|74096->57579|74126->57580|74188->57613|74304->57700|74334->57701|74393->57731|74513->57822|74543->57823|74575->57826|74700->57921|74731->57922|75335->58497|75365->58498|75419->58523|75486->58561|75516->58562|75574->58591|75673->58661|75703->58662|75765->58695|75934->58835|75964->58836|76022->58865|76055->58869|76085->58870|76147->58903|76311->59038|76341->59039|76400->59069|76565->59205|76595->59206|76649->59231|76714->59267|76744->59268|76800->59295|76914->59380|76944->59381|77006->59414|77042->59421|77072->59422|77104->59425|77208->59499|77239->59500|77448->59680|77478->59681|77533->59707|77563->59708|77617->59733|77678->59765|77708->59766|77766->59795|77828->59828|77858->59829|77920->59862|77956->59869|77986->59870|78018->59873|78146->59971|78177->59972|78392->60158|78422->60159|78480->60188|78513->60192|78543->60193|78605->60226|78641->60233|78671->60234|78703->60237|78816->60320|78847->60321|79062->60507|79092->60508|79146->60533|79176->60534|79230->60559|79288->60588|79318->60589|79376->60618|79412->60625|79442->60626|79474->60629|79598->60723|79629->60724|79837->60903|79867->60904|79921->60929|80772->61751|80802->61752|80861->61782|80998->61890|81028->61891|81078->61912|81158->61963|81188->61964|81262->62009|81292->62010|81344->62033|81530->62190|81560->62191|81606->62208|81636->62209|81680->62224|81710->62225|81753->62239|81888->62345|81918->62346|81967->62365|82212->62580|82243->62581|82294->62602|82362->62640|82393->62641|82468->62686|82499->62687|82550->62708|82585->62713|82616->62714|82649->62717|82882->62919|82914->62920|82957->62932|82989->62933|83036->62950|83282->63166|83313->63167|83372->63196|83475->63269|83506->63270|83644->63378|83675->63379|83734->63408|83864->63508|83895->63509|83958->63542|84029->63583|84060->63584|84115->63609|84146->63610|84502->63936|84533->63937|84588->63962|84743->64087|84774->64088|84829->64113|84860->64114|84909->64133|84940->64134|84988->64152|85023->64157|85054->64158|85106->64180|85143->64187|85174->64188|85229->64213|85303->64258|85320->64264|85376->64297|85666->64557|85697->64558|85727->64559|85983->64785|86014->64786|86077->64819|86186->64898|86217->64899|86284->64936|86330->64952|86361->64953|86432->64994|86521->65053|86552->65054|86615->65087|86646->65088|86676->65089|86851->65234|86882->65235|86949->65272|87042->65335|87073->65336|87138->65371|88283->66486|88314->66487|88381->66524|88634->66747|88665->66748|88696->66749|88731->66754|88762->66755|88829->66792|88972->66905|89003->66906|89033->66907|89367->67212|89397->67213|89429->67216|89476->67234|89506->67235|89536->67236|89584->67255|89614->67256|89646->67259|89697->67281|89727->67282|89758->67284|89801->67298|89831->67299|89863->67302|89909->67319|89939->67320|89970->67322|90489->67812|90519->67813|90549->67814|90691->67927|90721->67928|90752->67930|90910->68059|90940->68060|90970->68061|91037->68099|91067->68100|91097->68101|91255->68230|91285->68231|91315->68232|91378->68266|91408->68267|91438->68268|91596->68397|91626->68398|91656->68399|91726->68440|91756->68441|91786->68442|91944->68571|91974->68572|92004->68573|92066->68606|92096->68607|92126->68608|92284->68737|92314->68738|92344->68739|92410->68776|92440->68777|92473->68781|94026->70304|94057->70305|94107->70325|94138->70326|94660->70818|94691->70819|94722->70821|95072->71189|95131->71218|95241->71299|95291->71331|95333->71333|95383->71353|95471->71411|95502->71412|95551->71431|95808->71659|95825->71665|95859->71676|95891->71679|95908->71685|95944->71698|96055->71779|96086->71780|96135->71799|96201->71835|96232->71836|96283->71857|96363->71907|96394->71908|96447->71931|96716->72171|96733->72177|96767->72188|96799->72191|96816->72197|96852->72210|96965->72293|96996->72294|97047->72315|97082->72320|97113->72321|97166->72344|97442->72591|97459->72597|97493->72608|97525->72611|97542->72617|97578->72630|97692->72714|97723->72715|97772->72734|97803->72735|97852->72754|97918->72790|97949->72791|98000->72812|98075->72857|98106->72858|98159->72881|98428->73121|98445->73127|98479->73138|98511->73141|98528->73147|98564->73160|98677->73243|98708->73244|98759->73265|98794->73270|98825->73271|98878->73294|99154->73541|99171->73547|99205->73558|99237->73561|99254->73567|99290->73580|99404->73664|99435->73665|99484->73684|99515->73685|99564->73704|99630->73740|99661->73741|99712->73762|99795->73815|99826->73816|99879->73839|100148->74079|100165->74085|100199->74096|100231->74099|100248->74105|100284->74118|100397->74201|100428->74202|100479->74223|100514->74228|100545->74229|100598->74252|100874->74499|100891->74505|100925->74516|100957->74519|100974->74525|101010->74538|101124->74622|101155->74623|101204->74642|101235->74643|101284->74662|101350->74698|101381->74699|101432->74720|101508->74766|101539->74767|101592->74790|101861->75030|101878->75036|101912->75047|101944->75050|101961->75056|101997->75069|102110->75152|102141->75153|102192->75174|102227->75179|102258->75180|102311->75203|102587->75450|102604->75456|102638->75467|102670->75470|102687->75476|102723->75489|102837->75573|102868->75574|102917->75593|102948->75594|102997->75613|103063->75649|103094->75650|103145->75671|103396->75892|103427->75893|103478->75914|103747->76154|103764->76160|103798->76171|103830->76174|103847->76180|103883->76193|103996->76276|104027->76277|104078->76298|104113->76303|104144->76304|104195->76325|104465->76566|104482->76572|104516->76583|104548->76586|104565->76592|104601->76605|104715->76689|104746->76690|104795->76709|104826->76710|104890->76741|104950->76771|105128->76919|105159->76920|105238->76969|105269->76970|105328->76999|105458->77099|105489->77100|105540->77121|105571->77122|105620->77141|105651->77142|105699->77160|105730->77161|105774->77175|105858->77229|105889->77230|105919->77231|106863->78145|106894->78146|106945->78167|107102->78294|107133->78295|107167->78299|107198->78300|107249->78321|107347->78389|107378->78390|107425->78407|108514->79466|108545->79467|108620->79512|108651->79513|108699->79531|108777->79579|108808->79580|108859->79601|108939->79651|108970->79652|109018->79670|109084->79706|109115->79707|109166->79728|109372->79904|109403->79905|109482->79954|109513->79955|109564->79976|109632->80014|109663->80015|109718->80040|109749->80041|109792->80054|109852->80084|109883->80085|109930->80150|109977->80167|110063->80224|110113->80256|110155->80258|110186->80260|110236->80281|110266->80282|110298->80285|110508->80466|110525->80472|110559->80483|110591->80486|110608->80492|110644->80505|110736->80568|110766->80569|110796->80570|110830->80575|110860->80576|110892->80579|111034->80692|111064->80693|111098->80698|111314->80885|111331->80891|111365->80902|111397->80905|111414->80911|111450->80924|111544->80989|111574->80990|111606->80993|111640->80998|111670->80999|111704->81004|111936->81207|111953->81213|111987->81224|112019->81227|112036->81233|112072->81246|112167->81312|112197->81313|112227->81314|112257->81315|112316->81341|112364->81359|112506->81471|112537->81472|112581->81486|112629->81504|112660->81505|112707->81522|112789->81574|112820->81575|112854->81580|112933->81630|112950->81636|113000->81663|113255->81889|113271->81894|113308->81908|113404->81975|113420->81980|113455->81992|113547->82055|113563->82060|113598->82072|113698->82143|113714->82148|113758->82169|113988->82370|114005->82376|114065->82412|114323->82674|114370->82691|114477->82769|114494->82774|114530->82786|114722->82949|114738->82954|114785->82978|116338->84501|116355->84506|116392->84531|116419->84534|119378->87538|119433->87563|120102->88202|120119->88207|120155->88219|120389->88423|120406->88428|120452->88450|120684->88652|120701->88657|120746->88678|121182->89084|121199->89089|121236->89102|122358->90284|122433->90329|123301->91168|123317->91173|123353->91185|123472->91275|123488->91280|123534->91302|123652->91391|123668->91396|123713->91417|126074->93749|126123->93780|126165->93782|126236->93824|126300->93877|126341->93878|126417->93924|126697->94175|126713->94180|126747->94191|126778->94193|126794->94198|126832->94213|127000->94360|127015->94364|127056->94365|127131->94410|127426->94676|127442->94681|127476->94692|127507->94694|127523->94699|127561->94714|127741->94861|127813->94900|127878->94935|130794->97851|130845->97906|130896->97958|130948->98063|131003->98088
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|208->178|208->178|210->180|211->181|211->181|212->182|214->184|214->184|216->186|217->187|217->187|218->188|219->189|219->189|220->190|221->191|221->191|222->192|223->193|223->193|223->193|228->198|228->198|229->199|233->203|233->203|235->205|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|246->216|246->216|250->220|264->234|264->234|265->235|268->238|268->238|268->238|268->238|269->239|271->241|271->241|272->242|296->266|296->266|297->267|299->269|299->269|300->270|300->270|301->271|303->273|303->273|304->274|304->274|306->276|306->276|308->278|308->278|308->278|309->279|319->289|319->289|320->290|321->291|321->291|321->291|321->291|322->292|323->293|323->293|324->294|341->311|341->311|343->313|343->313|344->314|350->320|350->320|353->323|357->327|357->327|358->328|360->330|360->330|361->331|362->332|362->332|363->333|363->333|363->333|364->334|365->335|365->335|365->335|369->339|369->339|371->341|374->344|374->344|375->345|378->348|378->348|379->349|381->351|381->351|383->353|401->371|401->371|402->372|405->375|405->375|405->375|405->375|406->376|408->378|408->378|409->379|413->383|413->383|414->384|414->384|414->384|415->385|430->400|430->400|430->400|430->400|435->405|435->405|435->405|435->405|436->406|452->422|452->422|452->422|452->422|457->427|457->427|460->430|460->430|461->431|461->431|461->431|463->433|463->433|463->433|464->434|479->449|479->449|479->449|479->449|484->454|484->454|485->455|485->455|485->455|486->456|487->457|487->457|488->458|489->459|489->459|490->460|505->475|505->475|505->475|505->475|510->480|510->480|511->481|511->481|511->481|512->482|527->497|527->497|527->497|527->497|531->501|531->501|534->504|535->505|535->505|537->507|552->522|552->522|552->522|552->522|558->528|558->528|559->529|560->530|560->530|561->531|576->546|576->546|576->546|576->546|580->550|580->550|584->554|587->557|587->557|589->559|604->574|604->574|604->574|604->574|610->580|610->580|611->581|612->582|612->582|613->583|628->598|628->598|628->598|628->598|632->602|632->602|634->604|635->605|635->605|637->607|652->622|652->622|652->622|652->622|658->628|658->628|659->629|660->630|660->630|661->631|676->646|676->646|676->646|676->646|680->650|680->650|681->651|684->654|684->654|685->655|685->655|685->655|689->659|705->675|705->675|705->675|705->675|711->681|711->681|715->685|715->685|729->699|729->699|744->714|744->714|745->715|749->719|749->719|750->720|750->720|751->721|753->723|753->723|754->724|754->724|756->726|756->726|759->729|759->729|759->729|761->731|765->735|765->735|766->736|766->736|766->736|767->737|769->739|769->739|769->739|784->754|784->754|785->755|785->755|787->757|787->757|787->757|788->758|789->759|789->759|790->760|792->762|792->762|792->762|807->777|807->777|808->778|808->778|810->780|810->780|810->780|811->781|812->782|812->782|813->783|815->785|815->785|815->785|830->800|830->800|831->801|831->801|831->801|831->801|831->801|832->802|832->802|832->802|833->803|835->805|835->805|835->805|850->820|850->820|851->821|851->821|853->823|853->823|853->823|854->824|855->825|855->825|855->825|860->830|860->830|861->831|864->834|864->834|865->835|866->836|866->836|867->837|872->842|872->842|873->843|873->843|874->844|874->844|874->844|875->845|878->848|878->848|879->849|879->849|880->850|880->850|883->853|884->854|884->854|885->855|895->865|895->865|896->866|897->867|897->867|898->868|898->868|898->868|899->869|900->870|900->870|901->871|901->871|901->871|902->872|903->873|903->873|905->875|905->875|905->875|906->876|907->877|907->877|908->878|911->881|911->881|912->882|913->883|913->883|916->886|923->893|923->893|923->893|923->893|923->893|930->900|930->900|931->901|931->901|931->901|932->902|935->905|935->905|936->906|937->907|937->907|938->908|938->908|938->908|939->909|940->910|940->910|941->911|941->911|941->911|942->912|943->913|943->913|944->914|944->914|944->914|945->915|946->916|946->916|948->918|950->920|950->920|950->920|950->920|950->920|958->928|958->928|959->929|959->929|959->929|960->930|961->931|961->931|962->932|963->933|963->933|964->934|964->934|964->934|965->935|966->936|966->936|968->938|970->940|970->940|971->941|971->941|971->941|972->942|973->943|973->943|974->944|974->944|974->944|974->944|974->944|974->944|977->947|977->947|979->949|979->949|980->950|980->950|980->950|981->951|981->951|981->951|982->952|982->952|982->952|982->952|982->952|982->952|985->955|985->955|986->956|986->956|986->956|987->957|987->957|987->957|987->957|987->957|987->957|990->960|990->960|991->961|991->961|992->962|993->963|993->963|994->964|994->964|994->964|994->964|994->964|994->964|997->967|997->967|998->968|1009->979|1009->979|1011->981|1013->983|1013->983|1014->984|1017->987|1017->987|1018->988|1018->988|1019->989|1022->992|1022->992|1023->993|1023->993|1024->994|1024->994|1026->996|1028->998|1028->998|1030->1000|1035->1005|1035->1005|1036->1006|1037->1007|1037->1007|1039->1009|1039->1009|1040->1010|1040->1010|1040->1010|1040->1010|1040->1010|1040->1010|1040->1010|1040->1010|1042->1012|1044->1014|1044->1014|1045->1015|1048->1018|1048->1018|1050->1020|1050->1020|1051->1021|1053->1023|1053->1023|1054->1024|1055->1025|1055->1025|1056->1026|1056->1026|1062->1032|1062->1032|1063->1033|1064->1034|1064->1034|1065->1035|1065->1035|1066->1036|1066->1036|1068->1038|1068->1038|1068->1038|1070->1040|1070->1040|1070->1040|1071->1041|1072->1042|1072->1042|1072->1042|1077->1047|1077->1047|1078->1048|1081->1051|1081->1051|1082->1052|1083->1053|1083->1053|1084->1054|1084->1054|1084->1054|1085->1055|1086->1056|1086->1056|1087->1057|1087->1057|1088->1058|1090->1060|1090->1060|1091->1061|1092->1062|1092->1062|1095->1065|1109->1079|1109->1079|1110->1080|1113->1083|1113->1083|1113->1083|1113->1083|1113->1083|1114->1084|1116->1086|1116->1086|1117->1087|1123->1093|1123->1093|1124->1094|1125->1095|1125->1095|1126->1096|1127->1097|1127->1097|1128->1098|1129->1099|1129->1099|1131->1101|1132->1102|1132->1102|1133->1103|1134->1104|1134->1104|1136->1106|1140->1110|1140->1110|1141->1111|1144->1114|1144->1114|1146->1116|1148->1118|1148->1118|1149->1119|1151->1121|1151->1121|1152->1122|1154->1124|1154->1124|1155->1125|1157->1127|1157->1127|1158->1128|1160->1130|1160->1130|1161->1131|1163->1133|1163->1133|1164->1134|1166->1136|1166->1136|1167->1137|1169->1139|1169->1139|1170->1140|1172->1142|1172->1142|1173->1143|1175->1145|1175->1145|1179->1149|1199->1169|1199->1169|1199->1169|1199->1169|1205->1175|1205->1175|1207->1177|1213->1183|1214->1184|1216->1186|1216->1186|1216->1186|1218->1188|1220->1190|1220->1190|1221->1191|1224->1194|1224->1194|1224->1194|1224->1194|1224->1194|1224->1194|1225->1195|1225->1195|1226->1196|1227->1197|1227->1197|1228->1198|1229->1199|1229->1199|1230->1200|1233->1203|1233->1203|1233->1203|1233->1203|1233->1203|1233->1203|1234->1204|1234->1204|1235->1205|1235->1205|1235->1205|1236->1206|1239->1209|1239->1209|1239->1209|1239->1209|1239->1209|1239->1209|1241->1211|1241->1211|1242->1212|1242->1212|1243->1213|1244->1214|1244->1214|1245->1215|1246->1216|1246->1216|1247->1217|1250->1220|1250->1220|1250->1220|1250->1220|1250->1220|1250->1220|1251->1221|1251->1221|1252->1222|1252->1222|1252->1222|1253->1223|1256->1226|1256->1226|1256->1226|1256->1226|1256->1226|1256->1226|1258->1228|1258->1228|1259->1229|1259->1229|1260->1230|1261->1231|1261->1231|1262->1232|1263->1233|1263->1233|1264->1234|1267->1237|1267->1237|1267->1237|1267->1237|1267->1237|1267->1237|1268->1238|1268->1238|1269->1239|1269->1239|1269->1239|1270->1240|1273->1243|1273->1243|1273->1243|1273->1243|1273->1243|1273->1243|1275->1245|1275->1245|1276->1246|1276->1246|1277->1247|1278->1248|1278->1248|1279->1249|1280->1250|1280->1250|1281->1251|1284->1254|1284->1254|1284->1254|1284->1254|1284->1254|1284->1254|1285->1255|1285->1255|1286->1256|1286->1256|1286->1256|1287->1257|1290->1260|1290->1260|1290->1260|1290->1260|1290->1260|1290->1260|1292->1262|1292->1262|1293->1263|1293->1263|1294->1264|1295->1265|1295->1265|1296->1266|1298->1268|1298->1268|1299->1269|1302->1272|1302->1272|1302->1272|1302->1272|1302->1272|1302->1272|1303->1273|1303->1273|1304->1274|1304->1274|1304->1274|1305->1275|1308->1278|1308->1278|1308->1278|1308->1278|1308->1278|1308->1278|1310->1280|1310->1280|1311->1281|1311->1281|1313->1283|1315->1285|1324->1294|1324->1294|1325->1295|1325->1295|1326->1296|1328->1298|1328->1298|1329->1299|1329->1299|1330->1300|1330->1300|1336->1306|1336->1306|1338->1308|1338->1308|1338->1308|1339->1309|1355->1325|1355->1325|1356->1326|1357->1327|1357->1327|1357->1327|1357->1327|1358->1328|1359->1329|1359->1329|1360->1330|1379->1349|1379->1349|1384->1354|1384->1354|1386->1356|1388->1358|1388->1358|1389->1359|1390->1360|1390->1360|1392->1362|1392->1362|1392->1362|1393->1363|1395->1365|1395->1365|1397->1367|1397->1367|1398->1368|1399->1369|1399->1369|1400->1370|1400->1370|1401->1371|1401->1371|1401->1371|1402->1372|1403->1373|1405->1375|1405->1375|1405->1375|1407->1377|1409->1379|1409->1379|1410->1380|1413->1383|1413->1383|1413->1383|1413->1383|1413->1383|1413->1383|1414->1384|1414->1384|1415->1385|1415->1385|1415->1385|1416->1386|1419->1389|1419->1389|1420->1390|1423->1393|1423->1393|1423->1393|1423->1393|1423->1393|1423->1393|1424->1394|1424->1394|1425->1395|1425->1395|1425->1395|1426->1396|1429->1399|1429->1399|1429->1399|1429->1399|1429->1399|1429->1399|1431->1401|1431->1401|1432->1402|1432->1402|1441->1411|1443->1413|1446->1416|1446->1416|1448->1418|1448->1418|1448->1418|1449->1419|1451->1421|1451->1421|1452->1422|1453->1423|1453->1423|1453->1423|1456->1426|1456->1426|1456->1426|1457->1427|1457->1427|1457->1427|1458->1428|1458->1428|1458->1428|1459->1429|1459->1429|1459->1429|1464->1434|1464->1434|1464->1434|1472->1442|1473->1443|1473->1443|1473->1443|1473->1443|1476->1446|1476->1446|1476->1446|1499->1469|1499->1469|1499->1469|1499->1469|1569->1539|1570->1540|1587->1557|1587->1557|1587->1557|1589->1559|1589->1559|1589->1559|1591->1561|1591->1561|1591->1561|1596->1566|1596->1566|1596->1566|1619->1589|1622->1592|1632->1602|1632->1602|1632->1602|1633->1603|1633->1603|1633->1603|1634->1604|1634->1604|1634->1604|1672->1642|1672->1642|1672->1642|1673->1643|1673->1643|1673->1643|1675->1645|1678->1648|1678->1648|1678->1648|1678->1648|1678->1648|1678->1648|1680->1650|1680->1650|1680->1650|1681->1651|1684->1654|1684->1654|1684->1654|1684->1654|1684->1654|1684->1654|1686->1656|1688->1658|1691->1661|1762->1732|1763->1733|1764->1734|1765->1735|1770->1740
                  -- GENERATED --
              */
          