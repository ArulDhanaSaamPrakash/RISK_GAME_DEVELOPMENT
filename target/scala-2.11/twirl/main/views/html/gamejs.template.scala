
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gamejs_Scope0 {
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

class gamejs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""$(function () """),format.raw/*1.15*/("""{"""),format.raw/*1.16*/("""

    """),format.raw/*3.5*/("""var myTurn = "false";
    //$('#txtMessage').attr("placeholder", "Enter message (upto 150 chars) and hit return.");


    var timerTime = parseInt($('#moveTime').val()) * 60;

    //this flag will be used to know if the player performed any step after timeout
    var timeout = false,
        stopped = false;
    var clock = $('.mytimer').FlipClock("""),format.raw/*12.41*/("""{"""),format.raw/*12.42*/("""
        """),format.raw/*13.9*/("""clockFace: 'MinuteCounter',
        countdown: true,
        stop: function () """),format.raw/*15.27*/("""{"""),format.raw/*15.28*/("""

            """),format.raw/*17.13*/("""if (!timeout && !stopped) """),format.raw/*17.39*/("""{"""),format.raw/*17.40*/("""
"""),format.raw/*18.1*/("""var turnNo = parseInt($('#turnNo').html());
var maxTurns = document.getElementById('labelTurns').innerText;
if(turnNo <= maxTurns)"""),format.raw/*20.23*/("""{"""),format.raw/*20.24*/("""
                """),format.raw/*21.17*/("""timeout = true;
                sendTimeoutMessage();

                $('#btnSkipTimeout').trigger('click');

                setTimer(timerTime);
                resetTimer();
                timer.hide();
                //In case of timeout, next player should get his turn
                publishTurnNumber();
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/(""");


    //This function should be called whenever each player gets his/her turn
    var startTimer = function () """),format.raw/*38.34*/("""{"""),format.raw/*38.35*/("""
        """),format.raw/*39.9*/("""clock.setTime(timerTime);
        clock.start();
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""

    """),format.raw/*43.5*/("""var setTimer = function (time) """),format.raw/*43.36*/("""{"""),format.raw/*43.37*/("""
        """),format.raw/*44.9*/("""clock.setTime(time);
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""

    """),format.raw/*47.5*/("""var stopTimer = function () """),format.raw/*47.33*/("""{"""),format.raw/*47.34*/("""
        """),format.raw/*48.9*/("""stopped = true;
        clock.stop();
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

    """),format.raw/*52.5*/("""var resetTimer = function () """),format.raw/*52.34*/("""{"""),format.raw/*52.35*/("""
        """),format.raw/*53.9*/("""stopped = false;
        timeout = false;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""// startTimer();

var onTimeout=function()"""),format.raw/*59.25*/("""{"""),format.raw/*59.26*/("""

                    """),format.raw/*61.21*/("""var obj = """),format.raw/*61.31*/("""{"""),format.raw/*61.32*/("""
                        """),format.raw/*62.25*/("""'gameid':gameid,
                        'turnno':parseInt($('#turnNo').html())
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/(""";
                

                $.ajax("""),format.raw/*67.24*/("""{"""),format.raw/*67.25*/("""
                    """),format.raw/*68.21*/("""type: 'POST',
                    url: '"""),_display_(/*69.28*/routes/*69.34*/.GameController.updateTimeOut()),format.raw/*69.65*/("""',
                    // data : JSON.stringify(obj),
                    data: JSON.stringify(obj),
                    async: false,
                    contentType: 'application/json',
                    success: function (data) """),format.raw/*74.46*/("""{"""),format.raw/*74.47*/("""
                        
                                            
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/(""",

                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/(""");
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""


    """),format.raw/*83.5*/("""var sendTimeoutMessage = function () """),format.raw/*83.42*/("""{"""),format.raw/*83.43*/("""
    """),format.raw/*84.5*/("""console.log("reacghed time out");
onTimeout();
    console.log("called successfully");
        myTurn = "false";
        stopTimer();
        resetTimer();
        timer.hide();
        var data = JSON.stringify("""),format.raw/*91.35*/("""{"""),format.raw/*91.36*/(""""gameid": gameid, "type": "Timeout", "player": """),format.raw/*91.83*/("""{"""),format.raw/*91.84*/(""""username": username"""),format.raw/*91.104*/("""}"""),format.raw/*91.105*/("""}"""),format.raw/*91.106*/(""");
        socket.send(data);

        //updates turns completed count because missed turn is a lost turn
        var turnNo = parseInt($('#turnNo').html());
        // turnNo = turnNo+1;
        $('#turnNo').html(turnNo);

        //capture screen after timeout once turn Number field is updated
        takeSnapshot();
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/("""

    """),format.raw/*103.5*/("""var sendSkipTurnMessage = function () """),format.raw/*103.43*/("""{"""),format.raw/*103.44*/("""
        """),format.raw/*104.9*/("""myTurn = "false";
        stopTimer();
        resetTimer();
        timer.hide();
        var data = JSON.stringify("""),format.raw/*108.35*/("""{"""),format.raw/*108.36*/(""""gameid": gameid, "type": "SkipTurn", "player": """),format.raw/*108.84*/("""{"""),format.raw/*108.85*/(""""username": username"""),format.raw/*108.105*/("""}"""),format.raw/*108.106*/("""}"""),format.raw/*108.107*/(""");
        socket.send(data);

//updates turns completed count because skipped turn is a lost turn
        var turnNo = parseInt($('#turnNo').html());
       // turnNo = turnNo + 1;
        $('#turnNo').html(turnNo);

//capture screen after timeout once turn Number field is updated
        takeSnapshot();
    """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""

    """),format.raw/*120.5*/("""var username = $('#username').val();
    var gameid = $('#gameid').val();
    var activePlayersList = $('#activePlayersList');
    var timer = $('.mytimer');
    var turn = $('#turn').val();

    // get websocket class, firefox has a different way to get it
    var WS = window['MozWebSocket'] ? window['MozWebSocket'] : WebSocket;

    // open socket on page load
    var socket = new WS('"""),_display_(/*130.27*/routes/*130.33*/.Application.wsInterface().webSocketURL()),format.raw/*130.74*/("""');

    //this list will be used to append joining players
    var userList = $('#list-active-players');

    var writeMessages = function (event) """),format.raw/*135.42*/("""{"""),format.raw/*135.43*/("""
        """),format.raw/*136.9*/("""var model = event.data;

        //model is not coming as Json so have to use this jquery json parser
        model = jQuery.parseJSON(model);

        if (model.type == "joined") """),format.raw/*141.37*/("""{"""),format.raw/*141.38*/("""

            """),format.raw/*143.13*/("""var tmp_username = username.split("@")[0];

            var users = model.joinedUsers;
            activePlayersList.html("");
            activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');

            for (i = 0; i < users.length; i++) """),format.raw/*149.48*/("""{"""),format.raw/*149.49*/("""
                """),format.raw/*150.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*150.61*/("""{"""),format.raw/*150.62*/("""
                    """),format.raw/*151.21*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                """),format.raw/*152.17*/("""}"""),format.raw/*152.18*/("""//if
            """),format.raw/*153.13*/("""}"""),format.raw/*153.14*/("""//for
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/("""//joined

        else if (model.type == "LeaveGame") """),format.raw/*156.45*/("""{"""),format.raw/*156.46*/("""

            """),format.raw/*158.13*/("""var users = model.joinedUsers;
            var leavinguser = model.leavingUser;
            var activityLog = $('#activity-log');
            var txt = leavinguser + " left the game!";
            activityLog.prepend('<p>' + txt + '</p><hr/>');
            var deadTurn = parseInt(model.turnToSkip);
            var myTurn = parseInt($('#turn').val());
            var tmp_username = username.split("@")[0];
            var active = model.active;
            var turnNumber = parseInt(model.turnNumber);

            if (tmp_username == leavinguser) """),format.raw/*169.46*/("""{"""),format.raw/*169.47*/("""
                """),format.raw/*170.17*/("""$('#dashform').submit();
            """),format.raw/*171.13*/("""}"""),format.raw/*171.14*/("""

            """),format.raw/*173.13*/("""if (active && myTurn == turnNumber) """),format.raw/*173.49*/("""{"""),format.raw/*173.50*/("""
                """),format.raw/*174.17*/("""enableMyTurn();
            """),format.raw/*175.13*/("""}"""),format.raw/*175.14*/("""

            """),format.raw/*177.13*/("""if (myTurn > deadTurn) """),format.raw/*177.36*/("""{"""),format.raw/*177.37*/("""
                """),format.raw/*178.17*/("""myTurn = myTurn - 1;
                $('#turn').val(myTurn);
            """),format.raw/*180.13*/("""}"""),format.raw/*180.14*/("""

            """),format.raw/*182.13*/("""var users = model.joinedUsers;
            activePlayersList.html("");
            activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');

            for (i = 0; i < users.length; i++) """),format.raw/*186.48*/("""{"""),format.raw/*186.49*/("""
                """),format.raw/*187.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*187.61*/("""{"""),format.raw/*187.62*/("""
                    """),format.raw/*188.21*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                """),format.raw/*189.17*/("""}"""),format.raw/*189.18*/("""//if
            """),format.raw/*190.13*/("""}"""),format.raw/*190.14*/("""//for
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""

        """),format.raw/*193.9*/("""else if (model.type == "redirect") """),format.raw/*193.44*/("""{"""),format.raw/*193.45*/("""
            """),format.raw/*194.13*/("""$('#frmHidden').submit();
        """),format.raw/*195.9*/("""}"""),format.raw/*195.10*/("""

        """),format.raw/*197.9*/("""else if (model.type == "UpdateActivityLog") """),format.raw/*197.53*/("""{"""),format.raw/*197.54*/("""
            """),format.raw/*198.13*/("""var stepName = model.stepName,
                playerName = model.player.split("@")[0];

            var activityLog = $('#activity-log');
            var txt = playerName + " performed step: " + stepName;

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/("""//UpdateActivityLog

        else if (model.type == "UpdateActivityLogWithOopsSurprise") """),format.raw/*207.69*/("""{"""),format.raw/*207.70*/("""
            """),format.raw/*208.13*/("""var stepName = model.stepName,
                    playerName = model.player.split("@")[0];

            var activityLog = $('#activity-log');
            var txt = playerName + " performed step: " + stepName;

            activityLog.find('p').first().remove();
            activityLog.find('hr').first().remove();

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*218.9*/("""}"""),format.raw/*218.10*/("""//UpdateActivityLogWithOopsSurprise

        else if (model.type == "Timeout") """),format.raw/*220.43*/("""{"""),format.raw/*220.44*/("""
            """),format.raw/*221.13*/("""var playerName = model.player;

            var activityLog = $('#activity-log');

            var txt = playerName + " missed their turn due to timeout!";

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*228.9*/("""}"""),format.raw/*228.10*/("""//Timeout

        else if (model.type == "SkipTurn") """),format.raw/*230.44*/("""{"""),format.raw/*230.45*/("""
            """),format.raw/*231.13*/("""var playerName = model.player;

            var activityLog = $('#activity-log');

            var txt = playerName + " skipped their turn!";

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*238.9*/("""}"""),format.raw/*238.10*/("""//SkipTurn


        else if (model.type == "Chat") """),format.raw/*241.40*/("""{"""),format.raw/*241.41*/("""
            """),format.raw/*242.13*/("""var playerName = model.player.split("@")[0],
                message = model.message;

            var chatArea = $('#chatArea');

            var txt = "<b>" + playerName + "</b>: " + message;

            chatArea.append('<p>' + txt + '</p>');
        """),format.raw/*250.9*/("""}"""),format.raw/*250.10*/("""//Chat

        else if (model.type == "ChangeTurn") """),format.raw/*252.46*/("""{"""),format.raw/*252.47*/("""
            """),format.raw/*253.13*/("""var turnNumber = model.turnNumber,
                playerTurn = $('#turn').val();

            //alert("CTurn: " + turnNumber + ", PTurn: " + playerTurn + ", EStatus: " + (turnNumber == playerTurn));
            if (turnNumber == playerTurn) """),format.raw/*257.43*/("""{"""),format.raw/*257.44*/("""
"""),format.raw/*258.1*/("""var turnNo = parseInt($('#turnNo').html());
var maxTurns = document.getElementById('labelTurns').innerText;
if( turnNo <= maxTurns)"""),format.raw/*260.24*/("""{"""),format.raw/*260.25*/("""
"""),format.raw/*261.1*/("""swal("It's your turn!");
                enableMyTurn();
                publishMyTurn();

                if ($('#btnIsProduction').val() == "true") """),format.raw/*265.60*/("""{"""),format.raw/*265.61*/("""
                    """),format.raw/*266.21*/("""$('#btnSkip').trigger('click');
                """),format.raw/*267.17*/("""}"""),format.raw/*267.18*/("""
"""),format.raw/*268.1*/("""}"""),format.raw/*268.2*/("""
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/("""else"""),format.raw/*269.18*/("""{"""),format.raw/*269.19*/("""
"""),format.raw/*270.1*/("""$("#btnSkip").attr("disabled",true);

            //publishMyTurn();

        """),format.raw/*274.9*/("""}"""),format.raw/*274.10*/("""
"""),format.raw/*275.1*/("""}"""),format.raw/*275.2*/("""//ChangeTurn

        else if (model.type == "TurnUpdate") """),format.raw/*277.46*/("""{"""),format.raw/*277.47*/("""
            """),format.raw/*278.13*/("""var currentPlayer = model.currentPlayer.split("@")[0];
            var tmp_username = username.split("@")[0];

            var users = model.joinedUsers;
            activePlayersList.html("");

            if (tmp_username == currentPlayer) """),format.raw/*284.48*/("""{"""),format.raw/*284.49*/("""
                """),format.raw/*285.17*/("""activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');
            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/("""

            """),format.raw/*288.13*/("""else """),format.raw/*288.18*/("""{"""),format.raw/*288.19*/("""
                """),format.raw/*289.17*/("""activePlayersList.append(tmp_username + ' (you)' + '<br/>');
            """),format.raw/*290.13*/("""}"""),format.raw/*290.14*/("""


            """),format.raw/*293.13*/("""for (i = 0; i < users.length; i++) """),format.raw/*293.48*/("""{"""),format.raw/*293.49*/("""
                """),format.raw/*294.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*294.61*/("""{"""),format.raw/*294.62*/("""
                    """),format.raw/*295.21*/("""if (users[i].split("-")[0] == currentPlayer) """),format.raw/*295.66*/("""{"""),format.raw/*295.67*/("""
                        """),format.raw/*296.25*/("""activePlayersList.append('<b>' + users[i].split("-")[0] + '</b><br/>');
                    """),format.raw/*297.21*/("""}"""),format.raw/*297.22*/("""

                    """),format.raw/*299.21*/("""else """),format.raw/*299.26*/("""{"""),format.raw/*299.27*/("""
                        """),format.raw/*300.25*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                    """),format.raw/*301.21*/("""}"""),format.raw/*301.22*/("""
                """),format.raw/*302.17*/("""}"""),format.raw/*302.18*/("""//if
            """),format.raw/*303.13*/("""}"""),format.raw/*303.14*/("""//for

        """),format.raw/*305.9*/("""}"""),format.raw/*305.10*/("""//TurnUpdate

        else """),format.raw/*307.14*/("""{"""),format.raw/*307.15*/("""
            """),format.raw/*308.13*/("""var name = model.name;
            $('#lblCount').text(count);
            $('#divJoined').prepend('<p>' + name + '</p>');
        """),format.raw/*311.9*/("""}"""),format.raw/*311.10*/("""
    """),format.raw/*312.5*/("""}"""),format.raw/*312.6*/("""

    """),format.raw/*314.5*/("""$('#editTodoDialog').on('shown.bs.modal', function () """),format.raw/*314.59*/("""{"""),format.raw/*314.60*/("""

        """),format.raw/*316.9*/("""if (myTurn == "true") """),format.raw/*316.31*/("""{"""),format.raw/*316.32*/("""

            """),format.raw/*318.60*/("""
            """),format.raw/*319.55*/("""
            """),format.raw/*320.60*/("""

        """),format.raw/*322.9*/("""}"""),format.raw/*322.10*/(""" """),format.raw/*322.11*/("""else """),format.raw/*322.16*/("""{"""),format.raw/*322.17*/("""

            """),format.raw/*324.13*/("""$(".perform-step").attr("disabled", true);
            """),format.raw/*325.54*/("""
            """),format.raw/*326.59*/("""
        """),format.raw/*327.9*/("""}"""),format.raw/*327.10*/("""


    """),format.raw/*330.5*/("""}"""),format.raw/*330.6*/(""");

$('#riskDialog').on('shown.bs.modal', function () """),format.raw/*332.51*/("""{"""),format.raw/*332.52*/("""

"""),format.raw/*334.1*/("""if (myTurn == "true") """),format.raw/*334.23*/("""{"""),format.raw/*334.24*/("""

"""),format.raw/*336.48*/("""
"""),format.raw/*337.43*/("""
"""),format.raw/*338.48*/("""

"""),format.raw/*340.1*/("""}"""),format.raw/*340.2*/(""" """),format.raw/*340.3*/("""else """),format.raw/*340.8*/("""{"""),format.raw/*340.9*/("""

"""),format.raw/*342.47*/("""
"""),format.raw/*343.42*/("""
"""),format.raw/*344.1*/("""$(".perform-risk").attr("disabled", true);
"""),format.raw/*345.1*/("""}"""),format.raw/*345.2*/("""


"""),format.raw/*348.1*/("""}"""),format.raw/*348.2*/(""");

    var publishMyTurn = function (event) """),format.raw/*350.42*/("""{"""),format.raw/*350.43*/("""
        """),format.raw/*351.9*/("""var data = JSON.stringify("""),format.raw/*351.35*/("""{"""),format.raw/*351.36*/("""
            """),format.raw/*352.13*/(""""gameid": gameid,
            "type": "TurnUpdate",
            "player": """),format.raw/*354.23*/("""{"""),format.raw/*354.24*/(""""name": username, "team": "somecode""""),format.raw/*354.60*/("""}"""),format.raw/*354.61*/("""
        """),format.raw/*355.9*/("""}"""),format.raw/*355.10*/(""");
        socket.send(data);
    """),format.raw/*357.5*/("""}"""),format.raw/*357.6*/("""

    """),format.raw/*359.5*/("""var initConnection = function (event) """),format.raw/*359.43*/("""{"""),format.raw/*359.44*/("""
        """),format.raw/*360.9*/("""registerGameId();
        publishMyPresence();
        checkIfFirstTurn();
    """),format.raw/*363.5*/("""}"""),format.raw/*363.6*/("""

    """),format.raw/*365.5*/("""var checkIfFirstTurn = function (event) """),format.raw/*365.45*/("""{"""),format.raw/*365.46*/("""
        """),format.raw/*366.9*/("""if (turn == "1") """),format.raw/*366.26*/("""{"""),format.raw/*366.27*/("""
            """),format.raw/*367.13*/("""enableMyTurn();
        """),format.raw/*368.9*/("""}"""),format.raw/*368.10*/("""else"""),format.raw/*368.14*/("""{"""),format.raw/*368.15*/("""
            """),format.raw/*369.13*/("""$("#btnSkip").attr("disabled",true);

        """),format.raw/*371.9*/("""}"""),format.raw/*371.10*/("""
    """),format.raw/*372.5*/("""}"""),format.raw/*372.6*/("""

    """),format.raw/*374.5*/("""//put all code inside this method to setup the stage for player who is having the current turn
    var enableMyTurn = function (event) """),format.raw/*375.41*/("""{"""),format.raw/*375.42*/("""
        """),format.raw/*376.9*/("""myTurn = "true";
$("#btnSkip").attr("disabled",false);
        timer.show();
        setTimer(timerTime);
        resetTimer();
        startTimer();
    """),format.raw/*382.5*/("""}"""),format.raw/*382.6*/("""

    """),format.raw/*384.5*/("""var publishMyPresence = function (event) """),format.raw/*384.46*/("""{"""),format.raw/*384.47*/("""
        """),format.raw/*385.9*/("""//push to socket on first page load of any user
        var data = JSON.stringify("""),format.raw/*386.35*/("""{"""),format.raw/*386.36*/("""
            """),format.raw/*387.13*/(""""gameid": gameid,
            "type": "joined",
            "player": """),format.raw/*389.23*/("""{"""),format.raw/*389.24*/(""""name": username, "team": "somecode""""),format.raw/*389.60*/("""}"""),format.raw/*389.61*/("""
        """),format.raw/*390.9*/("""}"""),format.raw/*390.10*/(""");
        socket.send(data);
    """),format.raw/*392.5*/("""}"""),format.raw/*392.6*/("""

    """),format.raw/*394.5*/("""var registerGameId = function (event) """),format.raw/*394.43*/("""{"""),format.raw/*394.44*/("""
        """),format.raw/*395.9*/("""//push to socket on first page load of any user
        var data = JSON.stringify("""),format.raw/*396.35*/("""{"""),format.raw/*396.36*/(""""gameid": gameid, "type": "RegisterGameId""""),format.raw/*396.78*/("""}"""),format.raw/*396.79*/(""");
        socket.send(data);
    """),format.raw/*398.5*/("""}"""),format.raw/*398.6*/("""

    """),format.raw/*400.5*/("""//read message from socket
    socket.onmessage = writeMessages;

    //without this I am getting exception that CONNECTION NOT ESTABLISHED
    socket.onopen = initConnection;


    $('#btnJoin').click(function (event) """),format.raw/*407.42*/("""{"""),format.raw/*407.43*/("""

        """),format.raw/*409.9*/("""var name = $('#txtName').val();
        var code = $('#txtCode').val();


        var data = JSON.stringify("""),format.raw/*413.35*/("""{"""),format.raw/*413.36*/(""""name": name, "team": code"""),format.raw/*413.62*/("""}"""),format.raw/*413.63*/(""");

        //push to socket
        socket.send(data);

        $('#txtName').val('');
        $('#txtCode').val('');

        $('#txtName').attr('hidden', true);
        $('#txtCode').attr('hidden', true);
        $('#divPlayerStatus').attr('hidden', false);
        $('#btnLeave').attr('hidden', false);
        $('#btnJoin').attr('hidden', true);
    """),format.raw/*426.5*/("""}"""),format.raw/*426.6*/(""");


    //Event handler for start game event
    $('#btnStart').click(function (e) """),format.raw/*430.39*/("""{"""),format.raw/*430.40*/("""

        """),format.raw/*432.9*/("""var username = $('#username').val();
        var data = JSON.stringify("""),format.raw/*433.35*/("""{"""),format.raw/*433.36*/(""""gameid": gameid, "type": "StartGame", "player": """),format.raw/*433.85*/("""{"""),format.raw/*433.86*/(""""username": username"""),format.raw/*433.106*/("""}"""),format.raw/*433.107*/("""}"""),format.raw/*433.108*/(""");
        socket.send(data);
    """),format.raw/*435.5*/("""}"""),format.raw/*435.6*/(""");

    //take snapshot only when modal is closed
    $('#editTodoDialog').on('hidden.bs.modal', function () """),format.raw/*438.60*/("""{"""),format.raw/*438.61*/("""
        """),format.raw/*439.9*/("""takeSnapshot();
    """),format.raw/*440.5*/("""}"""),format.raw/*440.6*/(""");

    //Perform step button event handler
    $('.perform-step').on("click", function () """),format.raw/*443.48*/("""{"""),format.raw/*443.49*/("""
        """),format.raw/*444.9*/("""myTurn = "false";
        var topModal = $(this).closest('div.modal'),
            parentModal = topModal.find('div.modal-content'),
            header = parentModal.find('div.modal-header'),
            title = header.find('.modal-title').html();

        //this will hide the modal
        topModal.modal('toggle');
        updateActivityLogs(title);
        publishTurnNumber();

        stopTimer();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
    """),format.raw/*460.5*/("""}"""),format.raw/*460.6*/(""");


$('#btnMitigateRisk').click(function()"""),format.raw/*463.39*/("""{"""),format.raw/*463.40*/("""

    """),format.raw/*465.5*/("""var id = $('#btnMitigateRisk').val();
     var tempStatus="riskStatus"+id;
        var status= document.getElementById('swalmessages').innerHTML;
        var title = "("+id+") "+status;
        document.getElementById('prevstep').innerHTML = id;
        funcChangeTurn(title);
"""),format.raw/*471.1*/("""}"""),format.raw/*471.2*/(""");

    
    var funcChangeTurn = function(title)"""),format.raw/*474.41*/("""{"""),format.raw/*474.42*/("""

        """),format.raw/*476.9*/("""updateActivityLogs(title);
        publishTurnNumber();

        takeSnapshot();

        stopTimer();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
    """),format.raw/*486.5*/("""}"""),format.raw/*486.6*/("""

    """),format.raw/*488.5*/("""$('#updateactivity').on("click", function () """),format.raw/*488.50*/("""{"""),format.raw/*488.51*/("""

        """),format.raw/*490.9*/("""var topModal = $(this).closest('div.modal'),
            parentModal = topModal.find('div.modal-content'),
            header = parentModal.find('div.modal-header'),
            title = header.find('.modal-title').html();

        var isoops = $('#isoops').val();
        var otitle = "";
        var oopsmsg = $('#oopsmsg').val();
        if (isoops == "true") """),format.raw/*498.31*/("""{"""),format.raw/*498.32*/("""
            """),format.raw/*499.13*/("""otitle = "You got an OOPS card." + oopsmsg;
        """),format.raw/*500.9*/("""}"""),format.raw/*500.10*/("""
        """),format.raw/*501.9*/("""else """),format.raw/*501.14*/("""{"""),format.raw/*501.15*/("""
            """),format.raw/*502.13*/("""otitle = "You got an Surprise card" + oopsmsg;
        """),format.raw/*503.9*/("""}"""),format.raw/*503.10*/("""
        """),format.raw/*504.9*/("""updateActivityLogsWithSurpriseOrOops(otitle);

    """),format.raw/*506.5*/("""}"""),format.raw/*506.6*/(""");

    var takeSnapshot = function () """),format.raw/*508.36*/("""{"""),format.raw/*508.37*/("""
        """),format.raw/*509.9*/("""html2canvas(document.body, """),format.raw/*509.36*/("""{"""),format.raw/*509.37*/("""
            """),format.raw/*510.13*/("""onrendered: function (canvas) """),format.raw/*510.43*/("""{"""),format.raw/*510.44*/("""
                """),format.raw/*511.17*/("""//"""),format.raw/*511.57*/("""
                """),format.raw/*512.17*/("""uploadImage(canvas.toDataURL());
            """),format.raw/*513.13*/("""}"""),format.raw/*513.14*/("""
        """),format.raw/*514.9*/("""}"""),format.raw/*514.10*/(""");
    """),format.raw/*515.5*/("""}"""),format.raw/*515.6*/("""

    """),format.raw/*517.5*/("""var uploadImage = function (url) """),format.raw/*517.38*/("""{"""),format.raw/*517.39*/("""
        """),format.raw/*518.9*/("""var turnNo = parseInt($('#turnNo').html());
        turnNo = turnNo - 1;
        var obj = """),format.raw/*520.19*/("""{"""),format.raw/*520.20*/("""'image-data': url, 'username': username, 'gameid': gameid, 'turnNo': turnNo"""),format.raw/*520.95*/("""}"""),format.raw/*520.96*/(""";
        $.ajax("""),format.raw/*521.16*/("""{"""),format.raw/*521.17*/("""
            """),format.raw/*522.13*/("""type: 'POST',
            url: '"""),_display_(/*523.20*/routes/*523.26*/.GameController.saveImageSnapshot()),format.raw/*523.61*/("""',
            data: JSON.stringify(obj),
            contentType: 'application/json',
            success: function (data) """),format.raw/*526.38*/("""{"""),format.raw/*526.39*/("""
                """),format.raw/*527.17*/("""//alert("Image uploaded");
            """),format.raw/*528.13*/("""}"""),format.raw/*528.14*/("""
        """),format.raw/*529.9*/("""}"""),format.raw/*529.10*/(""");//ajax call ends here
    """),format.raw/*530.5*/("""}"""),format.raw/*530.6*/("""

    """),format.raw/*532.5*/("""var publishTurnNumber = function () """),format.raw/*532.41*/("""{"""),format.raw/*532.42*/("""
        """),format.raw/*533.9*/("""var turnNumber = $('#turn').val();
        var data = JSON.stringify("""),format.raw/*534.35*/("""{"""),format.raw/*534.36*/(""""gameid": gameid, "turnNumber": turnNumber, "type": "ChangeTurn""""),format.raw/*534.100*/("""}"""),format.raw/*534.101*/(""");
        socket.send(data);
    """),format.raw/*536.5*/("""}"""),format.raw/*536.6*/("""

    """),format.raw/*538.5*/("""var updateActivityLogs = function (title) """),format.raw/*538.47*/("""{"""),format.raw/*538.48*/("""
        """),format.raw/*539.9*/("""var data = JSON.stringify("""),format.raw/*539.35*/("""{"""),format.raw/*539.36*/("""
            """),format.raw/*540.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStep",
            "player": """),format.raw/*543.23*/("""{"""),format.raw/*543.24*/(""""username": username"""),format.raw/*543.44*/("""}"""),format.raw/*543.45*/("""
        """),format.raw/*544.9*/("""}"""),format.raw/*544.10*/(""");
        socket.send(data);
    """),format.raw/*546.5*/("""}"""),format.raw/*546.6*/("""

    """),format.raw/*548.5*/("""var updateActivityLogsWithSurpriseOrOops = function (title) """),format.raw/*548.65*/("""{"""),format.raw/*548.66*/("""
        """),format.raw/*549.9*/("""var data = JSON.stringify("""),format.raw/*549.35*/("""{"""),format.raw/*549.36*/("""
            """),format.raw/*550.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStepWithOopsSurprise",
            "player": """),format.raw/*553.23*/("""{"""),format.raw/*553.24*/(""""username": username"""),format.raw/*553.44*/("""}"""),format.raw/*553.45*/("""
        """),format.raw/*554.9*/("""}"""),format.raw/*554.10*/(""");
        socket.send(data);
    """),format.raw/*556.5*/("""}"""),format.raw/*556.6*/("""

    """),format.raw/*558.5*/("""$('#btnSend').click(function () """),format.raw/*558.37*/("""{"""),format.raw/*558.38*/("""
        """),format.raw/*559.9*/("""var message = $('#txtMessage').val();
        $('#txtMessage').val('');
        if (message != "") """),format.raw/*561.28*/("""{"""),format.raw/*561.29*/("""
            """),format.raw/*562.13*/("""var data = JSON.stringify("""),format.raw/*562.39*/("""{"""),format.raw/*562.40*/("""
                """),format.raw/*563.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*566.27*/("""{"""),format.raw/*566.28*/(""""username": username"""),format.raw/*566.48*/("""}"""),format.raw/*566.49*/("""
            """),format.raw/*567.13*/("""}"""),format.raw/*567.14*/(""");
            socket.send(data);
        """),format.raw/*569.9*/("""}"""),format.raw/*569.10*/("""
    """),format.raw/*570.5*/("""}"""),format.raw/*570.6*/(""");

    var sendChatMessage = function (message) """),format.raw/*572.46*/("""{"""),format.raw/*572.47*/("""
        """),format.raw/*573.9*/("""if (message != "") """),format.raw/*573.28*/("""{"""),format.raw/*573.29*/("""
            """),format.raw/*574.13*/("""var data = JSON.stringify("""),format.raw/*574.39*/("""{"""),format.raw/*574.40*/("""
                """),format.raw/*575.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*578.27*/("""{"""),format.raw/*578.28*/(""""username": username"""),format.raw/*578.48*/("""}"""),format.raw/*578.49*/("""
            """),format.raw/*579.13*/("""}"""),format.raw/*579.14*/(""");
            socket.send(data);
        """),format.raw/*581.9*/("""}"""),format.raw/*581.10*/("""
    """),format.raw/*582.5*/("""}"""),format.raw/*582.6*/("""

    """),format.raw/*584.5*/("""$('#btnLeave').click(function (e) """),format.raw/*584.39*/("""{"""),format.raw/*584.40*/("""

        """),format.raw/*586.9*/("""var data = JSON.stringify("""),format.raw/*586.35*/("""{"""),format.raw/*586.36*/(""""type": "leaving", "player": """),format.raw/*586.65*/("""{"""),format.raw/*586.66*/(""""username": username"""),format.raw/*586.86*/("""}"""),format.raw/*586.87*/("""}"""),format.raw/*586.88*/(""");
        socket.send(data);

        $.ajax("""),format.raw/*589.16*/("""{"""),format.raw/*589.17*/("""
            """),format.raw/*590.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*592.19*/("""{"""),format.raw/*592.20*/("""'username': username"""),format.raw/*592.40*/("""}"""),format.raw/*592.41*/(""",
            success: function (data) """),format.raw/*593.38*/("""{"""),format.raw/*593.39*/("""
                """),format.raw/*594.17*/("""window.location.replace("/");
            """),format.raw/*595.13*/("""}"""),format.raw/*595.14*/("""
        """),format.raw/*596.9*/("""}"""),format.raw/*596.10*/(""");
    """),format.raw/*597.5*/("""}"""),format.raw/*597.6*/(""");


    $('#btnSkip').click(function () """),format.raw/*600.37*/("""{"""),format.raw/*600.38*/("""
        """),format.raw/*601.9*/("""timeout = true;
        sendSkipTurnMessage();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
        //In case of timeout, next player should get his turn
        publishTurnNumber();
    """),format.raw/*609.5*/("""}"""),format.raw/*609.6*/(""");

    $('#txtMessage').keyup(function (event) """),format.raw/*611.45*/("""{"""),format.raw/*611.46*/("""

        """),format.raw/*613.9*/("""if (event.keyCode == 13) """),format.raw/*613.34*/("""{"""),format.raw/*613.35*/("""

            """),format.raw/*615.13*/("""//check if length is more than 150
            if ($(this).val().length <= 150) """),format.raw/*616.46*/("""{"""),format.raw/*616.47*/("""
                """),format.raw/*617.17*/("""sendChatMessage($(this).val());
                $('#txtMessage').val('');
                return;
            """),format.raw/*620.13*/("""}"""),format.raw/*620.14*/("""
        """),format.raw/*621.9*/("""}"""),format.raw/*621.10*/("""

        """),format.raw/*623.9*/("""var length = $(this).val().length;
        if (length > 150) """),format.raw/*624.27*/("""{"""),format.raw/*624.28*/("""
            """),format.raw/*625.13*/("""$(this).css('color', 'red');
        """),format.raw/*626.9*/("""}"""),format.raw/*626.10*/("""
        """),format.raw/*627.9*/("""else """),format.raw/*627.14*/("""{"""),format.raw/*627.15*/("""
            """),format.raw/*628.13*/("""$(this).css('color', 'black');
        """),format.raw/*629.9*/("""}"""),format.raw/*629.10*/("""
    """),format.raw/*630.5*/("""}"""),format.raw/*630.6*/(""");


    $('#lnkLeave').click(function () """),format.raw/*633.38*/("""{"""),format.raw/*633.39*/("""
       """),format.raw/*634.8*/("""// alert("her2");
        // var obj = """),format.raw/*635.22*/("""{"""),format.raw/*635.23*/("""'username' : username, 'gameid' : gameid"""),format.raw/*635.63*/("""}"""),format.raw/*635.64*/(""";
        // $.ajax("""),format.raw/*636.19*/("""{"""),format.raw/*636.20*/("""
        """),format.raw/*637.9*/("""//     type: 'POST',
        //     url: '/leave',
        //     data: JSON.stringify(obj),
        //     contentType: 'application/json',
        //     success: function (data) """),format.raw/*641.41*/("""{"""),format.raw/*641.42*/("""
        """),format.raw/*642.9*/("""//         if(data=="success")"""),format.raw/*642.39*/("""{"""),format.raw/*642.40*/("""
        """),format.raw/*643.9*/("""//             notifyOthers();
        //             $('#dashform').submit();
        //         """),format.raw/*645.20*/("""}"""),format.raw/*645.21*/("""
        """),format.raw/*646.9*/("""//     """),format.raw/*646.16*/("""}"""),format.raw/*646.17*/("""
        """),format.raw/*647.9*/("""// """),format.raw/*647.12*/("""}"""),format.raw/*647.13*/(""");//ajax call ends here
        notifyOthers();
    """),format.raw/*649.5*/("""}"""),format.raw/*649.6*/(""");

    var notifyOthers = function () """),format.raw/*651.36*/("""{"""),format.raw/*651.37*/("""
        """),format.raw/*652.9*/("""var turn = $('#turn').val();

        var isActivePlayer = myTurn == "true" ? true : false;

        var data = JSON.stringify("""),format.raw/*656.35*/("""{"""),format.raw/*656.36*/("""
            """),format.raw/*657.13*/(""""gameid": gameid,
            "type": "LeaveGame",
            "active": isActivePlayer,
            "turnNumber": turn,
            "player": """),format.raw/*661.23*/("""{"""),format.raw/*661.24*/(""""username": username"""),format.raw/*661.44*/("""}"""),format.raw/*661.45*/("""
        """),format.raw/*662.9*/("""}"""),format.raw/*662.10*/(""");
        socket.send(data);
    """),format.raw/*664.5*/("""}"""),format.raw/*664.6*/("""
"""),format.raw/*665.1*/("""}"""),format.raw/*665.2*/(""");
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
object gamejs extends gamejs_Scope0.gamejs
              /*
                  -- GENERATED --
                  DATE: Thu Sep 28 18:36:41 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/gamejs.scala.html
                  HASH: f8c56aa1efdf0a999ad932ab1b216a3576272af4
                  MATRIX: 829->0|870->14|898->15|930->21|1308->371|1337->372|1373->381|1480->460|1509->461|1551->475|1605->501|1634->502|1662->503|1820->633|1849->634|1894->651|2244->974|2273->975|2314->988|2343->989|2379->998|2408->999|2440->1004|2468->1005|2610->1119|2639->1120|2675->1129|2755->1182|2783->1183|2816->1189|2875->1220|2904->1221|2940->1230|2992->1255|3020->1256|3053->1262|3109->1290|3138->1291|3174->1300|3243->1342|3271->1343|3304->1349|3361->1378|3390->1379|3426->1388|3499->1434|3527->1435|3560->1441|3630->1483|3659->1484|3709->1506|3747->1516|3776->1517|3829->1542|3957->1642|3986->1643|4057->1686|4086->1687|4135->1708|4203->1749|4218->1755|4270->1786|4531->2019|4560->2020|4679->2111|4708->2112|4755->2131|4784->2132|4827->2147|4856->2148|4890->2155|4955->2192|4984->2193|5016->2198|5256->2410|5285->2411|5360->2458|5389->2459|5438->2479|5468->2480|5498->2481|5851->2806|5880->2807|5914->2813|5981->2851|6011->2852|6048->2861|6194->2978|6224->2979|6301->3027|6331->3028|6381->3048|6412->3049|6443->3050|6782->3361|6811->3362|6845->3368|7264->3759|7280->3765|7343->3806|7520->3954|7550->3955|7587->3964|7796->4144|7826->4145|7869->4159|8158->4420|8188->4421|8234->4438|8307->4482|8337->4483|8387->4504|8492->4580|8522->4581|8568->4598|8598->4599|8640->4613|8670->4614|8753->4668|8783->4669|8826->4683|9405->5234|9435->5235|9481->5252|9547->5289|9577->5290|9620->5304|9685->5340|9715->5341|9761->5358|9818->5386|9848->5387|9891->5401|9943->5424|9973->5425|10019->5442|10121->5515|10151->5516|10194->5530|10427->5734|10457->5735|10503->5752|10576->5796|10606->5797|10656->5818|10761->5894|10791->5895|10837->5912|10867->5913|10909->5927|10939->5928|10977->5938|11041->5973|11071->5974|11113->5987|11175->6021|11205->6022|11243->6032|11316->6076|11346->6077|11388->6090|11691->6366|11721->6367|11839->6456|11869->6457|11911->6470|12324->6856|12354->6857|12462->6936|12492->6937|12534->6950|12787->7175|12817->7176|12900->7230|12930->7231|12972->7244|13211->7455|13241->7456|13322->7508|13352->7509|13394->7522|13676->7777|13706->7778|13788->7831|13818->7832|13860->7845|14131->8087|14161->8088|14190->8089|14350->8220|14380->8221|14409->8222|14588->8372|14618->8373|14668->8394|14745->8442|14775->8443|14804->8444|14833->8445|14875->8458|14905->8459|14938->8463|14968->8464|14997->8465|15103->8543|15133->8544|15162->8545|15191->8546|15279->8605|15309->8606|15351->8619|15622->8863|15652->8864|15698->8881|15812->8966|15842->8967|15885->8981|15919->8986|15949->8987|15995->9004|16097->9077|16127->9078|16171->9093|16235->9128|16265->9129|16311->9146|16384->9190|16414->9191|16464->9212|16538->9257|16568->9258|16622->9283|16743->9375|16773->9376|16824->9398|16858->9403|16888->9404|16942->9429|17051->9509|17081->9510|17127->9527|17157->9528|17203->9545|17233->9546|17276->9561|17306->9562|17362->9589|17392->9590|17434->9603|17593->9734|17623->9735|17656->9740|17685->9741|17719->9747|17802->9801|17832->9802|17870->9812|17921->9834|17951->9835|17994->9896|18036->9951|18078->10011|18116->10021|18146->10022|18176->10023|18210->10028|18240->10029|18283->10043|18367->10139|18409->10198|18446->10207|18476->10208|18511->10215|18540->10216|18623->10270|18653->10271|18683->10273|18734->10295|18764->10296|18795->10345|18825->10388|18855->10436|18885->10438|18914->10439|18943->10440|18976->10445|19005->10446|19036->10494|19066->10536|19095->10537|19166->10580|19195->10581|19226->10584|19255->10585|19329->10630|19359->10631|19396->10640|19451->10666|19481->10667|19523->10680|19626->10754|19656->10755|19721->10791|19751->10792|19788->10801|19818->10802|19880->10836|19909->10837|19943->10843|20010->10881|20040->10882|20077->10891|20184->10970|20213->10971|20247->10977|20316->11017|20346->11018|20383->11027|20429->11044|20459->11045|20501->11058|20553->11082|20583->11083|20616->11087|20646->11088|20688->11101|20762->11147|20792->11148|20825->11153|20854->11154|20888->11160|21052->11295|21082->11296|21119->11305|21301->11459|21330->11460|21364->11466|21434->11507|21464->11508|21501->11517|21612->11599|21642->11600|21684->11613|21783->11683|21813->11684|21878->11720|21908->11721|21945->11730|21975->11731|22037->11765|22066->11766|22100->11772|22167->11810|22197->11811|22234->11820|22345->11902|22375->11903|22446->11945|22476->11946|22538->11980|22567->11981|22601->11987|22849->12206|22879->12207|22917->12217|23054->12325|23084->12326|23139->12352|23169->12353|23552->12708|23581->12709|23694->12793|23724->12794|23762->12804|23862->12875|23892->12876|23970->12925|24000->12926|24050->12946|24081->12947|24112->12948|24174->12982|24203->12983|24341->13092|24371->13093|24408->13102|24456->13122|24485->13123|24605->13214|24635->13215|24672->13224|25182->13706|25211->13707|25283->13750|25313->13751|25347->13757|25652->14034|25681->14035|25759->14084|25789->14085|25827->14095|26036->14276|26065->14277|26099->14283|26173->14328|26203->14329|26241->14339|26632->14701|26662->14702|26704->14715|26784->14767|26814->14768|26851->14777|26885->14782|26915->14783|26957->14796|27040->14851|27070->14852|27107->14861|27186->14912|27215->14913|27283->14952|27313->14953|27350->14962|27406->14989|27436->14990|27478->15003|27537->15033|27567->15034|27613->15051|27644->15091|27690->15108|27764->15153|27794->15154|27831->15163|27861->15164|27896->15171|27925->15172|27959->15178|28021->15211|28051->15212|28088->15221|28208->15312|28238->15313|28342->15388|28372->15389|28418->15406|28448->15407|28490->15420|28551->15453|28567->15459|28624->15494|28777->15618|28807->15619|28853->15636|28921->15675|28951->15676|28988->15685|29018->15686|29074->15714|29103->15715|29137->15721|29202->15757|29232->15758|29269->15767|29367->15836|29397->15837|29491->15901|29522->15902|29584->15936|29613->15937|29647->15943|29718->15985|29748->15986|29785->15995|29840->16021|29870->16022|29912->16035|30047->16141|30077->16142|30126->16162|30156->16163|30193->16172|30223->16173|30285->16207|30314->16208|30348->16214|30437->16274|30467->16275|30504->16284|30559->16310|30589->16311|30631->16324|30782->16446|30812->16447|30861->16467|30891->16468|30928->16477|30958->16478|31020->16512|31049->16513|31083->16519|31144->16551|31174->16552|31211->16561|31339->16660|31369->16661|31411->16674|31466->16700|31496->16701|31542->16718|31683->16830|31713->16831|31762->16851|31792->16852|31834->16865|31864->16866|31934->16908|31964->16909|31997->16914|32026->16915|32104->16964|32134->16965|32171->16974|32219->16993|32249->16994|32291->17007|32346->17033|32376->17034|32422->17051|32563->17163|32593->17164|32642->17184|32672->17185|32714->17198|32744->17199|32814->17241|32844->17242|32877->17247|32906->17248|32940->17254|33003->17288|33033->17289|33071->17299|33126->17325|33156->17326|33214->17355|33244->17356|33293->17376|33323->17377|33353->17378|33428->17424|33458->17425|33500->17438|33587->17496|33617->17497|33666->17517|33696->17518|33764->17557|33794->17558|33840->17575|33911->17617|33941->17618|33978->17627|34008->17628|34043->17635|34072->17636|34142->17677|34172->17678|34209->17687|34453->17903|34482->17904|34559->17952|34589->17953|34627->17963|34681->17988|34711->17989|34754->18003|34863->18083|34893->18084|34939->18101|35078->18211|35108->18212|35145->18221|35175->18222|35213->18232|35303->18293|35333->18294|35375->18307|35440->18344|35470->18345|35507->18354|35541->18359|35571->18360|35613->18373|35680->18412|35710->18413|35743->18418|35772->18419|35843->18461|35873->18462|35909->18470|35977->18509|36007->18510|36076->18550|36106->18551|36155->18571|36185->18572|36222->18581|36432->18762|36462->18763|36499->18772|36558->18802|36588->18803|36625->18812|36752->18910|36782->18911|36819->18920|36855->18927|36885->18928|36922->18937|36954->18940|36984->18941|37064->18993|37093->18994|37161->19033|37191->19034|37228->19043|37384->19170|37414->19171|37456->19184|37628->19327|37658->19328|37707->19348|37737->19349|37774->19358|37804->19359|37866->19393|37895->19394|37924->19395|37953->19396
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|52->21|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|69->38|69->38|70->39|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|79->48|81->50|81->50|83->52|83->52|83->52|84->53|86->55|86->55|88->57|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|98->67|98->67|99->68|100->69|100->69|100->69|105->74|105->74|108->77|108->77|110->79|110->79|111->80|111->80|114->83|114->83|114->83|115->84|122->91|122->91|122->91|122->91|122->91|122->91|122->91|132->101|132->101|134->103|134->103|134->103|135->104|139->108|139->108|139->108|139->108|139->108|139->108|139->108|149->118|149->118|151->120|161->130|161->130|161->130|166->135|166->135|167->136|172->141|172->141|174->143|180->149|180->149|181->150|181->150|181->150|182->151|183->152|183->152|184->153|184->153|185->154|185->154|187->156|187->156|189->158|200->169|200->169|201->170|202->171|202->171|204->173|204->173|204->173|205->174|206->175|206->175|208->177|208->177|208->177|209->178|211->180|211->180|213->182|217->186|217->186|218->187|218->187|218->187|219->188|220->189|220->189|221->190|221->190|222->191|222->191|224->193|224->193|224->193|225->194|226->195|226->195|228->197|228->197|228->197|229->198|236->205|236->205|238->207|238->207|239->208|249->218|249->218|251->220|251->220|252->221|259->228|259->228|261->230|261->230|262->231|269->238|269->238|272->241|272->241|273->242|281->250|281->250|283->252|283->252|284->253|288->257|288->257|289->258|291->260|291->260|292->261|296->265|296->265|297->266|298->267|298->267|299->268|299->268|300->269|300->269|300->269|300->269|301->270|305->274|305->274|306->275|306->275|308->277|308->277|309->278|315->284|315->284|316->285|317->286|317->286|319->288|319->288|319->288|320->289|321->290|321->290|324->293|324->293|324->293|325->294|325->294|325->294|326->295|326->295|326->295|327->296|328->297|328->297|330->299|330->299|330->299|331->300|332->301|332->301|333->302|333->302|334->303|334->303|336->305|336->305|338->307|338->307|339->308|342->311|342->311|343->312|343->312|345->314|345->314|345->314|347->316|347->316|347->316|349->318|350->319|351->320|353->322|353->322|353->322|353->322|353->322|355->324|356->325|357->326|358->327|358->327|361->330|361->330|363->332|363->332|365->334|365->334|365->334|367->336|368->337|369->338|371->340|371->340|371->340|371->340|371->340|373->342|374->343|375->344|376->345|376->345|379->348|379->348|381->350|381->350|382->351|382->351|382->351|383->352|385->354|385->354|385->354|385->354|386->355|386->355|388->357|388->357|390->359|390->359|390->359|391->360|394->363|394->363|396->365|396->365|396->365|397->366|397->366|397->366|398->367|399->368|399->368|399->368|399->368|400->369|402->371|402->371|403->372|403->372|405->374|406->375|406->375|407->376|413->382|413->382|415->384|415->384|415->384|416->385|417->386|417->386|418->387|420->389|420->389|420->389|420->389|421->390|421->390|423->392|423->392|425->394|425->394|425->394|426->395|427->396|427->396|427->396|427->396|429->398|429->398|431->400|438->407|438->407|440->409|444->413|444->413|444->413|444->413|457->426|457->426|461->430|461->430|463->432|464->433|464->433|464->433|464->433|464->433|464->433|464->433|466->435|466->435|469->438|469->438|470->439|471->440|471->440|474->443|474->443|475->444|491->460|491->460|494->463|494->463|496->465|502->471|502->471|505->474|505->474|507->476|517->486|517->486|519->488|519->488|519->488|521->490|529->498|529->498|530->499|531->500|531->500|532->501|532->501|532->501|533->502|534->503|534->503|535->504|537->506|537->506|539->508|539->508|540->509|540->509|540->509|541->510|541->510|541->510|542->511|542->511|543->512|544->513|544->513|545->514|545->514|546->515|546->515|548->517|548->517|548->517|549->518|551->520|551->520|551->520|551->520|552->521|552->521|553->522|554->523|554->523|554->523|557->526|557->526|558->527|559->528|559->528|560->529|560->529|561->530|561->530|563->532|563->532|563->532|564->533|565->534|565->534|565->534|565->534|567->536|567->536|569->538|569->538|569->538|570->539|570->539|570->539|571->540|574->543|574->543|574->543|574->543|575->544|575->544|577->546|577->546|579->548|579->548|579->548|580->549|580->549|580->549|581->550|584->553|584->553|584->553|584->553|585->554|585->554|587->556|587->556|589->558|589->558|589->558|590->559|592->561|592->561|593->562|593->562|593->562|594->563|597->566|597->566|597->566|597->566|598->567|598->567|600->569|600->569|601->570|601->570|603->572|603->572|604->573|604->573|604->573|605->574|605->574|605->574|606->575|609->578|609->578|609->578|609->578|610->579|610->579|612->581|612->581|613->582|613->582|615->584|615->584|615->584|617->586|617->586|617->586|617->586|617->586|617->586|617->586|617->586|620->589|620->589|621->590|623->592|623->592|623->592|623->592|624->593|624->593|625->594|626->595|626->595|627->596|627->596|628->597|628->597|631->600|631->600|632->601|640->609|640->609|642->611|642->611|644->613|644->613|644->613|646->615|647->616|647->616|648->617|651->620|651->620|652->621|652->621|654->623|655->624|655->624|656->625|657->626|657->626|658->627|658->627|658->627|659->628|660->629|660->629|661->630|661->630|664->633|664->633|665->634|666->635|666->635|666->635|666->635|667->636|667->636|668->637|672->641|672->641|673->642|673->642|673->642|674->643|676->645|676->645|677->646|677->646|677->646|678->647|678->647|678->647|680->649|680->649|682->651|682->651|683->652|687->656|687->656|688->657|692->661|692->661|692->661|692->661|693->662|693->662|695->664|695->664|696->665|696->665
                  -- GENERATED --
              */
          