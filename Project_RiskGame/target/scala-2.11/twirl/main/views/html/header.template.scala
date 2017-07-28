
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <style>
  .navbar-nav > li > a  , .navbar-brand """),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""
    """),format.raw/*8.5*/("""padding-top:5px !important; padding-bottom:0 !important;
    height: 30px; color: white;
  """),format.raw/*10.3*/("""}"""),format.raw/*10.4*/("""

 """),format.raw/*12.2*/("""#uname """),format.raw/*12.9*/("""{"""),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""padding-top:5px !important; padding-bottom:0 !important;
    height: 30px; color: white;
  """),format.raw/*15.3*/("""}"""),format.raw/*15.4*/("""
  """),format.raw/*16.3*/(""".navbar """),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""min-height:30px !important;"""),format.raw/*16.39*/("""}"""),format.raw/*16.40*/("""

  """),format.raw/*18.3*/("""header """),format.raw/*18.10*/("""{"""),format.raw/*18.11*/("""
    """),format.raw/*19.5*/("""width: 100%;
    height: 30px;
    background: #2d6277;
    position: fixed;
    top: 0;
  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""

  """),format.raw/*26.3*/("""</style>
</head>
<body>
  <header>

    <a class="navbar-brand" href="#">Risk Game</a>
    <ul class="nav navbar-nav">

      </ul>
    <ul class="nav navbar-nav navbar-right">
    <li><a href="#">Signed in as
     </a></li>
       <!--\\<li><a href="#">Signed in as <div id="uname">"""),_display_(/*38.60*/Http/*38.64*/.Context.current().args.get("username").asInstanceOf[String]),format.raw/*38.124*/("""</div>
      <li><a href="#">Signed in as """),_display_(/*39.37*/Http/*39.41*/.Context.current().args.get("username").asInstanceOf[String]),format.raw/*39.101*/(""" 
      """),format.raw/*40.7*/("""</a></li>-->
      <li><a href="#" id="uname">"""),_display_(/*41.35*/Http/*41.39*/.Context.current().args.get("username").asInstanceOf[String]),format.raw/*41.99*/("""
      """),format.raw/*42.7*/("""</a></li>
      <script> 
            var uname=document.getElementById("uname").innerHTML;
            sessionStorage.username =uname;
      </script>
      <li> <a href="/logout" >Logout</a></li>
      <li>&nbsp;&nbsp;&nbsp;</li>
      </ul>
    <br>

    </header>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Fri Jul 28 19:28:32 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/header.scala.html
                  HASH: 00ea06e03d755c35373d0afcd9d163a040f68b69
                  MATRIX: 829->0|994->138|1022->139|1053->144|1171->235|1199->236|1229->239|1263->246|1292->247|1324->252|1442->343|1470->344|1500->347|1536->355|1565->356|1620->383|1649->384|1680->388|1715->395|1744->396|1776->401|1894->492|1922->493|1953->497|2264->781|2277->785|2359->845|2429->888|2442->892|2524->952|2559->960|2633->1007|2646->1011|2727->1071|2761->1078
                  LINES: 32->1|38->7|38->7|39->8|41->10|41->10|43->12|43->12|43->12|44->13|46->15|46->15|47->16|47->16|47->16|47->16|47->16|49->18|49->18|49->18|50->19|55->24|55->24|57->26|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42
                  -- GENERATED --
              */
          