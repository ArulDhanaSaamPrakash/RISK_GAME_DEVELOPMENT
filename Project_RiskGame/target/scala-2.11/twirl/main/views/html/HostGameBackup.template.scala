
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object HostGameBackup_Scope0 {
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

class HostGameBackup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>RISK GAME - CARNEGIE MELLON UNIVERSITY</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
  <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
  <meta name="author" content="Codrops" />
  <link rel="shortcut icon" href="../favicon.ico">
  <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.49*/routes/*11.55*/.Assets.at("stylesheets/demo.css")),format.raw/*11.89*/("""" />
  <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.49*/routes/*12.55*/.Assets.at("stylesheets/style.css")),format.raw/*12.90*/("""" />
  <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.49*/routes/*13.55*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*13.99*/("""" />
  <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.49*/routes/*14.55*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*14.95*/("""" />
  <script src=""""),_display_(/*15.17*/routes/*15.23*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*15.68*/("""" type="text/javascript"></script>
  <script src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*16.66*/("""" type="text/javascript"></script>
  <script src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("javascripts/loading.js")),format.raw/*17.59*/("""" type="text/javascript"></script>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript" charset="utf-8" src=""""),_display_(/*20.56*/routes/*20.62*/.Application.hostJs()),format.raw/*20.83*/(""""></script>

  <script>

    $(document).ready(function() """),format.raw/*24.34*/("""{"""),format.raw/*24.35*/("""
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/(""");

    </script>
  <style>
  .customHr """),format.raw/*29.13*/("""{"""),format.raw/*29.14*/("""
    """),format.raw/*30.5*/("""width: 95%;
    font-size: 1px;
    color: rgba(0, 0, 0, 0);
    line-height: 1px;

    background-color: grey;
    margin-top: -6px;
    margin-bottom: 10px;
  """),format.raw/*38.3*/("""}"""),format.raw/*38.4*/("""


  """),format.raw/*41.3*/("""</style>

</head>
<body>
  <form id="frmHidden" method="POST" action="/phases" hidden>

  </form>
  <input type="hidden" value="1" id="gameid">
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <h3>
               New Game Hosted..Waiting for the users to join
        </h3>
        <button type="button" class="btn btn-primary btn-default" id="btnStart">
                START THE GAME
        </button>

      </div>
    </div>

    <br>
    <div class="customHr">.</div>
    <div class="row">
      <div class="col-md-4">
        <form role="form">
          <legend>Invite friends</legend>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="emailid">
            <span class="input-group-btn">
              <button class="btn btn-default" type="button">Invite</button>
            </span>
          </div><!-- /input-group -->
          <br>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="emailid">
            <span class="input-group-btn">
              <button class="btn btn-default" type="button">Invite</button>
            </span>
          </div><!-- /input-group -->
          <br>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="emailid">
            <span class="input-group-btn">
              <button class="btn btn-default" type="button">Invite</button>
            </span>
          </div><!-- /input-group -->
          <br>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="emailid">
            <span class="input-group-btn">
              <button class="btn btn-default" type="button">Invite</button>
            </span>
          </div><!-- /input-group -->
          <br>
        </form>
      </div>
      <div class="col-md-4">
        <form class="form-horizontal">
          <fieldset>

              <!-- Form Name -->
            <legend>Game Settings</legend>

              <!-- Multiple Radios -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="TimeBound">Is the game timebound</label>
              <div class="col-md-4">
                <div class="radio">
                  <label for="TimeBound-0">
                    <input type="radio" name="TimeBound" id="TimeBound-0" value="1" checked="checked">
                    Yes
                  </label>
                </div>
                <div class="radio">
                  <label for="TimeBound-1">
                    <input type="radio" name="TimeBound" id="TimeBound-1" value="2">
                    No
                  </label>
                </div>
              </div>
            </div>

              <!-- Select Basic -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="selecttime">Time for each step(in mins):</label>
              <div class="col-md-4">
                <select id="selecttime" name="selecttime" class="form-control">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                </select>
              </div>
            </div>

              <!-- Select Basic -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="selectsteps">No. of project steps:</label>
              <div class="col-md-4">
                <select id="selectsteps" name="selectsteps" class="form-control">
                  <option value="1">15</option>
                  <option value="2">20</option>
                  <option value="3">25</option>
                  <option value="4">30</option>
                </select>
              </div>
            </div>

          </fieldset>
        </form>


      </div>
      <div class="col-md-4">
        <legend>Players who have joined</legend>

        <ul class="list-group" id="userList">
          """),format.raw/*160.53*/("""
        """),format.raw/*161.9*/("""</ul>
      </div>
    </div>
    </div>

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
object HostGameBackup extends HostGameBackup_Scope0.HostGameBackup
              /*
                  -- GENERATED --
                  DATE: Fri Jul 28 11:04:14 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/HostGameBackup.scala.html
                  HASH: 7ff0e3a358a6df54229c33c9fde673f089f5244a
                  MATRIX: 845->0|1395->523|1410->529|1465->563|1545->616|1560->622|1616->657|1696->710|1711->716|1776->760|1856->813|1871->819|1932->859|1980->880|1995->886|2061->931|2139->982|2154->988|2218->1031|2296->1082|2311->1088|2368->1124|2680->1409|2695->1415|2737->1436|2823->1494|2852->1495|2884->1500|2912->1501|2980->1541|3009->1542|3041->1547|3229->1708|3257->1709|3289->1714|7440->5878|7477->5887
                  LINES: 32->1|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|51->20|51->20|51->20|55->24|55->24|56->25|56->25|60->29|60->29|61->30|69->38|69->38|72->41|191->160|192->161
                  -- GENERATED --
              */
          