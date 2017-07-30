
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


                            """),format.raw/*429.29*/("""}"""),format.raw/*429.30*/("""
                            """),format.raw/*430.29*/("""else """),format.raw/*430.34*/("""{"""),format.raw/*430.35*/("""

                              """),format.raw/*432.31*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*432.60*/("""{"""),format.raw/*432.61*/("""
                                  """),format.raw/*433.35*/("""result = result + "<button " +
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
                            //                                            "data-todo='"""),format.raw/*448.87*/("""{"""),format.raw/*448.88*/("""'id':12,'todo':'xyz'"""),format.raw/*448.108*/("""}"""),format.raw/*448.109*/("""'"+
                                          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                          "  id='todolink'>" + obj.projectStepName +
                                          "</button>";
                            //
                              """),format.raw/*453.31*/("""}"""),format.raw/*453.32*/("""
                              """),format.raw/*454.31*/("""else """),format.raw/*454.36*/("""{"""),format.raw/*454.37*/("""
                                      """),format.raw/*455.39*/("""if(isImplementationPlanningDone||isDesignPlanningDone||isTestingPlanningDone||isRequirementPlanningDone||isProductionPlanningDone)
                                        """),format.raw/*456.41*/("""{"""),format.raw/*456.42*/("""
                                                """),format.raw/*457.49*/("""if(isImplementationPlanningDone && obj.phaseName=="IMPLEMENTATION")
                                                      """),format.raw/*458.55*/("""{"""),format.raw/*458.56*/("""
                                                                    """),format.raw/*459.69*/("""result = result + "<button " +
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
                                                                //                                            "data-todo='"""),format.raw/*474.123*/("""{"""),format.raw/*474.124*/("""'id':12,'todo':'xyz'"""),format.raw/*474.144*/("""}"""),format.raw/*474.145*/("""'"+
                                                                              "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                              "  id='todolink'>" + obj.projectStepName +
                                                                              "</button>";

                                                                """),format.raw/*479.65*/("""}"""),format.raw/*479.66*/("""
                                                      """),format.raw/*480.55*/("""else if(obj.phaseName=="IMPLEMENTATION")"""),format.raw/*480.95*/("""{"""),format.raw/*480.96*/("""
                                                        """),format.raw/*481.57*/("""result = result + "<button disabled" +
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
                                                    //                                            "data-todo='"""),format.raw/*496.111*/("""{"""),format.raw/*496.112*/("""'id':12,'todo':'xyz'"""),format.raw/*496.132*/("""}"""),format.raw/*496.133*/("""'"+
                                                                  "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                  "  id='todolink'>" + obj.projectStepName +
                                                                  "</button>";
                                                      """),format.raw/*500.55*/("""}"""),format.raw/*500.56*/("""


                                                                """),format.raw/*503.65*/("""if(isDesignPlanningDone && obj.phaseName=="DESIGN")
                                                                """),format.raw/*504.65*/("""{"""),format.raw/*504.66*/("""

                                                                      """),format.raw/*506.71*/("""result = result + "<button " +
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
                                                                //                                            "data-todo='"""),format.raw/*521.123*/("""{"""),format.raw/*521.124*/("""'id':12,'todo':'xyz'"""),format.raw/*521.144*/("""}"""),format.raw/*521.145*/("""'"+
                                                                              "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                              "  id='todolink'>" + obj.projectStepName +
                                                                              "</button>";
                                                                //

                                                                """),format.raw/*527.65*/("""}"""),format.raw/*527.66*/("""
                                                                """),format.raw/*528.65*/("""else if(obj.phaseName=="DESIGN")
                                                                """),format.raw/*529.65*/("""{"""),format.raw/*529.66*/("""
                                                                  """),format.raw/*530.67*/("""result = result + "<button disabled" +
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
                                                            //                                            "data-todo='"""),format.raw/*545.119*/("""{"""),format.raw/*545.120*/("""'id':12,'todo':'xyz'"""),format.raw/*545.140*/("""}"""),format.raw/*545.141*/("""'"+
                                                                          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                          "  id='todolink'>" + obj.projectStepName +
                                                                          "</button>";
                                                                """),format.raw/*549.65*/("""}"""),format.raw/*549.66*/("""



                                                                """),format.raw/*553.65*/("""//next one

                                                                if(isTestingPlanningDone && obj.phaseName=="TESTING")
                                                                """),format.raw/*556.65*/("""{"""),format.raw/*556.66*/("""

                                                                      """),format.raw/*558.71*/("""result = result + "<button " +
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
                                                                //                                            "data-todo='"""),format.raw/*573.123*/("""{"""),format.raw/*573.124*/("""'id':12,'todo':'xyz'"""),format.raw/*573.144*/("""}"""),format.raw/*573.145*/("""'"+
                                                                              "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                              "  id='todolink'>" + obj.projectStepName +
                                                                              "</button>";
                                                                //

                                                                """),format.raw/*579.65*/("""}"""),format.raw/*579.66*/("""
                                                                """),format.raw/*580.65*/("""else if(obj.phaseName=="TESTING")
                                                                """),format.raw/*581.65*/("""{"""),format.raw/*581.66*/("""
                                                                  """),format.raw/*582.67*/("""result = result + "<button disabled" +
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
                                                            //                                            "data-todo='"""),format.raw/*597.119*/("""{"""),format.raw/*597.120*/("""'id':12,'todo':'xyz'"""),format.raw/*597.140*/("""}"""),format.raw/*597.141*/("""'"+
                                                                          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                          "  id='todolink'>" + obj.projectStepName +
                                                                          "</button>";
                                                                """),format.raw/*601.65*/("""}"""),format.raw/*601.66*/("""

                                                                """),format.raw/*603.65*/("""if(isRequirementPlanningDone && obj.phaseName=="REQUIREMENTS")
                                                                                """),format.raw/*604.81*/("""{"""),format.raw/*604.82*/("""

                                                                                          """),format.raw/*606.91*/("""result = result + "<button " +
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
                                                                                              //                                            "data-todo='"""),format.raw/*621.153*/("""{"""),format.raw/*621.154*/("""'id':12,'todo':'xyz'"""),format.raw/*621.174*/("""}"""),format.raw/*621.175*/("""'"+
                                                                                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                                                            "  id='todolink'>" + obj.projectStepName +
                                                                                                            "</button>";
                                                                                              //

                                                                              """),format.raw/*627.79*/("""}"""),format.raw/*627.80*/("""
                                                                              """),format.raw/*628.79*/("""else if(obj.phaseName=="REQUIREMENTS")
                                                                              """),format.raw/*629.79*/("""{"""),format.raw/*629.80*/("""
                                                                                """),format.raw/*630.81*/("""result = result + "<button disabled" +
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
                                                                                    //                                            "data-todo='"""),format.raw/*645.143*/("""{"""),format.raw/*645.144*/("""'id':12,'todo':'xyz'"""),format.raw/*645.164*/("""}"""),format.raw/*645.165*/("""'"+
                                                                                                  "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                                                                                  "  id='todolink'>" + obj.projectStepName +
                                                                                                  "</button>";
                                                                              """),format.raw/*649.79*/("""}"""),format.raw/*649.80*/("""
                                                                """),format.raw/*650.65*/("""//next oneTurn


                                                              """),format.raw/*653.63*/("""}"""),format.raw/*653.64*/("""
                                                              """),format.raw/*654.63*/("""else """),format.raw/*654.68*/("""{"""),format.raw/*654.69*/("""



  """),format.raw/*658.3*/("""//This is else part
  result = result + "<button disabled" +
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
  //                                            "data-todo='"""),format.raw/*674.61*/("""{"""),format.raw/*674.62*/("""'id':12,'todo':'xyz'"""),format.raw/*674.82*/("""}"""),format.raw/*674.83*/("""'"+
          "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
          "  id='todolink'>" + obj.projectStepName +
          "</button>";


                                                              """),format.raw/*680.63*/("""}"""),format.raw/*680.64*/("""



                              """),format.raw/*684.31*/("""}"""),format.raw/*684.32*/("""













                            """),format.raw/*698.29*/("""}"""),format.raw/*698.30*/("""














                        """),format.raw/*713.25*/("""}"""),format.raw/*713.26*/("""
