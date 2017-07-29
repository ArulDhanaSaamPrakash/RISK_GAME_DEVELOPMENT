
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
            height:200px;
            width: 230px;
            top:390px;
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





        """),format.raw/*154.9*/("""</style>


    </head>
    <script>


            function myfunc() """),format.raw/*161.31*/("""{"""),format.raw/*161.32*/("""

                """),format.raw/*163.17*/("""alert("aaaaaaaa");
            """),format.raw/*164.13*/("""}"""),format.raw/*164.14*/("""
            """),format.raw/*165.13*/("""var lastclickedTab;

            function onProjectStepTabClick()"""),format.raw/*167.45*/("""{"""),format.raw/*167.46*/("""

                """),format.raw/*169.17*/("""lastclickedTab="projectStep";
            """),format.raw/*170.13*/("""}"""),format.raw/*170.14*/("""
            """),format.raw/*171.13*/("""function onRiskDashboardClick()"""),format.raw/*171.44*/("""{"""),format.raw/*171.45*/("""
                """),format.raw/*172.17*/("""lastclickedTab="riskDashboard";
                $.ajax("""),format.raw/*173.24*/("""{"""),format.raw/*173.25*/("""
                    """),format.raw/*174.21*/("""type: 'POST',
                    url: '"""),_display_(/*175.28*/routes/*175.34*/.GameController.getRiskCards()),format.raw/*175.64*/("""',
//                     data : '',
                    data: JSON.stringify(''),
                    // dataType: 'json',
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*180.46*/("""{"""),format.raw/*180.47*/("""
"""),format.raw/*181.1*/("""//                        alert(data);
                        var result = " ";
                        $("#grid-basic tbody") .empty();
                        var firstRisk=data[0].riskId;
                        for (i = 0; i < data.length; i++) """),format.raw/*185.59*/("""{"""),format.raw/*185.60*/("""

                            """),format.raw/*187.29*/("""var obj = data[i];
//                            obj.isComplete = obj.isComplete === 'false' ? "Not Completed" : "Completed";
                            var isCompleted="";
                            var isDisabled="";
//                            alert(obj.budget+" "+obj.personnel);
                            if(obj.complete)"""),format.raw/*192.45*/("""{"""),format.raw/*192.46*/("""
"""),format.raw/*193.1*/("""//                                alert('object is true')
                                isCompleted="Completed"
                                isDisabled="disabled='true'";
                            """),format.raw/*196.29*/("""}"""),format.raw/*196.30*/("""else"""),format.raw/*196.34*/("""{"""),format.raw/*196.35*/("""
                                """),format.raw/*197.33*/("""isCompleted="Pending"
                            """),format.raw/*198.29*/("""}"""),format.raw/*198.30*/("""



                            """),format.raw/*202.29*/("""var eligibleBudget=0;
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*216.81*/("""{"""),format.raw/*216.82*/("""
                                """),format.raw/*217.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*220.29*/("""}"""),format.raw/*220.30*/("""else"""),format.raw/*220.34*/("""{"""),format.raw/*220.35*/("""
                                """),format.raw/*221.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*223.29*/("""}"""),format.raw/*223.30*/("""
"""),format.raw/*224.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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

                        """),format.raw/*247.25*/("""}"""),format.raw/*247.26*/("""
                        """),format.raw/*248.25*/("""document.getElementById('risks').innerHTML = result;
                        onRiskClick(firstRisk);
                    """),format.raw/*250.21*/("""}"""),format.raw/*250.22*/(""",
                    error: function (data) """),format.raw/*251.44*/("""{"""),format.raw/*251.45*/("""
                        """),format.raw/*252.25*/("""alert("error");
                        //setError('Make call failed');
                    """),format.raw/*254.21*/("""}"""),format.raw/*254.22*/("""
                """),format.raw/*255.17*/("""}"""),format.raw/*255.18*/(""");

            """),format.raw/*257.13*/("""}"""),format.raw/*257.14*/("""

            """),format.raw/*259.13*/("""$(document).on("click", ".open-riskDialog", function () """),format.raw/*259.69*/("""{"""),format.raw/*259.70*/("""
             """),format.raw/*260.14*/("""//   alert($(this).data('risk'));

//                var title = $(this).data('title');

                var riskId=$(this).data('risk');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*270.42*/("""{"""),format.raw/*270.43*/("""
                    """),format.raw/*271.21*/("""document.getElementById("isRiskDisabled").innerHTML="You don't have enough resources to mitigate this risk!";
                """),format.raw/*272.17*/("""}"""),format.raw/*272.18*/("""else"""),format.raw/*272.22*/("""{"""),format.raw/*272.23*/("""
                    """),format.raw/*273.21*/("""document.getElementById("isRiskDisabled").innerHTML="";
                """),format.raw/*274.17*/("""}"""),format.raw/*274.18*/("""
                """),format.raw/*275.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*292.13*/("""}"""),format.raw/*292.14*/(""");

            function onMitigateRisk(id)"""),format.raw/*294.40*/("""{"""),format.raw/*294.41*/("""
"""),format.raw/*295.1*/("""//                alert(id);
                onRiskClick(id);
                onPerformStep(id);

                $('#btnMitigateRisk').val(id);
                $('#btnMitigateRisk').trigger('click');
            """),format.raw/*301.13*/("""}"""),format.raw/*301.14*/("""


            """),format.raw/*304.13*/("""var riskClicked="";
            var totalSteps=0;
            var stepsDone=0;
            var onlyPlanning=true;
            function onRiskClick(id)"""),format.raw/*308.37*/("""{"""),format.raw/*308.38*/("""
"""),format.raw/*309.1*/("""//                alert("fghjh "+id);
                riskClicked=id;
                var obj = """),format.raw/*311.27*/("""{"""),format.raw/*311.28*/("""
                    """),format.raw/*312.21*/("""'riskid': id
                """),format.raw/*313.17*/("""}"""),format.raw/*313.18*/("""
                """),format.raw/*314.17*/("""$.ajax("""),format.raw/*314.24*/("""{"""),format.raw/*314.25*/("""
                    """),format.raw/*315.21*/("""type: 'POST',
                    url: '"""),_display_(/*316.28*/routes/*316.34*/.GameController.getMitigationSteps()),format.raw/*316.70*/("""',
//                     data : '',
                    data: JSON.stringify(obj),
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*320.46*/("""{"""),format.raw/*320.47*/("""

                        """),format.raw/*322.25*/("""totalSteps=data.length;
                        stepsDone=0;
                        var result = "";
                        for (i = 0; i < data.length; i++) """),format.raw/*325.59*/("""{"""),format.raw/*325.60*/("""
                            """),format.raw/*326.29*/("""var obj = data[i];

                            var status;
                            if(obj.status)"""),format.raw/*329.43*/("""{"""),format.raw/*329.44*/("""
                                """),format.raw/*330.33*/("""stepsDone++;
                                obj.status="disabled='true'";
                            """),format.raw/*332.29*/("""}"""),format.raw/*332.30*/("""

"""),format.raw/*334.1*/("""//                                result= result+"<h1>"+obj.projectStepName+"</h1>";
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*352.81*/("""{"""),format.raw/*352.82*/("""
                                """),format.raw/*353.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*356.29*/("""}"""),format.raw/*356.30*/("""else"""),format.raw/*356.34*/("""{"""),format.raw/*356.35*/("""
                                """),format.raw/*357.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*359.29*/("""}"""),format.raw/*359.30*/("""
"""),format.raw/*360.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);
                            if(onlyPlanning)"""),format.raw/*364.45*/("""{"""),format.raw/*364.46*/("""
                                """),format.raw/*365.33*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*365.62*/("""{"""),format.raw/*365.63*/("""
                                    """),format.raw/*366.37*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*381.59*/("""{"""),format.raw/*381.60*/("""'id':12,'todo':'xyz'"""),format.raw/*381.80*/("""}"""),format.raw/*381.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*386.33*/("""}"""),format.raw/*386.34*/("""else"""),format.raw/*386.38*/("""{"""),format.raw/*386.39*/("""
                                    """),format.raw/*387.37*/("""result = result + "<button disabled" +
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
//                                            "data-todo='"""),format.raw/*402.59*/("""{"""),format.raw/*402.60*/("""'id':12,'todo':'xyz'"""),format.raw/*402.80*/("""}"""),format.raw/*402.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*407.33*/("""}"""),format.raw/*407.34*/("""


                            """),format.raw/*410.29*/("""}"""),format.raw/*410.30*/("""else"""),format.raw/*410.34*/("""{"""),format.raw/*410.35*/("""
                                """),format.raw/*411.33*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*426.59*/("""{"""),format.raw/*426.60*/("""'id':12,'todo':'xyz'"""),format.raw/*426.80*/("""}"""),format.raw/*426.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button>";
//
                            """),format.raw/*431.29*/("""}"""),format.raw/*431.30*/("""


                        """),format.raw/*434.25*/("""}"""),format.raw/*434.26*/("""
"""),format.raw/*435.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*439.21*/("""}"""),format.raw/*439.22*/(""",
                    error: function (data) """),format.raw/*440.44*/("""{"""),format.raw/*440.45*/("""
                        """),format.raw/*441.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*443.21*/("""}"""),format.raw/*443.22*/("""
                """),format.raw/*444.17*/("""}"""),format.raw/*444.18*/(""");

            """),format.raw/*446.13*/("""}"""),format.raw/*446.14*/("""


            """),format.raw/*449.13*/("""function onPerformStep(id)"""),format.raw/*449.39*/("""{"""),format.raw/*449.40*/("""

"""),format.raw/*451.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*455.43*/("""{"""),format.raw/*455.44*/("""
                    """),format.raw/*456.21*/("""var obj = """),format.raw/*456.31*/("""{"""),format.raw/*456.32*/("""
                        """),format.raw/*457.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*459.35*/model/*459.40*/.getGameId),format.raw/*459.50*/(""",
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
                    """),format.raw/*474.21*/("""}"""),format.raw/*474.22*/(""";
                """),format.raw/*475.17*/("""}"""),format.raw/*475.18*/("""

                """),format.raw/*477.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*477.77*/("""{"""),format.raw/*477.78*/("""
"""),format.raw/*478.1*/("""//                    alert(id);
                    var obj = """),format.raw/*479.31*/("""{"""),format.raw/*479.32*/("""
                        """),format.raw/*480.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*482.35*/model/*482.40*/.getGameId),format.raw/*482.50*/(""",
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
                    """),format.raw/*497.21*/("""}"""),format.raw/*497.22*/(""";
                """),format.raw/*498.17*/("""}"""),format.raw/*498.18*/("""

                """),format.raw/*500.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*500.49*/("""{"""),format.raw/*500.50*/("""
"""),format.raw/*501.1*/("""//                    alert(id);
                    var obj = """),format.raw/*502.31*/("""{"""),format.raw/*502.32*/("""
                        """),format.raw/*503.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*505.35*/model/*505.40*/.getGameId),format.raw/*505.50*/(""",
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
                    """),format.raw/*520.21*/("""}"""),format.raw/*520.22*/(""";
                """),format.raw/*521.17*/("""}"""),format.raw/*521.18*/(""" """),format.raw/*521.19*/("""else"""),format.raw/*521.23*/("""{"""),format.raw/*521.24*/("""
                    """),format.raw/*522.21*/("""var obj = """),format.raw/*522.31*/("""{"""),format.raw/*522.32*/("""
                        """),format.raw/*523.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*525.35*/model/*525.40*/.getGameId),format.raw/*525.50*/(""",
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
                    """),format.raw/*540.21*/("""}"""),format.raw/*540.22*/(""";
                """),format.raw/*541.17*/("""}"""),format.raw/*541.18*/("""

                """),format.raw/*543.17*/("""$.ajax("""),format.raw/*543.24*/("""{"""),format.raw/*543.25*/("""
                    """),format.raw/*544.21*/("""type: 'POST',
                    url: '"""),_display_(/*545.28*/routes/*545.34*/.GameController.performStep()),format.raw/*545.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*550.46*/("""{"""),format.raw/*550.47*/("""
                        """),format.raw/*551.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*553.50*/("""{"""),format.raw/*553.51*/("""
"""),format.raw/*554.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*555.34*/("""{"""),format.raw/*555.35*/("""
                                        """),format.raw/*556.41*/("""title: "",
                                        text: "You ended the game with budget "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*561.37*/("""}"""),format.raw/*561.38*/(""",
                                    function(isConfirm)"""),format.raw/*562.56*/("""{"""),format.raw/*562.57*/("""
                                        """),format.raw/*563.41*/("""if (isConfirm) """),format.raw/*563.56*/("""{"""),format.raw/*563.57*/("""
"""),format.raw/*564.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*567.41*/("""}"""),format.raw/*567.42*/("""
                                    """),format.raw/*568.37*/("""}"""),format.raw/*568.38*/(""");
                        """),format.raw/*569.25*/("""}"""),format.raw/*569.26*/("""


                       """),format.raw/*572.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*573.25*/("""{"""),format.raw/*573.26*/("""
                           """),format.raw/*574.28*/("""// $('#updateactivity').trigger('click');

                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*578.56*/("""{"""),format.raw/*578.57*/("""
                                """),format.raw/*579.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*580.29*/("""}"""),format.raw/*580.30*/("""
                            """),format.raw/*581.29*/("""if(data.oops_points !=0) """),format.raw/*581.54*/("""{"""),format.raw/*581.55*/("""
                                """),format.raw/*582.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*583.29*/("""}"""),format.raw/*583.30*/("""
                            """),format.raw/*584.29*/("""if(data.oops_bonus !=0) """),format.raw/*584.53*/("""{"""),format.raw/*584.54*/("""
                                """),format.raw/*585.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*586.29*/("""}"""),format.raw/*586.30*/("""
                            """),format.raw/*587.29*/("""if(data.oops_budget !=0) """),format.raw/*587.54*/("""{"""),format.raw/*587.55*/("""
                                """),format.raw/*588.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*589.29*/("""}"""),format.raw/*589.30*/("""
                            """),format.raw/*590.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                           // swal("""),format.raw/*592.36*/("""{"""),format.raw/*592.37*/("""   """),format.raw/*592.40*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*592.128*/("""}"""),format.raw/*592.129*/(""");
                            document.getElementById('swalmessages').innerHTML = alertmsg;
                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*599.25*/("""}"""),format.raw/*599.26*/("""
                        """),format.raw/*600.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*600.61*/("""{"""),format.raw/*600.62*/("""

                            """),format.raw/*602.29*/("""var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*604.60*/("""{"""),format.raw/*604.61*/("""
                                """),format.raw/*605.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*606.29*/("""}"""),format.raw/*606.30*/("""
                            """),format.raw/*607.29*/("""if(data.surprise_points !=0) """),format.raw/*607.58*/("""{"""),format.raw/*607.59*/("""
                                """),format.raw/*608.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*609.29*/("""}"""),format.raw/*609.30*/("""
                            """),format.raw/*610.29*/("""if(data.surprise_bonus !=0) """),format.raw/*610.57*/("""{"""),format.raw/*610.58*/("""
                                """),format.raw/*611.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*612.29*/("""}"""),format.raw/*612.30*/("""
                            """),format.raw/*613.29*/("""if(data.surprise_budget !=0) """),format.raw/*613.58*/("""{"""),format.raw/*613.59*/("""
                                """),format.raw/*614.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*615.29*/("""}"""),format.raw/*615.30*/("""
                            """),format.raw/*616.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            //swal("""),format.raw/*618.36*/("""{"""),format.raw/*618.37*/("""   """),format.raw/*618.40*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*618.135*/("""}"""),format.raw/*618.136*/(""");
                            //var temp="Got a Suprise card";
                            document.getElementById('swalmessages').innerHTML = alertmsg;
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*626.25*/("""}"""),format.raw/*626.26*/("""
                        """),format.raw/*627.25*/("""else if(data.steptype == "production")"""),format.raw/*627.63*/("""{"""),format.raw/*627.64*/("""
                            """),format.raw/*628.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*629.52*/("""{"""),format.raw/*629.53*/("""
                                """),format.raw/*630.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*631.29*/("""}"""),format.raw/*631.30*/("""
                            """),format.raw/*632.29*/("""else"""),format.raw/*632.33*/("""{"""),format.raw/*632.34*/("""
                                """),format.raw/*633.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*634.29*/("""}"""),format.raw/*634.30*/("""

                            """),format.raw/*636.29*/("""//swal(alertmsg);
                                document.getElementById('swalmessages').innerHTML = alertmsg;
                        """),format.raw/*638.25*/("""}"""),format.raw/*638.26*/("""
                        """),format.raw/*639.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*639.61*/("""{"""),format.raw/*639.62*/("""
                            """),format.raw/*640.29*/("""if($('#btnIsProduction').val() != "true")"""),format.raw/*640.70*/("""{"""),format.raw/*640.71*/("""
                                """),format.raw/*641.33*/("""//swal("""),format.raw/*641.40*/("""{"""),format.raw/*641.41*/("""   """),format.raw/*641.44*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*641.118*/("""}"""),format.raw/*641.119*/(""");
                                var temp1="Skipped turn";
                                document.getElementById('swalmessages').innerHTML = temp1;
                            """),format.raw/*644.29*/("""}"""),format.raw/*644.30*/("""

                        """),format.raw/*646.25*/("""}"""),format.raw/*646.26*/("""
                        """),format.raw/*647.25*/("""else if(data.steptype == "risk")"""),format.raw/*647.57*/("""{"""),format.raw/*647.58*/("""
                            """),format.raw/*648.29*/("""if(data.risk_status == "success")"""),format.raw/*648.62*/("""{"""),format.raw/*648.63*/("""
                                """),format.raw/*649.33*/("""//swal("""),format.raw/*649.40*/("""{"""),format.raw/*649.41*/("""   """),format.raw/*649.44*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*649.142*/("""}"""),format.raw/*649.143*/(""");
                                var temp2="Risk was mitigated";
                                document.getElementById('swalmessages').innerHTML = temp2;
                            """),format.raw/*652.29*/("""}"""),format.raw/*652.30*/("""
                            """),format.raw/*653.29*/("""else"""),format.raw/*653.33*/("""{"""),format.raw/*653.34*/("""
                                """),format.raw/*654.33*/("""//swal("""),format.raw/*654.40*/("""{"""),format.raw/*654.41*/("""   """),format.raw/*654.44*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*654.127*/("""}"""),format.raw/*654.128*/(""");
                                var temp3="Risk not mitigated";
                                document.getElementById('swalmessages').innerHTML = temp3;
                            """),format.raw/*657.29*/("""}"""),format.raw/*657.30*/("""
                        """),format.raw/*658.25*/("""}"""),format.raw/*658.26*/("""
                        """),format.raw/*659.25*/("""else
                        """),format.raw/*660.25*/("""{"""),format.raw/*660.26*/("""
                            """),format.raw/*661.29*/("""//swal("""),format.raw/*661.36*/("""{"""),format.raw/*661.37*/("""   """),format.raw/*661.40*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*661.134*/("""}"""),format.raw/*661.135*/(""");
                            var temp4="Project Step Successful";
                            document.getElementById('swalmessages').innerHTML = temp4;
                        """),format.raw/*664.25*/("""}"""),format.raw/*664.26*/("""
                        """),format.raw/*665.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*676.91*/("""{"""),format.raw/*676.92*/("""

                            """),format.raw/*678.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*680.25*/("""}"""),format.raw/*680.26*/("""
                        """),format.raw/*681.25*/("""refreshProjectSteps();


                    """),format.raw/*684.21*/("""}"""),format.raw/*684.22*/(""",
                    error: function (data) """),format.raw/*685.44*/("""{"""),format.raw/*685.45*/("""
                      """),format.raw/*686.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*689.21*/("""}"""),format.raw/*689.22*/("""
                """),format.raw/*690.17*/("""}"""),format.raw/*690.18*/(""");
            """),format.raw/*691.13*/("""}"""),format.raw/*691.14*/("""

            """),format.raw/*693.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*695.47*/("""{"""),format.raw/*695.48*/("""

                 """),format.raw/*697.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*702.27*/("""{"""),format.raw/*702.28*/("""
                    """),format.raw/*703.21*/("""'phaseId': clicked_id
                """),format.raw/*704.17*/("""}"""),format.raw/*704.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*706.43*/("""{"""),format.raw/*706.44*/("""
                    """),format.raw/*707.21*/("""swal("""),format.raw/*707.26*/("""{"""),format.raw/*707.27*/("""   """),format.raw/*707.30*/("""title: "Are you sure!!!",   text: "Do you want to move to Production?",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes",   closeOnConfirm: false """),format.raw/*707.232*/("""}"""),format.raw/*707.233*/(""", function()"""),format.raw/*707.245*/("""{"""),format.raw/*707.246*/("""

               """),format.raw/*709.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*711.74*/("""{"""),format.raw/*711.75*/("""
                            """),format.raw/*712.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*715.25*/("""}"""),format.raw/*715.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*717.61*/("""{"""),format.raw/*717.62*/("""
                            """),format.raw/*718.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*720.54*/("""{"""),format.raw/*720.55*/("""
                                """),format.raw/*721.33*/("""riskcount++;
                            """),format.raw/*722.29*/("""}"""),format.raw/*722.30*/("""
                        """),format.raw/*723.25*/("""}"""),format.raw/*723.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*729.48*/("""{"""),format.raw/*729.49*/("""
                        """),format.raw/*730.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*731.21*/("""}"""),format.raw/*731.22*/("""
                        """),format.raw/*732.25*/("""}"""),format.raw/*732.26*/(""");
                """),format.raw/*733.17*/("""}"""),format.raw/*733.18*/("""

                """),format.raw/*735.17*/("""else """),format.raw/*735.22*/("""{"""),format.raw/*735.23*/("""

                    """),format.raw/*737.21*/("""$.ajax("""),format.raw/*737.28*/("""{"""),format.raw/*737.29*/("""
                        """),format.raw/*738.25*/("""type: 'POST',
                        url: '"""),_display_(/*739.32*/routes/*739.38*/.GameController.getProjectSteps()),format.raw/*739.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*744.50*/("""{"""),format.raw/*744.51*/("""
"""),format.raw/*745.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*748.63*/("""{"""),format.raw/*748.64*/("""
                                """),format.raw/*749.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*750.61*/("""{"""),format.raw/*750.62*/("""
                                    """),format.raw/*751.37*/("""if (obj.status) """),format.raw/*751.53*/("""{"""),format.raw/*751.54*/("""
                                        """),format.raw/*752.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*753.37*/("""}"""),format.raw/*753.38*/("""
                                """),format.raw/*754.33*/("""}"""),format.raw/*754.34*/("""
"""),format.raw/*755.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*757.49*/("""{"""),format.raw/*757.50*/("""
                                    """),format.raw/*758.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*759.33*/("""}"""),format.raw/*759.34*/("""


                                """),format.raw/*762.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*776.91*/("""{"""),format.raw/*776.92*/("""
                                    """),format.raw/*777.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*780.33*/("""}"""),format.raw/*780.34*/(""" """),format.raw/*780.35*/("""else """),format.raw/*780.40*/("""{"""),format.raw/*780.41*/("""
                                    """),format.raw/*781.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*783.33*/("""}"""),format.raw/*783.34*/("""
"""),format.raw/*784.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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
//                                            "data-todo='"""),format.raw/*804.59*/("""{"""),format.raw/*804.60*/("""'id':12,'todo':'xyz'"""),format.raw/*804.80*/("""}"""),format.raw/*804.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*810.29*/("""}"""),format.raw/*810.30*/("""

"""),format.raw/*812.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;

                        """),format.raw/*817.25*/("""}"""),format.raw/*817.26*/(""",
                        error: function (data) """),format.raw/*818.48*/("""{"""),format.raw/*818.49*/("""
                            """),format.raw/*819.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*821.25*/("""}"""),format.raw/*821.26*/("""
                    """),format.raw/*822.21*/("""}"""),format.raw/*822.22*/(""");
                """),format.raw/*823.17*/("""}"""),format.raw/*823.18*/("""
            """),format.raw/*824.13*/("""}"""),format.raw/*824.14*/("""

            """),format.raw/*826.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*826.67*/("""{"""),format.raw/*826.68*/("""
"""),format.raw/*827.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*843.42*/("""{"""),format.raw/*843.43*/("""
                    """),format.raw/*844.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*845.17*/("""}"""),format.raw/*845.18*/("""else"""),format.raw/*845.22*/("""{"""),format.raw/*845.23*/("""
                    """),format.raw/*846.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*847.17*/("""}"""),format.raw/*847.18*/("""
                """),format.raw/*848.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*867.13*/("""}"""),format.raw/*867.14*/(""");




            function totalGameTimer() """),format.raw/*872.39*/("""{"""),format.raw/*872.40*/("""

                """),format.raw/*874.17*/("""var sec = 0;

                function pad(val) """),format.raw/*876.35*/("""{"""),format.raw/*876.36*/("""
                    """),format.raw/*877.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*878.17*/("""}"""),format.raw/*878.18*/("""

                """),format.raw/*880.17*/("""var timer = setInterval(function () """),format.raw/*880.53*/("""{"""),format.raw/*880.54*/("""
                    """),format.raw/*881.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*883.17*/("""}"""),format.raw/*883.18*/(""", 1000);

                setTimeout(function () """),format.raw/*885.40*/("""{"""),format.raw/*885.41*/("""
                    """),format.raw/*886.21*/("""clearInterval(timer);
                """),format.raw/*887.17*/("""}"""),format.raw/*887.18*/(""", 50000000);
            """),format.raw/*888.13*/("""}"""),format.raw/*888.14*/("""
            """),format.raw/*889.13*/("""function refreshProjectSteps()"""),format.raw/*889.43*/("""{"""),format.raw/*889.44*/("""
                """),format.raw/*890.65*/("""
                """),format.raw/*891.17*/("""var result="";
            """),_display_(/*892.14*/for(phases <- model.getPhases()) yield /*892.46*/ {_display_(Seq[Any](format.raw/*892.48*/("""

                """),format.raw/*894.17*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                        "style='background-color: #DB8B00 !important;'" +
                        "onclick='onPhaseClick(id)' " +
                        "id='"""),_display_(/*897.31*/phases/*897.37*/.getPhaseId),format.raw/*897.48*/("""'>"""),_display_(/*897.51*/phases/*897.57*/.getPhaseName),format.raw/*897.70*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";


                """)))}),format.raw/*900.18*/("""
                """),format.raw/*901.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*904.13*/("""}"""),format.raw/*904.14*/("""

            """),format.raw/*906.13*/("""function newfunc()"""),format.raw/*906.31*/("""{"""),format.raw/*906.32*/("""
                """),format.raw/*907.17*/("""swal("", "Do not refresh the screen");

            """),format.raw/*909.13*/("""}"""),format.raw/*909.14*/("""
    """),format.raw/*910.5*/("""</script>
    <body style="background-image: url("""),_display_(/*911.41*/routes/*911.47*/.Assets.at("images/bg.jpg")),format.raw/*911.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*914.68*/model/*914.73*/.getUserName()),format.raw/*914.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*915.64*/model/*915.69*/.getGameId()),format.raw/*915.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*916.60*/model/*916.65*/.getTurnNo()),format.raw/*916.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*917.68*/model/*917.73*/.getTimeForEachMove()),format.raw/*917.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" style="padding: 0px 0px 0px 0px !important;">

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*922.64*/routes/*922.70*/.DashboardController.viewDashboard()),format.raw/*922.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*930.51*/("""
                """),format.raw/*931.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*931.95*/model/*931.100*/.getGameId()),format.raw/*931.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*934.44*/model/*934.49*/.getStepsForEachPlayer()),format.raw/*934.73*/("""</span>
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
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*957.126*/model/*957.131*/.getUserName().split("@")/*957.156*/(0)),format.raw/*957.159*/("""!</div>
                </div>
            </header>




            <div class="col-xs-12" style="height: 10px;"></div>

            <header>

                    <!--// start of big1 div -->
                <div class="col-md-2" style="border-right: 1px dashed #969C9E;padding: 0px 0px 0px 0px !important;">

                  <div class="panel panel-default">
                      <div class="panel-heading" style="background-color: #A8A2A3">
                          <h4 class="panel-title">Action Details</h4>
                      </div>
                      <div class="panel-body" style="height: 150px; overflow-wrap: break-word;text-align:justify;">
                          <div style=" display: inline-block;text-align:center;">Current Turn No: </div>

                 <div style=" display: inline-block;text-align:justify" id="turnNo">1</div>

                          <input type ="text" hidden id="btnIsProduction" value="false"/>
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
                            """),format.raw/*1021.105*/("""
                        """),format.raw/*1022.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1039.126*/model/*1039.131*/.getBudget()),format.raw/*1039.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1041.141*/model/*1041.146*/.getCapabilityPoints()),format.raw/*1041.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1043.139*/model/*1043.144*/.getCapabilityBonus()),format.raw/*1043.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1048.180*/model/*1048.185*/.getResources),format.raw/*1048.198*/("""</div>
                                                  <div>No. of resources who will return after </div>
                                                  <div style=" display: inline-block;">One Turn:</div><div style=" display: inline-block; float: right" id="oneTurn">0</div><br/>
                                                  <div style=" display: inline-block;">Two Turns:</div><div style=" display: inline-block; float: right" id="twoTurn">0</div>

                                                </div>
                                                <div style="display:inline-block;position:absolute;top:0;right:0;">

                                                  <div class="col-md-3 mytimer" style="padding:0; zoom: 50%;
                                                   -moz-transform: scale(0.5);
                                                   -webkit-transform: scale(0.5);" hidden>

                                                  </div>
                                                  <input type ="text" hidden id="btnIsProduction" value="false"/>



                                                </div>

                                          </div>


<div></div>


                                              """),format.raw/*1073.138*/("""


                                          """),format.raw/*1076.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1086.83*/model/*1086.88*/.getBudget()),format.raw/*1086.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1087.84*/model/*1087.89*/.getCapabilityPoints()),format.raw/*1087.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1088.83*/model/*1088.88*/.getCapabilityBonus()),format.raw/*1088.109*/("""</div>
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


                                    """),_display_(/*1126.38*/for(phase <- model.getPhases()) yield /*1126.69*/ {_display_(Seq[Any](format.raw/*1126.71*/("""
                                        """),_display_(/*1127.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1127.95*/{_display_(Seq[Any](format.raw/*1127.96*/("""

                                            """),format.raw/*1129.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1132.49*/phase/*1132.54*/.getPhaseId),format.raw/*1132.65*/(""">"""),_display_(/*1132.67*/phase/*1132.72*/.getPhaseName()),format.raw/*1132.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1134.42*/else/*1134.46*/{_display_(Seq[Any](format.raw/*1134.47*/("""
                                            """),format.raw/*1135.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1138.49*/phase/*1138.54*/.getPhaseId),format.raw/*1138.65*/(""">"""),_display_(/*1138.67*/phase/*1138.72*/.getPhaseName()),format.raw/*1138.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1140.42*/("""

                                    """)))}),format.raw/*1142.38*/("""


                                """),format.raw/*1145.33*/("""</div>





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
                    """),format.raw/*1216.51*/("""
                    """),format.raw/*1217.55*/("""
                    """),format.raw/*1218.52*/("""
                    """),format.raw/*1219.105*/("""




                    """),format.raw/*1224.21*/("""<div class="panel panel-default" >
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
                  DATE: Sat Jul 29 16:07:47 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: 0ea3c8775880695161cdbfa5765dc17ce3980df8
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3951->2485|3980->2486|4017->2496|4048->2499|4077->2500|4118->2513|4208->2576|4237->2577|4274->2587|4319->2604|4348->2605|4389->2618|4479->2681|4508->2682|4545->2692|4586->2705|4615->2706|4656->2719|4799->2834|4828->2835|4865->2845|5018->2970|5047->2971|5088->2984|5200->3069|5229->3070|5265->3079|5352->3138|5381->3139|5422->3152|5534->3237|5563->3238|5600->3248|5691->3311|5720->3312|5761->3325|5873->3410|5902->3411|5939->3421|5977->3431|6006->3432|6047->3445|6159->3530|6188->3531|6224->3540|6255->3543|6284->3544|6314->3547|6426->3632|6454->3633|6494->3646|6532->3656|6561->3657|6602->3670|6996->4037|7025->4038|7061->4047|7105->4063|7134->4064|7175->4077|7368->4242|7398->4243|7435->4252|7508->4296|7538->4297|7580->4310|7850->4552|7880->4553|7918->4563|8027->4644|8057->4645|8099->4658|8323->4854|8353->4855|8391->4865|8431->4876|8461->4877|8503->4890|9075->5434|9105->5435|9142->5444|9182->5455|9212->5456|9254->5469|9617->5804|9647->5805|9685->5815|9731->5832|9761->5833|9803->5846|10024->6039|10054->6040|10091->6049|10132->6061|10162->6062|10204->6075|10474->6317|10504->6318|10546->6332|10643->6400|10673->6401|10720->6419|10780->6450|10810->6451|10852->6464|10946->6529|10976->6530|11023->6548|11094->6590|11124->6591|11166->6604|11226->6635|11256->6636|11302->6653|11386->6708|11416->6709|11466->6730|11535->6771|11551->6777|11603->6807|11854->7029|11884->7030|11913->7031|12192->7281|12222->7282|12281->7312|12642->7644|12672->7645|12701->7646|12934->7850|12964->7851|12997->7855|13027->7856|13089->7889|13168->7939|13198->7940|13259->7972|14345->9029|14375->9030|14437->9063|14677->9274|14707->9275|14740->9279|14770->9280|14832->9313|14962->9414|14992->9415|15021->9416|16576->10942|16606->10943|16660->10968|16810->11089|16840->11090|16914->11135|16944->11136|16998->11161|17119->11253|17149->11254|17195->11271|17225->11272|17270->11288|17300->11289|17343->11303|17428->11359|17458->11360|17501->11374|18020->11864|18050->11865|18100->11886|18255->12012|18285->12013|18318->12017|18348->12018|18398->12039|18499->12111|18529->12112|18575->12129|19425->12950|19455->12951|19527->12994|19557->12995|19586->12996|19828->13209|19858->13210|19902->13225|20081->13375|20111->13376|20140->13377|20265->13473|20295->13474|20345->13495|20403->13524|20433->13525|20479->13542|20515->13549|20545->13550|20595->13571|20664->13612|20680->13618|20738->13654|20949->13836|20979->13837|21034->13863|21223->14023|21253->14024|21311->14053|21442->14155|21472->14156|21534->14189|21666->14292|21696->14293|21726->14295|22966->15506|22996->15507|23058->15540|23298->15751|23328->15752|23361->15756|23391->15757|23453->15790|23583->15891|23613->15892|23642->15893|24004->16226|24034->16227|24096->16260|24154->16289|24184->16290|24250->16327|25739->17787|25769->17788|25818->17808|25848->17809|26202->18134|26232->18135|26265->18139|26295->18140|26361->18177|27858->19645|27888->19646|27937->19666|27967->19667|28321->19992|28351->19993|28411->20024|28441->20025|28474->20029|28504->20030|28566->20063|29999->21467|30029->21468|30078->21488|30108->21489|30446->21798|30476->21799|30532->21826|30562->21827|30591->21828|30903->22111|30933->22112|31007->22157|31037->22158|31091->22183|31226->22289|31256->22290|31302->22307|31332->22308|31377->22324|31407->22325|31451->22340|31506->22366|31536->22367|31566->22369|31929->22703|31959->22704|32009->22725|32048->22735|32078->22736|32132->22761|32251->22852|32266->22857|32298->22867|33319->23859|33349->23860|33396->23878|33426->23879|33473->23897|33562->23957|33592->23958|33621->23959|33713->24022|33743->24023|33797->24048|33916->24139|33931->24144|33963->24154|34981->25143|35011->25144|35058->25162|35088->25163|35135->25181|35196->25213|35226->25214|35255->25215|35347->25278|35377->25279|35431->25304|35546->25391|35561->25396|35593->25406|36616->26400|36646->26401|36693->26419|36723->26420|36753->26421|36786->26425|36816->26426|36866->26447|36905->26457|36935->26458|36989->26483|37104->26570|37119->26575|37151->26585|38164->27569|38194->27570|38241->27588|38271->27589|38318->27607|38354->27614|38384->27615|38434->27636|38503->27677|38519->27683|38570->27712|38832->27945|38862->27946|38916->27971|39106->28132|39136->28133|39165->28134|39279->28219|39309->28220|39379->28261|39752->28605|39782->28606|39868->28663|39898->28664|39968->28705|40012->28720|40042->28721|40071->28722|40279->28901|40309->28902|40375->28939|40405->28940|40461->28967|40491->28968|40546->28994|40632->29051|40662->29052|40719->29080|40903->29235|40933->29236|40995->29269|41110->29355|41140->29356|41198->29385|41252->29410|41282->29411|41344->29444|41466->29537|41496->29538|41554->29567|41607->29591|41637->29592|41699->29625|41819->29716|41849->29717|41907->29746|41961->29771|41991->29772|42053->29805|42165->29888|42195->29889|42253->29918|42373->30009|42403->30010|42435->30013|42553->30101|42584->30102|43093->30582|43123->30583|43177->30608|43242->30644|43272->30645|43331->30675|43450->30765|43480->30766|43542->30799|43661->30889|43691->30890|43749->30919|43807->30948|43837->30949|43899->30982|44025->31079|44055->31080|44113->31109|44170->31137|44200->31138|44262->31171|44386->31266|44416->31267|44474->31296|44532->31325|44562->31326|44624->31359|44740->31446|44770->31447|44828->31476|44948->31567|44978->31568|45010->31571|45135->31666|45166->31667|45743->32215|45773->32216|45827->32241|45894->32279|45924->32280|45982->32309|46081->32379|46111->32380|46173->32413|46342->32553|46372->32554|46430->32583|46463->32587|46493->32588|46555->32621|46719->32756|46749->32757|46808->32787|46973->32923|47003->32924|47057->32949|47122->32985|47152->32986|47210->33015|47280->33056|47310->33057|47372->33090|47408->33097|47438->33098|47470->33101|47574->33175|47605->33176|47814->33356|47844->33357|47899->33383|47929->33384|47983->33409|48044->33441|48074->33442|48132->33471|48194->33504|48224->33505|48286->33538|48322->33545|48352->33546|48384->33549|48512->33647|48543->33648|48758->33834|48788->33835|48846->33864|48879->33868|48909->33869|48971->33902|49007->33909|49037->33910|49069->33913|49182->33996|49213->33997|49428->34183|49458->34184|49512->34209|49542->34210|49596->34235|49654->34264|49684->34265|49742->34294|49778->34301|49808->34302|49840->34305|49964->34399|49995->34400|50203->34579|50233->34580|50287->34605|51138->35427|51168->35428|51227->35458|51364->35566|51394->35567|51448->35592|51522->35637|51552->35638|51626->35683|51656->35684|51708->35707|51894->35864|51924->35865|51970->35882|52000->35883|52044->35898|52074->35899|52117->35913|52252->36019|52282->36020|52330->36039|52574->36254|52604->36255|52654->36276|52721->36314|52751->36315|52825->36360|52855->36361|52905->36382|52939->36387|52969->36388|53001->36391|53233->36593|53264->36594|53306->36606|53337->36607|53383->36624|53628->36840|53658->36841|53716->36870|53818->36943|53848->36944|53985->37052|54015->37053|54073->37082|54202->37182|54232->37183|54294->37216|54364->37257|54394->37258|54448->37283|54478->37284|54833->37610|54863->37611|54917->37636|55071->37761|55101->37762|55155->37787|55185->37788|55233->37807|55263->37808|55310->37826|55344->37831|55374->37832|55425->37854|55461->37861|55491->37862|55545->37887|55618->37932|55634->37938|55689->37971|55978->38231|56008->38232|56037->38233|56292->38459|56322->38460|56384->38493|56492->38572|56522->38573|56588->38610|56633->38626|56663->38627|56733->38668|56821->38727|56851->38728|56913->38761|56943->38762|56972->38763|57146->38908|57176->38909|57242->38946|57334->39009|57364->39010|57428->39045|58572->40160|58602->40161|58668->40198|58920->40421|58950->40422|58980->40423|59014->40428|59044->40429|59110->40466|59252->40579|59282->40580|59311->40581|61075->42316|61105->42317|61154->42337|61184->42338|61683->42808|61713->42809|61743->42811|62087->43126|62117->43127|62195->43176|62225->43177|62283->43206|62412->43306|62442->43307|62492->43328|62522->43329|62570->43348|62600->43349|62642->43362|62672->43363|62715->43377|62798->43431|62828->43432|62857->43433|63800->44347|63830->44348|63880->44369|64036->44496|64066->44497|64099->44501|64129->44502|64179->44523|64276->44591|64306->44592|64352->44609|65440->45668|65470->45669|65544->45714|65574->45715|65621->45733|65698->45781|65728->45782|65778->45803|65857->45853|65887->45854|65934->45872|65999->45908|66029->45909|66079->45930|66284->46106|66314->46107|66392->46156|66422->46157|66472->46178|66539->46216|66569->46217|66623->46242|66653->46243|66695->46256|66754->46286|66784->46287|66830->46352|66876->46369|66932->46397|66981->46429|67022->46431|67069->46449|67320->46672|67336->46678|67369->46689|67400->46692|67416->46698|67451->46711|67565->46793|67611->46810|67752->46922|67782->46923|67825->46937|67872->46955|67902->46956|67948->46973|68029->47025|68059->47026|68092->47031|68170->47081|68186->47087|68235->47114|68489->47340|68504->47345|68540->47359|68635->47426|68650->47431|68684->47443|68775->47506|68790->47511|68824->47523|68923->47594|68938->47599|68981->47620|69210->47821|69226->47827|69285->47863|69542->48125|69588->48142|69694->48220|69710->48225|69745->48237|69936->48400|69951->48405|69997->48429|71549->49952|71565->49957|71601->49982|71627->49985|74383->52786|74438->52811|75107->53450|75124->53455|75160->53467|75394->53671|75411->53676|75457->53698|75689->53900|75706->53905|75751->53926|76187->54332|76204->54337|76241->54350|77526->55695|77601->55740|78469->56579|78485->56584|78521->56596|78640->56686|78656->56691|78702->56713|78820->56802|78836->56807|78881->56828|81193->59111|81242->59142|81284->59144|81355->59186|81419->59239|81460->59240|81536->59286|81816->59537|81832->59542|81866->59553|81897->59555|81913->59560|81951->59575|82119->59722|82134->59726|82175->59727|82250->59772|82545->60038|82561->60043|82595->60054|82626->60056|82642->60061|82680->60076|82860->60223|82932->60262|82997->60297|85923->63223|85974->63278|86025->63330|86077->63435|86132->63460
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|77->47|77->47|77->47|78->48|82->52|82->52|84->54|87->57|87->57|88->58|90->60|90->60|91->61|92->62|92->62|93->63|95->65|95->65|97->67|98->68|98->68|99->69|101->71|101->71|103->73|103->73|103->73|104->74|106->76|106->76|107->77|107->77|107->77|108->78|112->82|112->82|117->87|117->87|117->87|118->88|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|133->103|133->103|134->104|136->106|136->106|138->108|141->111|141->111|142->112|146->116|146->116|148->118|148->118|148->118|149->119|157->127|157->127|158->128|158->128|158->128|159->129|168->138|168->138|170->140|170->140|170->140|171->141|174->144|174->144|175->145|175->145|175->145|176->146|178->148|178->148|184->154|191->161|191->161|193->163|194->164|194->164|195->165|197->167|197->167|199->169|200->170|200->170|201->171|201->171|201->171|202->172|203->173|203->173|204->174|205->175|205->175|205->175|210->180|210->180|211->181|215->185|215->185|217->187|222->192|222->192|223->193|226->196|226->196|226->196|226->196|227->197|228->198|228->198|232->202|246->216|246->216|247->217|250->220|250->220|250->220|250->220|251->221|253->223|253->223|254->224|277->247|277->247|278->248|280->250|280->250|281->251|281->251|282->252|284->254|284->254|285->255|285->255|287->257|287->257|289->259|289->259|289->259|290->260|300->270|300->270|301->271|302->272|302->272|302->272|302->272|303->273|304->274|304->274|305->275|322->292|322->292|324->294|324->294|325->295|331->301|331->301|334->304|338->308|338->308|339->309|341->311|341->311|342->312|343->313|343->313|344->314|344->314|344->314|345->315|346->316|346->316|346->316|350->320|350->320|352->322|355->325|355->325|356->326|359->329|359->329|360->330|362->332|362->332|364->334|382->352|382->352|383->353|386->356|386->356|386->356|386->356|387->357|389->359|389->359|390->360|394->364|394->364|395->365|395->365|395->365|396->366|411->381|411->381|411->381|411->381|416->386|416->386|416->386|416->386|417->387|432->402|432->402|432->402|432->402|437->407|437->407|440->410|440->410|440->410|440->410|441->411|456->426|456->426|456->426|456->426|461->431|461->431|464->434|464->434|465->435|469->439|469->439|470->440|470->440|471->441|473->443|473->443|474->444|474->444|476->446|476->446|479->449|479->449|479->449|481->451|485->455|485->455|486->456|486->456|486->456|487->457|489->459|489->459|489->459|504->474|504->474|505->475|505->475|507->477|507->477|507->477|508->478|509->479|509->479|510->480|512->482|512->482|512->482|527->497|527->497|528->498|528->498|530->500|530->500|530->500|531->501|532->502|532->502|533->503|535->505|535->505|535->505|550->520|550->520|551->521|551->521|551->521|551->521|551->521|552->522|552->522|552->522|553->523|555->525|555->525|555->525|570->540|570->540|571->541|571->541|573->543|573->543|573->543|574->544|575->545|575->545|575->545|580->550|580->550|581->551|583->553|583->553|584->554|585->555|585->555|586->556|591->561|591->561|592->562|592->562|593->563|593->563|593->563|594->564|597->567|597->567|598->568|598->568|599->569|599->569|602->572|603->573|603->573|604->574|608->578|608->578|609->579|610->580|610->580|611->581|611->581|611->581|612->582|613->583|613->583|614->584|614->584|614->584|615->585|616->586|616->586|617->587|617->587|617->587|618->588|619->589|619->589|620->590|622->592|622->592|622->592|622->592|622->592|629->599|629->599|630->600|630->600|630->600|632->602|634->604|634->604|635->605|636->606|636->606|637->607|637->607|637->607|638->608|639->609|639->609|640->610|640->610|640->610|641->611|642->612|642->612|643->613|643->613|643->613|644->614|645->615|645->615|646->616|648->618|648->618|648->618|648->618|648->618|656->626|656->626|657->627|657->627|657->627|658->628|659->629|659->629|660->630|661->631|661->631|662->632|662->632|662->632|663->633|664->634|664->634|666->636|668->638|668->638|669->639|669->639|669->639|670->640|670->640|670->640|671->641|671->641|671->641|671->641|671->641|671->641|674->644|674->644|676->646|676->646|677->647|677->647|677->647|678->648|678->648|678->648|679->649|679->649|679->649|679->649|679->649|679->649|682->652|682->652|683->653|683->653|683->653|684->654|684->654|684->654|684->654|684->654|684->654|687->657|687->657|688->658|688->658|689->659|690->660|690->660|691->661|691->661|691->661|691->661|691->661|691->661|694->664|694->664|695->665|706->676|706->676|708->678|710->680|710->680|711->681|714->684|714->684|715->685|715->685|716->686|719->689|719->689|720->690|720->690|721->691|721->691|723->693|725->695|725->695|727->697|732->702|732->702|733->703|734->704|734->704|736->706|736->706|737->707|737->707|737->707|737->707|737->707|737->707|737->707|737->707|739->709|741->711|741->711|742->712|745->715|745->715|747->717|747->717|748->718|750->720|750->720|751->721|752->722|752->722|753->723|753->723|759->729|759->729|760->730|761->731|761->731|762->732|762->732|763->733|763->733|765->735|765->735|765->735|767->737|767->737|767->737|768->738|769->739|769->739|769->739|774->744|774->744|775->745|778->748|778->748|779->749|780->750|780->750|781->751|781->751|781->751|782->752|783->753|783->753|784->754|784->754|785->755|787->757|787->757|788->758|789->759|789->759|792->762|806->776|806->776|807->777|810->780|810->780|810->780|810->780|810->780|811->781|813->783|813->783|814->784|834->804|834->804|834->804|834->804|840->810|840->810|842->812|847->817|847->817|848->818|848->818|849->819|851->821|851->821|852->822|852->822|853->823|853->823|854->824|854->824|856->826|856->826|856->826|857->827|873->843|873->843|874->844|875->845|875->845|875->845|875->845|876->846|877->847|877->847|878->848|897->867|897->867|902->872|902->872|904->874|906->876|906->876|907->877|908->878|908->878|910->880|910->880|910->880|911->881|913->883|913->883|915->885|915->885|916->886|917->887|917->887|918->888|918->888|919->889|919->889|919->889|920->890|921->891|922->892|922->892|922->892|924->894|927->897|927->897|927->897|927->897|927->897|927->897|930->900|931->901|934->904|934->904|936->906|936->906|936->906|937->907|939->909|939->909|940->910|941->911|941->911|941->911|944->914|944->914|944->914|945->915|945->915|945->915|946->916|946->916|946->916|947->917|947->917|947->917|952->922|952->922|952->922|960->930|961->931|961->931|961->931|961->931|964->934|964->934|964->934|987->957|987->957|987->957|987->957|1051->1021|1052->1022|1069->1039|1069->1039|1069->1039|1071->1041|1071->1041|1071->1041|1073->1043|1073->1043|1073->1043|1078->1048|1078->1048|1078->1048|1103->1073|1106->1076|1116->1086|1116->1086|1116->1086|1117->1087|1117->1087|1117->1087|1118->1088|1118->1088|1118->1088|1156->1126|1156->1126|1156->1126|1157->1127|1157->1127|1157->1127|1159->1129|1162->1132|1162->1132|1162->1132|1162->1132|1162->1132|1162->1132|1164->1134|1164->1134|1164->1134|1165->1135|1168->1138|1168->1138|1168->1138|1168->1138|1168->1138|1168->1138|1170->1140|1172->1142|1175->1145|1246->1216|1247->1217|1248->1218|1249->1219|1254->1224
                  -- GENERATED --
              */
          