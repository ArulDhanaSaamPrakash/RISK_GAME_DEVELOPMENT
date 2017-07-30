
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
                            var tempStatus="riskStatus"+obj.riskId;
                            
                            appendquery = "<tr><td>" + obj.riskId + "</td><td style='text-align:left'><a id='"+obj.riskId+"' href='#' onclick='onRiskClick(id)' >"+obj.riskDescription+"</a></td><td id="+tempStatus+">" + isCompleted + "</td>" +
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
//                                            "data-todo='"""),format.raw/*400.59*/("""{"""),format.raw/*400.60*/("""'id':12,'todo':'xyz'"""),format.raw/*400.80*/("""}"""),format.raw/*400.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*405.33*/("""}"""),format.raw/*405.34*/("""else"""),format.raw/*405.38*/("""{"""),format.raw/*405.39*/("""
                                    """),format.raw/*406.37*/("""result = result + "<button disabled" +
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
//                                            "data-todo='"""),format.raw/*421.59*/("""{"""),format.raw/*421.60*/("""'id':12,'todo':'xyz'"""),format.raw/*421.80*/("""}"""),format.raw/*421.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*426.33*/("""}"""),format.raw/*426.34*/("""


                            """),format.raw/*429.29*/("""}"""),format.raw/*429.30*/("""else"""),format.raw/*429.34*/("""{"""),format.raw/*429.35*/("""
                                """),format.raw/*430.33*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*445.59*/("""{"""),format.raw/*445.60*/("""'id':12,'todo':'xyz'"""),format.raw/*445.80*/("""}"""),format.raw/*445.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button>";
//
                            """),format.raw/*450.29*/("""}"""),format.raw/*450.30*/("""


                        """),format.raw/*453.25*/("""}"""),format.raw/*453.26*/("""
"""),format.raw/*454.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*458.21*/("""}"""),format.raw/*458.22*/(""",
                    error: function (data) """),format.raw/*459.44*/("""{"""),format.raw/*459.45*/("""
                        """),format.raw/*460.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*462.21*/("""}"""),format.raw/*462.22*/("""
                """),format.raw/*463.17*/("""}"""),format.raw/*463.18*/(""");

            """),format.raw/*465.13*/("""}"""),format.raw/*465.14*/("""


            """),format.raw/*468.13*/("""function onPerformStep(id)"""),format.raw/*468.39*/("""{"""),format.raw/*468.40*/("""

"""),format.raw/*470.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*474.43*/("""{"""),format.raw/*474.44*/("""
                    """),format.raw/*475.21*/("""var obj = """),format.raw/*475.31*/("""{"""),format.raw/*475.32*/("""
                        """),format.raw/*476.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*478.35*/model/*478.40*/.getGameId),format.raw/*478.50*/(""",
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
                    """),format.raw/*493.21*/("""}"""),format.raw/*493.22*/(""";
                """),format.raw/*494.17*/("""}"""),format.raw/*494.18*/("""

                """),format.raw/*496.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*496.77*/("""{"""),format.raw/*496.78*/("""
"""),format.raw/*497.1*/("""//                    alert(id);
                    var obj = """),format.raw/*498.31*/("""{"""),format.raw/*498.32*/("""
                        """),format.raw/*499.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*501.35*/model/*501.40*/.getGameId),format.raw/*501.50*/(""",
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
                    """),format.raw/*516.21*/("""}"""),format.raw/*516.22*/(""";
                """),format.raw/*517.17*/("""}"""),format.raw/*517.18*/("""

                """),format.raw/*519.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*519.49*/("""{"""),format.raw/*519.50*/("""
"""),format.raw/*520.1*/("""//                    alert(id);
                    var obj = """),format.raw/*521.31*/("""{"""),format.raw/*521.32*/("""
                        """),format.raw/*522.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*524.35*/model/*524.40*/.getGameId),format.raw/*524.50*/(""",
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
                    """),format.raw/*539.21*/("""}"""),format.raw/*539.22*/(""";
                """),format.raw/*540.17*/("""}"""),format.raw/*540.18*/(""" """),format.raw/*540.19*/("""else"""),format.raw/*540.23*/("""{"""),format.raw/*540.24*/("""
                    """),format.raw/*541.21*/("""var obj = """),format.raw/*541.31*/("""{"""),format.raw/*541.32*/("""
                        """),format.raw/*542.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*544.35*/model/*544.40*/.getGameId),format.raw/*544.50*/(""",
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
                    """),format.raw/*559.21*/("""}"""),format.raw/*559.22*/(""";
                """),format.raw/*560.17*/("""}"""),format.raw/*560.18*/("""

                """),format.raw/*562.17*/("""$.ajax("""),format.raw/*562.24*/("""{"""),format.raw/*562.25*/("""
                    """),format.raw/*563.21*/("""type: 'POST',
                    url: '"""),_display_(/*564.28*/routes/*564.34*/.GameController.performStep()),format.raw/*564.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*569.46*/("""{"""),format.raw/*569.47*/("""
                        """),format.raw/*570.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        document.getElementById('prevstep').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*573.50*/("""{"""),format.raw/*573.51*/("""
"""),format.raw/*574.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*575.34*/("""{"""),format.raw/*575.35*/("""
                                        """),format.raw/*576.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*581.37*/("""}"""),format.raw/*581.38*/(""",
                                    function(isConfirm)"""),format.raw/*582.56*/("""{"""),format.raw/*582.57*/("""
                                        """),format.raw/*583.41*/("""if (isConfirm) """),format.raw/*583.56*/("""{"""),format.raw/*583.57*/("""
"""),format.raw/*584.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*587.41*/("""}"""),format.raw/*587.42*/("""
                                    """),format.raw/*588.37*/("""}"""),format.raw/*588.38*/(""");
                        """),format.raw/*589.25*/("""}"""),format.raw/*589.26*/("""


                       """),format.raw/*592.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*593.25*/("""{"""),format.raw/*593.26*/("""
                           """),format.raw/*594.28*/("""// $('#updateactivity').trigger('click');
                           isOOPSCard=true;
                           console.log(isOOPSCard+"   hello am as ");
                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*599.56*/("""{"""),format.raw/*599.57*/("""
                                """),format.raw/*600.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*601.29*/("""}"""),format.raw/*601.30*/("""
                            """),format.raw/*602.29*/("""if(data.oops_points !=0) """),format.raw/*602.54*/("""{"""),format.raw/*602.55*/("""
                                """),format.raw/*603.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*604.29*/("""}"""),format.raw/*604.30*/("""
                            """),format.raw/*605.29*/("""if(data.oops_bonus !=0) """),format.raw/*605.53*/("""{"""),format.raw/*605.54*/("""
                                """),format.raw/*606.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*607.29*/("""}"""),format.raw/*607.30*/("""
                            """),format.raw/*608.29*/("""if(data.oops_budget !=0) """),format.raw/*608.54*/("""{"""),format.raw/*608.55*/("""
                                """),format.raw/*609.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*610.29*/("""}"""),format.raw/*610.30*/("""
                            """),format.raw/*611.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*613.36*/("""{"""),format.raw/*613.37*/("""   """),format.raw/*613.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*613.128*/("""}"""),format.raw/*613.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*620.25*/("""}"""),format.raw/*620.26*/("""
                        """),format.raw/*621.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*621.61*/("""{"""),format.raw/*621.62*/("""
                            """),format.raw/*622.29*/("""isSurpriseCard=true;
                            var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*625.60*/("""{"""),format.raw/*625.61*/("""
                                """),format.raw/*626.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*627.29*/("""}"""),format.raw/*627.30*/("""
                            """),format.raw/*628.29*/("""if(data.surprise_points !=0) """),format.raw/*628.58*/("""{"""),format.raw/*628.59*/("""
                                """),format.raw/*629.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*630.29*/("""}"""),format.raw/*630.30*/("""
                            """),format.raw/*631.29*/("""if(data.surprise_bonus !=0) """),format.raw/*631.57*/("""{"""),format.raw/*631.58*/("""
                                """),format.raw/*632.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*633.29*/("""}"""),format.raw/*633.30*/("""
                            """),format.raw/*634.29*/("""if(data.surprise_budget !=0) """),format.raw/*634.58*/("""{"""),format.raw/*634.59*/("""
                                """),format.raw/*635.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*636.29*/("""}"""),format.raw/*636.30*/("""
                            """),format.raw/*637.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*639.36*/("""{"""),format.raw/*639.37*/("""   """),format.raw/*639.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*639.135*/("""}"""),format.raw/*639.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*647.25*/("""}"""),format.raw/*647.26*/("""
                        """),format.raw/*648.25*/("""else if(data.steptype == "production")"""),format.raw/*648.63*/("""{"""),format.raw/*648.64*/("""
                            """),format.raw/*649.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*650.52*/("""{"""),format.raw/*650.53*/("""
                                """),format.raw/*651.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*652.29*/("""}"""),format.raw/*652.30*/("""
                            """),format.raw/*653.29*/("""else"""),format.raw/*653.33*/("""{"""),format.raw/*653.34*/("""
                                """),format.raw/*654.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*655.29*/("""}"""),format.raw/*655.30*/("""

                            """),format.raw/*657.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*659.25*/("""}"""),format.raw/*659.26*/("""
                        """),format.raw/*660.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*660.61*/("""{"""),format.raw/*660.62*/("""
                          """),format.raw/*661.27*/("""isSkipped=true;
                            if($('#btnIsProduction').val() != "true")"""),format.raw/*662.70*/("""{"""),format.raw/*662.71*/("""
                                """),format.raw/*663.33*/("""//swal("""),format.raw/*663.40*/("""{"""),format.raw/*663.41*/("""   """),format.raw/*663.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*663.118*/("""}"""),format.raw/*663.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*666.29*/("""}"""),format.raw/*666.30*/("""

                        """),format.raw/*668.25*/("""}"""),format.raw/*668.26*/("""
                        """),format.raw/*669.25*/("""else if(data.steptype == "risk")"""),format.raw/*669.57*/("""{"""),format.raw/*669.58*/("""
                            """),format.raw/*670.29*/("""if(data.risk_status == "success")"""),format.raw/*670.62*/("""{"""),format.raw/*670.63*/("""
                                """),format.raw/*671.33*/("""//swal("""),format.raw/*671.40*/("""{"""),format.raw/*671.41*/("""   """),format.raw/*671.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*671.142*/("""}"""),format.raw/*671.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*674.29*/("""}"""),format.raw/*674.30*/("""
                            """),format.raw/*675.29*/("""else"""),format.raw/*675.33*/("""{"""),format.raw/*675.34*/("""
                                """),format.raw/*676.33*/("""//swal("""),format.raw/*676.40*/("""{"""),format.raw/*676.41*/("""   """),format.raw/*676.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*676.127*/("""}"""),format.raw/*676.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*679.29*/("""}"""),format.raw/*679.30*/("""
                        """),format.raw/*680.25*/("""}"""),format.raw/*680.26*/("""
                        """),format.raw/*681.25*/("""else
                        """),format.raw/*682.25*/("""{"""),format.raw/*682.26*/("""
                            """),format.raw/*683.29*/("""//swal("""),format.raw/*683.36*/("""{"""),format.raw/*683.37*/("""   """),format.raw/*683.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*683.134*/("""}"""),format.raw/*683.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*686.25*/("""}"""),format.raw/*686.26*/("""
                        """),format.raw/*687.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*698.91*/("""{"""),format.raw/*698.92*/("""

                            """),format.raw/*700.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*702.25*/("""}"""),format.raw/*702.26*/("""
                    """),format.raw/*703.21*/("""//    refreshProjectSteps();


                    """),format.raw/*706.21*/("""}"""),format.raw/*706.22*/(""",
                    error: function (data) """),format.raw/*707.44*/("""{"""),format.raw/*707.45*/("""
                      """),format.raw/*708.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*711.21*/("""}"""),format.raw/*711.22*/("""
                """),format.raw/*712.17*/("""}"""),format.raw/*712.18*/(""");
            """),format.raw/*713.13*/("""}"""),format.raw/*713.14*/("""

            """),format.raw/*715.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*717.47*/("""{"""),format.raw/*717.48*/("""

                 """),format.raw/*719.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*724.27*/("""{"""),format.raw/*724.28*/("""
                    """),format.raw/*725.21*/("""'phaseId': clicked_id
                """),format.raw/*726.17*/("""}"""),format.raw/*726.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*728.43*/("""{"""),format.raw/*728.44*/("""
                    """),format.raw/*729.21*/("""swal("""),format.raw/*729.26*/("""{"""),format.raw/*729.27*/("""   """),format.raw/*729.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*729.232*/("""}"""),format.raw/*729.233*/(""", function()"""),format.raw/*729.245*/("""{"""),format.raw/*729.246*/("""

               """),format.raw/*731.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*733.74*/("""{"""),format.raw/*733.75*/("""
                            """),format.raw/*734.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*737.25*/("""}"""),format.raw/*737.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*739.61*/("""{"""),format.raw/*739.62*/("""
                            """),format.raw/*740.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*742.54*/("""{"""),format.raw/*742.55*/("""
                                """),format.raw/*743.33*/("""riskcount++;
                            """),format.raw/*744.29*/("""}"""),format.raw/*744.30*/("""
                        """),format.raw/*745.25*/("""}"""),format.raw/*745.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*751.48*/("""{"""),format.raw/*751.49*/("""
                        """),format.raw/*752.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*753.21*/("""}"""),format.raw/*753.22*/("""
                        """),format.raw/*754.25*/("""}"""),format.raw/*754.26*/(""");
                """),format.raw/*755.17*/("""}"""),format.raw/*755.18*/("""

                """),format.raw/*757.17*/("""else """),format.raw/*757.22*/("""{"""),format.raw/*757.23*/("""

                    """),format.raw/*759.21*/("""$.ajax("""),format.raw/*759.28*/("""{"""),format.raw/*759.29*/("""
                        """),format.raw/*760.25*/("""type: 'POST',
                        url: '"""),_display_(/*761.32*/routes/*761.38*/.GameController.getProjectSteps()),format.raw/*761.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*766.50*/("""{"""),format.raw/*766.51*/("""
"""),format.raw/*767.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*770.63*/("""{"""),format.raw/*770.64*/("""
                                """),format.raw/*771.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*772.61*/("""{"""),format.raw/*772.62*/("""
                                    """),format.raw/*773.37*/("""if (obj.status) """),format.raw/*773.53*/("""{"""),format.raw/*773.54*/("""
                                        """),format.raw/*774.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*775.37*/("""}"""),format.raw/*775.38*/("""
                                """),format.raw/*776.33*/("""}"""),format.raw/*776.34*/("""
"""),format.raw/*777.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*779.49*/("""{"""),format.raw/*779.50*/("""
                                    """),format.raw/*780.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*781.33*/("""}"""),format.raw/*781.34*/("""


                                """),format.raw/*784.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*798.91*/("""{"""),format.raw/*798.92*/("""
                                    """),format.raw/*799.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*802.33*/("""}"""),format.raw/*802.34*/(""" """),format.raw/*802.35*/("""else """),format.raw/*802.40*/("""{"""),format.raw/*802.41*/("""
                                    """),format.raw/*803.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*805.33*/("""}"""),format.raw/*805.34*/("""
"""),format.raw/*806.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

if(isOOPSCard)
"""),format.raw/*812.1*/("""{"""),format.raw/*812.2*/("""
  """),format.raw/*813.3*/("""isOOPSCard=false;
"""),format.raw/*814.1*/("""}"""),format.raw/*814.2*/("""
"""),format.raw/*815.1*/("""if(isSurpriseCard)
"""),format.raw/*816.1*/("""{"""),format.raw/*816.2*/("""
  """),format.raw/*817.3*/("""isSurpriseCard=false;
"""),format.raw/*818.1*/("""}"""),format.raw/*818.2*/("""

"""),format.raw/*820.1*/("""if(isSkipped)
"""),format.raw/*821.1*/("""{"""),format.raw/*821.2*/("""
  """),format.raw/*822.3*/("""isSkipped=false;
"""),format.raw/*823.1*/("""}"""),format.raw/*823.2*/("""

"""),format.raw/*825.1*/("""if((obj.projectStepId == 'CPSM25' || obj.projectStepId == 'CPSM26' ||obj.projectStepId == 'CPSM27' ||obj.projectStepId == 'CPSM28' ||obj.projectStepId == 'CPSM29' ||obj.projectStepId == 'CPSM30' ||obj.projectStepId == 'CPSM31' ||obj.projectStepId == 'CPSM32' ||obj.projectStepId == 'CPSM33'
  || obj.projectStepId == 'CPSM34' ||obj.projectStepId == 'CPSM35'
   ||obj.projectStepId == 'CPSM36')&&(obj.status == "disabled='true'")
   &&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(c==1))
"""),format.raw/*829.1*/("""{"""),format.raw/*829.2*/("""
"""),format.raw/*830.1*/("""isImplementedBeforeProduction=true;
c=2;
console.log(isImplementedBeforeProduction+" i am inside if condition");
"""),format.raw/*833.1*/("""}"""),format.raw/*833.2*/("""

"""),format.raw/*835.1*/("""if((obj.projectStepId == 'CPSM16')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cr==1))
"""),format.raw/*837.1*/("""{"""),format.raw/*837.2*/("""
"""),format.raw/*838.1*/("""cr=2;
isRequirementPlanningDone=true;
"""),format.raw/*840.1*/("""}"""),format.raw/*840.2*/("""
"""),format.raw/*841.1*/("""if((obj.projectStepId == 'CPSM17')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ct==1))
"""),format.raw/*843.1*/("""{"""),format.raw/*843.2*/("""
"""),format.raw/*844.1*/("""ct=2;
isTestingPlanningDone=true;
"""),format.raw/*846.1*/("""}"""),format.raw/*846.2*/("""
"""),format.raw/*847.1*/("""if((obj.projectStepId == 'CPSM18')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ci==1))
"""),format.raw/*849.1*/("""{"""),format.raw/*849.2*/("""
"""),format.raw/*850.1*/("""ci=2;
isImplementationPlanningDone=true;
"""),format.raw/*852.1*/("""}"""),format.raw/*852.2*/("""
"""),format.raw/*853.1*/("""if((obj.projectStepId == 'CPSM19')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cd==1))
"""),format.raw/*855.1*/("""{"""),format.raw/*855.2*/("""
"""),format.raw/*856.1*/("""cd=2;
isDesignPlanningDone=true;
"""),format.raw/*858.1*/("""}"""),format.raw/*858.2*/("""
"""),format.raw/*859.1*/("""if((obj.projectStepId == 'CPSM20')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cp==1))
"""),format.raw/*861.1*/("""{"""),format.raw/*861.2*/("""
"""),format.raw/*862.1*/("""cp=2;
isProductionPlanningDone=true;
"""),format.raw/*864.1*/("""}"""),format.raw/*864.2*/("""



"""),format.raw/*868.1*/("""isSkipped=true;
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
//                                            "data-todo='"""),format.raw/*888.59*/("""{"""),format.raw/*888.60*/("""'id':12,'todo':'xyz'"""),format.raw/*888.80*/("""}"""),format.raw/*888.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*894.29*/("""}"""),format.raw/*894.30*/("""

"""),format.raw/*896.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;


                            """),format.raw/*902.77*/("""
                            """),format.raw/*903.29*/("""var result="";
                            var count=0;
                        """),_display_(/*905.26*/for(phases <- model.getPhases()) yield /*905.58*/ {_display_(Seq[Any](format.raw/*905.60*/("""

                  """),format.raw/*907.19*/("""count++;
                  if(count==1)
                  """),format.raw/*909.19*/("""{"""),format.raw/*909.20*/("""
                  """),format.raw/*910.19*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                      "style='background-color: #DB8B00 !important;'" +
                      "onclick='onPhaseClick(id)' " +
                      "id='"""),_display_(/*913.29*/phases/*913.35*/.getPhaseId),format.raw/*913.46*/("""'>"""),_display_(/*913.49*/phases/*913.55*/.getPhaseName),format.raw/*913.68*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                  """),format.raw/*914.19*/("""}"""),format.raw/*914.20*/("""
                  """),format.raw/*915.19*/("""else if(count==2)
                  """),format.raw/*916.19*/("""{"""),format.raw/*916.20*/("""
                    """),format.raw/*917.21*/("""if(isRequirementPlanningDone)
                    """),format.raw/*918.21*/("""{"""),format.raw/*918.22*/("""
                      """),format.raw/*919.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*922.33*/phases/*922.39*/.getPhaseId),format.raw/*922.50*/("""'>"""),_display_(/*922.53*/phases/*922.59*/.getPhaseName),format.raw/*922.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*923.21*/("""}"""),format.raw/*923.22*/("""
                    """),format.raw/*924.21*/("""else """),format.raw/*924.26*/("""{"""),format.raw/*924.27*/("""
                      """),format.raw/*925.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*928.35*/phases/*928.41*/.getPhaseId),format.raw/*928.52*/("""'>"""),_display_(/*928.55*/phases/*928.61*/.getPhaseName),format.raw/*928.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*930.21*/("""}"""),format.raw/*930.22*/("""
                  """),format.raw/*931.19*/("""}"""),format.raw/*931.20*/("""
                  """),format.raw/*932.19*/("""else if(count==3)
                  """),format.raw/*933.19*/("""{"""),format.raw/*933.20*/("""
                    """),format.raw/*934.21*/("""if(isDesignPlanningDone)
                    """),format.raw/*935.21*/("""{"""),format.raw/*935.22*/("""
                      """),format.raw/*936.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*939.33*/phases/*939.39*/.getPhaseId),format.raw/*939.50*/("""'>"""),_display_(/*939.53*/phases/*939.59*/.getPhaseName),format.raw/*939.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*940.21*/("""}"""),format.raw/*940.22*/("""
                    """),format.raw/*941.21*/("""else """),format.raw/*941.26*/("""{"""),format.raw/*941.27*/("""
                      """),format.raw/*942.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*945.35*/phases/*945.41*/.getPhaseId),format.raw/*945.52*/("""'>"""),_display_(/*945.55*/phases/*945.61*/.getPhaseName),format.raw/*945.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*947.21*/("""}"""),format.raw/*947.22*/("""
                  """),format.raw/*948.19*/("""}"""),format.raw/*948.20*/("""
                  """),format.raw/*949.19*/("""else if(count==4)
                  """),format.raw/*950.19*/("""{"""),format.raw/*950.20*/("""
                    """),format.raw/*951.21*/("""if(isImplementationPlanningDone)
                    """),format.raw/*952.21*/("""{"""),format.raw/*952.22*/("""
                      """),format.raw/*953.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*956.33*/phases/*956.39*/.getPhaseId),format.raw/*956.50*/("""'>"""),_display_(/*956.53*/phases/*956.59*/.getPhaseName),format.raw/*956.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*957.21*/("""}"""),format.raw/*957.22*/("""
                    """),format.raw/*958.21*/("""else """),format.raw/*958.26*/("""{"""),format.raw/*958.27*/("""
                      """),format.raw/*959.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*962.35*/phases/*962.41*/.getPhaseId),format.raw/*962.52*/("""'>"""),_display_(/*962.55*/phases/*962.61*/.getPhaseName),format.raw/*962.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*964.21*/("""}"""),format.raw/*964.22*/("""
                  """),format.raw/*965.19*/("""}"""),format.raw/*965.20*/("""
                  """),format.raw/*966.19*/("""else if(count==5)
                  """),format.raw/*967.19*/("""{"""),format.raw/*967.20*/("""
                    """),format.raw/*968.21*/("""if(isTestingPlanningDone)
                    """),format.raw/*969.21*/("""{"""),format.raw/*969.22*/("""
                      """),format.raw/*970.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*973.33*/phases/*973.39*/.getPhaseId),format.raw/*973.50*/("""'>"""),_display_(/*973.53*/phases/*973.59*/.getPhaseName),format.raw/*973.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*974.21*/("""}"""),format.raw/*974.22*/("""
                    """),format.raw/*975.21*/("""else """),format.raw/*975.26*/("""{"""),format.raw/*975.27*/("""
                      """),format.raw/*976.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*979.35*/phases/*979.41*/.getPhaseId),format.raw/*979.52*/("""'>"""),_display_(/*979.55*/phases/*979.61*/.getPhaseName),format.raw/*979.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*981.21*/("""}"""),format.raw/*981.22*/("""
                  """),format.raw/*982.19*/("""}"""),format.raw/*982.20*/("""
                  """),format.raw/*983.19*/("""else if(count==6)
                  """),format.raw/*984.19*/("""{"""),format.raw/*984.20*/("""
                    """),format.raw/*985.21*/("""console.log(isProductionPlanningDone+" i am is production planning"+isImplementedBeforeProduction+" i am before guy");
                    if(isImplementedBeforeProduction && isProductionPlanningDone)
                    """),format.raw/*987.21*/("""{"""),format.raw/*987.22*/("""
                    """),format.raw/*988.21*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*991.33*/phases/*991.39*/.getPhaseId),format.raw/*991.50*/("""'>"""),_display_(/*991.53*/phases/*991.59*/.getPhaseName),format.raw/*991.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*992.21*/("""}"""),format.raw/*992.22*/("""
                    """),format.raw/*993.21*/("""else """),format.raw/*993.26*/("""{"""),format.raw/*993.27*/("""
                    """),format.raw/*994.21*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*997.33*/phases/*997.39*/.getPhaseId),format.raw/*997.50*/("""'>"""),_display_(/*997.53*/phases/*997.59*/.getPhaseName),format.raw/*997.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*999.21*/("""}"""),format.raw/*999.22*/("""
                  """),format.raw/*1000.19*/("""}"""),format.raw/*1000.20*/("""

                            """)))}),format.raw/*1002.30*/("""

                            """),format.raw/*1004.29*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
                  //                alert(result);







                        """),format.raw/*1013.25*/("""}"""),format.raw/*1013.26*/(""",
                        error: function (data) """),format.raw/*1014.48*/("""{"""),format.raw/*1014.49*/("""
                            """),format.raw/*1015.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*1017.25*/("""}"""),format.raw/*1017.26*/("""
                    """),format.raw/*1018.21*/("""}"""),format.raw/*1018.22*/(""");
                """),format.raw/*1019.17*/("""}"""),format.raw/*1019.18*/("""





            """),format.raw/*1025.13*/("""}"""),format.raw/*1025.14*/("""

            """),format.raw/*1027.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*1027.67*/("""{"""),format.raw/*1027.68*/("""
"""),format.raw/*1028.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*1044.42*/("""{"""),format.raw/*1044.43*/("""
                    """),format.raw/*1045.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*1046.17*/("""}"""),format.raw/*1046.18*/("""else"""),format.raw/*1046.22*/("""{"""),format.raw/*1046.23*/("""
                    """),format.raw/*1047.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*1048.17*/("""}"""),format.raw/*1048.18*/("""
                """),format.raw/*1049.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*1068.13*/("""}"""),format.raw/*1068.14*/(""");




            function totalGameTimer() """),format.raw/*1073.39*/("""{"""),format.raw/*1073.40*/("""

                """),format.raw/*1075.17*/("""var sec = 0;

                function pad(val) """),format.raw/*1077.35*/("""{"""),format.raw/*1077.36*/("""
                    """),format.raw/*1078.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*1079.17*/("""}"""),format.raw/*1079.18*/("""

                """),format.raw/*1081.17*/("""var timer = setInterval(function () """),format.raw/*1081.53*/("""{"""),format.raw/*1081.54*/("""
                    """),format.raw/*1082.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*1084.17*/("""}"""),format.raw/*1084.18*/(""", 1000);

                setTimeout(function () """),format.raw/*1086.40*/("""{"""),format.raw/*1086.41*/("""
                    """),format.raw/*1087.21*/("""clearInterval(timer);
                """),format.raw/*1088.17*/("""}"""),format.raw/*1088.18*/(""", 50000000);
            """),format.raw/*1089.13*/("""}"""),format.raw/*1089.14*/("""
            """),format.raw/*1090.13*/("""function refreshProjectSteps()"""),format.raw/*1090.43*/("""{"""),format.raw/*1090.44*/("""
                """),format.raw/*1091.65*/("""
                """),format.raw/*1092.17*/("""var result="";
                var count=0;
            """),_display_(/*1094.14*/for(phases <- model.getPhases()) yield /*1094.46*/ {_display_(Seq[Any](format.raw/*1094.48*/("""

"""),format.raw/*1096.1*/("""count++;
if(count<6)
"""),format.raw/*1098.1*/("""{"""),format.raw/*1098.2*/("""
  """),format.raw/*1099.3*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
          "style='background-color: #DB8B00 !important;'" +
          "onclick='onPhaseClick(id)' " +
          "id='"""),_display_(/*1102.17*/phases/*1102.23*/.getPhaseId),format.raw/*1102.34*/("""'>"""),_display_(/*1102.37*/phases/*1102.43*/.getPhaseName),format.raw/*1102.56*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
"""),format.raw/*1103.1*/("""}"""),format.raw/*1103.2*/("""
"""),format.raw/*1104.1*/("""else """),format.raw/*1104.6*/("""{"""),format.raw/*1104.7*/("""
  """),format.raw/*1105.3*/("""console.log(isImplementedBeforeProduction);
  console.log("i am here in");
  if(isImplementedBeforeProduction)
  """),format.raw/*1108.3*/("""{"""),format.raw/*1108.4*/("""
    """),format.raw/*1109.5*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1112.19*/phases/*1112.25*/.getPhaseId),format.raw/*1112.36*/("""'>"""),_display_(/*1112.39*/phases/*1112.45*/.getPhaseName),format.raw/*1112.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
  """),format.raw/*1113.3*/("""}"""),format.raw/*1113.4*/("""
  """),format.raw/*1114.3*/("""else """),format.raw/*1114.8*/("""{"""),format.raw/*1114.9*/("""
    """),format.raw/*1115.5*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1118.19*/phases/*1118.25*/.getPhaseId),format.raw/*1118.36*/("""'>"""),_display_(/*1118.39*/phases/*1118.45*/.getPhaseName),format.raw/*1118.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

  """),format.raw/*1120.3*/("""}"""),format.raw/*1120.4*/("""
"""),format.raw/*1121.1*/("""}"""),format.raw/*1121.2*/("""








                """)))}),format.raw/*1130.18*/("""

                """),format.raw/*1132.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*1135.13*/("""}"""),format.raw/*1135.14*/("""

            """),format.raw/*1137.13*/("""function newfunc()"""),format.raw/*1137.31*/("""{"""),format.raw/*1137.32*/("""
                """),format.raw/*1138.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*1140.13*/("""}"""),format.raw/*1140.14*/("""
    """),format.raw/*1141.5*/("""</script>
    <body style="background-image: url("""),_display_(/*1142.41*/routes/*1142.47*/.Assets.at("images/bg.jpg")),format.raw/*1142.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*1145.68*/model/*1145.73*/.getUserName()),format.raw/*1145.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*1146.64*/model/*1146.69*/.getGameId()),format.raw/*1146.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*1147.60*/model/*1147.65*/.getTurnNo()),format.raw/*1147.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*1148.68*/model/*1148.73*/.getTimeForEachMove()),format.raw/*1148.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*1153.64*/routes/*1153.70*/.DashboardController.viewDashboard()),format.raw/*1153.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*1161.51*/("""
                """),format.raw/*1162.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*1162.95*/model/*1162.100*/.getGameId()),format.raw/*1162.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*1165.44*/model/*1165.49*/.getStepsForEachPlayer()),format.raw/*1165.73*/("""</span>
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
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*1188.126*/model/*1188.131*/.getUserName().split("@")/*1188.156*/(0)),format.raw/*1188.159*/("""!</div>

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
                            """),format.raw/*1258.105*/("""
                        """),format.raw/*1259.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1276.126*/model/*1276.131*/.getBudget()),format.raw/*1276.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1278.141*/model/*1278.146*/.getCapabilityPoints()),format.raw/*1278.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1280.139*/model/*1280.144*/.getCapabilityBonus()),format.raw/*1280.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1285.180*/model/*1285.185*/.getResources),format.raw/*1285.198*/("""</div>
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


                                              """),format.raw/*1308.138*/("""


                                          """),format.raw/*1311.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1321.83*/model/*1321.88*/.getBudget()),format.raw/*1321.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1322.84*/model/*1322.89*/.getCapabilityPoints()),format.raw/*1322.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1323.83*/model/*1323.88*/.getCapabilityBonus()),format.raw/*1323.109*/("""</div>
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


                                    """),_display_(/*1361.38*/for(phase <- model.getPhases()) yield /*1361.69*/ {_display_(Seq[Any](format.raw/*1361.71*/("""
                                        """),_display_(/*1362.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1362.95*/{_display_(Seq[Any](format.raw/*1362.96*/("""

                                            """),format.raw/*1364.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1367.49*/phase/*1367.54*/.getPhaseId),format.raw/*1367.65*/(""">"""),_display_(/*1367.67*/phase/*1367.72*/.getPhaseName()),format.raw/*1367.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1369.42*/else/*1369.46*/{_display_(Seq[Any](format.raw/*1369.47*/("""
                                            """),format.raw/*1370.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1373.49*/phase/*1373.54*/.getPhaseId),format.raw/*1373.65*/(""">"""),_display_(/*1373.67*/phase/*1373.72*/.getPhaseName()),format.raw/*1373.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1375.42*/("""

                                    """)))}),format.raw/*1377.38*/("""


                                """),format.raw/*1380.33*/("""</div>





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
                    """),format.raw/*1451.51*/("""
                    """),format.raw/*1452.55*/("""
                    """),format.raw/*1453.52*/("""
                    """),format.raw/*1454.105*/("""




                    """),format.raw/*1459.21*/("""<div class="panel panel-default" >
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
                  DATE: Sun Jul 30 00:35:35 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: 0f5ea9f0a74dcf21c4ebbd1a7b9150284ee35d42
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10995->6752|11025->6753|11072->6771|11132->6802|11162->6803|11204->6816|11298->6881|11328->6882|11375->6900|11446->6942|11476->6943|11518->6956|11610->7019|11640->7020|11686->7037|11770->7092|11800->7093|11850->7114|11919->7155|11935->7161|11987->7191|12238->7413|12268->7414|12297->7415|12576->7665|12606->7666|12665->7696|12979->7981|13009->7982|13038->7983|13271->8187|13301->8188|13334->8192|13364->8193|13426->8226|13505->8276|13535->8277|13596->8309|14682->9366|14712->9367|14774->9400|15014->9611|15044->9612|15077->9616|15107->9617|15169->9650|15299->9751|15329->9752|15358->9753|17027->11393|17057->11394|17111->11419|17261->11540|17291->11541|17365->11586|17395->11587|17449->11612|17570->11704|17600->11705|17646->11722|17676->11723|17721->11739|17751->11740|17794->11754|17879->11810|17909->11811|17952->11825|18471->12315|18501->12316|18551->12337|18706->12463|18736->12464|18769->12468|18799->12469|18849->12490|18950->12562|18980->12563|19026->12580|19876->13401|19906->13402|19978->13445|20008->13446|20037->13447|20279->13660|20309->13661|20353->13676|20532->13826|20562->13827|20591->13828|20716->13924|20746->13925|20796->13946|20854->13975|20884->13976|20930->13993|20966->14000|20996->14001|21046->14022|21115->14063|21131->14069|21189->14105|21400->14287|21430->14288|21485->14314|21674->14474|21704->14475|21762->14504|21893->14606|21923->14607|21985->14640|22117->14743|22147->14744|22177->14746|23417->15957|23447->15958|23509->15991|23749->16202|23779->16203|23812->16207|23842->16208|23904->16241|24034->16342|24064->16343|24093->16344|24455->16677|24485->16678|24547->16711|24605->16740|24635->16741|24701->16778|26190->18238|26220->18239|26269->18259|26299->18260|26653->18585|26683->18586|26716->18590|26746->18591|26812->18628|28309->20096|28339->20097|28388->20117|28418->20118|28772->20443|28802->20444|28862->20475|28892->20476|28925->20480|28955->20481|29017->20514|30450->21918|30480->21919|30529->21939|30559->21940|30897->22249|30927->22250|30983->22277|31013->22278|31042->22279|31354->22562|31384->22563|31458->22608|31488->22609|31542->22634|31677->22740|31707->22741|31753->22758|31783->22759|31828->22775|31858->22776|31902->22791|31957->22817|31987->22818|32017->22820|32380->23154|32410->23155|32460->23176|32499->23186|32529->23187|32583->23212|32702->23303|32717->23308|32749->23318|33770->24310|33800->24311|33847->24329|33877->24330|33924->24348|34013->24408|34043->24409|34072->24410|34164->24473|34194->24474|34248->24499|34367->24590|34382->24595|34414->24605|35432->25594|35462->25595|35509->25613|35539->25614|35586->25632|35647->25664|35677->25665|35706->25666|35798->25729|35828->25730|35882->25755|35997->25842|36012->25847|36044->25857|37067->26851|37097->26852|37144->26870|37174->26871|37204->26872|37237->26876|37267->26877|37317->26898|37356->26908|37386->26909|37440->26934|37555->27021|37570->27026|37602->27036|38615->28020|38645->28021|38692->28039|38722->28040|38769->28058|38805->28065|38835->28066|38885->28087|38954->28128|38970->28134|39021->28163|39283->28396|39313->28397|39367->28422|39644->28670|39674->28671|39703->28672|39817->28757|39847->28758|39917->28799|40290->29143|40320->29144|40406->29201|40436->29202|40506->29243|40550->29258|40580->29259|40609->29260|40817->29439|40847->29440|40913->29477|40943->29478|40999->29505|41029->29506|41084->29532|41170->29589|41200->29590|41257->29618|41554->29886|41584->29887|41646->29920|41761->30006|41791->30007|41849->30036|41903->30061|41933->30062|41995->30095|42117->30188|42147->30189|42205->30218|42258->30242|42288->30243|42350->30276|42470->30367|42500->30368|42558->30397|42612->30422|42642->30423|42704->30456|42816->30539|42846->30540|42904->30569|43024->30660|43054->30661|43086->30664|43204->30752|43235->30753|43768->31257|43798->31258|43852->31283|43917->31319|43947->31320|44005->31349|44173->31488|44203->31489|44265->31522|44384->31612|44414->31613|44472->31642|44530->31671|44560->31672|44622->31705|44748->31802|44778->31803|44836->31832|44893->31860|44923->31861|44985->31894|45109->31989|45139->31990|45197->32019|45255->32048|45285->32049|45347->32082|45463->32169|45493->32170|45551->32199|45671->32290|45701->32291|45733->32294|45858->32389|45889->32390|46493->32965|46523->32966|46577->32991|46644->33029|46674->33030|46732->33059|46831->33129|46861->33130|46923->33163|47092->33303|47122->33304|47180->33333|47213->33337|47243->33338|47305->33371|47469->33506|47499->33507|47558->33537|47723->33673|47753->33674|47807->33699|47872->33735|47902->33736|47958->33763|48072->33848|48102->33849|48164->33882|48200->33889|48230->33890|48262->33893|48366->33967|48397->33968|48606->34148|48636->34149|48691->34175|48721->34176|48775->34201|48836->34233|48866->34234|48924->34263|48986->34296|49016->34297|49078->34330|49114->34337|49144->34338|49176->34341|49304->34439|49335->34440|49550->34626|49580->34627|49638->34656|49671->34660|49701->34661|49763->34694|49799->34701|49829->34702|49861->34705|49974->34788|50005->34789|50220->34975|50250->34976|50304->35001|50334->35002|50388->35027|50446->35056|50476->35057|50534->35086|50570->35093|50600->35094|50632->35097|50756->35191|50787->35192|50995->35371|51025->35372|51079->35397|51930->36219|51960->36220|52019->36250|52156->36358|52186->36359|52236->36380|52316->36431|52346->36432|52420->36477|52450->36478|52502->36501|52688->36658|52718->36659|52764->36676|52794->36677|52838->36692|52868->36693|52911->36707|53046->36813|53076->36814|53124->36833|53368->37048|53398->37049|53448->37070|53515->37108|53545->37109|53619->37154|53649->37155|53699->37176|53733->37181|53763->37182|53795->37185|54027->37387|54058->37388|54100->37400|54131->37401|54177->37418|54422->37634|54452->37635|54510->37664|54612->37737|54642->37738|54779->37846|54809->37847|54867->37876|54996->37976|55026->37977|55088->38010|55158->38051|55188->38052|55242->38077|55272->38078|55627->38404|55657->38405|55711->38430|55865->38555|55895->38556|55949->38581|55979->38582|56027->38601|56057->38602|56104->38620|56138->38625|56168->38626|56219->38648|56255->38655|56285->38656|56339->38681|56412->38726|56428->38732|56483->38765|56772->39025|56802->39026|56831->39027|57086->39253|57116->39254|57178->39287|57286->39366|57316->39367|57382->39404|57427->39420|57457->39421|57527->39462|57615->39521|57645->39522|57707->39555|57737->39556|57766->39557|57940->39702|57970->39703|58036->39740|58128->39803|58158->39804|58222->39839|59366->40954|59396->40955|59462->40992|59714->41215|59744->41216|59774->41217|59808->41222|59838->41223|59904->41260|60046->41373|60076->41374|60105->41375|60438->41680|60467->41681|60498->41684|60544->41702|60573->41703|60602->41704|60649->41723|60678->41724|60709->41727|60759->41749|60788->41750|60818->41752|60860->41766|60889->41767|60920->41770|60965->41787|60994->41788|61024->41790|61542->42280|61571->42281|61600->42282|61741->42395|61770->42396|61800->42398|61957->42527|61986->42528|62015->42529|62081->42567|62110->42568|62139->42569|62296->42698|62325->42699|62354->42700|62416->42734|62445->42735|62474->42736|62631->42865|62660->42866|62689->42867|62758->42908|62787->42909|62816->42910|62973->43039|63002->43040|63031->43041|63092->43074|63121->43075|63150->43076|63307->43205|63336->43206|63365->43207|63430->43244|63459->43245|63491->43249|65021->44750|65051->44751|65100->44771|65130->44772|65629->45242|65659->45243|65689->45245|66038->45613|66096->45642|66205->45723|66254->45755|66295->45757|66344->45777|66431->45835|66461->45836|66509->45855|66754->46072|66770->46078|66803->46089|66834->46092|66850->46098|66885->46111|66995->46192|67025->46193|67073->46212|67138->46248|67168->46249|67218->46270|67297->46320|67327->46321|67379->46344|67636->46573|67652->46579|67685->46590|67716->46593|67732->46599|67767->46612|67879->46695|67909->46696|67959->46717|67993->46722|68023->46723|68075->46746|68354->46997|68370->47003|68403->47014|68434->47017|68450->47023|68485->47036|68598->47120|68628->47121|68676->47140|68706->47141|68754->47160|68819->47196|68849->47197|68899->47218|68973->47263|69003->47264|69055->47287|69312->47516|69328->47522|69361->47533|69392->47536|69408->47542|69443->47555|69555->47638|69585->47639|69635->47660|69669->47665|69699->47666|69751->47689|70030->47940|70046->47946|70079->47957|70110->47960|70126->47966|70161->47979|70274->48063|70304->48064|70352->48083|70382->48084|70430->48103|70495->48139|70525->48140|70575->48161|70657->48214|70687->48215|70739->48238|70996->48467|71012->48473|71045->48484|71076->48487|71092->48493|71127->48506|71239->48589|71269->48590|71319->48611|71353->48616|71383->48617|71435->48640|71714->48891|71730->48897|71763->48908|71794->48911|71810->48917|71845->48930|71958->49014|71988->49015|72036->49034|72066->49035|72114->49054|72179->49090|72209->49091|72259->49112|72334->49158|72364->49159|72416->49182|72673->49411|72689->49417|72722->49428|72753->49431|72769->49437|72804->49450|72916->49533|72946->49534|72996->49555|73030->49560|73060->49561|73112->49584|73391->49835|73407->49841|73440->49852|73471->49855|73487->49861|73522->49874|73635->49958|73665->49959|73713->49978|73743->49979|73791->49998|73856->50034|73886->50035|73936->50056|74186->50277|74216->50278|74266->50299|74523->50528|74539->50534|74572->50545|74603->50548|74619->50554|74654->50567|74766->50650|74796->50651|74846->50672|74880->50677|74910->50678|74960->50699|75233->50944|75249->50950|75282->50961|75313->50964|75329->50970|75364->50983|75477->51067|75507->51068|75556->51087|75587->51088|75651->51119|75711->51149|75889->51297|75920->51298|75999->51347|76030->51348|76089->51377|76219->51477|76250->51478|76301->51499|76332->51500|76381->51519|76412->51520|76460->51538|76491->51539|76535->51553|76619->51607|76650->51608|76680->51609|77624->52523|77655->52524|77706->52545|77863->52672|77894->52673|77928->52677|77959->52678|78010->52699|78108->52767|78139->52768|78186->52785|79275->53844|79306->53845|79381->53890|79412->53891|79460->53909|79538->53957|79569->53958|79620->53979|79700->54029|79731->54030|79779->54048|79845->54084|79876->54085|79927->54106|80133->54282|80164->54283|80243->54332|80274->54333|80325->54354|80393->54392|80424->54393|80479->54418|80510->54419|80553->54432|80613->54462|80644->54463|80691->54528|80738->54545|80824->54602|80874->54634|80916->54636|80947->54638|80997->54659|81027->54660|81059->54663|81269->54844|81286->54850|81320->54861|81352->54864|81369->54870|81405->54883|81497->54946|81527->54947|81557->54948|81591->54953|81621->54954|81653->54957|81795->55070|81825->55071|81859->55076|82075->55263|82092->55269|82126->55280|82158->55283|82175->55289|82211->55302|82305->55367|82335->55368|82367->55371|82401->55376|82431->55377|82465->55382|82697->55585|82714->55591|82748->55602|82780->55605|82797->55611|82833->55624|82928->55690|82958->55691|82988->55692|83018->55693|83077->55719|83125->55737|83267->55849|83298->55850|83342->55864|83390->55882|83421->55883|83468->55900|83550->55952|83581->55953|83615->55958|83694->56008|83711->56014|83761->56041|84016->56267|84032->56272|84069->56286|84165->56353|84181->56358|84216->56370|84308->56433|84324->56438|84359->56450|84459->56521|84475->56526|84519->56547|84749->56748|84766->56754|84826->56790|85084->57052|85131->57069|85238->57147|85255->57152|85291->57164|85483->57327|85499->57332|85546->57356|87099->58879|87116->58884|87153->58909|87180->58912|90139->61916|90194->61941|90863->62580|90880->62585|90916->62597|91150->62801|91167->62806|91213->62828|91445->63030|91462->63035|91507->63056|91943->63462|91960->63467|91997->63480|93119->64662|93194->64707|94062->65546|94078->65551|94114->65563|94233->65653|94249->65658|94295->65680|94413->65769|94429->65774|94474->65795|96786->68078|96835->68109|96877->68111|96948->68153|97012->68206|97053->68207|97129->68253|97409->68504|97425->68509|97459->68520|97490->68522|97506->68527|97544->68542|97712->68689|97727->68693|97768->68694|97843->68739|98138->69005|98154->69010|98188->69021|98219->69023|98235->69028|98273->69043|98453->69190|98525->69229|98590->69264|101516->72190|101567->72245|101618->72297|101670->72402|101725->72427
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|208->178|208->178|210->180|211->181|211->181|212->182|214->184|214->184|216->186|217->187|217->187|218->188|219->189|219->189|220->190|221->191|221->191|222->192|223->193|223->193|223->193|228->198|228->198|229->199|233->203|233->203|235->205|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|246->216|246->216|250->220|264->234|264->234|265->235|268->238|268->238|268->238|268->238|269->239|271->241|271->241|272->242|296->266|296->266|297->267|299->269|299->269|300->270|300->270|301->271|303->273|303->273|304->274|304->274|306->276|306->276|308->278|308->278|308->278|309->279|319->289|319->289|320->290|321->291|321->291|321->291|321->291|322->292|323->293|323->293|324->294|341->311|341->311|343->313|343->313|344->314|350->320|350->320|353->323|357->327|357->327|358->328|360->330|360->330|361->331|362->332|362->332|363->333|363->333|363->333|364->334|365->335|365->335|365->335|369->339|369->339|371->341|374->344|374->344|375->345|378->348|378->348|379->349|381->351|381->351|383->353|401->371|401->371|402->372|405->375|405->375|405->375|405->375|406->376|408->378|408->378|409->379|413->383|413->383|414->384|414->384|414->384|415->385|430->400|430->400|430->400|430->400|435->405|435->405|435->405|435->405|436->406|451->421|451->421|451->421|451->421|456->426|456->426|459->429|459->429|459->429|459->429|460->430|475->445|475->445|475->445|475->445|480->450|480->450|483->453|483->453|484->454|488->458|488->458|489->459|489->459|490->460|492->462|492->462|493->463|493->463|495->465|495->465|498->468|498->468|498->468|500->470|504->474|504->474|505->475|505->475|505->475|506->476|508->478|508->478|508->478|523->493|523->493|524->494|524->494|526->496|526->496|526->496|527->497|528->498|528->498|529->499|531->501|531->501|531->501|546->516|546->516|547->517|547->517|549->519|549->519|549->519|550->520|551->521|551->521|552->522|554->524|554->524|554->524|569->539|569->539|570->540|570->540|570->540|570->540|570->540|571->541|571->541|571->541|572->542|574->544|574->544|574->544|589->559|589->559|590->560|590->560|592->562|592->562|592->562|593->563|594->564|594->564|594->564|599->569|599->569|600->570|603->573|603->573|604->574|605->575|605->575|606->576|611->581|611->581|612->582|612->582|613->583|613->583|613->583|614->584|617->587|617->587|618->588|618->588|619->589|619->589|622->592|623->593|623->593|624->594|629->599|629->599|630->600|631->601|631->601|632->602|632->602|632->602|633->603|634->604|634->604|635->605|635->605|635->605|636->606|637->607|637->607|638->608|638->608|638->608|639->609|640->610|640->610|641->611|643->613|643->613|643->613|643->613|643->613|650->620|650->620|651->621|651->621|651->621|652->622|655->625|655->625|656->626|657->627|657->627|658->628|658->628|658->628|659->629|660->630|660->630|661->631|661->631|661->631|662->632|663->633|663->633|664->634|664->634|664->634|665->635|666->636|666->636|667->637|669->639|669->639|669->639|669->639|669->639|677->647|677->647|678->648|678->648|678->648|679->649|680->650|680->650|681->651|682->652|682->652|683->653|683->653|683->653|684->654|685->655|685->655|687->657|689->659|689->659|690->660|690->660|690->660|691->661|692->662|692->662|693->663|693->663|693->663|693->663|693->663|693->663|696->666|696->666|698->668|698->668|699->669|699->669|699->669|700->670|700->670|700->670|701->671|701->671|701->671|701->671|701->671|701->671|704->674|704->674|705->675|705->675|705->675|706->676|706->676|706->676|706->676|706->676|706->676|709->679|709->679|710->680|710->680|711->681|712->682|712->682|713->683|713->683|713->683|713->683|713->683|713->683|716->686|716->686|717->687|728->698|728->698|730->700|732->702|732->702|733->703|736->706|736->706|737->707|737->707|738->708|741->711|741->711|742->712|742->712|743->713|743->713|745->715|747->717|747->717|749->719|754->724|754->724|755->725|756->726|756->726|758->728|758->728|759->729|759->729|759->729|759->729|759->729|759->729|759->729|759->729|761->731|763->733|763->733|764->734|767->737|767->737|769->739|769->739|770->740|772->742|772->742|773->743|774->744|774->744|775->745|775->745|781->751|781->751|782->752|783->753|783->753|784->754|784->754|785->755|785->755|787->757|787->757|787->757|789->759|789->759|789->759|790->760|791->761|791->761|791->761|796->766|796->766|797->767|800->770|800->770|801->771|802->772|802->772|803->773|803->773|803->773|804->774|805->775|805->775|806->776|806->776|807->777|809->779|809->779|810->780|811->781|811->781|814->784|828->798|828->798|829->799|832->802|832->802|832->802|832->802|832->802|833->803|835->805|835->805|836->806|842->812|842->812|843->813|844->814|844->814|845->815|846->816|846->816|847->817|848->818|848->818|850->820|851->821|851->821|852->822|853->823|853->823|855->825|859->829|859->829|860->830|863->833|863->833|865->835|867->837|867->837|868->838|870->840|870->840|871->841|873->843|873->843|874->844|876->846|876->846|877->847|879->849|879->849|880->850|882->852|882->852|883->853|885->855|885->855|886->856|888->858|888->858|889->859|891->861|891->861|892->862|894->864|894->864|898->868|918->888|918->888|918->888|918->888|924->894|924->894|926->896|932->902|933->903|935->905|935->905|935->905|937->907|939->909|939->909|940->910|943->913|943->913|943->913|943->913|943->913|943->913|944->914|944->914|945->915|946->916|946->916|947->917|948->918|948->918|949->919|952->922|952->922|952->922|952->922|952->922|952->922|953->923|953->923|954->924|954->924|954->924|955->925|958->928|958->928|958->928|958->928|958->928|958->928|960->930|960->930|961->931|961->931|962->932|963->933|963->933|964->934|965->935|965->935|966->936|969->939|969->939|969->939|969->939|969->939|969->939|970->940|970->940|971->941|971->941|971->941|972->942|975->945|975->945|975->945|975->945|975->945|975->945|977->947|977->947|978->948|978->948|979->949|980->950|980->950|981->951|982->952|982->952|983->953|986->956|986->956|986->956|986->956|986->956|986->956|987->957|987->957|988->958|988->958|988->958|989->959|992->962|992->962|992->962|992->962|992->962|992->962|994->964|994->964|995->965|995->965|996->966|997->967|997->967|998->968|999->969|999->969|1000->970|1003->973|1003->973|1003->973|1003->973|1003->973|1003->973|1004->974|1004->974|1005->975|1005->975|1005->975|1006->976|1009->979|1009->979|1009->979|1009->979|1009->979|1009->979|1011->981|1011->981|1012->982|1012->982|1013->983|1014->984|1014->984|1015->985|1017->987|1017->987|1018->988|1021->991|1021->991|1021->991|1021->991|1021->991|1021->991|1022->992|1022->992|1023->993|1023->993|1023->993|1024->994|1027->997|1027->997|1027->997|1027->997|1027->997|1027->997|1029->999|1029->999|1030->1000|1030->1000|1032->1002|1034->1004|1043->1013|1043->1013|1044->1014|1044->1014|1045->1015|1047->1017|1047->1017|1048->1018|1048->1018|1049->1019|1049->1019|1055->1025|1055->1025|1057->1027|1057->1027|1057->1027|1058->1028|1074->1044|1074->1044|1075->1045|1076->1046|1076->1046|1076->1046|1076->1046|1077->1047|1078->1048|1078->1048|1079->1049|1098->1068|1098->1068|1103->1073|1103->1073|1105->1075|1107->1077|1107->1077|1108->1078|1109->1079|1109->1079|1111->1081|1111->1081|1111->1081|1112->1082|1114->1084|1114->1084|1116->1086|1116->1086|1117->1087|1118->1088|1118->1088|1119->1089|1119->1089|1120->1090|1120->1090|1120->1090|1121->1091|1122->1092|1124->1094|1124->1094|1124->1094|1126->1096|1128->1098|1128->1098|1129->1099|1132->1102|1132->1102|1132->1102|1132->1102|1132->1102|1132->1102|1133->1103|1133->1103|1134->1104|1134->1104|1134->1104|1135->1105|1138->1108|1138->1108|1139->1109|1142->1112|1142->1112|1142->1112|1142->1112|1142->1112|1142->1112|1143->1113|1143->1113|1144->1114|1144->1114|1144->1114|1145->1115|1148->1118|1148->1118|1148->1118|1148->1118|1148->1118|1148->1118|1150->1120|1150->1120|1151->1121|1151->1121|1160->1130|1162->1132|1165->1135|1165->1135|1167->1137|1167->1137|1167->1137|1168->1138|1170->1140|1170->1140|1171->1141|1172->1142|1172->1142|1172->1142|1175->1145|1175->1145|1175->1145|1176->1146|1176->1146|1176->1146|1177->1147|1177->1147|1177->1147|1178->1148|1178->1148|1178->1148|1183->1153|1183->1153|1183->1153|1191->1161|1192->1162|1192->1162|1192->1162|1192->1162|1195->1165|1195->1165|1195->1165|1218->1188|1218->1188|1218->1188|1218->1188|1288->1258|1289->1259|1306->1276|1306->1276|1306->1276|1308->1278|1308->1278|1308->1278|1310->1280|1310->1280|1310->1280|1315->1285|1315->1285|1315->1285|1338->1308|1341->1311|1351->1321|1351->1321|1351->1321|1352->1322|1352->1322|1352->1322|1353->1323|1353->1323|1353->1323|1391->1361|1391->1361|1391->1361|1392->1362|1392->1362|1392->1362|1394->1364|1397->1367|1397->1367|1397->1367|1397->1367|1397->1367|1397->1367|1399->1369|1399->1369|1399->1369|1400->1370|1403->1373|1403->1373|1403->1373|1403->1373|1403->1373|1403->1373|1405->1375|1407->1377|1410->1380|1481->1451|1482->1452|1483->1453|1484->1454|1489->1459
                  -- GENERATED --
              */
          