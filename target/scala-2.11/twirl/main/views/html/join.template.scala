
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

        <input type="hidden" value=""""),_display_(/*34.38*/parameters/*34.48*/.get(2)),format.raw/*34.55*/("""" id="isobserver" name="isobserver">

        <form id="frmHidden" method="POST" action="/start" hidden>
          <input type="hidden" value='"""),_display_(/*37.40*/parameters/*37.50*/.get(0)),format.raw/*37.57*/("""' id="username" />
          <input type="hidden" value=""""),_display_(/*38.40*/parameters/*38.50*/.get(1)),format.raw/*38.57*/("""" id="gameid" name="gameid">
        </form>

        <form id="frmObserver" method="POST" action="/observegame" hidden>
          <input type="hidden" value='"""),_display_(/*42.40*/parameters/*42.50*/.get(0)),format.raw/*42.57*/("""' id="username" />
          <input type="hidden" value=""""),_display_(/*43.40*/parameters/*43.50*/.get(1)),format.raw/*43.57*/("""" id="gameid" name="gameid">
        </form>


        """),format.raw/*47.93*/("""
          """),format.raw/*48.22*/("""
            """),format.raw/*49.21*/("""
              """),format.raw/*50.62*/("""
            """),format.raw/*51.22*/("""
          """),format.raw/*52.23*/("""
          """),format.raw/*53.22*/("""



          """),format.raw/*57.23*/("""
        """),format.raw/*58.21*/("""

        """),format.raw/*60.9*/("""<div><br></div>
        <div class = "panel panel-primary">
        <div class = "panel-heading">

          <h3 class = "panel-title">Players who have joined</h3>
        </div>
        <div id="divJoined" class = "panel-body">
        </div>
      </div>

        """),format.raw/*70.40*/("""
      """),format.raw/*71.17*/("""
    """),format.raw/*72.5*/("""</div>
  </div></div>
      """),_display_(/*74.8*/footer()),format.raw/*74.16*/("""
    """),format.raw/*75.5*/("""</body>
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
                  DATE: Thu Nov 09 13:59:56 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/join.scala.html
                  HASH: 7e631a7c39fd0ab5ef3891c8669dcc866eba2816
                  MATRIX: 749->1|869->26|896->28|914->38|953->40|981->42|1569->603|1584->609|1639->643|1723->700|1738->706|1794->741|1878->798|1893->804|1959->848|2043->905|2058->911|2119->951|2171->976|2186->982|2252->1027|2334->1082|2349->1088|2413->1131|2495->1186|2510->1192|2567->1228|2891->1525|2906->1531|2946->1550|3016->1594|3045->1602|3309->1839|3328->1849|3356->1856|3527->2000|3546->2010|3574->2017|3659->2075|3678->2085|3706->2092|3893->2252|3912->2262|3940->2269|4025->2327|4044->2337|4072->2344|4155->2483|4194->2505|4235->2526|4278->2588|4319->2610|4358->2633|4397->2655|4439->2681|4476->2702|4513->2712|4807->3009|4842->3026|4874->3031|4929->3060|4958->3068|4990->3073
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|57->26|57->26|65->34|65->34|65->34|68->37|68->37|68->37|69->38|69->38|69->38|73->42|73->42|73->42|74->43|74->43|74->43|78->47|79->48|80->49|81->50|82->51|83->52|84->53|88->57|89->58|91->60|101->70|102->71|103->72|105->74|105->74|106->75
                  -- GENERATED --
              */
          