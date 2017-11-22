
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

              if(obj.status== (new String("Waiting for players to join").valueOf()))
              """),format.raw/*59.15*/("""{"""),format.raw/*59.16*/("""
                """),format.raw/*60.17*/("""var appendquery = "<tr><td class='gameid-class'>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>View</a></td> <td><a href='#'>Join</a></td> </tr>";
              """),format.raw/*61.15*/("""}"""),format.raw/*61.16*/("""else
              """),format.raw/*62.15*/("""{"""),format.raw/*62.16*/("""
                """),format.raw/*63.17*/("""var appendquery = "<tr><td class='gameid-class'>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>View</a></td> <td><a href='#'>NO ONE CAN JOIN NOW</a></td></tr>";
              """),format.raw/*64.15*/("""}"""),format.raw/*64.16*/("""

              
              """),format.raw/*67.15*/("""//$('#grid-basic tr:last').after(appendquery);
              //$('#grid-basic').find(tbody).append(appendquery);
              $("#grid-basic tbody").append(appendquery);
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/("""
            """),format.raw/*71.13*/("""$("#grid-basic").bootgrid("""),format.raw/*71.39*/("""{"""),format.raw/*71.40*/("""
                      """),format.raw/*72.23*/("""formatters: """),format.raw/*72.35*/("""{"""),format.raw/*72.36*/("""
                          """),format.raw/*73.27*/(""""link1": function(column, row)
                          """),format.raw/*74.27*/("""{"""),format.raw/*74.28*/("""
                            """),format.raw/*75.29*/("""console.log(row.status);

                            if(row.status == (new String("Waiting for players to join").valueOf()))
                            """),format.raw/*78.29*/("""{"""),format.raw/*78.30*/("""
                              """),format.raw/*79.31*/("""return "<a href=\"#\" onclick='Showmodel(\"" + row.gameid + "\",\"" + row.status + "\",\"" + row.istimebound + "\")'>" + "Join" + "</a>";
                            """),format.raw/*80.29*/("""}"""),format.raw/*80.30*/("""else
                            """),format.raw/*81.29*/("""{"""),format.raw/*81.30*/("""
                              """),format.raw/*82.31*/("""return "<p>You can only view this game</p>";
                              //return "<a href=\"#\">" + "NO ONE CAN JOIN NOW" + "</a>";
                            """),format.raw/*84.29*/("""}"""),format.raw/*84.30*/("""

                              
                              """),format.raw/*87.31*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";
                              
                          """),format.raw/*89.27*/("""}"""),format.raw/*89.28*/(""",
                          "link": function(column, row)
                            """),format.raw/*91.29*/("""{"""),format.raw/*91.30*/("""
                               """),format.raw/*92.32*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";

                               return "<a href=\"#\" onclick='redirectFromHere(\"" + row.gameid + "\")'>" + "View" + "</a>";
                             """),format.raw/*95.30*/("""}"""),format.raw/*95.31*/("""
                      """),format.raw/*96.23*/("""}"""),format.raw/*96.24*/(""",
                      rowCount: [5,10,-1],
                      columnSelection: false
                  """),format.raw/*99.19*/("""}"""),format.raw/*99.20*/(""");
          """),format.raw/*100.11*/("""}"""),format.raw/*100.12*/(""",
          error : function(data) """),format.raw/*101.34*/("""{"""),format.raw/*101.35*/("""
            """),format.raw/*102.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*104.11*/("""}"""),format.raw/*104.12*/("""
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/(""");

        """),format.raw/*107.88*/("""
        """),format.raw/*108.37*/("""
        """),format.raw/*109.16*/("""
      """),format.raw/*110.7*/("""}"""),format.raw/*110.8*/("""

      """),format.raw/*112.7*/("""function redirectFromHere(gameid) """),format.raw/*112.41*/("""{"""),format.raw/*112.42*/("""
        """),format.raw/*113.9*/("""$('#gameid').val(gameid);

        $('#frmInstructor').submit();
      """),format.raw/*116.7*/("""}"""),format.raw/*116.8*/("""

      """),format.raw/*118.7*/("""function Showmodel(gameid,status,istimebound)
      """),format.raw/*119.7*/("""{"""),format.raw/*119.8*/("""
        """),format.raw/*120.9*/("""// alert(gameid + status + istimebound);
        // gameid
        $( "#mgameid" ).val(gameid);
        $("#mgameid").prop("readonly", true);

        $("#errorspan2").html("");
        $('#wybierz1').hide();
        if(status == "RUNNING") """),format.raw/*127.33*/("""{"""),format.raw/*127.34*/("""
          """),format.raw/*128.11*/("""$("#isobserver").val('1');
          $("#isobserver").hide();
          $("#labelforobserver").hide();

          // $("#labelforobserver").text("You can only join this game as observer");
          $("#myModalLabel2").text("You can only join this game as observer");
          //  myModalLabel2
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/("""
        """),format.raw/*136.9*/("""else """),format.raw/*136.14*/("""{"""),format.raw/*136.15*/("""
          """),format.raw/*137.11*/("""$("#isobserver").show();
          $("#isobserver").val('0');
          $("#labelforobserver").show();
          $("#labelforobserver").text("Do you want to join as observer:");
          $("#myModalLabel2").text("JOIN GAME AS PLAYER OR OBSERVER");
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/("""
        """),format.raw/*143.9*/("""$('#myModal2').modal('show');
      """),format.raw/*144.7*/("""}"""),format.raw/*144.8*/("""

      """),format.raw/*146.7*/("""function hostgame() """),format.raw/*146.27*/("""{"""),format.raw/*146.28*/("""
        """),format.raw/*147.9*/("""// debugger;
        //  var istimebound = $('input[name=TimeBound]:checked').val();
        var timeforstep = $( "#selecttime" ).val();
        var noofsteps = $( "#selectsteps" ).val();

        var obj = """),format.raw/*152.19*/("""{"""),format.raw/*152.20*/("""
          """),format.raw/*153.11*/("""'istimebound': true,
          // 'istimebound': istimebound == "1" ? true : false,
          'timeforeachmove': timeforstep,
          'stepsforeachplayer': noofsteps
        """),format.raw/*157.9*/("""}"""),format.raw/*157.10*/(""";
        $.ajax("""),format.raw/*158.16*/("""{"""),format.raw/*158.17*/("""
          """),format.raw/*159.11*/("""type : 'POST',
          url : '"""),_display_(/*160.19*/routes/*160.25*/.GameController.hostGame()),format.raw/*160.51*/("""',
          // data : JSON.stringify(obj),
          data: JSON.stringify(obj),
          dataType: 'json',
          contentType : 'application/json',
          success : function(data) """),format.raw/*165.36*/("""{"""),format.raw/*165.37*/("""
            """),format.raw/*166.13*/("""debugger;
            if(data.message == "success")
            """),format.raw/*168.13*/("""{"""),format.raw/*168.14*/("""
              """),format.raw/*169.15*/("""//  var $form=$(document.createElement('form')).css("""),format.raw/*169.67*/("""{"""),format.raw/*169.68*/("""display:'none'"""),format.raw/*169.82*/("""}"""),format.raw/*169.83*/(""").attr("method","POST").attr("action","/hostgame");
              // var $input=$(document.createElement('input')).attr('name','FIRST NAME HERE').val("FIRST VALUE HERE");
              // var $input2=$(document.createElemet('input')).attr('name','SECOND NAME HERE').val("SECOND VALUE HERE");
              //  $form.append($input).append($input2);
              // $("body").append($form);
              //  $form.submit();
              $("#hgameid").val(data.gameid);
              $("#hostgameform").submit();
            """),format.raw/*177.13*/("""}"""),format.raw/*177.14*/("""
            """),format.raw/*178.13*/("""else
            """),format.raw/*179.13*/("""{"""),format.raw/*179.14*/("""
              """),format.raw/*180.15*/("""//  alert(data.errormsg);
              $("#errorspan").html(data.errormsg);
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/("""
            """),format.raw/*183.13*/("""// $.('#id').val(data);
            //setError('Call succedded');
            //$('#test1').attr("src", data)
          """),format.raw/*186.11*/("""}"""),format.raw/*186.12*/(""",
          error : function(data) """),format.raw/*187.34*/("""{"""),format.raw/*187.35*/("""
            """),format.raw/*188.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*190.11*/("""}"""),format.raw/*190.12*/("""
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/(""");

        """),format.raw/*193.88*/("""
        """),format.raw/*194.37*/("""
        """),format.raw/*195.16*/("""
      """),format.raw/*196.7*/("""}"""),format.raw/*196.8*/("""

      """),format.raw/*198.7*/("""var observer;

    function joingame() """),format.raw/*200.25*/("""{"""),format.raw/*200.26*/("""
        """),format.raw/*201.9*/("""// debugger;var gameid = $('input[name=TimeBound]:checked').val();
        //debugger;
        var gameid = $( "#mgameid" ).val();
        var isobserver = $("#isobserver").val();

        var obj = """),format.raw/*206.19*/("""{"""),format.raw/*206.20*/("""
            """),format.raw/*207.13*/("""'gameid': gameid,
            'isobserver': isobserver == "1" ? true : false
        """),format.raw/*209.9*/("""}"""),format.raw/*209.10*/(""";

        $.ajax("""),format.raw/*211.16*/("""{"""),format.raw/*211.17*/("""
            """),format.raw/*212.13*/("""type : 'POST',
            url : '"""),_display_(/*213.21*/routes/*213.27*/.GameController.joinGame()),format.raw/*213.53*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            // dataType: 'json',
            contentType : 'application/json',
            success : function(data) """),format.raw/*218.38*/("""{"""),format.raw/*218.39*/("""
                """),format.raw/*219.17*/("""if(data.message == "success")
                """),format.raw/*220.17*/("""{"""),format.raw/*220.18*/("""
                    """),format.raw/*221.21*/("""$("#jgameid").val(gameid);
                    $('#hdn_observer').val(isobserver);
                    $("#joingameform").submit();

                """),format.raw/*225.17*/("""}"""),format.raw/*225.18*/("""
                """),format.raw/*226.17*/("""else
                """),format.raw/*227.17*/("""{"""),format.raw/*227.18*/("""
                    """),format.raw/*228.21*/("""// alert(data.errormsg);
                    $("#errorspan2").html(data.errormsg);
                """),format.raw/*230.17*/("""}"""),format.raw/*230.18*/("""

            """),format.raw/*232.13*/("""}"""),format.raw/*232.14*/(""",
            error : function(data) """),format.raw/*233.36*/("""{"""),format.raw/*233.37*/("""
                """),format.raw/*234.17*/("""alert("error");
                //setError('Make call failed');
            """),format.raw/*236.13*/("""}"""),format.raw/*236.14*/("""
        """),format.raw/*237.9*/("""}"""),format.raw/*237.10*/(""");

        """),format.raw/*239.88*/("""
        """),format.raw/*240.37*/("""
        """),format.raw/*241.16*/("""
    """),format.raw/*242.5*/("""}"""),format.raw/*242.6*/("""

       
       """),format.raw/*245.8*/("""function validateForm()
       """),format.raw/*246.8*/("""{"""),format.raw/*246.9*/("""
        """),format.raw/*247.9*/("""var a=document.forms["GameReportForm"]["exportReportInput"].value;
        if (a==null || a=="")
        """),format.raw/*249.9*/("""{"""),format.raw/*249.10*/("""
             """),format.raw/*250.14*/("""alert("Please enter a valid gameID");
             return false;
            
        """),format.raw/*253.9*/("""}"""),format.raw/*253.10*/("""

    """),format.raw/*255.5*/("""}"""),format.raw/*255.6*/("""



    """),format.raw/*259.5*/("""//Test done by Arul For Killing All the games... and User data except the default admin.. 
    function deleteAllGames()
    """),format.raw/*261.5*/("""{"""),format.raw/*261.6*/("""
        """),format.raw/*262.9*/("""var obj = """),format.raw/*262.19*/("""{"""),format.raw/*262.20*/("""

            """),format.raw/*264.13*/(""""username": "username",  //Passing some dummy value for POST so that DATA WILL BE RECEIVED
            "password": "password"
        """),format.raw/*266.9*/("""}"""),format.raw/*266.10*/(""";
        $.ajax("""),format.raw/*267.16*/("""{"""),format.raw/*267.17*/("""
            """),format.raw/*268.13*/("""type: 'POST',
            url: '"""),_display_(/*269.20*/routes/*269.26*/.DBController.DeleteAllGameData()),format.raw/*269.59*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            contentType: 'application/json',
            success: function (data) """),format.raw/*275.38*/("""{"""),format.raw/*275.39*/("""
                """),format.raw/*276.17*/("""if(data=="success") """),format.raw/*276.37*/("""{"""),format.raw/*276.38*/("""
                    """),format.raw/*277.21*/("""swal("All the games data have been sucessfully deleted..");
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/("""
                """),format.raw/*279.17*/("""else
                """),format.raw/*280.17*/("""{"""),format.raw/*280.18*/("""
                    """),format.raw/*281.21*/("""swal("OOPS! error");
                """),format.raw/*282.17*/("""}"""),format.raw/*282.18*/("""
            """),format.raw/*283.13*/("""}"""),format.raw/*283.14*/(""",
            error: function (data) """),format.raw/*284.36*/("""{"""),format.raw/*284.37*/("""
                """),format.raw/*285.17*/("""swal("error");
            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/("""
        """),format.raw/*287.9*/("""}"""),format.raw/*287.10*/(""");
    """),format.raw/*288.5*/("""}"""),format.raw/*288.6*/("""

    """),format.raw/*290.5*/("""function deleteSingleGames()
    """),format.raw/*291.5*/("""{"""),format.raw/*291.6*/("""
        """),format.raw/*292.9*/("""var obj = """),format.raw/*292.19*/("""{"""),format.raw/*292.20*/("""

            """),format.raw/*294.13*/(""""game_ID": document.getElementById("deltesinglegame").value
        """),format.raw/*295.9*/("""}"""),format.raw/*295.10*/(""";
        $.ajax("""),format.raw/*296.16*/("""{"""),format.raw/*296.17*/("""
            """),format.raw/*297.13*/("""type: 'POST',
            url: '"""),_display_(/*298.20*/routes/*298.26*/.DBController.DeleteSingleGameData()),format.raw/*298.62*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            contentType: 'application/json',
            success: function (data) """),format.raw/*304.38*/("""{"""),format.raw/*304.39*/("""
                """),format.raw/*305.17*/("""if(data=="success") """),format.raw/*305.37*/("""{"""),format.raw/*305.38*/("""
                    """),format.raw/*306.21*/("""swal("The games data for the game "+document.getElementById("deltesinglegame").value+" have been sucessfully deleted..");
                """),format.raw/*307.17*/("""}"""),format.raw/*307.18*/("""
                """),format.raw/*308.17*/("""else
                """),format.raw/*309.17*/("""{"""),format.raw/*309.18*/("""
                    """),format.raw/*310.21*/("""swal("The Game ID you entered is Invalid. Kindly check it..");
                """),format.raw/*311.17*/("""}"""),format.raw/*311.18*/("""
            """),format.raw/*312.13*/("""}"""),format.raw/*312.14*/(""",
            error: function (data) """),format.raw/*313.36*/("""{"""),format.raw/*313.37*/("""
                """),format.raw/*314.17*/("""swal("error");
            """),format.raw/*315.13*/("""}"""),format.raw/*315.14*/("""
        """),format.raw/*316.9*/("""}"""),format.raw/*316.10*/(""");
    """),format.raw/*317.5*/("""}"""),format.raw/*317.6*/("""
        """),format.raw/*318.9*/("""$(document).ready(function() """),format.raw/*318.38*/("""{"""),format.raw/*318.39*/("""
        """),format.raw/*319.9*/("""$('#deletesubmit').click(function()"""),format.raw/*319.44*/("""{"""),format.raw/*319.45*/("""
            """),format.raw/*320.13*/("""if($("#datadeleteform")[0].checkValidity()) """),format.raw/*320.57*/("""{"""),format.raw/*320.58*/("""
              """),format.raw/*321.15*/("""if(document.getElementById("deltesinglegame").value.toUpperCase() != (new String("ALL").valueOf()))
                """),format.raw/*322.17*/("""{"""),format.raw/*322.18*/("""
                    """),format.raw/*323.21*/("""confirm("Are you sure about deleting the game data for the game "+document.getElementById("deltesinglegame").value+" ?");
                    deleteSingleGames();
                    return false;
                """),format.raw/*326.17*/("""}"""),format.raw/*326.18*/("""else
                """),format.raw/*327.17*/("""{"""),format.raw/*327.18*/("""
                  """),format.raw/*328.19*/("""if(confirm(" This would delete all the game data and user data except the default admin \n"+
                         "Are you sure about deleting the data ? "))
                  """),format.raw/*330.19*/("""{"""),format.raw/*330.20*/("""
                     """),format.raw/*331.22*/("""deleteAllGames(); 
                  """),format.raw/*332.19*/("""}"""),format.raw/*332.20*/("""
                  """),format.raw/*333.19*/("""return false;   
                """),format.raw/*334.17*/("""}"""),format.raw/*334.18*/("""
            """),format.raw/*335.13*/("""}"""),format.raw/*335.14*/("""
           """),format.raw/*336.12*/("""}"""),format.raw/*336.13*/(""");
       """),format.raw/*337.8*/("""}"""),format.raw/*337.9*/(""");
  </script>

  <style>
down vote
If you do not want to change your HTML structure you can also do by adding text-align: center; to the wrapper element and a display: inline-block; to the centered element.

#container """),format.raw/*344.12*/("""{"""),format.raw/*344.13*/("""
    """),format.raw/*345.5*/("""width:100%;
    text-align:center;
"""),format.raw/*347.1*/("""}"""),format.raw/*347.2*/("""

"""),format.raw/*349.1*/("""#left """),format.raw/*349.7*/("""{"""),format.raw/*349.8*/("""
    """),format.raw/*350.5*/("""float:left;
    width:20%;
"""),format.raw/*352.1*/("""}"""),format.raw/*352.2*/("""

"""),format.raw/*354.1*/("""#center """),format.raw/*354.9*/("""{"""),format.raw/*354.10*/("""
    """),format.raw/*355.5*/("""display: inline-block;
    margin:0 auto;
    width:40%;
"""),format.raw/*358.1*/("""}"""),format.raw/*358.2*/("""

"""),format.raw/*360.1*/("""#right """),format.raw/*360.8*/("""{"""),format.raw/*360.9*/("""
    """),format.raw/*361.5*/("""float:right;
    width:40%;
"""),format.raw/*363.1*/("""}"""),format.raw/*363.2*/("""
"""),format.raw/*364.1*/("""</style>
  </head>
  <body>
    """),_display_(/*367.6*/header()),format.raw/*367.14*/("""<br>
  <div class="row">
    <div class="col-md-12">
      <h3>
               Welcome """),_display_(/*371.25*/Http/*371.29*/.Context.current().args.get("firstname").asInstanceOf[String]),format.raw/*371.90*/("""
              """),format.raw/*372.15*/("""</h3>
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
                      <form id="SingleDeleteForm">

                      </form>
                      <form  id="datadeleteform" method ="POST"  action=""""),_display_(/*392.75*/routes/*392.81*/.DBController.DeleteAllGameData()),format.raw/*392.114*/("""">
                     
                       <label>Enter a Game ID or All to delete the Game Data</label> 
                       <br>
                      <input type="text" id="deltesinglegame" name="deltesinglegame" placeholder="Enter a gameID to delete a game or 'all' to delete all the games" size="55">
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
      """),format.raw/*425.143*/("""
  """),format.raw/*426.16*/("""
      """),format.raw/*427.20*/("""

      """),format.raw/*429.108*/("""
      """),format.raw/*430.20*/("""
      """),format.raw/*431.20*/("""

                  """),format.raw/*433.19*/("""<!-- Host Game Modal -->


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
                                          """),format.raw/*452.71*/("""
                                              """),format.raw/*453.134*/("""
                                              """),format.raw/*454.73*/("""
                                                  """),format.raw/*455.74*/("""
                                                      """),format.raw/*456.84*/("""
                                                          """),format.raw/*457.145*/("""
                                                          """),format.raw/*458.66*/("""
                                                      """),format.raw/*459.67*/("""
                                                  """),format.raw/*460.61*/("""
                                                  """),format.raw/*461.74*/("""
                                                      """),format.raw/*462.84*/("""
                                                          """),format.raw/*463.127*/("""
                                                          """),format.raw/*464.65*/("""
                                                      """),format.raw/*465.67*/("""
                                                  """),format.raw/*466.61*/("""
                                              """),format.raw/*467.57*/("""
                                          """),format.raw/*468.53*/("""

                                              """),format.raw/*470.47*/("""<!-- Select Basic -->
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
    """),_display_(/*578.6*/footer()),format.raw/*578.14*/("""
  """),format.raw/*579.3*/("""</body>
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
                  DATE: Tue Nov 21 21:30:40 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/InstructorDashboard.scala.html
                  HASH: c32ce1ae801b74a3b9a8e990f9608224ab0823bb
                  MATRIX: 885->37|1444->569|1459->575|1514->609|1596->664|1611->670|1667->705|1749->760|1764->766|1830->810|1912->865|1927->871|1988->911|2070->966|2085->972|2152->1017|2367->1205|2382->1211|2446->1254|2526->1307|2541->1313|2598->1349|2678->1402|2693->1408|2764->1458|2844->1511|2859->1517|2924->1561|3236->1845|3265->1846|3301->1855|3394->1921|3422->1922|3487->1959|3516->1960|3552->1969|3610->1999|3639->2000|3678->2011|3730->2036|3759->2037|3804->2054|3833->2055|3872->2066|3932->2099|3947->2105|4005->2142|4210->2319|4239->2320|4280->2333|4378->2403|4407->2404|4450->2419|4829->2770|4858->2771|4903->2788|5173->3030|5202->3031|5249->3050|5278->3051|5323->3068|5607->3324|5636->3325|5695->3356|5906->3539|5935->3540|5976->3553|6030->3579|6059->3580|6110->3603|6150->3615|6179->3616|6234->3643|6319->3700|6348->3701|6405->3730|6587->3884|6616->3885|6675->3916|6869->4082|6898->4083|6959->4116|6988->4117|7047->4148|7238->4311|7267->4312|7358->4375|7547->4536|7576->4537|7690->4623|7719->4624|7779->4656|8066->4915|8095->4916|8146->4939|8175->4940|8311->5048|8340->5049|8382->5062|8412->5063|8476->5098|8506->5099|8548->5112|8647->5182|8677->5183|8714->5192|8744->5193|8785->5284|8823->5321|8861->5337|8896->5344|8925->5345|8961->5353|9024->5387|9054->5388|9091->5397|9190->5468|9219->5469|9255->5477|9335->5529|9364->5530|9401->5539|9671->5780|9701->5781|9741->5792|10073->6096|10103->6097|10140->6106|10174->6111|10204->6112|10244->6123|10529->6380|10559->6381|10596->6390|10660->6426|10689->6427|10725->6435|10774->6455|10804->6456|10841->6465|11077->6672|11107->6673|11147->6684|11351->6860|11381->6861|11427->6878|11457->6879|11497->6890|11558->6923|11574->6929|11622->6955|11839->7143|11869->7144|11911->7157|12004->7221|12034->7222|12078->7237|12159->7289|12189->7290|12232->7304|12262->7305|12816->7830|12846->7831|12888->7844|12934->7861|12964->7862|13008->7877|13126->7966|13156->7967|13198->7980|13347->8100|13377->8101|13441->8136|13471->8137|13513->8150|13612->8220|13642->8221|13679->8230|13709->8231|13750->8322|13788->8359|13826->8375|13861->8382|13890->8383|13926->8391|13994->8430|14024->8431|14061->8440|14289->8639|14319->8640|14361->8653|14474->8738|14504->8739|14551->8757|14581->8758|14623->8771|14686->8806|14702->8812|14750->8838|14980->9039|15010->9040|15056->9057|15131->9103|15161->9104|15211->9125|15389->9274|15419->9275|15465->9292|15515->9313|15545->9314|15595->9335|15723->9434|15753->9435|15796->9449|15826->9450|15892->9487|15922->9488|15968->9505|16073->9581|16103->9582|16140->9591|16170->9592|16211->9683|16249->9720|16287->9736|16320->9741|16349->9742|16394->9759|16453->9790|16482->9791|16519->9800|16652->9905|16682->9906|16725->9920|16839->10006|16869->10007|16903->10013|16932->10014|16968->10022|17121->10147|17150->10148|17187->10157|17226->10167|17256->10168|17299->10182|17461->10316|17491->10317|17537->10334|17567->10335|17609->10348|17670->10381|17686->10387|17741->10420|17989->10639|18019->10640|18065->10657|18114->10677|18144->10678|18194->10699|18299->10775|18329->10776|18375->10793|18425->10814|18455->10815|18505->10836|18571->10873|18601->10874|18643->10887|18673->10888|18739->10925|18769->10926|18815->10943|18871->10970|18901->10971|18938->10980|18968->10981|19003->10988|19032->10989|19066->10995|19127->11028|19156->11029|19193->11038|19232->11048|19262->11049|19305->11063|19401->11131|19431->11132|19477->11149|19507->11150|19549->11163|19610->11196|19626->11202|19684->11238|19932->11457|19962->11458|20008->11475|20057->11495|20087->11496|20137->11517|20304->11655|20334->11656|20380->11673|20430->11694|20460->11695|20510->11716|20618->11795|20648->11796|20690->11809|20720->11810|20786->11847|20816->11848|20862->11865|20918->11892|20948->11893|20985->11902|21015->11903|21050->11910|21079->11911|21116->11920|21174->11949|21204->11950|21241->11959|21305->11994|21335->11995|21377->12008|21450->12052|21480->12053|21524->12068|21669->12184|21699->12185|21749->12206|21991->12419|22021->12420|22071->12441|22101->12442|22149->12461|22358->12641|22388->12642|22439->12664|22505->12701|22535->12702|22583->12721|22645->12754|22675->12755|22717->12768|22747->12769|22788->12781|22818->12782|22856->12792|22885->12793|23134->13013|23164->13014|23197->13019|23260->13054|23289->13055|23319->13057|23353->13063|23382->13064|23415->13069|23470->13096|23499->13097|23529->13099|23565->13107|23595->13108|23628->13113|23713->13170|23742->13171|23772->13173|23807->13180|23836->13181|23869->13186|23925->13214|23954->13215|23983->13216|24043->13249|24073->13257|24189->13345|24203->13349|24286->13410|24330->13425|25294->14361|25310->14367|25366->14400|26666->15806|26698->15822|26734->15842|26772->15951|26808->15971|26844->15991|26893->16011|28004->17121|28081->17255|28157->17328|28237->17402|28321->17486|28410->17631|28498->17697|28582->17764|28662->17825|28742->17899|28826->17983|28915->18110|29003->18175|29087->18242|29167->18303|29243->18360|29315->18413|29392->18461|35443->24485|35473->24493|35504->24496
                  LINES: 32->4|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|59->31|59->31|60->32|63->35|63->35|65->37|65->37|66->38|67->39|67->39|68->40|69->41|69->41|70->42|70->42|71->43|72->44|72->44|72->44|77->49|77->49|78->50|79->51|79->51|80->52|87->59|87->59|88->60|89->61|89->61|90->62|90->62|91->63|92->64|92->64|95->67|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|102->74|102->74|103->75|106->78|106->78|107->79|108->80|108->80|109->81|109->81|110->82|112->84|112->84|115->87|117->89|117->89|119->91|119->91|120->92|123->95|123->95|124->96|124->96|127->99|127->99|128->100|128->100|129->101|129->101|130->102|132->104|132->104|133->105|133->105|135->107|136->108|137->109|138->110|138->110|140->112|140->112|140->112|141->113|144->116|144->116|146->118|147->119|147->119|148->120|155->127|155->127|156->128|163->135|163->135|164->136|164->136|164->136|165->137|170->142|170->142|171->143|172->144|172->144|174->146|174->146|174->146|175->147|180->152|180->152|181->153|185->157|185->157|186->158|186->158|187->159|188->160|188->160|188->160|193->165|193->165|194->166|196->168|196->168|197->169|197->169|197->169|197->169|197->169|205->177|205->177|206->178|207->179|207->179|208->180|210->182|210->182|211->183|214->186|214->186|215->187|215->187|216->188|218->190|218->190|219->191|219->191|221->193|222->194|223->195|224->196|224->196|226->198|228->200|228->200|229->201|234->206|234->206|235->207|237->209|237->209|239->211|239->211|240->212|241->213|241->213|241->213|246->218|246->218|247->219|248->220|248->220|249->221|253->225|253->225|254->226|255->227|255->227|256->228|258->230|258->230|260->232|260->232|261->233|261->233|262->234|264->236|264->236|265->237|265->237|267->239|268->240|269->241|270->242|270->242|273->245|274->246|274->246|275->247|277->249|277->249|278->250|281->253|281->253|283->255|283->255|287->259|289->261|289->261|290->262|290->262|290->262|292->264|294->266|294->266|295->267|295->267|296->268|297->269|297->269|297->269|303->275|303->275|304->276|304->276|304->276|305->277|306->278|306->278|307->279|308->280|308->280|309->281|310->282|310->282|311->283|311->283|312->284|312->284|313->285|314->286|314->286|315->287|315->287|316->288|316->288|318->290|319->291|319->291|320->292|320->292|320->292|322->294|323->295|323->295|324->296|324->296|325->297|326->298|326->298|326->298|332->304|332->304|333->305|333->305|333->305|334->306|335->307|335->307|336->308|337->309|337->309|338->310|339->311|339->311|340->312|340->312|341->313|341->313|342->314|343->315|343->315|344->316|344->316|345->317|345->317|346->318|346->318|346->318|347->319|347->319|347->319|348->320|348->320|348->320|349->321|350->322|350->322|351->323|354->326|354->326|355->327|355->327|356->328|358->330|358->330|359->331|360->332|360->332|361->333|362->334|362->334|363->335|363->335|364->336|364->336|365->337|365->337|372->344|372->344|373->345|375->347|375->347|377->349|377->349|377->349|378->350|380->352|380->352|382->354|382->354|382->354|383->355|386->358|386->358|388->360|388->360|388->360|389->361|391->363|391->363|392->364|395->367|395->367|399->371|399->371|399->371|400->372|420->392|420->392|420->392|453->425|454->426|455->427|457->429|458->430|459->431|461->433|480->452|481->453|482->454|483->455|484->456|485->457|486->458|487->459|488->460|489->461|490->462|491->463|492->464|493->465|494->466|495->467|496->468|498->470|606->578|606->578|607->579
                  -- GENERATED --
              */
          