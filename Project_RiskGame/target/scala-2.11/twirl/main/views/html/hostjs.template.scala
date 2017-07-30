
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hostjs_Scope0 {
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

class hostjs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""$(function() """),format.raw/*1.14*/("""{"""),format.raw/*1.15*/("""

    """),format.raw/*3.5*/("""var username = $('#username').val();
    var gameid = $('#gameid').val();
    // get websocket class, firefox has a different way to get it
    var WS = window['MozWebSocket'] ? window['MozWebSocket'] : WebSocket;

    // open socket on page load
    var socket = new WS('"""),_display_(/*9.27*/routes/*9.33*/.Application.wsInterface().webSocketURL(request)),format.raw/*9.81*/("""');

    //this list will be used to append joining players
    var userList = $('#userList');

    var writeMessages = function (event) """),format.raw/*14.42*/("""{"""),format.raw/*14.43*/("""
        """),format.raw/*15.9*/("""var model = event.data;

        //model is not coming as Json so have to use this jquery json parser
        model = jQuery.parseJSON(model);


        if (model.type == "joined") """),format.raw/*21.37*/("""{"""),format.raw/*21.38*/("""
            """),format.raw/*22.13*/("""var users = model.joinedUsers;
            userList.html("");
            for (i = 0; i < users.length; i++) """),format.raw/*24.48*/("""{"""),format.raw/*24.49*/("""
                """),format.raw/*25.17*/("""userList.append('<li class="list-group-item" id="'+ users[i] +'">' + users[i].split("-")[0] + '</li>');
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""

        """),format.raw/*29.9*/("""else if (model.type == "leaving") """),format.raw/*29.43*/("""{"""),format.raw/*29.44*/("""
            """),format.raw/*30.13*/("""var users = model.joinedUsers;
            var leavinguser = model.leavingUser;

            var listItemToBeRemoved = $(userList).find('#' + leavinguser).remove();
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""

        """),format.raw/*36.9*/("""else if (model.type == "redirect") """),format.raw/*36.44*/("""{"""),format.raw/*36.45*/("""

           """),format.raw/*38.12*/("""$('#frmHidden').submit();

        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""

        """),format.raw/*42.9*/("""else """),format.raw/*42.14*/("""{"""),format.raw/*42.15*/("""
            """),format.raw/*43.13*/("""var name = model.name;
            $('#lblCount').text(count);
            $('#divJoined').prepend('<p>' + name + '</p>');

        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
    """),format.raw/*48.5*/("""}"""),format.raw/*48.6*/("""

"""),format.raw/*50.1*/("""var initConnection = function (event) """),format.raw/*50.39*/("""{"""),format.raw/*50.40*/("""
"""),format.raw/*51.1*/("""registerGameId();
publishMyPresence();
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/("""var publishMyPresence = function (event) """),format.raw/*55.42*/("""{"""),format.raw/*55.43*/("""
"""),format.raw/*56.1*/("""//push to socket on first page load of any user
var data = JSON.stringify("""),format.raw/*57.27*/("""{"""),format.raw/*57.28*/(""""gameid":gameid, "type": "joined", "player": """),format.raw/*57.73*/("""{"""),format.raw/*57.74*/(""""name": "someuser", "team": "somecode""""),format.raw/*57.112*/("""}"""),format.raw/*57.113*/("""}"""),format.raw/*57.114*/(""");
socket.send(data);
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/("""var registerGameId = function (event) """),format.raw/*61.39*/("""{"""),format.raw/*61.40*/("""
"""),format.raw/*62.1*/("""//push to socket on first page load of any user
var data = JSON.stringify("""),format.raw/*63.27*/("""{"""),format.raw/*63.28*/(""""gameid":gameid, "type": "RegisterGameId""""),format.raw/*63.69*/("""}"""),format.raw/*63.70*/(""");
socket.send(data);
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""


    """),format.raw/*68.5*/("""//read message from socket
    socket.onmessage = writeMessages;

    //without this I am getting exception that CONNECTION NOT ESTABLISHED
    socket.onopen = initConnection;


    $('#btnJoin').click(function (event) """),format.raw/*75.42*/("""{"""),format.raw/*75.43*/("""

        """),format.raw/*77.9*/("""var name = $('#txtName').val();
        var code = $('#txtCode').val();


        var data = JSON.stringify("""),format.raw/*81.35*/("""{"""),format.raw/*81.36*/(""""name": name, "team": code"""),format.raw/*81.62*/("""}"""),format.raw/*81.63*/(""");

        //push to socket
        socket.send(data);

        $('#txtName').val('');
        $('#txtCode').val('');

        $('#txtName').attr('hidden', true);
        $('#txtCode').attr('hidden', true);
        $('#divPlayerStatus').attr('hidden', false);
        $('#btnLeave').attr('hidden', false);
        $('#btnJoin').attr('hidden', true);
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""");


    //Event handler for start game event
    $('#btnStart').click(function(e)"""),format.raw/*98.37*/("""{"""),format.raw/*98.38*/("""

        """),format.raw/*100.9*/("""var data = JSON.stringify("""),format.raw/*100.35*/("""{"""),format.raw/*100.36*/(""""gameid": gameid, "type": "StartGame", "player": """),format.raw/*100.85*/("""{"""),format.raw/*100.86*/(""""username": username"""),format.raw/*100.106*/("""}"""),format.raw/*100.107*/("""}"""),format.raw/*100.108*/(""");
        socket.send(data);
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""");


    $('#btnLeave').click(function (e) """),format.raw/*105.39*/("""{"""),format.raw/*105.40*/("""
        """),format.raw/*106.9*/("""var username = $('#username').val();

        var data = JSON.stringify("""),format.raw/*108.35*/("""{"""),format.raw/*108.36*/(""""type": "leaving", "player": """),format.raw/*108.65*/("""{"""),format.raw/*108.66*/(""""username": username"""),format.raw/*108.86*/("""}"""),format.raw/*108.87*/("""}"""),format.raw/*108.88*/(""");
        socket.send(data);

        //ajax call to logout of session
        // """),format.raw/*112.24*/("""
        """),format.raw/*113.9*/("""//     """),format.raw/*113.33*/("""
        """),format.raw/*114.9*/("""//     """),format.raw/*114.34*/("""
        """),format.raw/*115.9*/("""//     """),format.raw/*115.62*/("""
        """),format.raw/*116.9*/("""//     """),format.raw/*116.46*/("""
        """),format.raw/*117.9*/("""//     """),format.raw/*117.52*/("""
        """),format.raw/*118.9*/("""//     """),format.raw/*118.36*/("""
        """),format.raw/*119.9*/("""// """),format.raw/*119.19*/("""

        """),format.raw/*121.9*/("""$.ajax("""),format.raw/*121.16*/("""{"""),format.raw/*121.17*/("""
            """),format.raw/*122.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*124.19*/("""{"""),format.raw/*124.20*/("""'username': username"""),format.raw/*124.40*/("""}"""),format.raw/*124.41*/(""",
            success:function(data)
            """),format.raw/*126.13*/("""{"""),format.raw/*126.14*/("""
                """),format.raw/*127.17*/("""window.location.replace("/");
            """),format.raw/*128.13*/("""}"""),format.raw/*128.14*/("""

        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/(""");
    """),format.raw/*131.5*/("""}"""),format.raw/*131.6*/(""");
"""),format.raw/*132.1*/("""}"""),format.raw/*132.2*/(""");"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object hostjs extends hostjs_Scope0.hostjs
              /*
                  -- GENERATED --
                  DATE: Sun Jul 30 00:08:46 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/hostjs.scala.html
                  HASH: 6d8ddc82d98a408525f30ddaccd0d35b0cf11ea5
                  MATRIX: 829->0|869->13|897->14|929->20|1228->293|1242->299|1310->347|1475->484|1504->485|1540->494|1749->675|1778->676|1819->689|1956->798|1985->799|2030->816|2174->932|2203->933|2239->942|2268->943|2305->953|2367->987|2396->988|2437->1001|2637->1174|2666->1175|2703->1185|2766->1220|2795->1221|2836->1234|2898->1269|2927->1270|2964->1280|2997->1285|3026->1286|3067->1299|3226->1431|3255->1432|3287->1437|3315->1438|3344->1440|3410->1478|3439->1479|3467->1480|3533->1519|3561->1520|3590->1522|3659->1563|3688->1564|3716->1565|3818->1639|3847->1640|3920->1685|3949->1686|4016->1724|4046->1725|4076->1726|4125->1748|4153->1749|4182->1751|4248->1789|4277->1790|4305->1791|4407->1865|4436->1866|4505->1907|4534->1908|4583->1930|4611->1931|4645->1938|4892->2157|4921->2158|4958->2168|5094->2276|5123->2277|5177->2303|5206->2304|5588->2659|5616->2660|5726->2742|5755->2743|5793->2753|5848->2779|5878->2780|5956->2829|5986->2830|6036->2850|6067->2851|6098->2852|6160->2886|6189->2887|6261->2930|6291->2931|6328->2940|6429->3012|6459->3013|6517->3042|6547->3043|6596->3063|6626->3064|6656->3065|6768->3160|6805->3169|6841->3193|6878->3202|6914->3227|6951->3236|6987->3289|7024->3298|7060->3335|7097->3344|7133->3387|7170->3396|7206->3423|7243->3432|7275->3442|7313->3452|7349->3459|7379->3460|7421->3473|7508->3531|7538->3532|7587->3552|7617->3553|7695->3602|7725->3603|7771->3620|7842->3662|7872->3663|7910->3673|7940->3674|7975->3681|8004->3682|8035->3685|8064->3686
                  LINES: 32->1|32->1|32->1|34->3|40->9|40->9|40->9|45->14|45->14|46->15|52->21|52->21|53->22|55->24|55->24|56->25|57->26|57->26|58->27|58->27|60->29|60->29|60->29|61->30|65->34|65->34|67->36|67->36|67->36|69->38|71->40|71->40|73->42|73->42|73->42|74->43|78->47|78->47|79->48|79->48|81->50|81->50|81->50|82->51|84->53|84->53|86->55|86->55|86->55|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|94->63|94->63|96->65|96->65|99->68|106->75|106->75|108->77|112->81|112->81|112->81|112->81|125->94|125->94|129->98|129->98|131->100|131->100|131->100|131->100|131->100|131->100|131->100|131->100|133->102|133->102|136->105|136->105|137->106|139->108|139->108|139->108|139->108|139->108|139->108|139->108|143->112|144->113|144->113|145->114|145->114|146->115|146->115|147->116|147->116|148->117|148->117|149->118|149->118|150->119|150->119|152->121|152->121|152->121|153->122|155->124|155->124|155->124|155->124|157->126|157->126|158->127|159->128|159->128|161->130|161->130|162->131|162->131|163->132|163->132
                  -- GENERATED --
              */
          