
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
        var xhr = new XMLHttpRequest();
xhr.open('GET', 'https://login.cmu.edu/', true);
xhr.onreadystatechange = function() """),format.raw/*35.37*/("""{"""),format.raw/*35.38*/("""
  """),format.raw/*36.3*/("""if (xhr.readyState === 4)  """),format.raw/*36.30*/("""{"""),format.raw/*36.31*/(""" 
    """),format.raw/*37.5*/("""console.log(xhr.responseText);
  """),format.raw/*38.3*/("""}"""),format.raw/*38.4*/("""
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/(""";
xhr.send(null);
        showActiveGames();

      """),format.raw/*43.7*/("""}"""),format.raw/*43.8*/(""");

      function showActiveGames() """),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""
        """),format.raw/*46.9*/("""//debugger;
        var obj = """),format.raw/*47.19*/("""{"""),format.raw/*47.20*/("""
          """),format.raw/*48.11*/("""'phaseId': "tst"
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""";
        $.ajax("""),format.raw/*50.16*/("""{"""),format.raw/*50.17*/("""
          """),format.raw/*51.11*/("""type : 'POST',
          url : '"""),_display_(/*52.19*/routes/*52.25*/.DashboardController.completedGames()),format.raw/*52.62*/("""',
          //data : JSON.stringify("test"),
          //data: "",
          dataType: 'json',
          //contentType : 'application/json',
          success : function(data) """),format.raw/*57.36*/("""{"""),format.raw/*57.37*/("""
            """),format.raw/*58.13*/("""//alert(data.length);x`
            for (i = 0; i < data.length; i++) """),format.raw/*59.47*/("""{"""),format.raw/*59.48*/("""
              """),format.raw/*60.15*/("""//data[i].timebound
              var obj = data[i];
              //obj.istimebound = "Yes";
              obj.istimebound = obj.istimebound == "1" ? "Yes" : "No";
              // $('#myTable').append('<tr><td>my data</td><td>more data</td></tr>');

              if(obj.status== (new String("Waiting for players to join").valueOf()))
              """),format.raw/*67.15*/("""{"""),format.raw/*67.16*/("""
                """),format.raw/*68.17*/("""var appendquery = "<tr><td class='gameid-class'>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>View</a></td> <td><a href='#'>Join</a></td> </tr>";
              """),format.raw/*69.15*/("""}"""),format.raw/*69.16*/("""else
              """),format.raw/*70.15*/("""{"""),format.raw/*70.16*/("""
                """),format.raw/*71.17*/("""var appendquery = "<tr><td class='gameid-class'>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>View</a></td> <td><a href='#'>NO ONE CAN JOIN NOW</a></td></tr>";
              """),format.raw/*72.15*/("""}"""),format.raw/*72.16*/("""

              
              """),format.raw/*75.15*/("""//$('#grid-basic tr:last').after(appendquery);
              //$('#grid-basic').find(tbody).append(appendquery);
              $("#grid-basic tbody").append(appendquery);
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
            """),format.raw/*79.13*/("""$("#grid-basic").bootgrid("""),format.raw/*79.39*/("""{"""),format.raw/*79.40*/("""
                      """),format.raw/*80.23*/("""formatters: """),format.raw/*80.35*/("""{"""),format.raw/*80.36*/("""
                          """),format.raw/*81.27*/(""""link1": function(column, row)
                          """),format.raw/*82.27*/("""{"""),format.raw/*82.28*/("""
                            """),format.raw/*83.29*/("""console.log(row.status);

                            if(row.status == (new String("Waiting for players to join").valueOf()))
                            """),format.raw/*86.29*/("""{"""),format.raw/*86.30*/("""
                              """),format.raw/*87.31*/("""return "<a href=\"#\" onclick='Showmodel(\"" + row.gameid + "\",\"" + row.status + "\",\"" + row.istimebound + "\")'>" + "Join" + "</a>";
                            """),format.raw/*88.29*/("""}"""),format.raw/*88.30*/("""else
                            """),format.raw/*89.29*/("""{"""),format.raw/*89.30*/("""
                              """),format.raw/*90.31*/("""return "<p>You can only view this game</p>";
                              //return "<a href=\"#\">" + "NO ONE CAN JOIN NOW" + "</a>";
                            """),format.raw/*92.29*/("""}"""),format.raw/*92.30*/("""

                              
                              """),format.raw/*95.31*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";
                              
                          """),format.raw/*97.27*/("""}"""),format.raw/*97.28*/(""",
                          "link": function(column, row)
                            """),format.raw/*99.29*/("""{"""),format.raw/*99.30*/("""
                               """),format.raw/*100.32*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";

                               return "<a href=\"#\" onclick='redirectFromHere(\"" + row.gameid + "\")'>" + "View" + "</a>";
                             """),format.raw/*103.30*/("""}"""),format.raw/*103.31*/("""
                      """),format.raw/*104.23*/("""}"""),format.raw/*104.24*/(""",
                      rowCount: [5,10,-1],
                      columnSelection: false
                  """),format.raw/*107.19*/("""}"""),format.raw/*107.20*/(""");
          """),format.raw/*108.11*/("""}"""),format.raw/*108.12*/(""",
          error : function(data) """),format.raw/*109.34*/("""{"""),format.raw/*109.35*/("""
            """),format.raw/*110.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*112.11*/("""}"""),format.raw/*112.12*/("""
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/(""");

        """),format.raw/*115.88*/("""
        """),format.raw/*116.37*/("""
        """),format.raw/*117.16*/("""
      """),format.raw/*118.7*/("""}"""),format.raw/*118.8*/("""

      """),format.raw/*120.7*/("""function redirectFromHere(gameid) """),format.raw/*120.41*/("""{"""),format.raw/*120.42*/("""
        """),format.raw/*121.9*/("""$('#gameid').val(gameid);

        $('#frmInstructor').submit();
      """),format.raw/*124.7*/("""}"""),format.raw/*124.8*/("""

      """),format.raw/*126.7*/("""function Showmodel(gameid,status,istimebound)
      """),format.raw/*127.7*/("""{"""),format.raw/*127.8*/("""
        """),format.raw/*128.9*/("""// alert(gameid + status + istimebound);
        // gameid
        $( "#mgameid" ).val(gameid);
        $("#mgameid").prop("readonly", true);

        $("#errorspan2").html("");
        $('#wybierz1').hide();
        if(status == "RUNNING") """),format.raw/*135.33*/("""{"""),format.raw/*135.34*/("""
          """),format.raw/*136.11*/("""$("#isobserver").val('1');
          $("#isobserver").hide();
          $("#labelforobserver").hide();

          // $("#labelforobserver").text("You can only join this game as observer");
          $("#myModalLabel2").text("You can only join this game as observer");
          //  myModalLabel2
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""
        """),format.raw/*144.9*/("""else """),format.raw/*144.14*/("""{"""),format.raw/*144.15*/("""
          """),format.raw/*145.11*/("""$("#isobserver").show();
          $("#isobserver").val('0');
          $("#labelforobserver").show();
          $("#labelforobserver").text("Do you want to join as observer:");
          $("#myModalLabel2").text("JOIN GAME AS PLAYER OR OBSERVER");
        """),format.raw/*150.9*/("""}"""),format.raw/*150.10*/("""
        """),format.raw/*151.9*/("""$('#myModal2').modal('show');
      """),format.raw/*152.7*/("""}"""),format.raw/*152.8*/("""

      """),format.raw/*154.7*/("""function hostgame() """),format.raw/*154.27*/("""{"""),format.raw/*154.28*/("""
        """),format.raw/*155.9*/("""// debugger;
        //  var istimebound = $('input[name=TimeBound]:checked').val();
        var timeforstep = $( "#selecttime" ).val();
        var noofsteps = $( "#selectsteps" ).val();

        var obj = """),format.raw/*160.19*/("""{"""),format.raw/*160.20*/("""
          """),format.raw/*161.11*/("""'istimebound': true,
          // 'istimebound': istimebound == "1" ? true : false,
          'timeforeachmove': timeforstep,
          'stepsforeachplayer': noofsteps
        """),format.raw/*165.9*/("""}"""),format.raw/*165.10*/(""";
        $.ajax("""),format.raw/*166.16*/("""{"""),format.raw/*166.17*/("""
          """),format.raw/*167.11*/("""type : 'POST',
          url : '"""),_display_(/*168.19*/routes/*168.25*/.GameController.hostGame()),format.raw/*168.51*/("""',
          // data : JSON.stringify(obj),
          data: JSON.stringify(obj),
          dataType: 'json',
          contentType : 'application/json',
          success : function(data) """),format.raw/*173.36*/("""{"""),format.raw/*173.37*/("""
            """),format.raw/*174.13*/("""debugger;
            if(data.message == "success")
            """),format.raw/*176.13*/("""{"""),format.raw/*176.14*/("""
              """),format.raw/*177.15*/("""//  var $form=$(document.createElement('form')).css("""),format.raw/*177.67*/("""{"""),format.raw/*177.68*/("""display:'none'"""),format.raw/*177.82*/("""}"""),format.raw/*177.83*/(""").attr("method","POST").attr("action","/hostgame");
              // var $input=$(document.createElement('input')).attr('name','FIRST NAME HERE').val("FIRST VALUE HERE");
              // var $input2=$(document.createElemet('input')).attr('name','SECOND NAME HERE').val("SECOND VALUE HERE");
              //  $form.append($input).append($input2);
              // $("body").append($form);
              //  $form.submit();
              $("#hgameid").val(data.gameid);
              $("#hostgameform").submit();
            """),format.raw/*185.13*/("""}"""),format.raw/*185.14*/("""
            """),format.raw/*186.13*/("""else
            """),format.raw/*187.13*/("""{"""),format.raw/*187.14*/("""
              """),format.raw/*188.15*/("""//  alert(data.errormsg);
              $("#errorspan").html(data.errormsg);
            """),format.raw/*190.13*/("""}"""),format.raw/*190.14*/("""
            """),format.raw/*191.13*/("""// $.('#id').val(data);
            //setError('Call succedded');
            //$('#test1').attr("src", data)
          """),format.raw/*194.11*/("""}"""),format.raw/*194.12*/(""",
          error : function(data) """),format.raw/*195.34*/("""{"""),format.raw/*195.35*/("""
            """),format.raw/*196.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*198.11*/("""}"""),format.raw/*198.12*/("""
        """),format.raw/*199.9*/("""}"""),format.raw/*199.10*/(""");

        """),format.raw/*201.88*/("""
        """),format.raw/*202.37*/("""
        """),format.raw/*203.16*/("""
      """),format.raw/*204.7*/("""}"""),format.raw/*204.8*/("""

      """),format.raw/*206.7*/("""var observer;

    function joingame() """),format.raw/*208.25*/("""{"""),format.raw/*208.26*/("""
        """),format.raw/*209.9*/("""// debugger;var gameid = $('input[name=TimeBound]:checked').val();
        //debugger;
        var gameid = $( "#mgameid" ).val();
        var isobserver = $("#isobserver").val();

        var obj = """),format.raw/*214.19*/("""{"""),format.raw/*214.20*/("""
            """),format.raw/*215.13*/("""'gameid': gameid,
            'isobserver': isobserver == "1" ? true : false
        """),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""";

        $.ajax("""),format.raw/*219.16*/("""{"""),format.raw/*219.17*/("""
            """),format.raw/*220.13*/("""type : 'POST',
            url : '"""),_display_(/*221.21*/routes/*221.27*/.GameController.joinGame()),format.raw/*221.53*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            // dataType: 'json',
            contentType : 'application/json',
            success : function(data) """),format.raw/*226.38*/("""{"""),format.raw/*226.39*/("""
                """),format.raw/*227.17*/("""if(data.message == "success")
                """),format.raw/*228.17*/("""{"""),format.raw/*228.18*/("""
                    """),format.raw/*229.21*/("""$("#jgameid").val(gameid);
                    $('#hdn_observer').val(isobserver);
                    $("#joingameform").submit();

                """),format.raw/*233.17*/("""}"""),format.raw/*233.18*/("""
                """),format.raw/*234.17*/("""else
                """),format.raw/*235.17*/("""{"""),format.raw/*235.18*/("""
                    """),format.raw/*236.21*/("""// alert(data.errormsg);
                    $("#errorspan2").html(data.errormsg);
                """),format.raw/*238.17*/("""}"""),format.raw/*238.18*/("""

            """),format.raw/*240.13*/("""}"""),format.raw/*240.14*/(""",
            error : function(data) """),format.raw/*241.36*/("""{"""),format.raw/*241.37*/("""
                """),format.raw/*242.17*/("""alert("error");
                //setError('Make call failed');
            """),format.raw/*244.13*/("""}"""),format.raw/*244.14*/("""
        """),format.raw/*245.9*/("""}"""),format.raw/*245.10*/(""");

        """),format.raw/*247.88*/("""
        """),format.raw/*248.37*/("""
        """),format.raw/*249.16*/("""
    """),format.raw/*250.5*/("""}"""),format.raw/*250.6*/("""

       
       """),format.raw/*253.8*/("""function validateForm()
       """),format.raw/*254.8*/("""{"""),format.raw/*254.9*/("""
        """),format.raw/*255.9*/("""var a=document.forms["GameReportForm"]["exportReportInput"].value;
        if (a==null || a=="")
        """),format.raw/*257.9*/("""{"""),format.raw/*257.10*/("""
             """),format.raw/*258.14*/("""alert("Please enter a valid gameID");
             return false;
            
        """),format.raw/*261.9*/("""}"""),format.raw/*261.10*/("""

    """),format.raw/*263.5*/("""}"""),format.raw/*263.6*/("""



    """),format.raw/*267.5*/("""//Test done by Arul For Killing All the games... and User data except the default admin.. 
    function deleteAllGames()
    """),format.raw/*269.5*/("""{"""),format.raw/*269.6*/("""
        """),format.raw/*270.9*/("""var obj = """),format.raw/*270.19*/("""{"""),format.raw/*270.20*/("""

            """),format.raw/*272.13*/(""""username": "username",  //Passing some dummy value for POST so that DATA WILL BE RECEIVED
            "password": "password"
        """),format.raw/*274.9*/("""}"""),format.raw/*274.10*/(""";
        $.ajax("""),format.raw/*275.16*/("""{"""),format.raw/*275.17*/("""
            """),format.raw/*276.13*/("""type: 'POST',
            url: '"""),_display_(/*277.20*/routes/*277.26*/.DBController.DeleteAllGameData()),format.raw/*277.59*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            contentType: 'application/json',
            success: function (data) """),format.raw/*283.38*/("""{"""),format.raw/*283.39*/("""
                """),format.raw/*284.17*/("""if(data=="success") """),format.raw/*284.37*/("""{"""),format.raw/*284.38*/("""            
                    """),format.raw/*285.21*/("""swal("All the games data have been sucessfully deleted..");
                     setTimeout(function() """),format.raw/*286.44*/("""{"""),format.raw/*286.45*/("""
                      """),format.raw/*287.23*/("""location.reload();
                  """),format.raw/*288.19*/("""}"""),format.raw/*288.20*/(""", 4000);
             
                """),format.raw/*290.17*/("""}"""),format.raw/*290.18*/("""
                """),format.raw/*291.17*/("""else
                """),format.raw/*292.17*/("""{"""),format.raw/*292.18*/("""
                    """),format.raw/*293.21*/("""swal("OOPS! error");
                """),format.raw/*294.17*/("""}"""),format.raw/*294.18*/("""
            """),format.raw/*295.13*/("""}"""),format.raw/*295.14*/(""",
            error: function (data) """),format.raw/*296.36*/("""{"""),format.raw/*296.37*/("""
                """),format.raw/*297.17*/("""swal("error");
            """),format.raw/*298.13*/("""}"""),format.raw/*298.14*/("""
        """),format.raw/*299.9*/("""}"""),format.raw/*299.10*/(""");
    """),format.raw/*300.5*/("""}"""),format.raw/*300.6*/("""

    """),format.raw/*302.5*/("""function deleteSingleGames()
    """),format.raw/*303.5*/("""{"""),format.raw/*303.6*/("""
        """),format.raw/*304.9*/("""var obj = """),format.raw/*304.19*/("""{"""),format.raw/*304.20*/("""

            """),format.raw/*306.13*/(""""game_ID": document.getElementById("deltesinglegame").value
        """),format.raw/*307.9*/("""}"""),format.raw/*307.10*/(""";
        $.ajax("""),format.raw/*308.16*/("""{"""),format.raw/*308.17*/("""
            """),format.raw/*309.13*/("""type: 'POST',
            url: '"""),_display_(/*310.20*/routes/*310.26*/.DBController.DeleteSingleGameData()),format.raw/*310.62*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            contentType: 'application/json',
            success: function (data) """),format.raw/*316.38*/("""{"""),format.raw/*316.39*/("""
                """),format.raw/*317.17*/("""if(data=="success") """),format.raw/*317.37*/("""{"""),format.raw/*317.38*/("""
                    
                  """),format.raw/*319.19*/("""swal("The games data for the game "+document.getElementById("deltesinglegame").value+" have been sucessfully deleted..");
                  setTimeout(function() """),format.raw/*320.41*/("""{"""),format.raw/*320.42*/("""
                      """),format.raw/*321.23*/("""location.reload();
                  """),format.raw/*322.19*/("""}"""),format.raw/*322.20*/(""", 4000);
                   
                """),format.raw/*324.17*/("""}"""),format.raw/*324.18*/("""
                """),format.raw/*325.17*/("""else
                """),format.raw/*326.17*/("""{"""),format.raw/*326.18*/("""
                    """),format.raw/*327.21*/("""swal("The Game ID you entered is Invalid. Kindly check it..");
                """),format.raw/*328.17*/("""}"""),format.raw/*328.18*/("""
            """),format.raw/*329.13*/("""}"""),format.raw/*329.14*/(""",
            error: function (data) """),format.raw/*330.36*/("""{"""),format.raw/*330.37*/("""
                """),format.raw/*331.17*/("""swal("error");
            """),format.raw/*332.13*/("""}"""),format.raw/*332.14*/("""
        """),format.raw/*333.9*/("""}"""),format.raw/*333.10*/(""");
    """),format.raw/*334.5*/("""}"""),format.raw/*334.6*/("""
        """),format.raw/*335.9*/("""$(document).ready(function() """),format.raw/*335.38*/("""{"""),format.raw/*335.39*/("""
        """),format.raw/*336.9*/("""$('#deletesubmit').click(function()"""),format.raw/*336.44*/("""{"""),format.raw/*336.45*/("""
            """),format.raw/*337.13*/("""if($("#datadeleteform")[0].checkValidity()) """),format.raw/*337.57*/("""{"""),format.raw/*337.58*/("""
              """),format.raw/*338.15*/("""if(document.getElementById("deltesinglegame").value.toUpperCase() != (new String("ALL").valueOf()))
                """),format.raw/*339.17*/("""{"""),format.raw/*339.18*/("""
                    """),format.raw/*340.21*/("""confirm("Are you sure about deleting the game data for the game "+document.getElementById("deltesinglegame").value+" ?");
                    deleteSingleGames();
                    return false;
                """),format.raw/*343.17*/("""}"""),format.raw/*343.18*/("""else
                """),format.raw/*344.17*/("""{"""),format.raw/*344.18*/("""
                  """),format.raw/*345.19*/("""if(confirm(" This would delete all the game data and user data except the default admin \n"+
                         "Are you sure about deleting the data ? "))
                  """),format.raw/*347.19*/("""{"""),format.raw/*347.20*/("""
                     """),format.raw/*348.22*/("""deleteAllGames(); 
                  """),format.raw/*349.19*/("""}"""),format.raw/*349.20*/("""
                  """),format.raw/*350.19*/("""return false;   
                """),format.raw/*351.17*/("""}"""),format.raw/*351.18*/("""
            """),format.raw/*352.13*/("""}"""),format.raw/*352.14*/("""
           """),format.raw/*353.12*/("""}"""),format.raw/*353.13*/(""");
       """),format.raw/*354.8*/("""}"""),format.raw/*354.9*/(""");



  </script>

  <script>

  </script>

  <style>
down vote
If you do not want to change your HTML structure you can also do by adding text-align: center; to the wrapper element and a display: inline-block; to the centered element.

#container """),format.raw/*368.12*/("""{"""),format.raw/*368.13*/("""
    """),format.raw/*369.5*/("""width:100%;
    text-align:center;
"""),format.raw/*371.1*/("""}"""),format.raw/*371.2*/("""

"""),format.raw/*373.1*/("""#left """),format.raw/*373.7*/("""{"""),format.raw/*373.8*/("""
    """),format.raw/*374.5*/("""float:left;
    width:25%;
"""),format.raw/*376.1*/("""}"""),format.raw/*376.2*/("""

