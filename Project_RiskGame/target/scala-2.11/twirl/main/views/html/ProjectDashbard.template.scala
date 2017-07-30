
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ProjectDashbard_Scope0 {
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

class ProjectDashbard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.53*/routes/*15.59*/.Assets.at("stylesheets/demo.css")),format.raw/*15.93*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*16.53*/routes/*16.59*/.Assets.at("stylesheets/style.css")),format.raw/*16.94*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.53*/routes/*17.59*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*17.103*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.53*/routes/*18.59*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*18.99*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*19.53*/routes/*19.59*/.Assets.at("stylesheets/jquery.bootgrid.css")),format.raw/*19.104*/("""" />
      <script   src="http://code.jquery.com/jquery-3.1.1.min.js"   integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="   crossorigin="anonymous"></script>
      <script src=""""),_display_(/*21.21*/routes/*21.27*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*21.70*/("""" type="text/javascript"></script>
      <script src=""""),_display_(/*22.21*/routes/*22.27*/.Assets.at("javascripts/loading.js")),format.raw/*22.63*/("""" type="text/javascript"></script>
      <script src=""""),_display_(/*23.21*/routes/*23.27*/.Assets.at("javascripts/jquery.bootgrid.fa.js.js")),format.raw/*23.77*/("""" type="text/javascript"></script>
      <script src=""""),_display_(/*24.21*/routes/*24.27*/.Assets.at("javascripts/jquery.bootgrid.js")),format.raw/*24.71*/("""" type="text/javascript"></script>
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


  <script>

      $(document).ready(function()"""),format.raw/*31.35*/("""{"""),format.raw/*31.36*/("""
         """),format.raw/*32.10*/("""// $("#grid-basic").bootgrid();
          showActiveGames();

      """),format.raw/*35.7*/("""}"""),format.raw/*35.8*/(""");

      function showActiveGames() """),format.raw/*37.34*/("""{"""),format.raw/*37.35*/("""
          """),format.raw/*38.11*/("""//debugger;
          var obj = """),format.raw/*39.21*/("""{"""),format.raw/*39.22*/("""
              """),format.raw/*40.15*/("""'phaseId': "tst"
          """),format.raw/*41.11*/("""}"""),format.raw/*41.12*/(""";
          $.ajax("""),format.raw/*42.18*/("""{"""),format.raw/*42.19*/("""
              """),format.raw/*43.15*/("""type : 'POST',
              url : '"""),_display_(/*44.23*/routes/*44.29*/.DashboardController.activeGames()),format.raw/*44.63*/("""',
              //data : JSON.stringify("test"),
              //data: "",
              dataType: 'json',
              //contentType : 'application/json',
              success : function(data) """),format.raw/*49.40*/("""{"""),format.raw/*49.41*/("""
                  """),format.raw/*50.19*/("""//alert(data.length);
                  for (i = 0; i < data.length; i++) """),format.raw/*51.53*/("""{"""),format.raw/*51.54*/("""
                      """),format.raw/*52.23*/("""//data[i].timebound
                      var obj = data[i];
                      //obj.istimebound = "Yes";
                      obj.istimebound = obj.istimebound == "1" ? "Yes" : "No";
                     // $('#myTable').append('<tr><td>my data</td><td>more data</td></tr>');
                      var appendquery = "<tr><td>" + obj.gameid + "</td> <td>" + obj.status + "</td> <td>" + obj.gametime + "</td> <td>" + obj.fullName + "</td> <td><a href='#'>Join</a></td></tr>";
                      //$('#grid-basic tr:last').after(appendquery);
                      //$('#grid-basic').find(tbody).append(appendquery);
                      $("#grid-basic tbody").append(appendquery);
                  """),format.raw/*61.19*/("""}"""),format.raw/*61.20*/("""

                  """),format.raw/*63.19*/("""$("#grid-basic").bootgrid("""),format.raw/*63.45*/("""{"""),format.raw/*63.46*/("""
                      """),format.raw/*64.23*/("""formatters: """),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""
                          """),format.raw/*65.27*/(""""link": function(column, row)
                          """),format.raw/*66.27*/("""{"""),format.raw/*66.28*/("""
                              """),format.raw/*67.31*/("""// return "<a href=\"javascript:Showmodel(" + row.gameid + ");\">" + "Join" ": " + row.gameid + "</a>";
                              return "<a href=\"#\" onclick='Showmodel(\"" + row.gameid + "\",\"" + row.status + "\",\"" + row.istimebound + "\")'>" + "Join" + "</a>";
                          """),format.raw/*69.27*/("""}"""),format.raw/*69.28*/("""
                      """),format.raw/*70.23*/("""}"""),format.raw/*70.24*/(""",
                      rowCount: [5,10,-1],
                      columnSelection: false
                  """),format.raw/*73.19*/("""}"""),format.raw/*73.20*/(""");
              """),format.raw/*74.15*/("""}"""),format.raw/*74.16*/(""",
              error : function(data) """),format.raw/*75.38*/("""{"""),format.raw/*75.39*/("""
                  """),format.raw/*76.19*/("""alert("error");
                  //setError('Make call failed');
              """),format.raw/*78.15*/("""}"""),format.raw/*78.16*/("""
          """),format.raw/*79.11*/("""}"""),format.raw/*79.12*/(""");

          """),format.raw/*81.90*/("""
          """),format.raw/*82.39*/("""
          """),format.raw/*83.18*/("""
      """),format.raw/*84.7*/("""}"""),format.raw/*84.8*/("""

      """),format.raw/*86.7*/("""function Showmodel(gameid,status,istimebound)
      """),format.raw/*87.7*/("""{"""),format.raw/*87.8*/("""
         """),format.raw/*88.10*/("""// alert(gameid + status + istimebound);
         // gameid
          $( "#mgameid" ).val(gameid);
          $("#mgameid").prop("readonly", true);

          $("#errorspan2").html("");
          $('#wybierz1').hide();
          if(status == "RUNNING") """),format.raw/*95.35*/("""{"""),format.raw/*95.36*/("""
              """),format.raw/*96.15*/("""$("#isobserver").val('1');
              $("#isobserver").hide();
              $("#labelforobserver").hide();

             // $("#labelforobserver").text("You can only join this game as observer");
              $("#myModalLabel2").text("You can only join this game as observer");
            //  myModalLabel2
          """),format.raw/*103.11*/("""}"""),format.raw/*103.12*/("""
          """),format.raw/*104.11*/("""else """),format.raw/*104.16*/("""{"""),format.raw/*104.17*/("""
              """),format.raw/*105.15*/("""$("#isobserver").show();
              $("#isobserver").val('0');
              $("#labelforobserver").show();
              $("#labelforobserver").text("Do you want to join as observer:");
              $("#myModalLabel2").text("JOIN GAME AS PLAYER OR OBSERVER");
          """),format.raw/*110.11*/("""}"""),format.raw/*110.12*/("""
          """),format.raw/*111.11*/("""$('#myModal2').modal('show');
      """),format.raw/*112.7*/("""}"""),format.raw/*112.8*/("""

    """),format.raw/*114.5*/("""function hostgame() """),format.raw/*114.25*/("""{"""),format.raw/*114.26*/("""
       """),format.raw/*115.8*/("""// debugger;
      //  var istimebound = $('input[name=TimeBound]:checked').val();
        var timeforstep = $( "#selecttime" ).val();
        var noofsteps = $( "#selectsteps" ).val();

        var obj = """),format.raw/*120.19*/("""{"""),format.raw/*120.20*/("""
            """),format.raw/*121.13*/("""'istimebound': true,
           // 'istimebound': istimebound == "1" ? true : false,
            'timeforeachmove': timeforstep,
            'stepsforeachplayer': noofsteps
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/(""";
        $.ajax("""),format.raw/*126.16*/("""{"""),format.raw/*126.17*/("""
            """),format.raw/*127.13*/("""type : 'POST',
            url : '"""),_display_(/*128.21*/routes/*128.27*/.GameController.hostGame()),format.raw/*128.53*/("""',
           // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
           dataType: 'json',
            contentType : 'application/json',
            success : function(data) """),format.raw/*133.38*/("""{"""),format.raw/*133.39*/("""
                """),format.raw/*134.17*/("""debugger;
                if(data.message == "success")
                """),format.raw/*136.17*/("""{"""),format.raw/*136.18*/("""
                  """),format.raw/*137.19*/("""//  var $form=$(document.createElement('form')).css("""),format.raw/*137.71*/("""{"""),format.raw/*137.72*/("""display:'none'"""),format.raw/*137.86*/("""}"""),format.raw/*137.87*/(""").attr("method","POST").attr("action","/hostgame");
                   // var $input=$(document.createElement('input')).attr('name','FIRST NAME HERE').val("FIRST VALUE HERE");
                   // var $input2=$(document.createElemet('input')).attr('name','SECOND NAME HERE').val("SECOND VALUE HERE");
                  //  $form.append($input).append($input2);
                   // $("body").append($form);
                  //  $form.submit();
                    $("#hgameid").val(data.gameid);
                    $("#hostgameform").submit();
                """),format.raw/*145.17*/("""}"""),format.raw/*145.18*/("""
                """),format.raw/*146.17*/("""else
                """),format.raw/*147.17*/("""{"""),format.raw/*147.18*/("""
                  """),format.raw/*148.19*/("""//  alert(data.errormsg);
                    $("#errorspan").html(data.errormsg);
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/("""
               """),format.raw/*151.16*/("""// $.('#id').val(data);
                //setError('Call succedded');
                //$('#test1').attr("src", data)
            """),format.raw/*154.13*/("""}"""),format.raw/*154.14*/(""",
            error : function(data) """),format.raw/*155.36*/("""{"""),format.raw/*155.37*/("""
                """),format.raw/*156.17*/("""alert("error");
                //setError('Make call failed');
            """),format.raw/*158.13*/("""}"""),format.raw/*158.14*/("""
        """),format.raw/*159.9*/("""}"""),format.raw/*159.10*/(""");

        """),format.raw/*161.88*/("""
            """),format.raw/*162.41*/("""
        """),format.raw/*163.16*/("""
    """),format.raw/*164.5*/("""}"""),format.raw/*164.6*/("""

    """),format.raw/*166.5*/("""var observer;

    function joingame() """),format.raw/*168.25*/("""{"""),format.raw/*168.26*/("""
        """),format.raw/*169.9*/("""// debugger;var gameid = $('input[name=TimeBound]:checked').val();
        //debugger;
        var gameid = $( "#mgameid" ).val();
        var isobserver = $("#isobserver").val();

        var obj = """),format.raw/*174.19*/("""{"""),format.raw/*174.20*/("""
            """),format.raw/*175.13*/("""'gameid': gameid,
            'isobserver': isobserver == "1" ? true : false
        """),format.raw/*177.9*/("""}"""),format.raw/*177.10*/(""";

        $.ajax("""),format.raw/*179.16*/("""{"""),format.raw/*179.17*/("""
            """),format.raw/*180.13*/("""type : 'POST',
            url : '"""),_display_(/*181.21*/routes/*181.27*/.GameController.joinGame()),format.raw/*181.53*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            // dataType: 'json',
            contentType : 'application/json',
            success : function(data) """),format.raw/*186.38*/("""{"""),format.raw/*186.39*/("""
                """),format.raw/*187.17*/("""if(data.message == "success")
                """),format.raw/*188.17*/("""{"""),format.raw/*188.18*/("""
                    """),format.raw/*189.21*/("""$("#jgameid").val(gameid);
                    $('#hdn_observer').val(isobserver);
                    $("#joingameform").submit();

                """),format.raw/*193.17*/("""}"""),format.raw/*193.18*/("""
                """),format.raw/*194.17*/("""else
                """),format.raw/*195.17*/("""{"""),format.raw/*195.18*/("""
                    """),format.raw/*196.21*/("""// alert(data.errormsg);
                    $("#errorspan2").html(data.errormsg);
                """),format.raw/*198.17*/("""}"""),format.raw/*198.18*/("""

            """),format.raw/*200.13*/("""}"""),format.raw/*200.14*/(""",
            error : function(data) """),format.raw/*201.36*/("""{"""),format.raw/*201.37*/("""
                """),format.raw/*202.17*/("""alert("error");
                //setError('Make call failed');
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/("""
        """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/(""");

        """),format.raw/*207.88*/("""
        """),format.raw/*208.37*/("""
        """),format.raw/*209.16*/("""
    """),format.raw/*210.5*/("""}"""),format.raw/*210.6*/("""


  """),format.raw/*213.3*/("""</script>

  </head>
  <body>
      """),_display_(/*217.8*/header()),format.raw/*217.16*/("""<br>
      <div class="row">
          <div class="col-md-12">
              <div class="col-md-12">
                  <div class="col-md-6">
                      <h3>
               Welcome """),_display_(/*223.25*/Http/*223.29*/.Context.current().args.get("firstname").asInstanceOf[String]),format.raw/*223.90*/("""
              """),format.raw/*224.15*/("""</h3>
                  </div>
                  <div class="col-md-6" style="float: right">
                      <h3>
                          <a class="glyphicon glyphicon-info-sign" href="#" style="float:right;color: blue; text-decoration: underline;font-size: 18px !important;;" onclick="window.open('/assets/images/Players_manual.pdf', '_blank', 'toolbar=0,location=0,menubar=0');">Click here to read instructions!</a>
                      </h3>

                  </div>
              </div>



              <form style="display: hidden" action="/hostgame" method="POST" id="hostgameform">
                  <input type="hidden" id = "hgameid" name ="hgameid" value="0"  />
                  </form>
              <form style="display: hidden" action="/joingame" method="POST" id="joingameform">
                  <input type="hidden" id = "jgameid" name ="jgameid" value="0"  />
                  <input type="hidden" id = "hdn_observer" name ="hdn_observer" value="0" />
              </form>
                  <!-- Button trigger modal -->
              <div style="height: 90px;"></div>
              <button type="button" onclick="$('#errorspan').html('');"  class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Launch a new game
              </button>

              """),format.raw/*249.116*/("""
  """),format.raw/*250.16*/("""
              """),format.raw/*251.28*/("""

                  """),format.raw/*253.19*/("""<!-- Host Game Modal -->


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
                                          """),format.raw/*272.71*/("""
                                              """),format.raw/*273.134*/("""
                                              """),format.raw/*274.73*/("""
                                                  """),format.raw/*275.74*/("""
                                                      """),format.raw/*276.84*/("""
                                                          """),format.raw/*277.145*/("""
                                                          """),format.raw/*278.66*/("""
                                                      """),format.raw/*279.67*/("""
                                                  """),format.raw/*280.61*/("""
                                                  """),format.raw/*281.74*/("""
                                                      """),format.raw/*282.84*/("""
                                                          """),format.raw/*283.127*/("""
                                                          """),format.raw/*284.65*/("""
                                                      """),format.raw/*285.67*/("""
                                                  """),format.raw/*286.61*/("""
                                              """),format.raw/*287.57*/("""
                                          """),format.raw/*288.53*/("""

                                              """),format.raw/*290.47*/("""<!-- Select Basic -->
                                          <div class="form-group">
                                              <label class="col-md-5 control-label" for="selecttime">Time for each step(in mins):</label>
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
                                              <label class="col-md-5 control-label" for="selectsteps">No. of turns:</label>
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
                  <th data-column-id="gameid">Game ID</th>
                  <th data-column-id="status">Status</th>
                  <th data-column-id="gametime" data-order="desc">GameTime</th>
                  <th data-column-id="fullName" data-order="desc">Host Name</th>
                  <th data-column-id="joingamegrid" data-formatter="link" data-order="desc">Join Game</th>
              </tr>
          </thead>
          <tbody>



          </tbody>
      </table>
</div>
      </div>
      """),_display_(/*399.8*/footer()),format.raw/*399.16*/("""
"""),format.raw/*400.1*/("""</body>
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
object ProjectDashbard extends ProjectDashbard_Scope0.ProjectDashbard
              /*
                  -- GENERATED --
                  DATE: Sat Jul 29 22:13:32 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/ProjectDashbard.scala.html
                  HASH: 4876c02352d849f2d910f836049b2fae47f98a40
                  MATRIX: 877->37|1452->585|1467->591|1522->625|1606->682|1621->688|1677->723|1761->780|1776->786|1842->830|1926->887|1941->893|2002->933|2086->990|2101->996|2168->1041|2387->1233|2402->1239|2466->1282|2548->1337|2563->1343|2620->1379|2702->1434|2717->1440|2788->1490|2870->1545|2885->1551|2950->1595|3264->1881|3293->1882|3331->1892|3426->1960|3454->1961|3519->1998|3548->1999|3587->2010|3647->2042|3676->2043|3719->2058|3774->2085|3803->2086|3850->2105|3879->2106|3922->2121|3986->2158|4001->2164|4056->2198|4281->2395|4310->2396|4357->2415|4459->2489|4488->2490|4539->2513|5274->3220|5303->3221|5351->3241|5405->3267|5434->3268|5485->3291|5525->3303|5554->3304|5609->3331|5693->3387|5722->3388|5781->3419|6107->3717|6136->3718|6187->3741|6216->3742|6352->3850|6381->3851|6426->3868|6455->3869|6522->3908|6551->3909|6598->3928|6706->4008|6735->4009|6774->4020|6803->4021|6845->4114|6884->4153|6923->4171|6957->4178|6985->4179|7020->4187|7099->4239|7127->4240|7165->4250|7445->4502|7474->4503|7517->4518|7869->4841|7899->4842|7939->4853|7973->4858|8003->4859|8047->4874|8351->5149|8381->5150|8421->5161|8485->5197|8514->5198|8548->5204|8597->5224|8627->5225|8663->5233|8897->5438|8927->5439|8969->5452|9178->5633|9208->5634|9254->5651|9284->5652|9326->5665|9389->5700|9405->5706|9453->5732|9678->5928|9708->5929|9754->5946|9855->6018|9885->6019|9933->6038|10014->6090|10044->6091|10087->6105|10117->6106|10710->6670|10740->6671|10786->6688|10836->6709|10866->6710|10914->6729|11042->6828|11072->6829|11117->6845|11276->6975|11306->6976|11372->7013|11402->7014|11448->7031|11553->7107|11583->7108|11620->7117|11650->7118|11691->7209|11733->7250|11771->7266|11804->7271|11833->7272|11867->7278|11935->7317|11965->7318|12002->7327|12230->7526|12260->7527|12302->7540|12415->7625|12445->7626|12492->7644|12522->7645|12564->7658|12627->7693|12643->7699|12691->7725|12921->7926|12951->7927|12997->7944|13072->7990|13102->7991|13152->8012|13330->8161|13360->8162|13406->8179|13456->8200|13486->8201|13536->8222|13664->8321|13694->8322|13737->8336|13767->8337|13833->8374|13863->8375|13909->8392|14014->8468|14044->8469|14081->8478|14111->8479|14152->8570|14190->8607|14228->8623|14261->8628|14290->8629|14323->8634|14387->8671|14417->8679|14638->8872|14652->8876|14735->8937|14779->8952|16117->10361|16149->10377|16193->10405|16242->10425|17353->11535|17430->11669|17506->11742|17586->11816|17670->11900|17759->12045|17847->12111|17931->12178|18011->12239|18091->12313|18175->12397|18264->12524|18352->12589|18436->12656|18516->12717|18592->12774|18664->12827|18741->12875|24927->19034|24957->19042|24986->19043
                  LINES: 32->4|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|59->31|59->31|60->32|63->35|63->35|65->37|65->37|66->38|67->39|67->39|68->40|69->41|69->41|70->42|70->42|71->43|72->44|72->44|72->44|77->49|77->49|78->50|79->51|79->51|80->52|89->61|89->61|91->63|91->63|91->63|92->64|92->64|92->64|93->65|94->66|94->66|95->67|97->69|97->69|98->70|98->70|101->73|101->73|102->74|102->74|103->75|103->75|104->76|106->78|106->78|107->79|107->79|109->81|110->82|111->83|112->84|112->84|114->86|115->87|115->87|116->88|123->95|123->95|124->96|131->103|131->103|132->104|132->104|132->104|133->105|138->110|138->110|139->111|140->112|140->112|142->114|142->114|142->114|143->115|148->120|148->120|149->121|153->125|153->125|154->126|154->126|155->127|156->128|156->128|156->128|161->133|161->133|162->134|164->136|164->136|165->137|165->137|165->137|165->137|165->137|173->145|173->145|174->146|175->147|175->147|176->148|178->150|178->150|179->151|182->154|182->154|183->155|183->155|184->156|186->158|186->158|187->159|187->159|189->161|190->162|191->163|192->164|192->164|194->166|196->168|196->168|197->169|202->174|202->174|203->175|205->177|205->177|207->179|207->179|208->180|209->181|209->181|209->181|214->186|214->186|215->187|216->188|216->188|217->189|221->193|221->193|222->194|223->195|223->195|224->196|226->198|226->198|228->200|228->200|229->201|229->201|230->202|232->204|232->204|233->205|233->205|235->207|236->208|237->209|238->210|238->210|241->213|245->217|245->217|251->223|251->223|251->223|252->224|277->249|278->250|279->251|281->253|300->272|301->273|302->274|303->275|304->276|305->277|306->278|307->279|308->280|309->281|310->282|311->283|312->284|313->285|314->286|315->287|316->288|318->290|427->399|427->399|428->400
                  -- GENERATED --
              */
          