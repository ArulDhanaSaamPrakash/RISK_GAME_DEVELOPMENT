
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
      <li><a href="#">Signed in as """),_display_(/*32.37*/Http/*32.41*/.Context.current().args.get("username").asInstanceOf[String]),format.raw/*32.101*/("""</a></li>
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
                  DATE: Wed Dec 07 01:25:08 EST 2016
                  SOURCE: /home/nivas/IdeaProjects/Project_RiskGame/app/views/header.scala.html
                  HASH: b07c88ac9c01fa56aa83b04a6c996a009e872532
                  MATRIX: 829->0|992->136|1020->137|1051->142|1169->233|1197->234|1228->238|1264->246|1293->247|1348->274|1377->275|1408->279|1443->286|1472->287|1504->292|1622->383|1650->384|1681->388|1921->601|1934->605|2016->665
                  LINES: 32->1|38->7|38->7|39->8|41->10|41->10|43->12|43->12|43->12|43->12|43->12|45->14|45->14|45->14|46->15|51->20|51->20|53->22|63->32|63->32|63->32
                  -- GENERATED --
              */
          