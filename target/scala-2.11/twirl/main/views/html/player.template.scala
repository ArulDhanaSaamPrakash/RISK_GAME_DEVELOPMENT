
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object player_Scope0 {
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

class player extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main(null)/*1.12*/ {_display_(Seq[Any](format.raw/*1.14*/("""
    """),format.raw/*2.5*/("""<section>

        <h1>Join game</h1>
        <input type="hidden" value="1" id="gameid">


        <form method="post" action=""""),_display_(/*8.38*/routes/*8.44*/.GameController.joinGame()),format.raw/*8.70*/("""">
            <input type="text" name = "username" id="txtUsername" placeholder="Username"/>
            <input type="submit" id="btnJoin" value="Join"/>
        </form>
    </section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object player extends player_Scope0.player
              /*
                  -- GENERATED --
                  DATE: Tue Oct 11 18:36:16 EDT 2016
                  SOURCE: /home/nivas/IdeaProjects/Project_RiskGame/app/views/player.scala.html
                  HASH: 334d2ea18f63c43ece3f4c139f04f172e35bc535
                  MATRIX: 829->1|847->11|886->13|917->18|1072->147|1086->153|1132->179
                  LINES: 32->1|32->1|32->1|33->2|39->8|39->8|39->8
                  -- GENERATED --
              */
          