
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
                """),format.raw/*778.17*/("""else if(id.indexOf("Timeout")!==-1)
                """),format.raw/*779.17*/("""{"""),format.raw/*779.18*/("""
                    """),format.raw/*780.21*/("""console.log("came gere");

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
                """),format.raw/*801.17*/("""}"""),format.raw/*801.18*/("""

                """),format.raw/*803.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*803.49*/("""{"""),format.raw/*803.50*/("""
"""),format.raw/*804.1*/("""//                    alert(id);
                    var obj = """),format.raw/*805.31*/("""{"""),format.raw/*805.32*/("""
                        """),format.raw/*806.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*808.35*/model/*808.40*/.getGameId),format.raw/*808.50*/(""",
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
                    """),format.raw/*823.21*/("""}"""),format.raw/*823.22*/(""";
                """),format.raw/*824.17*/("""}"""),format.raw/*824.18*/(""" """),format.raw/*824.19*/("""else"""),format.raw/*824.23*/("""{"""),format.raw/*824.24*/("""
                    """),format.raw/*825.21*/("""var obj = """),format.raw/*825.31*/("""{"""),format.raw/*825.32*/("""
                        """),format.raw/*826.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*828.35*/model/*828.40*/.getGameId),format.raw/*828.50*/(""",
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
                    """),format.raw/*843.21*/("""}"""),format.raw/*843.22*/(""";
                """),format.raw/*844.17*/("""}"""),format.raw/*844.18*/("""

                """),format.raw/*846.17*/("""$.ajax("""),format.raw/*846.24*/("""{"""),format.raw/*846.25*/("""
                    """),format.raw/*847.21*/("""type: 'POST',
                    url: '"""),_display_(/*848.28*/routes/*848.34*/.GameController.performStep()),format.raw/*848.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*853.46*/("""{"""),format.raw/*853.47*/("""
                        """),format.raw/*854.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        document.getElementById('prevstep').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*857.50*/("""{"""),format.raw/*857.51*/("""
"""),format.raw/*858.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*859.34*/("""{"""),format.raw/*859.35*/("""
                                        """),format.raw/*860.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*865.37*/("""}"""),format.raw/*865.38*/(""",
                                    function(isConfirm)"""),format.raw/*866.56*/("""{"""),format.raw/*866.57*/("""
                                        """),format.raw/*867.41*/("""if (isConfirm) """),format.raw/*867.56*/("""{"""),format.raw/*867.57*/("""
"""),format.raw/*868.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*871.41*/("""}"""),format.raw/*871.42*/("""
                                    """),format.raw/*872.37*/("""}"""),format.raw/*872.38*/(""");
                        """),format.raw/*873.25*/("""}"""),format.raw/*873.26*/("""


                       """),format.raw/*876.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*877.25*/("""{"""),format.raw/*877.26*/("""
                           """),format.raw/*878.28*/("""// $('#updateactivity').trigger('click');
                           isOOPSCard=true;
                           console.log(isOOPSCard+"   hello am as ");
                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*883.56*/("""{"""),format.raw/*883.57*/("""
                                """),format.raw/*884.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*885.29*/("""}"""),format.raw/*885.30*/("""
                            """),format.raw/*886.29*/("""if(data.oops_points !=0) """),format.raw/*886.54*/("""{"""),format.raw/*886.55*/("""
                                """),format.raw/*887.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*888.29*/("""}"""),format.raw/*888.30*/("""
                            """),format.raw/*889.29*/("""if(data.oops_bonus !=0) """),format.raw/*889.53*/("""{"""),format.raw/*889.54*/("""
                                """),format.raw/*890.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*891.29*/("""}"""),format.raw/*891.30*/("""
                            """),format.raw/*892.29*/("""if(data.oops_budget !=0) """),format.raw/*892.54*/("""{"""),format.raw/*892.55*/("""
                                """),format.raw/*893.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*894.29*/("""}"""),format.raw/*894.30*/("""
                            """),format.raw/*895.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*897.36*/("""{"""),format.raw/*897.37*/("""   """),format.raw/*897.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*897.128*/("""}"""),format.raw/*897.129*/(""");
                            document.getElementById('swalmessages').innerHTML = "You got an OOPS card!"+alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*904.25*/("""}"""),format.raw/*904.26*/("""
                        """),format.raw/*905.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*905.61*/("""{"""),format.raw/*905.62*/("""
                            """),format.raw/*906.29*/("""isSurpriseCard=true;
                            var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*909.60*/("""{"""),format.raw/*909.61*/("""
                                """),format.raw/*910.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*911.29*/("""}"""),format.raw/*911.30*/("""
                            """),format.raw/*912.29*/("""if(data.surprise_points !=0) """),format.raw/*912.58*/("""{"""),format.raw/*912.59*/("""
                                """),format.raw/*913.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*914.29*/("""}"""),format.raw/*914.30*/("""
                            """),format.raw/*915.29*/("""if(data.surprise_bonus !=0) """),format.raw/*915.57*/("""{"""),format.raw/*915.58*/("""
                                """),format.raw/*916.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*917.29*/("""}"""),format.raw/*917.30*/("""
                            """),format.raw/*918.29*/("""if(data.surprise_budget !=0) """),format.raw/*918.58*/("""{"""),format.raw/*918.59*/("""
                                """),format.raw/*919.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*920.29*/("""}"""),format.raw/*920.30*/("""
                            """),format.raw/*921.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*923.36*/("""{"""),format.raw/*923.37*/("""   """),format.raw/*923.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*923.135*/("""}"""),format.raw/*923.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = "You got a Surprise card!"+alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*931.25*/("""}"""),format.raw/*931.26*/("""
                        """),format.raw/*932.25*/("""else if(data.steptype == "production")"""),format.raw/*932.63*/("""{"""),format.raw/*932.64*/("""
                            """),format.raw/*933.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*934.52*/("""{"""),format.raw/*934.53*/("""
                                """),format.raw/*935.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*936.29*/("""}"""),format.raw/*936.30*/("""
                            """),format.raw/*937.29*/("""else"""),format.raw/*937.33*/("""{"""),format.raw/*937.34*/("""
                                """),format.raw/*938.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*939.29*/("""}"""),format.raw/*939.30*/("""

                            """),format.raw/*941.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*943.25*/("""}"""),format.raw/*943.26*/("""
                        """),format.raw/*944.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*944.61*/("""{"""),format.raw/*944.62*/("""
                          """),format.raw/*945.27*/("""isSkipped=true;
                            if($('#btnIsProduction').val() != "true")"""),format.raw/*946.70*/("""{"""),format.raw/*946.71*/("""
                                """),format.raw/*947.33*/("""//swal("""),format.raw/*947.40*/("""{"""),format.raw/*947.41*/("""   """),format.raw/*947.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*947.118*/("""}"""),format.raw/*947.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*950.29*/("""}"""),format.raw/*950.30*/("""

                        """),format.raw/*952.25*/("""}"""),format.raw/*952.26*/("""
                        """),format.raw/*953.25*/("""else if(data.steptype == "risk")"""),format.raw/*953.57*/("""{"""),format.raw/*953.58*/("""
                            """),format.raw/*954.29*/("""if(data.risk_status == "success")"""),format.raw/*954.62*/("""{"""),format.raw/*954.63*/("""
                                """),format.raw/*955.33*/("""//swal("""),format.raw/*955.40*/("""{"""),format.raw/*955.41*/("""   """),format.raw/*955.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*955.142*/("""}"""),format.raw/*955.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*958.29*/("""}"""),format.raw/*958.30*/("""
                            """),format.raw/*959.29*/("""else"""),format.raw/*959.33*/("""{"""),format.raw/*959.34*/("""
                                """),format.raw/*960.33*/("""//swal("""),format.raw/*960.40*/("""{"""),format.raw/*960.41*/("""   """),format.raw/*960.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*960.127*/("""}"""),format.raw/*960.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*963.29*/("""}"""),format.raw/*963.30*/("""
                        """),format.raw/*964.25*/("""}"""),format.raw/*964.26*/("""
                        """),format.raw/*965.25*/("""else
                        """),format.raw/*966.25*/("""{"""),format.raw/*966.26*/("""
                            """),format.raw/*967.29*/("""//swal("""),format.raw/*967.36*/("""{"""),format.raw/*967.37*/("""   """),format.raw/*967.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*967.134*/("""}"""),format.raw/*967.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*970.25*/("""}"""),format.raw/*970.26*/("""
                        """),format.raw/*971.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*982.91*/("""{"""),format.raw/*982.92*/("""

                            """),format.raw/*984.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*986.25*/("""}"""),format.raw/*986.26*/("""
                    """),format.raw/*987.21*/("""//    refreshProjectSteps();


                    """),format.raw/*990.21*/("""}"""),format.raw/*990.22*/(""",
                    error: function (data) """),format.raw/*991.44*/("""{"""),format.raw/*991.45*/("""
                      """),format.raw/*992.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*995.21*/("""}"""),format.raw/*995.22*/("""
                """),format.raw/*996.17*/("""}"""),format.raw/*996.18*/(""");
            """),format.raw/*997.13*/("""}"""),format.raw/*997.14*/("""

            """),format.raw/*999.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*1001.47*/("""{"""),format.raw/*1001.48*/("""

                 """),format.raw/*1003.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*1008.27*/("""{"""),format.raw/*1008.28*/("""
                    """),format.raw/*1009.21*/("""'phaseId': clicked_id
                """),format.raw/*1010.17*/("""}"""),format.raw/*1010.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*1012.43*/("""{"""),format.raw/*1012.44*/("""
                    """),format.raw/*1013.21*/("""swal("""),format.raw/*1013.26*/("""{"""),format.raw/*1013.27*/("""   """),format.raw/*1013.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*1013.232*/("""}"""),format.raw/*1013.233*/(""", function()"""),format.raw/*1013.245*/("""{"""),format.raw/*1013.246*/("""

               """),format.raw/*1015.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*1017.74*/("""{"""),format.raw/*1017.75*/("""
                            """),format.raw/*1018.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*1021.25*/("""}"""),format.raw/*1021.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*1023.61*/("""{"""),format.raw/*1023.62*/("""
                            """),format.raw/*1024.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*1026.54*/("""{"""),format.raw/*1026.55*/("""
                                """),format.raw/*1027.33*/("""riskcount++;
                            """),format.raw/*1028.29*/("""}"""),format.raw/*1028.30*/("""
                        """),format.raw/*1029.25*/("""}"""),format.raw/*1029.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*1035.48*/("""{"""),format.raw/*1035.49*/("""
                        """),format.raw/*1036.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*1037.21*/("""}"""),format.raw/*1037.22*/("""
                        """),format.raw/*1038.25*/("""}"""),format.raw/*1038.26*/(""");
                """),format.raw/*1039.17*/("""}"""),format.raw/*1039.18*/("""

                """),format.raw/*1041.17*/("""else """),format.raw/*1041.22*/("""{"""),format.raw/*1041.23*/("""

                    """),format.raw/*1043.21*/("""$.ajax("""),format.raw/*1043.28*/("""{"""),format.raw/*1043.29*/("""
                        """),format.raw/*1044.25*/("""type: 'POST',
                        url: '"""),_display_(/*1045.32*/routes/*1045.38*/.GameController.getProjectSteps()),format.raw/*1045.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*1050.50*/("""{"""),format.raw/*1050.51*/("""
"""),format.raw/*1051.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*1054.63*/("""{"""),format.raw/*1054.64*/("""
                                """),format.raw/*1055.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*1056.61*/("""{"""),format.raw/*1056.62*/("""
                                    """),format.raw/*1057.37*/("""if (obj.status) """),format.raw/*1057.53*/("""{"""),format.raw/*1057.54*/("""
                                        """),format.raw/*1058.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*1059.37*/("""}"""),format.raw/*1059.38*/("""
                                """),format.raw/*1060.33*/("""}"""),format.raw/*1060.34*/("""
"""),format.raw/*1061.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*1063.49*/("""{"""),format.raw/*1063.50*/("""
                                    """),format.raw/*1064.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*1065.33*/("""}"""),format.raw/*1065.34*/("""


                                """),format.raw/*1068.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*1082.91*/("""{"""),format.raw/*1082.92*/("""
                                    """),format.raw/*1083.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*1086.33*/("""}"""),format.raw/*1086.34*/(""" """),format.raw/*1086.35*/("""else """),format.raw/*1086.40*/("""{"""),format.raw/*1086.41*/("""
                                    """),format.raw/*1087.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*1089.33*/("""}"""),format.raw/*1089.34*/("""
"""),format.raw/*1090.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

if(isOOPSCard)
"""),format.raw/*1096.1*/("""{"""),format.raw/*1096.2*/("""
  """),format.raw/*1097.3*/("""isOOPSCard=false;
"""),format.raw/*1098.1*/("""}"""),format.raw/*1098.2*/("""
"""),format.raw/*1099.1*/("""if(isSurpriseCard)
"""),format.raw/*1100.1*/("""{"""),format.raw/*1100.2*/("""
  """),format.raw/*1101.3*/("""isSurpriseCard=false;
"""),format.raw/*1102.1*/("""}"""),format.raw/*1102.2*/("""

"""),format.raw/*1104.1*/("""if(isSkipped)
"""),format.raw/*1105.1*/("""{"""),format.raw/*1105.2*/("""
  """),format.raw/*1106.3*/("""isSkipped=false;
"""),format.raw/*1107.1*/("""}"""),format.raw/*1107.2*/("""

"""),format.raw/*1109.1*/("""if((obj.projectStepId == 'CPSM25' || obj.projectStepId == 'CPSM26' ||obj.projectStepId == 'CPSM27' ||obj.projectStepId == 'CPSM28' ||obj.projectStepId == 'CPSM29' ||obj.projectStepId == 'CPSM30' ||obj.projectStepId == 'CPSM31' ||obj.projectStepId == 'CPSM32' ||obj.projectStepId == 'CPSM33'
  || obj.projectStepId == 'CPSM34' ||obj.projectStepId == 'CPSM35'
   ||obj.projectStepId == 'CPSM36')&&(obj.status == "disabled='true'")
   &&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(c==1))
"""),format.raw/*1113.1*/("""{"""),format.raw/*1113.2*/("""
"""),format.raw/*1114.1*/("""isImplementedBeforeProduction=true;
c=2;
console.log(isImplementedBeforeProduction+" i am inside if condition");
"""),format.raw/*1117.1*/("""}"""),format.raw/*1117.2*/("""

"""),format.raw/*1119.1*/("""if((obj.projectStepId == 'CPSM16')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cr==1))
"""),format.raw/*1121.1*/("""{"""),format.raw/*1121.2*/("""
"""),format.raw/*1122.1*/("""cr=2;
isRequirementPlanningDone=true;
"""),format.raw/*1124.1*/("""}"""),format.raw/*1124.2*/("""
"""),format.raw/*1125.1*/("""if((obj.projectStepId == 'CPSM17')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ct==1))
"""),format.raw/*1127.1*/("""{"""),format.raw/*1127.2*/("""
"""),format.raw/*1128.1*/("""ct=2;
isTestingPlanningDone=true;
"""),format.raw/*1130.1*/("""}"""),format.raw/*1130.2*/("""
"""),format.raw/*1131.1*/("""if((obj.projectStepId == 'CPSM18')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(ci==1))
"""),format.raw/*1133.1*/("""{"""),format.raw/*1133.2*/("""
"""),format.raw/*1134.1*/("""ci=2;
isImplementationPlanningDone=true;
"""),format.raw/*1136.1*/("""}"""),format.raw/*1136.2*/("""
"""),format.raw/*1137.1*/("""if((obj.projectStepId == 'CPSM19')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cd==1))
"""),format.raw/*1139.1*/("""{"""),format.raw/*1139.2*/("""
"""),format.raw/*1140.1*/("""cd=2;
isDesignPlanningDone=true;
"""),format.raw/*1142.1*/("""}"""),format.raw/*1142.2*/("""
"""),format.raw/*1143.1*/("""if((obj.projectStepId == 'CPSM20')&&(obj.status == "disabled='true'")
&&(!isOOPSCard)&&(!isSurpriseCard)&&(!isSkipped)&&(cp==1))
"""),format.raw/*1145.1*/("""{"""),format.raw/*1145.2*/("""
"""),format.raw/*1146.1*/("""cp=2;
isProductionPlanningDone=true;
"""),format.raw/*1148.1*/("""}"""),format.raw/*1148.2*/("""



"""),format.raw/*1152.1*/("""isSkipped=true;
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
//                                            "data-todo='"""),format.raw/*1172.59*/("""{"""),format.raw/*1172.60*/("""'id':12,'todo':'xyz'"""),format.raw/*1172.80*/("""}"""),format.raw/*1172.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*1178.29*/("""}"""),format.raw/*1178.30*/("""

"""),format.raw/*1180.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;


                            """),format.raw/*1186.77*/("""
                            """),format.raw/*1187.29*/("""var result="";
                            var count=0;
                        """),_display_(/*1189.26*/for(phases <- model.getPhases()) yield /*1189.58*/ {_display_(Seq[Any](format.raw/*1189.60*/("""

                  """),format.raw/*1191.19*/("""count++;
                  if(count==1)
                  """),format.raw/*1193.19*/("""{"""),format.raw/*1193.20*/("""
                  """),format.raw/*1194.19*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                      "style='background-color: #DB8B00 !important;'" +
                      "onclick='onPhaseClick(id)' " +
                      "id='"""),_display_(/*1197.29*/phases/*1197.35*/.getPhaseId),format.raw/*1197.46*/("""'>"""),_display_(/*1197.49*/phases/*1197.55*/.getPhaseName),format.raw/*1197.68*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                  """),format.raw/*1198.19*/("""}"""),format.raw/*1198.20*/("""
                  """),format.raw/*1199.19*/("""else if(count==2)
                  """),format.raw/*1200.19*/("""{"""),format.raw/*1200.20*/("""
                    """),format.raw/*1201.21*/("""if(isRequirementPlanningDone)
                    """),format.raw/*1202.21*/("""{"""),format.raw/*1202.22*/("""
                      """),format.raw/*1203.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1206.33*/phases/*1206.39*/.getPhaseId),format.raw/*1206.50*/("""'>"""),_display_(/*1206.53*/phases/*1206.59*/.getPhaseName),format.raw/*1206.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1207.21*/("""}"""),format.raw/*1207.22*/("""
                    """),format.raw/*1208.21*/("""else """),format.raw/*1208.26*/("""{"""),format.raw/*1208.27*/("""
                      """),format.raw/*1209.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1212.35*/phases/*1212.41*/.getPhaseId),format.raw/*1212.52*/("""'>"""),_display_(/*1212.55*/phases/*1212.61*/.getPhaseName),format.raw/*1212.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1214.21*/("""}"""),format.raw/*1214.22*/("""
                  """),format.raw/*1215.19*/("""}"""),format.raw/*1215.20*/("""
                  """),format.raw/*1216.19*/("""else if(count==3)
                  """),format.raw/*1217.19*/("""{"""),format.raw/*1217.20*/("""
                    """),format.raw/*1218.21*/("""if(isDesignPlanningDone)
                    """),format.raw/*1219.21*/("""{"""),format.raw/*1219.22*/("""
                      """),format.raw/*1220.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1223.33*/phases/*1223.39*/.getPhaseId),format.raw/*1223.50*/("""'>"""),_display_(/*1223.53*/phases/*1223.59*/.getPhaseName),format.raw/*1223.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1224.21*/("""}"""),format.raw/*1224.22*/("""
                    """),format.raw/*1225.21*/("""else """),format.raw/*1225.26*/("""{"""),format.raw/*1225.27*/("""
                      """),format.raw/*1226.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1229.35*/phases/*1229.41*/.getPhaseId),format.raw/*1229.52*/("""'>"""),_display_(/*1229.55*/phases/*1229.61*/.getPhaseName),format.raw/*1229.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1231.21*/("""}"""),format.raw/*1231.22*/("""
                  """),format.raw/*1232.19*/("""}"""),format.raw/*1232.20*/("""
                  """),format.raw/*1233.19*/("""else if(count==4)
                  """),format.raw/*1234.19*/("""{"""),format.raw/*1234.20*/("""
                    """),format.raw/*1235.21*/("""if(isImplementationPlanningDone)
                    """),format.raw/*1236.21*/("""{"""),format.raw/*1236.22*/("""
                      """),format.raw/*1237.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1240.33*/phases/*1240.39*/.getPhaseId),format.raw/*1240.50*/("""'>"""),_display_(/*1240.53*/phases/*1240.59*/.getPhaseName),format.raw/*1240.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1241.21*/("""}"""),format.raw/*1241.22*/("""
                    """),format.raw/*1242.21*/("""else """),format.raw/*1242.26*/("""{"""),format.raw/*1242.27*/("""
                      """),format.raw/*1243.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1246.35*/phases/*1246.41*/.getPhaseId),format.raw/*1246.52*/("""'>"""),_display_(/*1246.55*/phases/*1246.61*/.getPhaseName),format.raw/*1246.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1248.21*/("""}"""),format.raw/*1248.22*/("""
                  """),format.raw/*1249.19*/("""}"""),format.raw/*1249.20*/("""
                  """),format.raw/*1250.19*/("""else if(count==5)
                  """),format.raw/*1251.19*/("""{"""),format.raw/*1251.20*/("""
                    """),format.raw/*1252.21*/("""if(isTestingPlanningDone)
                    """),format.raw/*1253.21*/("""{"""),format.raw/*1253.22*/("""
                      """),format.raw/*1254.23*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1257.33*/phases/*1257.39*/.getPhaseId),format.raw/*1257.50*/("""'>"""),_display_(/*1257.53*/phases/*1257.59*/.getPhaseName),format.raw/*1257.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1258.21*/("""}"""),format.raw/*1258.22*/("""
                    """),format.raw/*1259.21*/("""else """),format.raw/*1259.26*/("""{"""),format.raw/*1259.27*/("""
                      """),format.raw/*1260.23*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                            "style='background-color: #DB8B00 !important;'" +
                            "onclick='onPhaseClick(id)' " +
                            "id='"""),_display_(/*1263.35*/phases/*1263.41*/.getPhaseId),format.raw/*1263.52*/("""'>"""),_display_(/*1263.55*/phases/*1263.61*/.getPhaseName),format.raw/*1263.74*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1265.21*/("""}"""),format.raw/*1265.22*/("""
                  """),format.raw/*1266.19*/("""}"""),format.raw/*1266.20*/("""
                  """),format.raw/*1267.19*/("""else if(count==6)
                  """),format.raw/*1268.19*/("""{"""),format.raw/*1268.20*/("""
                    """),format.raw/*1269.21*/("""console.log(isProductionPlanningDone+" i am is production planning"+isImplementedBeforeProduction+" i am before guy");
                    if(isImplementedBeforeProduction && isProductionPlanningDone)
                    """),format.raw/*1271.21*/("""{"""),format.raw/*1271.22*/("""
                    """),format.raw/*1272.21*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1275.33*/phases/*1275.39*/.getPhaseId),format.raw/*1275.50*/("""'>"""),_display_(/*1275.53*/phases/*1275.59*/.getPhaseName),format.raw/*1275.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
                    """),format.raw/*1276.21*/("""}"""),format.raw/*1276.22*/("""
                    """),format.raw/*1277.21*/("""else """),format.raw/*1277.26*/("""{"""),format.raw/*1277.27*/("""
                    """),format.raw/*1278.21*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
                          "style='background-color: #DB8B00 !important;'" +
                          "onclick='onPhaseClick(id)' " +
                          "id='"""),_display_(/*1281.33*/phases/*1281.39*/.getPhaseId),format.raw/*1281.50*/("""'>"""),_display_(/*1281.53*/phases/*1281.59*/.getPhaseName),format.raw/*1281.72*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

                    """),format.raw/*1283.21*/("""}"""),format.raw/*1283.22*/("""
                  """),format.raw/*1284.19*/("""}"""),format.raw/*1284.20*/("""

                            """)))}),format.raw/*1286.30*/("""

                            """),format.raw/*1288.29*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
                  //                alert(result);







                        """),format.raw/*1297.25*/("""}"""),format.raw/*1297.26*/(""",
                        error: function (data) """),format.raw/*1298.48*/("""{"""),format.raw/*1298.49*/("""
                            """),format.raw/*1299.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*1301.25*/("""}"""),format.raw/*1301.26*/("""
                    """),format.raw/*1302.21*/("""}"""),format.raw/*1302.22*/(""");
                """),format.raw/*1303.17*/("""}"""),format.raw/*1303.18*/("""





            """),format.raw/*1309.13*/("""}"""),format.raw/*1309.14*/("""

            """),format.raw/*1311.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*1311.67*/("""{"""),format.raw/*1311.68*/("""
"""),format.raw/*1312.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*1328.42*/("""{"""),format.raw/*1328.43*/("""
                    """),format.raw/*1329.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*1330.17*/("""}"""),format.raw/*1330.18*/("""else"""),format.raw/*1330.22*/("""{"""),format.raw/*1330.23*/("""
                    """),format.raw/*1331.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*1332.17*/("""}"""),format.raw/*1332.18*/("""
                """),format.raw/*1333.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*1352.13*/("""}"""),format.raw/*1352.14*/(""");




            function totalGameTimer() """),format.raw/*1357.39*/("""{"""),format.raw/*1357.40*/("""

                """),format.raw/*1359.17*/("""var sec = 0;

                function pad(val) """),format.raw/*1361.35*/("""{"""),format.raw/*1361.36*/("""
                    """),format.raw/*1362.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*1363.17*/("""}"""),format.raw/*1363.18*/("""

                """),format.raw/*1365.17*/("""var timer = setInterval(function () """),format.raw/*1365.53*/("""{"""),format.raw/*1365.54*/("""
                    """),format.raw/*1366.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*1368.17*/("""}"""),format.raw/*1368.18*/(""", 1000);

                setTimeout(function () """),format.raw/*1370.40*/("""{"""),format.raw/*1370.41*/("""
                	"""),format.raw/*1371.18*/("""console.log("TimeOut happened");
                    clearInterval(timer);
                """),format.raw/*1373.17*/("""}"""),format.raw/*1373.18*/(""", 50000000);
            """),format.raw/*1374.13*/("""}"""),format.raw/*1374.14*/("""
            """),format.raw/*1375.13*/("""function refreshProjectSteps()"""),format.raw/*1375.43*/("""{"""),format.raw/*1375.44*/("""
                """),format.raw/*1376.65*/("""
                """),format.raw/*1377.17*/("""var result="";
                var count=0;
            """),_display_(/*1379.14*/for(phases <- model.getPhases()) yield /*1379.46*/ {_display_(Seq[Any](format.raw/*1379.48*/("""

"""),format.raw/*1381.1*/("""count++;
if(count<6)
"""),format.raw/*1383.1*/("""{"""),format.raw/*1383.2*/("""
  """),format.raw/*1384.3*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
          "style='background-color: #DB8B00 !important;'" +
          "onclick='onPhaseClick(id)' " +
          "id='"""),_display_(/*1387.17*/phases/*1387.23*/.getPhaseId),format.raw/*1387.34*/("""'>"""),_display_(/*1387.37*/phases/*1387.43*/.getPhaseName),format.raw/*1387.56*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
"""),format.raw/*1388.1*/("""}"""),format.raw/*1388.2*/("""
"""),format.raw/*1389.1*/("""else """),format.raw/*1389.6*/("""{"""),format.raw/*1389.7*/("""
  """),format.raw/*1390.3*/("""console.log(isImplementedBeforeProduction);
  console.log("i am here in");
  if(isImplementedBeforeProduction)
  """),format.raw/*1393.3*/("""{"""),format.raw/*1393.4*/("""
    """),format.raw/*1394.5*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1397.19*/phases/*1397.25*/.getPhaseId),format.raw/*1397.36*/("""'>"""),_display_(/*1397.39*/phases/*1397.45*/.getPhaseName),format.raw/*1397.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";
  """),format.raw/*1398.3*/("""}"""),format.raw/*1398.4*/("""
  """),format.raw/*1399.3*/("""else """),format.raw/*1399.8*/("""{"""),format.raw/*1399.9*/("""
    """),format.raw/*1400.5*/("""result = result+ "<button disabled='true' class='col-md-3 btn btn-warning' " +
            "style='background-color: #DB8B00 !important;'" +
            "onclick='onPhaseClick(id)' " +
            "id='"""),_display_(/*1403.19*/phases/*1403.25*/.getPhaseId),format.raw/*1403.36*/("""'>"""),_display_(/*1403.39*/phases/*1403.45*/.getPhaseName),format.raw/*1403.58*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";

  """),format.raw/*1405.3*/("""}"""),format.raw/*1405.4*/("""
"""),format.raw/*1406.1*/("""}"""),format.raw/*1406.2*/("""








                """)))}),format.raw/*1415.18*/("""

                """),format.raw/*1417.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*1420.13*/("""}"""),format.raw/*1420.14*/("""

            """),format.raw/*1422.13*/("""function newfunc()"""),format.raw/*1422.31*/("""{"""),format.raw/*1422.32*/("""
                """),format.raw/*1423.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*1425.13*/("""}"""),format.raw/*1425.14*/("""
    """),format.raw/*1426.5*/("""</script>
    <body style="background-image: url("""),_display_(/*1427.41*/routes/*1427.47*/.Assets.at("images/bg.jpg")),format.raw/*1427.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*1430.68*/model/*1430.73*/.getUserName()),format.raw/*1430.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*1431.64*/model/*1431.69*/.getGameId()),format.raw/*1431.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*1432.60*/model/*1432.65*/.getTurnNo()),format.raw/*1432.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*1433.68*/model/*1433.73*/.getTimeForEachMove()),format.raw/*1433.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*1438.64*/routes/*1438.70*/.DashboardController.viewDashboard()),format.raw/*1438.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*1446.51*/("""
                """),format.raw/*1447.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*1447.95*/model/*1447.100*/.getGameId()),format.raw/*1447.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*1450.44*/model/*1450.49*/.getStepsForEachPlayer()),format.raw/*1450.73*/("""</span>
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
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*1473.126*/model/*1473.131*/.getUserName().split("@")/*1473.156*/(0)),format.raw/*1473.159*/("""!</div>

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
                            """),format.raw/*1543.105*/("""
                        """),format.raw/*1544.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1561.126*/model/*1561.131*/.getBudget()),format.raw/*1561.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1563.141*/model/*1563.146*/.getCapabilityPoints()),format.raw/*1563.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1565.139*/model/*1565.144*/.getCapabilityBonus()),format.raw/*1565.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1570.180*/model/*1570.185*/.getResources),format.raw/*1570.198*/("""</div>
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


                                              """),format.raw/*1593.138*/("""


                                          """),format.raw/*1596.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1606.83*/model/*1606.88*/.getBudget()),format.raw/*1606.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1607.84*/model/*1607.89*/.getCapabilityPoints()),format.raw/*1607.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1608.83*/model/*1608.88*/.getCapabilityBonus()),format.raw/*1608.109*/("""</div>
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


                                    """),_display_(/*1646.38*/for(phase <- model.getPhases()) yield /*1646.69*/ {_display_(Seq[Any](format.raw/*1646.71*/("""
                                        """),_display_(/*1647.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1647.95*/{_display_(Seq[Any](format.raw/*1647.96*/("""

                                            """),format.raw/*1649.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1652.49*/phase/*1652.54*/.getPhaseId),format.raw/*1652.65*/(""">"""),_display_(/*1652.67*/phase/*1652.72*/.getPhaseName()),format.raw/*1652.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1654.42*/else/*1654.46*/{_display_(Seq[Any](format.raw/*1654.47*/("""
                                            """),format.raw/*1655.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1658.49*/phase/*1658.54*/.getPhaseId),format.raw/*1658.65*/(""">"""),_display_(/*1658.67*/phase/*1658.72*/.getPhaseName()),format.raw/*1658.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1660.42*/("""

                                    """)))}),format.raw/*1662.38*/("""


                                """),format.raw/*1665.33*/("""</div>





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
                    """),format.raw/*1736.51*/("""
                    """),format.raw/*1737.55*/("""
                    """),format.raw/*1738.52*/("""
                    """),format.raw/*1739.105*/("""




                    """),format.raw/*1744.21*/("""<div class="panel panel-default" >
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
                  DATE: Thu Sep 28 17:37:40 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/ProjectStep.scala.html
                  HASH: 26a740d1e134a00cebc47e7d753bc14eeb8a0e9b
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4802->2837|4831->2838|4868->2848|5021->2973|5050->2974|5091->2987|5203->3072|5232->3073|5268->3082|5355->3141|5384->3142|5425->3155|5537->3240|5566->3241|5603->3251|5694->3314|5723->3315|5764->3328|5876->3413|5905->3414|5942->3424|5980->3434|6009->3435|6050->3448|6162->3533|6191->3534|6227->3543|6258->3546|6287->3547|6317->3550|6429->3635|6457->3636|6497->3649|6535->3659|6564->3660|6605->3673|6999->4040|7028->4041|7064->4050|7108->4066|7137->4067|7178->4080|7371->4245|7401->4246|7438->4255|7511->4299|7541->4300|7583->4313|7853->4555|7883->4556|7921->4566|8030->4647|8060->4648|8102->4661|8326->4857|8356->4858|8394->4868|8434->4879|8464->4880|8506->4893|9078->5437|9108->5438|9145->5447|9185->5458|9215->5459|9257->5472|9620->5807|9650->5808|9688->5818|9734->5835|9764->5836|9806->5849|10027->6042|10057->6043|10094->6052|10135->6064|10165->6065|10207->6078|10477->6320|10507->6321|10548->6334|10995->6752|11025->6753|11072->6771|11132->6802|11162->6803|11204->6816|11298->6881|11328->6882|11375->6900|11446->6942|11476->6943|11518->6956|11610->7019|11640->7020|11686->7037|11770->7092|11800->7093|11850->7114|11919->7155|11935->7161|11987->7191|12238->7413|12268->7414|12297->7415|12576->7665|12606->7666|12665->7696|12979->7981|13009->7982|13038->7983|13271->8187|13301->8188|13334->8192|13364->8193|13426->8226|13505->8276|13535->8277|13596->8309|14682->9366|14712->9367|14774->9400|15014->9611|15044->9612|15077->9616|15107->9617|15169->9650|15299->9751|15329->9752|15358->9753|16999->11365|17029->11366|17083->11391|17233->11512|17263->11513|17337->11558|17367->11559|17421->11584|17542->11676|17572->11677|17618->11694|17648->11695|17693->11711|17723->11712|17766->11726|17851->11782|17881->11783|17924->11797|18443->12287|18473->12288|18523->12309|18678->12435|18708->12436|18741->12440|18771->12441|18821->12462|18922->12534|18952->12535|18998->12552|19848->13373|19878->13374|19950->13417|19980->13418|20009->13419|20251->13632|20281->13633|20325->13648|20504->13798|20534->13799|20563->13800|20688->13896|20718->13897|20768->13918|20826->13947|20856->13948|20902->13965|20938->13972|20968->13973|21018->13994|21087->14035|21103->14041|21161->14077|21372->14259|21402->14260|21457->14286|21646->14446|21676->14447|21734->14476|21865->14578|21895->14579|21957->14612|22089->14715|22119->14716|22149->14718|23389->15929|23419->15930|23481->15963|23721->16174|23751->16175|23784->16179|23814->16180|23876->16213|24006->16314|24036->16315|24065->16316|24427->16649|24457->16650|24519->16683|24577->16712|24607->16713|24673->16750|26162->18210|26192->18211|26241->18231|26271->18232|26625->18557|26655->18558|26688->18562|26718->18563|26784->18600|28281->20068|28311->20069|28360->20089|28390->20090|28744->20415|28774->20416|28834->20447|28864->20448|28922->20477|28956->20482|28986->20483|29047->20515|29105->20544|29135->20545|29199->20580|30688->22040|30718->22041|30768->22061|30799->22062|31173->22407|31203->22408|31263->22439|31297->22444|31327->22445|31395->22484|31595->22655|31625->22656|31703->22705|31854->22827|31884->22828|31982->22897|34012->24897|34043->24898|34093->24918|34124->24919|34610->25376|34640->25377|34724->25432|34793->25472|34823->25473|34909->25530|36767->27358|36798->27359|36848->27379|36879->27380|37318->27790|37348->27791|37444->27858|37589->27974|37619->27975|37720->28047|39750->30047|39781->30048|39831->30068|39862->30069|40415->30593|40445->30594|40539->30659|40665->30756|40695->30757|40791->30824|42769->32772|42800->32773|42850->32793|42881->32794|43354->33238|43384->33239|43481->33307|43704->33501|43734->33502|43835->33574|45865->35574|45896->35575|45946->35595|45977->35596|46530->36120|46560->36121|46654->36186|46781->36284|46811->36285|46907->36352|48885->38300|48916->38301|48966->38321|48997->38322|49470->38766|49500->38767|49595->38833|49767->38976|49797->38977|49918->39069|52362->41483|52393->41484|52443->41504|52474->41505|53161->42163|53191->42164|53299->42243|53445->42360|53475->42361|53585->42442|55887->44714|55918->44715|55968->44735|55999->44736|56558->45266|56588->45267|56682->45332|56790->45411|56820->45412|56912->45475|56946->45480|56976->45481|57010->45487|58055->46503|58085->46504|58134->46524|58164->46525|58445->46777|58475->46778|58538->46812|58568->46813|58639->46855|58669->46856|58737->46895|58767->46896|58796->46897|59108->47180|59138->47181|59212->47226|59242->47227|59296->47252|59431->47358|59461->47359|59507->47376|59537->47377|59582->47393|59612->47394|59656->47409|59711->47435|59741->47436|59771->47438|60134->47772|60164->47773|60214->47794|60253->47804|60283->47805|60337->47830|60456->47921|60471->47926|60503->47936|61524->48928|61554->48929|61601->48947|61631->48948|61678->48966|61767->49026|61797->49027|61826->49028|61918->49091|61948->49092|62002->49117|62121->49208|62136->49213|62168->49223|63186->50212|63216->50213|63263->50231|63293->50232|63339->50249|63420->50301|63450->50302|63500->50323|63586->50380|63616->50381|63670->50406|63785->50493|63800->50498|63832->50508|64855->51502|64885->51503|64932->51521|64962->51522|65009->51540|65070->51572|65100->51573|65129->51574|65221->51637|65251->51638|65305->51663|65420->51750|65435->51755|65467->51765|66490->52759|66520->52760|66567->52778|66597->52779|66627->52780|66660->52784|66690->52785|66740->52806|66779->52816|66809->52817|66863->52842|66978->52929|66993->52934|67025->52944|68038->53928|68068->53929|68115->53947|68145->53948|68192->53966|68228->53973|68258->53974|68308->53995|68377->54036|68393->54042|68444->54071|68706->54304|68736->54305|68790->54330|69067->54578|69097->54579|69126->54580|69240->54665|69270->54666|69340->54707|69713->55051|69743->55052|69829->55109|69859->55110|69929->55151|69973->55166|70003->55167|70032->55168|70240->55347|70270->55348|70336->55385|70366->55386|70422->55413|70452->55414|70507->55440|70593->55497|70623->55498|70680->55526|70977->55794|71007->55795|71069->55828|71184->55914|71214->55915|71272->55944|71326->55969|71356->55970|71418->56003|71540->56096|71570->56097|71628->56126|71681->56150|71711->56151|71773->56184|71893->56275|71923->56276|71981->56305|72035->56330|72065->56331|72127->56364|72239->56447|72269->56448|72327->56477|72447->56568|72477->56569|72509->56572|72627->56660|72658->56661|73191->57165|73221->57166|73275->57191|73340->57227|73370->57228|73428->57257|73596->57396|73626->57397|73688->57430|73807->57520|73837->57521|73895->57550|73953->57579|73983->57580|74045->57613|74171->57710|74201->57711|74259->57740|74316->57768|74346->57769|74408->57802|74532->57897|74562->57898|74620->57927|74678->57956|74708->57957|74770->57990|74886->58077|74916->58078|74974->58107|75094->58198|75124->58199|75156->58202|75281->58297|75312->58298|75916->58873|75946->58874|76000->58899|76067->58937|76097->58938|76155->58967|76254->59037|76284->59038|76346->59071|76515->59211|76545->59212|76603->59241|76636->59245|76666->59246|76728->59279|76892->59414|76922->59415|76981->59445|77146->59581|77176->59582|77230->59607|77295->59643|77325->59644|77381->59671|77495->59756|77525->59757|77587->59790|77623->59797|77653->59798|77685->59801|77789->59875|77820->59876|78029->60056|78059->60057|78114->60083|78144->60084|78198->60109|78259->60141|78289->60142|78347->60171|78409->60204|78439->60205|78501->60238|78537->60245|78567->60246|78599->60249|78727->60347|78758->60348|78973->60534|79003->60535|79061->60564|79094->60568|79124->60569|79186->60602|79222->60609|79252->60610|79284->60613|79397->60696|79428->60697|79643->60883|79673->60884|79727->60909|79757->60910|79811->60935|79869->60964|79899->60965|79957->60994|79993->61001|80023->61002|80055->61005|80179->61099|80210->61100|80418->61279|80448->61280|80502->61305|81353->62127|81383->62128|81442->62158|81579->62266|81609->62267|81659->62288|81739->62339|81769->62340|81843->62385|81873->62386|81925->62409|82111->62566|82141->62567|82187->62584|82217->62585|82261->62600|82291->62601|82334->62615|82470->62721|82501->62722|82550->62741|82795->62956|82826->62957|82877->62978|82945->63016|82976->63017|83051->63062|83082->63063|83133->63084|83168->63089|83199->63090|83232->63093|83465->63295|83497->63296|83540->63308|83572->63309|83619->63326|83865->63542|83896->63543|83955->63572|84058->63645|84089->63646|84227->63754|84258->63755|84317->63784|84447->63884|84478->63885|84541->63918|84612->63959|84643->63960|84698->63985|84729->63986|85085->64312|85116->64313|85171->64338|85326->64463|85357->64464|85412->64489|85443->64490|85492->64509|85523->64510|85571->64528|85606->64533|85637->64534|85689->64556|85726->64563|85757->64564|85812->64589|85886->64634|85903->64640|85959->64673|86249->64933|86280->64934|86310->64935|86566->65161|86597->65162|86660->65195|86769->65274|86800->65275|86867->65312|86913->65328|86944->65329|87015->65370|87104->65429|87135->65430|87198->65463|87229->65464|87259->65465|87434->65610|87465->65611|87532->65648|87625->65711|87656->65712|87721->65747|88866->66862|88897->66863|88964->66900|89217->67123|89248->67124|89279->67125|89314->67130|89345->67131|89412->67168|89555->67281|89586->67282|89616->67283|89950->67588|89980->67589|90012->67592|90059->67610|90089->67611|90119->67612|90167->67631|90197->67632|90229->67635|90280->67657|90310->67658|90341->67660|90384->67674|90414->67675|90446->67678|90492->67695|90522->67696|90553->67698|91072->68188|91102->68189|91132->68190|91274->68303|91304->68304|91335->68306|91493->68435|91523->68436|91553->68437|91620->68475|91650->68476|91680->68477|91838->68606|91868->68607|91898->68608|91961->68642|91991->68643|92021->68644|92179->68773|92209->68774|92239->68775|92309->68816|92339->68817|92369->68818|92527->68947|92557->68948|92587->68949|92649->68982|92679->68983|92709->68984|92867->69113|92897->69114|92927->69115|92993->69152|93023->69153|93056->69157|94587->70658|94618->70659|94668->70679|94699->70680|95199->71150|95230->71151|95261->71153|95611->71521|95670->71550|95780->71631|95830->71663|95872->71665|95922->71685|96010->71743|96041->71744|96090->71763|96336->71980|96353->71986|96387->71997|96419->72000|96436->72006|96472->72019|96583->72100|96614->72101|96663->72120|96729->72156|96760->72157|96811->72178|96891->72228|96922->72229|96975->72252|97233->72481|97250->72487|97284->72498|97316->72501|97333->72507|97369->72520|97482->72603|97513->72604|97564->72625|97599->72630|97630->72631|97683->72654|97963->72905|97980->72911|98014->72922|98046->72925|98063->72931|98099->72944|98213->73028|98244->73029|98293->73048|98324->73049|98373->73068|98439->73104|98470->73105|98521->73126|98596->73171|98627->73172|98680->73195|98938->73424|98955->73430|98989->73441|99021->73444|99038->73450|99074->73463|99187->73546|99218->73547|99269->73568|99304->73573|99335->73574|99388->73597|99668->73848|99685->73854|99719->73865|99751->73868|99768->73874|99804->73887|99918->73971|99949->73972|99998->73991|100029->73992|100078->74011|100144->74047|100175->74048|100226->74069|100309->74122|100340->74123|100393->74146|100651->74375|100668->74381|100702->74392|100734->74395|100751->74401|100787->74414|100900->74497|100931->74498|100982->74519|101017->74524|101048->74525|101101->74548|101381->74799|101398->74805|101432->74816|101464->74819|101481->74825|101517->74838|101631->74922|101662->74923|101711->74942|101742->74943|101791->74962|101857->74998|101888->74999|101939->75020|102015->75066|102046->75067|102099->75090|102357->75319|102374->75325|102408->75336|102440->75339|102457->75345|102493->75358|102606->75441|102637->75442|102688->75463|102723->75468|102754->75469|102807->75492|103087->75743|103104->75749|103138->75760|103170->75763|103187->75769|103223->75782|103337->75866|103368->75867|103417->75886|103448->75887|103497->75906|103563->75942|103594->75943|103645->75964|103896->76185|103927->76186|103978->76207|104236->76436|104253->76442|104287->76453|104319->76456|104336->76462|104372->76475|104485->76558|104516->76559|104567->76580|104602->76585|104633->76586|104684->76607|104958->76852|104975->76858|105009->76869|105041->76872|105058->76878|105094->76891|105208->76975|105239->76976|105288->76995|105319->76996|105383->77027|105443->77057|105621->77205|105652->77206|105731->77255|105762->77256|105821->77285|105951->77385|105982->77386|106033->77407|106064->77408|106113->77427|106144->77428|106192->77446|106223->77447|106267->77461|106351->77515|106382->77516|106412->77517|107356->78431|107387->78432|107438->78453|107595->78580|107626->78581|107660->78585|107691->78586|107742->78607|107840->78675|107871->78676|107918->78693|109007->79752|109038->79753|109113->79798|109144->79799|109192->79817|109270->79865|109301->79866|109352->79887|109432->79937|109463->79938|109511->79956|109577->79992|109608->79993|109659->80014|109865->80190|109896->80191|109975->80240|110006->80241|110054->80259|110175->80350|110206->80351|110261->80376|110292->80377|110335->80390|110395->80420|110426->80421|110473->80486|110520->80503|110606->80560|110656->80592|110698->80594|110729->80596|110779->80617|110809->80618|110841->80621|111051->80802|111068->80808|111102->80819|111134->80822|111151->80828|111187->80841|111279->80904|111309->80905|111339->80906|111373->80911|111403->80912|111435->80915|111577->81028|111607->81029|111641->81034|111857->81221|111874->81227|111908->81238|111940->81241|111957->81247|111993->81260|112087->81325|112117->81326|112149->81329|112183->81334|112213->81335|112247->81340|112479->81543|112496->81549|112530->81560|112562->81563|112579->81569|112615->81582|112710->81648|112740->81649|112770->81650|112800->81651|112859->81677|112907->81695|113049->81807|113080->81808|113124->81822|113172->81840|113203->81841|113250->81858|113332->81910|113363->81911|113397->81916|113476->81966|113493->81972|113543->81999|113798->82225|113814->82230|113851->82244|113947->82311|113963->82316|113998->82328|114090->82391|114106->82396|114141->82408|114241->82479|114257->82484|114301->82505|114531->82706|114548->82712|114608->82748|114866->83010|114913->83027|115020->83105|115037->83110|115073->83122|115265->83285|115281->83290|115328->83314|116881->84837|116898->84842|116935->84867|116962->84870|119921->87874|119976->87899|120645->88538|120662->88543|120698->88555|120932->88759|120949->88764|120995->88786|121227->88988|121244->88993|121289->89014|121725->89420|121742->89425|121779->89438|122901->90620|122976->90665|123844->91504|123860->91509|123896->91521|124015->91611|124031->91616|124077->91638|124195->91727|124211->91732|124256->91753|126568->94036|126617->94067|126659->94069|126730->94111|126794->94164|126835->94165|126911->94211|127191->94462|127207->94467|127241->94478|127272->94480|127288->94485|127326->94500|127494->94647|127509->94651|127550->94652|127625->94697|127920->94963|127936->94968|127970->94979|128001->94981|128017->94986|128055->95001|128235->95148|128307->95187|128372->95222|131298->98148|131349->98203|131400->98255|131452->98360|131507->98385
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|183->153|208->178|208->178|210->180|211->181|211->181|212->182|214->184|214->184|216->186|217->187|217->187|218->188|219->189|219->189|220->190|221->191|221->191|222->192|223->193|223->193|223->193|228->198|228->198|229->199|233->203|233->203|235->205|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|246->216|246->216|250->220|264->234|264->234|265->235|268->238|268->238|268->238|268->238|269->239|271->241|271->241|272->242|296->266|296->266|297->267|299->269|299->269|300->270|300->270|301->271|303->273|303->273|304->274|304->274|306->276|306->276|308->278|308->278|308->278|309->279|319->289|319->289|320->290|321->291|321->291|321->291|321->291|322->292|323->293|323->293|324->294|341->311|341->311|343->313|343->313|344->314|350->320|350->320|353->323|357->327|357->327|358->328|360->330|360->330|361->331|362->332|362->332|363->333|363->333|363->333|364->334|365->335|365->335|365->335|369->339|369->339|371->341|374->344|374->344|375->345|378->348|378->348|379->349|381->351|381->351|383->353|401->371|401->371|402->372|405->375|405->375|405->375|405->375|406->376|408->378|408->378|409->379|413->383|413->383|414->384|414->384|414->384|415->385|430->400|430->400|430->400|430->400|435->405|435->405|435->405|435->405|436->406|451->421|451->421|451->421|451->421|456->426|456->426|459->429|459->429|460->430|460->430|460->430|462->432|462->432|462->432|463->433|478->448|478->448|478->448|478->448|483->453|483->453|484->454|484->454|484->454|485->455|486->456|486->456|487->457|488->458|488->458|489->459|504->474|504->474|504->474|504->474|509->479|509->479|510->480|510->480|510->480|511->481|526->496|526->496|526->496|526->496|530->500|530->500|533->503|534->504|534->504|536->506|551->521|551->521|551->521|551->521|557->527|557->527|558->528|559->529|559->529|560->530|575->545|575->545|575->545|575->545|579->549|579->549|583->553|586->556|586->556|588->558|603->573|603->573|603->573|603->573|609->579|609->579|610->580|611->581|611->581|612->582|627->597|627->597|627->597|627->597|631->601|631->601|633->603|634->604|634->604|636->606|651->621|651->621|651->621|651->621|657->627|657->627|658->628|659->629|659->629|660->630|675->645|675->645|675->645|675->645|679->649|679->649|680->650|683->653|683->653|684->654|684->654|684->654|688->658|704->674|704->674|704->674|704->674|710->680|710->680|714->684|714->684|728->698|728->698|743->713|743->713|744->714|748->718|748->718|749->719|749->719|750->720|752->722|752->722|753->723|753->723|755->725|755->725|758->728|758->728|758->728|760->730|764->734|764->734|765->735|765->735|765->735|766->736|768->738|768->738|768->738|783->753|783->753|784->754|784->754|786->756|786->756|786->756|787->757|788->758|788->758|789->759|791->761|791->761|791->761|806->776|806->776|807->777|807->777|808->778|809->779|809->779|810->780|812->782|812->782|813->783|815->785|815->785|815->785|830->800|830->800|831->801|831->801|833->803|833->803|833->803|834->804|835->805|835->805|836->806|838->808|838->808|838->808|853->823|853->823|854->824|854->824|854->824|854->824|854->824|855->825|855->825|855->825|856->826|858->828|858->828|858->828|873->843|873->843|874->844|874->844|876->846|876->846|876->846|877->847|878->848|878->848|878->848|883->853|883->853|884->854|887->857|887->857|888->858|889->859|889->859|890->860|895->865|895->865|896->866|896->866|897->867|897->867|897->867|898->868|901->871|901->871|902->872|902->872|903->873|903->873|906->876|907->877|907->877|908->878|913->883|913->883|914->884|915->885|915->885|916->886|916->886|916->886|917->887|918->888|918->888|919->889|919->889|919->889|920->890|921->891|921->891|922->892|922->892|922->892|923->893|924->894|924->894|925->895|927->897|927->897|927->897|927->897|927->897|934->904|934->904|935->905|935->905|935->905|936->906|939->909|939->909|940->910|941->911|941->911|942->912|942->912|942->912|943->913|944->914|944->914|945->915|945->915|945->915|946->916|947->917|947->917|948->918|948->918|948->918|949->919|950->920|950->920|951->921|953->923|953->923|953->923|953->923|953->923|961->931|961->931|962->932|962->932|962->932|963->933|964->934|964->934|965->935|966->936|966->936|967->937|967->937|967->937|968->938|969->939|969->939|971->941|973->943|973->943|974->944|974->944|974->944|975->945|976->946|976->946|977->947|977->947|977->947|977->947|977->947|977->947|980->950|980->950|982->952|982->952|983->953|983->953|983->953|984->954|984->954|984->954|985->955|985->955|985->955|985->955|985->955|985->955|988->958|988->958|989->959|989->959|989->959|990->960|990->960|990->960|990->960|990->960|990->960|993->963|993->963|994->964|994->964|995->965|996->966|996->966|997->967|997->967|997->967|997->967|997->967|997->967|1000->970|1000->970|1001->971|1012->982|1012->982|1014->984|1016->986|1016->986|1017->987|1020->990|1020->990|1021->991|1021->991|1022->992|1025->995|1025->995|1026->996|1026->996|1027->997|1027->997|1029->999|1031->1001|1031->1001|1033->1003|1038->1008|1038->1008|1039->1009|1040->1010|1040->1010|1042->1012|1042->1012|1043->1013|1043->1013|1043->1013|1043->1013|1043->1013|1043->1013|1043->1013|1043->1013|1045->1015|1047->1017|1047->1017|1048->1018|1051->1021|1051->1021|1053->1023|1053->1023|1054->1024|1056->1026|1056->1026|1057->1027|1058->1028|1058->1028|1059->1029|1059->1029|1065->1035|1065->1035|1066->1036|1067->1037|1067->1037|1068->1038|1068->1038|1069->1039|1069->1039|1071->1041|1071->1041|1071->1041|1073->1043|1073->1043|1073->1043|1074->1044|1075->1045|1075->1045|1075->1045|1080->1050|1080->1050|1081->1051|1084->1054|1084->1054|1085->1055|1086->1056|1086->1056|1087->1057|1087->1057|1087->1057|1088->1058|1089->1059|1089->1059|1090->1060|1090->1060|1091->1061|1093->1063|1093->1063|1094->1064|1095->1065|1095->1065|1098->1068|1112->1082|1112->1082|1113->1083|1116->1086|1116->1086|1116->1086|1116->1086|1116->1086|1117->1087|1119->1089|1119->1089|1120->1090|1126->1096|1126->1096|1127->1097|1128->1098|1128->1098|1129->1099|1130->1100|1130->1100|1131->1101|1132->1102|1132->1102|1134->1104|1135->1105|1135->1105|1136->1106|1137->1107|1137->1107|1139->1109|1143->1113|1143->1113|1144->1114|1147->1117|1147->1117|1149->1119|1151->1121|1151->1121|1152->1122|1154->1124|1154->1124|1155->1125|1157->1127|1157->1127|1158->1128|1160->1130|1160->1130|1161->1131|1163->1133|1163->1133|1164->1134|1166->1136|1166->1136|1167->1137|1169->1139|1169->1139|1170->1140|1172->1142|1172->1142|1173->1143|1175->1145|1175->1145|1176->1146|1178->1148|1178->1148|1182->1152|1202->1172|1202->1172|1202->1172|1202->1172|1208->1178|1208->1178|1210->1180|1216->1186|1217->1187|1219->1189|1219->1189|1219->1189|1221->1191|1223->1193|1223->1193|1224->1194|1227->1197|1227->1197|1227->1197|1227->1197|1227->1197|1227->1197|1228->1198|1228->1198|1229->1199|1230->1200|1230->1200|1231->1201|1232->1202|1232->1202|1233->1203|1236->1206|1236->1206|1236->1206|1236->1206|1236->1206|1236->1206|1237->1207|1237->1207|1238->1208|1238->1208|1238->1208|1239->1209|1242->1212|1242->1212|1242->1212|1242->1212|1242->1212|1242->1212|1244->1214|1244->1214|1245->1215|1245->1215|1246->1216|1247->1217|1247->1217|1248->1218|1249->1219|1249->1219|1250->1220|1253->1223|1253->1223|1253->1223|1253->1223|1253->1223|1253->1223|1254->1224|1254->1224|1255->1225|1255->1225|1255->1225|1256->1226|1259->1229|1259->1229|1259->1229|1259->1229|1259->1229|1259->1229|1261->1231|1261->1231|1262->1232|1262->1232|1263->1233|1264->1234|1264->1234|1265->1235|1266->1236|1266->1236|1267->1237|1270->1240|1270->1240|1270->1240|1270->1240|1270->1240|1270->1240|1271->1241|1271->1241|1272->1242|1272->1242|1272->1242|1273->1243|1276->1246|1276->1246|1276->1246|1276->1246|1276->1246|1276->1246|1278->1248|1278->1248|1279->1249|1279->1249|1280->1250|1281->1251|1281->1251|1282->1252|1283->1253|1283->1253|1284->1254|1287->1257|1287->1257|1287->1257|1287->1257|1287->1257|1287->1257|1288->1258|1288->1258|1289->1259|1289->1259|1289->1259|1290->1260|1293->1263|1293->1263|1293->1263|1293->1263|1293->1263|1293->1263|1295->1265|1295->1265|1296->1266|1296->1266|1297->1267|1298->1268|1298->1268|1299->1269|1301->1271|1301->1271|1302->1272|1305->1275|1305->1275|1305->1275|1305->1275|1305->1275|1305->1275|1306->1276|1306->1276|1307->1277|1307->1277|1307->1277|1308->1278|1311->1281|1311->1281|1311->1281|1311->1281|1311->1281|1311->1281|1313->1283|1313->1283|1314->1284|1314->1284|1316->1286|1318->1288|1327->1297|1327->1297|1328->1298|1328->1298|1329->1299|1331->1301|1331->1301|1332->1302|1332->1302|1333->1303|1333->1303|1339->1309|1339->1309|1341->1311|1341->1311|1341->1311|1342->1312|1358->1328|1358->1328|1359->1329|1360->1330|1360->1330|1360->1330|1360->1330|1361->1331|1362->1332|1362->1332|1363->1333|1382->1352|1382->1352|1387->1357|1387->1357|1389->1359|1391->1361|1391->1361|1392->1362|1393->1363|1393->1363|1395->1365|1395->1365|1395->1365|1396->1366|1398->1368|1398->1368|1400->1370|1400->1370|1401->1371|1403->1373|1403->1373|1404->1374|1404->1374|1405->1375|1405->1375|1405->1375|1406->1376|1407->1377|1409->1379|1409->1379|1409->1379|1411->1381|1413->1383|1413->1383|1414->1384|1417->1387|1417->1387|1417->1387|1417->1387|1417->1387|1417->1387|1418->1388|1418->1388|1419->1389|1419->1389|1419->1389|1420->1390|1423->1393|1423->1393|1424->1394|1427->1397|1427->1397|1427->1397|1427->1397|1427->1397|1427->1397|1428->1398|1428->1398|1429->1399|1429->1399|1429->1399|1430->1400|1433->1403|1433->1403|1433->1403|1433->1403|1433->1403|1433->1403|1435->1405|1435->1405|1436->1406|1436->1406|1445->1415|1447->1417|1450->1420|1450->1420|1452->1422|1452->1422|1452->1422|1453->1423|1455->1425|1455->1425|1456->1426|1457->1427|1457->1427|1457->1427|1460->1430|1460->1430|1460->1430|1461->1431|1461->1431|1461->1431|1462->1432|1462->1432|1462->1432|1463->1433|1463->1433|1463->1433|1468->1438|1468->1438|1468->1438|1476->1446|1477->1447|1477->1447|1477->1447|1477->1447|1480->1450|1480->1450|1480->1450|1503->1473|1503->1473|1503->1473|1503->1473|1573->1543|1574->1544|1591->1561|1591->1561|1591->1561|1593->1563|1593->1563|1593->1563|1595->1565|1595->1565|1595->1565|1600->1570|1600->1570|1600->1570|1623->1593|1626->1596|1636->1606|1636->1606|1636->1606|1637->1607|1637->1607|1637->1607|1638->1608|1638->1608|1638->1608|1676->1646|1676->1646|1676->1646|1677->1647|1677->1647|1677->1647|1679->1649|1682->1652|1682->1652|1682->1652|1682->1652|1682->1652|1682->1652|1684->1654|1684->1654|1684->1654|1685->1655|1688->1658|1688->1658|1688->1658|1688->1658|1688->1658|1688->1658|1690->1660|1692->1662|1695->1665|1766->1736|1767->1737|1768->1738|1769->1739|1774->1744
                  -- GENERATED --
              */
          