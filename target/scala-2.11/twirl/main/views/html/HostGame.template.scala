
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object HostGame_Scope0 {
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

class HostGame extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(gameId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
  <title>Title</title>
  <style>
  .navbar-nav > li > a, .navbar-brand """),format.raw/*8.39*/("""{"""),format.raw/*8.40*/("""
    """),format.raw/*9.5*/("""padding-top:5px !important; padding-bottom:0 !important;
    height: 30px; color: white;
  """),format.raw/*11.3*/("""}"""),format.raw/*11.4*/("""

  """),format.raw/*13.3*/(""".navbar """),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""min-height:30px !important;"""),format.raw/*13.39*/("""}"""),format.raw/*13.40*/("""

  """),format.raw/*15.3*/("""header """),format.raw/*15.10*/("""{"""),format.raw/*15.11*/("""
    """),format.raw/*16.5*/("""width: 100%;
    height: 30px;
    background: #2d6277;
    position: fixed;
    top: 0;
  """),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""

  """),format.raw/*23.3*/("""</style>
    <meta charset="UTF-8" />
    <title>RISK GAME - CARNEGIE MELLON UNIVERSITY</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
    <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*31.51*/routes/*31.57*/.Assets.at("stylesheets/demo.css")),format.raw/*31.91*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*32.51*/routes/*32.57*/.Assets.at("stylesheets/style.css")),format.raw/*32.92*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*33.51*/routes/*33.57*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*33.101*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*34.51*/routes/*34.57*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*34.97*/("""" />
    <script src=""""),_display_(/*35.19*/routes/*35.25*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*35.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*36.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*37.19*/routes/*37.25*/.Assets.at("javascripts/loading.js")),format.raw/*37.61*/("""" type="text/javascript"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*40.58*/routes/*40.64*/.Application.hostJs()),format.raw/*40.85*/(""""></script>

    <script>

    $(document).ready(function() """),format.raw/*44.34*/("""{"""),format.raw/*44.35*/("""
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/(""");



function special()
    """),format.raw/*50.5*/("""{"""),format.raw/*50.6*/("""

        """),format.raw/*52.9*/("""var gameID =  """),_display_(/*52.24*/gameId),format.raw/*52.30*/("""

        """),format.raw/*54.9*/("""var obj = """),format.raw/*54.19*/("""{"""),format.raw/*54.20*/("""

            """),format.raw/*56.13*/(""""gameID": gameID
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""";

console.log(obj);
        $.ajax("""),format.raw/*60.16*/("""{"""),format.raw/*60.17*/("""
            """),format.raw/*61.13*/("""type: 'POST',
            url: '"""),_display_(/*62.20*/routes/*62.26*/.LoginController.speciallogout()),format.raw/*62.58*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            // dataType: 'json',
            contentType: 'application/json',
            success: function (data) """),format.raw/*69.38*/("""{"""),format.raw/*69.39*/("""
                """),format.raw/*70.17*/("""// alert(data);
                if(data=="sucess")
                """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""
                    """),format.raw/*73.21*/("""window.open('/logout',"_self");
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""else
                """),format.raw/*75.17*/("""{"""),format.raw/*75.18*/("""
                  """),format.raw/*76.19*/("""window.open('/logout',"_self");
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/(""",
            error: function (data) """),format.raw/*79.36*/("""{"""),format.raw/*79.37*/("""
                """),format.raw/*80.17*/("""alert("error");
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/("""
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""");
    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/("""
    """),format.raw/*84.5*/("""</script>
    <style>
    .customHr """),format.raw/*86.15*/("""{"""),format.raw/*86.16*/("""
      """),format.raw/*87.7*/("""width: 95%;
      font-size: 1px;
      color: rgba(0, 0, 0, 0);
      line-height: 1px;

      background-color: grey;
      margin-top: -6px;
      margin-bottom: 10px;
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""

    """),format.raw/*97.5*/("""</style>

  </head>
  <body>
    <header>
    <a class="navbar-brand" href="#">Risk Game</a>
    <ul class="nav navbar-nav">

      </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#">Signed in as
     </a></li>
      <li><a href="#" id="uname">
      </a></li>
      <script> 
            document.getElementById("uname").innerHTML=sessionStorage.getItem("username");
      </script>
      <li> <a href="javascript:special()" >ASSGOUT</a></li>
      <li>&nbsp;&nbsp;&nbsp;</li>
      </ul>
    <br>
    </header>
   <br>
    <form id="frmHidden" method="POST" action="/start" hidden>
      <input type="hidden" id = "gameid" name ="gameid" value='"""),_display_(/*121.65*/gameId),format.raw/*121.71*/("""' />
  </form>
    <input type="hidden" value="1" id="gameid">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="col-md-12">
            <h3>
              <a class="glyphicon glyphicon-info-sign" href="#" style=";color: blue; text-decoration: underline;font-size: 18px !important;" onclick="window.open('/assets/images/Players_manual.pdf', '_blank', 'toolbar=0,location=0,menubar=0');"> Click here to read instructions!</a>
            </h3>
          </div>
          <div style="height: 50px"></div>
<div>
  <h3>
    """),_display_(/*135.6*/gameId),format.raw/*135.12*/("""
    """),format.raw/*136.5*/("""New Game Hosted..Waiting for the users to join
  </h3>
  <button type="button" class="btn btn-primary btn-default" id="btnStart">
    START THE GAME
  </button>
</div>
        </div>
      </div>
      <br>
      <div class="customHr">.</div>
      <div class="row">
        <div class="col-md-6">
          <legend>Players who have joined</legend>
          <ul class="list-group" id="userList">
            """),format.raw/*150.55*/("""
          """),format.raw/*151.11*/("""</ul>
        </div>
      </div>

    </div>
    """),_display_(/*156.6*/footer()),format.raw/*156.14*/("""
  """),format.raw/*157.3*/("""</body>
</html>"""))
      }
    }
  }

  def render(gameId:String): play.twirl.api.HtmlFormat.Appendable = apply(gameId)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (gameId) => apply(gameId)

  def ref: this.type = this

}


}

/**/
object HostGame extends HostGame_Scope0.HostGame
              /*
                  -- GENERATED --
                  DATE: Tue Nov 21 00:21:57 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/HostGame.scala.html
                  HASH: 008e9df8e5ada5b19937c2b0265a28b36da48eba
                  MATRIX: 751->1|862->17|889->18|1056->158|1084->159|1115->164|1233->255|1261->256|1292->260|1328->268|1357->269|1412->296|1441->297|1472->301|1507->308|1536->309|1568->314|1686->405|1714->406|1745->410|2280->918|2295->924|2350->958|2432->1013|2447->1019|2503->1054|2585->1109|2600->1115|2666->1159|2748->1214|2763->1220|2824->1260|2874->1283|2889->1289|2955->1334|3035->1387|3050->1393|3114->1436|3194->1489|3209->1495|3266->1531|3584->1822|3599->1828|3641->1849|3729->1909|3758->1910|3790->1915|3818->1916|3874->1945|3902->1946|3939->1956|3981->1971|4008->1977|4045->1987|4083->1997|4112->1998|4154->2012|4206->2037|4235->2038|4299->2074|4328->2075|4369->2088|4429->2121|4444->2127|4497->2159|4777->2411|4806->2412|4851->2429|4946->2496|4975->2497|5024->2518|5100->2566|5129->2567|5178->2588|5207->2589|5254->2608|5330->2656|5359->2657|5400->2670|5429->2671|5494->2708|5523->2709|5568->2726|5624->2754|5653->2755|5689->2764|5718->2765|5752->2772|5780->2773|5812->2778|5876->2814|5905->2815|5939->2822|6141->2997|6169->2998|6202->3004|6900->3674|6928->3680|7532->4257|7560->4263|7593->4268|8031->4719|8071->4730|8149->4781|8179->4789|8210->4792
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|42->11|42->11|44->13|44->13|44->13|44->13|44->13|46->15|46->15|46->15|47->16|52->21|52->21|54->23|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|71->40|71->40|71->40|75->44|75->44|76->45|76->45|81->50|81->50|83->52|83->52|83->52|85->54|85->54|85->54|87->56|88->57|88->57|91->60|91->60|92->61|93->62|93->62|93->62|100->69|100->69|101->70|103->72|103->72|104->73|105->74|105->74|106->75|106->75|107->76|108->77|108->77|109->78|109->78|110->79|110->79|111->80|112->81|112->81|113->82|113->82|114->83|114->83|115->84|117->86|117->86|118->87|126->95|126->95|128->97|152->121|152->121|166->135|166->135|167->136|181->150|182->151|187->156|187->156|188->157
                  -- GENERATED --
              */
          