
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ws_Scope0 {
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

class ws extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

    var writeMessages = function (event) """),format.raw/*11.42*/("""{"""),format.raw/*11.43*/("""
        """),format.raw/*12.9*/("""var model = event.data;

        //model is not coming as Json so have to use this jquery json parser
        model = jQuery.parseJSON(model);

        if (model.type == "joined") """),format.raw/*17.37*/("""{"""),format.raw/*17.38*/("""
            """),format.raw/*18.13*/("""var users = model.joinedUsers;
            $('#divJoined').html("");
            $("#grid-joined").empty();

            var tmp_username = username.split("@")[0];

          //  $('#divJoined').append('<p><b>' + tmp_username + ' (you)' + '</b></p>');

            for (i = 0; i < users.length; i++) """),format.raw/*26.48*/("""{"""),format.raw/*26.49*/("""
                """),format.raw/*27.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*27.61*/("""{"""),format.raw/*27.62*/("""
                    """),format.raw/*28.21*/("""$('#divJoined').append('<p>' + users[i].split("-")[0] + '</p>');

                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

        """),format.raw/*34.9*/("""else if (model.type == "leaving") """),format.raw/*34.43*/("""{"""),format.raw/*34.44*/("""
            """),format.raw/*35.13*/("""var users = model.joinedUsers;
            var leavinguser = model.leavingUser;
            $('#divJoined').html("");
            $("#grid-joined").empty();
            if (username == leavinguser) """),format.raw/*39.42*/("""{"""),format.raw/*39.43*/("""
                """),format.raw/*40.17*/("""$('#divJoined').append('<p><b>' + username + '(You have left)' + '</b></p>');

            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/("""
            """),format.raw/*43.13*/("""else """),format.raw/*43.18*/("""{"""),format.raw/*43.19*/("""
                """),format.raw/*44.17*/("""$('#divJoined').append('<p><b>' + username + '(You)' + '</b></p>');
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""for (i = 0; i < users.length; i++) """),format.raw/*46.48*/("""{"""),format.raw/*46.49*/("""
                """),format.raw/*47.17*/("""if (users[i] != username) """),format.raw/*47.43*/("""{"""),format.raw/*47.44*/("""
                    """),format.raw/*48.21*/("""if (users[i] === leavinguser) """),format.raw/*48.51*/("""{"""),format.raw/*48.52*/("""
                        """),format.raw/*49.25*/("""$('#divJoined').append('<p>' + users[i] + ' left' + '</p>');

                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/("""
                    """),format.raw/*52.21*/("""else """),format.raw/*52.26*/("""{"""),format.raw/*52.27*/("""
                        """),format.raw/*53.25*/("""$('#divJoined').append('<p>' + users[i] + '</p>');

                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/("""
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""
            """),format.raw/*57.13*/("""}"""),format.raw/*57.14*/("""
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

        """),format.raw/*60.9*/("""else if (model.type == "redirect") """),format.raw/*60.44*/("""{"""),format.raw/*60.45*/("""
        """),format.raw/*61.9*/("""var isObserver = $('#isobserver').val()=="true"?true:false;
            if(isObserver)"""),format.raw/*62.27*/("""{"""),format.raw/*62.28*/("""
                """),format.raw/*63.17*/("""$('#frmObserver').submit();
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
            """),format.raw/*65.13*/("""else"""),format.raw/*65.17*/("""{"""),format.raw/*65.18*/("""
                """),format.raw/*66.17*/("""$('#frmHidden').submit();
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""

        """),format.raw/*70.9*/("""else """),format.raw/*70.14*/("""{"""),format.raw/*70.15*/("""
            """),format.raw/*71.13*/("""var name = model.name;
            $('#lblCount').text(count);
            $('#divJoined').prepend('<p>' + name + '</p>');
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""

"""),format.raw/*77.1*/("""var initConnection = function (event) """),format.raw/*77.39*/("""{"""),format.raw/*77.40*/("""
"""),format.raw/*78.1*/("""registerGameId();
publishMyPresence();
"""),format.raw/*80.1*/("""}"""),format.raw/*80.2*/("""

"""),format.raw/*82.1*/("""var publishMyPresence = function (event) """),format.raw/*82.42*/("""{"""),format.raw/*82.43*/("""
"""),format.raw/*83.1*/("""//push to socket on first page load of any user
var data = JSON.stringify("""),format.raw/*84.27*/("""{"""),format.raw/*84.28*/(""""gameid":gameid, "type": "joined", "player": """),format.raw/*84.73*/("""{"""),format.raw/*84.74*/(""""name": "someuser", "team": "somecode""""),format.raw/*84.112*/("""}"""),format.raw/*84.113*/("""}"""),format.raw/*84.114*/(""");
socket.send(data);
"""),format.raw/*86.1*/("""}"""),format.raw/*86.2*/("""

"""),format.raw/*88.1*/("""var registerGameId = function (event) """),format.raw/*88.39*/("""{"""),format.raw/*88.40*/("""
"""),format.raw/*89.1*/("""//push to socket on first page load of any user
var data = JSON.stringify("""),format.raw/*90.27*/("""{"""),format.raw/*90.28*/(""""gameid":gameid, "type": "RegisterGameId""""),format.raw/*90.69*/("""}"""),format.raw/*90.70*/(""");
socket.send(data);
"""),format.raw/*92.1*/("""}"""),format.raw/*92.2*/("""

    """),format.raw/*94.5*/("""//read message from socket
    socket.onmessage = writeMessages;

    //without this I am getting exception that CONNECTION NOT ESTABLISHED
    socket.onopen = initConnection;


    $('#btnJoin').click(function (event) """),format.raw/*101.42*/("""{"""),format.raw/*101.43*/("""

        """),format.raw/*103.9*/("""var name = $('#txtName').val();
        var code = $('#txtCode').val();
        var uname =  $('#username').val();

        var message = name + "::" + code;

        var data = JSON.stringify("""),format.raw/*109.35*/("""{"""),format.raw/*109.36*/(""""name": uname, "team": code"""),format.raw/*109.63*/("""}"""),format.raw/*109.64*/(""");

        //push to socket
        socket.send(data);

        $('#txtName').val('');
        $('#txtCode').val('');

        $('#txtName').attr('hidden', true);
        $('#txtCode').attr('hidden', true);
        $('#divPlayerStatus').attr('hidden', false);
        $('#btnLeave').attr('hidden', false);
        $('#btnJoin').attr('hidden', true);
    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/(""");


    $('#btnLeave').click(function (e) """),format.raw/*125.39*/("""{"""),format.raw/*125.40*/("""
        """),format.raw/*126.9*/("""var username = $('#username').val();

        var data = JSON.stringify("""),format.raw/*128.35*/("""{"""),format.raw/*128.36*/(""""type": "leaving", "player": """),format.raw/*128.65*/("""{"""),format.raw/*128.66*/(""""username": username"""),format.raw/*128.86*/("""}"""),format.raw/*128.87*/("""}"""),format.raw/*128.88*/(""");
        socket.send(data);

        //ajax call to logout of session
        // """),format.raw/*132.24*/("""
        """),format.raw/*133.9*/("""//     """),format.raw/*133.33*/("""
        """),format.raw/*134.9*/("""//     """),format.raw/*134.34*/("""
        """),format.raw/*135.9*/("""//     """),format.raw/*135.62*/("""
        """),format.raw/*136.9*/("""//     """),format.raw/*136.46*/("""
        """),format.raw/*137.9*/("""//     """),format.raw/*137.52*/("""
        """),format.raw/*138.9*/("""//     """),format.raw/*138.36*/("""
        """),format.raw/*139.9*/("""// """),format.raw/*139.19*/("""

        """),format.raw/*141.9*/("""$.ajax("""),format.raw/*141.16*/("""{"""),format.raw/*141.17*/("""
            """),format.raw/*142.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*144.19*/("""{"""),format.raw/*144.20*/("""'username': username"""),format.raw/*144.40*/("""}"""),format.raw/*144.41*/(""",
            success:function(data)
            """),format.raw/*146.13*/("""{"""),format.raw/*146.14*/("""
                """),format.raw/*147.17*/("""window.location.replace("/");
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/("""
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/(""");
    """),format.raw/*150.5*/("""}"""),format.raw/*150.6*/(""");
"""),format.raw/*151.1*/("""}"""),format.raw/*151.2*/(""");"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object ws extends ws_Scope0.ws
              /*
                  -- GENERATED --
                  DATE: Thu Jul 06 14:56:15 EDT 2017
                  SOURCE: /Users/Arul/Downloads/Project_RiskGame/app/views/ws.scala.html
                  HASH: c0de346de85990e8910a0f7927efcd439ef6e7e2
                  MATRIX: 821->0|861->13|889->14|921->20|1220->293|1234->299|1302->347|1376->393|1405->394|1441->403|1649->583|1678->584|1719->597|2047->898|2076->899|2121->916|2193->960|2222->961|2271->982|2381->1064|2410->1065|2451->1078|2480->1079|2516->1088|2545->1089|2582->1099|2644->1133|2673->1134|2714->1147|2940->1345|2969->1346|3014->1363|3133->1454|3162->1455|3203->1468|3236->1473|3265->1474|3310->1491|3418->1571|3447->1572|3488->1585|3551->1620|3580->1621|3625->1638|3679->1664|3708->1665|3757->1686|3815->1716|3844->1717|3897->1742|4007->1824|4036->1825|4085->1846|4118->1851|4147->1852|4200->1877|4300->1949|4329->1950|4374->1967|4403->1968|4444->1981|4473->1982|4509->1991|4538->1992|4575->2002|4638->2037|4667->2038|4703->2047|4817->2133|4846->2134|4891->2151|4959->2191|4988->2192|5029->2205|5061->2209|5090->2210|5135->2227|5201->2265|5230->2266|5266->2275|5295->2276|5332->2286|5365->2291|5394->2292|5435->2305|5593->2436|5622->2437|5654->2442|5682->2443|5711->2445|5777->2483|5806->2484|5834->2485|5900->2524|5928->2525|5957->2527|6026->2568|6055->2569|6083->2570|6185->2644|6214->2645|6287->2690|6316->2691|6383->2729|6413->2730|6443->2731|6492->2753|6520->2754|6549->2756|6615->2794|6644->2795|6672->2796|6774->2870|6803->2871|6872->2912|6901->2913|6950->2935|6978->2936|7011->2942|7259->3161|7289->3162|7327->3172|7549->3365|7579->3366|7635->3393|7665->3394|8048->3749|8077->3750|8149->3793|8179->3794|8216->3803|8317->3875|8347->3876|8405->3905|8435->3906|8484->3926|8514->3927|8544->3928|8656->4023|8693->4032|8729->4056|8766->4065|8802->4090|8839->4099|8875->4152|8912->4161|8948->4198|8985->4207|9021->4250|9058->4259|9094->4286|9131->4295|9163->4305|9201->4315|9237->4322|9267->4323|9309->4336|9396->4394|9426->4395|9475->4415|9505->4416|9583->4465|9613->4466|9659->4483|9730->4525|9760->4526|9797->4535|9827->4536|9862->4543|9891->4544|9922->4547|9951->4548
                  LINES: 32->1|32->1|32->1|34->3|40->9|40->9|40->9|42->11|42->11|43->12|48->17|48->17|49->18|57->26|57->26|58->27|58->27|58->27|59->28|61->30|61->30|62->31|62->31|63->32|63->32|65->34|65->34|65->34|66->35|70->39|70->39|71->40|73->42|73->42|74->43|74->43|74->43|75->44|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|82->51|82->51|83->52|83->52|83->52|84->53|86->55|86->55|87->56|87->56|88->57|88->57|89->58|89->58|91->60|91->60|91->60|92->61|93->62|93->62|94->63|95->64|95->64|96->65|96->65|96->65|97->66|98->67|98->67|99->68|99->68|101->70|101->70|101->70|102->71|105->74|105->74|106->75|106->75|108->77|108->77|108->77|109->78|111->80|111->80|113->82|113->82|113->82|114->83|115->84|115->84|115->84|115->84|115->84|115->84|115->84|117->86|117->86|119->88|119->88|119->88|120->89|121->90|121->90|121->90|121->90|123->92|123->92|125->94|132->101|132->101|134->103|140->109|140->109|140->109|140->109|153->122|153->122|156->125|156->125|157->126|159->128|159->128|159->128|159->128|159->128|159->128|159->128|163->132|164->133|164->133|165->134|165->134|166->135|166->135|167->136|167->136|168->137|168->137|169->138|169->138|170->139|170->139|172->141|172->141|172->141|173->142|175->144|175->144|175->144|175->144|177->146|177->146|178->147|179->148|179->148|180->149|180->149|181->150|181->150|182->151|182->151
                  -- GENERATED --
              */
          