"""),format.raw/*714.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*718.21*/("""}"""),format.raw/*718.22*/(""",
                    error: function (data) """),format.raw/*719.44*/("""{"""),format.raw/*719.45*/("""
                        """),format.raw/*720.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*722.21*/("""}"""),format.raw/*722.22*/("""
                """),format.raw/*723.17*/("""}"""),format.raw/*723.18*/(""");

            """),format.raw/*725.13*/("""}"""),format.raw/*725.14*/("""


            """),format.raw/*728.13*/("""function onPerformStep(id)"""),format.raw/*728.39*/("""{"""),format.raw/*728.40*/("""

"""),format.raw/*730.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*734.43*/("""{"""),format.raw/*734.44*/("""
                    """),format.raw/*735.21*/("""var obj = """),format.raw/*735.31*/("""{"""),format.raw/*735.32*/("""
                        """),format.raw/*736.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*738.35*/model/*738.40*/.getGameId),format.raw/*738.50*/(""",
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
                    """),format.raw/*753.21*/("""}"""),format.raw/*753.22*/(""";
                """),format.raw/*754.17*/("""}"""),format.raw/*754.18*/("""

                """),format.raw/*756.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*756.77*/("""{"""),format.raw/*756.78*/("""
"""),format.raw/*757.1*/("""//                    alert(id);
                    var obj = """),format.raw/*758.31*/("""{"""),format.raw/*758.32*/("""
                        """),format.raw/*759.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*761.35*/model/*761.40*/.getGameId),format.raw/*761.50*/(""",
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
                    """),format.raw/*776.21*/("""}"""),format.raw/*776.22*/(""";
                """),format.raw/*777.17*/("""}"""),format.raw/*777.18*/("""

                """),format.raw/*779.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*779.49*/("""{"""),format.raw/*779.50*/("""
"""),format.raw/*780.1*/("""//                    alert(id);
                    var obj = """),format.raw/*781.31*/("""{"""),format.raw/*781.32*/("""
                        """),format.raw/*782.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*784.35*/model/*784.40*/.getGameId),format.raw/*784.50*/(""",
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
                    """),format.raw/*799.21*/("""}"""),format.raw/*799.22*/(""";
                """),format.raw/*800.17*/("""}"""),format.raw/*800.18*/(""" """),format.raw/*800.19*/("""else"""),format.raw/*800.23*/("""{"""),format.raw/*800.24*/("""
                    """),format.raw/*801.21*/("""var obj = """),format.raw/*801.31*/("""{"""),format.raw/*801.32*/("""
                        """),format.raw/*802.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*804.35*/model/*804.40*/.getGameId),format.raw/*804.50*/(""",
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
                    """),format.raw/*819.21*/("""}"""),format.raw/*819.22*/(""";
                """),format.raw/*820.17*/("""}"""),format.raw/*820.18*/("""

                """),format.raw/*822.17*/("""$.ajax("""),format.raw/*822.24*/("""{"""),format.raw/*822.25*/("""
                    """),format.raw/*823.21*/("""type: 'POST',
                    url: '"""),_display_(/*824.28*/routes/*824.34*/.GameController.performStep()),format.raw/*824.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*829.46*/("""{"""),format.raw/*829.47*/("""
                        """),format.raw/*830.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        document.getElementById('prevstep').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*833.50*/("""{"""),format.raw/*833.51*/("""
"""),format.raw/*834.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*835.34*/("""{"""),format.raw/*835.35*/("""
                                        """),format.raw/*836.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*841.37*/("""}"""),format.raw/*841.38*/(""",
                                    function(isConfirm)"""),format.raw/*842.56*/("""{"""),format.raw/*842.57*/("""
                                        """),format.raw/*843.41*/("""if (isConfirm) """),format.raw/*843.56*/("""{"""),format.raw/*843.57*/("""
"""),format.raw/*844.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*847.41*/("""}"""),format.raw/*847.42*/("""
                                    """),format.raw/*848.37*/("""}"""),format.raw/*848.38*/(""");
                        """),format.raw/*849.25*/("""}"""),format.raw/*849.26*/("""


                       """),format.raw/*852.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*853.25*/("""{"""),format.raw/*853.26*/("""
                           """),format.raw/*854.28*/("""// $('#updateactivity').trigger('click');
                           isOOPSCard=true;
                           console.log(isOOPSCard+"   hello am as ");
                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*859.56*/("""{"""),format.raw/*859.57*/("""
                                """),format.raw/*860.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*861.29*/("""}"""),format.raw/*861.30*/("""
                            """),format.raw/*862.29*/("""if(data.oops_points !=0) """),format.raw/*862.54*/("""{"""),format.raw/*862.55*/("""
                                """),format.raw/*863.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*864.29*/("""}"""),format.raw/*864.30*/("""
                            """),format.raw/*865.29*/("""if(data.oops_bonus !=0) """),format.raw/*865.53*/("""{"""),format.raw/*865.54*/("""
                                """),format.raw/*866.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*867.29*/("""}"""),format.raw/*867.30*/("""
                            """),format.raw/*868.29*/("""if(data.oops_budget !=0) """),format.raw/*868.54*/("""{"""),format.raw/*868.55*/("""
                                """),format.raw/*869.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*870.29*/("""}"""),format.raw/*870.30*/("""
                            """),format.raw/*871.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*873.36*/("""{"""),format.raw/*873.37*/("""   """),format.raw/*873.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*873.128*/("""}"""),format.raw/*873.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*880.25*/("""}"""),format.raw/*880.26*/("""
                        """),format.raw/*881.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*881.61*/("""{"""),format.raw/*881.62*/("""
                            """),format.raw/*882.29*/("""isSurpriseCard=true;
                            var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*885.60*/("""{"""),format.raw/*885.61*/("""
                                """),format.raw/*886.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*887.29*/("""}"""),format.raw/*887.30*/("""
                            """),format.raw/*888.29*/("""if(data.surprise_points !=0) """),format.raw/*888.58*/("""{"""),format.raw/*888.59*/("""
                                """),format.raw/*889.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*890.29*/("""}"""),format.raw/*890.30*/("""
                            """),format.raw/*891.29*/("""if(data.surprise_bonus !=0) """),format.raw/*891.57*/("""{"""),format.raw/*891.58*/("""
                                """),format.raw/*892.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*893.29*/("""}"""),format.raw/*893.30*/("""
                            """),format.raw/*894.29*/("""if(data.surprise_budget !=0) """),format.raw/*894.58*/("""{"""),format.raw/*894.59*/("""
                                """),format.raw/*895.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*896.29*/("""}"""),format.raw/*896.30*/("""
                            """),format.raw/*897.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*899.36*/("""{"""),format.raw/*899.37*/("""   """),format.raw/*899.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*899.135*/("""}"""),format.raw/*899.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*907.25*/("""}"""),format.raw/*907.26*/("""
                        """),format.raw/*908.25*/("""else if(data.steptype == "production")"""),format.raw/*908.63*/("""{"""),format.raw/*908.64*/("""
                            """),format.raw/*909.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*910.52*/("""{"""),format.raw/*910.53*/("""
                                """),format.raw/*911.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*912.29*/("""}"""),format.raw/*912.30*/("""
                            """),format.raw/*913.29*/("""else"""),format.raw/*913.33*/("""{"""),format.raw/*913.34*/("""
                                """),format.raw/*914.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*915.29*/("""}"""),format.raw/*915.30*/("""

                            """),format.raw/*917.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*919.25*/("""}"""),format.raw/*919.26*/("""
                        """),format.raw/*920.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*920.61*/("""{"""),format.raw/*920.62*/("""
                          """),format.raw/*921.27*/("""isSkipped=true;
                            if($('#btnIsProduction').val() != "true")"""),format.raw/*922.70*/("""{"""),format.raw/*922.71*/("""
                                """),format.raw/*923.33*/("""//swal("""),format.raw/*923.40*/("""{"""),format.raw/*923.41*/("""   """),format.raw/*923.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*923.118*/("""}"""),format.raw/*923.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*926.29*/("""}"""),format.raw/*926.30*/("""

                        """),format.raw/*928.25*/("""}"""),format.raw/*928.26*/("""
                        """),format.raw/*929.25*/("""else if(data.steptype == "risk")"""),format.raw/*929.57*/("""{"""),format.raw/*929.58*/("""
                            """),format.raw/*930.29*/("""if(data.risk_status == "success")"""),format.raw/*930.62*/("""{"""),format.raw/*930.63*/("""
                                """),format.raw/*931.33*/("""//swal("""),format.raw/*931.40*/("""{"""),format.raw/*931.41*/("""   """),format.raw/*931.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*931.142*/("""}"""),format.raw/*931.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*934.29*/("""}"""),format.raw/*934.30*/("""
                            """),format.raw/*935.29*/("""else"""),format.raw/*935.33*/("""{"""),format.raw/*935.34*/("""
                                """),format.raw/*936.33*/("""//swal("""),format.raw/*936.40*/("""{"""),format.raw/*936.41*/("""   """),format.raw/*936.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*936.127*/("""}"""),format.raw/*936.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*939.29*/("""}"""),format.raw/*939.30*/("""
                        """),format.raw/*940.25*/("""}"""),format.raw/*940.26*/("""
                        """),format.raw/*941.25*/("""else
                        """),format.raw/*942.25*/("""{"""),format.raw/*942.26*/("""
                            """),format.raw/*943.29*/("""//swal("""),format.raw/*943.36*/("""{"""),format.raw/*943.37*/("""   """),format.raw/*943.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*943.134*/("""}"""),format.raw/*943.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*946.25*/("""}"""),format.raw/*946.26*/("""
                        """),format.raw/*947.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*958.91*/("""{"""),format.raw/*958.92*/("""

                            """),format.raw/*960.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*962.25*/("""}"""),format.raw/*962.26*/("""
                    """),format.raw/*963.21*/("""//    refreshProjectSteps();


                    """),format.raw/*966.21*/("""}"""),format.raw/*966.22*/(""",
                    error: function (data) """),format.raw/*967.44*/("""{"""),format.raw/*967.45*/("""
                      """),format.raw/*968.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*971.21*/("""}"""),format.raw/*971.22*/("""
                """),format.raw/*972.17*/("""}"""),format.raw/*972.18*/(""");
            """),format.raw/*973.13*/("""}"""),format.raw/*973.14*/("""

            """),format.raw/*975.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*977.47*/("""{"""),format.raw/*977.48*/("""

                 """),format.raw/*979.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*984.27*/("""{"""),format.raw/*984.28*/("""
                    """),format.raw/*985.21*/("""'phaseId': clicked_id
                """),format.raw/*986.17*/("""}"""),format.raw/*986.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*988.43*/("""{"""),format.raw/*988.44*/("""
                    """),format.raw/*989.21*/("""swal("""),format.raw/*989.26*/("""{"""),format.raw/*989.27*/("""   """),format.raw/*989.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*989.232*/("""}"""),format.raw/*989.233*/(""", function()"""),format.raw/*989.245*/("""{"""),format.raw/*989.246*/("""

               """),format.raw/*991.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*993.74*/("""{"""),format.raw/*993.75*/("""
                            """),format.raw/*994.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*997.25*/("""}"""),format.raw/*997.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*999.61*/("""{"""),format.raw/*999.62*/("""
                            """),format.raw/*1000.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*1002.54*/("""{"""),format.raw/*1002.55*/("""
                                """),format.raw/*1003.33*/("""riskcount++;
                            """),format.raw/*1004.29*/("""}"""),format.raw/*1004.30*/("""
                        """),format.raw/*1005.25*/("""}"""),format.raw/*1005.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*1011.48*/("""{"""),format.raw/*1011.49*/("""
                        """),format.raw/*1012.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*1013.21*/("""}"""),format.raw/*1013.22*/("""
                        """),format.raw/*1014.25*/("""}"""),format.raw/*1014.26*/(""");
                """),format.raw/*1015.17*/("""}"""),format.raw/*1015.18*/("""

                """),format.raw/*1017.17*/("""else """),format.raw/*1017.22*/("""{"""),format.raw/*1017.23*/("""

                    """),format.raw/*1019.21*/("""$.ajax("""),format.raw/*1019.28*/("""{"""),format.raw/*1019.29*/("""
                        """),format.raw/*1020.25*/("""type: 'POST',
                        url: '"""),_display_(/*1021.32*/routes/*1021.38*/.GameController.getProjectSteps()),format.raw/*1021.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*1026.50*/("""{"""),format.raw/*1026.51*/("""
"""),format.raw/*1027.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*1030.63*/("""{"""),format.raw/*1030.64*/("""
                                """),format.raw/*1031.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*1032.61*/("""{"""),format.raw/*1032.62*/("""
                                    """),format.raw/*1033.37*/("""if (obj.status) """),format.raw/*1033.53*/("""{"""),format.raw/*1033.54*/("""
                                        """),format.raw/*1034.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*1035.37*/("""}"""),format.raw/*1035.38*/("""
                                """),format.raw/*1036.33*/("""}"""),format.raw/*1036.34*/("""
"""),format.raw/*1037.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*1039.49*/("""{"""),format.raw/*1039.50*/("""
                                    """),format.raw/*1040.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*1041.33*/("""}"""),format.raw/*1041.34*/("""


                                """),format.raw/*1044.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*1058.91*/("""{"""),format.raw/*1058.92*/("""
                                    """),format.raw/*1059.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*1062.33*/("""}"""),format.raw/*1062.34*/(""" """),format.raw/*1062.35*/("""else """),format.raw/*1062.40*/("""{"""),format.raw/*1062.41*/("""
                                    """),format.raw/*1063.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*1065.33*/("""}"""),format.raw/*1065.34*/("""
"""),format.raw/*1066.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

if(isOOPSCard)
"""),format.raw/*1072.1*/("""{"""),format.raw/*1072.2*/("""
  """),format.raw/*1073.3*/("""isOOPSCard=false;
"""),format.raw/*1074.1*/("""}"""),format.raw/*1074.2*/("""
"""),format.raw/*1075.1*/("""if(isSurpriseCard)
"""),format.raw/*1076.1*/("""{"""),format.raw/*1076.2*/("""
  """),format.raw/*1077.3*/("""isSurpriseCard=false;
"""),format.raw/*1078.1*/("""}"""),format.raw/*1078.2*/("""

"""),format.raw/*1080.1*/("""if(isSkipped)
"""),format.raw/*1081.1*/("""{"""),format.raw/*1081.2*/("""
  """),format.raw/*1082.3*/("""isSkipped=false;
"""),format.raw/*1083.1*/("""}"""),format.raw/*1083.2*/("""

"""),format.raw/*1085.1*/("""if((obj.projectStepId == 'CPSM25' || obj.projectStepId == 'CPSM26' ||obj.projectStepId == 'CPSM27' ||obj.projectStepId == 'CPSM28' ||obj.projectStepId == 'CPSM29' ||obj.projectStepId == 'CPSM30' ||obj.projectStepId == 'CPSM31' ||obj.projectStepId == 'CPSM32' ||obj.projectStepId == 'CPSM33'
  || obj.projectStepId == 'CPSM34' ||obj.projectStepId == 'CPSM35'
   ||obj.projectStepId == 'CPSM36')&&(obj.status == "disabled='true'")
   &&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(c==1))
"""),format.raw/*1089.1*/("""{"""),format.raw/*1089.2*/("""
"""),format.raw/*1090.1*/("""isImplementedBeforeProduction=true;
c=2;
console.log(isImplementedBeforeProduction+" i am inside if condition");
"""),format.raw/*1093.1*/("""}"""),format.raw/*1093.2*/("""

"""),format.raw/*1095.1*/("""if((obj.projectStepId == 'CPSM16')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cr==1))
"""),format.raw/*1097.1*/("""{"""),format.raw/*1097.2*/("""
"""),format.raw/*1098.1*/("""cr=2;
isRequirementPlanningDone=true;
"""),format.raw/*1100.1*/("""}"""),format.raw/*1100.2*/("""
"""),format.raw/*1101.1*/("""if((obj.projectStepId == 'CPSM17')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ct==1))
"""),format.raw/*1103.1*/("""{"""),format.raw/*1103.2*/("""
"""),format.raw/*1104.1*/("""ct=2;
isTestingPlanningDone=true;
"""),format.raw/*1106.1*/("""}"""),format.raw/*1106.2*/("""
"""),format.raw/*1107.1*/("""if((obj.projectStepId == 'CPSM18')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ci==1))
"""),format.raw/*1109.1*/("""{"""),format.raw/*1109.2*/("""
"""),format.raw/*1110.1*/("""ci=2;
isImplementationPlanningDone=true;
"""),format.raw/*1112.1*/("""}"""),format.raw/*1112.2*/("""
"""),format.raw/*1113.1*/("""if((obj.projectStepId == 'CPSM19')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cd==1))
"""),format.raw/*1115.1*/("""{"""),format.raw/*1115.2*/("""
"""),format.raw/*1116.1*/("""cd=2;
isDesignPlanningDone=true;
"""),format.raw/*1118.1*/("""}"""),format.raw/*1118.2*/("""
"""),format.raw/*1119.1*/("""if((obj.projectStepId == 'CPSM20')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cp==1))
"""),format.raw/*1121.1*/("""{"""),format.raw/*1121.2*/("""
"""),format.raw/*1122.1*/("""cp=2;
isProductionPlanningDone=true;
"""),format.raw/*1124.1*/("""}"""),format.raw/*1124.2*/("""



"""),format.raw/*1128.1*/("""isSkipped=true;
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
//                                            "data-todo='"""),format.raw/*1148.59*/("""{"""),format.raw/*1148.60*/("""'id':12,'todo':'xyz'"""),format.raw/*1148.80*/("""}"""),format.raw/*1148.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*1154.29*/("""}"""),format.raw/*1154.30*/("""

"""),format.raw/*1156.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;


                            """),format.raw/*1162.77*/("""
                            """),format.raw/*1163.29*/("""var result="";
                            var count=0;
                        """),_display_(/*1165.26*/for(phases <- model.getPhases()) yield /*1165.58*/ {_display_(Seq[Any](format.raw/*1165.60*/("""

                  """),format.raw/*1167.19*/("""count++;
                  if(count==1)
                  """),format.raw/*1169.19*/("""{"""),format.raw/*1169.20*/("""
                  """),format.raw/*1170.19*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                      "style='background-color: #DB8B00 !important;'" +
                      "onclick='onPhaseClick(id)' " +
                      "id='"""),_display_(/*1173.29*/phases/*1173.35*/.getPhaseId),format.raw/*1173.46*/("""'>"""),_display_(/*1173.49*/phases/*1173.55*/.getPhaseName),format.raw/*1173.68*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                  """),format.raw/*1174.19*/("""}"""),format.raw/*1174.20*/("""
                  """),format.raw/*1175.19*/("""else if(count==2)
                  """),format.raw/*1176.19*/("""{"""),format.raw/*1176.20*/("""
                    """),format.raw/*1177.21*/("""if(isRequirementPlanningDone)
                    """),format.raw/*1178.21*/("""{"""),format.raw/*1178.22*/("""
                      """),format.raw/*1179.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1182.33*/phases/*1182.39*/.getPhaseId),format.raw/*1182.50*/("""'>"""),_display_(/*1182.53*/phases/*1182.59*/.getPhaseName),format.raw/*1182.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1183.21*/("""}"""),format.raw/*1183.22*/("""
                    """),format.raw/*1184.21*/("""else """),format.raw/*1184.26*/("""{"""),format.raw/*1184.27*/("""
                      """),format.raw/*1185.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1188.35*/phases/*1188.41*/.getPhaseId),format.raw/*1188.52*/("""'>"""),_display_(/*1188.55*/phases/*1188.61*/.getPhaseName),format.raw/*1188.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1190.21*/("""}"""),format.raw/*1190.22*/("""
                  """),format.raw/*1191.19*/("""}"""),format.raw/*1191.20*/("""
                  """),format.raw/*1192.19*/("""else if(count==3)
                  """),format.raw/*1193.19*/("""{"""),format.raw/*1193.20*/("""
                    """),format.raw/*1194.21*/("""if(isDesignPlanningDone)
                    """),format.raw/*1195.21*/("""{"""),format.raw/*1195.22*/("""
                      """),format.raw/*1196.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1199.33*/phases/*1199.39*/.getPhaseId),format.raw/*1199.50*/("""'>"""),_display_(/*1199.53*/phases/*1199.59*/.getPhaseName),format.raw/*1199.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1200.21*/("""}"""),format.raw/*1200.22*/("""
                    """),format.raw/*1201.21*/("""else """),format.raw/*1201.26*/("""{"""),format.raw/*1201.27*/("""
                      """),format.raw/*1202.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1205.35*/phases/*1205.41*/.getPhaseId),format.raw/*1205.52*/("""'>"""),_display_(/*1205.55*/phases/*1205.61*/.getPhaseName),format.raw/*1205.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1207.21*/("""}"""),format.raw/*1207.22*/("""
                  """),format.raw/*1208.19*/("""}"""),format.raw/*1208.20*/("""
                  """),format.raw/*1209.19*/("""else if(count==4)
                  """),format.raw/*1210.19*/("""{"""),format.raw/*1210.20*/("""
                    """),format.raw/*1211.21*/("""if(isImplementationPlanningDone)
                    """),format.raw/*1212.21*/("""{"""),format.raw/*1212.22*/("""
                      """),format.raw/*1213.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1216.33*/phases/*1216.39*/.getPhaseId),format.raw/*1216.50*/("""'>"""),_display_(/*1216.53*/phases/*1216.59*/.getPhaseName),format.raw/*1216.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1217.21*/("""}"""),format.raw/*1217.22*/("""
                    """),format.raw/*1218.21*/("""else """),format.raw/*1218.26*/("""{"""),format.raw/*1218.27*/("""
                      """),format.raw/*1219.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1222.35*/phases/*1222.41*/.getPhaseId),format.raw/*1222.52*/("""'>"""),_display_(/*1222.55*/phases/*1222.61*/.getPhaseName),format.raw/*1222.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1224.21*/("""}"""),format.raw/*1224.22*/("""
                  """),format.raw/*1225.19*/("""}"""),format.raw/*1225.20*/("""
                  """),format.raw/*1226.19*/("""else if(count==5)
                  """),format.raw/*1227.19*/("""{"""),format.raw/*1227.20*/("""
                    """),format.raw/*1228.21*/("""if(isTestingPlanningDone)
                    """),format.raw/*1229.21*/("""{"""),format.raw/*1229.22*/("""
                      """),format.raw/*1230.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1233.33*/phases/*1233.39*/.getPhaseId),format.raw/*1233.50*/("""'>"""),_display_(/*1233.53*/phases/*1233.59*/.getPhaseName),format.raw/*1233.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1234.21*/("""}"""),format.raw/*1234.22*/("""
                    """),format.raw/*1235.21*/("""else """),format.raw/*1235.26*/("""{"""),format.raw/*1235.27*/("""
                      """),format.raw/*1236.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1239.35*/phases/*1239.41*/.getPhaseId),format.raw/*1239.52*/("""'>"""),_display_(/*1239.55*/phases/*1239.61*/.getPhaseName),format.raw/*1239.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1241.21*/("""}"""),format.raw/*1241.22*/("""
                  """),format.raw/*1242.19*/("""}"""),format.raw/*1242.20*/("""
                  """),format.raw/*1243.19*/("""else if(count==6)
                  """),format.raw/*1244.19*/("""{"""),format.raw/*1244.20*/("""
                    """),format.raw/*1245.21*/("""console.log(isProductionPlanningDone+" i am is production planning"+isImplementedBeforeProduction+" i am before guy");
                    if(isImplementedBeforeProduction && isProductionPlanningDone)
                    """),format.raw/*1247.21*/("""{"""),format.raw/*1247.22*/("""
                    """),format.raw/*1248.21*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1251.33*/phases/*1251.39*/.getPhaseId),format.raw/*1251.50*/("""'>"""),_display_(/*1251.53*/phases/*1251.59*/.getPhaseName),format.raw/*1251.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1252.21*/("""}"""),format.raw/*1252.22*/("""
                    """),format.raw/*1253.21*/("""else """),format.raw/*1253.26*/("""{"""),format.raw/*1253.27*/("""
                    """),format.raw/*1254.21*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1257.33*/phases/*1257.39*/.getPhaseId),format.raw/*1257.50*/("""'>"""),_display_(/*1257.53*/phases/*1257.59*/.getPhaseName),format.raw/*1257.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1259.21*/("""}"""),format.raw/*1259.22*/("""
                  """),format.raw/*1260.19*/("""}"""),format.raw/*1260.20*/("""

                            """)))}),format.raw/*1262.30*/("""

                            """),format.raw/*1264.29*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
                  //                alert(result);







                        """),format.raw/*1273.25*/("""}"""),format.raw/*1273.26*/(""",
                        error: function (data) """),format.raw/*1274.48*/("""{"""),format.raw/*1274.49*/("""
                            """),format.raw/*1275.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*1277.25*/("""}"""),format.raw/*1277.26*/("""
                    """),format.raw/*1278.21*/("""}"""),format.raw/*1278.22*/(""");
                """),format.raw/*1279.17*/("""}"""),format.raw/*1279.18*/("""





            """),format.raw/*1285.13*/("""}"""),format.raw/*1285.14*/("""

            """),format.raw/*1287.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*1287.67*/("""{"""),format.raw/*1287.68*/("""
"""),format.raw/*1288.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*1304.42*/("""{"""),format.raw/*1304.43*/("""
                    """),format.raw/*1305.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*1306.17*/("""}"""),format.raw/*1306.18*/("""else"""),format.raw/*1306.22*/("""{"""),format.raw/*1306.23*/("""
                    """),format.raw/*1307.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*1308.17*/("""}"""),format.raw/*1308.18*/("""
                """),format.raw/*1309.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*1328.13*/("""}"""),format.raw/*1328.14*/(""");




            function totalGameTimer() """),format.raw/*1333.39*/("""{"""),format.raw/*1333.40*/("""

                """),format.raw/*1335.17*/("""var sec = 0;

                function pad(val) """),format.raw/*1337.35*/("""{"""),format.raw/*1337.36*/("""
                    """),format.raw/*1338.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*1339.17*/("""}"""),format.raw/*1339.18*/("""

                """),format.raw/*1341.17*/("""var timer = setInterval(function () """),format.raw/*1341.53*/("""{"""),format.raw/*1341.54*/("""
                    """),format.raw/*1342.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*1344.17*/("""}"""),format.raw/*1344.18*/(""", 1000);

                setTimeout(function () """),format.raw/*1346.40*/("""{"""),format.raw/*1346.41*/("""
                    """),format.raw/*1347.21*/("""clearInterval(timer);
                """),format.raw/*1348.17*/("""}"""),format.raw/*1348.18*/(""", 50000000);
            """),format.raw/*1349.13*/("""}"""),format.raw/*1349.14*/("""
            """),format.raw/*1350.13*/("""function refreshProjectSteps()"""),format.raw/*1350.43*/("""{"""),format.raw/*1350.44*/("""
                """),format.raw/*1351.65*/("""
                """),format.raw/*1352.17*/("""var result="";
                var count=0;
            """),_display_(/*1354.14*/for(phases <- model.getPhases()) yield /*1354.46*/ {_display_(Seq[Any](format.raw/*1354.48*/("""

"""),format.raw/*1356.1*/("""count++;
if(count<6)
"""),format.raw/*1358.1*/("""{"""),format.raw/*1358.2*/("""
  """),format.raw/*1359.3*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
          "style='background-color: #DB8B00 !important;'" +
          "onclick='onPhaseClick(id)' " +
          "id='"""),_display_(/*1362.17*/phases/*1362.23*/.getPhaseId),format.raw/*1362.34*/("""'>"""),_display_(/*1362.37*/phases/*1362.43*/.getPhaseName),format.raw/*1362.56*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
"""),format.raw/*1363.1*/("""}"""),format.raw/*1363.2*/("""
"""),format.raw/*1364.1*/("""else """),format.raw/*1364.6*/("""{"""),format.raw/*1364.7*/("""
  """),format.raw/*1365.3*/("""console.log(isImplementedBeforeProduction);
  console.log("i am here in");
  if(isImplementedBeforeProduction)
  """),format.raw/*1368.3*/("""{"""),format.raw/*1368.4*/("""
    """),format.raw/*1369.5*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1372.19*/phases/*1372.25*/.getPhaseId),format.raw/*1372.36*/("""'>"""),_display_(/*1372.39*/phases/*1372.45*/.getPhaseName),format.raw/*1372.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
  """),format.raw/*1373.3*/("""}"""),format.raw/*1373.4*/("""
  """),format.raw/*1374.3*/("""else """),format.raw/*1374.8*/("""{"""),format.raw/*1374.9*/("""
    """),format.raw/*1375.5*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1378.19*/phases/*1378.25*/.getPhaseId),format.raw/*1378.36*/("""'>"""),_display_(/*1378.39*/phases/*1378.45*/.getPhaseName),format.raw/*1378.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

  """),format.raw/*1380.3*/("""}"""),format.raw/*1380.4*/("""
"""),format.raw/*1381.1*/("""}"""),format.raw/*1381.2*/("""








                """)))}),format.raw/*1390.18*/("""

                """),format.raw/*1392.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*1395.13*/("""}"""),format.raw/*1395.14*/("""

            """),format.raw/*1397.13*/("""function newfunc()"""),format.raw/*1397.31*/("""{"""),format.raw/*1397.32*/("""
                """),format.raw/*1398.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*1400.13*/("""}"""),format.raw/*1400.14*/("""
    """),format.raw/*1401.5*/("""</script>
    <body style="background-image: url("""),_display_(/*1402.41*/routes/*1402.47*/.Assets.at("images/bg.jpg")),format.raw/*1402.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*1405.68*/model/*1405.73*/.getUserName()),format.raw/*1405.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*1406.64*/model/*1406.69*/.getGameId()),format.raw/*1406.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*1407.60*/model/*1407.65*/.getTurnNo()),format.raw/*1407.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*1408.68*/model/*1408.73*/.getTimeForEachMove()),format.raw/*1408.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*1413.64*/routes/*1413.70*/.DashboardController.viewDashboard()),format.raw/*1413.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*1421.51*/("""
                """),format.raw/*1422.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*1422.95*/model/*1422.100*/.getGameId()),format.raw/*1422.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*1425.44*/model/*1425.49*/.getStepsForEachPlayer()),format.raw/*1425.73*/("""</span>
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
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*1448.126*/model/*1448.131*/.getUserName().split("@")/*1448.156*/(0)),format.raw/*1448.159*/("""!</div>

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
                            """),format.raw/*1518.105*/("""
                        """),format.raw/*1519.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1536.126*/model/*1536.131*/.getBudget()),format.raw/*1536.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1538.141*/model/*1538.146*/.getCapabilityPoints()),format.raw/*1538.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1540.139*/model/*1540.144*/.getCapabilityBonus()),format.raw/*1540.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1545.180*/model/*1545.185*/.getResources),format.raw/*1545.198*/("""</div>
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


                                              """),format.raw/*1568.138*/("""


                                          """),format.raw/*1571.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1581.83*/model/*1581.88*/.getBudget()),format.raw/*1581.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1582.84*/model/*1582.89*/.getCapabilityPoints()),format.raw/*1582.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1583.83*/model/*1583.88*/.getCapabilityBonus()),format.raw/*1583.109*/("""</div>
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


                                    """),_display_(/*1621.38*/for(phase <- model.getPhases()) yield /*1621.69*/ {_display_(Seq[Any](format.raw/*1621.71*/("""
                                        """),_display_(/*1622.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1622.95*/{_display_(Seq[Any](format.raw/*1622.96*/("""

                                            """),format.raw/*1624.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1627.49*/phase/*1627.54*/.getPhaseId),format.raw/*1627.65*/(""">"""),_display_(/*1627.67*/phase/*1627.72*/.getPhaseName()),format.raw/*1627.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1629.42*/else/*1629.46*/{_display_(Seq[Any](format.raw/*1629.47*/("""
                                            """),format.raw/*1630.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1633.49*/phase/*1633.54*/.getPhaseId),format.raw/*1633.65*/(""">"""),_display_(/*1633.67*/phase/*1633.72*/.getPhaseName()),format.raw/*1633.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1635.42*/("""

                                    """)))}),format.raw/*1637.38*/("""


                                """),format.raw/*1640.33*/("""</div>





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
                    """),format.raw/*1711.51*/("""
                    """),format.raw/*1712.55*/("""
                    """),format.raw/*1713.52*/("""
                    """),format.raw/*1714.105*/("""




                    """),format.raw/*1719.21*/("""<div class="panel panel-default" >
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
                  DATE: Sun Jul 30 12:19:07 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: 16fd27e1970f1d3d9da83381c4ff16e8b23bc380
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10995->6752|11025->6753|11072->6771|11132->6802|11162->6803|11204->6816|11298->6881|11328->6882|11375->6900|11446->6942|11476->6943|11518->6956|11610->7019|11640->7020|11686->7037|11770->7092|11800->7093|11850->7114|11919->7155|11935->7161|11987->7191|12238->7413|12268->7414|12297->7415|12576->7665|12606->7666|12665->7696|12979->7981|13009->7982|13038->7983|13271->8187|13301->8188|13334->8192|13364->8193|13426->8226|13505->8276|13535->8277|13596->8309|14682->9366|14712->9367|14774->9400|15014->9611|15044->9612|15077->9616|15107->9617|15169->9650|15299->9751|15329->9752|15358->9753|16999->11365|17029->11366|17083->11391|17233->11512|17263->11513|17337->11558|17367->11559|17421->11584|17542->11676|17572->11677|17618->11694|17648->11695|17693->11711|17723->11712|17766->11726|17851->11782|17881->11783|17924->11797|18443->12287|18473->12288|18523->12309|18678->12435|18708->12436|18741->12440|18771->12441|18821->12462|18922->12534|18952->12535|18998->12552|19848->13373|19878->13374|19950->13417|19980->13418|20009->13419|20251->13632|20281->13633|20325->13648|20504->13798|20534->13799|20563->13800|20688->13896|20718->13897|20768->13918|20826->13947|20856->13948|20902->13965|20938->13972|20968->13973|21018->13994|21087->14035|21103->14041|21161->14077|21372->14259|21402->14260|21457->14286|21646->14446|21676->14447|21734->14476|21865->14578|21895->14579|21957->14612|22089->14715|22119->14716|22149->14718|23389->15929|23419->15930|23481->15963|23721->16174|23751->16175|23784->16179|23814->16180|23876->16213|24006->16314|24036->16315|24065->16316|24427->16649|24457->16650|24519->16683|24577->16712|24607->16713|24673->16750|26162->18210|26192->18211|26241->18231|26271->18232|26625->18557|26655->18558|26688->18562|26718->18563|26784->18600|28281->20068|28311->20069|28360->20089|28390->20090|28744->20415|28774->20416|28834->20447|28864->20448|28922->20477|28956->20482|28986->20483|29047->20515|29105->20544|29135->20545|29199->20580|30688->22040|30718->22041|30768->22061|30799->22062|31173->22407|31203->22408|31263->22439|31297->22444|31327->22445|31395->22484|31595->22655|31625->22656|31703->22705|31854->22827|31884->22828|31982->22897|34012->24897|34043->24898|34093->24918|34124->24919|34610->25376|34640->25377|34724->25432|34793->25472|34823->25473|34909->25530|36767->27358|36798->27359|36848->27379|36879->27380|37318->27790|37348->27791|37444->27858|37589->27974|37619->27975|37720->28047|39750->30047|39781->30048|39831->30068|39862->30069|40415->30593|40445->30594|40539->30659|40665->30756|40695->30757|40791->30824|42769->32772|42800->32773|42850->32793|42881->32794|43354->33238|43384->33239|43481->33307|43704->33501|43734->33502|43835->33574|45865->35574|45896->35575|45946->35595|45977->35596|46530->36120|46560->36121|46654->36186|46781->36284|46811->36285|46907->36352|48885->38300|48916->38301|48966->38321|48997->38322|49470->38766|49500->38767|49595->38833|49767->38976|49797->38977|49918->39069|52362->41483|52393->41484|52443->41504|52474->41505|53161->42163|53191->42164|53299->42243|53445->42360|53475->42361|53585->42442|55887->44714|55918->44715|55968->44735|55999->44736|56558->45266|56588->45267|56682->45332|56790->45411|56820->45412|56912->45475|56946->45480|56976->45481|57010->45487|58055->46503|58085->46504|58134->46524|58164->46525|58445->46777|58475->46778|58538->46812|58568->46813|58639->46855|58669->46856|58737->46895|58767->46896|58796->46897|59108->47180|59138->47181|59212->47226|59242->47227|59296->47252|59431->47358|59461->47359|59507->47376|59537->47377|59582->47393|59612->47394|59656->47409|59711->47435|59741->47436|59771->47438|60134->47772|60164->47773|60214->47794|60253->47804|60283->47805|60337->47830|60456->47921|60471->47926|60503->47936|61524->48928|61554->48929|61601->48947|61631->48948|61678->48966|61767->49026|61797->49027|61826->49028|61918->49091|61948->49092|62002->49117|62121->49208|62136->49213|62168->49223|63186->50212|63216->50213|63263->50231|63293->50232|63340->50250|63401->50282|63431->50283|63460->50284|63552->50347|63582->50348|63636->50373|63751->50460|63766->50465|63798->50475|64821->51469|64851->51470|64898->51488|64928->51489|64958->51490|64991->51494|65021->51495|65071->51516|65110->51526|65140->51527|65194->51552|65309->51639|65324->51644|65356->51654|66369->52638|66399->52639|66446->52657|66476->52658|66523->52676|66559->52683|66589->52684|66639->52705|66708->52746|66724->52752|66775->52781|67037->53014|67067->53015|67121->53040|67398->53288|67428->53289|67457->53290|67571->53375|67601->53376|67671->53417|68044->53761|68074->53762|68160->53819|68190->53820|68260->53861|68304->53876|68334->53877|68363->53878|68571->54057|68601->54058|68667->54095|68697->54096|68753->54123|68783->54124|68838->54150|68924->54207|68954->54208|69011->54236|69308->54504|69338->54505|69400->54538|69515->54624|69545->54625|69603->54654|69657->54679|69687->54680|69749->54713|69871->54806|69901->54807|69959->54836|70012->54860|70042->54861|70104->54894|70224->54985|70254->54986|70312->55015|70366->55040|70396->55041|70458->55074|70570->55157|70600->55158|70658->55187|70778->55278|70808->55279|70840->55282|70958->55370|70989->55371|71522->55875|71552->55876|71606->55901|71671->55937|71701->55938|71759->55967|71927->56106|71957->56107|72019->56140|72138->56230|72168->56231|72226->56260|72284->56289|72314->56290|72376->56323|72502->56420|72532->56421|72590->56450|72647->56478|72677->56479|72739->56512|72863->56607|72893->56608|72951->56637|73009->56666|73039->56667|73101->56700|73217->56787|73247->56788|73305->56817|73425->56908|73455->56909|73487->56912|73612->57007|73643->57008|74247->57583|74277->57584|74331->57609|74398->57647|74428->57648|74486->57677|74585->57747|74615->57748|74677->57781|74846->57921|74876->57922|74934->57951|74967->57955|74997->57956|75059->57989|75223->58124|75253->58125|75312->58155|75477->58291|75507->58292|75561->58317|75626->58353|75656->58354|75712->58381|75826->58466|75856->58467|75918->58500|75954->58507|75984->58508|76016->58511|76120->58585|76151->58586|76360->58766|76390->58767|76445->58793|76475->58794|76529->58819|76590->58851|76620->58852|76678->58881|76740->58914|76770->58915|76832->58948|76868->58955|76898->58956|76930->58959|77058->59057|77089->59058|77304->59244|77334->59245|77392->59274|77425->59278|77455->59279|77517->59312|77553->59319|77583->59320|77615->59323|77728->59406|77759->59407|77974->59593|78004->59594|78058->59619|78088->59620|78142->59645|78200->59674|78230->59675|78288->59704|78324->59711|78354->59712|78386->59715|78510->59809|78541->59810|78749->59989|78779->59990|78833->60015|79684->60837|79714->60838|79773->60868|79910->60976|79940->60977|79990->60998|80070->61049|80100->61050|80174->61095|80204->61096|80256->61119|80442->61276|80472->61277|80518->61294|80548->61295|80592->61310|80622->61311|80665->61325|80800->61431|80830->61432|80878->61451|81122->61666|81152->61667|81202->61688|81269->61726|81299->61727|81373->61772|81403->61773|81453->61794|81487->61799|81517->61800|81549->61803|81781->62005|81812->62006|81854->62018|81885->62019|81931->62036|82176->62252|82206->62253|82264->62282|82366->62355|82396->62356|82533->62464|82563->62465|82622->62494|82752->62594|82783->62595|82846->62628|82917->62669|82948->62670|83003->62695|83034->62696|83390->63022|83421->63023|83476->63048|83631->63173|83662->63174|83717->63199|83748->63200|83797->63219|83828->63220|83876->63238|83911->63243|83942->63244|83994->63266|84031->63273|84062->63274|84117->63299|84191->63344|84208->63350|84264->63383|84554->63643|84585->63644|84615->63645|84871->63871|84902->63872|84965->63905|85074->63984|85105->63985|85172->64022|85218->64038|85249->64039|85320->64080|85409->64139|85440->64140|85503->64173|85534->64174|85564->64175|85739->64320|85770->64321|85837->64358|85930->64421|85961->64422|86026->64457|87171->65572|87202->65573|87269->65610|87522->65833|87553->65834|87584->65835|87619->65840|87650->65841|87717->65878|87860->65991|87891->65992|87921->65993|88255->66298|88285->66299|88317->66302|88364->66320|88394->66321|88424->66322|88472->66341|88502->66342|88534->66345|88585->66367|88615->66368|88646->66370|88689->66384|88719->66385|88751->66388|88797->66405|88827->66406|88858->66408|89377->66898|89407->66899|89437->66900|89579->67013|89609->67014|89640->67016|89798->67145|89828->67146|89858->67147|89925->67185|89955->67186|89985->67187|90143->67316|90173->67317|90203->67318|90266->67352|90296->67353|90326->67354|90484->67483|90514->67484|90544->67485|90614->67526|90644->67527|90674->67528|90832->67657|90862->67658|90892->67659|90954->67692|90984->67693|91014->67694|91172->67823|91202->67824|91232->67825|91298->67862|91328->67863|91361->67867|92892->69368|92923->69369|92973->69389|93004->69390|93504->69860|93535->69861|93566->69863|93916->70231|93975->70260|94085->70341|94135->70373|94177->70375|94227->70395|94315->70453|94346->70454|94395->70473|94641->70690|94658->70696|94692->70707|94724->70710|94741->70716|94777->70729|94888->70810|94919->70811|94968->70830|95034->70866|95065->70867|95116->70888|95196->70938|95227->70939|95280->70962|95538->71191|95555->71197|95589->71208|95621->71211|95638->71217|95674->71230|95787->71313|95818->71314|95869->71335|95904->71340|95935->71341|95988->71364|96268->71615|96285->71621|96319->71632|96351->71635|96368->71641|96404->71654|96518->71738|96549->71739|96598->71758|96629->71759|96678->71778|96744->71814|96775->71815|96826->71836|96901->71881|96932->71882|96985->71905|97243->72134|97260->72140|97294->72151|97326->72154|97343->72160|97379->72173|97492->72256|97523->72257|97574->72278|97609->72283|97640->72284|97693->72307|97973->72558|97990->72564|98024->72575|98056->72578|98073->72584|98109->72597|98223->72681|98254->72682|98303->72701|98334->72702|98383->72721|98449->72757|98480->72758|98531->72779|98614->72832|98645->72833|98698->72856|98956->73085|98973->73091|99007->73102|99039->73105|99056->73111|99092->73124|99205->73207|99236->73208|99287->73229|99322->73234|99353->73235|99406->73258|99686->73509|99703->73515|99737->73526|99769->73529|99786->73535|99822->73548|99936->73632|99967->73633|100016->73652|100047->73653|100096->73672|100162->73708|100193->73709|100244->73730|100320->73776|100351->73777|100404->73800|100662->74029|100679->74035|100713->74046|100745->74049|100762->74055|100798->74068|100911->74151|100942->74152|100993->74173|101028->74178|101059->74179|101112->74202|101392->74453|101409->74459|101443->74470|101475->74473|101492->74479|101528->74492|101642->74576|101673->74577|101722->74596|101753->74597|101802->74616|101868->74652|101899->74653|101950->74674|102201->74895|102232->74896|102283->74917|102541->75146|102558->75152|102592->75163|102624->75166|102641->75172|102677->75185|102790->75268|102821->75269|102872->75290|102907->75295|102938->75296|102989->75317|103263->75562|103280->75568|103314->75579|103346->75582|103363->75588|103399->75601|103513->75685|103544->75686|103593->75705|103624->75706|103688->75737|103748->75767|103926->75915|103957->75916|104036->75965|104067->75966|104126->75995|104256->76095|104287->76096|104338->76117|104369->76118|104418->76137|104449->76138|104497->76156|104528->76157|104572->76171|104656->76225|104687->76226|104717->76227|105661->77141|105692->77142|105743->77163|105900->77290|105931->77291|105965->77295|105996->77296|106047->77317|106145->77385|106176->77386|106223->77403|107312->78462|107343->78463|107418->78508|107449->78509|107497->78527|107575->78575|107606->78576|107657->78597|107737->78647|107768->78648|107816->78666|107882->78702|107913->78703|107964->78724|108170->78900|108201->78901|108280->78950|108311->78951|108362->78972|108430->79010|108461->79011|108516->79036|108547->79037|108590->79050|108650->79080|108681->79081|108728->79146|108775->79163|108861->79220|108911->79252|108953->79254|108984->79256|109034->79277|109064->79278|109096->79281|109306->79462|109323->79468|109357->79479|109389->79482|109406->79488|109442->79501|109534->79564|109564->79565|109594->79566|109628->79571|109658->79572|109690->79575|109832->79688|109862->79689|109896->79694|110112->79881|110129->79887|110163->79898|110195->79901|110212->79907|110248->79920|110342->79985|110372->79986|110404->79989|110438->79994|110468->79995|110502->80000|110734->80203|110751->80209|110785->80220|110817->80223|110834->80229|110870->80242|110965->80308|110995->80309|111025->80310|111055->80311|111114->80337|111162->80355|111304->80467|111335->80468|111379->80482|111427->80500|111458->80501|111505->80518|111587->80570|111618->80571|111652->80576|111731->80626|111748->80632|111798->80659|112053->80885|112069->80890|112106->80904|112202->80971|112218->80976|112253->80988|112345->81051|112361->81056|112396->81068|112496->81139|112512->81144|112556->81165|112786->81366|112803->81372|112863->81408|113121->81670|113168->81687|113275->81765|113292->81770|113328->81782|113520->81945|113536->81950|113583->81974|115136->83497|115153->83502|115190->83527|115217->83530|118176->86534|118231->86559|118900->87198|118917->87203|118953->87215|119187->87419|119204->87424|119250->87446|119482->87648|119499->87653|119544->87674|119980->88080|119997->88085|120034->88098|121156->89280|121231->89325|122099->90164|122115->90169|122151->90181|122270->90271|122286->90276|122332->90298|122450->90387|122466->90392|122511->90413|124823->92696|124872->92727|124914->92729|124985->92771|125049->92824|125090->92825|125166->92871|125446->93122|125462->93127|125496->93138|125527->93140|125543->93145|125581->93160|125749->93307|125764->93311|125805->93312|125880->93357|126175->93623|126191->93628|126225->93639|126256->93641|126272->93646|126310->93661|126490->93808|126562->93847|126627->93882|129553->96808|129604->96863|129655->96915|129707->97020|129762->97045
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|208->178|208->178|210->180|211->181|211->181|212->182|214->184|214->184|216->186|217->187|217->187|218->188|219->189|219->189|220->190|221->191|221->191|222->192|223->193|223->193|223->193|228->198|228->198|229->199|233->203|233->203|235->205|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|246->216|246->216|250->220|264->234|264->234|265->235|268->238|268->238|268->238|268->238|269->239|271->241|271->241|272->242|296->266|296->266|297->267|299->269|299->269|300->270|300->270|301->271|303->273|303->273|304->274|304->274|306->276|306->276|308->278|308->278|308->278|309->279|319->289|319->289|320->290|321->291|321->291|321->291|321->291|322->292|323->293|323->293|324->294|341->311|341->311|343->313|343->313|344->314|350->320|350->320|353->323|357->327|357->327|358->328|360->330|360->330|361->331|362->332|362->332|363->333|363->333|363->333|364->334|365->335|365->335|365->335|369->339|369->339|371->341|374->344|374->344|375->345|378->348|378->348|379->349|381->351|381->351|383->353|401->371|401->371|402->372|405->375|405->375|405->375|405->375|406->376|408->378|408->378|409->379|413->383|413->383|414->384|414->384|414->384|415->385|430->400|430->400|430->400|430->400|435->405|435->405|435->405|435->405|436->406|451->421|451->421|451->421|451->421|456->426|456->426|459->429|459->429|460->430|460->430|460->430|462->432|462->432|462->432|463->433|478->448|478->448|478->448|478->448|483->453|483->453|484->454|484->454|484->454|485->455|486->456|486->456|487->457|488->458|488->458|489->459|504->474|504->474|504->474|504->474|509->479|509->479|510->480|510->480|510->480|511->481|526->496|526->496|526->496|526->496|530->500|530->500|533->503|534->504|534->504|536->506|551->521|551->521|551->521|551->521|557->527|557->527|558->528|559->529|559->529|560->530|575->545|575->545|575->545|575->545|579->549|579->549|583->553|586->556|586->556|588->558|603->573|603->573|603->573|603->573|609->579|609->579|610->580|611->581|611->581|612->582|627->597|627->597|627->597|627->597|631->601|631->601|633->603|634->604|634->604|636->606|651->621|651->621|651->621|651->621|657->627|657->627|658->628|659->629|659->629|660->630|675->645|675->645|675->645|675->645|679->649|679->649|680->650|683->653|683->653|684->654|684->654|684->654|688->658|704->674|704->674|704->674|704->674|710->680|710->680|714->684|714->684|728->698|728->698|743->713|743->713|744->714|748->718|748->718|749->719|749->719|750->720|752->722|752->722|753->723|753->723|755->725|755->725|758->728|758->728|758->728|760->730|764->734|764->734|765->735|765->735|765->735|766->736|768->738|768->738|768->738|783->753|783->753|784->754|784->754|786->756|786->756|786->756|787->757|788->758|788->758|789->759|791->761|791->761|791->761|806->776|806->776|807->777|807->777|809->779|809->779|809->779|810->780|811->781|811->781|812->782|814->784|814->784|814->784|829->799|829->799|830->800|830->800|830->800|830->800|830->800|831->801|831->801|831->801|832->802|834->804|834->804|834->804|849->819|849->819|850->820|850->820|852->822|852->822|852->822|853->823|854->824|854->824|854->824|859->829|859->829|860->830|863->833|863->833|864->834|865->835|865->835|866->836|871->841|871->841|872->842|872->842|873->843|873->843|873->843|874->844|877->847|877->847|878->848|878->848|879->849|879->849|882->852|883->853|883->853|884->854|889->859|889->859|890->860|891->861|891->861|892->862|892->862|892->862|893->863|894->864|894->864|895->865|895->865|895->865|896->866|897->867|897->867|898->868|898->868|898->868|899->869|900->870|900->870|901->871|903->873|903->873|903->873|903->873|903->873|910->880|910->880|911->881|911->881|911->881|912->882|915->885|915->885|916->886|917->887|917->887|918->888|918->888|918->888|919->889|920->890|920->890|921->891|921->891|921->891|922->892|923->893|923->893|924->894|924->894|924->894|925->895|926->896|926->896|927->897|929->899|929->899|929->899|929->899|929->899|937->907|937->907|938->908|938->908|938->908|939->909|940->910|940->910|941->911|942->912|942->912|943->913|943->913|943->913|944->914|945->915|945->915|947->917|949->919|949->919|950->920|950->920|950->920|951->921|952->922|952->922|953->923|953->923|953->923|953->923|953->923|953->923|956->926|956->926|958->928|958->928|959->929|959->929|959->929|960->930|960->930|960->930|961->931|961->931|961->931|961->931|961->931|961->931|964->934|964->934|965->935|965->935|965->935|966->936|966->936|966->936|966->936|966->936|966->936|969->939|969->939|970->940|970->940|971->941|972->942|972->942|973->943|973->943|973->943|973->943|973->943|973->943|976->946|976->946|977->947|988->958|988->958|990->960|992->962|992->962|993->963|996->966|996->966|997->967|997->967|998->968|1001->971|1001->971|1002->972|1002->972|1003->973|1003->973|1005->975|1007->977|1007->977|1009->979|1014->984|1014->984|1015->985|1016->986|1016->986|1018->988|1018->988|1019->989|1019->989|1019->989|1019->989|1019->989|1019->989|1019->989|1019->989|1021->991|1023->993|1023->993|1024->994|1027->997|1027->997|1029->999|1029->999|1030->1000|1032->1002|1032->1002|1033->1003|1034->1004|1034->1004|1035->1005|1035->1005|1041->1011|1041->1011|1042->1012|1043->1013|1043->1013|1044->1014|1044->1014|1045->1015|1045->1015|1047->1017|1047->1017|1047->1017|1049->1019|1049->1019|1049->1019|1050->1020|1051->1021|1051->1021|1051->1021|1056->1026|1056->1026|1057->1027|1060->1030|1060->1030|1061->1031|1062->1032|1062->1032|1063->1033|1063->1033|1063->1033|1064->1034|1065->1035|1065->1035|1066->1036|1066->1036|1067->1037|1069->1039|1069->1039|1070->1040|1071->1041|1071->1041|1074->1044|1088->1058|1088->1058|1089->1059|1092->1062|1092->1062|1092->1062|1092->1062|1092->1062|1093->1063|1095->1065|1095->1065|1096->1066|1102->1072|1102->1072|1103->1073|1104->1074|1104->1074|1105->1075|1106->1076|1106->1076|1107->1077|1108->1078|1108->1078|1110->1080|1111->1081|1111->1081|1112->1082|1113->1083|1113->1083|1115->1085|1119->1089|1119->1089|1120->1090|1123->1093|1123->1093|1125->1095|1127->1097|1127->1097|1128->1098|1130->1100|1130->1100|1131->1101|1133->1103|1133->1103|1134->1104|1136->1106|1136->1106|1137->1107|1139->1109|1139->1109|1140->1110|1142->1112|1142->1112|1143->1113|1145->1115|1145->1115|1146->1116|1148->1118|1148->1118|1149->1119|1151->1121|1151->1121|1152->1122|1154->1124|1154->1124|1158->1128|1178->1148|1178->1148|1178->1148|1178->1148|1184->1154|1184->1154|1186->1156|1192->1162|1193->1163|1195->1165|1195->1165|1195->1165|1197->1167|1199->1169|1199->1169|1200->1170|1203->1173|1203->1173|1203->1173|1203->1173|1203->1173|1203->1173|1204->1174|1204->1174|1205->1175|1206->1176|1206->1176|1207->1177|1208->1178|1208->1178|1209->1179|1212->1182|1212->1182|1212->1182|1212->1182|1212->1182|1212->1182|1213->1183|1213->1183|1214->1184|1214->1184|1214->1184|1215->1185|1218->1188|1218->1188|1218->1188|1218->1188|1218->1188|1218->1188|1220->1190|1220->1190|1221->1191|1221->1191|1222->1192|1223->1193|1223->1193|1224->1194|1225->1195|1225->1195|1226->1196|1229->1199|1229->1199|1229->1199|1229->1199|1229->1199|1229->1199|1230->1200|1230->1200|1231->1201|1231->1201|1231->1201|1232->1202|1235->1205|1235->1205|1235->1205|1235->1205|1235->1205|1235->1205|1237->1207|1237->1207|1238->1208|1238->1208|1239->1209|1240->1210|1240->1210|1241->1211|1242->1212|1242->1212|1243->1213|1246->1216|1246->1216|1246->1216|1246->1216|1246->1216|1246->1216|1247->1217|1247->1217|1248->1218|1248->1218|1248->1218|1249->1219|1252->1222|1252->1222|1252->1222|1252->1222|1252->1222|1252->1222|1254->1224|1254->1224|1255->1225|1255->1225|1256->1226|1257->1227|1257->1227|1258->1228|1259->1229|1259->1229|1260->1230|1263->1233|1263->1233|1263->1233|1263->1233|1263->1233|1263->1233|1264->1234|1264->1234|1265->1235|1265->1235|1265->1235|1266->1236|1269->1239|1269->1239|1269->1239|1269->1239|1269->1239|1269->1239|1271->1241|1271->1241|1272->1242|1272->1242|1273->1243|1274->1244|1274->1244|1275->1245|1277->1247|1277->1247|1278->1248|1281->1251|1281->1251|1281->1251|1281->1251|1281->1251|1281->1251|1282->1252|1282->1252|1283->1253|1283->1253|1283->1253|1284->1254|1287->1257|1287->1257|1287->1257|1287->1257|1287->1257|1287->1257|1289->1259|1289->1259|1290->1260|1290->1260|1292->1262|1294->1264|1303->1273|1303->1273|1304->1274|1304->1274|1305->1275|1307->1277|1307->1277|1308->1278|1308->1278|1309->1279|1309->1279|1315->1285|1315->1285|1317->1287|1317->1287|1317->1287|1318->1288|1334->1304|1334->1304|1335->1305|1336->1306|1336->1306|1336->1306|1336->1306|1337->1307|1338->1308|1338->1308|1339->1309|1358->1328|1358->1328|1363->1333|1363->1333|1365->1335|1367->1337|1367->1337|1368->1338|1369->1339|1369->1339|1371->1341|1371->1341|1371->1341|1372->1342|1374->1344|1374->1344|1376->1346|1376->1346|1377->1347|1378->1348|1378->1348|1379->1349|1379->1349|1380->1350|1380->1350|1380->1350|1381->1351|1382->1352|1384->1354|1384->1354|1384->1354|1386->1356|1388->1358|1388->1358|1389->1359|1392->1362|1392->1362|1392->1362|1392->1362|1392->1362|1392->1362|1393->1363|1393->1363|1394->1364|1394->1364|1394->1364|1395->1365|1398->1368|1398->1368|1399->1369|1402->1372|1402->1372|1402->1372|1402->1372|1402->1372|1402->1372|1403->1373|1403->1373|1404->1374|1404->1374|1404->1374|1405->1375|1408->1378|1408->1378|1408->1378|1408->1378|1408->1378|1408->1378|1410->1380|1410->1380|1411->1381|1411->1381|1420->1390|1422->1392|1425->1395|1425->1395|1427->1397|1427->1397|1427->1397|1428->1398|1430->1400|1430->1400|1431->1401|1432->1402|1432->1402|1432->1402|1435->1405|1435->1405|1435->1405|1436->1406|1436->1406|1436->1406|1437->1407|1437->1407|1437->1407|1438->1408|1438->1408|1438->1408|1443->1413|1443->1413|1443->1413|1451->1421|1452->1422|1452->1422|1452->1422|1452->1422|1455->1425|1455->1425|1455->1425|1478->1448|1478->1448|1478->1448|1478->1448|1548->1518|1549->1519|1566->1536|1566->1536|1566->1536|1568->1538|1568->1538|1568->1538|1570->1540|1570->1540|1570->1540|1575->1545|1575->1545|1575->1545|1598->1568|1601->1571|1611->1581|1611->1581|1611->1581|1612->1582|1612->1582|1612->1582|1613->1583|1613->1583|1613->1583|1651->1621|1651->1621|1651->1621|1652->1622|1652->1622|1652->1622|1654->1624|1657->1627|1657->1627|1657->1627|1657->1627|1657->1627|1657->1627|1659->1629|1659->1629|1659->1629|1660->1630|1663->1633|1663->1633|1663->1633|1663->1633|1663->1633|1663->1633|1665->1635|1667->1637|1670->1640|1741->1711|1742->1712|1743->1713|1744->1714|1749->1719
                  -- GENERATED --
              */
          