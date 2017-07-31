
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object join_backup_Scope0 {
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

class join_backup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parameters:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main(null)/*2.12*/ {_display_(Seq[Any](format.raw/*2.14*/("""
    """),format.raw/*3.5*/("""<section>
        <h1>You are connected to game</h1>

        """),format.raw/*6.61*/("""
        """),format.raw/*7.65*/("""
        """),format.raw/*8.71*/("""
        """),format.raw/*9.61*/("""
        """),format.raw/*10.9*/("""<input type="button" id="btnLeave" value="Leave"/>
        <form id="frmHidden" method="POST" action="/start" hidden>
            <input type="hidden" value='"""),_display_(/*12.42*/parameters/*12.52*/.get(0)),format.raw/*12.59*/("""' id="username" />
            <input type="hidden" value=""""),_display_(/*13.42*/parameters/*13.52*/.get(1)),format.raw/*13.59*/("""" id="gameid" name="gameid">
        </form>


        <script type="text/javascript" charset="utf-8" src=""""),_display_(/*17.62*/routes/*17.68*/.Application.wsJs()),format.raw/*17.87*/(""""></script>
    </section>

    <hr>
    <section>
        <h1>Active Players</h1>
        <div id="divJoined"> </div>
    </section>

    <hr>
    """),format.raw/*27.18*/("""
        """),format.raw/*28.44*/("""
        """),format.raw/*29.35*/("""
    """),format.raw/*30.19*/("""
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
object join_backup extends join_backup_Scope0.join_backup
              /*
                  -- GENERATED --
                  DATE: Mon Oct 17 22:51:01 EDT 2016
                  SOURCE: /home/nivas/IdeaProjects/Project_RiskGame/app/views/join_backup.scala.html
                  HASH: bc3e85eacfe01434080dd5d13fab2d7600a63595
                  MATRIX: 763->1|883->26|910->28|928->38|967->40|998->45|1087->159|1123->224|1159->295|1195->356|1231->365|1417->524|1436->534|1464->541|1551->601|1570->611|1598->618|1733->726|1748->732|1788->751|1964->912|2001->956|2038->991|2071->1010
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|37->6|38->7|39->8|40->9|41->10|43->12|43->12|43->12|44->13|44->13|44->13|48->17|48->17|48->17|58->27|59->28|60->29|61->30
                  -- GENERATED --
              */
          