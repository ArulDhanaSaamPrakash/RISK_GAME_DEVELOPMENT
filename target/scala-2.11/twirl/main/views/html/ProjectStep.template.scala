
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

                           console.log(data.oops_resource);

                           console.log(document.getElementById('budgetremaining').innerHTML);


                            if(data.oops_resource !=0) """),format.raw/*864.56*/("""{"""),format.raw/*864.57*/("""
                                """),format.raw/*865.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*866.29*/("""}"""),format.raw/*866.30*/("""
                            """),format.raw/*867.29*/("""if(data.oops_points !=0) """),format.raw/*867.54*/("""{"""),format.raw/*867.55*/("""
                                """),format.raw/*868.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*869.29*/("""}"""),format.raw/*869.30*/("""
                            """),format.raw/*870.29*/("""if(data.oops_bonus !=0) """),format.raw/*870.53*/("""{"""),format.raw/*870.54*/("""
                                """),format.raw/*871.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*872.29*/("""}"""),format.raw/*872.30*/("""
                            
                            """),format.raw/*874.29*/("""if(data.oops_budget !=0) """),format.raw/*874.54*/("""{"""),format.raw/*874.55*/("""
                                """),format.raw/*875.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*876.29*/("""}"""),format.raw/*876.30*/("""

                            
                            """),format.raw/*879.29*/("""if(data.oops_resource ==0 && data.oops_points ==0 && data.oops_bonus ==0 && data.oops_budget ==0)
                            """),format.raw/*880.29*/("""{"""),format.raw/*880.30*/("""
                            	"""),format.raw/*881.30*/("""alertmsg="But the problem has been avoided since you mitigated a RISK!.    ";
                            """),format.raw/*882.29*/("""}"""),format.raw/*882.30*/("""


                            """),format.raw/*885.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);


                            



                           // swal("""),format.raw/*892.36*/("""{"""),format.raw/*892.37*/("""   """),format.raw/*892.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*892.128*/("""}"""),format.raw/*892.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*899.25*/("""}"""),format.raw/*899.26*/("""
                        """),format.raw/*900.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*900.61*/("""{"""),format.raw/*900.62*/("""
                            """),format.raw/*901.29*/("""isSurpriseCard=true;
                            var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*904.60*/("""{"""),format.raw/*904.61*/("""
                                """),format.raw/*905.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*906.29*/("""}"""),format.raw/*906.30*/("""
                            """),format.raw/*907.29*/("""if(data.surprise_points !=0) """),format.raw/*907.58*/("""{"""),format.raw/*907.59*/("""
                                """),format.raw/*908.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*909.29*/("""}"""),format.raw/*909.30*/("""
                            """),format.raw/*910.29*/("""if(data.surprise_bonus !=0) """),format.raw/*910.57*/("""{"""),format.raw/*910.58*/("""
                                """),format.raw/*911.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*912.29*/("""}"""),format.raw/*912.30*/("""
                            """),format.raw/*913.29*/("""if(data.surprise_budget !=0) """),format.raw/*913.58*/("""{"""),format.raw/*913.59*/("""
                                """),format.raw/*914.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*915.29*/("""}"""),format.raw/*915.30*/("""

                            """),format.raw/*917.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*919.36*/("""{"""),format.raw/*919.37*/("""   """),format.raw/*919.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*919.135*/("""}"""),format.raw/*919.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*927.25*/("""}"""),format.raw/*927.26*/("""
                        """),format.raw/*928.25*/("""else if(data.steptype == "production")"""),format.raw/*928.63*/("""{"""),format.raw/*928.64*/("""
                            """),format.raw/*929.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*930.52*/("""{"""),format.raw/*930.53*/("""
                                """),format.raw/*931.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*932.29*/("""}"""),format.raw/*932.30*/("""
                            """),format.raw/*933.29*/("""else"""),format.raw/*933.33*/("""{"""),format.raw/*933.34*/("""
                                """),format.raw/*934.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*935.29*/("""}"""),format.raw/*935.30*/("""

                            """),format.raw/*937.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*939.25*/("""}"""),format.raw/*939.26*/("""
                        """),format.raw/*940.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*940.61*/("""{"""),format.raw/*940.62*/("""
                          """),format.raw/*941.27*/("""isSkipped=true;
                            if($('#btnIsProduction').val() != "true")"""),format.raw/*942.70*/("""{"""),format.raw/*942.71*/("""
                                """),format.raw/*943.33*/("""//swal("""),format.raw/*943.40*/("""{"""),format.raw/*943.41*/("""   """),format.raw/*943.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*943.118*/("""}"""),format.raw/*943.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*946.29*/("""}"""),format.raw/*946.30*/("""

                        """),format.raw/*948.25*/("""}"""),format.raw/*948.26*/("""
                        """),format.raw/*949.25*/("""else if(data.steptype == "risk")"""),format.raw/*949.57*/("""{"""),format.raw/*949.58*/("""
                            """),format.raw/*950.29*/("""if(data.risk_status == "success")"""),format.raw/*950.62*/("""{"""),format.raw/*950.63*/("""
                                """),format.raw/*951.33*/("""//swal("""),format.raw/*951.40*/("""{"""),format.raw/*951.41*/("""   """),format.raw/*951.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*951.142*/("""}"""),format.raw/*951.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*954.29*/("""}"""),format.raw/*954.30*/("""
                            """),format.raw/*955.29*/("""else"""),format.raw/*955.33*/("""{"""),format.raw/*955.34*/("""
                                """),format.raw/*956.33*/("""//swal("""),format.raw/*956.40*/("""{"""),format.raw/*956.41*/("""   """),format.raw/*956.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*956.127*/("""}"""),format.raw/*956.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*959.29*/("""}"""),format.raw/*959.30*/("""
                        """),format.raw/*960.25*/("""}"""),format.raw/*960.26*/("""
                        """),format.raw/*961.25*/("""else
                        """),format.raw/*962.25*/("""{"""),format.raw/*962.26*/("""
                            """),format.raw/*963.29*/("""//swal("""),format.raw/*963.36*/("""{"""),format.raw/*963.37*/("""   """),format.raw/*963.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*963.134*/("""}"""),format.raw/*963.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*966.25*/("""}"""),format.raw/*966.26*/("""
                        """),format.raw/*967.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*978.91*/("""{"""),format.raw/*978.92*/("""

                            """),format.raw/*980.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*982.25*/("""}"""),format.raw/*982.26*/("""
                    """),format.raw/*983.21*/("""//    refreshProjectSteps();


                    """),format.raw/*986.21*/("""}"""),format.raw/*986.22*/(""",
                    error: function (data) """),format.raw/*987.44*/("""{"""),format.raw/*987.45*/("""
                      """),format.raw/*988.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*991.21*/("""}"""),format.raw/*991.22*/("""
                """),format.raw/*992.17*/("""}"""),format.raw/*992.18*/(""");
            """),format.raw/*993.13*/("""}"""),format.raw/*993.14*/("""

            """),format.raw/*995.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*997.47*/("""{"""),format.raw/*997.48*/("""

                 """),format.raw/*999.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*1004.27*/("""{"""),format.raw/*1004.28*/("""
                    """),format.raw/*1005.21*/("""'phaseId': clicked_id
                """),format.raw/*1006.17*/("""}"""),format.raw/*1006.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*1008.43*/("""{"""),format.raw/*1008.44*/("""
                    """),format.raw/*1009.21*/("""swal("""),format.raw/*1009.26*/("""{"""),format.raw/*1009.27*/("""   """),format.raw/*1009.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*1009.232*/("""}"""),format.raw/*1009.233*/(""", function()"""),format.raw/*1009.245*/("""{"""),format.raw/*1009.246*/("""

               """),format.raw/*1011.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*1013.74*/("""{"""),format.raw/*1013.75*/("""
                            """),format.raw/*1014.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*1017.25*/("""}"""),format.raw/*1017.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*1019.61*/("""{"""),format.raw/*1019.62*/("""
                            """),format.raw/*1020.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*1022.54*/("""{"""),format.raw/*1022.55*/("""
                                """),format.raw/*1023.33*/("""riskcount++;
                            """),format.raw/*1024.29*/("""}"""),format.raw/*1024.30*/("""
                        """),format.raw/*1025.25*/("""}"""),format.raw/*1025.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*1031.48*/("""{"""),format.raw/*1031.49*/("""
                        """),format.raw/*1032.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*1033.21*/("""}"""),format.raw/*1033.22*/("""
                        """),format.raw/*1034.25*/("""}"""),format.raw/*1034.26*/(""");
                """),format.raw/*1035.17*/("""}"""),format.raw/*1035.18*/("""

                """),format.raw/*1037.17*/("""else """),format.raw/*1037.22*/("""{"""),format.raw/*1037.23*/("""

                    """),format.raw/*1039.21*/("""$.ajax("""),format.raw/*1039.28*/("""{"""),format.raw/*1039.29*/("""
                        """),format.raw/*1040.25*/("""type: 'POST',
                        url: '"""),_display_(/*1041.32*/routes/*1041.38*/.GameController.getProjectSteps()),format.raw/*1041.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*1046.50*/("""{"""),format.raw/*1046.51*/("""
"""),format.raw/*1047.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*1050.63*/("""{"""),format.raw/*1050.64*/("""
                                """),format.raw/*1051.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*1052.61*/("""{"""),format.raw/*1052.62*/("""
                                    """),format.raw/*1053.37*/("""if (obj.status) """),format.raw/*1053.53*/("""{"""),format.raw/*1053.54*/("""
                                        """),format.raw/*1054.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*1055.37*/("""}"""),format.raw/*1055.38*/("""
                                """),format.raw/*1056.33*/("""}"""),format.raw/*1056.34*/("""
"""),format.raw/*1057.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*1059.49*/("""{"""),format.raw/*1059.50*/("""
                                    """),format.raw/*1060.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*1061.33*/("""}"""),format.raw/*1061.34*/("""


                                """),format.raw/*1064.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*1078.91*/("""{"""),format.raw/*1078.92*/("""
                                    """),format.raw/*1079.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*1082.33*/("""}"""),format.raw/*1082.34*/(""" """),format.raw/*1082.35*/("""else """),format.raw/*1082.40*/("""{"""),format.raw/*1082.41*/("""
                                    """),format.raw/*1083.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*1085.33*/("""}"""),format.raw/*1085.34*/("""
"""),format.raw/*1086.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

if(isOOPSCard)
"""),format.raw/*1092.1*/("""{"""),format.raw/*1092.2*/("""
  """),format.raw/*1093.3*/("""isOOPSCard=false;
"""),format.raw/*1094.1*/("""}"""),format.raw/*1094.2*/("""
"""),format.raw/*1095.1*/("""if(isSurpriseCard)
"""),format.raw/*1096.1*/("""{"""),format.raw/*1096.2*/("""
  """),format.raw/*1097.3*/("""isSurpriseCard=false;
"""),format.raw/*1098.1*/("""}"""),format.raw/*1098.2*/("""

"""),format.raw/*1100.1*/("""if(isSkipped)
"""),format.raw/*1101.1*/("""{"""),format.raw/*1101.2*/("""
  """),format.raw/*1102.3*/("""isSkipped=false;
"""),format.raw/*1103.1*/("""}"""),format.raw/*1103.2*/("""

"""),format.raw/*1105.1*/("""if((obj.projectStepId == 'CPSM25' || obj.projectStepId == 'CPSM26' ||obj.projectStepId == 'CPSM27' ||obj.projectStepId == 'CPSM28' ||obj.projectStepId == 'CPSM29' ||obj.projectStepId == 'CPSM30' ||obj.projectStepId == 'CPSM31' ||obj.projectStepId == 'CPSM32' ||obj.projectStepId == 'CPSM33'
  || obj.projectStepId == 'CPSM34' ||obj.projectStepId == 'CPSM35'
   ||obj.projectStepId == 'CPSM36')&&(obj.status == "disabled='true'")
   &&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(c==1))
"""),format.raw/*1109.1*/("""{"""),format.raw/*1109.2*/("""
"""),format.raw/*1110.1*/("""isImplementedBeforeProduction=true;
c=2;
console.log(isImplementedBeforeProduction+" i am inside if condition");
"""),format.raw/*1113.1*/("""}"""),format.raw/*1113.2*/("""

"""),format.raw/*1115.1*/("""if((obj.projectStepId == 'CPSM16')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cr==1))
"""),format.raw/*1117.1*/("""{"""),format.raw/*1117.2*/("""
"""),format.raw/*1118.1*/("""cr=2;
isRequirementPlanningDone=true;
"""),format.raw/*1120.1*/("""}"""),format.raw/*1120.2*/("""
"""),format.raw/*1121.1*/("""if((obj.projectStepId == 'CPSM17')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ct==1))
"""),format.raw/*1123.1*/("""{"""),format.raw/*1123.2*/("""
"""),format.raw/*1124.1*/("""ct=2;
isTestingPlanningDone=true;
"""),format.raw/*1126.1*/("""}"""),format.raw/*1126.2*/("""
"""),format.raw/*1127.1*/("""if((obj.projectStepId == 'CPSM18')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ci==1))
"""),format.raw/*1129.1*/("""{"""),format.raw/*1129.2*/("""
"""),format.raw/*1130.1*/("""ci=2;
isImplementationPlanningDone=true;
"""),format.raw/*1132.1*/("""}"""),format.raw/*1132.2*/("""
"""),format.raw/*1133.1*/("""if((obj.projectStepId == 'CPSM19')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cd==1))
"""),format.raw/*1135.1*/("""{"""),format.raw/*1135.2*/("""
"""),format.raw/*1136.1*/("""cd=2;
isDesignPlanningDone=true;
"""),format.raw/*1138.1*/("""}"""),format.raw/*1138.2*/("""
"""),format.raw/*1139.1*/("""if((obj.projectStepId == 'CPSM20')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cp==1))
"""),format.raw/*1141.1*/("""{"""),format.raw/*1141.2*/("""
"""),format.raw/*1142.1*/("""cp=2;
isProductionPlanningDone=true;
"""),format.raw/*1144.1*/("""}"""),format.raw/*1144.2*/("""



"""),format.raw/*1148.1*/("""isSkipped=true;
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
//                                            "data-todo='"""),format.raw/*1168.59*/("""{"""),format.raw/*1168.60*/("""'id':12,'todo':'xyz'"""),format.raw/*1168.80*/("""}"""),format.raw/*1168.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*1174.29*/("""}"""),format.raw/*1174.30*/("""

"""),format.raw/*1176.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;


                            """),format.raw/*1182.77*/("""
                            """),format.raw/*1183.29*/("""var result="";
                            var count=0;
                        """),_display_(/*1185.26*/for(phases <- model.getPhases()) yield /*1185.58*/ {_display_(Seq[Any](format.raw/*1185.60*/("""

                  """),format.raw/*1187.19*/("""count++;
                  if(count==1)
                  """),format.raw/*1189.19*/("""{"""),format.raw/*1189.20*/("""
                  """),format.raw/*1190.19*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                      "style='background-color: #DB8B00 !important;'" +
                      "onclick='onPhaseClick(id)' " +
                      "id='"""),_display_(/*1193.29*/phases/*1193.35*/.getPhaseId),format.raw/*1193.46*/("""'>"""),_display_(/*1193.49*/phases/*1193.55*/.getPhaseName),format.raw/*1193.68*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                  """),format.raw/*1194.19*/("""}"""),format.raw/*1194.20*/("""
                  """),format.raw/*1195.19*/("""else if(count==2)
                  """),format.raw/*1196.19*/("""{"""),format.raw/*1196.20*/("""
                    """),format.raw/*1197.21*/("""if(isRequirementPlanningDone)
                    """),format.raw/*1198.21*/("""{"""),format.raw/*1198.22*/("""
                      """),format.raw/*1199.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1202.33*/phases/*1202.39*/.getPhaseId),format.raw/*1202.50*/("""'>"""),_display_(/*1202.53*/phases/*1202.59*/.getPhaseName),format.raw/*1202.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1203.21*/("""}"""),format.raw/*1203.22*/("""
                    """),format.raw/*1204.21*/("""else """),format.raw/*1204.26*/("""{"""),format.raw/*1204.27*/("""
                      """),format.raw/*1205.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1208.35*/phases/*1208.41*/.getPhaseId),format.raw/*1208.52*/("""'>"""),_display_(/*1208.55*/phases/*1208.61*/.getPhaseName),format.raw/*1208.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1210.21*/("""}"""),format.raw/*1210.22*/("""
                  """),format.raw/*1211.19*/("""}"""),format.raw/*1211.20*/("""
                  """),format.raw/*1212.19*/("""else if(count==3)
                  """),format.raw/*1213.19*/("""{"""),format.raw/*1213.20*/("""
                    """),format.raw/*1214.21*/("""if(isDesignPlanningDone)
                    """),format.raw/*1215.21*/("""{"""),format.raw/*1215.22*/("""
                      """),format.raw/*1216.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1219.33*/phases/*1219.39*/.getPhaseId),format.raw/*1219.50*/("""'>"""),_display_(/*1219.53*/phases/*1219.59*/.getPhaseName),format.raw/*1219.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1220.21*/("""}"""),format.raw/*1220.22*/("""
                    """),format.raw/*1221.21*/("""else """),format.raw/*1221.26*/("""{"""),format.raw/*1221.27*/("""
                      """),format.raw/*1222.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1225.35*/phases/*1225.41*/.getPhaseId),format.raw/*1225.52*/("""'>"""),_display_(/*1225.55*/phases/*1225.61*/.getPhaseName),format.raw/*1225.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1227.21*/("""}"""),format.raw/*1227.22*/("""
                  """),format.raw/*1228.19*/("""}"""),format.raw/*1228.20*/("""
                  """),format.raw/*1229.19*/("""else if(count==4)
                  """),format.raw/*1230.19*/("""{"""),format.raw/*1230.20*/("""
                    """),format.raw/*1231.21*/("""if(isImplementationPlanningDone)
                    """),format.raw/*1232.21*/("""{"""),format.raw/*1232.22*/("""
                      """),format.raw/*1233.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1236.33*/phases/*1236.39*/.getPhaseId),format.raw/*1236.50*/("""'>"""),_display_(/*1236.53*/phases/*1236.59*/.getPhaseName),format.raw/*1236.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1237.21*/("""}"""),format.raw/*1237.22*/("""
                    """),format.raw/*1238.21*/("""else """),format.raw/*1238.26*/("""{"""),format.raw/*1238.27*/("""
                      """),format.raw/*1239.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1242.35*/phases/*1242.41*/.getPhaseId),format.raw/*1242.52*/("""'>"""),_display_(/*1242.55*/phases/*1242.61*/.getPhaseName),format.raw/*1242.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1244.21*/("""}"""),format.raw/*1244.22*/("""
                  """),format.raw/*1245.19*/("""}"""),format.raw/*1245.20*/("""
                  """),format.raw/*1246.19*/("""else if(count==5)
                  """),format.raw/*1247.19*/("""{"""),format.raw/*1247.20*/("""
                    """),format.raw/*1248.21*/("""if(isTestingPlanningDone)
                    """),format.raw/*1249.21*/("""{"""),format.raw/*1249.22*/("""
                      """),format.raw/*1250.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1253.33*/phases/*1253.39*/.getPhaseId),format.raw/*1253.50*/("""'>"""),_display_(/*1253.53*/phases/*1253.59*/.getPhaseName),format.raw/*1253.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1254.21*/("""}"""),format.raw/*1254.22*/("""
                    """),format.raw/*1255.21*/("""else """),format.raw/*1255.26*/("""{"""),format.raw/*1255.27*/("""
                      """),format.raw/*1256.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1259.35*/phases/*1259.41*/.getPhaseId),format.raw/*1259.52*/("""'>"""),_display_(/*1259.55*/phases/*1259.61*/.getPhaseName),format.raw/*1259.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1261.21*/("""}"""),format.raw/*1261.22*/("""
                  """),format.raw/*1262.19*/("""}"""),format.raw/*1262.20*/("""
                  """),format.raw/*1263.19*/("""else if(count==6)
                  """),format.raw/*1264.19*/("""{"""),format.raw/*1264.20*/("""
                    """),format.raw/*1265.21*/("""console.log(isProductionPlanningDone+" i am is production planning"+isImplementedBeforeProduction+" i am before guy");
                    if(isImplementedBeforeProduction && isProductionPlanningDone)
                    """),format.raw/*1267.21*/("""{"""),format.raw/*1267.22*/("""
                    """),format.raw/*1268.21*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1271.33*/phases/*1271.39*/.getPhaseId),format.raw/*1271.50*/("""'>"""),_display_(/*1271.53*/phases/*1271.59*/.getPhaseName),format.raw/*1271.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1272.21*/("""}"""),format.raw/*1272.22*/("""
                    """),format.raw/*1273.21*/("""else """),format.raw/*1273.26*/("""{"""),format.raw/*1273.27*/("""
                    """),format.raw/*1274.21*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1277.33*/phases/*1277.39*/.getPhaseId),format.raw/*1277.50*/("""'>"""),_display_(/*1277.53*/phases/*1277.59*/.getPhaseName),format.raw/*1277.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1279.21*/("""}"""),format.raw/*1279.22*/("""
                  """),format.raw/*1280.19*/("""}"""),format.raw/*1280.20*/("""

                            """)))}),format.raw/*1282.30*/("""

                            """),format.raw/*1284.29*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
                  //                alert(result);







                        """),format.raw/*1293.25*/("""}"""),format.raw/*1293.26*/(""",
                        error: function (data) """),format.raw/*1294.48*/("""{"""),format.raw/*1294.49*/("""
                            """),format.raw/*1295.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*1297.25*/("""}"""),format.raw/*1297.26*/("""
                    """),format.raw/*1298.21*/("""}"""),format.raw/*1298.22*/(""");
                """),format.raw/*1299.17*/("""}"""),format.raw/*1299.18*/("""





            """),format.raw/*1305.13*/("""}"""),format.raw/*1305.14*/("""

            """),format.raw/*1307.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*1307.67*/("""{"""),format.raw/*1307.68*/("""
"""),format.raw/*1308.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*1324.42*/("""{"""),format.raw/*1324.43*/("""
                    """),format.raw/*1325.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*1326.17*/("""}"""),format.raw/*1326.18*/("""else"""),format.raw/*1326.22*/("""{"""),format.raw/*1326.23*/("""
                    """),format.raw/*1327.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*1328.17*/("""}"""),format.raw/*1328.18*/("""
                """),format.raw/*1329.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*1348.13*/("""}"""),format.raw/*1348.14*/(""");




            function totalGameTimer() """),format.raw/*1353.39*/("""{"""),format.raw/*1353.40*/("""

                """),format.raw/*1355.17*/("""var sec = 0;

                function pad(val) """),format.raw/*1357.35*/("""{"""),format.raw/*1357.36*/("""
                    """),format.raw/*1358.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*1359.17*/("""}"""),format.raw/*1359.18*/("""

                """),format.raw/*1361.17*/("""var timer = setInterval(function () """),format.raw/*1361.53*/("""{"""),format.raw/*1361.54*/("""
                    """),format.raw/*1362.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*1364.17*/("""}"""),format.raw/*1364.18*/(""", 1000);

                setTimeout(function () """),format.raw/*1366.40*/("""{"""),format.raw/*1366.41*/("""
                    """),format.raw/*1367.21*/("""clearInterval(timer);
                """),format.raw/*1368.17*/("""}"""),format.raw/*1368.18*/(""", 50000000);
            """),format.raw/*1369.13*/("""}"""),format.raw/*1369.14*/("""
            """),format.raw/*1370.13*/("""function refreshProjectSteps()"""),format.raw/*1370.43*/("""{"""),format.raw/*1370.44*/("""
                """),format.raw/*1371.65*/("""
                """),format.raw/*1372.17*/("""var result="";
                var count=0;
            """),_display_(/*1374.14*/for(phases <- model.getPhases()) yield /*1374.46*/ {_display_(Seq[Any](format.raw/*1374.48*/("""

"""),format.raw/*1376.1*/("""count++;
if(count<6)
"""),format.raw/*1378.1*/("""{"""),format.raw/*1378.2*/("""
  """),format.raw/*1379.3*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
          "style='background-color: #DB8B00 !important;'" +
          "onclick='onPhaseClick(id)' " +
          "id='"""),_display_(/*1382.17*/phases/*1382.23*/.getPhaseId),format.raw/*1382.34*/("""'>"""),_display_(/*1382.37*/phases/*1382.43*/.getPhaseName),format.raw/*1382.56*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
"""),format.raw/*1383.1*/("""}"""),format.raw/*1383.2*/("""
"""),format.raw/*1384.1*/("""else """),format.raw/*1384.6*/("""{"""),format.raw/*1384.7*/("""
  """),format.raw/*1385.3*/("""console.log(isImplementedBeforeProduction);
  console.log("i am here in");
  if(isImplementedBeforeProduction)
  """),format.raw/*1388.3*/("""{"""),format.raw/*1388.4*/("""
    """),format.raw/*1389.5*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1392.19*/phases/*1392.25*/.getPhaseId),format.raw/*1392.36*/("""'>"""),_display_(/*1392.39*/phases/*1392.45*/.getPhaseName),format.raw/*1392.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
  """),format.raw/*1393.3*/("""}"""),format.raw/*1393.4*/("""
  """),format.raw/*1394.3*/("""else """),format.raw/*1394.8*/("""{"""),format.raw/*1394.9*/("""
    """),format.raw/*1395.5*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1398.19*/phases/*1398.25*/.getPhaseId),format.raw/*1398.36*/("""'>"""),_display_(/*1398.39*/phases/*1398.45*/.getPhaseName),format.raw/*1398.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

  """),format.raw/*1400.3*/("""}"""),format.raw/*1400.4*/("""
"""),format.raw/*1401.1*/("""}"""),format.raw/*1401.2*/("""








                """)))}),format.raw/*1410.18*/("""

                """),format.raw/*1412.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*1415.13*/("""}"""),format.raw/*1415.14*/("""

            """),format.raw/*1417.13*/("""function newfunc()"""),format.raw/*1417.31*/("""{"""),format.raw/*1417.32*/("""
                """),format.raw/*1418.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*1420.13*/("""}"""),format.raw/*1420.14*/("""
    """),format.raw/*1421.5*/("""</script>
    <body style="background-image: url("""),_display_(/*1422.41*/routes/*1422.47*/.Assets.at("images/bg.jpg")),format.raw/*1422.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*1425.68*/model/*1425.73*/.getUserName()),format.raw/*1425.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*1426.64*/model/*1426.69*/.getGameId()),format.raw/*1426.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*1427.60*/model/*1427.65*/.getTurnNo()),format.raw/*1427.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*1428.68*/model/*1428.73*/.getTimeForEachMove()),format.raw/*1428.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*1433.64*/routes/*1433.70*/.DashboardController.viewDashboard()),format.raw/*1433.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*1441.51*/("""
                """),format.raw/*1442.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*1442.95*/model/*1442.100*/.getGameId()),format.raw/*1442.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*1445.44*/model/*1445.49*/.getStepsForEachPlayer()),format.raw/*1445.73*/("""</span>
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
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*1468.126*/model/*1468.131*/.getUserName().split("@")/*1468.156*/(0)),format.raw/*1468.159*/("""!</div>

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
                            """),format.raw/*1538.105*/("""
                        """),format.raw/*1539.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1556.126*/model/*1556.131*/.getBudget()),format.raw/*1556.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1558.141*/model/*1558.146*/.getCapabilityPoints()),format.raw/*1558.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1560.139*/model/*1560.144*/.getCapabilityBonus()),format.raw/*1560.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1565.180*/model/*1565.185*/.getResources),format.raw/*1565.198*/("""</div>
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


                                              """),format.raw/*1588.138*/("""


                                          """),format.raw/*1591.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1601.83*/model/*1601.88*/.getBudget()),format.raw/*1601.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1602.84*/model/*1602.89*/.getCapabilityPoints()),format.raw/*1602.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1603.83*/model/*1603.88*/.getCapabilityBonus()),format.raw/*1603.109*/("""</div>
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


                                    """),_display_(/*1641.38*/for(phase <- model.getPhases()) yield /*1641.69*/ {_display_(Seq[Any](format.raw/*1641.71*/("""
                                        """),_display_(/*1642.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1642.95*/{_display_(Seq[Any](format.raw/*1642.96*/("""

                                            """),format.raw/*1644.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1647.49*/phase/*1647.54*/.getPhaseId),format.raw/*1647.65*/(""">"""),_display_(/*1647.67*/phase/*1647.72*/.getPhaseName()),format.raw/*1647.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1649.42*/else/*1649.46*/{_display_(Seq[Any](format.raw/*1649.47*/("""
                                            """),format.raw/*1650.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1653.49*/phase/*1653.54*/.getPhaseId),format.raw/*1653.65*/(""">"""),_display_(/*1653.67*/phase/*1653.72*/.getPhaseName()),format.raw/*1653.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1655.42*/("""

                                    """)))}),format.raw/*1657.38*/("""


                                """),format.raw/*1660.33*/("""</div>





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
                    """),format.raw/*1731.51*/("""
                    """),format.raw/*1732.55*/("""
                    """),format.raw/*1733.52*/("""
                    """),format.raw/*1734.105*/("""




                    """),format.raw/*1739.21*/("""<div class="panel panel-default" >
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
                  DATE: Fri Oct 20 13:05:33 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/ProjectStep.scala.html
                  HASH: c5ab029462ec18eed0495db0a4da880dd87fb778
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10995->6752|11025->6753|11072->6771|11132->6802|11162->6803|11204->6816|11298->6881|11328->6882|11375->6900|11446->6942|11476->6943|11518->6956|11610->7019|11640->7020|11686->7037|11770->7092|11800->7093|11850->7114|11919->7155|11935->7161|11987->7191|12238->7413|12268->7414|12297->7415|12576->7665|12606->7666|12665->7696|12979->7981|13009->7982|13038->7983|13271->8187|13301->8188|13334->8192|13364->8193|13426->8226|13505->8276|13535->8277|13596->8309|14682->9366|14712->9367|14774->9400|15014->9611|15044->9612|15077->9616|15107->9617|15169->9650|15299->9751|15329->9752|15358->9753|16999->11365|17029->11366|17083->11391|17233->11512|17263->11513|17337->11558|17367->11559|17421->11584|17542->11676|17572->11677|17618->11694|17648->11695|17693->11711|17723->11712|17766->11726|17851->11782|17881->11783|17924->11797|18443->12287|18473->12288|18523->12309|18678->12435|18708->12436|18741->12440|18771->12441|18821->12462|18922->12534|18952->12535|18998->12552|19848->13373|19878->13374|19950->13417|19980->13418|20009->13419|20251->13632|20281->13633|20325->13648|20504->13798|20534->13799|20563->13800|20688->13896|20718->13897|20768->13918|20826->13947|20856->13948|20902->13965|20938->13972|20968->13973|21018->13994|21087->14035|21103->14041|21161->14077|21372->14259|21402->14260|21457->14286|21646->14446|21676->14447|21734->14476|21865->14578|21895->14579|21957->14612|22089->14715|22119->14716|22149->14718|23389->15929|23419->15930|23481->15963|23721->16174|23751->16175|23784->16179|23814->16180|23876->16213|24006->16314|24036->16315|24065->16316|24427->16649|24457->16650|24519->16683|24577->16712|24607->16713|24673->16750|26162->18210|26192->18211|26241->18231|26271->18232|26625->18557|26655->18558|26688->18562|26718->18563|26784->18600|28281->20068|28311->20069|28360->20089|28390->20090|28744->20415|28774->20416|28834->20447|28864->20448|28922->20477|28956->20482|28986->20483|29047->20515|29105->20544|29135->20545|29199->20580|30688->22040|30718->22041|30768->22061|30799->22062|31173->22407|31203->22408|31263->22439|31297->22444|31327->22445|31395->22484|31595->22655|31625->22656|31703->22705|31854->22827|31884->22828|31982->22897|34012->24897|34043->24898|34093->24918|34124->24919|34610->25376|34640->25377|34724->25432|34793->25472|34823->25473|34909->25530|36767->27358|36798->27359|36848->27379|36879->27380|37318->27790|37348->27791|37444->27858|37589->27974|37619->27975|37720->28047|39750->30047|39781->30048|39831->30068|39862->30069|40415->30593|40445->30594|40539->30659|40665->30756|40695->30757|40791->30824|42769->32772|42800->32773|42850->32793|42881->32794|43354->33238|43384->33239|43481->33307|43704->33501|43734->33502|43835->33574|45865->35574|45896->35575|45946->35595|45977->35596|46530->36120|46560->36121|46654->36186|46781->36284|46811->36285|46907->36352|48885->38300|48916->38301|48966->38321|48997->38322|49470->38766|49500->38767|49595->38833|49767->38976|49797->38977|49918->39069|52362->41483|52393->41484|52443->41504|52474->41505|53161->42163|53191->42164|53299->42243|53445->42360|53475->42361|53585->42442|55887->44714|55918->44715|55968->44735|55999->44736|56558->45266|56588->45267|56682->45332|56790->45411|56820->45412|56912->45475|56946->45480|56976->45481|57010->45487|58055->46503|58085->46504|58134->46524|58164->46525|58445->46777|58475->46778|58538->46812|58568->46813|58639->46855|58669->46856|58737->46895|58767->46896|58796->46897|59108->47180|59138->47181|59212->47226|59242->47227|59296->47252|59431->47358|59461->47359|59507->47376|59537->47377|59582->47393|59612->47394|59656->47409|59711->47435|59741->47436|59771->47438|60134->47772|60164->47773|60214->47794|60253->47804|60283->47805|60337->47830|60456->47921|60471->47926|60503->47936|61524->48928|61554->48929|61601->48947|61631->48948|61678->48966|61767->49026|61797->49027|61826->49028|61918->49091|61948->49092|62002->49117|62121->49208|62136->49213|62168->49223|63186->50212|63216->50213|63263->50231|63293->50232|63340->50250|63401->50282|63431->50283|63460->50284|63552->50347|63582->50348|63636->50373|63751->50460|63766->50465|63798->50475|64821->51469|64851->51470|64898->51488|64928->51489|64958->51490|64991->51494|65021->51495|65071->51516|65110->51526|65140->51527|65194->51552|65309->51639|65324->51644|65356->51654|66369->52638|66399->52639|66446->52657|66476->52658|66523->52676|66559->52683|66589->52684|66639->52705|66708->52746|66724->52752|66775->52781|67037->53014|67067->53015|67121->53040|67398->53288|67428->53289|67457->53290|67571->53375|67601->53376|67671->53417|68044->53761|68074->53762|68160->53819|68190->53820|68260->53861|68304->53876|68334->53877|68363->53878|68571->54057|68601->54058|68667->54095|68697->54096|68753->54123|68783->54124|68838->54150|68924->54207|68954->54208|69011->54236|69465->54661|69495->54662|69557->54695|69672->54781|69702->54782|69760->54811|69814->54836|69844->54837|69906->54870|70028->54963|70058->54964|70116->54993|70169->55017|70199->55018|70261->55051|70381->55142|70411->55143|70498->55201|70552->55226|70582->55227|70644->55260|70756->55343|70786->55344|70874->55403|71029->55529|71059->55530|71118->55560|71253->55666|71283->55667|71343->55698|71496->55822|71526->55823|71558->55826|71676->55914|71707->55915|72240->56419|72270->56420|72324->56445|72389->56481|72419->56482|72477->56511|72645->56650|72675->56651|72737->56684|72856->56774|72886->56775|72944->56804|73002->56833|73032->56834|73094->56867|73220->56964|73250->56965|73308->56994|73365->57022|73395->57023|73457->57056|73581->57151|73611->57152|73669->57181|73727->57210|73757->57211|73819->57244|73935->57331|73965->57332|74024->57362|74144->57453|74174->57454|74206->57457|74331->57552|74362->57553|74966->58128|74996->58129|75050->58154|75117->58192|75147->58193|75205->58222|75304->58292|75334->58293|75396->58326|75565->58466|75595->58467|75653->58496|75686->58500|75716->58501|75778->58534|75942->58669|75972->58670|76031->58700|76196->58836|76226->58837|76280->58862|76345->58898|76375->58899|76431->58926|76545->59011|76575->59012|76637->59045|76673->59052|76703->59053|76735->59056|76839->59130|76870->59131|77079->59311|77109->59312|77164->59338|77194->59339|77248->59364|77309->59396|77339->59397|77397->59426|77459->59459|77489->59460|77551->59493|77587->59500|77617->59501|77649->59504|77777->59602|77808->59603|78023->59789|78053->59790|78111->59819|78144->59823|78174->59824|78236->59857|78272->59864|78302->59865|78334->59868|78447->59951|78478->59952|78693->60138|78723->60139|78777->60164|78807->60165|78861->60190|78919->60219|78949->60220|79007->60249|79043->60256|79073->60257|79105->60260|79229->60354|79260->60355|79468->60534|79498->60535|79552->60560|80403->61382|80433->61383|80492->61413|80629->61521|80659->61522|80709->61543|80789->61594|80819->61595|80893->61640|80923->61641|80975->61664|81161->61821|81191->61822|81237->61839|81267->61840|81311->61855|81341->61856|81384->61870|81519->61976|81549->61977|81597->61996|81842->62211|81873->62212|81924->62233|81992->62271|82023->62272|82098->62317|82129->62318|82180->62339|82215->62344|82246->62345|82279->62348|82512->62550|82544->62551|82587->62563|82619->62564|82666->62581|82912->62797|82943->62798|83002->62827|83105->62900|83136->62901|83274->63009|83305->63010|83364->63039|83494->63139|83525->63140|83588->63173|83659->63214|83690->63215|83745->63240|83776->63241|84132->63567|84163->63568|84218->63593|84373->63718|84404->63719|84459->63744|84490->63745|84539->63764|84570->63765|84618->63783|84653->63788|84684->63789|84736->63811|84773->63818|84804->63819|84859->63844|84933->63889|84950->63895|85006->63928|85296->64188|85327->64189|85357->64190|85613->64416|85644->64417|85707->64450|85816->64529|85847->64530|85914->64567|85960->64583|85991->64584|86062->64625|86151->64684|86182->64685|86245->64718|86276->64719|86306->64720|86481->64865|86512->64866|86579->64903|86672->64966|86703->64967|86768->65002|87913->66117|87944->66118|88011->66155|88264->66378|88295->66379|88326->66380|88361->66385|88392->66386|88459->66423|88602->66536|88633->66537|88663->66538|88997->66843|89027->66844|89059->66847|89106->66865|89136->66866|89166->66867|89214->66886|89244->66887|89276->66890|89327->66912|89357->66913|89388->66915|89431->66929|89461->66930|89493->66933|89539->66950|89569->66951|89600->66953|90119->67443|90149->67444|90179->67445|90321->67558|90351->67559|90382->67561|90540->67690|90570->67691|90600->67692|90667->67730|90697->67731|90727->67732|90885->67861|90915->67862|90945->67863|91008->67897|91038->67898|91068->67899|91226->68028|91256->68029|91286->68030|91356->68071|91386->68072|91416->68073|91574->68202|91604->68203|91634->68204|91696->68237|91726->68238|91756->68239|91914->68368|91944->68369|91974->68370|92040->68407|92070->68408|92103->68412|93634->69913|93665->69914|93715->69934|93746->69935|94246->70405|94277->70406|94308->70408|94658->70776|94717->70805|94827->70886|94877->70918|94919->70920|94969->70940|95057->70998|95088->70999|95137->71018|95383->71235|95400->71241|95434->71252|95466->71255|95483->71261|95519->71274|95630->71355|95661->71356|95710->71375|95776->71411|95807->71412|95858->71433|95938->71483|95969->71484|96022->71507|96280->71736|96297->71742|96331->71753|96363->71756|96380->71762|96416->71775|96529->71858|96560->71859|96611->71880|96646->71885|96677->71886|96730->71909|97010->72160|97027->72166|97061->72177|97093->72180|97110->72186|97146->72199|97260->72283|97291->72284|97340->72303|97371->72304|97420->72323|97486->72359|97517->72360|97568->72381|97643->72426|97674->72427|97727->72450|97985->72679|98002->72685|98036->72696|98068->72699|98085->72705|98121->72718|98234->72801|98265->72802|98316->72823|98351->72828|98382->72829|98435->72852|98715->73103|98732->73109|98766->73120|98798->73123|98815->73129|98851->73142|98965->73226|98996->73227|99045->73246|99076->73247|99125->73266|99191->73302|99222->73303|99273->73324|99356->73377|99387->73378|99440->73401|99698->73630|99715->73636|99749->73647|99781->73650|99798->73656|99834->73669|99947->73752|99978->73753|100029->73774|100064->73779|100095->73780|100148->73803|100428->74054|100445->74060|100479->74071|100511->74074|100528->74080|100564->74093|100678->74177|100709->74178|100758->74197|100789->74198|100838->74217|100904->74253|100935->74254|100986->74275|101062->74321|101093->74322|101146->74345|101404->74574|101421->74580|101455->74591|101487->74594|101504->74600|101540->74613|101653->74696|101684->74697|101735->74718|101770->74723|101801->74724|101854->74747|102134->74998|102151->75004|102185->75015|102217->75018|102234->75024|102270->75037|102384->75121|102415->75122|102464->75141|102495->75142|102544->75161|102610->75197|102641->75198|102692->75219|102943->75440|102974->75441|103025->75462|103283->75691|103300->75697|103334->75708|103366->75711|103383->75717|103419->75730|103532->75813|103563->75814|103614->75835|103649->75840|103680->75841|103731->75862|104005->76107|104022->76113|104056->76124|104088->76127|104105->76133|104141->76146|104255->76230|104286->76231|104335->76250|104366->76251|104430->76282|104490->76312|104668->76460|104699->76461|104778->76510|104809->76511|104868->76540|104998->76640|105029->76641|105080->76662|105111->76663|105160->76682|105191->76683|105239->76701|105270->76702|105314->76716|105398->76770|105429->76771|105459->76772|106403->77686|106434->77687|106485->77708|106642->77835|106673->77836|106707->77840|106738->77841|106789->77862|106887->77930|106918->77931|106965->77948|108054->79007|108085->79008|108160->79053|108191->79054|108239->79072|108317->79120|108348->79121|108399->79142|108479->79192|108510->79193|108558->79211|108624->79247|108655->79248|108706->79269|108912->79445|108943->79446|109022->79495|109053->79496|109104->79517|109172->79555|109203->79556|109258->79581|109289->79582|109332->79595|109392->79625|109423->79626|109470->79691|109517->79708|109603->79765|109653->79797|109695->79799|109726->79801|109776->79822|109806->79823|109838->79826|110048->80007|110065->80013|110099->80024|110131->80027|110148->80033|110184->80046|110276->80109|110306->80110|110336->80111|110370->80116|110400->80117|110432->80120|110574->80233|110604->80234|110638->80239|110854->80426|110871->80432|110905->80443|110937->80446|110954->80452|110990->80465|111084->80530|111114->80531|111146->80534|111180->80539|111210->80540|111244->80545|111476->80748|111493->80754|111527->80765|111559->80768|111576->80774|111612->80787|111707->80853|111737->80854|111767->80855|111797->80856|111856->80882|111904->80900|112046->81012|112077->81013|112121->81027|112169->81045|112200->81046|112247->81063|112329->81115|112360->81116|112394->81121|112473->81171|112490->81177|112540->81204|112795->81430|112811->81435|112848->81449|112944->81516|112960->81521|112995->81533|113087->81596|113103->81601|113138->81613|113238->81684|113254->81689|113298->81710|113528->81911|113545->81917|113605->81953|113863->82215|113910->82232|114017->82310|114034->82315|114070->82327|114262->82490|114278->82495|114325->82519|115878->84042|115895->84047|115932->84072|115959->84075|118918->87079|118973->87104|119642->87743|119659->87748|119695->87760|119929->87964|119946->87969|119992->87991|120224->88193|120241->88198|120286->88219|120722->88625|120739->88630|120776->88643|121898->89825|121973->89870|122841->90709|122857->90714|122893->90726|123012->90816|123028->90821|123074->90843|123192->90932|123208->90937|123253->90958|125565->93241|125614->93272|125656->93274|125727->93316|125791->93369|125832->93370|125908->93416|126188->93667|126204->93672|126238->93683|126269->93685|126285->93690|126323->93705|126491->93852|126506->93856|126547->93857|126622->93902|126917->94168|126933->94173|126967->94184|126998->94186|127014->94191|127052->94206|127232->94353|127304->94392|127369->94427|130295->97353|130346->97408|130397->97460|130449->97565|130504->97590
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|208->178|208->178|210->180|211->181|211->181|212->182|214->184|214->184|216->186|217->187|217->187|218->188|219->189|219->189|220->190|221->191|221->191|222->192|223->193|223->193|223->193|228->198|228->198|229->199|233->203|233->203|235->205|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|246->216|246->216|250->220|264->234|264->234|265->235|268->238|268->238|268->238|268->238|269->239|271->241|271->241|272->242|296->266|296->266|297->267|299->269|299->269|300->270|300->270|301->271|303->273|303->273|304->274|304->274|306->276|306->276|308->278|308->278|308->278|309->279|319->289|319->289|320->290|321->291|321->291|321->291|321->291|322->292|323->293|323->293|324->294|341->311|341->311|343->313|343->313|344->314|350->320|350->320|353->323|357->327|357->327|358->328|360->330|360->330|361->331|362->332|362->332|363->333|363->333|363->333|364->334|365->335|365->335|365->335|369->339|369->339|371->341|374->344|374->344|375->345|378->348|378->348|379->349|381->351|381->351|383->353|401->371|401->371|402->372|405->375|405->375|405->375|405->375|406->376|408->378|408->378|409->379|413->383|413->383|414->384|414->384|414->384|415->385|430->400|430->400|430->400|430->400|435->405|435->405|435->405|435->405|436->406|451->421|451->421|451->421|451->421|456->426|456->426|459->429|459->429|460->430|460->430|460->430|462->432|462->432|462->432|463->433|478->448|478->448|478->448|478->448|483->453|483->453|484->454|484->454|484->454|485->455|486->456|486->456|487->457|488->458|488->458|489->459|504->474|504->474|504->474|504->474|509->479|509->479|510->480|510->480|510->480|511->481|526->496|526->496|526->496|526->496|530->500|530->500|533->503|534->504|534->504|536->506|551->521|551->521|551->521|551->521|557->527|557->527|558->528|559->529|559->529|560->530|575->545|575->545|575->545|575->545|579->549|579->549|583->553|586->556|586->556|588->558|603->573|603->573|603->573|603->573|609->579|609->579|610->580|611->581|611->581|612->582|627->597|627->597|627->597|627->597|631->601|631->601|633->603|634->604|634->604|636->606|651->621|651->621|651->621|651->621|657->627|657->627|658->628|659->629|659->629|660->630|675->645|675->645|675->645|675->645|679->649|679->649|680->650|683->653|683->653|684->654|684->654|684->654|688->658|704->674|704->674|704->674|704->674|710->680|710->680|714->684|714->684|728->698|728->698|743->713|743->713|744->714|748->718|748->718|749->719|749->719|750->720|752->722|752->722|753->723|753->723|755->725|755->725|758->728|758->728|758->728|760->730|764->734|764->734|765->735|765->735|765->735|766->736|768->738|768->738|768->738|783->753|783->753|784->754|784->754|786->756|786->756|786->756|787->757|788->758|788->758|789->759|791->761|791->761|791->761|806->776|806->776|807->777|807->777|809->779|809->779|809->779|810->780|811->781|811->781|812->782|814->784|814->784|814->784|829->799|829->799|830->800|830->800|830->800|830->800|830->800|831->801|831->801|831->801|832->802|834->804|834->804|834->804|849->819|849->819|850->820|850->820|852->822|852->822|852->822|853->823|854->824|854->824|854->824|859->829|859->829|860->830|863->833|863->833|864->834|865->835|865->835|866->836|871->841|871->841|872->842|872->842|873->843|873->843|873->843|874->844|877->847|877->847|878->848|878->848|879->849|879->849|882->852|883->853|883->853|884->854|894->864|894->864|895->865|896->866|896->866|897->867|897->867|897->867|898->868|899->869|899->869|900->870|900->870|900->870|901->871|902->872|902->872|904->874|904->874|904->874|905->875|906->876|906->876|909->879|910->880|910->880|911->881|912->882|912->882|915->885|922->892|922->892|922->892|922->892|922->892|929->899|929->899|930->900|930->900|930->900|931->901|934->904|934->904|935->905|936->906|936->906|937->907|937->907|937->907|938->908|939->909|939->909|940->910|940->910|940->910|941->911|942->912|942->912|943->913|943->913|943->913|944->914|945->915|945->915|947->917|949->919|949->919|949->919|949->919|949->919|957->927|957->927|958->928|958->928|958->928|959->929|960->930|960->930|961->931|962->932|962->932|963->933|963->933|963->933|964->934|965->935|965->935|967->937|969->939|969->939|970->940|970->940|970->940|971->941|972->942|972->942|973->943|973->943|973->943|973->943|973->943|973->943|976->946|976->946|978->948|978->948|979->949|979->949|979->949|980->950|980->950|980->950|981->951|981->951|981->951|981->951|981->951|981->951|984->954|984->954|985->955|985->955|985->955|986->956|986->956|986->956|986->956|986->956|986->956|989->959|989->959|990->960|990->960|991->961|992->962|992->962|993->963|993->963|993->963|993->963|993->963|993->963|996->966|996->966|997->967|1008->978|1008->978|1010->980|1012->982|1012->982|1013->983|1016->986|1016->986|1017->987|1017->987|1018->988|1021->991|1021->991|1022->992|1022->992|1023->993|1023->993|1025->995|1027->997|1027->997|1029->999|1034->1004|1034->1004|1035->1005|1036->1006|1036->1006|1038->1008|1038->1008|1039->1009|1039->1009|1039->1009|1039->1009|1039->1009|1039->1009|1039->1009|1039->1009|1041->1011|1043->1013|1043->1013|1044->1014|1047->1017|1047->1017|1049->1019|1049->1019|1050->1020|1052->1022|1052->1022|1053->1023|1054->1024|1054->1024|1055->1025|1055->1025|1061->1031|1061->1031|1062->1032|1063->1033|1063->1033|1064->1034|1064->1034|1065->1035|1065->1035|1067->1037|1067->1037|1067->1037|1069->1039|1069->1039|1069->1039|1070->1040|1071->1041|1071->1041|1071->1041|1076->1046|1076->1046|1077->1047|1080->1050|1080->1050|1081->1051|1082->1052|1082->1052|1083->1053|1083->1053|1083->1053|1084->1054|1085->1055|1085->1055|1086->1056|1086->1056|1087->1057|1089->1059|1089->1059|1090->1060|1091->1061|1091->1061|1094->1064|1108->1078|1108->1078|1109->1079|1112->1082|1112->1082|1112->1082|1112->1082|1112->1082|1113->1083|1115->1085|1115->1085|1116->1086|1122->1092|1122->1092|1123->1093|1124->1094|1124->1094|1125->1095|1126->1096|1126->1096|1127->1097|1128->1098|1128->1098|1130->1100|1131->1101|1131->1101|1132->1102|1133->1103|1133->1103|1135->1105|1139->1109|1139->1109|1140->1110|1143->1113|1143->1113|1145->1115|1147->1117|1147->1117|1148->1118|1150->1120|1150->1120|1151->1121|1153->1123|1153->1123|1154->1124|1156->1126|1156->1126|1157->1127|1159->1129|1159->1129|1160->1130|1162->1132|1162->1132|1163->1133|1165->1135|1165->1135|1166->1136|1168->1138|1168->1138|1169->1139|1171->1141|1171->1141|1172->1142|1174->1144|1174->1144|1178->1148|1198->1168|1198->1168|1198->1168|1198->1168|1204->1174|1204->1174|1206->1176|1212->1182|1213->1183|1215->1185|1215->1185|1215->1185|1217->1187|1219->1189|1219->1189|1220->1190|1223->1193|1223->1193|1223->1193|1223->1193|1223->1193|1223->1193|1224->1194|1224->1194|1225->1195|1226->1196|1226->1196|1227->1197|1228->1198|1228->1198|1229->1199|1232->1202|1232->1202|1232->1202|1232->1202|1232->1202|1232->1202|1233->1203|1233->1203|1234->1204|1234->1204|1234->1204|1235->1205|1238->1208|1238->1208|1238->1208|1238->1208|1238->1208|1238->1208|1240->1210|1240->1210|1241->1211|1241->1211|1242->1212|1243->1213|1243->1213|1244->1214|1245->1215|1245->1215|1246->1216|1249->1219|1249->1219|1249->1219|1249->1219|1249->1219|1249->1219|1250->1220|1250->1220|1251->1221|1251->1221|1251->1221|1252->1222|1255->1225|1255->1225|1255->1225|1255->1225|1255->1225|1255->1225|1257->1227|1257->1227|1258->1228|1258->1228|1259->1229|1260->1230|1260->1230|1261->1231|1262->1232|1262->1232|1263->1233|1266->1236|1266->1236|1266->1236|1266->1236|1266->1236|1266->1236|1267->1237|1267->1237|1268->1238|1268->1238|1268->1238|1269->1239|1272->1242|1272->1242|1272->1242|1272->1242|1272->1242|1272->1242|1274->1244|1274->1244|1275->1245|1275->1245|1276->1246|1277->1247|1277->1247|1278->1248|1279->1249|1279->1249|1280->1250|1283->1253|1283->1253|1283->1253|1283->1253|1283->1253|1283->1253|1284->1254|1284->1254|1285->1255|1285->1255|1285->1255|1286->1256|1289->1259|1289->1259|1289->1259|1289->1259|1289->1259|1289->1259|1291->1261|1291->1261|1292->1262|1292->1262|1293->1263|1294->1264|1294->1264|1295->1265|1297->1267|1297->1267|1298->1268|1301->1271|1301->1271|1301->1271|1301->1271|1301->1271|1301->1271|1302->1272|1302->1272|1303->1273|1303->1273|1303->1273|1304->1274|1307->1277|1307->1277|1307->1277|1307->1277|1307->1277|1307->1277|1309->1279|1309->1279|1310->1280|1310->1280|1312->1282|1314->1284|1323->1293|1323->1293|1324->1294|1324->1294|1325->1295|1327->1297|1327->1297|1328->1298|1328->1298|1329->1299|1329->1299|1335->1305|1335->1305|1337->1307|1337->1307|1337->1307|1338->1308|1354->1324|1354->1324|1355->1325|1356->1326|1356->1326|1356->1326|1356->1326|1357->1327|1358->1328|1358->1328|1359->1329|1378->1348|1378->1348|1383->1353|1383->1353|1385->1355|1387->1357|1387->1357|1388->1358|1389->1359|1389->1359|1391->1361|1391->1361|1391->1361|1392->1362|1394->1364|1394->1364|1396->1366|1396->1366|1397->1367|1398->1368|1398->1368|1399->1369|1399->1369|1400->1370|1400->1370|1400->1370|1401->1371|1402->1372|1404->1374|1404->1374|1404->1374|1406->1376|1408->1378|1408->1378|1409->1379|1412->1382|1412->1382|1412->1382|1412->1382|1412->1382|1412->1382|1413->1383|1413->1383|1414->1384|1414->1384|1414->1384|1415->1385|1418->1388|1418->1388|1419->1389|1422->1392|1422->1392|1422->1392|1422->1392|1422->1392|1422->1392|1423->1393|1423->1393|1424->1394|1424->1394|1424->1394|1425->1395|1428->1398|1428->1398|1428->1398|1428->1398|1428->1398|1428->1398|1430->1400|1430->1400|1431->1401|1431->1401|1440->1410|1442->1412|1445->1415|1445->1415|1447->1417|1447->1417|1447->1417|1448->1418|1450->1420|1450->1420|1451->1421|1452->1422|1452->1422|1452->1422|1455->1425|1455->1425|1455->1425|1456->1426|1456->1426|1456->1426|1457->1427|1457->1427|1457->1427|1458->1428|1458->1428|1458->1428|1463->1433|1463->1433|1463->1433|1471->1441|1472->1442|1472->1442|1472->1442|1472->1442|1475->1445|1475->1445|1475->1445|1498->1468|1498->1468|1498->1468|1498->1468|1568->1538|1569->1539|1586->1556|1586->1556|1586->1556|1588->1558|1588->1558|1588->1558|1590->1560|1590->1560|1590->1560|1595->1565|1595->1565|1595->1565|1618->1588|1621->1591|1631->1601|1631->1601|1631->1601|1632->1602|1632->1602|1632->1602|1633->1603|1633->1603|1633->1603|1671->1641|1671->1641|1671->1641|1672->1642|1672->1642|1672->1642|1674->1644|1677->1647|1677->1647|1677->1647|1677->1647|1677->1647|1677->1647|1679->1649|1679->1649|1679->1649|1680->1650|1683->1653|1683->1653|1683->1653|1683->1653|1683->1653|1683->1653|1685->1655|1687->1657|1690->1660|1761->1731|1762->1732|1763->1733|1764->1734|1769->1739
                  -- GENERATED --
              */
          