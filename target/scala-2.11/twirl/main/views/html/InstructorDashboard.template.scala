
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object InstructorDashboard_Scope0 {
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

class InstructorDashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*//@(implicit session: Session)*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
  <head>

    <meta charset="UTF-8" />
    <title>RISK GAME - CARNEGIE MELLON UNIVERSITY</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
    <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.51*/routes/*15.57*/.Assets.at("stylesheets/demo.css")),format.raw/*15.91*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*16.51*/routes/*16.57*/.Assets.at("stylesheets/style.css")),format.raw/*16.92*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.51*/routes/*17.57*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*17.101*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.51*/routes/*18.57*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*18.97*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.51*/routes/*19.57*/.Assets.at("stylesheets/jquery.bootgrid.css")),format.raw/*19.102*/("""" />
    <script   src="http://code.jquery.com/jquery-3.1.1.min.js"   integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="   crossorigin="anonymous"></script>
    <script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*21.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.at("javascripts/loading.js")),format.raw/*22.61*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.at("javascripts/jquery.bootgrid.fa.js.js")),format.raw/*23.75*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.at("javascripts/jquery.bootgrid.js")),format.raw/*24.69*/("""" type="text/javascript"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <script>

      $(document).ready(function()"""),format.raw/*31.35*/("""{"""),format.raw/*31.36*/("""
        """),format.raw/*32.9*/("""// $("#grid-basic").bootgrid();
        showActiveGames();

      """),format.raw/*35.7*/("""}"""),format.raw/*35.8*/(""");

      function showActiveGames() """),format.raw/*37.34*/("""{"""),format.raw/*37.35*/("""
        """),format.raw/*38.9*/("""//debugger;
        var obj = """),format.raw/*39.19*/("""{"""),format.raw/*39.20*/("""
          """),format.raw/*40.11*/("""'phaseId': "tst"
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""";
        $.ajax("""),format.raw/*42.16*/("""{"""),format.raw/*42.17*/("""
          """),format.raw/*43.11*/("""type : 'POST',
          url : '"""),_display_(/*44.19*/routes/*44.25*/.DashboardController.completedGames()),format.raw/*44.62*/("""',
          //data : JSON.stringify("test"),
          //data: "",
          dataType: 'json',
          //contentType : 'application/json',
          success : function(data) """),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""
            """),format.raw/*50.13*/("""//alert(data.length);x`
            for (i = 0; i < data.length; i++) """),format.raw/*51.47*/("""{"""),format.raw/*51.48*/("""
              """),format.raw/*52.15*/("""//data[i].timebound
              var obj = data[i];
              //obj.istimebound = "Yes";
              obj.istimebound = obj.istimebound == "1" ? "Yes" : "No";
              // $('#myTable').append('<tr><td>my data</td><td>more data</td></tr>');
              var appendquery = "<tr><td class='gameid-class'>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>View</a></td> <td><a href='#'>Join</a></td></tr>";
              //$('#grid-basic tr:last').after(appendquery);
              //$('#grid-basic').find(tbody).append(appendquery);
              $("#grid-basic tbody").append(appendquery);
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""

            """),format.raw/*63.13*/("""$("#grid-basic").bootgrid("""),format.raw/*63.39*/("""{"""),format.raw/*63.40*/("""
                      """),format.raw/*64.23*/("""formatters: """),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""
                          """),format.raw/*65.27*/(""""link1": function(column, row)
                          """),format.raw/*66.27*/("""{"""),format.raw/*66.28*/("""
                              """),format.raw/*67.31*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";
                              return "<a href=\"#\" onclick='Showmodel(\"" + row.gameid + "\",\"" + row.status + "\",\"" + row.istimebound + "\")'>" + "Join" + "</a>";
                          """),format.raw/*69.27*/("""}"""),format.raw/*69.28*/(""",
                          "link": function(column, row)
                            """),format.raw/*71.29*/("""{"""),format.raw/*71.30*/("""
                            """),format.raw/*72.29*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";
                            return "<a href=\"#\" onclick='redirectFromHere(\"" + row.gameid + "\")'>" + "View" + "</a>";
                             """),format.raw/*74.30*/("""}"""),format.raw/*74.31*/("""
                      """),format.raw/*75.23*/("""}"""),format.raw/*75.24*/(""",
                      rowCount: [5,10,-1],
                      columnSelection: false
                  """),format.raw/*78.19*/("""}"""),format.raw/*78.20*/(""");



          """),format.raw/*82.11*/("""}"""),format.raw/*82.12*/(""",
          error : function(data) """),format.raw/*83.34*/("""{"""),format.raw/*83.35*/("""
            """),format.raw/*84.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*86.11*/("""}"""),format.raw/*86.12*/("""
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/(""");

        """),format.raw/*89.88*/("""
        """),format.raw/*90.37*/("""
        """),format.raw/*91.16*/("""
      """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""

      """),format.raw/*94.7*/("""function redirectFromHere(gameid) """),format.raw/*94.41*/("""{"""),format.raw/*94.42*/("""
        """),format.raw/*95.9*/("""$('#gameid').val(gameid);

        $('#frmInstructor').submit();
      """),format.raw/*98.7*/("""}"""),format.raw/*98.8*/("""

      """),format.raw/*100.7*/("""function Showmodel(gameid,status,istimebound)
      """),format.raw/*101.7*/("""{"""),format.raw/*101.8*/("""
        """),format.raw/*102.9*/("""// alert(gameid + status + istimebound);
        // gameid
        $( "#mgameid" ).val(gameid);
        $("#mgameid").prop("readonly", true);

        $("#errorspan2").html("");
        $('#wybierz1').hide();
        if(status == "RUNNING") """),format.raw/*109.33*/("""{"""),format.raw/*109.34*/("""
          """),format.raw/*110.11*/("""$("#isobserver").val('1');
          $("#isobserver").hide();
          $("#labelforobserver").hide();

          // $("#labelforobserver").text("You can only join this game as observer");
          $("#myModalLabel2").text("You can only join this game as observer");
          //  myModalLabel2
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""
        """),format.raw/*118.9*/("""else """),format.raw/*118.14*/("""{"""),format.raw/*118.15*/("""
          """),format.raw/*119.11*/("""$("#isobserver").show();
          $("#isobserver").val('0');
          $("#labelforobserver").show();
          $("#labelforobserver").text("Do you want to join as observer:");
          $("#myModalLabel2").text("JOIN GAME AS PLAYER OR OBSERVER");
        """),format.raw/*124.9*/("""}"""),format.raw/*124.10*/("""
        """),format.raw/*125.9*/("""$('#myModal2').modal('show');
      """),format.raw/*126.7*/("""}"""),format.raw/*126.8*/("""

      """),format.raw/*128.7*/("""function hostgame() """),format.raw/*128.27*/("""{"""),format.raw/*128.28*/("""
        """),format.raw/*129.9*/("""// debugger;
        //  var istimebound = $('input[name=TimeBound]:checked').val();
        var timeforstep = $( "#selecttime" ).val();
        var noofsteps = $( "#selectsteps" ).val();

        var obj = """),format.raw/*134.19*/("""{"""),format.raw/*134.20*/("""
          """),format.raw/*135.11*/("""'istimebound': true,
          // 'istimebound': istimebound == "1" ? true : false,
          'timeforeachmove': timeforstep,
          'stepsforeachplayer': noofsteps
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/(""";
        $.ajax("""),format.raw/*140.16*/("""{"""),format.raw/*140.17*/("""
          """),format.raw/*141.11*/("""type : 'POST',
          url : '"""),_display_(/*142.19*/routes/*142.25*/.GameController.hostGame()),format.raw/*142.51*/("""',
          // data : JSON.stringify(obj),
          data: JSON.stringify(obj),
          dataType: 'json',
          contentType : 'application/json',
          success : function(data) """),format.raw/*147.36*/("""{"""),format.raw/*147.37*/("""
            """),format.raw/*148.13*/("""debugger;
            if(data.message == "success")
            """),format.raw/*150.13*/("""{"""),format.raw/*150.14*/("""
              """),format.raw/*151.15*/("""//  var $form=$(document.createElement('form')).css("""),format.raw/*151.67*/("""{"""),format.raw/*151.68*/("""display:'none'"""),format.raw/*151.82*/("""}"""),format.raw/*151.83*/(""").attr("method","POST").attr("action","/hostgame");
              // var $input=$(document.createElement('input')).attr('name','FIRST NAME HERE').val("FIRST VALUE HERE");
              // var $input2=$(document.createElemet('input')).attr('name','SECOND NAME HERE').val("SECOND VALUE HERE");
              //  $form.append($input).append($input2);
              // $("body").append($form);
              //  $form.submit();
              $("#hgameid").val(data.gameid);
              $("#hostgameform").submit();
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/("""
            """),format.raw/*160.13*/("""else
            """),format.raw/*161.13*/("""{"""),format.raw/*161.14*/("""
              """),format.raw/*162.15*/("""//  alert(data.errormsg);
              $("#errorspan").html(data.errormsg);
            """),format.raw/*164.13*/("""}"""),format.raw/*164.14*/("""
            """),format.raw/*165.13*/("""// $.('#id').val(data);
            //setError('Call succedded');
            //$('#test1').attr("src", data)
          """),format.raw/*168.11*/("""}"""),format.raw/*168.12*/(""",
          error : function(data) """),format.raw/*169.34*/("""{"""),format.raw/*169.35*/("""
            """),format.raw/*170.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*172.11*/("""}"""),format.raw/*172.12*/("""
        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/(""");

        """),format.raw/*175.88*/("""
        """),format.raw/*176.37*/("""
        """),format.raw/*177.16*/("""
      """),format.raw/*178.7*/("""}"""),format.raw/*178.8*/("""

      """),format.raw/*180.7*/("""var observer;

    function joingame() """),format.raw/*182.25*/("""{"""),format.raw/*182.26*/("""
        """),format.raw/*183.9*/("""// debugger;var gameid = $('input[name=TimeBound]:checked').val();
        //debugger;
        var gameid = $( "#mgameid" ).val();
        var isobserver = $("#isobserver").val();

        var obj = """),format.raw/*188.19*/("""{"""),format.raw/*188.20*/("""
            """),format.raw/*189.13*/("""'gameid': gameid,
            'isobserver': isobserver == "1" ? true : false
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/(""";

        $.ajax("""),format.raw/*193.16*/("""{"""),format.raw/*193.17*/("""
            """),format.raw/*194.13*/("""type : 'POST',
            url : '"""),_display_(/*195.21*/routes/*195.27*/.GameController.joinGame()),format.raw/*195.53*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            // dataType: 'json',
            contentType : 'application/json',
            success : function(data) """),format.raw/*200.38*/("""{"""),format.raw/*200.39*/("""
                """),format.raw/*201.17*/("""if(data.message == "success")
                """),format.raw/*202.17*/("""{"""),format.raw/*202.18*/("""
                    """),format.raw/*203.21*/("""$("#jgameid").val(gameid);
                    $('#hdn_observer').val(isobserver);
                    $("#joingameform").submit();

                """),format.raw/*207.17*/("""}"""),format.raw/*207.18*/("""
                """),format.raw/*208.17*/("""else
                """),format.raw/*209.17*/("""{"""),format.raw/*209.18*/("""
                    """),format.raw/*210.21*/("""// alert(data.errormsg);
                    $("#errorspan2").html(data.errormsg);
                """),format.raw/*212.17*/("""}"""),format.raw/*212.18*/("""

            """),format.raw/*214.13*/("""}"""),format.raw/*214.14*/(""",
            error : function(data) """),format.raw/*215.36*/("""{"""),format.raw/*215.37*/("""
                """),format.raw/*216.17*/("""alert("error");
                //setError('Make call failed');
            """),format.raw/*218.13*/("""}"""),format.raw/*218.14*/("""
        """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/(""");

        """),format.raw/*221.88*/("""
        """),format.raw/*222.37*/("""
        """),format.raw/*223.16*/("""
    """),format.raw/*224.5*/("""}"""),format.raw/*224.6*/("""

       
       """),format.raw/*227.8*/("""function validateForm()
       """),format.raw/*228.8*/("""{"""),format.raw/*228.9*/("""
        """),format.raw/*229.9*/("""var a=document.forms["GameReportForm"]["exportReportInput"].value;
        if (a==null || a=="")
        """),format.raw/*231.9*/("""{"""),format.raw/*231.10*/("""
             """),format.raw/*232.14*/("""alert("Please enter a valid gameID");
             return false;
            
        """),format.raw/*235.9*/("""}"""),format.raw/*235.10*/("""

    """),format.raw/*237.5*/("""}"""),format.raw/*237.6*/("""



    """),format.raw/*241.5*/("""//Test done by Arul For Killing All the games... and User data except the default admin.. 
    function deleteAllGames()
    """),format.raw/*243.5*/("""{"""),format.raw/*243.6*/("""
        """),format.raw/*244.9*/("""var obj = """),format.raw/*244.19*/("""{"""),format.raw/*244.20*/("""

            """),format.raw/*246.13*/(""""username": "username",  //Passing some dummy value for POST so that DATA WILL BE RECEIVED
            "password": "password"
        """),format.raw/*248.9*/("""}"""),format.raw/*248.10*/(""";
        $.ajax("""),format.raw/*249.16*/("""{"""),format.raw/*249.17*/("""
            """),format.raw/*250.13*/("""type: 'POST',
            url: '"""),_display_(/*251.20*/routes/*251.26*/.DBController.DeleteAllGameData()),format.raw/*251.59*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            contentType: 'application/json',
            success: function (data) """),format.raw/*257.38*/("""{"""),format.raw/*257.39*/("""
                """),format.raw/*258.17*/("""if(data=="success") """),format.raw/*258.37*/("""{"""),format.raw/*258.38*/("""
                    """),format.raw/*259.21*/("""swal("All the games data and user data except the default admin details have been sucessfully deleted..");
                """),format.raw/*260.17*/("""}"""),format.raw/*260.18*/("""
                """),format.raw/*261.17*/("""else
                """),format.raw/*262.17*/("""{"""),format.raw/*262.18*/("""
                    """),format.raw/*263.21*/("""swal("OOPS!",data, "error");
                """),format.raw/*264.17*/("""}"""),format.raw/*264.18*/("""
            """),format.raw/*265.13*/("""}"""),format.raw/*265.14*/(""",
            error: function (data) """),format.raw/*266.36*/("""{"""),format.raw/*266.37*/("""
                """),format.raw/*267.17*/("""swal("error");
            """),format.raw/*268.13*/("""}"""),format.raw/*268.14*/("""
        """),format.raw/*269.9*/("""}"""),format.raw/*269.10*/(""");
    """),format.raw/*270.5*/("""}"""),format.raw/*270.6*/("""
        """),format.raw/*271.9*/("""$(document).ready(function() """),format.raw/*271.38*/("""{"""),format.raw/*271.39*/("""
        """),format.raw/*272.9*/("""$('#deletesubmit').click(function()"""),format.raw/*272.44*/("""{"""),format.raw/*272.45*/("""
            """),format.raw/*273.13*/("""if($("#datadeleteform")[0].checkValidity()) """),format.raw/*273.57*/("""{"""),format.raw/*273.58*/("""
              """),format.raw/*274.15*/("""if(confirm(" This would delete all the game data and user data except the default admin \n"+
                         "Are you sure about deleting the data ? "))
              """),format.raw/*276.15*/("""{"""),format.raw/*276.16*/("""
                """),format.raw/*277.17*/("""deleteAllGames(); 
              """),format.raw/*278.15*/("""}"""),format.raw/*278.16*/("""
              """),format.raw/*279.15*/("""return false;   
            """),format.raw/*280.13*/("""}"""),format.raw/*280.14*/("""
           """),format.raw/*281.12*/("""}"""),format.raw/*281.13*/(""");
       """),format.raw/*282.8*/("""}"""),format.raw/*282.9*/(""");
  </script>

  <style>
down vote
If you do not want to change your HTML structure you can also do by adding text-align: center; to the wrapper element and a display: inline-block; to the centered element.

#container """),format.raw/*289.12*/("""{"""),format.raw/*289.13*/("""
    """),format.raw/*290.5*/("""width:100%;
    text-align:center;
"""),format.raw/*292.1*/("""}"""),format.raw/*292.2*/("""

"""),format.raw/*294.1*/("""#left """),format.raw/*294.7*/("""{"""),format.raw/*294.8*/("""
    """),format.raw/*295.5*/("""float:left;
    width:30%;
"""),format.raw/*297.1*/("""}"""),format.raw/*297.2*/("""

"""),format.raw/*299.1*/("""#center """),format.raw/*299.9*/("""{"""),format.raw/*299.10*/("""
    """),format.raw/*300.5*/("""display: inline-block;
    margin:0 auto;
    width:30%;
"""),format.raw/*303.1*/("""}"""),format.raw/*303.2*/("""

"""),format.raw/*305.1*/("""#right """),format.raw/*305.8*/("""{"""),format.raw/*305.9*/("""
    """),format.raw/*306.5*/("""float:right;
    width:40%;
"""),format.raw/*308.1*/("""}"""),format.raw/*308.2*/("""
"""),format.raw/*309.1*/("""</style>

  </head>
  <body>
    """),_display_(/*313.6*/header()),format.raw/*313.14*/("""<br>
  <div class="row">
    <div class="col-md-12">
      <h3>
               Welcome """),_display_(/*317.25*/Http/*317.29*/.Context.current().args.get("firstname").asInstanceOf[String]),format.raw/*317.90*/("""
              """),format.raw/*318.15*/("""</h3>


<div id="container">
  <div id="left">
          <form name="GameReportForm" method="GET" onsubmit="return validateForm()" action="/exportReports">
            <label>Game Statistics Report </label> <br>
            <input type="text" id="exportReportInput" name="exportReportInput" placeholder="Enter gameID">
            <input type="submit" name="Export" class="btn btn-primary btn-default" value="Export" style="height: 30px; width: 100px;">
          </form>
  </div>
  <div id="right">
    <label>Click the button below to launch a new game </label> <br>
<button type="button" onclick="$('#errorspan').html('');"  class="btn btn-primary btn-default" data-toggle="modal" data-target="#myModal">
  Launch a new game
              </button>

  </div>
  <div id="center">

                      <form  id="datadeleteform" method ="POST"  action=""""),_display_(/*338.75*/routes/*338.81*/.DBController.DeleteAllGameData()),format.raw/*338.114*/("""">
                      <label>Click this button to delete all the game's Data </label> 
                         <input type="submit" id="deletesubmit" class="btn btn-primary btn-default" value="Delete Game Data" />
                      </form>

  </div>
</div>








  
     <form style="display: hidden" action="/hostgame" method="POST" id="hostgameform">
                  <input type="hidden" id = "hgameid" name ="hgameid" value="0"  />
                  </form>
              <form style="display: hidden" action="/joingame" method="POST" id="joingameform">
                  <input type="hidden" id = "jgameid" name ="jgameid" value="0"  />
                  <input type="hidden" id = "hdn_observer" name ="hdn_observer" value="0" />
              </form>

      <form id="frmInstructor" method="POST" action="/observegame" hidden>
        <input type="hidden" value="" id="username" />
        <input class="hidden_game_id" type="hidden" value="" id="gameid" name="gameid">
      </form>

        <!-- Button trigger modal -->
      """),format.raw/*368.143*/("""
  """),format.raw/*369.16*/("""
      """),format.raw/*370.20*/("""

      """),format.raw/*372.108*/("""
      """),format.raw/*373.20*/("""
      """),format.raw/*374.20*/("""

                  """),format.raw/*376.19*/("""<!-- Host Game Modal -->


              <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                  <div class="modal-dialog" role="document">
                      <div class="modal-content">
                          <div class="modal-header">
                              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                              <h4 class="modal-title" id="myModalLabel">LAUNCH GAME</h4>
                          </div>
                          <div class="modal-body">
                                    <span style="color:red;" id="errorspan" ></span>
                                  <form class="form-horizontal">
                                      <fieldset>

                                              <!-- Form Name -->
                                          <legend>Game Settings</legend>

                                              <!-- Multiple Radios -->
                                          """),format.raw/*395.71*/("""
                                              """),format.raw/*396.134*/("""
                                              """),format.raw/*397.73*/("""
                                                  """),format.raw/*398.74*/("""
                                                      """),format.raw/*399.84*/("""
                                                          """),format.raw/*400.145*/("""
                                                          """),format.raw/*401.66*/("""
                                                      """),format.raw/*402.67*/("""
                                                  """),format.raw/*403.61*/("""
                                                  """),format.raw/*404.74*/("""
                                                      """),format.raw/*405.84*/("""
                                                          """),format.raw/*406.127*/("""
                                                          """),format.raw/*407.65*/("""
                                                      """),format.raw/*408.67*/("""
                                                  """),format.raw/*409.61*/("""
                                              """),format.raw/*410.57*/("""
                                          """),format.raw/*411.53*/("""

                                              """),format.raw/*413.47*/("""<!-- Select Basic -->
                                          <div class="form-group">
                                              <label class="col-md-5 control-label" for="selecttime">Time for each step(in mins):</label>
                                              <div class="col-md-4">
                                                  <select id="selecttime" name="selecttime" class="form-control">
                                                      <option value="1">1</option>
                                                      <option selected value="2">2</option>
                                                      <option value="3">3</option>
                                                      <option value="4">4</option>
                                                      <option value="5">5</option>
                                                      <option value="10">10</option>
                                                  </select>
                                              </div>
                                          </div>

                                              <!-- Select Basic -->
                                          <div class="form-group">
                                              <label class="col-md-5 control-label" for="selectsteps">No. of turns:</label>
                                              <div class="col-md-4">
                                                  <select id="selectsteps" name="selectsteps" class="form-control">
                                                      <option value="5">5</option>
                                                      <option value="10">10</option>
                                                      <option value="15">15</option>
                                                      <option selected value="20">20</option>
                                                      <option value="25">25</option>
                                                      <option value="30">30</option>
                                                      <option value="100">100</option>
                                                  </select>
                                              </div>
                                          </div>

                                      </fieldset>
                                  </form>
                          </div>
                          <div class="modal-footer">
                              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                              <button type="button" class="btn btn-primary" onclick = "hostgame()" >Launch</button>
                          </div>
                      </div>
                  </div>
              </div>

                  <!-- join Game Modal -->
              <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                  <div class="modal-dialog" role="document">
                      <div class="modal-content">
                          <div class="modal-header">
                              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                              <h4 class="modal-title" id="myModalLabel2">JOIN GAME AS PLAYER OR OBSERVER</h4>
                          </div>
                          <div class="modal-body">
                              <span style="color:red;" id="errorspan2" ></span>
        <div class="form-group">

                              <label for="mgameid">
            Game ID:
                              </label>
                              <input type="text" class="form-control" id="mgameid" />
                          </div>
                              <div class="form-group">
                                  <label class="col-md-6 control-label" id="labelforobserver" for="selecttime">Do you want to join as an observer:</label>


                                      <span title="You will be only able to see the steps performed by the users in the game but you cannot participate" class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>

                                      <select id="isobserver" name="isobserver" class="form-control">
                                          <option value="1">Yes</option>
                                          <option value="0">No</option>
                                      </select>
                                  <div class="glyphicon glyphicon-info-sign" style="color: red;
                                  ">Join the same Game ID as your friends' to compete against each other!</div>
                              </div>
                          </div>
                          <div class="modal-footer">
                              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                              <button type="button" onclick = "joingame()" class="btn btn-primary">Join Game</button>
                          </div>
                      </div>
                  </div>
              </div>

    </div>
  </div>
  <br><br>
  <div class="row">
    <div class="col-md-12">
      <h4>LIST OF ACTIVE GAMES:</h4>
      <table id="grid-basic" class="table table-condensed table-hover table-striped">
        <thead>
          <tr>
            <th data-column-id="gameid">ID</th>
            <th data-column-id="status">Status</th>
            <th data-column-id="gametime" data-order="desc">GameTime</th>
            <th data-column-id="fullName" data-order="desc">Host Name</th>
            <th data-column-id="joingamegrid" data-formatter="link" data-order="desc">View Game Snapshot</th>
            <th data-column-id="joingamegrid" data-formatter="link1" data-order="desc">Join Game</th>


          </tr>
        </thead>
        <tbody>



          </tbody>
      </table>
    </div>
  </div>
    """),_display_(/*521.6*/footer()),format.raw/*521.14*/("""
  """),format.raw/*522.3*/("""</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/*//@(implicit session: Session)*/
object InstructorDashboard extends InstructorDashboard_Scope0.InstructorDashboard
              /*
                  -- GENERATED --
                  DATE: Mon Nov 20 23:04:49 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/InstructorDashboard.scala.html
                  HASH: 447dbbb8a732d7d3bd5b8bf3de07dfde486f36a8
                  MATRIX: 885->37|1444->569|1459->575|1514->609|1596->664|1611->670|1667->705|1749->760|1764->766|1830->810|1912->865|1927->871|1988->911|2070->966|2085->972|2152->1017|2367->1205|2382->1211|2446->1254|2526->1307|2541->1313|2598->1349|2678->1402|2693->1408|2764->1458|2844->1511|2859->1517|2924->1561|3236->1845|3265->1846|3301->1855|3394->1921|3422->1922|3487->1959|3516->1960|3552->1969|3610->1999|3639->2000|3678->2011|3730->2036|3759->2037|3804->2054|3833->2055|3872->2066|3932->2099|3947->2105|4005->2142|4210->2319|4239->2320|4280->2333|4378->2403|4407->2404|4450->2419|5167->3108|5196->3109|5238->3123|5292->3149|5321->3150|5372->3173|5412->3185|5441->3186|5496->3213|5581->3270|5610->3271|5669->3302|5995->3600|6024->3601|6138->3687|6167->3688|6224->3717|6507->3972|6536->3973|6587->3996|6616->3997|6752->4105|6781->4106|6825->4122|6854->4123|6917->4158|6946->4159|6987->4172|7085->4242|7114->4243|7150->4252|7179->4253|7219->4344|7256->4381|7293->4397|7327->4404|7355->4405|7390->4413|7452->4447|7481->4448|7517->4457|7615->4528|7643->4529|7679->4537|7759->4589|7788->4590|7825->4599|8095->4840|8125->4841|8165->4852|8497->5156|8527->5157|8564->5166|8598->5171|8628->5172|8668->5183|8953->5440|8983->5441|9020->5450|9084->5486|9113->5487|9149->5495|9198->5515|9228->5516|9265->5525|9501->5732|9531->5733|9571->5744|9775->5920|9805->5921|9851->5938|9881->5939|9921->5950|9982->5983|9998->5989|10046->6015|10263->6203|10293->6204|10335->6217|10428->6281|10458->6282|10502->6297|10583->6349|10613->6350|10656->6364|10686->6365|11240->6890|11270->6891|11312->6904|11358->6921|11388->6922|11432->6937|11550->7026|11580->7027|11622->7040|11771->7160|11801->7161|11865->7196|11895->7197|11937->7210|12036->7280|12066->7281|12103->7290|12133->7291|12174->7382|12212->7419|12250->7435|12285->7442|12314->7443|12350->7451|12418->7490|12448->7491|12485->7500|12713->7699|12743->7700|12785->7713|12898->7798|12928->7799|12975->7817|13005->7818|13047->7831|13110->7866|13126->7872|13174->7898|13404->8099|13434->8100|13480->8117|13555->8163|13585->8164|13635->8185|13813->8334|13843->8335|13889->8352|13939->8373|13969->8374|14019->8395|14147->8494|14177->8495|14220->8509|14250->8510|14316->8547|14346->8548|14392->8565|14497->8641|14527->8642|14564->8651|14594->8652|14635->8743|14673->8780|14711->8796|14744->8801|14773->8802|14818->8819|14877->8850|14906->8851|14943->8860|15076->8965|15106->8966|15149->8980|15263->9066|15293->9067|15327->9073|15356->9074|15392->9082|15545->9207|15574->9208|15611->9217|15650->9227|15680->9228|15723->9242|15885->9376|15915->9377|15961->9394|15991->9395|16033->9408|16094->9441|16110->9447|16165->9480|16413->9699|16443->9700|16489->9717|16538->9737|16568->9738|16618->9759|16770->9882|16800->9883|16846->9900|16896->9921|16926->9922|16976->9943|17050->9988|17080->9989|17122->10002|17152->10003|17218->10040|17248->10041|17294->10058|17350->10085|17380->10086|17417->10095|17447->10096|17482->10103|17511->10104|17548->10113|17606->10142|17636->10143|17673->10152|17737->10187|17767->10188|17809->10201|17882->10245|17912->10246|17956->10261|18161->10437|18191->10438|18237->10455|18299->10488|18329->10489|18373->10504|18431->10533|18461->10534|18502->10546|18532->10547|18570->10557|18599->10558|18848->10778|18878->10779|18911->10784|18974->10819|19003->10820|19033->10822|19067->10828|19096->10829|19129->10834|19184->10861|19213->10862|19243->10864|19279->10872|19309->10873|19342->10878|19427->10935|19456->10936|19486->10938|19521->10945|19550->10946|19583->10951|19639->10979|19668->10980|19697->10981|19758->11015|19788->11023|19904->11111|19918->11115|20001->11176|20045->11191|20930->12048|20946->12054|21002->12087|22078->13269|22110->13285|22146->13305|22184->13414|22220->13434|22256->13454|22305->13474|23416->14584|23493->14718|23569->14791|23649->14865|23733->14949|23822->15094|23910->15160|23994->15227|24074->15288|24154->15362|24238->15446|24327->15573|24415->15638|24499->15705|24579->15766|24655->15823|24727->15876|24804->15924|30855->21948|30885->21956|30916->21959
                  LINES: 32->4|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|59->31|59->31|60->32|63->35|63->35|65->37|65->37|66->38|67->39|67->39|68->40|69->41|69->41|70->42|70->42|71->43|72->44|72->44|72->44|77->49|77->49|78->50|79->51|79->51|80->52|89->61|89->61|91->63|91->63|91->63|92->64|92->64|92->64|93->65|94->66|94->66|95->67|97->69|97->69|99->71|99->71|100->72|102->74|102->74|103->75|103->75|106->78|106->78|110->82|110->82|111->83|111->83|112->84|114->86|114->86|115->87|115->87|117->89|118->90|119->91|120->92|120->92|122->94|122->94|122->94|123->95|126->98|126->98|128->100|129->101|129->101|130->102|137->109|137->109|138->110|145->117|145->117|146->118|146->118|146->118|147->119|152->124|152->124|153->125|154->126|154->126|156->128|156->128|156->128|157->129|162->134|162->134|163->135|167->139|167->139|168->140|168->140|169->141|170->142|170->142|170->142|175->147|175->147|176->148|178->150|178->150|179->151|179->151|179->151|179->151|179->151|187->159|187->159|188->160|189->161|189->161|190->162|192->164|192->164|193->165|196->168|196->168|197->169|197->169|198->170|200->172|200->172|201->173|201->173|203->175|204->176|205->177|206->178|206->178|208->180|210->182|210->182|211->183|216->188|216->188|217->189|219->191|219->191|221->193|221->193|222->194|223->195|223->195|223->195|228->200|228->200|229->201|230->202|230->202|231->203|235->207|235->207|236->208|237->209|237->209|238->210|240->212|240->212|242->214|242->214|243->215|243->215|244->216|246->218|246->218|247->219|247->219|249->221|250->222|251->223|252->224|252->224|255->227|256->228|256->228|257->229|259->231|259->231|260->232|263->235|263->235|265->237|265->237|269->241|271->243|271->243|272->244|272->244|272->244|274->246|276->248|276->248|277->249|277->249|278->250|279->251|279->251|279->251|285->257|285->257|286->258|286->258|286->258|287->259|288->260|288->260|289->261|290->262|290->262|291->263|292->264|292->264|293->265|293->265|294->266|294->266|295->267|296->268|296->268|297->269|297->269|298->270|298->270|299->271|299->271|299->271|300->272|300->272|300->272|301->273|301->273|301->273|302->274|304->276|304->276|305->277|306->278|306->278|307->279|308->280|308->280|309->281|309->281|310->282|310->282|317->289|317->289|318->290|320->292|320->292|322->294|322->294|322->294|323->295|325->297|325->297|327->299|327->299|327->299|328->300|331->303|331->303|333->305|333->305|333->305|334->306|336->308|336->308|337->309|341->313|341->313|345->317|345->317|345->317|346->318|366->338|366->338|366->338|396->368|397->369|398->370|400->372|401->373|402->374|404->376|423->395|424->396|425->397|426->398|427->399|428->400|429->401|430->402|431->403|432->404|433->405|434->406|435->407|436->408|437->409|438->410|439->411|441->413|549->521|549->521|550->522
                  -- GENERATED --
              */
          