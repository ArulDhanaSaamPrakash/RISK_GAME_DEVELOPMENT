
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object join_Scope0 {
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

class join extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parameters:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main(null)/*2.12*/ {_display_(Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
  <html lang="en">
    <head>
      <meta charset="UTF-8" />
      <title>RISK GAME - CARNEGIE MELLON UNIVERSITY</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
      <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
      <meta name="author" content="Codrops" />
      <link rel="shortcut icon" href="../favicon.ico">
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.53*/routes/*14.59*/.Assets.at("stylesheets/demo.css")),format.raw/*14.93*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.53*/routes/*15.59*/.Assets.at("stylesheets/style.css")),format.raw/*15.94*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*16.53*/routes/*16.59*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*16.103*/("""" />
      <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.53*/routes/*17.59*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*17.99*/("""" />
      <script src=""""),_display_(/*18.21*/routes/*18.27*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*18.72*/("""" type="text/javascript"></script>
      <script src=""""),_display_(/*19.21*/routes/*19.27*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
      <script src=""""),_display_(/*20.21*/routes/*20.27*/.Assets.at("javascripts/loading.js")),format.raw/*20.63*/("""" type="text/javascript"></script>
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script type="text/javascript" charset="utf-8" src=""""),_display_(/*23.60*/routes/*23.66*/.Application.wsJs()),format.raw/*23.85*/(""""></script>
      </head>
    <body>
      """),_display_(/*26.8*/header()),format.raw/*26.16*/("""<br>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <h3>
          You are connected to the game. Please wait for the host to start the game.....
        </h3>
        <button id="btnLeave" type="button" class="btn btn-default">
          Leave Game
        </button>

        <input type="hidden" value=""""),_display_(/*37.38*/parameters/*37.48*/.get(2)),format.raw/*37.55*/("""" id="isobserver" name="isobserver">

        <form id="frmHidden" method="POST" action="/start" hidden>
          <input type="hidden" value='"""),_display_(/*40.40*/parameters/*40.50*/.get(0)),format.raw/*40.57*/("""' id="username" />
          <input type="hidden" value=""""),_display_(/*41.40*/parameters/*41.50*/.get(1)),format.raw/*41.57*/("""" id="gameid" name="gameid">
        </form>

        <form id="frmObserver" method="POST" action="/observegame" hidden>
          <input type="hidden" value='"""),_display_(/*45.40*/parameters/*45.50*/.get(0)),format.raw/*45.57*/("""' id="username" />
          <input type="hidden" value=""""),_display_(/*46.40*/parameters/*46.50*/.get(1)),format.raw/*46.57*/("""" id="gameid" name="gameid">
        </form>


        """),format.raw/*50.93*/("""
          """),format.raw/*51.22*/("""
            """),format.raw/*52.21*/("""
              """),format.raw/*53.62*/("""
            """),format.raw/*54.22*/("""
          """),format.raw/*55.23*/("""
          """),format.raw/*56.22*/("""



          """),format.raw/*60.23*/("""
        """),format.raw/*61.21*/("""

        """),format.raw/*63.9*/("""<div><br></div>
        <div class = "panel panel-primary">
        <div class = "panel-heading">

          <h3 class = "panel-title">Players who have joined</h3>
        </div>
        <div id="divJoined" class = "panel-body">
        </div>
      </div>

        """),format.raw/*73.40*/("""
      """),format.raw/*74.17*/("""
    """),format.raw/*75.5*/("""</div>
  </div></div>
      """),_display_(/*77.8*/footer()),format.raw/*77.16*/("""
    """),format.raw/*78.5*/("""</body>
""")))}))
      }
    }
  }

  def render(parameters:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(parameters)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (parameters) => apply(parameters)

  def ref: this.type = this

}


}

/**/
object join extends join_Scope0.join
              /*
                  -- GENERATED --
                  DATE: Sat Jul 29 21:49:49 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/join.scala.html
                  HASH: d5b99c6701e6e29c7e273e05848b524f2acf032a
                  MATRIX: 749->1|869->26|896->28|914->38|953->40|981->42|1569->603|1584->609|1639->643|1723->700|1738->706|1794->741|1878->798|1893->804|1959->848|2043->905|2058->911|2119->951|2171->976|2186->982|2252->1027|2334->1082|2349->1088|2413->1131|2495->1186|2510->1192|2567->1228|2891->1525|2906->1531|2946->1550|3016->1594|3045->1602|3417->1947|3436->1957|3464->1964|3635->2108|3654->2118|3682->2125|3767->2183|3786->2193|3814->2200|4001->2360|4020->2370|4048->2377|4133->2435|4152->2445|4180->2452|4263->2591|4302->2613|4343->2634|4386->2696|4427->2718|4466->2741|4505->2763|4547->2789|4584->2810|4621->2820|4915->3117|4950->3134|4982->3139|5037->3168|5066->3176|5098->3181
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|57->26|57->26|68->37|68->37|68->37|71->40|71->40|71->40|72->41|72->41|72->41|76->45|76->45|76->45|77->46|77->46|77->46|81->50|82->51|83->52|84->53|85->54|86->55|87->56|91->60|92->61|94->63|104->73|105->74|106->75|108->77|108->77|109->78
                  -- GENERATED --
              */
          