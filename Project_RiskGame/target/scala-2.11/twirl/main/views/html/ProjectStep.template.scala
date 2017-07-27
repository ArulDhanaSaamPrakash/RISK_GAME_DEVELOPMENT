
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



        """),format.raw/*49.9*/(""".ProjectStepStyle:hover,
        .ProjectStepStyle:focus,
        .ProjectStepStyle:active,
        .ProjectStepStyle.active """),format.raw/*52.34*/("""{"""),format.raw/*52.35*/("""
            """),format.raw/*53.13*/("""background: #F53C00 !important;
            border-color:#F53C00 !important;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""
        """),format.raw/*56.9*/(""".ProjectStepStyle:active,
        .ProjectStepStyle.active """),format.raw/*57.34*/("""{"""),format.raw/*57.35*/("""
            """),format.raw/*58.13*/("""background: #F53C00 !important;
            border-color:#F53C00 !important;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""

        """),format.raw/*62.9*/(""".ProjectStepStyle.disabled,
        .ProjectStepStyle[disabled]"""),format.raw/*63.36*/("""{"""),format.raw/*63.37*/("""
            """),format.raw/*64.13*/("""background: #595a5b !important;
            border-color:#595a5b !important;
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""

        """),format.raw/*68.9*/(""":disabled """),format.raw/*68.19*/("""{"""),format.raw/*68.20*/("""
            """),format.raw/*69.13*/("""background: #595a5b !important;
            border-color:#595a5b !important;
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""
        """),format.raw/*72.9*/("""hr """),format.raw/*72.12*/("""{"""),format.raw/*72.13*/("""
  """),format.raw/*73.3*/("""margin-top: 7px;
  margin-bottom: 2px;
  border: 0;
  border-top: 1px solid #eeeeee;
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""




        """),format.raw/*82.9*/(""".stepStyle"""),format.raw/*82.19*/("""{"""),format.raw/*82.20*/("""
            """),format.raw/*83.13*/("""/* BUTTON STYLING */
            border-top: 1px solid #fff;
            box-shadow: 0 5px 8px #002851, 0 8px 0 #002851, -2px 1px 0 #003872, 2px 1px 0 #003872, 0px 8px 10px #000, 0 10px 30px #1b1b1b;
            /*background: red;*/
            /* FONT STYLING */

            text-decoration: none;
            color: #14467a;
            font-weight: bold;
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/("""
        """),format.raw/*93.9*/(""".stepStyle:hover"""),format.raw/*93.25*/("""{"""),format.raw/*93.26*/("""
            """),format.raw/*94.13*/("""/* BUTTON SHADOW */
            box-shadow: 0 6px 6px #002851, 0 6px 0 #002851, -1px 0px 0 #003872, 0px 0px 0 #003872, 0px 7px 8px #000, 0 7px 20px #1b1b1b;
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""
        """),format.raw/*97.9*/("""/* BLUE GRADIENT ON BUTTON */
        .grad """),format.raw/*98.15*/("""{"""),format.raw/*98.16*/("""
            """),format.raw/*99.13*/("""background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(114,184,255,1)), color-stop(100%,rgba(64,150,238,1)));
            background: linear-gradient(to bottom, rgba(114,184,255,1) 0%,rgba(64,150,238,1) 100%);
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""

        """),format.raw/*103.9*/("""/* ANIMATE THE BUTTON */
        .transition,
        .transition:hover,
        """),format.raw/*106.9*/("""{"""),format.raw/*106.10*/("""
            """),format.raw/*107.13*/("""-webkit-transition: all 0.3s ease-in-out;
            -moz-transition: all 0.3s ease-in-out;
            -o-transition: all 0.3s ease-in-out;
            transition: all 0.3s ease-in-out;
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/("""

        """),format.raw/*113.9*/(""".highlight """),format.raw/*113.20*/("""{"""),format.raw/*113.21*/("""
            """),format.raw/*114.13*/("""position: relative;
            margin: -200px auto 0 auto;
            width: 500px;
            height: 400px;
            opacity: 0.4;
            background: -moz-radial-gradient(top, ellipse cover, rgba(255,255,255,1) 0%, rgba(255,255,255,0) 100%);
            background: -webkit-gradient(radial, top top, 0px, center center, 100%, color-stop(0%,rgba(255,255,255,1)), color-stop(100%,rgba(255,255,255,0)));
            background: -webkit-radial-gradient(top, ellipse cover, rgba(255,255,255,0.3) 0px,rgba(255,255,255,0) 275px);
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/("""
        """),format.raw/*123.9*/(""".phaseStyle"""),format.raw/*123.20*/("""{"""),format.raw/*123.21*/("""
            """),format.raw/*124.13*/("""/* BUTTON STYLING */
            border-top: 1px solid #fff;
            box-shadow: 0 5px 8px #EDBF5C, 0 8px 0 #EDBF5C, -2px 1px 0 #EDBF5C, 2px 1px 0 #EDBF5C, 0px 8px 10px #000, 0 10px 30px #EDBF5C;

            /* FONT STYLING */

            text-decoration: none;
            color: #14467a;
            font-weight: bold;
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""

        """),format.raw/*135.9*/(""".phaseStyle:hover"""),format.raw/*135.26*/("""{"""),format.raw/*135.27*/("""
            """),format.raw/*136.13*/("""/* BUTTON SHADOW */
            color: #ffffff;
            box-shadow: 0 6px 6px #EDBF5C, 0 6px 0 #EDBF5C, -1px 0px 0 #EDBF5C, 0px 0px 0 #EDBF5C, 0px 7px 8px #000, 0 7px 20px #EDBF5C;
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/("""
        """),format.raw/*140.9*/(""".modalHeader"""),format.raw/*140.21*/("""{"""),format.raw/*140.22*/("""
            """),format.raw/*141.13*/("""background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(114,184,255,1)), color-stop(100%,rgba(64,150,238,1)));
            background: linear-gradient(to bottom, rgba(114,184,255,1) 0%,rgba(64,150,238,1) 100%);
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""




        """),format.raw/*148.9*/("""</style>


    </head>
    <script>


            function myfunc() """),format.raw/*155.31*/("""{"""),format.raw/*155.32*/("""

                """),format.raw/*157.17*/("""alert("aaaaaaaa");
            """),format.raw/*158.13*/("""}"""),format.raw/*158.14*/("""
            """),format.raw/*159.13*/("""var lastclickedTab;

            function onProjectStepTabClick()"""),format.raw/*161.45*/("""{"""),format.raw/*161.46*/("""

                """),format.raw/*163.17*/("""lastclickedTab="projectStep";
            """),format.raw/*164.13*/("""}"""),format.raw/*164.14*/("""
            """),format.raw/*165.13*/("""function onRiskDashboardClick()"""),format.raw/*165.44*/("""{"""),format.raw/*165.45*/("""
                """),format.raw/*166.17*/("""lastclickedTab="riskDashboard";
                $.ajax("""),format.raw/*167.24*/("""{"""),format.raw/*167.25*/("""
                    """),format.raw/*168.21*/("""type: 'POST',
                    url: '"""),_display_(/*169.28*/routes/*169.34*/.GameController.getRiskCards()),format.raw/*169.64*/("""',
//                     data : '',
                    data: JSON.stringify(''),
                    // dataType: 'json',
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*174.46*/("""{"""),format.raw/*174.47*/("""
"""),format.raw/*175.1*/("""//                        alert(data);
                        var result = " ";
                        $("#grid-basic tbody") .empty();
                        var firstRisk=data[0].riskId;
                        for (i = 0; i < data.length; i++) """),format.raw/*179.59*/("""{"""),format.raw/*179.60*/("""

                            """),format.raw/*181.29*/("""var obj = data[i];
//                            obj.isComplete = obj.isComplete === 'false' ? "Not Completed" : "Completed";
                            var isCompleted="";
                            var isDisabled="";
//                            alert(obj.budget+" "+obj.personnel);
                            if(obj.complete)"""),format.raw/*186.45*/("""{"""),format.raw/*186.46*/("""
"""),format.raw/*187.1*/("""//                                alert('object is true')
                                isCompleted="Completed"
                                isDisabled="disabled='true'";
                            """),format.raw/*190.29*/("""}"""),format.raw/*190.30*/("""else"""),format.raw/*190.34*/("""{"""),format.raw/*190.35*/("""
                                """),format.raw/*191.33*/("""isCompleted="Pending"
                            """),format.raw/*192.29*/("""}"""),format.raw/*192.30*/("""



                            """),format.raw/*196.29*/("""var eligibleBudget=0;
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*210.81*/("""{"""),format.raw/*210.82*/("""
                                """),format.raw/*211.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*214.29*/("""}"""),format.raw/*214.30*/("""else"""),format.raw/*214.34*/("""{"""),format.raw/*214.35*/("""
                                """),format.raw/*215.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*217.29*/("""}"""),format.raw/*217.30*/("""
"""),format.raw/*218.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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

                        """),format.raw/*241.25*/("""}"""),format.raw/*241.26*/("""
                        """),format.raw/*242.25*/("""document.getElementById('risks').innerHTML = result;
                        onRiskClick(firstRisk);
                    """),format.raw/*244.21*/("""}"""),format.raw/*244.22*/(""",
                    error: function (data) """),format.raw/*245.44*/("""{"""),format.raw/*245.45*/("""
                        """),format.raw/*246.25*/("""alert("error");
                        //setError('Make call failed');
                    """),format.raw/*248.21*/("""}"""),format.raw/*248.22*/("""
                """),format.raw/*249.17*/("""}"""),format.raw/*249.18*/(""");

            """),format.raw/*251.13*/("""}"""),format.raw/*251.14*/("""

            """),format.raw/*253.13*/("""$(document).on("click", ".open-riskDialog", function () """),format.raw/*253.69*/("""{"""),format.raw/*253.70*/("""
             """),format.raw/*254.14*/("""//   alert($(this).data('risk'));

//                var title = $(this).data('title');

                var riskId=$(this).data('risk');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*264.42*/("""{"""),format.raw/*264.43*/("""
                    """),format.raw/*265.21*/("""document.getElementById("isRiskDisabled").innerHTML="You don't have enough resources to mitigate this risk!";
                """),format.raw/*266.17*/("""}"""),format.raw/*266.18*/("""else"""),format.raw/*266.22*/("""{"""),format.raw/*266.23*/("""
                    """),format.raw/*267.21*/("""document.getElementById("isRiskDisabled").innerHTML="";
                """),format.raw/*268.17*/("""}"""),format.raw/*268.18*/("""
                """),format.raw/*269.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/(""");

            function onMitigateRisk(id)"""),format.raw/*288.40*/("""{"""),format.raw/*288.41*/("""
"""),format.raw/*289.1*/("""//                alert(id);
                onRiskClick(id);
                onPerformStep(id);

                $('#btnMitigateRisk').val(id);
                $('#btnMitigateRisk').trigger('click');
            """),format.raw/*295.13*/("""}"""),format.raw/*295.14*/("""


            """),format.raw/*298.13*/("""var riskClicked="";
            var totalSteps=0;
            var stepsDone=0;
            var onlyPlanning=true;
            function onRiskClick(id)"""),format.raw/*302.37*/("""{"""),format.raw/*302.38*/("""
"""),format.raw/*303.1*/("""//                alert("fghjh "+id);
                riskClicked=id;
                var obj = """),format.raw/*305.27*/("""{"""),format.raw/*305.28*/("""
                    """),format.raw/*306.21*/("""'riskid': id
                """),format.raw/*307.17*/("""}"""),format.raw/*307.18*/("""
                """),format.raw/*308.17*/("""$.ajax("""),format.raw/*308.24*/("""{"""),format.raw/*308.25*/("""
                    """),format.raw/*309.21*/("""type: 'POST',
                    url: '"""),_display_(/*310.28*/routes/*310.34*/.GameController.getMitigationSteps()),format.raw/*310.70*/("""',
//                     data : '',
                    data: JSON.stringify(obj),
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*314.46*/("""{"""),format.raw/*314.47*/("""

                        """),format.raw/*316.25*/("""totalSteps=data.length;
                        stepsDone=0;
                        var result = "";
                        for (i = 0; i < data.length; i++) """),format.raw/*319.59*/("""{"""),format.raw/*319.60*/("""
                            """),format.raw/*320.29*/("""var obj = data[i];

                            var status;
                            if(obj.status)"""),format.raw/*323.43*/("""{"""),format.raw/*323.44*/("""
                                """),format.raw/*324.33*/("""stepsDone++;
                                obj.status="disabled='true'";
                            """),format.raw/*326.29*/("""}"""),format.raw/*326.30*/("""

"""),format.raw/*328.1*/("""//                                result= result+"<h1>"+obj.projectStepName+"</h1>";
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*346.81*/("""{"""),format.raw/*346.82*/("""
                                """),format.raw/*347.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*350.29*/("""}"""),format.raw/*350.30*/("""else"""),format.raw/*350.34*/("""{"""),format.raw/*350.35*/("""
                                """),format.raw/*351.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*353.29*/("""}"""),format.raw/*353.30*/("""
"""),format.raw/*354.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);
                            if(onlyPlanning)"""),format.raw/*358.45*/("""{"""),format.raw/*358.46*/("""
                                """),format.raw/*359.33*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*359.62*/("""{"""),format.raw/*359.63*/("""
                                    """),format.raw/*360.37*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*375.59*/("""{"""),format.raw/*375.60*/("""'id':12,'todo':'xyz'"""),format.raw/*375.80*/("""}"""),format.raw/*375.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*380.33*/("""}"""),format.raw/*380.34*/("""else"""),format.raw/*380.38*/("""{"""),format.raw/*380.39*/("""
                                    """),format.raw/*381.37*/("""result = result + "<button disabled" +
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
//                                            "data-todo='"""),format.raw/*396.59*/("""{"""),format.raw/*396.60*/("""'id':12,'todo':'xyz'"""),format.raw/*396.80*/("""}"""),format.raw/*396.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button>";
//
                                """),format.raw/*401.33*/("""}"""),format.raw/*401.34*/("""


                            """),format.raw/*404.29*/("""}"""),format.raw/*404.30*/("""else"""),format.raw/*404.34*/("""{"""),format.raw/*404.35*/("""
                                """),format.raw/*405.33*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*420.59*/("""{"""),format.raw/*420.60*/("""'id':12,'todo':'xyz'"""),format.raw/*420.80*/("""}"""),format.raw/*420.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button>";
//
                            """),format.raw/*425.29*/("""}"""),format.raw/*425.30*/("""


                        """),format.raw/*428.25*/("""}"""),format.raw/*428.26*/("""
"""),format.raw/*429.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*433.21*/("""}"""),format.raw/*433.22*/(""",
                    error: function (data) """),format.raw/*434.44*/("""{"""),format.raw/*434.45*/("""
                        """),format.raw/*435.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*437.21*/("""}"""),format.raw/*437.22*/("""
                """),format.raw/*438.17*/("""}"""),format.raw/*438.18*/(""");

            """),format.raw/*440.13*/("""}"""),format.raw/*440.14*/("""


            """),format.raw/*443.13*/("""function onPerformStep(id)"""),format.raw/*443.39*/("""{"""),format.raw/*443.40*/("""

"""),format.raw/*445.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*449.43*/("""{"""),format.raw/*449.44*/("""
                    """),format.raw/*450.21*/("""var obj = """),format.raw/*450.31*/("""{"""),format.raw/*450.32*/("""
                        """),format.raw/*451.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*453.35*/model/*453.40*/.getGameId),format.raw/*453.50*/(""",
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
                    """),format.raw/*468.21*/("""}"""),format.raw/*468.22*/(""";
                """),format.raw/*469.17*/("""}"""),format.raw/*469.18*/("""

                """),format.raw/*471.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*471.77*/("""{"""),format.raw/*471.78*/("""
"""),format.raw/*472.1*/("""//                    alert(id);
                    var obj = """),format.raw/*473.31*/("""{"""),format.raw/*473.32*/("""
                        """),format.raw/*474.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*476.35*/model/*476.40*/.getGameId),format.raw/*476.50*/(""",
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
                    """),format.raw/*491.21*/("""}"""),format.raw/*491.22*/(""";
                """),format.raw/*492.17*/("""}"""),format.raw/*492.18*/("""

                """),format.raw/*494.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*494.49*/("""{"""),format.raw/*494.50*/("""
"""),format.raw/*495.1*/("""//                    alert(id);
                    var obj = """),format.raw/*496.31*/("""{"""),format.raw/*496.32*/("""
                        """),format.raw/*497.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*499.35*/model/*499.40*/.getGameId),format.raw/*499.50*/(""",
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
                    """),format.raw/*514.21*/("""}"""),format.raw/*514.22*/(""";
                """),format.raw/*515.17*/("""}"""),format.raw/*515.18*/(""" """),format.raw/*515.19*/("""else"""),format.raw/*515.23*/("""{"""),format.raw/*515.24*/("""
                    """),format.raw/*516.21*/("""var obj = """),format.raw/*516.31*/("""{"""),format.raw/*516.32*/("""
                        """),format.raw/*517.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*519.35*/model/*519.40*/.getGameId),format.raw/*519.50*/(""",
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
                    """),format.raw/*534.21*/("""}"""),format.raw/*534.22*/(""";
                """),format.raw/*535.17*/("""}"""),format.raw/*535.18*/("""

                """),format.raw/*537.17*/("""$.ajax("""),format.raw/*537.24*/("""{"""),format.raw/*537.25*/("""
                    """),format.raw/*538.21*/("""type: 'POST',
                    url: '"""),_display_(/*539.28*/routes/*539.34*/.GameController.performStep()),format.raw/*539.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*544.46*/("""{"""),format.raw/*544.47*/("""
                        """),format.raw/*545.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*547.50*/("""{"""),format.raw/*547.51*/("""
"""),format.raw/*548.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*549.34*/("""{"""),format.raw/*549.35*/("""
                                        """),format.raw/*550.41*/("""title: "Congratulations !",
                                        text: "You ended up the game with "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: true,
                                    """),format.raw/*555.37*/("""}"""),format.raw/*555.38*/(""",
                                    function(isConfirm)"""),format.raw/*556.56*/("""{"""),format.raw/*556.57*/("""
                                        """),format.raw/*557.41*/("""if (isConfirm) """),format.raw/*557.56*/("""{"""),format.raw/*557.57*/("""
"""),format.raw/*558.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*561.41*/("""}"""),format.raw/*561.42*/("""
                                    """),format.raw/*562.37*/("""}"""),format.raw/*562.38*/(""");
                        """),format.raw/*563.25*/("""}"""),format.raw/*563.26*/("""


                       """),format.raw/*566.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*567.25*/("""{"""),format.raw/*567.26*/("""
                           """),format.raw/*568.28*/("""// $('#updateactivity').trigger('click');

                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*572.56*/("""{"""),format.raw/*572.57*/("""
                                """),format.raw/*573.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*574.29*/("""}"""),format.raw/*574.30*/("""
                            """),format.raw/*575.29*/("""if(data.oops_points !=0) """),format.raw/*575.54*/("""{"""),format.raw/*575.55*/("""
                                """),format.raw/*576.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*577.29*/("""}"""),format.raw/*577.30*/("""
                            """),format.raw/*578.29*/("""if(data.oops_bonus !=0) """),format.raw/*578.53*/("""{"""),format.raw/*578.54*/("""
                                """),format.raw/*579.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*580.29*/("""}"""),format.raw/*580.30*/("""
                            """),format.raw/*581.29*/("""if(data.oops_budget !=0) """),format.raw/*581.54*/("""{"""),format.raw/*581.55*/("""
                                """),format.raw/*582.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*583.29*/("""}"""),format.raw/*583.30*/("""
                            """),format.raw/*584.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            swal("""),format.raw/*586.34*/("""{"""),format.raw/*586.35*/("""   """),format.raw/*586.38*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*586.126*/("""}"""),format.raw/*586.127*/(""");

                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*593.25*/("""}"""),format.raw/*593.26*/("""
                        """),format.raw/*594.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*594.61*/("""{"""),format.raw/*594.62*/("""

                            """),format.raw/*596.29*/("""var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*598.60*/("""{"""),format.raw/*598.61*/("""
                                """),format.raw/*599.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*600.29*/("""}"""),format.raw/*600.30*/("""
                            """),format.raw/*601.29*/("""if(data.surprise_points !=0) """),format.raw/*601.58*/("""{"""),format.raw/*601.59*/("""
                                """),format.raw/*602.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*603.29*/("""}"""),format.raw/*603.30*/("""
                            """),format.raw/*604.29*/("""if(data.surprise_bonus !=0) """),format.raw/*604.57*/("""{"""),format.raw/*604.58*/("""
                                """),format.raw/*605.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*606.29*/("""}"""),format.raw/*606.30*/("""
                            """),format.raw/*607.29*/("""if(data.surprise_budget !=0) """),format.raw/*607.58*/("""{"""),format.raw/*607.59*/("""
                                """),format.raw/*608.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*609.29*/("""}"""),format.raw/*609.30*/("""
                            """),format.raw/*610.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            swal("""),format.raw/*612.34*/("""{"""),format.raw/*612.35*/("""   """),format.raw/*612.38*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*612.133*/("""}"""),format.raw/*612.134*/(""");
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*618.25*/("""}"""),format.raw/*618.26*/("""
                        """),format.raw/*619.25*/("""else if(data.steptype == "production")"""),format.raw/*619.63*/("""{"""),format.raw/*619.64*/("""
                            """),format.raw/*620.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*621.52*/("""{"""),format.raw/*621.53*/("""
                                """),format.raw/*622.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*623.29*/("""}"""),format.raw/*623.30*/("""
                            """),format.raw/*624.29*/("""else"""),format.raw/*624.33*/("""{"""),format.raw/*624.34*/("""
                                """),format.raw/*625.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*626.29*/("""}"""),format.raw/*626.30*/("""

                            """),format.raw/*628.29*/("""swal(alertmsg);
                        """),format.raw/*629.25*/("""}"""),format.raw/*629.26*/("""
                        """),format.raw/*630.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*630.61*/("""{"""),format.raw/*630.62*/("""
                            """),format.raw/*631.29*/("""if($('#btnIsProduction').val() != "true")"""),format.raw/*631.70*/("""{"""),format.raw/*631.71*/("""
                                """),format.raw/*632.33*/("""swal("""),format.raw/*632.38*/("""{"""),format.raw/*632.39*/("""   """),format.raw/*632.42*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*632.116*/("""}"""),format.raw/*632.117*/(""");
                            """),format.raw/*633.29*/("""}"""),format.raw/*633.30*/("""

                        """),format.raw/*635.25*/("""}"""),format.raw/*635.26*/("""
                        """),format.raw/*636.25*/("""else if(data.steptype == "risk")"""),format.raw/*636.57*/("""{"""),format.raw/*636.58*/("""
                            """),format.raw/*637.29*/("""if(data.risk_status == "success")"""),format.raw/*637.62*/("""{"""),format.raw/*637.63*/("""
                                """),format.raw/*638.33*/("""swal("""),format.raw/*638.38*/("""{"""),format.raw/*638.39*/("""   """),format.raw/*638.42*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*638.140*/("""}"""),format.raw/*638.141*/(""");
                            """),format.raw/*639.29*/("""}"""),format.raw/*639.30*/("""
                            """),format.raw/*640.29*/("""else"""),format.raw/*640.33*/("""{"""),format.raw/*640.34*/("""
                                """),format.raw/*641.33*/("""swal("""),format.raw/*641.38*/("""{"""),format.raw/*641.39*/("""   """),format.raw/*641.42*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*641.125*/("""}"""),format.raw/*641.126*/(""");
                            """),format.raw/*642.29*/("""}"""),format.raw/*642.30*/("""
                        """),format.raw/*643.25*/("""}"""),format.raw/*643.26*/("""
                        """),format.raw/*644.25*/("""else
                        """),format.raw/*645.25*/("""{"""),format.raw/*645.26*/("""
                            """),format.raw/*646.29*/("""swal("""),format.raw/*646.34*/("""{"""),format.raw/*646.35*/("""   """),format.raw/*646.38*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*646.132*/("""}"""),format.raw/*646.133*/(""");

                        """),format.raw/*648.25*/("""}"""),format.raw/*648.26*/("""
                        """),format.raw/*649.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*660.91*/("""{"""),format.raw/*660.92*/("""

                            """),format.raw/*662.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*664.25*/("""}"""),format.raw/*664.26*/("""
                        """),format.raw/*665.25*/("""refreshProjectSteps();


                    """),format.raw/*668.21*/("""}"""),format.raw/*668.22*/(""",
                    error: function (data) """),format.raw/*669.44*/("""{"""),format.raw/*669.45*/("""
                      """),format.raw/*670.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*673.21*/("""}"""),format.raw/*673.22*/("""
                """),format.raw/*674.17*/("""}"""),format.raw/*674.18*/(""");
            """),format.raw/*675.13*/("""}"""),format.raw/*675.14*/("""

            """),format.raw/*677.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*679.47*/("""{"""),format.raw/*679.48*/("""

                 """),format.raw/*681.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*686.27*/("""{"""),format.raw/*686.28*/("""
                    """),format.raw/*687.21*/("""'phaseId': clicked_id
                """),format.raw/*688.17*/("""}"""),format.raw/*688.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*690.43*/("""{"""),format.raw/*690.44*/("""
                    """),format.raw/*691.21*/("""swal("""),format.raw/*691.26*/("""{"""),format.raw/*691.27*/("""   """),format.raw/*691.30*/("""title: "Are you sure?",   text: "You will not be able to do any further project steps after production!",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes, Go to Production!",   closeOnConfirm: false """),format.raw/*691.285*/("""}"""),format.raw/*691.286*/(""", function()"""),format.raw/*691.298*/("""{"""),format.raw/*691.299*/("""

               """),format.raw/*693.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*695.74*/("""{"""),format.raw/*695.75*/("""
                            """),format.raw/*696.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*699.25*/("""}"""),format.raw/*699.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*701.61*/("""{"""),format.raw/*701.62*/("""
                            """),format.raw/*702.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*704.54*/("""{"""),format.raw/*704.55*/("""
                                """),format.raw/*705.33*/("""riskcount++;
                            """),format.raw/*706.29*/("""}"""),format.raw/*706.30*/("""
                        """),format.raw/*707.25*/("""}"""),format.raw/*707.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*713.48*/("""{"""),format.raw/*713.49*/("""
                        """),format.raw/*714.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*715.21*/("""}"""),format.raw/*715.22*/("""
                        """),format.raw/*716.25*/("""}"""),format.raw/*716.26*/(""");
                """),format.raw/*717.17*/("""}"""),format.raw/*717.18*/("""

                """),format.raw/*719.17*/("""else """),format.raw/*719.22*/("""{"""),format.raw/*719.23*/("""

                    """),format.raw/*721.21*/("""$.ajax("""),format.raw/*721.28*/("""{"""),format.raw/*721.29*/("""
                        """),format.raw/*722.25*/("""type: 'POST',
                        url: '"""),_display_(/*723.32*/routes/*723.38*/.GameController.getProjectSteps()),format.raw/*723.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*728.50*/("""{"""),format.raw/*728.51*/("""
"""),format.raw/*729.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*732.63*/("""{"""),format.raw/*732.64*/("""
                                """),format.raw/*733.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*734.61*/("""{"""),format.raw/*734.62*/("""
                                    """),format.raw/*735.37*/("""if (obj.status) """),format.raw/*735.53*/("""{"""),format.raw/*735.54*/("""
                                        """),format.raw/*736.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*737.37*/("""}"""),format.raw/*737.38*/("""
                                """),format.raw/*738.33*/("""}"""),format.raw/*738.34*/("""
"""),format.raw/*739.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*741.49*/("""{"""),format.raw/*741.50*/("""
                                    """),format.raw/*742.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*743.33*/("""}"""),format.raw/*743.34*/("""


                                """),format.raw/*746.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*760.91*/("""{"""),format.raw/*760.92*/("""
                                    """),format.raw/*761.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*764.33*/("""}"""),format.raw/*764.34*/(""" """),format.raw/*764.35*/("""else """),format.raw/*764.40*/("""{"""),format.raw/*764.41*/("""
                                    """),format.raw/*765.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*767.33*/("""}"""),format.raw/*767.34*/("""
"""),format.raw/*768.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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
//                                            "data-todo='"""),format.raw/*788.59*/("""{"""),format.raw/*788.60*/("""'id':12,'todo':'xyz'"""),format.raw/*788.80*/("""}"""),format.raw/*788.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:65px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*794.29*/("""}"""),format.raw/*794.30*/("""

"""),format.raw/*796.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;

                        """),format.raw/*801.25*/("""}"""),format.raw/*801.26*/(""",
                        error: function (data) """),format.raw/*802.48*/("""{"""),format.raw/*802.49*/("""
                            """),format.raw/*803.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*805.25*/("""}"""),format.raw/*805.26*/("""
                    """),format.raw/*806.21*/("""}"""),format.raw/*806.22*/(""");
                """),format.raw/*807.17*/("""}"""),format.raw/*807.18*/("""
            """),format.raw/*808.13*/("""}"""),format.raw/*808.14*/("""

            """),format.raw/*810.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*810.67*/("""{"""),format.raw/*810.68*/("""
"""),format.raw/*811.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*827.42*/("""{"""),format.raw/*827.43*/("""
                    """),format.raw/*828.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*829.17*/("""}"""),format.raw/*829.18*/("""else"""),format.raw/*829.22*/("""{"""),format.raw/*829.23*/("""
                    """),format.raw/*830.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*831.17*/("""}"""),format.raw/*831.18*/("""
                """),format.raw/*832.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*851.13*/("""}"""),format.raw/*851.14*/(""");




            function totalGameTimer() """),format.raw/*856.39*/("""{"""),format.raw/*856.40*/("""

                """),format.raw/*858.17*/("""var sec = 0;

                function pad(val) """),format.raw/*860.35*/("""{"""),format.raw/*860.36*/("""
                    """),format.raw/*861.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*862.17*/("""}"""),format.raw/*862.18*/("""

                """),format.raw/*864.17*/("""var timer = setInterval(function () """),format.raw/*864.53*/("""{"""),format.raw/*864.54*/("""
                    """),format.raw/*865.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*867.17*/("""}"""),format.raw/*867.18*/(""", 1000);

                setTimeout(function () """),format.raw/*869.40*/("""{"""),format.raw/*869.41*/("""
                    """),format.raw/*870.21*/("""clearInterval(timer);
                """),format.raw/*871.17*/("""}"""),format.raw/*871.18*/(""", 50000000);
            """),format.raw/*872.13*/("""}"""),format.raw/*872.14*/("""
            """),format.raw/*873.13*/("""function refreshProjectSteps()"""),format.raw/*873.43*/("""{"""),format.raw/*873.44*/("""
                """),format.raw/*874.65*/("""
                """),format.raw/*875.17*/("""var result="";
            """),_display_(/*876.14*/for(phases <- model.getPhases()) yield /*876.46*/ {_display_(Seq[Any](format.raw/*876.48*/("""

                """),format.raw/*878.17*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                        "style='background-color: #DB8B00 !important;'" +
                        "onclick='onPhaseClick(id)' " +
                        "id='"""),_display_(/*881.31*/phases/*881.37*/.getPhaseId),format.raw/*881.48*/("""'>"""),_display_(/*881.51*/phases/*881.57*/.getPhaseName),format.raw/*881.70*/("""</button><div class='col-md-1' style='height: 40px;'> </div>";


                """)))}),format.raw/*884.18*/("""
                """),format.raw/*885.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*888.13*/("""}"""),format.raw/*888.14*/("""

            """),format.raw/*890.13*/("""function newfunc()"""),format.raw/*890.31*/("""{"""),format.raw/*890.32*/("""
                """),format.raw/*891.17*/("""swal("", "Please do not refresh the screen else you will lose your data", "warning");

            """),format.raw/*893.13*/("""}"""),format.raw/*893.14*/("""
    """),format.raw/*894.5*/("""</script>
    <body style="background-image: url("""),_display_(/*895.41*/routes/*895.47*/.Assets.at("images/bg.jpg")),format.raw/*895.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*898.68*/model/*898.73*/.getUserName()),format.raw/*898.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*899.64*/model/*899.69*/.getGameId()),format.raw/*899.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*900.60*/model/*900.65*/.getTurnNo()),format.raw/*900.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*901.68*/model/*901.73*/.getTimeForEachMove()),format.raw/*901.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" >

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*906.64*/routes/*906.70*/.DashboardController.viewDashboard()),format.raw/*906.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*914.51*/("""
                """),format.raw/*915.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*915.95*/model/*915.100*/.getGameId()),format.raw/*915.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*918.44*/model/*918.49*/.getStepsForEachPlayer()),format.raw/*918.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*925.126*/model/*925.131*/.getUserName().split("@")/*925.156*/(0)),format.raw/*925.159*/("""!</div>
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
                      <div class="panel-body" style="height: 350px; overflow-wrap: break-word;overflow-y: scroll">
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
                            """),format.raw/*994.105*/("""
                        """),format.raw/*995.25*/("""</div>



                </div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">

                                          <!-- //first div -->
                                          <div style="text-align:center;">

                                              <div style="border:1px solid #000; display:inline-block;position:absolute;top:0;left:0;">
                                                  Budget:<div style=" display: inline; float: right " id="budgetremaining"> """),_display_(/*1012.126*/model/*1012.131*/.getBudget()),format.raw/*1012.143*/("""</div>
                                                    <br>
                                                      Capability Points:<div style=" display: inline; float: right" id="capabilitypoints"> """),_display_(/*1014.141*/model/*1014.146*/.getCapabilityPoints()),format.raw/*1014.168*/("""</div>
                                                    <br>
                                                      Capability Bonus:<div style=" display: inline; float: right" id="capabilitybonus"> """),_display_(/*1016.139*/model/*1016.144*/.getCapabilityBonus()),format.raw/*1016.165*/("""</div>
                                                    <br>
                                                </div>

                                                <div style="border:1px solid #000; display:inline-block;">
                                                  <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*1021.180*/model/*1021.185*/.getResources),format.raw/*1021.198*/("""</div>
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


                                              """),format.raw/*1044.138*/("""


                                          """),format.raw/*1047.43*/("""<div class="modal fade" id="myAssetModal" role="dialog">
                                              <div class="modal-dialog">

                                                      <!-- Modal content-->
                                                  <div class="modal-content">
                                                      <div class="modal-header">
                                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                          <h4 class="modal-title">Status</h4>
                                                      </div>
                                                      <div class="modal-body" style="text-align: left">
                                                          <div>Budget Remaining: """),_display_(/*1057.83*/model/*1057.88*/.getBudget()),format.raw/*1057.100*/("""</div>
                                                          <div>Capability Points: """),_display_(/*1058.84*/model/*1058.89*/.getCapabilityPoints()),format.raw/*1058.111*/("""</div>
                                                          <div>Capability Bonus: """),_display_(/*1059.83*/model/*1059.88*/.getCapabilityBonus()),format.raw/*1059.109*/("""</div>
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
                        <button class="btn btn-danger" id="btnSkip" onclick="onPerformStep(id)">Skip Turn</button>
                        <button style="display: none" class="btn btn-danger" id="btnSkipTimeout" onclick="onPerformStep(id)">Timeout button</button>

                    </ul>
                    <div class="tab-content">
                        <div id="projectSteps" class="tab-pane fade in active">
                            <div class="col-md-12" style="border: 1px solid transparent">

                                <div style="height: 10px; "></div>

                                <div id="listOfProjectSteps">


                                    """),_display_(/*1097.38*/for(phase <- model.getPhases()) yield /*1097.69*/ {_display_(Seq[Any](format.raw/*1097.71*/("""
                                        """),_display_(/*1098.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1098.95*/{_display_(Seq[Any](format.raw/*1098.96*/("""

                                            """),format.raw/*1100.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1103.49*/phase/*1103.54*/.getPhaseId),format.raw/*1103.65*/(""">"""),_display_(/*1103.67*/phase/*1103.72*/.getPhaseName()),format.raw/*1103.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}/*1105.42*/else/*1105.46*/{_display_(Seq[Any](format.raw/*1105.47*/("""
                                            """),format.raw/*1106.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1109.49*/phase/*1109.54*/.getPhaseId),format.raw/*1109.65*/(""">"""),_display_(/*1109.67*/phase/*1109.72*/.getPhaseName()),format.raw/*1109.87*/("""</button>
                                            <div class="col-md-1" style="height: 40px;"> </div>
                                        """)))}),format.raw/*1111.42*/("""

                                    """)))}),format.raw/*1113.38*/("""


                                """),format.raw/*1116.33*/("""</div>





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
                    """),format.raw/*1187.51*/("""
                    """),format.raw/*1188.55*/("""
                    """),format.raw/*1189.52*/("""
                    """),format.raw/*1190.105*/("""




                    """),format.raw/*1195.21*/("""<div class="panel panel-default" style="width:195px;overflow-y: scroll">
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
                  DATE: Thu Jul 27 18:22:41 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: 260eaac97ad8d38193186c3a4f4d933aabf01cb1
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3954->2488|3983->2489|4020->2499|4051->2502|4080->2503|4121->2516|4211->2579|4240->2580|4277->2590|4322->2607|4351->2608|4392->2621|4482->2684|4511->2685|4550->2697|4703->2822|4732->2823|4773->2836|4885->2921|4914->2922|4950->2931|5037->2990|5066->2991|5107->3004|5219->3089|5248->3090|5285->3100|5376->3163|5405->3164|5446->3177|5558->3262|5587->3263|5624->3273|5662->3283|5691->3284|5732->3297|5844->3382|5873->3383|5909->3392|5940->3395|5969->3396|5999->3399|6111->3484|6139->3485|6179->3498|6217->3508|6246->3509|6287->3522|6681->3889|6710->3890|6746->3899|6790->3915|6819->3916|6860->3929|7052->4094|7081->4095|7117->4104|7189->4148|7218->4149|7259->4162|7529->4404|7559->4405|7597->4415|7706->4496|7736->4497|7778->4510|8002->4706|8032->4707|8070->4717|8110->4728|8140->4729|8182->4742|8754->5286|8784->5287|8821->5296|8861->5307|8891->5308|8933->5321|9296->5656|9326->5657|9364->5667|9410->5684|9440->5685|9482->5698|9703->5891|9733->5892|9770->5901|9811->5913|9841->5914|9883->5927|10153->6169|10183->6170|10224->6183|10321->6251|10351->6252|10398->6270|10458->6301|10488->6302|10530->6315|10624->6380|10654->6381|10701->6399|10772->6441|10802->6442|10844->6455|10904->6486|10934->6487|10980->6504|11064->6559|11094->6560|11144->6581|11213->6622|11229->6628|11281->6658|11532->6880|11562->6881|11591->6882|11870->7132|11900->7133|11959->7163|12320->7495|12350->7496|12379->7497|12612->7701|12642->7702|12675->7706|12705->7707|12767->7740|12846->7790|12876->7791|12937->7823|14023->8880|14053->8881|14115->8914|14355->9125|14385->9126|14418->9130|14448->9131|14510->9164|14640->9265|14670->9266|14699->9267|16254->10793|16284->10794|16338->10819|16488->10940|16518->10941|16592->10986|16622->10987|16676->11012|16797->11104|16827->11105|16873->11122|16903->11123|16948->11139|16978->11140|17021->11154|17106->11210|17136->11211|17179->11225|17698->11715|17728->11716|17778->11737|17933->11863|17963->11864|17996->11868|18026->11869|18076->11890|18177->11962|18207->11963|18253->11980|19103->12801|19133->12802|19205->12845|19235->12846|19264->12847|19506->13060|19536->13061|19580->13076|19759->13226|19789->13227|19818->13228|19943->13324|19973->13325|20023->13346|20081->13375|20111->13376|20157->13393|20193->13400|20223->13401|20273->13422|20342->13463|20358->13469|20416->13505|20627->13687|20657->13688|20712->13714|20901->13874|20931->13875|20989->13904|21120->14006|21150->14007|21212->14040|21344->14143|21374->14144|21404->14146|22644->15357|22674->15358|22736->15391|22976->15602|23006->15603|23039->15607|23069->15608|23131->15641|23261->15742|23291->15743|23320->15744|23682->16077|23712->16078|23774->16111|23832->16140|23862->16141|23928->16178|25405->17626|25435->17627|25484->17647|25514->17648|25868->17973|25898->17974|25931->17978|25961->17979|26027->18016|27512->19472|27542->19473|27591->19493|27621->19494|27975->19819|28005->19820|28065->19851|28095->19852|28128->19856|28158->19857|28220->19890|29641->21282|29671->21283|29720->21303|29750->21304|30088->21613|30118->21614|30174->21641|30204->21642|30233->21643|30545->21926|30575->21927|30649->21972|30679->21973|30733->21998|30868->22104|30898->22105|30944->22122|30974->22123|31019->22139|31049->22140|31093->22155|31148->22181|31178->22182|31208->22184|31571->22518|31601->22519|31651->22540|31690->22550|31720->22551|31774->22576|31893->22667|31908->22672|31940->22682|32961->23674|32991->23675|33038->23693|33068->23694|33115->23712|33204->23772|33234->23773|33263->23774|33355->23837|33385->23838|33439->23863|33558->23954|33573->23959|33605->23969|34623->24958|34653->24959|34700->24977|34730->24978|34777->24996|34838->25028|34868->25029|34897->25030|34989->25093|35019->25094|35073->25119|35188->25206|35203->25211|35235->25221|36258->26215|36288->26216|36335->26234|36365->26235|36395->26236|36428->26240|36458->26241|36508->26262|36547->26272|36577->26273|36631->26298|36746->26385|36761->26390|36793->26400|37806->27384|37836->27385|37883->27403|37913->27404|37960->27422|37996->27429|38026->27430|38076->27451|38145->27492|38161->27498|38212->27527|38474->27760|38504->27761|38558->27786|38748->27947|38778->27948|38807->27949|38921->28034|38951->28035|39021->28076|39407->28433|39437->28434|39523->28491|39553->28492|39623->28533|39667->28548|39697->28549|39726->28550|39934->28729|39964->28730|40030->28767|40060->28768|40116->28795|40146->28796|40201->28822|40287->28879|40317->28880|40374->28908|40558->29063|40588->29064|40650->29097|40765->29183|40795->29184|40853->29213|40907->29238|40937->29239|40999->29272|41121->29365|41151->29366|41209->29395|41262->29419|41292->29420|41354->29453|41474->29544|41504->29545|41562->29574|41616->29599|41646->29600|41708->29633|41820->29716|41850->29717|41908->29746|42026->29835|42056->29836|42088->29839|42206->29927|42237->29928|42657->30319|42687->30320|42741->30345|42806->30381|42836->30382|42895->30412|43014->30502|43044->30503|43106->30536|43225->30626|43255->30627|43313->30656|43371->30685|43401->30686|43463->30719|43589->30816|43619->30817|43677->30846|43734->30874|43764->30875|43826->30908|43950->31003|43980->31004|44038->31033|44096->31062|44126->31063|44188->31096|44304->31183|44334->31184|44392->31213|44510->31302|44540->31303|44572->31306|44697->31401|44728->31402|45154->31799|45184->31800|45238->31825|45305->31863|45335->31864|45393->31893|45492->31963|45522->31964|45584->31997|45753->32137|45783->32138|45841->32167|45874->32171|45904->32172|45966->32205|46130->32340|46160->32341|46219->32371|46288->32411|46318->32412|46372->32437|46437->32473|46467->32474|46525->32503|46595->32544|46625->32545|46687->32578|46721->32583|46751->32584|46783->32587|46887->32661|46918->32662|46978->32693|47008->32694|47063->32720|47093->32721|47147->32746|47208->32778|47238->32779|47296->32808|47358->32841|47388->32842|47450->32875|47484->32880|47514->32881|47546->32884|47674->32982|47705->32983|47765->33014|47795->33015|47853->33044|47886->33048|47916->33049|47978->33082|48012->33087|48042->33088|48074->33091|48187->33174|48218->33175|48278->33206|48308->33207|48362->33232|48392->33233|48446->33258|48504->33287|48534->33288|48592->33317|48626->33322|48656->33323|48688->33326|48812->33420|48843->33421|48900->33449|48930->33450|48984->33475|49835->34297|49865->34298|49924->34328|50061->34436|50091->34437|50145->34462|50219->34507|50249->34508|50323->34553|50353->34554|50405->34577|50591->34734|50621->34735|50667->34752|50697->34753|50741->34768|50771->34769|50814->34783|50949->34889|50979->34890|51027->34909|51271->35124|51301->35125|51351->35146|51418->35184|51448->35185|51522->35230|51552->35231|51602->35252|51636->35257|51666->35258|51698->35261|51983->35516|52014->35517|52056->35529|52087->35530|52133->35547|52378->35763|52408->35764|52466->35793|52568->35866|52598->35867|52735->35975|52765->35976|52823->36005|52952->36105|52982->36106|53044->36139|53114->36180|53144->36181|53198->36206|53228->36207|53583->36533|53613->36534|53667->36559|53821->36684|53851->36685|53905->36710|53935->36711|53983->36730|54013->36731|54060->36749|54094->36754|54124->36755|54175->36777|54211->36784|54241->36785|54295->36810|54368->36855|54384->36861|54439->36894|54728->37154|54758->37155|54787->37156|55042->37382|55072->37383|55134->37416|55242->37495|55272->37496|55338->37533|55383->37549|55413->37550|55483->37591|55571->37650|55601->37651|55663->37684|55693->37685|55722->37686|55896->37831|55926->37832|55992->37869|56084->37932|56114->37933|56178->37968|57322->39083|57352->39084|57418->39121|57670->39344|57700->39345|57730->39346|57764->39351|57794->39352|57860->39389|58002->39502|58032->39503|58061->39504|59825->41239|59855->41240|59904->41260|59934->41261|60433->41731|60463->41732|60493->41734|60837->42049|60867->42050|60945->42099|60975->42100|61033->42129|61162->42229|61192->42230|61242->42251|61272->42252|61320->42271|61350->42272|61392->42285|61422->42286|61465->42300|61548->42354|61578->42355|61607->42356|62550->43270|62580->43271|62630->43292|62786->43419|62816->43420|62849->43424|62879->43425|62929->43446|63026->43514|63056->43515|63102->43532|64190->44591|64220->44592|64294->44637|64324->44638|64371->44656|64448->44704|64478->44705|64528->44726|64607->44776|64637->44777|64684->44795|64749->44831|64779->44832|64829->44853|65034->45029|65064->45030|65142->45079|65172->45080|65222->45101|65289->45139|65319->45140|65373->45165|65403->45166|65445->45179|65504->45209|65534->45210|65580->45275|65626->45292|65682->45320|65731->45352|65772->45354|65819->45372|66070->45595|66086->45601|66119->45612|66150->45615|66166->45621|66201->45634|66315->45716|66361->45733|66502->45845|66532->45846|66575->45860|66622->45878|66652->45879|66698->45896|66826->45995|66856->45996|66889->46001|66967->46051|66983->46057|67032->46084|67286->46310|67301->46315|67337->46329|67432->46396|67447->46401|67481->46413|67572->46476|67587->46481|67621->46493|67720->46564|67735->46569|67778->46590|67963->46747|67979->46753|68038->46789|68295->47051|68341->47068|68447->47146|68463->47151|68498->47163|68689->47326|68704->47331|68750->47355|69215->47791|69231->47796|69267->47821|69293->47824|72530->51107|72584->51132|73253->51771|73270->51776|73306->51788|73540->51992|73557->51997|73603->52019|73835->52221|73852->52226|73897->52247|74333->52653|74350->52658|74387->52671|75509->53853|75584->53898|76452->54737|76468->54742|76504->54754|76623->54844|76639->54849|76685->54871|76803->54960|76819->54965|76864->54986|79156->57249|79205->57280|79247->57282|79318->57324|79382->57377|79423->57378|79499->57424|79779->57675|79795->57680|79829->57691|79860->57693|79876->57698|79914->57713|80082->57860|80097->57864|80138->57865|80213->57910|80508->58176|80524->58181|80558->58192|80589->58194|80605->58199|80643->58214|80823->58361|80895->58400|80960->58435|83866->61341|83917->61396|83968->61448|84020->61553|84075->61578
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|79->49|82->52|82->52|83->53|85->55|85->55|86->56|87->57|87->57|88->58|90->60|90->60|92->62|93->63|93->63|94->64|96->66|96->66|98->68|98->68|98->68|99->69|101->71|101->71|102->72|102->72|102->72|103->73|107->77|107->77|112->82|112->82|112->82|113->83|122->92|122->92|123->93|123->93|123->93|124->94|126->96|126->96|127->97|128->98|128->98|129->99|131->101|131->101|133->103|136->106|136->106|137->107|141->111|141->111|143->113|143->113|143->113|144->114|152->122|152->122|153->123|153->123|153->123|154->124|163->133|163->133|165->135|165->135|165->135|166->136|169->139|169->139|170->140|170->140|170->140|171->141|173->143|173->143|178->148|185->155|185->155|187->157|188->158|188->158|189->159|191->161|191->161|193->163|194->164|194->164|195->165|195->165|195->165|196->166|197->167|197->167|198->168|199->169|199->169|199->169|204->174|204->174|205->175|209->179|209->179|211->181|216->186|216->186|217->187|220->190|220->190|220->190|220->190|221->191|222->192|222->192|226->196|240->210|240->210|241->211|244->214|244->214|244->214|244->214|245->215|247->217|247->217|248->218|271->241|271->241|272->242|274->244|274->244|275->245|275->245|276->246|278->248|278->248|279->249|279->249|281->251|281->251|283->253|283->253|283->253|284->254|294->264|294->264|295->265|296->266|296->266|296->266|296->266|297->267|298->268|298->268|299->269|316->286|316->286|318->288|318->288|319->289|325->295|325->295|328->298|332->302|332->302|333->303|335->305|335->305|336->306|337->307|337->307|338->308|338->308|338->308|339->309|340->310|340->310|340->310|344->314|344->314|346->316|349->319|349->319|350->320|353->323|353->323|354->324|356->326|356->326|358->328|376->346|376->346|377->347|380->350|380->350|380->350|380->350|381->351|383->353|383->353|384->354|388->358|388->358|389->359|389->359|389->359|390->360|405->375|405->375|405->375|405->375|410->380|410->380|410->380|410->380|411->381|426->396|426->396|426->396|426->396|431->401|431->401|434->404|434->404|434->404|434->404|435->405|450->420|450->420|450->420|450->420|455->425|455->425|458->428|458->428|459->429|463->433|463->433|464->434|464->434|465->435|467->437|467->437|468->438|468->438|470->440|470->440|473->443|473->443|473->443|475->445|479->449|479->449|480->450|480->450|480->450|481->451|483->453|483->453|483->453|498->468|498->468|499->469|499->469|501->471|501->471|501->471|502->472|503->473|503->473|504->474|506->476|506->476|506->476|521->491|521->491|522->492|522->492|524->494|524->494|524->494|525->495|526->496|526->496|527->497|529->499|529->499|529->499|544->514|544->514|545->515|545->515|545->515|545->515|545->515|546->516|546->516|546->516|547->517|549->519|549->519|549->519|564->534|564->534|565->535|565->535|567->537|567->537|567->537|568->538|569->539|569->539|569->539|574->544|574->544|575->545|577->547|577->547|578->548|579->549|579->549|580->550|585->555|585->555|586->556|586->556|587->557|587->557|587->557|588->558|591->561|591->561|592->562|592->562|593->563|593->563|596->566|597->567|597->567|598->568|602->572|602->572|603->573|604->574|604->574|605->575|605->575|605->575|606->576|607->577|607->577|608->578|608->578|608->578|609->579|610->580|610->580|611->581|611->581|611->581|612->582|613->583|613->583|614->584|616->586|616->586|616->586|616->586|616->586|623->593|623->593|624->594|624->594|624->594|626->596|628->598|628->598|629->599|630->600|630->600|631->601|631->601|631->601|632->602|633->603|633->603|634->604|634->604|634->604|635->605|636->606|636->606|637->607|637->607|637->607|638->608|639->609|639->609|640->610|642->612|642->612|642->612|642->612|642->612|648->618|648->618|649->619|649->619|649->619|650->620|651->621|651->621|652->622|653->623|653->623|654->624|654->624|654->624|655->625|656->626|656->626|658->628|659->629|659->629|660->630|660->630|660->630|661->631|661->631|661->631|662->632|662->632|662->632|662->632|662->632|662->632|663->633|663->633|665->635|665->635|666->636|666->636|666->636|667->637|667->637|667->637|668->638|668->638|668->638|668->638|668->638|668->638|669->639|669->639|670->640|670->640|670->640|671->641|671->641|671->641|671->641|671->641|671->641|672->642|672->642|673->643|673->643|674->644|675->645|675->645|676->646|676->646|676->646|676->646|676->646|676->646|678->648|678->648|679->649|690->660|690->660|692->662|694->664|694->664|695->665|698->668|698->668|699->669|699->669|700->670|703->673|703->673|704->674|704->674|705->675|705->675|707->677|709->679|709->679|711->681|716->686|716->686|717->687|718->688|718->688|720->690|720->690|721->691|721->691|721->691|721->691|721->691|721->691|721->691|721->691|723->693|725->695|725->695|726->696|729->699|729->699|731->701|731->701|732->702|734->704|734->704|735->705|736->706|736->706|737->707|737->707|743->713|743->713|744->714|745->715|745->715|746->716|746->716|747->717|747->717|749->719|749->719|749->719|751->721|751->721|751->721|752->722|753->723|753->723|753->723|758->728|758->728|759->729|762->732|762->732|763->733|764->734|764->734|765->735|765->735|765->735|766->736|767->737|767->737|768->738|768->738|769->739|771->741|771->741|772->742|773->743|773->743|776->746|790->760|790->760|791->761|794->764|794->764|794->764|794->764|794->764|795->765|797->767|797->767|798->768|818->788|818->788|818->788|818->788|824->794|824->794|826->796|831->801|831->801|832->802|832->802|833->803|835->805|835->805|836->806|836->806|837->807|837->807|838->808|838->808|840->810|840->810|840->810|841->811|857->827|857->827|858->828|859->829|859->829|859->829|859->829|860->830|861->831|861->831|862->832|881->851|881->851|886->856|886->856|888->858|890->860|890->860|891->861|892->862|892->862|894->864|894->864|894->864|895->865|897->867|897->867|899->869|899->869|900->870|901->871|901->871|902->872|902->872|903->873|903->873|903->873|904->874|905->875|906->876|906->876|906->876|908->878|911->881|911->881|911->881|911->881|911->881|911->881|914->884|915->885|918->888|918->888|920->890|920->890|920->890|921->891|923->893|923->893|924->894|925->895|925->895|925->895|928->898|928->898|928->898|929->899|929->899|929->899|930->900|930->900|930->900|931->901|931->901|931->901|936->906|936->906|936->906|944->914|945->915|945->915|945->915|945->915|948->918|948->918|948->918|955->925|955->925|955->925|955->925|1024->994|1025->995|1042->1012|1042->1012|1042->1012|1044->1014|1044->1014|1044->1014|1046->1016|1046->1016|1046->1016|1051->1021|1051->1021|1051->1021|1074->1044|1077->1047|1087->1057|1087->1057|1087->1057|1088->1058|1088->1058|1088->1058|1089->1059|1089->1059|1089->1059|1127->1097|1127->1097|1127->1097|1128->1098|1128->1098|1128->1098|1130->1100|1133->1103|1133->1103|1133->1103|1133->1103|1133->1103|1133->1103|1135->1105|1135->1105|1135->1105|1136->1106|1139->1109|1139->1109|1139->1109|1139->1109|1139->1109|1139->1109|1141->1111|1143->1113|1146->1116|1217->1187|1218->1188|1219->1189|1220->1190|1225->1195
                  -- GENERATED --
              */
          