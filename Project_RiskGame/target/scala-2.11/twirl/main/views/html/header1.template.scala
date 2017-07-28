
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header1_Scope0 {
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

class header1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
  .navbar-nav > li > a, .navbar-brand """),format.raw/*7.39*/("""{"""),format.raw/*7.40*/("""
    """),format.raw/*8.5*/("""padding-top:5px !important; padding-bottom:0 !important;
    height: 30px; color: white;
  """),format.raw/*10.3*/("""}"""),format.raw/*10.4*/("""

  """),format.raw/*12.3*/(""".navbar """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/("""min-height:30px !important;"""),format.raw/*12.39*/("""}"""),format.raw/*12.40*/("""

  """),format.raw/*14.3*/("""header """),format.raw/*14.10*/("""{"""),format.raw/*14.11*/("""
    """),format.raw/*15.5*/("""width: 100%;
    height: 30px;
    background: #2d6277;
    position: fixed;
    top: 0;
  """),format.raw/*20.3*/("""}"""),format.raw/*20.4*/("""

  """),format.raw/*22.3*/("""</style>
  
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
object header1 extends header1_Scope0.header1
              /*
                  -- GENERATED --
                  DATE: Fri Jul 28 19:28:32 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/header1.scala.html
                  HASH: 0f5185c2770e94186c167f0950f46662804ac2b0
                  MATRIX: 831->0|994->136|1022->137|1053->142|1171->233|1199->234|1230->238|1266->246|1295->247|1350->274|1379->275|1410->279|1445->286|1474->287|1506->292|1624->383|1652->384|1683->388
                  LINES: 32->1|38->7|38->7|39->8|41->10|41->10|43->12|43->12|43->12|43->12|43->12|45->14|45->14|45->14|46->15|51->20|51->20|53->22
                  -- GENERATED --
              */
          