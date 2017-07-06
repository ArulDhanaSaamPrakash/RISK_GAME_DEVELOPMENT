
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
    <meta charset="UTF-8" />
    <title>RISK GAME - CARNEGIE MELLON UNIVERSITY</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
    <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("stylesheets/demo.css")),format.raw/*12.91*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("stylesheets/style.css")),format.raw/*13.92*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*14.101*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.51*/routes/*15.57*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*15.97*/("""" />
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*16.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*17.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*18.19*/routes/*18.25*/.Assets.at("javascripts/loading.js")),format.raw/*18.61*/("""" type="text/javascript"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" charset="utf-8" src=""""),_display_(/*21.58*/routes/*21.64*/.Application.hostJs()),format.raw/*21.85*/(""""></script>

    <script>

    $(document).ready(function() """),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/(""");

    </script>
    <style>
    .customHr """),format.raw/*30.15*/("""{"""),format.raw/*30.16*/("""
      """),format.raw/*31.7*/("""width: 95%;
      font-size: 1px;
      color: rgba(0, 0, 0, 0);
      line-height: 1px;

      background-color: grey;
      margin-top: -6px;
      margin-bottom: 10px;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""

    """),format.raw/*41.5*/("""</style>

  </head>
  <body>
    """),_display_(/*45.6*/header()),format.raw/*45.14*/("""<br>
    <form id="frmHidden" method="POST" action="/start" hidden>
      <input type="hidden" id = "gameid" name ="gameid" value='"""),_display_(/*47.65*/gameId),format.raw/*47.71*/("""' />
  </form>
    <input type="hidden" value="1" id="gameid">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="col-md-12">
            <h3>
              <a class="glyphicon glyphicon-info-sign" href="#" style=";color: blue; text-decoration: underline;font-size: 18px !important;;" onclick="window.open('/assets/images/Players_manual.pdf', '_blank', 'toolbar=0,location=0,menubar=0');">Click here to read instructions!</a>
            </h3>
          </div>
          <div style="height: 50px"></div>

<div>
  <h3>
    """),_display_(/*62.6*/gameId),format.raw/*62.12*/("""
    """),format.raw/*63.5*/("""New Game Hosted..Waiting for the users to join
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
            """),format.raw/*82.55*/("""
          """),format.raw/*83.11*/("""</ul>
        </div>
      </div>

    </div>
    """),_display_(/*88.6*/footer()),format.raw/*88.14*/("""
  """),format.raw/*89.3*/("""</body>
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
                  DATE: Thu Jul 06 14:56:11 EDT 2017
                  SOURCE: /Users/Arul/Downloads/Project_RiskGame/app/views/HostGame.scala.html
                  HASH: 6ddbd06787d2308b57153d31c140a35318ea035c
                  MATRIX: 751->1|862->17|889->18|1457->559|1472->565|1527->599|1609->654|1624->660|1680->695|1762->750|1777->756|1843->800|1925->855|1940->861|2001->901|2051->924|2066->930|2132->975|2212->1028|2227->1034|2291->1077|2371->1130|2386->1136|2443->1172|2761->1463|2776->1469|2818->1490|2906->1550|2935->1551|2967->1556|2995->1557|3067->1601|3096->1602|3130->1609|3332->1784|3360->1785|3393->1791|3453->1825|3482->1833|3641->1965|3668->1971|4272->2549|4299->2555|4331->2560|4773->3016|4812->3027|4889->3078|4918->3086|4948->3089
                  LINES: 27->1|32->1|33->2|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|56->25|56->25|57->26|57->26|61->30|61->30|62->31|70->39|70->39|72->41|76->45|76->45|78->47|78->47|93->62|93->62|94->63|113->82|114->83|119->88|119->88|120->89
                  -- GENERATED --
              */
          