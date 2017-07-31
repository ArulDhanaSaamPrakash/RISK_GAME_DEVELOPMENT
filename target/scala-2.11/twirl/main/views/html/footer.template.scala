
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
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

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    footer """),format.raw/*8.12*/("""{"""),format.raw/*8.13*/("""
      """),format.raw/*9.7*/("""width: 100%;
      height: 20px;
      background: #2d6277;
      position: fixed;
      bottom: 0;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</style>
  </head>
  <body>
    <footer>
<div align="center" style="color:white">Copyright 2016 Team GameR</div>
    </footer>
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
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Tue Oct 25 17:31:05 EDT 2016
                  SOURCE: /home/nivas/IdeaProjects/Project_RiskGame/app/views/footer.scala.html
                  HASH: c4ec49809a7f319f40ee35c51ee0e18f151d2973
                  MATRIX: 829->0|974->118|1002->119|1035->126|1166->230|1194->231|1226->236
                  LINES: 32->1|39->8|39->8|40->9|45->14|45->14|46->15
                  -- GENERATED --
              */
          