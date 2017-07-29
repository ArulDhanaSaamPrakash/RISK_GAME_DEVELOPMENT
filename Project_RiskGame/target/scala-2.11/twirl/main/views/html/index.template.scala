
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<head>
    <meta charset="UTF-8" />
    <title>RISK GAME - CARNEGIE MELLON UNIVERSITY</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
    <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.51*/routes/*11.57*/.Assets.at("stylesheets/demo.css")),format.raw/*11.91*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*12.51*/routes/*12.57*/.Assets.at("stylesheets/style.css")),format.raw/*12.92*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("stylesheets/animate-custom.css")),format.raw/*13.101*/("""" />
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.at("stylesheets/sweetalert.css")),format.raw/*14.97*/("""" />
    <script src=""""),_display_(/*15.19*/routes/*15.25*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*15.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("javascripts/sweetalert.min.js")),format.raw/*16.68*/("""" type="text/javascript"></script>

    <script>

    $(document).ready(function() """),format.raw/*20.34*/("""{"""),format.raw/*20.35*/("""

        """),format.raw/*22.9*/("""/*
         alert("page ready")
         $('#registerform').validate("""),format.raw/*24.38*/("""{"""),format.raw/*24.39*/(""" """),format.raw/*24.40*/("""// initialize plugin
         // rules & options,
         rules: """),format.raw/*26.17*/("""{"""),format.raw/*26.18*/("""
         """),format.raw/*27.10*/("""passwordsignup: """),format.raw/*27.26*/("""{"""),format.raw/*27.27*/("""
         """),format.raw/*28.10*/("""minlength: 6
         """),format.raw/*29.10*/("""}"""),format.raw/*29.11*/(""",
         passwordsignup_confirm: """),format.raw/*30.34*/("""{"""),format.raw/*30.35*/("""
         """),format.raw/*31.10*/("""minlength: 6
         """),format.raw/*32.10*/("""}"""),format.raw/*32.11*/("""
         """),format.raw/*33.10*/("""}"""),format.raw/*33.11*/(""",
         submitHandler: function(form) """),format.raw/*34.40*/("""{"""),format.raw/*34.41*/("""
         """),format.raw/*35.10*/("""alert("inside submit hadnler")
         // register();
         // your ajax would go here
         //alert('simulated ajax submit');
         return false;  // blocks regular submit since you have ajax
         """),format.raw/*40.10*/("""}"""),format.raw/*40.11*/("""
         """),format.raw/*41.10*/("""}"""),format.raw/*41.11*/(""");

         */

        $('#regsubmit').click(function()"""),format.raw/*45.41*/("""{"""),format.raw/*45.42*/("""
            """),format.raw/*46.13*/("""// alert("inside reg submit")
            if($("#registerform")[0].checkValidity()) """),format.raw/*47.55*/("""{"""),format.raw/*47.56*/("""
                """),format.raw/*48.17*/("""register();
                return false;
                // alert("fully validated");
                //register();
                //your form execution code
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""else """),format.raw/*53.19*/("""{"""),format.raw/*53.20*/("""

                """),format.raw/*55.17*/("""// alert("invalid form");
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""");

        $('#loginsubmit').click(function()"""),format.raw/*59.43*/("""{"""),format.raw/*59.44*/("""
            """),format.raw/*60.13*/("""// alert("inside reg submit")
            if($("#loginform")[0].checkValidity()) """),format.raw/*61.52*/("""{"""),format.raw/*61.53*/("""
                """),format.raw/*62.17*/("""login();
                return false;
                // alert("fully validated");
                //register();
                //your form execution code
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""else """),format.raw/*67.19*/("""{"""),format.raw/*67.20*/("""

                """),format.raw/*69.17*/("""// alert("invalid form");
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/("""
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""");

    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""");


    function resetForm($form) """),format.raw/*76.31*/("""{"""),format.raw/*76.32*/("""
        """),format.raw/*77.9*/("""$form.find('input:text, input:password, input:file, select, textarea').val('');
        $form.find('input:radio, input:checkbox')
                .removeAttr('checked').removeAttr('selected');

        $("#landrewid").hide();
        $("#andrewid").hide();
        $("#emailsignup").val('');

    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/("""function enableandrew(checkbox)
    """),format.raw/*88.5*/("""{"""),format.raw/*88.6*/("""
        """),format.raw/*89.9*/("""if (checkbox.checked)
        """),format.raw/*90.9*/("""{"""),format.raw/*90.10*/("""
            """),format.raw/*91.13*/("""//alert("checked");
            // document.getElementById('landrewid').style.display = 'block';
            // document.getElementById('andrewid').style.display = 'block';
            $("#landrewid").show();
            $("#andrewid").show();
            $("#andrewid").attr('required', true);
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/("""
        """),format.raw/*98.9*/("""else
        """),format.raw/*99.9*/("""{"""),format.raw/*99.10*/("""
            """),format.raw/*100.13*/("""//alert("unchecked")
            //  document.getElementById('landrewid').style.display = 'none';
            // document.getElementById('andrewid').style.display = 'none';
            $("#landrewid").hide();
            $("#andrewid").hide();
            $('#andrewid').val('');
            $("#andrewid").attr('required', false);
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""

    """),format.raw/*110.5*/("""function register()
    """),format.raw/*111.5*/("""{"""),format.raw/*111.6*/("""

        """),format.raw/*113.9*/("""if($('#passwordsignup').val() != $('#passwordsignup_confirm').val()) """),format.raw/*113.78*/("""{"""),format.raw/*113.79*/("""
            """),format.raw/*114.13*/("""$("#errormsg").show();
            //$('#passwordsignup').after('<p>Password is not matching</p>')
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/("""
        """),format.raw/*117.9*/("""else """),format.raw/*117.14*/("""{"""),format.raw/*117.15*/("""
            """),format.raw/*118.13*/("""$("#errormsg").hide();
            //debugger;
            var firstname = $('#firstname').val();
            var lastname = $('#lastname').val();
            var iscmu = $('#iscmu').checked ? '1' : '0';
            var andrewid = $('#andrewid').val();
            var password = $('#passwordsignup').val();
            var username = $('#emailsignup').val();

            var obj = """),format.raw/*127.23*/("""{"""),format.raw/*127.24*/("""

                """),format.raw/*129.17*/(""""username": username,
                "password": password,
                "firstname": firstname,
                "lastname": lastname,
                "iscmu": iscmu,
                "andrewid": andrewid
            """),format.raw/*135.13*/("""}"""),format.raw/*135.14*/(""";


            $.ajax("""),format.raw/*138.20*/("""{"""),format.raw/*138.21*/("""
                """),format.raw/*139.17*/("""type: 'POST',
                url: '"""),_display_(/*140.24*/routes/*140.30*/.RegisterController.register()),format.raw/*140.60*/("""',
                // data : JSON.stringify(obj),
                data: JSON.stringify(obj),
                async: false,
                cache: false,
                // dataType: 'json',
                contentType: 'application/json',
                success: function (data) """),format.raw/*147.42*/("""{"""),format.raw/*147.43*/("""
                    """),format.raw/*148.21*/("""// alert(data);
                    if(data=="success") """),format.raw/*149.41*/("""{"""),format.raw/*149.42*/("""
                        """),format.raw/*150.25*/("""resetForm($('#registerform'));
                        swal("Registration Successful!", "Now you can login!", "success");
                        window.location.href = "#tologin";
                    """),format.raw/*153.21*/("""}"""),format.raw/*153.22*/("""
                    """),format.raw/*154.21*/("""else
                    """),format.raw/*155.21*/("""{"""),format.raw/*155.22*/("""
                        """),format.raw/*156.25*/("""swal("OOPS!",data, "error");
                    """),format.raw/*157.21*/("""}"""),format.raw/*157.22*/("""
                    """),format.raw/*158.21*/("""// alert(data);
                    // $.('#id').val(data);
                    //setError('Call succedded');
                    //$('#test1').attr("src", data)
                """),format.raw/*162.17*/("""}"""),format.raw/*162.18*/(""",
                error: function (data) """),format.raw/*163.40*/("""{"""),format.raw/*163.41*/("""
                    """),format.raw/*164.21*/("""alert("error");
                    //setError('Make call failed');
                """),format.raw/*166.17*/("""}"""),format.raw/*166.18*/("""
            """),format.raw/*167.13*/("""}"""),format.raw/*167.14*/(""");
        """),format.raw/*168.9*/("""}"""),format.raw/*168.10*/("""
    """),format.raw/*169.5*/("""}"""),format.raw/*169.6*/("""

    """),format.raw/*171.5*/("""function login()
    """),format.raw/*172.5*/("""{"""),format.raw/*172.6*/("""
       """),format.raw/*173.8*/("""// $("#errormsg").hide();
        //debugger;

        var password = $('#password').val();
        var username = $('#username').val();

        var obj = """),format.raw/*179.19*/("""{"""),format.raw/*179.20*/("""

            """),format.raw/*181.13*/(""""username": username,
            "password": password
        """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/(""";


        $.ajax("""),format.raw/*186.16*/("""{"""),format.raw/*186.17*/("""
            """),format.raw/*187.13*/("""type: 'POST',
            url: '"""),_display_(/*188.20*/routes/*188.26*/.LoginController.login()),format.raw/*188.50*/("""',
            // data : JSON.stringify(obj),
            data: JSON.stringify(obj),
            async: false,
            cache: false,
            // dataType: 'json',
            contentType: 'application/json',
            success: function (data) """),format.raw/*195.38*/("""{"""),format.raw/*195.39*/("""
                """),format.raw/*196.17*/("""// alert(data);
                if(data=="success") """),format.raw/*197.37*/("""{"""),format.raw/*197.38*/("""
                   """),format.raw/*198.20*/("""// resetForm($('#registerform'));
                    $("#dashform").submit()
                    //$('#dashlink').click();
                    //swal("Registration Successful!", "Now you can login!", "success");
                    //window.location.href = "#tologin";
                """),format.raw/*203.17*/("""}"""),format.raw/*203.18*/("""
                """),format.raw/*204.17*/("""else
                """),format.raw/*205.17*/("""{"""),format.raw/*205.18*/("""
                    """),format.raw/*206.21*/("""swal("OOPS!",data, "error");
                """),format.raw/*207.17*/("""}"""),format.raw/*207.18*/("""
                """),format.raw/*208.17*/("""// alert(data);
                // $.('#id').val(data);
                //setError('Call succedded');
                //$('#test1').attr("src", data)
            """),format.raw/*212.13*/("""}"""),format.raw/*212.14*/(""",
            error: function (data) """),format.raw/*213.36*/("""{"""),format.raw/*213.37*/("""
                """),format.raw/*214.17*/("""alert("error");
                //setError('Make call failed');
            """),format.raw/*216.13*/("""}"""),format.raw/*216.14*/("""
        """),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""");
    """),format.raw/*218.5*/("""}"""),format.raw/*218.6*/("""




"""),format.raw/*223.1*/("""</script>


</head>
<body>
    <div class="container">
        <form  id="dashform" hidden method ="GET"  action=""""),_display_(/*229.61*/routes/*229.67*/.DashboardController.viewDashboard()),format.raw/*229.103*/("""">
            </form>
            <!-- Codrops top bar -->
        <div class="codrops-top">

            <div class="clr"></div>
        </div><!--/ Codrops top bar -->
        <header>
            <a id='dashlink' style="visibility: hidden" href='/dashboard' > aaa </a>
            <h1>RISK GAME - <span style="color:red;">Carnegie Mellon University</span></h1>

                <a href="#" style="color: #002851; text-decoration: underline;font-size: 18px !important;;" onclick="window.open('/assets/images/Players_manual.pdf', '_blank', 'toolbar=0,location=0,menubar=0');">Read Instructions</a>
                <div style="height: 30px"></div>
                <div style="font-size: 18px"> Best viewed in Google Chrome</div>
            <div> Preferred screen resolution:</div>
            <div> Windows/Linux/Mac : 1366 X 768</div>

        </header>
        <section>
            <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                <a class="hiddenanchor" id="toregister"></a>
                <a class="hiddenanchor" id="tologin"></a>
                <div id="wrapper">
                    <div id="login" class="animate form">
                        <form  id="loginform" method ="POST"  action=""""),_display_(/*254.72*/routes/*254.78*/.LoginController.login()),format.raw/*254.102*/("""">
                            <h1>Log in</h1>
                            <p>
                                <label for="username" class="uname" data-icon="u" > Your email id </label>
                                <input id="username" name="username" required="required" type="email" placeholder="myandrewid@cmu.andrew.edu"/>
                            </p>
                            <p>
                                <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" />
                            </p>

                            <p class="login button">
                                <input type="submit" id="loginsubmit" value="Login" />
                            </p>
                            <p class="change_link">
									Not a member yet ?
                                <a href="#toregister" class="to_register">REGISTER</a>
                            </p>
                        </form>

                    </div>

                    <div id="register" class="animate form">
                        <form id="registerform">
                            <h1> Sign up </h1>
                            <p>
                                <label for="emailsignup" class="youmail" data-icon="e" > Your email(This will be your username)</label>
                                <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="andrewid@andrew.cmu.edu"/>
                            </p>
                            <p>
                                <label for="firstname" class="uname" data-icon="u" > First Name</label>
                                <input id="firstname" name="firstname" required="required" type="text" placeholder="firstname"/>
                            </p>
                            <p>
                                <label for="lastname" class="uname" data-icon="u" > Last Name</label>
                                <input id="lastname" name="lastname" required="required" type="text" placeholder="lastname"/>
                            </p>

                            <p>
                                <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="eg. X8df!90EO"/>
                            </p>
                            <p id="errormsg" hidden>Password is not matching</p>
                            <p>
                                <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                            </p>
                            <p>
                                <label for="iscmu" class="uname" > Are you a CMU Student</label>
                                <input id="iscmu" name="iscmu" type="checkbox" onchange="enableandrew(this)" />
                            </p>
                            <p>
                                <label id="landrewid" for="andrewid" hidden class="uname"  data-icon="u" > Andrew ID</label>
                                <input id="andrewid" name="andrewid"  hidden type="text" placeholder="andrewid"/>
                            </p>

                            <p class="signin button">
                                <input type="submit" id="regsubmit" value="Sign up" />
                            </p>
                            <p class="change_link">
									Already a member ?
                                <a href="#tologin" class="to_register"> Go and log in </a>
                            </p>
                        </form>
                    </div>
                </div>
            </div>

        </section>
    </div>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Jul 28 15:10:22 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/index.scala.html
                  HASH: d41ada9d572d0fdf1a85fda518ee7c13cb5fb07e
                  MATRIX: 827->1|1376->523|1391->529|1446->563|1528->618|1543->624|1599->659|1681->714|1696->720|1762->764|1844->819|1859->825|1920->865|1970->888|1985->894|2051->939|2131->992|2146->998|2210->1041|2321->1124|2350->1125|2387->1135|2484->1204|2513->1205|2542->1206|2636->1272|2665->1273|2703->1283|2747->1299|2776->1300|2814->1310|2864->1332|2893->1333|2956->1368|2985->1369|3023->1379|3073->1401|3102->1402|3140->1412|3169->1413|3238->1454|3267->1455|3305->1465|3545->1677|3574->1678|3612->1688|3641->1689|3726->1746|3755->1747|3796->1760|3908->1844|3937->1845|3982->1862|4182->2034|4211->2035|4244->2040|4273->2041|4319->2059|4385->2097|4414->2098|4450->2107|4479->2108|4553->2154|4582->2155|4623->2168|4732->2249|4761->2250|4806->2267|5003->2436|5032->2437|5065->2442|5094->2443|5140->2461|5206->2499|5235->2500|5271->2509|5300->2510|5335->2518|5363->2519|5426->2554|5455->2555|5491->2564|5815->2861|5843->2862|5876->2868|5939->2904|5967->2905|6003->2914|6060->2944|6089->2945|6130->2958|6460->3261|6489->3262|6525->3271|6565->3284|6594->3285|6636->3298|7004->3638|7034->3639|7067->3644|7096->3645|7130->3651|7182->3675|7211->3676|7249->3686|7347->3755|7377->3756|7419->3769|7554->3876|7584->3877|7621->3886|7655->3891|7685->3892|7727->3905|8139->4288|8169->4289|8216->4307|8464->4526|8494->4527|8546->4550|8576->4551|8622->4568|8687->4605|8703->4611|8755->4641|9064->4921|9094->4922|9144->4943|9229->4999|9259->5000|9313->5025|9543->5226|9573->5227|9623->5248|9677->5273|9707->5274|9761->5299|9839->5348|9869->5349|9919->5370|10126->5548|10156->5549|10226->5590|10256->5591|10306->5612|10419->5696|10449->5697|10491->5710|10521->5711|10560->5722|10590->5723|10623->5728|10652->5729|10686->5735|10735->5756|10764->5757|10800->5765|10985->5921|11015->5922|11058->5936|11149->5999|11179->6000|11227->6019|11257->6020|11299->6033|11360->6066|11376->6072|11422->6096|11703->6348|11733->6349|11779->6366|11860->6418|11890->6419|11939->6439|12254->6725|12284->6726|12330->6743|12380->6764|12410->6765|12460->6786|12534->6831|12564->6832|12610->6849|12801->7011|12831->7012|12897->7049|12927->7050|12973->7067|13078->7143|13108->7144|13145->7153|13175->7154|13210->7161|13239->7162|13272->7167|13415->7282|13431->7288|13490->7324|14859->8665|14875->8671|14922->8695
                  LINES: 32->2|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|50->20|50->20|52->22|54->24|54->24|54->24|56->26|56->26|57->27|57->27|57->27|58->28|59->29|59->29|60->30|60->30|61->31|62->32|62->32|63->33|63->33|64->34|64->34|65->35|70->40|70->40|71->41|71->41|75->45|75->45|76->46|77->47|77->47|78->48|83->53|83->53|83->53|83->53|85->55|86->56|86->56|87->57|87->57|89->59|89->59|90->60|91->61|91->61|92->62|97->67|97->67|97->67|97->67|99->69|100->70|100->70|101->71|101->71|103->73|103->73|106->76|106->76|107->77|115->85|115->85|117->87|118->88|118->88|119->89|120->90|120->90|121->91|127->97|127->97|128->98|129->99|129->99|130->100|137->107|137->107|138->108|138->108|140->110|141->111|141->111|143->113|143->113|143->113|144->114|146->116|146->116|147->117|147->117|147->117|148->118|157->127|157->127|159->129|165->135|165->135|168->138|168->138|169->139|170->140|170->140|170->140|177->147|177->147|178->148|179->149|179->149|180->150|183->153|183->153|184->154|185->155|185->155|186->156|187->157|187->157|188->158|192->162|192->162|193->163|193->163|194->164|196->166|196->166|197->167|197->167|198->168|198->168|199->169|199->169|201->171|202->172|202->172|203->173|209->179|209->179|211->181|213->183|213->183|216->186|216->186|217->187|218->188|218->188|218->188|225->195|225->195|226->196|227->197|227->197|228->198|233->203|233->203|234->204|235->205|235->205|236->206|237->207|237->207|238->208|242->212|242->212|243->213|243->213|244->214|246->216|246->216|247->217|247->217|248->218|248->218|253->223|259->229|259->229|259->229|284->254|284->254|284->254
                  -- GENERATED --
              */
          