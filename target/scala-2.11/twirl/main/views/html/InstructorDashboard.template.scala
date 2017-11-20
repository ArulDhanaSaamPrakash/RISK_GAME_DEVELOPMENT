
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
              var appendquery = "<tr><td class='gameid-class'>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>Join</a></td></tr>";
              //$('#grid-basic tr:last').after(appendquery);
              //$('#grid-basic').find(tbody).append(appendquery);
              $("#grid-basic tbody").append(appendquery);
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""

            """),format.raw/*63.13*/("""$("#grid-basic").bootgrid("""),format.raw/*63.39*/("""{"""),format.raw/*63.40*/("""
              """),format.raw/*64.15*/("""formatters: """),format.raw/*64.27*/("""{"""),format.raw/*64.28*/("""
                """),format.raw/*65.17*/(""""link": function(column, row)
                """),format.raw/*66.17*/("""{"""),format.raw/*66.18*/("""
                  """),format.raw/*67.19*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";
                  return "<a href=\"#\" onclick='redirectFromHere(\"" + row.gameid + "\")'>" + "View" + "</a>";
                """),format.raw/*69.17*/("""}"""),format.raw/*69.18*/("""
              """),format.raw/*70.15*/("""}"""),format.raw/*70.16*/(""",
              rowCount: [5,10,-1],
              columnSelection: false
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/(""");
          """),format.raw/*74.11*/("""}"""),format.raw/*74.12*/(""",
          error : function(data) """),format.raw/*75.34*/("""{"""),format.raw/*75.35*/("""
            """),format.raw/*76.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*78.11*/("""}"""),format.raw/*78.12*/("""
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""");

        """),format.raw/*81.88*/("""
        """),format.raw/*82.37*/("""
        """),format.raw/*83.16*/("""
      """),format.raw/*84.7*/("""}"""),format.raw/*84.8*/("""

      """),format.raw/*86.7*/("""function redirectFromHere(gameid) """),format.raw/*86.41*/("""{"""),format.raw/*86.42*/("""
        """),format.raw/*87.9*/("""$('#gameid').val(gameid);

        $('#frmInstructor').submit();
      """),format.raw/*90.7*/("""}"""),format.raw/*90.8*/("""

      """),format.raw/*92.7*/("""function Showmodel(gameid,status,istimebound)
      """),format.raw/*93.7*/("""{"""),format.raw/*93.8*/("""
        """),format.raw/*94.9*/("""// alert(gameid + status + istimebound);
        // gameid
        $( "#mgameid" ).val(gameid);
        $("#mgameid").prop("readonly", true);

        $("#errorspan2").html("");
        $('#wybierz1').hide();
        if(status == "RUNNING") """),format.raw/*101.33*/("""{"""),format.raw/*101.34*/("""
          """),format.raw/*102.11*/("""$("#isobserver").val('1');
          $("#isobserver").hide();
          $("#labelforobserver").hide();

          // $("#labelforobserver").text("You can only join this game as observer");
          $("#myModalLabel2").text("You can only join this game as observer");
          //  myModalLabel2
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""
        """),format.raw/*110.9*/("""else """),format.raw/*110.14*/("""{"""),format.raw/*110.15*/("""
          """),format.raw/*111.11*/("""$("#isobserver").show();
          $("#isobserver").val('0');
          $("#labelforobserver").show();
          $("#labelforobserver").text("Do you want to join as observer:");
          $("#myModalLabel2").text("JOIN GAME AS PLAYER OR OBSERVER");
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/("""
        """),format.raw/*117.9*/("""$('#myModal2').modal('show');
      """),format.raw/*118.7*/("""}"""),format.raw/*118.8*/("""

      """),format.raw/*120.7*/("""function hostgame() """),format.raw/*120.27*/("""{"""),format.raw/*120.28*/("""
        """),format.raw/*121.9*/("""// debugger;
        //  var istimebound = $('input[name=TimeBound]:checked').val();
        var timeforstep = $( "#selecttime" ).val();
        var noofsteps = $( "#selectsteps" ).val();

        var obj = """),format.raw/*126.19*/("""{"""),format.raw/*126.20*/("""
          """),format.raw/*127.11*/("""'istimebound': true,
          // 'istimebound': istimebound == "1" ? true : false,
          'timeforeachmove': timeforstep,
          'stepsforeachplayer': noofsteps
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/(""";
        $.ajax("""),format.raw/*132.16*/("""{"""),format.raw/*132.17*/("""
          """),format.raw/*133.11*/("""type : 'POST',
          url : '"""),_display_(/*134.19*/routes/*134.25*/.GameController.hostGame()),format.raw/*134.51*/("""',
          // data : JSON.stringify(obj),
          data: JSON.stringify(obj),
          dataType: 'json',
          contentType : 'application/json',
          success : function(data) """),format.raw/*139.36*/("""{"""),format.raw/*139.37*/("""
            """),format.raw/*140.13*/("""debugger;
            if(data.message == "success")
            """),format.raw/*142.13*/("""{"""),format.raw/*142.14*/("""
              """),format.raw/*143.15*/("""//  var $form=$(document.createElement('form')).css("""),format.raw/*143.67*/("""{"""),format.raw/*143.68*/("""display:'none'"""),format.raw/*143.82*/("""}"""),format.raw/*143.83*/(""").attr("method","POST").attr("action","/hostgame");
              // var $input=$(document.createElement('input')).attr('name','FIRST NAME HERE').val("FIRST VALUE HERE");
              // var $input2=$(document.createElemet('input')).attr('name','SECOND NAME HERE').val("SECOND VALUE HERE");
              //  $form.append($input).append($input2);
              // $("body").append($form);
              //  $form.submit();
              $("#hgameid").val(data.gameid);
              $("#hostgameform").submit();
            """),format.raw/*151.13*/("""}"""),format.raw/*151.14*/("""
            """),format.raw/*152.13*/("""else
            """),format.raw/*153.13*/("""{"""),format.raw/*153.14*/("""
              """),format.raw/*154.15*/("""//  alert(data.errormsg);
              $("#errorspan").html(data.errormsg);
            """),format.raw/*156.13*/("""}"""),format.raw/*156.14*/("""
            """),format.raw/*157.13*/("""// $.('#id').val(data);
            //setError('Call succedded');
            //$('#test1').attr("src", data)
          """),format.raw/*160.11*/("""}"""),format.raw/*160.12*/(""",
          error : function(data) """),format.raw/*161.34*/("""{"""),format.raw/*161.35*/("""
            """),format.raw/*162.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*164.11*/("""}"""),format.raw/*164.12*/("""
        """),format.raw/*165.9*/("""}"""),format.raw/*165.10*/(""");

        """),format.raw/*167.88*/("""
        """),format.raw/*168.37*/("""
        """),format.raw/*169.16*/("""
      """),format.raw/*170.7*/("""}"""),format.raw/*170.8*/("""

      """),format.raw/*172.7*/("""var observer;

      function joingame() """),format.raw/*174.27*/("""{"""),format.raw/*174.28*/("""
        """),format.raw/*175.9*/("""// debugger;var gameid = $('input[name=TimeBound]:checked').val();
        //debugger;
        var gameid = $( "#mgameid" ).val();
        var isobserver = $("#isobserver").val();

        var obj = """),format.raw/*180.19*/("""{"""),format.raw/*180.20*/("""
          """),format.raw/*181.11*/("""'gameid': gameid,
          'isobserver': isobserver == "1" ? true : false
        """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/(""";

        $.ajax("""),format.raw/*185.16*/("""{"""),format.raw/*185.17*/("""
          """),format.raw/*186.11*/("""type : 'POST',
          url : '"""),_display_(/*187.19*/routes/*187.25*/.GameController.joinGame()),format.raw/*187.51*/("""',
          // data : JSON.stringify(obj),
          data: JSON.stringify(obj),
          // dataType: 'json',
          contentType : 'application/json',
          success : function(data) """),format.raw/*192.36*/("""{"""),format.raw/*192.37*/("""
            """),format.raw/*193.13*/("""if(data.message == "success")
            """),format.raw/*194.13*/("""{"""),format.raw/*194.14*/("""
              """),format.raw/*195.15*/("""$("#jgameid").val(gameid);
              $('#hdn_observer').val(isobserver);
              $("#joingameform").submit();

            """),format.raw/*199.13*/("""}"""),format.raw/*199.14*/("""
            """),format.raw/*200.13*/("""else
            """),format.raw/*201.13*/("""{"""),format.raw/*201.14*/("""
              """),format.raw/*202.15*/("""// alert(data.errormsg);
              $("#errorspan2").html(data.errormsg);
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/("""

          """),format.raw/*206.11*/("""}"""),format.raw/*206.12*/(""",
          error : function(data) """),format.raw/*207.34*/("""{"""),format.raw/*207.35*/("""
            """),format.raw/*208.13*/("""alert("error");
            //setError('Make call failed');
          """),format.raw/*210.11*/("""}"""),format.raw/*210.12*/("""
        """),format.raw/*211.9*/("""}"""),format.raw/*211.10*/(""");

        """),format.raw/*213.88*/("""
        """),format.raw/*214.37*/("""
        """),format.raw/*215.16*/("""
      """),format.raw/*216.7*/("""}"""),format.raw/*216.8*/("""

       
       """),format.raw/*219.8*/("""function validateForm()
       """),format.raw/*220.8*/("""{"""),format.raw/*220.9*/("""
        """),format.raw/*221.9*/("""var a=document.forms["GameReportForm"]["exportReportInput"].value;
        if (a==null || a=="")
        """),format.raw/*223.9*/("""{"""),format.raw/*223.10*/("""
             """),format.raw/*224.14*/("""alert("Please enter a valid gameID");
             return false;
            
        """),format.raw/*227.9*/("""}"""),format.raw/*227.10*/("""

    """),format.raw/*229.5*/("""}"""),format.raw/*229.6*/("""
    
  """),format.raw/*231.3*/("""</script>

  </head>
  <body>
    """),_display_(/*235.6*/header()),format.raw/*235.14*/("""<br>
  <div class="row">
    <div class="col-md-12">
      <h3>
               Welcome """),_display_(/*239.25*/Http/*239.29*/.Context.current().args.get("firstname").asInstanceOf[String]),format.raw/*239.90*/("""
              """),format.raw/*240.15*/("""</h3>
    <form name="GameReportForm" method="GET" onsubmit="return validateForm()" action="/exportReports">
      <label>Game Statistics Report </label> <br>
      <input type="text" id="exportReportInput" name="exportReportInput" placeholder="Enter gameID">
      <input type="submit" name="Export" value="Export" style="height: 30px; width: 100px;">
  </form>
  
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
      """),format.raw/*261.143*/("""
  """),format.raw/*262.16*/("""
      """),format.raw/*263.20*/("""

      """),format.raw/*265.108*/("""
      """),format.raw/*266.20*/("""
      """),format.raw/*267.20*/("""

        """),format.raw/*269.9*/("""<!-- Host Game Modal -->
      <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
              <h4 class="modal-title" id="myModalLabel">HOST GAME</h4>
            </div>
            <div class="modal-body">
              <span style="color:red;" id="errorspan" ></span>
              <form class="form-horizontal">
                <fieldset>

                    <!-- Form Name -->
                  <legend>Game Settings</legend>

                    <!-- Multiple Radios -->
                    """),format.raw/*286.49*/("""
                    """),format.raw/*287.108*/("""
                    """),format.raw/*288.47*/("""
                    """),format.raw/*289.44*/("""
                    """),format.raw/*290.50*/("""
                    """),format.raw/*291.107*/("""
                    """),format.raw/*292.28*/("""
                    """),format.raw/*293.33*/("""
                    """),format.raw/*294.31*/("""
                    """),format.raw/*295.44*/("""
                    """),format.raw/*296.50*/("""
                    """),format.raw/*297.89*/("""
                    """),format.raw/*298.27*/("""
                    """),format.raw/*299.33*/("""
                    """),format.raw/*300.31*/("""
                    """),format.raw/*301.31*/("""
                    """),format.raw/*302.31*/("""

                    """),format.raw/*304.21*/("""<!-- Select Basic -->
                  <div class="form-group">
                    <label class="col-md-4 control-label" for="selecttime">Time for each step(in mins):</label>
                    <div class="col-md-4">
                      <select id="selecttime" name="selecttime" class="form-control">
                        <option value="1">1</option>
                        <option selected value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="5">10</option>
                      </select>
                    </div>
                  </div>

                    <!-- Select Basic -->
                  <div class="form-group">
                    <label class="col-md-4 control-label" for="selectsteps">No. of project steps:</label>
                    <div class="col-md-4">
                      <select id="selectsteps" name="selectsteps" class="form-control">
                        <option value="5">5</option>
                        <option value="10">10</option>
                        <option value="15">15</option>
                        <option selected value="20">20</option>
                        <option value="25">25</option>
                        <option value="30">30</option>
                        <option value="20">50</option>
                        <option value="25">100</option>
                        <option value="30">500</option>
                      </select>
                    </div>
                  </div>

                </fieldset>
              </form>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              <button type="button" class="btn btn-primary" onclick = "hostgame()" >Host Game</button>
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
                <label class="col-md-6 control-label" id="labelforobserver" for="selecttime">Do you want to join as observer:</label>

                <select id="isobserver" name="isobserver" class="form-control">
                  <option value="1">Yes</option>
                  <option value="0">No</option>
                </select>

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
          </tr>
        </thead>
        <tbody>



          </tbody>
      </table>
    </div>
  </div>
    """),_display_(/*407.6*/footer()),format.raw/*407.14*/("""
  """),format.raw/*408.3*/("""</body>
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
                  DATE: Thu Nov 09 13:59:56 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/InstructorDashboard.scala.html
                  HASH: dbe70a1e1a2ce640bf5a93008616706d555e3740
                  MATRIX: 885->37|1444->569|1459->575|1514->609|1596->664|1611->670|1667->705|1749->760|1764->766|1830->810|1912->865|1927->871|1988->911|2070->966|2085->972|2152->1017|2367->1205|2382->1211|2446->1254|2526->1307|2541->1313|2598->1349|2678->1402|2693->1408|2764->1458|2844->1511|2859->1517|2924->1561|3236->1845|3265->1846|3301->1855|3394->1921|3422->1922|3487->1959|3516->1960|3552->1969|3610->1999|3639->2000|3678->2011|3730->2036|3759->2037|3804->2054|3833->2055|3872->2066|3932->2099|3947->2105|4005->2142|4210->2319|4239->2320|4280->2333|4378->2403|4407->2404|4450->2419|5137->3078|5166->3079|5208->3093|5262->3119|5291->3120|5334->3135|5374->3147|5403->3148|5448->3165|5522->3211|5551->3212|5598->3231|5858->3463|5887->3464|5930->3479|5959->3480|6073->3566|6102->3567|6143->3580|6172->3581|6235->3616|6264->3617|6305->3630|6403->3700|6432->3701|6468->3710|6497->3711|6537->3802|6574->3839|6611->3855|6645->3862|6673->3863|6708->3871|6770->3905|6799->3906|6835->3915|6933->3986|6961->3987|6996->3995|7075->4047|7103->4048|7139->4057|7409->4298|7439->4299|7479->4310|7811->4614|7841->4615|7878->4624|7912->4629|7942->4630|7982->4641|8267->4898|8297->4899|8334->4908|8398->4944|8427->4945|8463->4953|8512->4973|8542->4974|8579->4983|8815->5190|8845->5191|8885->5202|9089->5378|9119->5379|9165->5396|9195->5397|9235->5408|9296->5441|9312->5447|9360->5473|9577->5661|9607->5662|9649->5675|9742->5739|9772->5740|9816->5755|9897->5807|9927->5808|9970->5822|10000->5823|10554->6348|10584->6349|10626->6362|10672->6379|10702->6380|10746->6395|10864->6484|10894->6485|10936->6498|11085->6618|11115->6619|11179->6654|11209->6655|11251->6668|11350->6738|11380->6739|11417->6748|11447->6749|11488->6840|11526->6877|11564->6893|11599->6900|11628->6901|11664->6909|11734->6950|11764->6951|11801->6960|12029->7159|12059->7160|12099->7171|12210->7254|12240->7255|12287->7273|12317->7274|12357->7285|12418->7318|12434->7324|12482->7350|12702->7541|12732->7542|12774->7555|12845->7597|12875->7598|12919->7613|13081->7746|13111->7747|13153->7760|13199->7777|13229->7778|13273->7793|13391->7882|13421->7883|13462->7895|13492->7896|13556->7931|13586->7932|13628->7945|13727->8015|13757->8016|13794->8025|13824->8026|13865->8117|13903->8154|13941->8170|13976->8177|14005->8178|14050->8195|14109->8226|14138->8227|14175->8236|14308->8341|14338->8342|14381->8356|14495->8442|14525->8443|14559->8449|14588->8450|14624->8458|14686->8493|14716->8501|14832->8589|14846->8593|14929->8654|14973->8669|16082->9884|16114->9900|16150->9920|16188->10029|16224->10049|16260->10069|16298->10079|17139->10919|17190->11027|17240->11074|17290->11118|17340->11168|17391->11275|17441->11303|17491->11336|17541->11367|17591->11411|17641->11461|17691->11550|17741->11577|17791->11610|17841->11641|17891->11672|17941->11703|17992->11725|22273->15979|22303->15987|22334->15990
                  LINES: 32->4|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|59->31|59->31|60->32|63->35|63->35|65->37|65->37|66->38|67->39|67->39|68->40|69->41|69->41|70->42|70->42|71->43|72->44|72->44|72->44|77->49|77->49|78->50|79->51|79->51|80->52|89->61|89->61|91->63|91->63|91->63|92->64|92->64|92->64|93->65|94->66|94->66|95->67|97->69|97->69|98->70|98->70|101->73|101->73|102->74|102->74|103->75|103->75|104->76|106->78|106->78|107->79|107->79|109->81|110->82|111->83|112->84|112->84|114->86|114->86|114->86|115->87|118->90|118->90|120->92|121->93|121->93|122->94|129->101|129->101|130->102|137->109|137->109|138->110|138->110|138->110|139->111|144->116|144->116|145->117|146->118|146->118|148->120|148->120|148->120|149->121|154->126|154->126|155->127|159->131|159->131|160->132|160->132|161->133|162->134|162->134|162->134|167->139|167->139|168->140|170->142|170->142|171->143|171->143|171->143|171->143|171->143|179->151|179->151|180->152|181->153|181->153|182->154|184->156|184->156|185->157|188->160|188->160|189->161|189->161|190->162|192->164|192->164|193->165|193->165|195->167|196->168|197->169|198->170|198->170|200->172|202->174|202->174|203->175|208->180|208->180|209->181|211->183|211->183|213->185|213->185|214->186|215->187|215->187|215->187|220->192|220->192|221->193|222->194|222->194|223->195|227->199|227->199|228->200|229->201|229->201|230->202|232->204|232->204|234->206|234->206|235->207|235->207|236->208|238->210|238->210|239->211|239->211|241->213|242->214|243->215|244->216|244->216|247->219|248->220|248->220|249->221|251->223|251->223|252->224|255->227|255->227|257->229|257->229|259->231|263->235|263->235|267->239|267->239|267->239|268->240|289->261|290->262|291->263|293->265|294->266|295->267|297->269|314->286|315->287|316->288|317->289|318->290|319->291|320->292|321->293|322->294|323->295|324->296|325->297|326->298|327->299|328->300|329->301|330->302|332->304|435->407|435->407|436->408
                  -- GENERATED --
              */
          