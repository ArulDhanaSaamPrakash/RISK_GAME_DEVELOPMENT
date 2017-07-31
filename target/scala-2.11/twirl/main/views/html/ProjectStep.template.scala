
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
        """),format.raw/*72.9*/(""".stepStyle"""),format.raw/*72.19*/("""{"""),format.raw/*72.20*/("""
            """),format.raw/*73.13*/("""/* BUTTON STYLING */
            border-top: 1px solid #fff;
            box-shadow: 0 5px 8px #002851, 0 8px 0 #002851, -2px 1px 0 #003872, 2px 1px 0 #003872, 0px 8px 10px #000, 0 10px 30px #1b1b1b;
            /*background: red;*/
            /* FONT STYLING */

            text-decoration: none;
            color: #14467a;
            font-weight: bold;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""
        """),format.raw/*83.9*/(""".stepStyle:hover"""),format.raw/*83.25*/("""{"""),format.raw/*83.26*/("""
            """),format.raw/*84.13*/("""/* BUTTON SHADOW */
            box-shadow: 0 6px 6px #002851, 0 6px 0 #002851, -1px 0px 0 #003872, 0px 0px 0 #003872, 0px 7px 8px #000, 0 7px 20px #1b1b1b;
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
        """),format.raw/*87.9*/("""/* BLUE GRADIENT ON BUTTON */
        .grad """),format.raw/*88.15*/("""{"""),format.raw/*88.16*/("""
            """),format.raw/*89.13*/("""background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(114,184,255,1)), color-stop(100%,rgba(64,150,238,1)));
            background: linear-gradient(to bottom, rgba(114,184,255,1) 0%,rgba(64,150,238,1) 100%);
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""

        """),format.raw/*93.9*/("""/* ANIMATE THE BUTTON */
        .transition,
        .transition:hover,
        """),format.raw/*96.9*/("""{"""),format.raw/*96.10*/("""
            """),format.raw/*97.13*/("""-webkit-transition: all 0.3s ease-in-out;
            -moz-transition: all 0.3s ease-in-out;
            -o-transition: all 0.3s ease-in-out;
            transition: all 0.3s ease-in-out;
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""

        """),format.raw/*103.9*/(""".highlight """),format.raw/*103.20*/("""{"""),format.raw/*103.21*/("""
            """),format.raw/*104.13*/("""position: relative;
            margin: -200px auto 0 auto;
            width: 500px;
            height: 400px;
            opacity: 0.4;
            background: -moz-radial-gradient(top, ellipse cover, rgba(255,255,255,1) 0%, rgba(255,255,255,0) 100%);
            background: -webkit-gradient(radial, top top, 0px, center center, 100%, color-stop(0%,rgba(255,255,255,1)), color-stop(100%,rgba(255,255,255,0)));
            background: -webkit-radial-gradient(top, ellipse cover, rgba(255,255,255,0.3) 0px,rgba(255,255,255,0) 275px);
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""
        """),format.raw/*113.9*/(""".phaseStyle"""),format.raw/*113.20*/("""{"""),format.raw/*113.21*/("""
            """),format.raw/*114.13*/("""/* BUTTON STYLING */
            border-top: 1px solid #fff;
            box-shadow: 0 5px 8px #EDBF5C, 0 8px 0 #EDBF5C, -2px 1px 0 #EDBF5C, 2px 1px 0 #EDBF5C, 0px 8px 10px #000, 0 10px 30px #EDBF5C;

            /* FONT STYLING */

            text-decoration: none;
            color: #14467a;
            font-weight: bold;
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""

        """),format.raw/*125.9*/(""".phaseStyle:hover"""),format.raw/*125.26*/("""{"""),format.raw/*125.27*/("""
            """),format.raw/*126.13*/("""/* BUTTON SHADOW */
            color: #ffffff;
            box-shadow: 0 6px 6px #EDBF5C, 0 6px 0 #EDBF5C, -1px 0px 0 #EDBF5C, 0px 0px 0 #EDBF5C, 0px 7px 8px #000, 0 7px 20px #EDBF5C;
        """),format.raw/*129.9*/("""}"""),format.raw/*129.10*/("""
        """),format.raw/*130.9*/(""".modalHeader"""),format.raw/*130.21*/("""{"""),format.raw/*130.22*/("""
            """),format.raw/*131.13*/("""background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(114,184,255,1)), color-stop(100%,rgba(64,150,238,1)));
            background: linear-gradient(to bottom, rgba(114,184,255,1) 0%,rgba(64,150,238,1) 100%);
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""




        """),format.raw/*138.9*/("""</style>


    </head>
    <script>


            function myfunc() """),format.raw/*145.31*/("""{"""),format.raw/*145.32*/("""

                """),format.raw/*147.17*/("""alert("aaaaaaaa");
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/("""
            """),format.raw/*149.13*/("""var lastclickedTab;

            function onProjectStepTabClick()"""),format.raw/*151.45*/("""{"""),format.raw/*151.46*/("""

                """),format.raw/*153.17*/("""lastclickedTab="projectStep";
            """),format.raw/*154.13*/("""}"""),format.raw/*154.14*/("""
            """),format.raw/*155.13*/("""function onRiskDashboardClick()"""),format.raw/*155.44*/("""{"""),format.raw/*155.45*/("""
                """),format.raw/*156.17*/("""lastclickedTab="riskDashboard";
                $.ajax("""),format.raw/*157.24*/("""{"""),format.raw/*157.25*/("""
                    """),format.raw/*158.21*/("""type: 'POST',
                    url: '"""),_display_(/*159.28*/routes/*159.34*/.GameController.getRiskCards()),format.raw/*159.64*/("""',
//                     data : '',
                    data: JSON.stringify(''),
                    // dataType: 'json',
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*164.46*/("""{"""),format.raw/*164.47*/("""
"""),format.raw/*165.1*/("""//                        alert(data);
                        var result = " ";
                        $("#grid-basic tbody") .empty();
                        var firstRisk=data[0].riskId;
                        for (i = 0; i < data.length; i++) """),format.raw/*169.59*/("""{"""),format.raw/*169.60*/("""

                            """),format.raw/*171.29*/("""var obj = data[i];
//                            obj.isComplete = obj.isComplete === 'false' ? "Not Completed" : "Completed";
                            var isCompleted="";
                            var isDisabled="";
//                            alert(obj.budget+" "+obj.personnel);
                            if(obj.complete)"""),format.raw/*176.45*/("""{"""),format.raw/*176.46*/("""
"""),format.raw/*177.1*/("""//                                alert('object is true')
                                isCompleted="Completed"
                                isDisabled="disabled='true'";
                            """),format.raw/*180.29*/("""}"""),format.raw/*180.30*/("""else"""),format.raw/*180.34*/("""{"""),format.raw/*180.35*/("""
                                """),format.raw/*181.33*/("""isCompleted="Pending"
                            """),format.raw/*182.29*/("""}"""),format.raw/*182.30*/("""



                            """),format.raw/*186.29*/("""var eligibleBudget=0;
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*200.81*/("""{"""),format.raw/*200.82*/("""
                                """),format.raw/*201.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*204.29*/("""}"""),format.raw/*204.30*/("""else"""),format.raw/*204.34*/("""{"""),format.raw/*204.35*/("""
                                """),format.raw/*205.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*207.29*/("""}"""),format.raw/*207.30*/("""
"""),format.raw/*208.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
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

                        """),format.raw/*231.25*/("""}"""),format.raw/*231.26*/("""
                        """),format.raw/*232.25*/("""document.getElementById('risks').innerHTML = result;
                        onRiskClick(firstRisk);
                    """),format.raw/*234.21*/("""}"""),format.raw/*234.22*/(""",
                    error: function (data) """),format.raw/*235.44*/("""{"""),format.raw/*235.45*/("""
                        """),format.raw/*236.25*/("""alert("error");
                        //setError('Make call failed');
                    """),format.raw/*238.21*/("""}"""),format.raw/*238.22*/("""
                """),format.raw/*239.17*/("""}"""),format.raw/*239.18*/(""");

            """),format.raw/*241.13*/("""}"""),format.raw/*241.14*/("""

            """),format.raw/*243.13*/("""$(document).on("click", ".open-riskDialog", function () """),format.raw/*243.69*/("""{"""),format.raw/*243.70*/("""
             """),format.raw/*244.14*/("""//   alert($(this).data('risk'));

//                var title = $(this).data('title');

                var riskId=$(this).data('risk');
                var budget = $(this).data('budget');
                var budgetValue = $(this).data('budgetvalue');
                var personnel = $(this).data('personnel');
                var personnelValue = $(this).data('personnelvalue');
                var buttonDisabled= $(this).data('buttondisable');
                if(buttonDisabled===true)"""),format.raw/*254.42*/("""{"""),format.raw/*254.43*/("""
                    """),format.raw/*255.21*/("""document.getElementById("isRiskDisabled").innerHTML="You don't have enough resources to mitigate this risk!";
                """),format.raw/*256.17*/("""}"""),format.raw/*256.18*/("""else"""),format.raw/*256.22*/("""{"""),format.raw/*256.23*/("""
                    """),format.raw/*257.21*/("""document.getElementById("isRiskDisabled").innerHTML="";
                """),format.raw/*258.17*/("""}"""),format.raw/*258.18*/("""
                """),format.raw/*259.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*276.13*/("""}"""),format.raw/*276.14*/(""");

            function onMitigateRisk(id)"""),format.raw/*278.40*/("""{"""),format.raw/*278.41*/("""
"""),format.raw/*279.1*/("""//                alert(id);
                onRiskClick(id);
                onPerformStep(id);

                $('#btnMitigateRisk').val(id);
                $('#btnMitigateRisk').trigger('click');
            """),format.raw/*285.13*/("""}"""),format.raw/*285.14*/("""


            """),format.raw/*288.13*/("""var riskClicked="";
            var totalSteps=0;
            var stepsDone=0;
            var onlyPlanning=true;
            function onRiskClick(id)"""),format.raw/*292.37*/("""{"""),format.raw/*292.38*/("""
"""),format.raw/*293.1*/("""//                alert("fghjh "+id);
                riskClicked=id;
                var obj = """),format.raw/*295.27*/("""{"""),format.raw/*295.28*/("""
                    """),format.raw/*296.21*/("""'riskid': id
                """),format.raw/*297.17*/("""}"""),format.raw/*297.18*/("""
                """),format.raw/*298.17*/("""$.ajax("""),format.raw/*298.24*/("""{"""),format.raw/*298.25*/("""
                    """),format.raw/*299.21*/("""type: 'POST',
                    url: '"""),_display_(/*300.28*/routes/*300.34*/.GameController.getMitigationSteps()),format.raw/*300.70*/("""',
//                     data : '',
                    data: JSON.stringify(obj),
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*304.46*/("""{"""),format.raw/*304.47*/("""

                        """),format.raw/*306.25*/("""totalSteps=data.length;
                        stepsDone=0;
                        var result = "";
                        for (i = 0; i < data.length; i++) """),format.raw/*309.59*/("""{"""),format.raw/*309.60*/("""
                            """),format.raw/*310.29*/("""var obj = data[i];

                            var status;
                            if(obj.status)"""),format.raw/*313.43*/("""{"""),format.raw/*313.44*/("""
                                """),format.raw/*314.33*/("""stepsDone++;
                                obj.status="disabled='true'";
                            """),format.raw/*316.29*/("""}"""),format.raw/*316.30*/("""

"""),format.raw/*318.1*/("""//                                result= result+"<h1>"+obj.projectStepName+"</h1>";
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
                            if(eligibleBudget<0 || eligiblePersonnelRemaining<0)"""),format.raw/*336.81*/("""{"""),format.raw/*336.82*/("""
                                """),format.raw/*337.33*/("""setClassColor="ProjectStepStyle";
                                buttonDisable="true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                            """),format.raw/*340.29*/("""}"""),format.raw/*340.30*/("""else"""),format.raw/*340.34*/("""{"""),format.raw/*340.35*/("""
                                """),format.raw/*341.33*/("""setClassColor=" ";
                                buttonDisable="false"
                            """),format.raw/*343.29*/("""}"""),format.raw/*343.30*/("""
"""),format.raw/*344.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);
                            if(onlyPlanning)"""),format.raw/*348.45*/("""{"""),format.raw/*348.46*/("""
                                """),format.raw/*349.33*/("""if(obj.phaseName=="PLANNING")"""),format.raw/*349.62*/("""{"""),format.raw/*349.63*/("""
                                    """),format.raw/*350.37*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*365.59*/("""{"""),format.raw/*365.60*/("""'id':12,'todo':'xyz'"""),format.raw/*365.80*/("""}"""),format.raw/*365.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button><div class='col-md-1' style='height:90px;'></div>";
//
                                """),format.raw/*370.33*/("""}"""),format.raw/*370.34*/("""else"""),format.raw/*370.38*/("""{"""),format.raw/*370.39*/("""
                                    """),format.raw/*371.37*/("""result = result + "<button disabled" +
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
//                                            "data-todo='"""),format.raw/*386.59*/("""{"""),format.raw/*386.60*/("""'id':12,'todo':'xyz'"""),format.raw/*386.80*/("""}"""),format.raw/*386.81*/("""'"+
                                            "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                            "  id='todolink'>" + obj.projectStepName +
                                            "</button><div class='col-md-1' style='height:90px;'></div>";
//
                                """),format.raw/*391.33*/("""}"""),format.raw/*391.34*/("""


                            """),format.raw/*394.29*/("""}"""),format.raw/*394.30*/("""else"""),format.raw/*394.34*/("""{"""),format.raw/*394.35*/("""
                                """),format.raw/*395.33*/("""result = result + "<button " +
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
//                                            "data-todo='"""),format.raw/*410.59*/("""{"""),format.raw/*410.60*/("""'id':12,'todo':'xyz'"""),format.raw/*410.80*/("""}"""),format.raw/*410.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level +"  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:90px;'></div>";
//
                            """),format.raw/*415.29*/("""}"""),format.raw/*415.30*/("""


                        """),format.raw/*418.25*/("""}"""),format.raw/*418.26*/("""
"""),format.raw/*419.1*/("""//                        alert(stepsDone+"/"+totalSteps);

                        document.getElementById('risksteps').innerHTML = result;
                        document.getElementById('stepForRisk').innerHTML='Steps that are needed to be performed for '+id;
                    """),format.raw/*423.21*/("""}"""),format.raw/*423.22*/(""",
                    error: function (data) """),format.raw/*424.44*/("""{"""),format.raw/*424.45*/("""
                        """),format.raw/*425.25*/("""alert("error in risk click");
                        //setError('Make call failed');
                    """),format.raw/*427.21*/("""}"""),format.raw/*427.22*/("""
                """),format.raw/*428.17*/("""}"""),format.raw/*428.18*/(""");

            """),format.raw/*430.13*/("""}"""),format.raw/*430.14*/("""


            """),format.raw/*433.13*/("""function onPerformStep(id)"""),format.raw/*433.39*/("""{"""),format.raw/*433.40*/("""

"""),format.raw/*435.1*/("""//                var isEligibleToPerformStep=true;
                var performedStep=document.getElementById(id).innerHTML;
                var isProduction = $('#btnIsProduction').val();
               // alert("in project skip..turn no is " + document.getElementById('turnNo').innerHTML);
                if(isProduction == "true")"""),format.raw/*439.43*/("""{"""),format.raw/*439.44*/("""
                    """),format.raw/*440.21*/("""var obj = """),format.raw/*440.31*/("""{"""),format.raw/*440.32*/("""
                        """),format.raw/*441.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*443.35*/model/*443.40*/.getGameId),format.raw/*443.50*/(""",
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
                    """),format.raw/*458.21*/("""}"""),format.raw/*458.22*/(""";
                """),format.raw/*459.17*/("""}"""),format.raw/*459.18*/("""

                """),format.raw/*461.17*/("""else if(id.indexOf("Skip") !==-1 && isProduction == "false")"""),format.raw/*461.77*/("""{"""),format.raw/*461.78*/("""
"""),format.raw/*462.1*/("""//                    alert(id);
                    var obj = """),format.raw/*463.31*/("""{"""),format.raw/*463.32*/("""
                        """),format.raw/*464.25*/("""'id': 'null',
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*466.35*/model/*466.40*/.getGameId),format.raw/*466.50*/(""",
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
                    """),format.raw/*481.21*/("""}"""),format.raw/*481.22*/(""";
                """),format.raw/*482.17*/("""}"""),format.raw/*482.18*/("""

                """),format.raw/*484.17*/("""else if(id.indexOf("CRM") !==-1)"""),format.raw/*484.49*/("""{"""),format.raw/*484.50*/("""
"""),format.raw/*485.1*/("""//                    alert(id);
                    var obj = """),format.raw/*486.31*/("""{"""),format.raw/*486.32*/("""
                        """),format.raw/*487.25*/("""'id': 'null',
                        'riskid' : id,
                        'gameid':"""),_display_(/*489.35*/model/*489.40*/.getGameId),format.raw/*489.50*/(""",
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
                    """),format.raw/*504.21*/("""}"""),format.raw/*504.22*/(""";
                """),format.raw/*505.17*/("""}"""),format.raw/*505.18*/(""" """),format.raw/*505.19*/("""else"""),format.raw/*505.23*/("""{"""),format.raw/*505.24*/("""
                    """),format.raw/*506.21*/("""var obj = """),format.raw/*506.31*/("""{"""),format.raw/*506.32*/("""
                        """),format.raw/*507.25*/("""'id': id,
                        'riskid' : 'null',
                        'gameid':"""),_display_(/*509.35*/model/*509.40*/.getGameId),format.raw/*509.50*/(""",
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
                    """),format.raw/*524.21*/("""}"""),format.raw/*524.22*/(""";
                """),format.raw/*525.17*/("""}"""),format.raw/*525.18*/("""

                """),format.raw/*527.17*/("""$.ajax("""),format.raw/*527.24*/("""{"""),format.raw/*527.25*/("""
                    """),format.raw/*528.21*/("""type: 'POST',
                    url: '"""),_display_(/*529.28*/routes/*529.34*/.GameController.performStep()),format.raw/*529.63*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*534.46*/("""{"""),format.raw/*534.47*/("""
                        """),format.raw/*535.25*/("""onlyPlanning=false;
                        document.getElementById('myCurrentTurn').innerHTML = performedStep;
                        if(data.complete=="true")"""),format.raw/*537.50*/("""{"""),format.raw/*537.51*/("""
"""),format.raw/*538.1*/("""//                            alert(data.complete);
                            swal("""),format.raw/*539.34*/("""{"""),format.raw/*539.35*/("""
                                        """),format.raw/*540.41*/("""title: "Congratulations !",
                                        text: "You ended up the game with "+data.budget,
                                        confirmButtonColor: "#DD6B55",
                                        confirmButtonText: "QuitGame",
                                        closeOnConfirm: false,
                                    """),format.raw/*545.37*/("""}"""),format.raw/*545.38*/(""",
                                    function(isConfirm)"""),format.raw/*546.56*/("""{"""),format.raw/*546.57*/("""
                                        """),format.raw/*547.41*/("""if (isConfirm) """),format.raw/*547.56*/("""{"""),format.raw/*547.57*/("""
"""),format.raw/*548.1*/("""//                                            alert("here");
                                            $('#lnkLeave').trigger('click');

                                        """),format.raw/*551.41*/("""}"""),format.raw/*551.42*/("""
                                    """),format.raw/*552.37*/("""}"""),format.raw/*552.38*/(""");
                        """),format.raw/*553.25*/("""}"""),format.raw/*553.26*/("""


                       """),format.raw/*556.24*/("""else if(data.steptype == "OOPS")
                        """),format.raw/*557.25*/("""{"""),format.raw/*557.26*/("""
                           """),format.raw/*558.28*/("""// $('#updateactivity').trigger('click');

                            var alertmsg = "You lost ";

                            if(data.oops_resource !=0) """),format.raw/*562.56*/("""{"""),format.raw/*562.57*/("""
                                """),format.raw/*563.33*/("""alertmsg = alertmsg + data.oops_resource + " resource, ";
                            """),format.raw/*564.29*/("""}"""),format.raw/*564.30*/("""
                            """),format.raw/*565.29*/("""if(data.oops_points !=0) """),format.raw/*565.54*/("""{"""),format.raw/*565.55*/("""
                                """),format.raw/*566.33*/("""alertmsg = alertmsg + data.oops_points + " capability points, ";
                            """),format.raw/*567.29*/("""}"""),format.raw/*567.30*/("""
                            """),format.raw/*568.29*/("""if(data.oops_bonus !=0) """),format.raw/*568.53*/("""{"""),format.raw/*568.54*/("""
                                """),format.raw/*569.33*/("""alertmsg = alertmsg + data.oops_bonus + " capability bonus, ";
                            """),format.raw/*570.29*/("""}"""),format.raw/*570.30*/("""
                            """),format.raw/*571.29*/("""if(data.oops_budget !=0) """),format.raw/*571.54*/("""{"""),format.raw/*571.55*/("""
                                """),format.raw/*572.33*/("""alertmsg = alertmsg + data.oops_budget + " dollars, ";
                            """),format.raw/*573.29*/("""}"""),format.raw/*573.30*/("""
                            """),format.raw/*574.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            swal("""),format.raw/*576.34*/("""{"""),format.raw/*576.35*/("""   """),format.raw/*576.38*/("""title: "YOU GOT AN OOPS CARD!",   text: alertmsg,   imageUrl: "/assets/images/oops.png" """),format.raw/*576.126*/("""}"""),format.raw/*576.127*/(""");

                            $("#oopsmsg").val(alertmsg);
                            $("#isoops").val("true");
                            $('#updateactivity').trigger('click');
                          //  swal("YOU GOT AN OOPS CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got an OOPS card!";
                        """),format.raw/*583.25*/("""}"""),format.raw/*583.26*/("""
                        """),format.raw/*584.25*/("""else if(data.steptype == "SURPRISE")"""),format.raw/*584.61*/("""{"""),format.raw/*584.62*/("""

                            """),format.raw/*586.29*/("""var alertmsg = "You gained ";

                            if(data.surprise_resource !=0) """),format.raw/*588.60*/("""{"""),format.raw/*588.61*/("""
                                """),format.raw/*589.33*/("""alertmsg = alertmsg + data.surprise_resource + " resource, ";
                            """),format.raw/*590.29*/("""}"""),format.raw/*590.30*/("""
                            """),format.raw/*591.29*/("""if(data.surprise_points !=0) """),format.raw/*591.58*/("""{"""),format.raw/*591.59*/("""
                                """),format.raw/*592.33*/("""alertmsg = alertmsg + data.surprise_points + " capability points, ";
                            """),format.raw/*593.29*/("""}"""),format.raw/*593.30*/("""
                            """),format.raw/*594.29*/("""if(data.surprise_bonus !=0) """),format.raw/*594.57*/("""{"""),format.raw/*594.58*/("""
                                """),format.raw/*595.33*/("""alertmsg = alertmsg + data.surprise_bonus + " capability bonus, ";
                            """),format.raw/*596.29*/("""}"""),format.raw/*596.30*/("""
                            """),format.raw/*597.29*/("""if(data.surprise_budget !=0) """),format.raw/*597.58*/("""{"""),format.raw/*597.59*/("""
                                """),format.raw/*598.33*/("""alertmsg = alertmsg + data.surprise_budget + " dollars, ";
                            """),format.raw/*599.29*/("""}"""),format.raw/*599.30*/("""
                            """),format.raw/*600.29*/("""alertmsg = alertmsg.substring(0, alertmsg.length - 2);

                            swal("""),format.raw/*602.34*/("""{"""),format.raw/*602.35*/("""   """),format.raw/*602.38*/("""title: "YOU GOT A SURPRISE CARD!",   text: alertmsg,   imageUrl: "/assets/images/surprise.png" """),format.raw/*602.133*/("""}"""),format.raw/*602.134*/(""");
                            $("#isoops").val("false");
                            $("#oopsmsg").val(alertmsg);
                            $('#updateactivity').trigger('click');
                           // swal("YOU GOT A SURPRISE CARD!",alertmsg, "error");
                            document.getElementById('myCurrentTurn').innerHTML = "You got a Surprise card!";
                        """),format.raw/*608.25*/("""}"""),format.raw/*608.26*/("""
                        """),format.raw/*609.25*/("""else if(data.steptype == "production")"""),format.raw/*609.63*/("""{"""),format.raw/*609.64*/("""
                            """),format.raw/*610.29*/("""var alertmsg = "";
                            if(data.prod_money < 0)"""),format.raw/*611.52*/("""{"""),format.raw/*611.53*/("""
                                """),format.raw/*612.33*/("""alertmsg = "Your product is not doing well. You lost " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*613.29*/("""}"""),format.raw/*613.30*/("""
                            """),format.raw/*614.29*/("""else"""),format.raw/*614.33*/("""{"""),format.raw/*614.34*/("""
                                """),format.raw/*615.33*/("""alertmsg = "Your product is doing well. You won " + Math.abs(data.prod_money) + " dollars in Production.";
                            """),format.raw/*616.29*/("""}"""),format.raw/*616.30*/("""

                            """),format.raw/*618.29*/("""swal(alertmsg);
                        """),format.raw/*619.25*/("""}"""),format.raw/*619.26*/("""
                        """),format.raw/*620.25*/("""else if(data.steptype == "skipstep")"""),format.raw/*620.61*/("""{"""),format.raw/*620.62*/("""
                            """),format.raw/*621.29*/("""if($('#btnIsProduction').val() != "true")"""),format.raw/*621.70*/("""{"""),format.raw/*621.71*/("""
                                """),format.raw/*622.33*/("""swal("""),format.raw/*622.38*/("""{"""),format.raw/*622.39*/("""   """),format.raw/*622.42*/("""title: "YOU SKIPPED YOUR TURN!",  imageUrl: "/assets/images/skipturn.png" """),format.raw/*622.116*/("""}"""),format.raw/*622.117*/(""");
                            """),format.raw/*623.29*/("""}"""),format.raw/*623.30*/("""

                        """),format.raw/*625.25*/("""}"""),format.raw/*625.26*/("""
                        """),format.raw/*626.25*/("""else if(data.steptype == "risk")"""),format.raw/*626.57*/("""{"""),format.raw/*626.58*/("""
                            """),format.raw/*627.29*/("""if(data.risk_status == "success")"""),format.raw/*627.62*/("""{"""),format.raw/*627.63*/("""
                                """),format.raw/*628.33*/("""swal("""),format.raw/*628.38*/("""{"""),format.raw/*628.39*/("""   """),format.raw/*628.42*/("""title: "SUCCESS!",   text: "RISK SUCCESSFULLY MITIGATED",   imageUrl: "/assets/images/rockon.png" """),format.raw/*628.140*/("""}"""),format.raw/*628.141*/(""");
                            """),format.raw/*629.29*/("""}"""),format.raw/*629.30*/("""
                            """),format.raw/*630.29*/("""else"""),format.raw/*630.33*/("""{"""),format.raw/*630.34*/("""
                                """),format.raw/*631.33*/("""swal("""),format.raw/*631.38*/("""{"""),format.raw/*631.39*/("""   """),format.raw/*631.42*/("""title: "OOPS",   text: "RISK NOT MITIGATED",   imageUrl: "/assets/images/oops.png" """),format.raw/*631.125*/("""}"""),format.raw/*631.126*/(""");
                            """),format.raw/*632.29*/("""}"""),format.raw/*632.30*/("""
                        """),format.raw/*633.25*/("""}"""),format.raw/*633.26*/("""
                        """),format.raw/*634.25*/("""else
                        """),format.raw/*635.25*/("""{"""),format.raw/*635.26*/("""
                            """),format.raw/*636.29*/("""swal("""),format.raw/*636.34*/("""{"""),format.raw/*636.35*/("""   """),format.raw/*636.38*/("""title: "SUCCESS!",   text: "PROJECT STEP SUCCESSFUL",   imageUrl: "/assets/images/rockon.png" """),format.raw/*636.132*/("""}"""),format.raw/*636.133*/(""");

                        """),format.raw/*638.25*/("""}"""),format.raw/*638.26*/("""
                        """),format.raw/*639.25*/("""document.getElementById('budgetremaining').innerHTML = data.budget;
                        document.getElementById('capabilitypoints').innerHTML = data.capabilitypoints;
                        document.getElementById('capabilitybonus').innerHTML = data.capabilitybonus;
                        document.getElementById('personnelremaining').innerHTML = data.personnel;
                        document.getElementById('turnNo').innerHTML = data.currentturn;
                        document.getElementById('oneTurn').innerHTML = data.oneturn;
                        document.getElementById('twoTurn').innerHTML = data.twoturn;
                        onPhaseClick(currentPhase);

                        onRiskClick(riskClicked);

                        if(id.indexOf("CRM") !==-1 || lastclickedTab.indexOf("risk")!==-1)"""),format.raw/*650.91*/("""{"""),format.raw/*650.92*/("""

                            """),format.raw/*652.29*/("""onRiskDashboardClick();
                            $('#riskDialog').modal('hide');
                        """),format.raw/*654.25*/("""}"""),format.raw/*654.26*/("""
                        """),format.raw/*655.25*/("""refreshProjectSteps();


                    """),format.raw/*658.21*/("""}"""),format.raw/*658.22*/(""",
                    error: function (data) """),format.raw/*659.44*/("""{"""),format.raw/*659.45*/("""
                      """),format.raw/*660.23*/("""//  alert("error in perform project step");
                        alert(data);
                        //setError('Make call failed');
                    """),format.raw/*663.21*/("""}"""),format.raw/*663.22*/("""
                """),format.raw/*664.17*/("""}"""),format.raw/*664.18*/(""");
            """),format.raw/*665.13*/("""}"""),format.raw/*665.14*/("""

            """),format.raw/*667.13*/("""var currentPhase="";
            var stepsDoneInPlanning=0;
            function onPhaseClick(clicked_id) """),format.raw/*669.47*/("""{"""),format.raw/*669.48*/("""

                 """),format.raw/*671.18*/("""//  alert(clicked_id);
                currentPhase=clicked_id;
                var test = 'abc';
//                    var test = $.('#id').val();
//                    alert(clicked_id);
                var obj = """),format.raw/*676.27*/("""{"""),format.raw/*676.28*/("""
                    """),format.raw/*677.21*/("""'phaseId': clicked_id
                """),format.raw/*678.17*/("""}"""),format.raw/*678.18*/(""";

                if(currentPhase == "CPM6")"""),format.raw/*680.43*/("""{"""),format.raw/*680.44*/("""
                    """),format.raw/*681.21*/("""swal("""),format.raw/*681.26*/("""{"""),format.raw/*681.27*/("""   """),format.raw/*681.30*/("""title: "Are you sure?",   text: "You will not be able to do any further project steps after production!",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Yes, Go to Production!",   closeOnConfirm: false """),format.raw/*681.285*/("""}"""),format.raw/*681.286*/(""", function()"""),format.raw/*681.298*/("""{"""),format.raw/*681.299*/("""

               """),format.raw/*683.16*/("""var maxTurns = document.getElementById('labelTurns').innerText;
               var currentTurn =  document.getElementById('turnNo').innerHTML;
                     /*   $('#grid-basic > tbody  > tr').each(function() """),format.raw/*685.74*/("""{"""),format.raw/*685.75*/("""
                            """),format.raw/*686.29*/("""var status = $(this).find("input.name").val();


                        """),format.raw/*689.25*/("""}"""),format.raw/*689.26*/(""");*/
                        var riskcount = 0;
                        $('#grid-basic tr').each(function() """),format.raw/*691.61*/("""{"""),format.raw/*691.62*/("""
                            """),format.raw/*692.29*/("""var status = $(this).find("td").eq(2).html();

                            if(status == "COMPLETED")"""),format.raw/*694.54*/("""{"""),format.raw/*694.55*/("""
                                """),format.raw/*695.33*/("""riskcount++;
                            """),format.raw/*696.29*/("""}"""),format.raw/*696.30*/("""
                        """),format.raw/*697.25*/("""}"""),format.raw/*697.26*/(""");
                        $('#txtRiskCount').val(riskcount.toString());
                        //alert(riskcount);
                        currentPhase = "CPM1";
                        $('#btnIsProduction').val("true");
                        $('#btnSkip').trigger('click');
                    if(currentTurn < maxTurns) """),format.raw/*703.48*/("""{"""),format.raw/*703.49*/("""
                        """),format.raw/*704.25*/("""swal("Your product is LIVE!", "You have successfully deployed your software to production.", "success");
                    """),format.raw/*705.21*/("""}"""),format.raw/*705.22*/("""
                        """),format.raw/*706.25*/("""}"""),format.raw/*706.26*/(""");
                """),format.raw/*707.17*/("""}"""),format.raw/*707.18*/("""

                """),format.raw/*709.17*/("""else """),format.raw/*709.22*/("""{"""),format.raw/*709.23*/("""

                    """),format.raw/*711.21*/("""$.ajax("""),format.raw/*711.28*/("""{"""),format.raw/*711.29*/("""
                        """),format.raw/*712.25*/("""type: 'POST',
                        url: '"""),_display_(/*713.32*/routes/*713.38*/.GameController.getProjectSteps()),format.raw/*713.71*/("""',
                        // data : JSON.stringify(obj),
                        data: JSON.stringify(obj),
                        // dataType: 'json',
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*718.50*/("""{"""),format.raw/*718.51*/("""
"""),format.raw/*719.1*/("""//                            alert(Object.prototype.toString.call(data));
//                        alert('im here');
                            var result = "";
                            for (i = 0; i < data.length; i++) """),format.raw/*722.63*/("""{"""),format.raw/*722.64*/("""
                                """),format.raw/*723.33*/("""var obj = data[i];
                                if (currentPhase == "CPM1") """),format.raw/*724.61*/("""{"""),format.raw/*724.62*/("""
                                    """),format.raw/*725.37*/("""if (obj.status) """),format.raw/*725.53*/("""{"""),format.raw/*725.54*/("""
                                        """),format.raw/*726.41*/("""stepsDoneInPlanning++;
                                    """),format.raw/*727.37*/("""}"""),format.raw/*727.38*/("""
                                """),format.raw/*728.33*/("""}"""),format.raw/*728.34*/("""
"""),format.raw/*729.1*/("""//                                alert(obj.status);
                                var status;
                                if (obj.status) """),format.raw/*731.49*/("""{"""),format.raw/*731.50*/("""
                                    """),format.raw/*732.37*/("""obj.status = "disabled='true'"
                                """),format.raw/*733.33*/("""}"""),format.raw/*733.34*/("""


                                """),format.raw/*736.33*/("""var eligibleBudget = 0;
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
                                if (eligibleBudget < 0 || eligiblePersonnelRemaining < 0) """),format.raw/*750.91*/("""{"""),format.raw/*750.92*/("""
                                    """),format.raw/*751.37*/("""setClassColor = "ProjectStepStyle";
                                    buttonDisable = "true";
//                                alert("you cannot perform this step "+obj.projectStepName );
                                """),format.raw/*754.33*/("""}"""),format.raw/*754.34*/(""" """),format.raw/*754.35*/("""else """),format.raw/*754.40*/("""{"""),format.raw/*754.41*/("""
                                    """),format.raw/*755.37*/("""setClassColor = " ";
                                    buttonDisable = "false"
                                """),format.raw/*757.33*/("""}"""),format.raw/*757.34*/("""
"""),format.raw/*758.1*/("""//                              alert(document.getElementById('budgetremaining').innerHTML);
//                            alert("elig"+setColor);

//                            alert(eligibleBudget+" "+eligibleCapabilityBonus+" "+eligibleCapabilityPoints+" "+eligiblePersonnelRemaining);

                                result = result + "<button " +
                                        " href='#editTodoDialog'  id='" + obj.projectStepId + "'" +
                                        " style='white-space: normal; ' " +
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
//                                            "data-todo='"""),format.raw/*778.59*/("""{"""),format.raw/*778.60*/("""'id':12,'todo':'xyz'"""),format.raw/*778.80*/("""}"""),format.raw/*778.81*/("""'"+
                                        "title='Budget :" + obj.budget + "  Level: " + obj.level + "  Personnel: " + obj.personnel + "'" +
                                        "  id='todolink'>" + obj.projectStepName +
                                        "</button><div class='col-md-1' style='height:90px;'></div>";
//                                    "</button><div class='col-md-1' style='height:90px;"+setColor+"'"></div>";

                            """),format.raw/*784.29*/("""}"""),format.raw/*784.30*/("""

"""),format.raw/*786.1*/("""//                            alert("*********"+stepsDoneInPlanning);
                            document.getElementById('desc').innerHTML = "Steps in " + document.getElementById(currentPhase).innerHTML ;

                            document.getElementById('results').innerHTML = result;

                        """),format.raw/*791.25*/("""}"""),format.raw/*791.26*/(""",
                        error: function (data) """),format.raw/*792.48*/("""{"""),format.raw/*792.49*/("""
                            """),format.raw/*793.29*/("""alert("error");
                            //setError('Make call failed');
                        """),format.raw/*795.25*/("""}"""),format.raw/*795.26*/("""
                    """),format.raw/*796.21*/("""}"""),format.raw/*796.22*/(""");
                """),format.raw/*797.17*/("""}"""),format.raw/*797.18*/("""
            """),format.raw/*798.13*/("""}"""),format.raw/*798.14*/("""

            """),format.raw/*800.13*/("""$(document).on("click", ".open-EditTodo", function () """),format.raw/*800.67*/("""{"""),format.raw/*800.68*/("""
"""),format.raw/*801.1*/("""//                alert($(this).data('title'));

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
                if(buttonDisabled===true)"""),format.raw/*817.42*/("""{"""),format.raw/*817.43*/("""
                    """),format.raw/*818.21*/("""document.getElementById("isDisabled").innerHTML="Oops! You don't have enough resources to perform this step!";
                """),format.raw/*819.17*/("""}"""),format.raw/*819.18*/("""else"""),format.raw/*819.22*/("""{"""),format.raw/*819.23*/("""
                    """),format.raw/*820.21*/("""document.getElementById("isDisabled").innerHTML="";
                """),format.raw/*821.17*/("""}"""),format.raw/*821.18*/("""
                """),format.raw/*822.17*/("""var projectStepId = $(this).data('id');
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


            """),format.raw/*841.13*/("""}"""),format.raw/*841.14*/(""");




            function totalGameTimer() """),format.raw/*846.39*/("""{"""),format.raw/*846.40*/("""

                """),format.raw/*848.17*/("""var sec = 0;

                function pad(val) """),format.raw/*850.35*/("""{"""),format.raw/*850.36*/("""
                    """),format.raw/*851.21*/("""return val > 9 ? val : "0" + val;
                """),format.raw/*852.17*/("""}"""),format.raw/*852.18*/("""

                """),format.raw/*854.17*/("""var timer = setInterval(function () """),format.raw/*854.53*/("""{"""),format.raw/*854.54*/("""
                    """),format.raw/*855.21*/("""document.getElementById("seconds").innerHTML = pad(++sec % 60);
                    document.getElementById("minutes").innerHTML = pad(parseInt(sec / 60, 10));
                """),format.raw/*857.17*/("""}"""),format.raw/*857.18*/(""", 1000);

                setTimeout(function () """),format.raw/*859.40*/("""{"""),format.raw/*859.41*/("""
                    """),format.raw/*860.21*/("""clearInterval(timer);
                """),format.raw/*861.17*/("""}"""),format.raw/*861.18*/(""", 50000000);
            """),format.raw/*862.13*/("""}"""),format.raw/*862.14*/("""
            """),format.raw/*863.13*/("""function refreshProjectSteps()"""),format.raw/*863.43*/("""{"""),format.raw/*863.44*/("""
                """),format.raw/*864.65*/("""
                """),format.raw/*865.17*/("""var result="";
            """),_display_(/*866.14*/for(phases <- model.getPhases()) yield /*866.46*/ {_display_(Seq[Any](format.raw/*866.48*/("""

                """),format.raw/*868.17*/("""result = result+ "<button class='col-md-3 btn btn-warning' " +
                        "style='background-color: #DB8B00 !important;'" +
                        "onclick='onPhaseClick(id)' " +
                        "id='"""),_display_(/*871.31*/phases/*871.37*/.getPhaseId),format.raw/*871.48*/("""'>"""),_display_(/*871.51*/phases/*871.57*/.getPhaseName),format.raw/*871.70*/("""</button><div class='col-md-1' style='height: 60px;'> </div>";


                """)))}),format.raw/*874.18*/("""
                """),format.raw/*875.17*/("""document.getElementById('listOfProjectSteps').innerHTML = result;
//                alert(result);

            """),format.raw/*878.13*/("""}"""),format.raw/*878.14*/("""

            """),format.raw/*880.13*/("""function newfunc()"""),format.raw/*880.31*/("""{"""),format.raw/*880.32*/("""
                """),format.raw/*881.17*/("""swal("", "Please do not refresh the screen else you will lose your data", "warning");

            """),format.raw/*883.13*/("""}"""),format.raw/*883.14*/("""
    """),format.raw/*884.5*/("""</script>
    <body style="background-image: url("""),_display_(/*885.41*/routes/*885.47*/.Assets.at("images/bg.jpg")),format.raw/*885.74*/(""");" onload="onProjectStepTabClick();newfunc();onPhaseClick('CPM1');
    totalGameTimer()">
        <input type="hidden" name="phase" id="phase" value="plan"/>
        <input type="hidden" name="username" id="username" value='"""),_display_(/*888.68*/model/*888.73*/.getUserName()),format.raw/*888.87*/("""'/>
        <input type="hidden" name="gameid" id="gameid" value='"""),_display_(/*889.64*/model/*889.69*/.getGameId()),format.raw/*889.81*/("""'/>
        <input type="hidden" name="turn" id="turn" value='"""),_display_(/*890.60*/model/*890.65*/.getTurnNo()),format.raw/*890.77*/("""'/>
        <input type="hidden" name="moveTime" id="moveTime" value='"""),_display_(/*891.68*/model/*891.73*/.getTimeForEachMove()),format.raw/*891.94*/("""'/>
        <input type="hidden" id="notmymove" value=''/>

        <div class="container" >

            <form  id="dashform" hidden method ="GET" action=""""),_display_(/*896.64*/routes/*896.70*/.DashboardController.viewDashboard()),format.raw/*896.106*/("""">
            </form>

            <button hidden id="btnMitigateRisk" value=""></button>

            <header style="" >

                <div class="col-md-2" style="background-color: #CED4BD">RISK-GAME</div>
                """),format.raw/*904.51*/("""
                """),format.raw/*905.17*/("""<div class="col-md-2" style="background-color: #CED4BD" id="gameid">Game ID: """),_display_(/*905.95*/model/*905.100*/.getGameId()),format.raw/*905.112*/("""</div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total no. of turns:
                    <span id="labelTurns">"""),_display_(/*908.44*/model/*908.49*/.getStepsForEachPlayer()),format.raw/*908.73*/("""</span>
                </div>
                <div class="col-md-3" style="background-color: #CED4BD">
                    Total Game time
                    <span id="minutes">00</span>:<span id="seconds">00</span>
                </div>
                <div class="col-md-2" style="display: inline-block;">
                        <!-- Single button --><div style=" display: inline-block;" class="glyphicon glyphicon-user">Welcome """),_display_(/*915.126*/model/*915.131*/.getUserName().split("@")/*915.156*/(0)),format.raw/*915.159*/("""!</div>
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


                        <!-- //first div -->

                    <div class="panel panel-default">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">My Status</h4>
                        </div>
                        <div class="panel-body" style="height: 200px; overflow-wrap: break-word;overflow-y: scroll;font-size:small; text-align: left">
                            <div style=" display: inline-block;">Budget:</div><div style=" display: inline-block; float: right " id="budgetremaining"> """),_display_(/*953.153*/model/*953.158*/.getBudget()),format.raw/*953.170*/("""</div>
                            <div style=" display: inline-block;">Capability Points:</div><div style=" display: inline-block; float: right" id="capabilitypoints"> """),_display_(/*954.164*/model/*954.169*/.getCapabilityPoints()),format.raw/*954.191*/("""</div>
                            <div style=" display: inline-block;">Capability Bonus:</div><div style=" display: inline-block; float: right" id="capabilitybonus"> """),_display_(/*955.162*/model/*955.167*/.getCapabilityBonus()),format.raw/*955.188*/("""</div>
                            <div style=" display: inline-block;">Personnel:</div><div style=" display: inline-block; float: right" id="personnelremaining"> """),_display_(/*956.158*/model/*956.163*/.getResources),format.raw/*956.176*/("""</div>
                            <div>No. of resources who will return after </div>
                            <div style=" display: inline-block;">One Turn:</div><div style=" display: inline-block; float: right" id="oneTurn">0</div><br/>
                            <div style=" display: inline-block;">Two Turns:</div><div style=" display: inline-block; float: right" id="twoTurn">0</div>
                            """),format.raw/*960.120*/("""

                        """),format.raw/*962.25*/("""</div>
                        <div class="modal fade" id="myAssetModal" role="dialog">
                            <div class="modal-dialog">

                                    <!-- Modal content-->
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title">Status</h4>
                                    </div>
                                    <div class="modal-body" style="text-align: left">
                                        <div>Budget Remaining: """),_display_(/*973.65*/model/*973.70*/.getBudget()),format.raw/*973.82*/("""</div>
                                        <div>Capability Points: """),_display_(/*974.66*/model/*974.71*/.getCapabilityPoints()),format.raw/*974.93*/("""</div>
                                        <div>Capability Bonus: """),_display_(/*975.65*/model/*975.70*/.getCapabilityBonus()),format.raw/*975.91*/("""</div>
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
                    </div>
                        <!-- //end  of first div -->

                        <!-- //second div -->
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Current Action</h4>
                        </div>
                        <div class="panel-body" style="height: 150px; overflow-wrap: break-word;overflow-y: scroll">
                            <div style=" display: inline-block;">Turn No: </div><div style=" display: inline-block;" id="turnNo">1</div>

                            <div class="col-md-3 mytimer" style="zoom: 0.4;padding:0" hidden>

                            </div>
                            <input type ="text" hidden id="btnIsProduction" value="false"/>
                            <button class="btn btn-danger" id="btnSkip" onclick="onPerformStep(id)">Skip Turn</button>
                            <button style="display: none" class="btn btn-danger" id="btnSkipTimeout" onclick="onPerformStep(id)">Timeout button</button>
                            <div>Your last turn:</div>
                            <div id="myCurrentTurn"></div>

                        </div>

                    </div>

                        <!-- \\ end of second div -->

                        <!-- \\ start of third div -->
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Active Players </h4>
                        </div>
                        <div id="activePlayersList" class="panel-body" style="height: 60px;overflow-wrap: break-word;overflow-y: scroll">
                            user1<br/>
                            user2<br/>
                        </div>
                    </div>
                    """),format.raw/*1030.51*/("""
                    """),format.raw/*1031.55*/("""
                    """),format.raw/*1032.52*/("""
                    """),format.raw/*1033.105*/("""


                """),format.raw/*1036.17*/("""</div>
                    <!-- \\ end of big1 div -->




                    <!-- \\ start of center div - phases and steps -->
                <div class="col-md-8 card" style="border: 1px solid transparent">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" onclick="onProjectStepTabClick()" href="#projectSteps">Project Steps</a></li>
                        <li><a data-toggle="tab" href="#riskDashboard" onclick="onRiskDashboardClick()">Risk Dashboard</a></li>
                    </ul>
                    <div class="tab-content">
                        <div id="projectSteps" class="tab-pane fade in active">
                            <div class="col-md-12" style="border: 1px solid transparent">

                                <div style="height: 20px; "></div>

                                <div id="listOfProjectSteps">


                                    """),_display_(/*1057.38*/for(phase <- model.getPhases()) yield /*1057.69*/ {_display_(Seq[Any](format.raw/*1057.71*/("""
                                        """),_display_(/*1058.42*/if(phase.getPhaseName().equalsIgnoreCase("PLANNING"))/*1058.95*/{_display_(Seq[Any](format.raw/*1058.96*/("""

                                            """),format.raw/*1060.45*/("""<button  class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1063.49*/phase/*1063.54*/.getPhaseId),format.raw/*1063.65*/(""">"""),_display_(/*1063.67*/phase/*1063.72*/.getPhaseName()),format.raw/*1063.87*/("""</button>
                                            <div class="col-md-1" style="height: 60px;"> </div>
                                        """)))}/*1065.42*/else/*1065.46*/{_display_(Seq[Any](format.raw/*1065.47*/("""
                                            """),format.raw/*1066.45*/("""<button disabled="true" class="col-md-3 btn btn-warning"
                                            style="background-color: #DB8B00 !important;"
                                            onclick="onPhaseClick(id)"
                                            id="""),_display_(/*1069.49*/phase/*1069.54*/.getPhaseId),format.raw/*1069.65*/(""">"""),_display_(/*1069.67*/phase/*1069.72*/.getPhaseName()),format.raw/*1069.87*/("""</button>
                                            <div class="col-md-1" style="height: 60px;"> </div>
                                        """)))}),format.raw/*1071.42*/("""

                                    """)))}),format.raw/*1073.38*/("""


                                """),format.raw/*1076.33*/("""</div>





                            </div>

                            <div class="col-md-12" style="border: 1px solid transparent;
                                height: 400px">
                                <hr style="width: 100%;
                                    color: black;
                                    height: 1px;
                                    background-color: black;" />
                                <div id="desc"></div>
                                <div class="col-md-12" style="height: 30px;"> </div>

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


                    <div class="panel panel-default" style="width:195px;margin-bottom: 5px; background: beige;">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Chat</h4>
                        </div>
                        <div id="chatArea" class="panel-body" style="height: 200px;font-size: 12px;
                            border: 1px solid transparent;
                            background-size: 100% 100%; overflow-wrap: break-word;overflow-y: scroll;text-align: left">
                        </div>

                    </div>

                    <textarea id="txtMessage" placeholder="Enter text (max 250 characters) and hit enter." style="width:195px;margin-bottom:20px;">

                    </textarea>
                    <div>
                        """),format.raw/*1153.101*/("""
                    """),format.raw/*1154.21*/("""</div>


                    <div class="panel panel-default" style="width:195px;">
                        <div class="panel-heading" style="background-color: #A8A2A3">
                            <h4 class="panel-title">Activity Log </h4>
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

                            <div class="col-xs-12" style="height: 30px;"></div>
                            <div id="performstep"></div>
                            <button disabled=""  id="" class="btn btn-success perform-step"  style="margin-bottom: 20px" onclick="onPerformStep(id)" >Perform this Step</button>
                            <button data-dismiss="modal" class="btn btn-danger"  style="margin-bottom: 20px" aria-label="Close">Cancel</button>
                            <button disabled="" hidden  id="updateactivity" class=""  style="margin-bottom: 20px"  ></button>
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
                            <button id="performrisk" class="btn btn-success perform-risk"  style="margin-bottom: 20px" onclick="onMitigateRisk(id)" >Perform this Risk</button>
                            <button data-dismiss="modal" class="btn btn-danger"  style="margin-bottom: 20px" aria-label="Close">Cancel</button>
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
                  DATE: Mon Dec 19 11:14:25 EST 2016
                  SOURCE: /home/nivas/IdeaProjects/Project_RiskGame/app/views/ProjectStep.scala.html
                  HASH: e178630cffc44bc2bec7c067c8ab82ef630b6cec
                  MATRIX: 822->55|948->86|975->87|1462->650|1498->659|1768->902|1783->908|1845->948|1899->975|1914->981|1978->1024|2094->1113|2109->1119|2164->1153|2250->1212|2265->1218|2321->1253|2407->1312|2422->1318|2488->1362|2574->1421|2589->1427|2650->1466|2736->1525|2751->1531|2813->1571|2855->1687|2891->1696|2932->1710|2947->1716|3011->1759|3095->1816|3110->1822|3169->1860|3230->1894|3245->1900|3306->1940|3367->1974|3382->1980|3447->2024|3547->2097|3562->2103|3604->2124|3653->2252|3691->2363|3727->2372|3808->2425|3837->2426|3878->2439|3954->2488|3983->2489|4020->2499|4051->2502|4080->2503|4121->2516|4211->2579|4240->2580|4277->2590|4322->2607|4351->2608|4392->2621|4482->2684|4511->2685|4550->2697|4703->2822|4732->2823|4773->2836|4885->2921|4914->2922|4950->2931|5037->2990|5066->2991|5107->3004|5219->3089|5248->3090|5285->3100|5376->3163|5405->3164|5446->3177|5558->3262|5587->3263|5624->3273|5662->3283|5691->3284|5732->3297|5844->3382|5873->3383|5909->3392|5947->3402|5976->3403|6017->3416|6411->3783|6440->3784|6476->3793|6520->3809|6549->3810|6590->3823|6782->3988|6811->3989|6847->3998|6919->4042|6948->4043|6989->4056|7258->4298|7287->4299|7324->4309|7432->4390|7461->4391|7502->4404|7726->4600|7756->4601|7794->4611|7834->4622|7864->4623|7906->4636|8478->5180|8508->5181|8545->5190|8585->5201|8615->5202|8657->5215|9020->5550|9050->5551|9088->5561|9134->5578|9164->5579|9206->5592|9427->5785|9457->5786|9494->5795|9535->5807|9565->5808|9607->5821|9877->6063|9907->6064|9948->6077|10045->6145|10075->6146|10122->6164|10182->6195|10212->6196|10254->6209|10348->6274|10378->6275|10425->6293|10496->6335|10526->6336|10568->6349|10628->6380|10658->6381|10704->6398|10788->6453|10818->6454|10868->6475|10937->6516|10953->6522|11005->6552|11256->6774|11286->6775|11315->6776|11594->7026|11624->7027|11683->7057|12044->7389|12074->7390|12103->7391|12336->7595|12366->7596|12399->7600|12429->7601|12491->7634|12570->7684|12600->7685|12661->7717|13747->8774|13777->8775|13839->8808|14079->9019|14109->9020|14142->9024|14172->9025|14234->9058|14364->9159|14394->9160|14423->9161|15978->10687|16008->10688|16062->10713|16212->10834|16242->10835|16316->10880|16346->10881|16400->10906|16521->10998|16551->10999|16597->11016|16627->11017|16672->11033|16702->11034|16745->11048|16830->11104|16860->11105|16903->11119|17422->11609|17452->11610|17502->11631|17657->11757|17687->11758|17720->11762|17750->11763|17800->11784|17901->11856|17931->11857|17977->11874|18827->12695|18857->12696|18929->12739|18959->12740|18988->12741|19230->12954|19260->12955|19304->12970|19483->13120|19513->13121|19542->13122|19667->13218|19697->13219|19747->13240|19805->13269|19835->13270|19881->13287|19917->13294|19947->13295|19997->13316|20066->13357|20082->13363|20140->13399|20351->13581|20381->13582|20436->13608|20625->13768|20655->13769|20713->13798|20844->13900|20874->13901|20936->13934|21068->14037|21098->14038|21128->14040|22368->15251|22398->15252|22460->15285|22700->15496|22730->15497|22763->15501|22793->15502|22855->15535|22985->15636|23015->15637|23044->15638|23406->15971|23436->15972|23498->16005|23556->16034|23586->16035|23652->16072|25129->17520|25159->17521|25208->17541|25238->17542|25641->17916|25671->17917|25704->17921|25734->17922|25800->17959|27285->19415|27315->19416|27364->19436|27394->19437|27797->19811|27827->19812|27887->19843|27917->19844|27950->19848|27980->19849|28042->19882|29463->21274|29493->21275|29542->21295|29572->21296|29959->21654|29989->21655|30045->21682|30075->21683|30104->21684|30416->21967|30446->21968|30520->22013|30550->22014|30604->22039|30739->22145|30769->22146|30815->22163|30845->22164|30890->22180|30920->22181|30964->22196|31019->22222|31049->22223|31079->22225|31442->22559|31472->22560|31522->22581|31561->22591|31591->22592|31645->22617|31764->22708|31779->22713|31811->22723|32832->23715|32862->23716|32909->23734|32939->23735|32986->23753|33075->23813|33105->23814|33134->23815|33226->23878|33256->23879|33310->23904|33429->23995|33444->24000|33476->24010|34494->24999|34524->25000|34571->25018|34601->25019|34648->25037|34709->25069|34739->25070|34768->25071|34860->25134|34890->25135|34944->25160|35059->25247|35074->25252|35106->25262|36129->26256|36159->26257|36206->26275|36236->26276|36266->26277|36299->26281|36329->26282|36379->26303|36418->26313|36448->26314|36502->26339|36617->26426|36632->26431|36664->26441|37677->27425|37707->27426|37754->27444|37784->27445|37831->27463|37867->27470|37897->27471|37947->27492|38016->27533|38032->27539|38083->27568|38345->27801|38375->27802|38429->27827|38619->27988|38649->27989|38678->27990|38792->28075|38822->28076|38892->28117|39279->28475|39309->28476|39395->28533|39425->28534|39495->28575|39539->28590|39569->28591|39598->28592|39806->28771|39836->28772|39902->28809|39932->28810|39988->28837|40018->28838|40073->28864|40159->28921|40189->28922|40246->28950|40430->29105|40460->29106|40522->29139|40637->29225|40667->29226|40725->29255|40779->29280|40809->29281|40871->29314|40993->29407|41023->29408|41081->29437|41134->29461|41164->29462|41226->29495|41346->29586|41376->29587|41434->29616|41488->29641|41518->29642|41580->29675|41692->29758|41722->29759|41780->29788|41898->29877|41928->29878|41960->29881|42078->29969|42109->29970|42529->30361|42559->30362|42613->30387|42678->30423|42708->30424|42767->30454|42886->30544|42916->30545|42978->30578|43097->30668|43127->30669|43185->30698|43243->30727|43273->30728|43335->30761|43461->30858|43491->30859|43549->30888|43606->30916|43636->30917|43698->30950|43822->31045|43852->31046|43910->31075|43968->31104|43998->31105|44060->31138|44176->31225|44206->31226|44264->31255|44382->31344|44412->31345|44444->31348|44569->31443|44600->31444|45026->31841|45056->31842|45110->31867|45177->31905|45207->31906|45265->31935|45364->32005|45394->32006|45456->32039|45625->32179|45655->32180|45713->32209|45746->32213|45776->32214|45838->32247|46002->32382|46032->32383|46091->32413|46160->32453|46190->32454|46244->32479|46309->32515|46339->32516|46397->32545|46467->32586|46497->32587|46559->32620|46593->32625|46623->32626|46655->32629|46759->32703|46790->32704|46850->32735|46880->32736|46935->32762|46965->32763|47019->32788|47080->32820|47110->32821|47168->32850|47230->32883|47260->32884|47322->32917|47356->32922|47386->32923|47418->32926|47546->33024|47577->33025|47637->33056|47667->33057|47725->33086|47758->33090|47788->33091|47850->33124|47884->33129|47914->33130|47946->33133|48059->33216|48090->33217|48150->33248|48180->33249|48234->33274|48264->33275|48318->33300|48376->33329|48406->33330|48464->33359|48498->33364|48528->33365|48560->33368|48684->33462|48715->33463|48772->33491|48802->33492|48856->33517|49707->34339|49737->34340|49796->34370|49933->34478|49963->34479|50017->34504|50091->34549|50121->34550|50195->34595|50225->34596|50277->34619|50463->34776|50493->34777|50539->34794|50569->34795|50613->34810|50643->34811|50686->34825|50821->34931|50851->34932|50899->34951|51143->35166|51173->35167|51223->35188|51290->35226|51320->35227|51394->35272|51424->35273|51474->35294|51508->35299|51538->35300|51570->35303|51855->35558|51886->35559|51928->35571|51959->35572|52005->35589|52250->35805|52280->35806|52338->35835|52440->35908|52470->35909|52607->36017|52637->36018|52695->36047|52824->36147|52854->36148|52916->36181|52986->36222|53016->36223|53070->36248|53100->36249|53455->36575|53485->36576|53539->36601|53693->36726|53723->36727|53777->36752|53807->36753|53855->36772|53885->36773|53932->36791|53966->36796|53996->36797|54047->36819|54083->36826|54113->36827|54167->36852|54240->36897|54256->36903|54311->36936|54600->37196|54630->37197|54659->37198|54914->37424|54944->37425|55006->37458|55114->37537|55144->37538|55210->37575|55255->37591|55285->37592|55355->37633|55443->37692|55473->37693|55535->37726|55565->37727|55594->37728|55768->37873|55798->37874|55864->37911|55956->37974|55986->37975|56050->38010|57194->39125|57224->39126|57290->39163|57542->39386|57572->39387|57602->39388|57636->39393|57666->39394|57732->39431|57874->39544|57904->39545|57933->39546|59686->41270|59716->41271|59765->41291|59795->41292|60294->41762|60324->41763|60354->41765|60698->42080|60728->42081|60806->42130|60836->42131|60894->42160|61023->42260|61053->42261|61103->42282|61133->42283|61181->42302|61211->42303|61253->42316|61283->42317|61326->42331|61409->42385|61439->42386|61468->42387|62411->43301|62441->43302|62491->43323|62647->43450|62677->43451|62710->43455|62740->43456|62790->43477|62887->43545|62917->43546|62963->43563|64051->44622|64081->44623|64155->44668|64185->44669|64232->44687|64309->44735|64339->44736|64389->44757|64468->44807|64498->44808|64545->44826|64610->44862|64640->44863|64690->44884|64895->45060|64925->45061|65003->45110|65033->45111|65083->45132|65150->45170|65180->45171|65234->45196|65264->45197|65306->45210|65365->45240|65395->45241|65441->45306|65487->45323|65543->45351|65592->45383|65633->45385|65680->45403|65931->45626|65947->45632|65980->45643|66011->45646|66027->45652|66062->45665|66176->45747|66222->45764|66363->45876|66393->45877|66436->45891|66483->45909|66513->45910|66559->45927|66687->46026|66717->46027|66750->46032|66828->46082|66844->46088|66893->46115|67147->46341|67162->46346|67198->46360|67293->46427|67308->46432|67342->46444|67433->46507|67448->46512|67482->46524|67581->46595|67596->46600|67639->46621|67824->46778|67840->46784|67899->46820|68156->47082|68202->47099|68308->47177|68324->47182|68359->47194|68550->47357|68565->47362|68611->47386|69076->47822|69092->47827|69128->47852|69154->47855|71162->49834|71178->49839|71213->49851|71412->50021|71428->50026|71473->50048|71670->50216|71686->50221|71730->50242|71923->50406|71939->50411|71975->50424|72427->50937|72482->50963|73218->51671|73233->51676|73267->51688|73367->51760|73382->51765|73426->51787|73525->51858|73540->51863|73583->51884|76436->54737|76487->54792|76538->54844|76590->54949|76639->54968|77608->55908|77657->55939|77699->55941|77770->55983|77834->56036|77875->56037|77951->56083|78231->56334|78247->56339|78281->56350|78312->56352|78328->56357|78366->56372|78534->56519|78549->56523|78590->56524|78665->56569|78960->56835|78976->56840|79010->56851|79041->56853|79057->56858|79095->56873|79275->57020|79347->57059|79412->57094|82641->60368|82692->60389
                  LINES: 27->2|32->2|33->3|42->12|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|59->29|60->30|62->32|62->32|63->33|65->35|65->35|67->37|67->37|67->37|68->38|70->40|70->40|72->42|72->42|72->42|73->43|75->45|75->45|79->49|82->52|82->52|83->53|85->55|85->55|86->56|87->57|87->57|88->58|90->60|90->60|92->62|93->63|93->63|94->64|96->66|96->66|98->68|98->68|98->68|99->69|101->71|101->71|102->72|102->72|102->72|103->73|112->82|112->82|113->83|113->83|113->83|114->84|116->86|116->86|117->87|118->88|118->88|119->89|121->91|121->91|123->93|126->96|126->96|127->97|131->101|131->101|133->103|133->103|133->103|134->104|142->112|142->112|143->113|143->113|143->113|144->114|153->123|153->123|155->125|155->125|155->125|156->126|159->129|159->129|160->130|160->130|160->130|161->131|163->133|163->133|168->138|175->145|175->145|177->147|178->148|178->148|179->149|181->151|181->151|183->153|184->154|184->154|185->155|185->155|185->155|186->156|187->157|187->157|188->158|189->159|189->159|189->159|194->164|194->164|195->165|199->169|199->169|201->171|206->176|206->176|207->177|210->180|210->180|210->180|210->180|211->181|212->182|212->182|216->186|230->200|230->200|231->201|234->204|234->204|234->204|234->204|235->205|237->207|237->207|238->208|261->231|261->231|262->232|264->234|264->234|265->235|265->235|266->236|268->238|268->238|269->239|269->239|271->241|271->241|273->243|273->243|273->243|274->244|284->254|284->254|285->255|286->256|286->256|286->256|286->256|287->257|288->258|288->258|289->259|306->276|306->276|308->278|308->278|309->279|315->285|315->285|318->288|322->292|322->292|323->293|325->295|325->295|326->296|327->297|327->297|328->298|328->298|328->298|329->299|330->300|330->300|330->300|334->304|334->304|336->306|339->309|339->309|340->310|343->313|343->313|344->314|346->316|346->316|348->318|366->336|366->336|367->337|370->340|370->340|370->340|370->340|371->341|373->343|373->343|374->344|378->348|378->348|379->349|379->349|379->349|380->350|395->365|395->365|395->365|395->365|400->370|400->370|400->370|400->370|401->371|416->386|416->386|416->386|416->386|421->391|421->391|424->394|424->394|424->394|424->394|425->395|440->410|440->410|440->410|440->410|445->415|445->415|448->418|448->418|449->419|453->423|453->423|454->424|454->424|455->425|457->427|457->427|458->428|458->428|460->430|460->430|463->433|463->433|463->433|465->435|469->439|469->439|470->440|470->440|470->440|471->441|473->443|473->443|473->443|488->458|488->458|489->459|489->459|491->461|491->461|491->461|492->462|493->463|493->463|494->464|496->466|496->466|496->466|511->481|511->481|512->482|512->482|514->484|514->484|514->484|515->485|516->486|516->486|517->487|519->489|519->489|519->489|534->504|534->504|535->505|535->505|535->505|535->505|535->505|536->506|536->506|536->506|537->507|539->509|539->509|539->509|554->524|554->524|555->525|555->525|557->527|557->527|557->527|558->528|559->529|559->529|559->529|564->534|564->534|565->535|567->537|567->537|568->538|569->539|569->539|570->540|575->545|575->545|576->546|576->546|577->547|577->547|577->547|578->548|581->551|581->551|582->552|582->552|583->553|583->553|586->556|587->557|587->557|588->558|592->562|592->562|593->563|594->564|594->564|595->565|595->565|595->565|596->566|597->567|597->567|598->568|598->568|598->568|599->569|600->570|600->570|601->571|601->571|601->571|602->572|603->573|603->573|604->574|606->576|606->576|606->576|606->576|606->576|613->583|613->583|614->584|614->584|614->584|616->586|618->588|618->588|619->589|620->590|620->590|621->591|621->591|621->591|622->592|623->593|623->593|624->594|624->594|624->594|625->595|626->596|626->596|627->597|627->597|627->597|628->598|629->599|629->599|630->600|632->602|632->602|632->602|632->602|632->602|638->608|638->608|639->609|639->609|639->609|640->610|641->611|641->611|642->612|643->613|643->613|644->614|644->614|644->614|645->615|646->616|646->616|648->618|649->619|649->619|650->620|650->620|650->620|651->621|651->621|651->621|652->622|652->622|652->622|652->622|652->622|652->622|653->623|653->623|655->625|655->625|656->626|656->626|656->626|657->627|657->627|657->627|658->628|658->628|658->628|658->628|658->628|658->628|659->629|659->629|660->630|660->630|660->630|661->631|661->631|661->631|661->631|661->631|661->631|662->632|662->632|663->633|663->633|664->634|665->635|665->635|666->636|666->636|666->636|666->636|666->636|666->636|668->638|668->638|669->639|680->650|680->650|682->652|684->654|684->654|685->655|688->658|688->658|689->659|689->659|690->660|693->663|693->663|694->664|694->664|695->665|695->665|697->667|699->669|699->669|701->671|706->676|706->676|707->677|708->678|708->678|710->680|710->680|711->681|711->681|711->681|711->681|711->681|711->681|711->681|711->681|713->683|715->685|715->685|716->686|719->689|719->689|721->691|721->691|722->692|724->694|724->694|725->695|726->696|726->696|727->697|727->697|733->703|733->703|734->704|735->705|735->705|736->706|736->706|737->707|737->707|739->709|739->709|739->709|741->711|741->711|741->711|742->712|743->713|743->713|743->713|748->718|748->718|749->719|752->722|752->722|753->723|754->724|754->724|755->725|755->725|755->725|756->726|757->727|757->727|758->728|758->728|759->729|761->731|761->731|762->732|763->733|763->733|766->736|780->750|780->750|781->751|784->754|784->754|784->754|784->754|784->754|785->755|787->757|787->757|788->758|808->778|808->778|808->778|808->778|814->784|814->784|816->786|821->791|821->791|822->792|822->792|823->793|825->795|825->795|826->796|826->796|827->797|827->797|828->798|828->798|830->800|830->800|830->800|831->801|847->817|847->817|848->818|849->819|849->819|849->819|849->819|850->820|851->821|851->821|852->822|871->841|871->841|876->846|876->846|878->848|880->850|880->850|881->851|882->852|882->852|884->854|884->854|884->854|885->855|887->857|887->857|889->859|889->859|890->860|891->861|891->861|892->862|892->862|893->863|893->863|893->863|894->864|895->865|896->866|896->866|896->866|898->868|901->871|901->871|901->871|901->871|901->871|901->871|904->874|905->875|908->878|908->878|910->880|910->880|910->880|911->881|913->883|913->883|914->884|915->885|915->885|915->885|918->888|918->888|918->888|919->889|919->889|919->889|920->890|920->890|920->890|921->891|921->891|921->891|926->896|926->896|926->896|934->904|935->905|935->905|935->905|935->905|938->908|938->908|938->908|945->915|945->915|945->915|945->915|983->953|983->953|983->953|984->954|984->954|984->954|985->955|985->955|985->955|986->956|986->956|986->956|990->960|992->962|1003->973|1003->973|1003->973|1004->974|1004->974|1004->974|1005->975|1005->975|1005->975|1060->1030|1061->1031|1062->1032|1063->1033|1066->1036|1087->1057|1087->1057|1087->1057|1088->1058|1088->1058|1088->1058|1090->1060|1093->1063|1093->1063|1093->1063|1093->1063|1093->1063|1093->1063|1095->1065|1095->1065|1095->1065|1096->1066|1099->1069|1099->1069|1099->1069|1099->1069|1099->1069|1099->1069|1101->1071|1103->1073|1106->1076|1183->1153|1184->1154
                  -- GENERATED --
              */
          