
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object observer_Scope0 {
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

class observer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(parameters:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Project Steps</title>
        <link rel="shortcut icon" href="">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" hredef="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.at("stylesheets/demo.css")),format.raw/*13.95*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.55*/routes/*14.61*/.Assets.at("stylesheets/style.css")),format.raw/*14.96*/("""" />
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*15.105*/("""" />
    </head>

    <input type="hidden" id="gameid" name="gameid" value='"""),_display_(/*18.60*/parameters/*18.70*/.get(1)),format.raw/*18.77*/("""'>

    <script type="text/javascript">
            $(function()"""),format.raw/*21.25*/("""{"""),format.raw/*21.26*/("""

                """),format.raw/*23.17*/("""var gameid = $('#gameid').val();
                var refresh = function()"""),format.raw/*24.41*/("""{"""),format.raw/*24.42*/("""
                    """),format.raw/*25.21*/("""var obj = """),format.raw/*25.31*/("""{"""),format.raw/*25.32*/("""'gameid': gameid"""),format.raw/*25.48*/("""}"""),format.raw/*25.49*/(""";
                    $.ajax("""),format.raw/*26.28*/("""{"""),format.raw/*26.29*/("""
                        """),format.raw/*27.25*/("""type: 'POST',
                        url: '"""),_display_(/*28.32*/routes/*28.38*/.GameController.getSnapshotDetails()),format.raw/*28.74*/("""',
                        data: JSON.stringify(obj),
                        contentType: 'application/json',
                        success: function (data) """),format.raw/*31.50*/("""{"""),format.raw/*31.51*/("""

                            """),format.raw/*33.29*/("""if(data.length>0)"""),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""
                                """),format.raw/*34.33*/("""var container = $('#container-image-list');
                                container.html("");
                                for(i=0;i<data.length;i++)"""),format.raw/*36.59*/("""{"""),format.raw/*36.60*/("""
                                    """),format.raw/*37.37*/("""var ul = "<ul id='" + data[i].name + "'>";
                                    ul += "<li><b>" + data[i].name + "</b></li><br>"
                                    for(j=0;j<data[i].images.length;j++)"""),format.raw/*39.73*/("""{"""),format.raw/*39.74*/("""
                                        """),format.raw/*40.41*/("""var stepNum = data[i].images[j].split(".")[0];
                                        ul += "<li data-image='" + data[i].images[j] +"'><a href='#'>" + "Step " + stepNum + "</a></li>";
                                    """),format.raw/*42.37*/("""}"""),format.raw/*42.38*/("""
                                    """),format.raw/*43.37*/("""ul += "</ul>";
                                    container.append(ul);
                                    container.append("<br><br>");
                                """),format.raw/*46.33*/("""}"""),format.raw/*46.34*/("""
                            """),format.raw/*47.29*/("""}"""),format.raw/*47.30*/("""
                        """),format.raw/*48.25*/("""}"""),format.raw/*48.26*/("""
                    """),format.raw/*49.21*/("""}"""),format.raw/*49.22*/(""");
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/("""

                """),format.raw/*52.17*/("""//load images on page load
                refresh();

                $('#btnShow').on('click', function()"""),format.raw/*55.53*/("""{"""),format.raw/*55.54*/("""
                   """),format.raw/*56.20*/("""refresh();
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/(""");

                $('#container-image-list').on('click', 'a', function()"""),format.raw/*59.71*/("""{"""),format.raw/*59.72*/("""
                    """),format.raw/*60.21*/("""var gameid = $('#gameid').val(),
                            playerid = $(this).closest('ul').attr('id'),
                            image = $(this).closest('li').attr('data-image');

                    var path = "images/" + gameid + "/" + playerid + "/" + image;

                    var url = "/assets/" + path;

//              alert(url);
                    $("#imgContainer").html("<img src='" + url + "' alt='turn capture'/>");

                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/(""");

                setInterval(refresh, 10000);
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/(""");

    </script>
    <body style="background-image: url("""),_display_(/*77.41*/routes/*77.47*/.Assets.at("images/bg.jpg")),format.raw/*77.74*/(""");" >
        <div class="container">
            <div class="row">
            <header style="" >

                <div class="col-md-4" style="background-color: #CED4BD; text-align: left">RISK-GAME</div>
                <div class="col-md-6" style="background-color: #CED4BD;text-align: left">Observer-Dashboard</div>
                <div class="col-md-2" style="display: inline-block;">

                    <div style=" display: inline-block;" class="btn-group">
                        <button type="button"
                        class=" dropdown-toggle glyphicon glyphicon-cog" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false">

                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="#">Help</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#" onclick="window.open('/assets/images/Riskdesc.pdf', '_blank', 'toolbar=0,location=0,menubar=0');">Risk Description</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="/logout" >Logout</a></li>
                        </ul>
                    </div>
                </div>
            </header>
            </div>
            <div class="row">
                <div class="col-md-2">
                    <button id="btnShow">Show All</button>
                    <div>
                        <div class="panel-body" id="panel">Available Snapshots</div>
                        <div id="container-image-list">
                        </div>
                    </div>
                </div>
                <div class="col-md-10" id="imgContainer" style="height:200px">

                </div>
            </div>
        </div>
    </body>
</html>

"""))
      }
    }
  }

  def render(parameters:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(parameters)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (parameters) => apply(parameters)

  def ref: this.type = this

}


}

/**/
object observer extends observer_Scope0.observer
              /*
                  -- GENERATED --
                  DATE: Sat Jul 29 22:13:32 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/observer.scala.html
                  HASH: 058e90d32ca8633a0197a463e2d8a17753c20de5
                  MATRIX: 757->1|877->26|904->27|1632->728|1647->734|1702->768|1788->827|1803->833|1859->868|1945->927|1960->933|2026->977|2130->1054|2149->1064|2177->1071|2269->1135|2298->1136|2344->1154|2445->1227|2474->1228|2523->1249|2561->1259|2590->1260|2634->1276|2663->1277|2720->1306|2749->1307|2802->1332|2874->1377|2889->1383|2946->1419|3134->1579|3163->1580|3221->1610|3266->1627|3295->1628|3356->1661|3538->1815|3567->1816|3632->1853|3860->2053|3889->2054|3958->2095|4207->2316|4236->2317|4301->2354|4500->2525|4529->2526|4586->2555|4615->2556|4668->2581|4697->2582|4746->2603|4775->2604|4822->2623|4851->2624|4897->2642|5032->2749|5061->2750|5109->2770|5164->2797|5193->2798|5295->2872|5324->2873|5373->2894|5856->3349|5885->3350|5974->3411|6003->3412|6088->3470|6103->3476|6151->3503
                  LINES: 27->1|32->1|33->2|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|49->18|49->18|49->18|52->21|52->21|54->23|55->24|55->24|56->25|56->25|56->25|56->25|56->25|57->26|57->26|58->27|59->28|59->28|59->28|62->31|62->31|64->33|64->33|64->33|65->34|67->36|67->36|68->37|70->39|70->39|71->40|73->42|73->42|74->43|77->46|77->46|78->47|78->47|79->48|79->48|80->49|80->49|81->50|81->50|83->52|86->55|86->55|87->56|88->57|88->57|90->59|90->59|91->60|102->71|102->71|105->74|105->74|108->77|108->77|108->77
                  -- GENERATED --
              */
          