"""),format.raw/*378.1*/("""#center """),format.raw/*378.9*/("""{"""),format.raw/*378.10*/("""
    """),format.raw/*379.5*/("""display: inline-block;
    margin:0 auto;
    width:45%;
"""),format.raw/*382.1*/("""}"""),format.raw/*382.2*/("""

"""),format.raw/*384.1*/("""#right """),format.raw/*384.8*/("""{"""),format.raw/*384.9*/("""
    """),format.raw/*385.5*/("""float:right;
    width:30%;
"""),format.raw/*387.1*/("""}"""),format.raw/*387.2*/("""
"""),format.raw/*388.1*/("""</style>
  </head>
  <body>
    """),_display_(/*391.6*/header()),format.raw/*391.14*/("""<br>
  <div class="row">
    <div class="col-md-12">
      <h3>
               Welcome """),_display_(/*395.25*/Http/*395.29*/.Context.current().args.get("firstname").asInstanceOf[String]),format.raw/*395.90*/("""
              """),format.raw/*396.15*/("""</h3>
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
                      <form  id="datadeleteform" method ="POST"  action=""""),_display_(/*416.75*/routes/*416.81*/.DBController.DeleteAllGameData()),format.raw/*416.114*/("""">
                     
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
      """),format.raw/*449.143*/("""
  """),format.raw/*450.16*/("""
      """),format.raw/*451.20*/("""

      """),format.raw/*453.108*/("""
      """),format.raw/*454.20*/("""
      """),format.raw/*455.20*/("""

                  """),format.raw/*457.19*/("""<!-- Host Game Modal -->


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
                                          """),format.raw/*476.71*/("""
                                              """),format.raw/*477.134*/("""
                                              """),format.raw/*478.73*/("""
                                                  """),format.raw/*479.74*/("""
                                                      """),format.raw/*480.84*/("""
                                                          """),format.raw/*481.145*/("""
                                                          """),format.raw/*482.66*/("""
                                                      """),format.raw/*483.67*/("""
                                                  """),format.raw/*484.61*/("""
                                                  """),format.raw/*485.74*/("""
                                                      """),format.raw/*486.84*/("""
                                                          """),format.raw/*487.127*/("""
                                                          """),format.raw/*488.65*/("""
                                                      """),format.raw/*489.67*/("""
                                                  """),format.raw/*490.61*/("""
                                              """),format.raw/*491.57*/("""
                                          """),format.raw/*492.53*/("""

                                              """),format.raw/*494.47*/("""<!-- Select Basic -->
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
    """),_display_(/*602.6*/footer()),format.raw/*602.14*/("""
  """),format.raw/*603.3*/("""</body>
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
                  DATE: Wed Nov 22 15:12:38 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/InstructorDashboard.scala.html
                  HASH: f75bf724efbfe49fd9cf3f027a5aea27ddfb7261
                  MATRIX: 885->37|1444->569|1459->575|1514->609|1596->664|1611->670|1667->705|1749->760|1764->766|1830->810|1912->865|1927->871|1988->911|2070->966|2085->972|2152->1017|2367->1205|2382->1211|2446->1254|2526->1307|2541->1313|2598->1349|2678->1402|2693->1408|2764->1458|2844->1511|2859->1517|2924->1561|3236->1845|3265->1846|3301->1855|3486->2012|3515->2013|3545->2016|3600->2043|3629->2044|3662->2050|3722->2083|3750->2084|3778->2085|3806->2086|3885->2138|3913->2139|3978->2176|4007->2177|4043->2186|4101->2216|4130->2217|4169->2228|4221->2253|4250->2254|4295->2271|4324->2272|4363->2283|4423->2316|4438->2322|4496->2359|4701->2536|4730->2537|4771->2550|4869->2620|4898->2621|4941->2636|5320->2987|5349->2988|5394->3005|5664->3247|5693->3248|5740->3267|5769->3268|5814->3285|6098->3541|6127->3542|6186->3573|6397->3756|6426->3757|6467->3770|6521->3796|6550->3797|6601->3820|6641->3832|6670->3833|6725->3860|6810->3917|6839->3918|6896->3947|7078->4101|7107->4102|7166->4133|7360->4299|7389->4300|7450->4333|7479->4334|7538->4365|7729->4528|7758->4529|7849->4592|8038->4753|8067->4754|8181->4840|8210->4841|8271->4873|8559->5132|8589->5133|8641->5156|8671->5157|8808->5265|8838->5266|8880->5279|8910->5280|8974->5315|9004->5316|9046->5329|9145->5399|9175->5400|9212->5409|9242->5410|9283->5501|9321->5538|9359->5554|9394->5561|9423->5562|9459->5570|9522->5604|9552->5605|9589->5614|9688->5685|9717->5686|9753->5694|9833->5746|9862->5747|9899->5756|10169->5997|10199->5998|10239->6009|10571->6313|10601->6314|10638->6323|10672->6328|10702->6329|10742->6340|11027->6597|11057->6598|11094->6607|11158->6643|11187->6644|11223->6652|11272->6672|11302->6673|11339->6682|11575->6889|11605->6890|11645->6901|11849->7077|11879->7078|11925->7095|11955->7096|11995->7107|12056->7140|12072->7146|12120->7172|12337->7360|12367->7361|12409->7374|12502->7438|12532->7439|12576->7454|12657->7506|12687->7507|12730->7521|12760->7522|13314->8047|13344->8048|13386->8061|13432->8078|13462->8079|13506->8094|13624->8183|13654->8184|13696->8197|13845->8317|13875->8318|13939->8353|13969->8354|14011->8367|14110->8437|14140->8438|14177->8447|14207->8448|14248->8539|14286->8576|14324->8592|14359->8599|14388->8600|14424->8608|14492->8647|14522->8648|14559->8657|14787->8856|14817->8857|14859->8870|14972->8955|15002->8956|15049->8974|15079->8975|15121->8988|15184->9023|15200->9029|15248->9055|15478->9256|15508->9257|15554->9274|15629->9320|15659->9321|15709->9342|15887->9491|15917->9492|15963->9509|16013->9530|16043->9531|16093->9552|16221->9651|16251->9652|16294->9666|16324->9667|16390->9704|16420->9705|16466->9722|16571->9798|16601->9799|16638->9808|16668->9809|16709->9900|16747->9937|16785->9953|16818->9958|16847->9959|16892->9976|16951->10007|16980->10008|17017->10017|17150->10122|17180->10123|17223->10137|17337->10223|17367->10224|17401->10230|17430->10231|17466->10239|17619->10364|17648->10365|17685->10374|17724->10384|17754->10385|17797->10399|17959->10533|17989->10534|18035->10551|18065->10552|18107->10565|18168->10598|18184->10604|18239->10637|18487->10856|18517->10857|18563->10874|18612->10894|18642->10895|18704->10928|18836->11031|18866->11032|18918->11055|18984->11092|19014->11093|19082->11132|19112->11133|19158->11150|19208->11171|19238->11172|19288->11193|19354->11230|19384->11231|19426->11244|19456->11245|19522->11282|19552->11283|19598->11300|19654->11327|19684->11328|19721->11337|19751->11338|19786->11345|19815->11346|19849->11352|19910->11385|19939->11386|19976->11395|20015->11405|20045->11406|20088->11420|20184->11488|20214->11489|20260->11506|20290->11507|20332->11520|20393->11553|20409->11559|20467->11595|20715->11814|20745->11815|20791->11832|20840->11852|20870->11853|20939->11893|21130->12055|21160->12056|21212->12079|21278->12116|21308->12117|21382->12162|21412->12163|21458->12180|21508->12201|21538->12202|21588->12223|21696->12302|21726->12303|21768->12316|21798->12317|21864->12354|21894->12355|21940->12372|21996->12399|22026->12400|22063->12409|22093->12410|22128->12417|22157->12418|22194->12427|22252->12456|22282->12457|22319->12466|22383->12501|22413->12502|22455->12515|22528->12559|22558->12560|22602->12575|22747->12691|22777->12692|22827->12713|23069->12926|23099->12927|23149->12948|23179->12949|23227->12968|23436->13148|23466->13149|23517->13171|23583->13208|23613->13209|23661->13228|23723->13261|23753->13262|23795->13275|23825->13276|23866->13288|23896->13289|23934->13299|23963->13300|24240->13548|24270->13549|24303->13554|24366->13589|24395->13590|24425->13592|24459->13598|24488->13599|24521->13604|24576->13631|24605->13632|24635->13634|24671->13642|24701->13643|24734->13648|24819->13705|24848->13706|24878->13708|24913->13715|24942->13716|24975->13721|25031->13749|25060->13750|25089->13751|25149->13784|25179->13792|25295->13880|25309->13884|25392->13945|25436->13960|26400->14896|26416->14902|26472->14935|27772->16341|27804->16357|27840->16377|27878->16486|27914->16506|27950->16526|27999->16546|29110->17656|29187->17790|29263->17863|29343->17937|29427->18021|29516->18166|29604->18232|29688->18299|29768->18360|29848->18434|29932->18518|30021->18645|30109->18710|30193->18777|30273->18838|30349->18895|30421->18948|30498->18996|36549->25020|36579->25028|36610->25031
                  LINES: 32->4|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|59->31|59->31|60->32|63->35|63->35|64->36|64->36|64->36|65->37|66->38|66->38|67->39|67->39|71->43|71->43|73->45|73->45|74->46|75->47|75->47|76->48|77->49|77->49|78->50|78->50|79->51|80->52|80->52|80->52|85->57|85->57|86->58|87->59|87->59|88->60|95->67|95->67|96->68|97->69|97->69|98->70|98->70|99->71|100->72|100->72|103->75|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|111->83|114->86|114->86|115->87|116->88|116->88|117->89|117->89|118->90|120->92|120->92|123->95|125->97|125->97|127->99|127->99|128->100|131->103|131->103|132->104|132->104|135->107|135->107|136->108|136->108|137->109|137->109|138->110|140->112|140->112|141->113|141->113|143->115|144->116|145->117|146->118|146->118|148->120|148->120|148->120|149->121|152->124|152->124|154->126|155->127|155->127|156->128|163->135|163->135|164->136|171->143|171->143|172->144|172->144|172->144|173->145|178->150|178->150|179->151|180->152|180->152|182->154|182->154|182->154|183->155|188->160|188->160|189->161|193->165|193->165|194->166|194->166|195->167|196->168|196->168|196->168|201->173|201->173|202->174|204->176|204->176|205->177|205->177|205->177|205->177|205->177|213->185|213->185|214->186|215->187|215->187|216->188|218->190|218->190|219->191|222->194|222->194|223->195|223->195|224->196|226->198|226->198|227->199|227->199|229->201|230->202|231->203|232->204|232->204|234->206|236->208|236->208|237->209|242->214|242->214|243->215|245->217|245->217|247->219|247->219|248->220|249->221|249->221|249->221|254->226|254->226|255->227|256->228|256->228|257->229|261->233|261->233|262->234|263->235|263->235|264->236|266->238|266->238|268->240|268->240|269->241|269->241|270->242|272->244|272->244|273->245|273->245|275->247|276->248|277->249|278->250|278->250|281->253|282->254|282->254|283->255|285->257|285->257|286->258|289->261|289->261|291->263|291->263|295->267|297->269|297->269|298->270|298->270|298->270|300->272|302->274|302->274|303->275|303->275|304->276|305->277|305->277|305->277|311->283|311->283|312->284|312->284|312->284|313->285|314->286|314->286|315->287|316->288|316->288|318->290|318->290|319->291|320->292|320->292|321->293|322->294|322->294|323->295|323->295|324->296|324->296|325->297|326->298|326->298|327->299|327->299|328->300|328->300|330->302|331->303|331->303|332->304|332->304|332->304|334->306|335->307|335->307|336->308|336->308|337->309|338->310|338->310|338->310|344->316|344->316|345->317|345->317|345->317|347->319|348->320|348->320|349->321|350->322|350->322|352->324|352->324|353->325|354->326|354->326|355->327|356->328|356->328|357->329|357->329|358->330|358->330|359->331|360->332|360->332|361->333|361->333|362->334|362->334|363->335|363->335|363->335|364->336|364->336|364->336|365->337|365->337|365->337|366->338|367->339|367->339|368->340|371->343|371->343|372->344|372->344|373->345|375->347|375->347|376->348|377->349|377->349|378->350|379->351|379->351|380->352|380->352|381->353|381->353|382->354|382->354|396->368|396->368|397->369|399->371|399->371|401->373|401->373|401->373|402->374|404->376|404->376|406->378|406->378|406->378|407->379|410->382|410->382|412->384|412->384|412->384|413->385|415->387|415->387|416->388|419->391|419->391|423->395|423->395|423->395|424->396|444->416|444->416|444->416|477->449|478->450|479->451|481->453|482->454|483->455|485->457|504->476|505->477|506->478|507->479|508->480|509->481|510->482|511->483|512->484|513->485|514->486|515->487|516->488|517->489|518->490|519->491|520->492|522->494|630->602|630->602|631->603
                  -- GENERATED --
              */
          