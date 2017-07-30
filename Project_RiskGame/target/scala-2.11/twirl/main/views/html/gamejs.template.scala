
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

    var sendTimeoutMessage = function () """),format.raw/*59.42*/("""{"""),format.raw/*59.43*/("""
        """),format.raw/*60.9*/("""myTurn = "false";
        stopTimer();
        resetTimer();
        timer.hide();
        var data = JSON.stringify("""),format.raw/*64.35*/("""{"""),format.raw/*64.36*/(""""gameid": gameid, "type": "Timeout", "player": """),format.raw/*64.83*/("""{"""),format.raw/*64.84*/(""""username": username"""),format.raw/*64.104*/("""}"""),format.raw/*64.105*/("""}"""),format.raw/*64.106*/(""");
        socket.send(data);

        //updates turns completed count because missed turn is a lost turn
        var turnNo = parseInt($('#turnNo').html());
        // turnNo = turnNo+1;
        $('#turnNo').html(turnNo);

        //capture screen after timeout once turn Number field is updated
        takeSnapshot();
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/("""

    """),format.raw/*76.5*/("""var sendSkipTurnMessage = function () """),format.raw/*76.43*/("""{"""),format.raw/*76.44*/("""
        """),format.raw/*77.9*/("""myTurn = "false";
        stopTimer();
        resetTimer();
        timer.hide();
        var data = JSON.stringify("""),format.raw/*81.35*/("""{"""),format.raw/*81.36*/(""""gameid": gameid, "type": "SkipTurn", "player": """),format.raw/*81.84*/("""{"""),format.raw/*81.85*/(""""username": username"""),format.raw/*81.105*/("""}"""),format.raw/*81.106*/("""}"""),format.raw/*81.107*/(""");
        socket.send(data);

//updates turns completed count because skipped turn is a lost turn
        var turnNo = parseInt($('#turnNo').html());
       // turnNo = turnNo + 1;
        $('#turnNo').html(turnNo);

//capture screen after timeout once turn Number field is updated
        takeSnapshot();
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""

    """),format.raw/*93.5*/("""var username = $('#username').val();
    var gameid = $('#gameid').val();
    var activePlayersList = $('#activePlayersList');
    var timer = $('.mytimer');
    var turn = $('#turn').val();

    // get websocket class, firefox has a different way to get it
    var WS = window['MozWebSocket'] ? window['MozWebSocket'] : WebSocket;

    // open socket on page load
    var socket = new WS('"""),_display_(/*103.27*/routes/*103.33*/.Application.wsInterface().webSocketURL()),format.raw/*103.74*/("""');

    //this list will be used to append joining players
    var userList = $('#list-active-players');

    var writeMessages = function (event) """),format.raw/*108.42*/("""{"""),format.raw/*108.43*/("""
        """),format.raw/*109.9*/("""var model = event.data;

        //model is not coming as Json so have to use this jquery json parser
        model = jQuery.parseJSON(model);

        if (model.type == "joined") """),format.raw/*114.37*/("""{"""),format.raw/*114.38*/("""

            """),format.raw/*116.13*/("""var tmp_username = username.split("@")[0];

            var users = model.joinedUsers;
            activePlayersList.html("");
            activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');

            for (i = 0; i < users.length; i++) """),format.raw/*122.48*/("""{"""),format.raw/*122.49*/("""
                """),format.raw/*123.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*123.61*/("""{"""),format.raw/*123.62*/("""
                    """),format.raw/*124.21*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/("""//if
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/("""//for
        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/("""//joined

        else if (model.type == "LeaveGame") """),format.raw/*129.45*/("""{"""),format.raw/*129.46*/("""

            """),format.raw/*131.13*/("""var users = model.joinedUsers;
            var leavinguser = model.leavingUser;
            var activityLog = $('#activity-log');
            var txt = leavinguser + " left the game!";
            activityLog.prepend('<p>' + txt + '</p><hr/>');
            var deadTurn = parseInt(model.turnToSkip);
            var myTurn = parseInt($('#turn').val());
            var tmp_username = username.split("@")[0];
            var active = model.active;
            var turnNumber = parseInt(model.turnNumber);

            if (tmp_username == leavinguser) """),format.raw/*142.46*/("""{"""),format.raw/*142.47*/("""
                """),format.raw/*143.17*/("""$('#dashform').submit();
            """),format.raw/*144.13*/("""}"""),format.raw/*144.14*/("""

            """),format.raw/*146.13*/("""if (active && myTurn == turnNumber) """),format.raw/*146.49*/("""{"""),format.raw/*146.50*/("""
                """),format.raw/*147.17*/("""enableMyTurn();
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/("""

            """),format.raw/*150.13*/("""if (myTurn > deadTurn) """),format.raw/*150.36*/("""{"""),format.raw/*150.37*/("""
                """),format.raw/*151.17*/("""myTurn = myTurn - 1;
                $('#turn').val(myTurn);
            """),format.raw/*153.13*/("""}"""),format.raw/*153.14*/("""

            """),format.raw/*155.13*/("""var users = model.joinedUsers;
            activePlayersList.html("");
            activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');

            for (i = 0; i < users.length; i++) """),format.raw/*159.48*/("""{"""),format.raw/*159.49*/("""
                """),format.raw/*160.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*160.61*/("""{"""),format.raw/*160.62*/("""
                    """),format.raw/*161.21*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                """),format.raw/*162.17*/("""}"""),format.raw/*162.18*/("""//if
            """),format.raw/*163.13*/("""}"""),format.raw/*163.14*/("""//for
        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/("""

        """),format.raw/*166.9*/("""else if (model.type == "redirect") """),format.raw/*166.44*/("""{"""),format.raw/*166.45*/("""
            """),format.raw/*167.13*/("""$('#frmHidden').submit();
        """),format.raw/*168.9*/("""}"""),format.raw/*168.10*/("""

        """),format.raw/*170.9*/("""else if (model.type == "UpdateActivityLog") """),format.raw/*170.53*/("""{"""),format.raw/*170.54*/("""
            """),format.raw/*171.13*/("""var stepName = model.stepName,
                playerName = model.player.split("@")[0];

            var activityLog = $('#activity-log');
            var txt = playerName + " performed step: " + stepName;

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*178.9*/("""}"""),format.raw/*178.10*/("""//UpdateActivityLog

        else if (model.type == "UpdateActivityLogWithOopsSurprise") """),format.raw/*180.69*/("""{"""),format.raw/*180.70*/("""
            """),format.raw/*181.13*/("""var stepName = model.stepName,
                    playerName = model.player.split("@")[0];

            var activityLog = $('#activity-log');
            var txt = playerName + " performed step: " + stepName;

            activityLog.find('p').first().remove();
            activityLog.find('hr').first().remove();

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""//UpdateActivityLogWithOopsSurprise

        else if (model.type == "Timeout") """),format.raw/*193.43*/("""{"""),format.raw/*193.44*/("""
            """),format.raw/*194.13*/("""var playerName = model.player;

            var activityLog = $('#activity-log');

            var txt = playerName + " missed their turn due to timeout!";

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*201.9*/("""}"""),format.raw/*201.10*/("""//Timeout

        else if (model.type == "SkipTurn") """),format.raw/*203.44*/("""{"""),format.raw/*203.45*/("""
            """),format.raw/*204.13*/("""var playerName = model.player;

            var activityLog = $('#activity-log');

            var txt = playerName + " skipped their turn!";

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*211.9*/("""}"""),format.raw/*211.10*/("""//SkipTurn


        else if (model.type == "Chat") """),format.raw/*214.40*/("""{"""),format.raw/*214.41*/("""
            """),format.raw/*215.13*/("""var playerName = model.player.split("@")[0],
                message = model.message;

            var chatArea = $('#chatArea');

            var txt = "<b>" + playerName + "</b>: " + message;

            chatArea.append('<p>' + txt + '</p>');
        """),format.raw/*223.9*/("""}"""),format.raw/*223.10*/("""//Chat

        else if (model.type == "ChangeTurn") """),format.raw/*225.46*/("""{"""),format.raw/*225.47*/("""
            """),format.raw/*226.13*/("""var turnNumber = model.turnNumber,
                playerTurn = $('#turn').val();

            //alert("CTurn: " + turnNumber + ", PTurn: " + playerTurn + ", EStatus: " + (turnNumber == playerTurn));
            if (turnNumber == playerTurn) """),format.raw/*230.43*/("""{"""),format.raw/*230.44*/("""
"""),format.raw/*231.1*/("""var turnNo = parseInt($('#turnNo').html());
var maxTurns = document.getElementById('labelTurns').innerText;
if( turnNo <= maxTurns)"""),format.raw/*233.24*/("""{"""),format.raw/*233.25*/("""
"""),format.raw/*234.1*/("""swal("It's your turn!");
                enableMyTurn();
                publishMyTurn();

                if ($('#btnIsProduction').val() == "true") """),format.raw/*238.60*/("""{"""),format.raw/*238.61*/("""
                    """),format.raw/*239.21*/("""$('#btnSkip').trigger('click');
                """),format.raw/*240.17*/("""}"""),format.raw/*240.18*/("""
"""),format.raw/*241.1*/("""}"""),format.raw/*241.2*/("""
            """),format.raw/*242.13*/("""}"""),format.raw/*242.14*/("""else"""),format.raw/*242.18*/("""{"""),format.raw/*242.19*/("""
"""),format.raw/*243.1*/("""$("#btnSkip").attr("disabled",true);

            //publishMyTurn();

        """),format.raw/*247.9*/("""}"""),format.raw/*247.10*/("""
"""),format.raw/*248.1*/("""}"""),format.raw/*248.2*/("""//ChangeTurn

        else if (model.type == "TurnUpdate") """),format.raw/*250.46*/("""{"""),format.raw/*250.47*/("""
            """),format.raw/*251.13*/("""var currentPlayer = model.currentPlayer.split("@")[0];
            var tmp_username = username.split("@")[0];

            var users = model.joinedUsers;
            activePlayersList.html("");

            if (tmp_username == currentPlayer) """),format.raw/*257.48*/("""{"""),format.raw/*257.49*/("""
                """),format.raw/*258.17*/("""activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');
            """),format.raw/*259.13*/("""}"""),format.raw/*259.14*/("""

            """),format.raw/*261.13*/("""else """),format.raw/*261.18*/("""{"""),format.raw/*261.19*/("""
                """),format.raw/*262.17*/("""activePlayersList.append(tmp_username + ' (you)' + '<br/>');
            """),format.raw/*263.13*/("""}"""),format.raw/*263.14*/("""


            """),format.raw/*266.13*/("""for (i = 0; i < users.length; i++) """),format.raw/*266.48*/("""{"""),format.raw/*266.49*/("""
                """),format.raw/*267.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*267.61*/("""{"""),format.raw/*267.62*/("""
                    """),format.raw/*268.21*/("""if (users[i].split("-")[0] == currentPlayer) """),format.raw/*268.66*/("""{"""),format.raw/*268.67*/("""
                        """),format.raw/*269.25*/("""activePlayersList.append('<b>' + users[i].split("-")[0] + '</b><br/>');
                    """),format.raw/*270.21*/("""}"""),format.raw/*270.22*/("""

                    """),format.raw/*272.21*/("""else """),format.raw/*272.26*/("""{"""),format.raw/*272.27*/("""
                        """),format.raw/*273.25*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                    """),format.raw/*274.21*/("""}"""),format.raw/*274.22*/("""
                """),format.raw/*275.17*/("""}"""),format.raw/*275.18*/("""//if
            """),format.raw/*276.13*/("""}"""),format.raw/*276.14*/("""//for

        """),format.raw/*278.9*/("""}"""),format.raw/*278.10*/("""//TurnUpdate

        else """),format.raw/*280.14*/("""{"""),format.raw/*280.15*/("""
            """),format.raw/*281.13*/("""var name = model.name;
            $('#lblCount').text(count);
            $('#divJoined').prepend('<p>' + name + '</p>');
        """),format.raw/*284.9*/("""}"""),format.raw/*284.10*/("""
    """),format.raw/*285.5*/("""}"""),format.raw/*285.6*/("""

    """),format.raw/*287.5*/("""$('#editTodoDialog').on('shown.bs.modal', function () """),format.raw/*287.59*/("""{"""),format.raw/*287.60*/("""

        """),format.raw/*289.9*/("""if (myTurn == "true") """),format.raw/*289.31*/("""{"""),format.raw/*289.32*/("""

            """),format.raw/*291.60*/("""
            """),format.raw/*292.55*/("""
            """),format.raw/*293.60*/("""

        """),format.raw/*295.9*/("""}"""),format.raw/*295.10*/(""" """),format.raw/*295.11*/("""else """),format.raw/*295.16*/("""{"""),format.raw/*295.17*/("""

            """),format.raw/*297.13*/("""$(".perform-step").attr("disabled", true);
            """),format.raw/*298.54*/("""
            """),format.raw/*299.59*/("""
        """),format.raw/*300.9*/("""}"""),format.raw/*300.10*/("""


    """),format.raw/*303.5*/("""}"""),format.raw/*303.6*/(""");

$('#riskDialog').on('shown.bs.modal', function () """),format.raw/*305.51*/("""{"""),format.raw/*305.52*/("""

"""),format.raw/*307.1*/("""if (myTurn == "true") """),format.raw/*307.23*/("""{"""),format.raw/*307.24*/("""

"""),format.raw/*309.48*/("""
"""),format.raw/*310.43*/("""
"""),format.raw/*311.48*/("""

"""),format.raw/*313.1*/("""}"""),format.raw/*313.2*/(""" """),format.raw/*313.3*/("""else """),format.raw/*313.8*/("""{"""),format.raw/*313.9*/("""

"""),format.raw/*315.47*/("""
"""),format.raw/*316.42*/("""
"""),format.raw/*317.1*/("""$(".perform-risk").attr("disabled", true);
"""),format.raw/*318.1*/("""}"""),format.raw/*318.2*/("""


"""),format.raw/*321.1*/("""}"""),format.raw/*321.2*/(""");

    var publishMyTurn = function (event) """),format.raw/*323.42*/("""{"""),format.raw/*323.43*/("""
        """),format.raw/*324.9*/("""var data = JSON.stringify("""),format.raw/*324.35*/("""{"""),format.raw/*324.36*/("""
            """),format.raw/*325.13*/(""""gameid": gameid,
            "type": "TurnUpdate",
            "player": """),format.raw/*327.23*/("""{"""),format.raw/*327.24*/(""""name": username, "team": "somecode""""),format.raw/*327.60*/("""}"""),format.raw/*327.61*/("""
        """),format.raw/*328.9*/("""}"""),format.raw/*328.10*/(""");
        socket.send(data);
    """),format.raw/*330.5*/("""}"""),format.raw/*330.6*/("""

    """),format.raw/*332.5*/("""var initConnection = function (event) """),format.raw/*332.43*/("""{"""),format.raw/*332.44*/("""
        """),format.raw/*333.9*/("""registerGameId();
        publishMyPresence();
        checkIfFirstTurn();
    """),format.raw/*336.5*/("""}"""),format.raw/*336.6*/("""

    """),format.raw/*338.5*/("""var checkIfFirstTurn = function (event) """),format.raw/*338.45*/("""{"""),format.raw/*338.46*/("""
        """),format.raw/*339.9*/("""if (turn == "1") """),format.raw/*339.26*/("""{"""),format.raw/*339.27*/("""
            """),format.raw/*340.13*/("""enableMyTurn();
        """),format.raw/*341.9*/("""}"""),format.raw/*341.10*/("""else"""),format.raw/*341.14*/("""{"""),format.raw/*341.15*/("""
            """),format.raw/*342.13*/("""$("#btnSkip").attr("disabled",true);

        """),format.raw/*344.9*/("""}"""),format.raw/*344.10*/("""
    """),format.raw/*345.5*/("""}"""),format.raw/*345.6*/("""

    """),format.raw/*347.5*/("""//put all code inside this method to setup the stage for player who is having the current turn
    var enableMyTurn = function (event) """),format.raw/*348.41*/("""{"""),format.raw/*348.42*/("""
        """),format.raw/*349.9*/("""myTurn = "true";
$("#btnSkip").attr("disabled",false);
        timer.show();
        setTimer(timerTime);
        resetTimer();
        startTimer();
    """),format.raw/*355.5*/("""}"""),format.raw/*355.6*/("""

    """),format.raw/*357.5*/("""var publishMyPresence = function (event) """),format.raw/*357.46*/("""{"""),format.raw/*357.47*/("""
        """),format.raw/*358.9*/("""//push to socket on first page load of any user
        var data = JSON.stringify("""),format.raw/*359.35*/("""{"""),format.raw/*359.36*/("""
            """),format.raw/*360.13*/(""""gameid": gameid,
            "type": "joined",
            "player": """),format.raw/*362.23*/("""{"""),format.raw/*362.24*/(""""name": username, "team": "somecode""""),format.raw/*362.60*/("""}"""),format.raw/*362.61*/("""
        """),format.raw/*363.9*/("""}"""),format.raw/*363.10*/(""");
        socket.send(data);
    """),format.raw/*365.5*/("""}"""),format.raw/*365.6*/("""

    """),format.raw/*367.5*/("""var registerGameId = function (event) """),format.raw/*367.43*/("""{"""),format.raw/*367.44*/("""
        """),format.raw/*368.9*/("""//push to socket on first page load of any user
        var data = JSON.stringify("""),format.raw/*369.35*/("""{"""),format.raw/*369.36*/(""""gameid": gameid, "type": "RegisterGameId""""),format.raw/*369.78*/("""}"""),format.raw/*369.79*/(""");
        socket.send(data);
    """),format.raw/*371.5*/("""}"""),format.raw/*371.6*/("""

    """),format.raw/*373.5*/("""//read message from socket
    socket.onmessage = writeMessages;

    //without this I am getting exception that CONNECTION NOT ESTABLISHED
    socket.onopen = initConnection;


    $('#btnJoin').click(function (event) """),format.raw/*380.42*/("""{"""),format.raw/*380.43*/("""

        """),format.raw/*382.9*/("""var name = $('#txtName').val();
        var code = $('#txtCode').val();


        var data = JSON.stringify("""),format.raw/*386.35*/("""{"""),format.raw/*386.36*/(""""name": name, "team": code"""),format.raw/*386.62*/("""}"""),format.raw/*386.63*/(""");

        //push to socket
        socket.send(data);

        $('#txtName').val('');
        $('#txtCode').val('');

        $('#txtName').attr('hidden', true);
        $('#txtCode').attr('hidden', true);
        $('#divPlayerStatus').attr('hidden', false);
        $('#btnLeave').attr('hidden', false);
        $('#btnJoin').attr('hidden', true);
    """),format.raw/*399.5*/("""}"""),format.raw/*399.6*/(""");


    //Event handler for start game event
    $('#btnStart').click(function (e) """),format.raw/*403.39*/("""{"""),format.raw/*403.40*/("""

        """),format.raw/*405.9*/("""var username = $('#username').val();
        var data = JSON.stringify("""),format.raw/*406.35*/("""{"""),format.raw/*406.36*/(""""gameid": gameid, "type": "StartGame", "player": """),format.raw/*406.85*/("""{"""),format.raw/*406.86*/(""""username": username"""),format.raw/*406.106*/("""}"""),format.raw/*406.107*/("""}"""),format.raw/*406.108*/(""");
        socket.send(data);
    """),format.raw/*408.5*/("""}"""),format.raw/*408.6*/(""");

    //take snapshot only when modal is closed
    $('#editTodoDialog').on('hidden.bs.modal', function () """),format.raw/*411.60*/("""{"""),format.raw/*411.61*/("""
        """),format.raw/*412.9*/("""takeSnapshot();
    """),format.raw/*413.5*/("""}"""),format.raw/*413.6*/(""");

    //Perform step button event handler
    $('.perform-step').on("click", function () """),format.raw/*416.48*/("""{"""),format.raw/*416.49*/("""
        """),format.raw/*417.9*/("""myTurn = "false";
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
    """),format.raw/*433.5*/("""}"""),format.raw/*433.6*/(""");


$('#btnMitigateRisk').click(function()"""),format.raw/*436.39*/("""{"""),format.raw/*436.40*/("""

    """),format.raw/*438.5*/("""var id = $('#btnMitigateRisk').val();
     var tempStatus="riskStatus"+id;
        var status= document.getElementById('swalmessages').innerHTML;
        var title = "("+id+") "+status;
        document.getElementById('prevstep').innerHTML = id;
        funcChangeTurn(title);
        alert("hi");
 
"""),format.raw/*446.1*/("""}"""),format.raw/*446.2*/(""");

    
    var funcChangeTurn = function(title)"""),format.raw/*449.41*/("""{"""),format.raw/*449.42*/("""

        """),format.raw/*451.9*/("""updateActivityLogs(title);
        publishTurnNumber();

        takeSnapshot();

        stopTimer();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
    """),format.raw/*461.5*/("""}"""),format.raw/*461.6*/("""

    """),format.raw/*463.5*/("""$('#updateactivity').on("click", function () """),format.raw/*463.50*/("""{"""),format.raw/*463.51*/("""

        """),format.raw/*465.9*/("""var topModal = $(this).closest('div.modal'),
            parentModal = topModal.find('div.modal-content'),
            header = parentModal.find('div.modal-header'),
            title = header.find('.modal-title').html();

        var isoops = $('#isoops').val();
        var otitle = "";
        var oopsmsg = $('#oopsmsg').val();
        if (isoops == "true") """),format.raw/*473.31*/("""{"""),format.raw/*473.32*/("""
            """),format.raw/*474.13*/("""otitle = "You got an OOPS card." + oopsmsg;
        """),format.raw/*475.9*/("""}"""),format.raw/*475.10*/("""
        """),format.raw/*476.9*/("""else """),format.raw/*476.14*/("""{"""),format.raw/*476.15*/("""
            """),format.raw/*477.13*/("""otitle = "You got an Surprise card" + oopsmsg;
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/("""
        """),format.raw/*479.9*/("""updateActivityLogsWithSurpriseOrOops(otitle);

    """),format.raw/*481.5*/("""}"""),format.raw/*481.6*/(""");

    var takeSnapshot = function () """),format.raw/*483.36*/("""{"""),format.raw/*483.37*/("""
        """),format.raw/*484.9*/("""html2canvas(document.body, """),format.raw/*484.36*/("""{"""),format.raw/*484.37*/("""
            """),format.raw/*485.13*/("""onrendered: function (canvas) """),format.raw/*485.43*/("""{"""),format.raw/*485.44*/("""
                """),format.raw/*486.17*/("""//"""),format.raw/*486.57*/("""
                """),format.raw/*487.17*/("""uploadImage(canvas.toDataURL());
            """),format.raw/*488.13*/("""}"""),format.raw/*488.14*/("""
        """),format.raw/*489.9*/("""}"""),format.raw/*489.10*/(""");
    """),format.raw/*490.5*/("""}"""),format.raw/*490.6*/("""

    """),format.raw/*492.5*/("""var uploadImage = function (url) """),format.raw/*492.38*/("""{"""),format.raw/*492.39*/("""
        """),format.raw/*493.9*/("""var turnNo = parseInt($('#turnNo').html());
        turnNo = turnNo - 1;
        var obj = """),format.raw/*495.19*/("""{"""),format.raw/*495.20*/("""'image-data': url, 'username': username, 'gameid': gameid, 'turnNo': turnNo"""),format.raw/*495.95*/("""}"""),format.raw/*495.96*/(""";
        $.ajax("""),format.raw/*496.16*/("""{"""),format.raw/*496.17*/("""
            """),format.raw/*497.13*/("""type: 'POST',
            url: '"""),_display_(/*498.20*/routes/*498.26*/.GameController.saveImageSnapshot()),format.raw/*498.61*/("""',
            data: JSON.stringify(obj),
            contentType: 'application/json',
            success: function (data) """),format.raw/*501.38*/("""{"""),format.raw/*501.39*/("""
                """),format.raw/*502.17*/("""//alert("Image uploaded");
            """),format.raw/*503.13*/("""}"""),format.raw/*503.14*/("""
        """),format.raw/*504.9*/("""}"""),format.raw/*504.10*/(""");//ajax call ends here
    """),format.raw/*505.5*/("""}"""),format.raw/*505.6*/("""

    """),format.raw/*507.5*/("""var publishTurnNumber = function () """),format.raw/*507.41*/("""{"""),format.raw/*507.42*/("""
        """),format.raw/*508.9*/("""var turnNumber = $('#turn').val();
        var data = JSON.stringify("""),format.raw/*509.35*/("""{"""),format.raw/*509.36*/(""""gameid": gameid, "turnNumber": turnNumber, "type": "ChangeTurn""""),format.raw/*509.100*/("""}"""),format.raw/*509.101*/(""");
        socket.send(data);
    """),format.raw/*511.5*/("""}"""),format.raw/*511.6*/("""

    """),format.raw/*513.5*/("""var updateActivityLogs = function (title) """),format.raw/*513.47*/("""{"""),format.raw/*513.48*/("""
        """),format.raw/*514.9*/("""var data = JSON.stringify("""),format.raw/*514.35*/("""{"""),format.raw/*514.36*/("""
            """),format.raw/*515.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStep",
            "player": """),format.raw/*518.23*/("""{"""),format.raw/*518.24*/(""""username": username"""),format.raw/*518.44*/("""}"""),format.raw/*518.45*/("""
        """),format.raw/*519.9*/("""}"""),format.raw/*519.10*/(""");
        socket.send(data);
    """),format.raw/*521.5*/("""}"""),format.raw/*521.6*/("""

    """),format.raw/*523.5*/("""var updateActivityLogsWithSurpriseOrOops = function (title) """),format.raw/*523.65*/("""{"""),format.raw/*523.66*/("""
        """),format.raw/*524.9*/("""var data = JSON.stringify("""),format.raw/*524.35*/("""{"""),format.raw/*524.36*/("""
            """),format.raw/*525.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStepWithOopsSurprise",
            "player": """),format.raw/*528.23*/("""{"""),format.raw/*528.24*/(""""username": username"""),format.raw/*528.44*/("""}"""),format.raw/*528.45*/("""
        """),format.raw/*529.9*/("""}"""),format.raw/*529.10*/(""");
        socket.send(data);
    """),format.raw/*531.5*/("""}"""),format.raw/*531.6*/("""

    """),format.raw/*533.5*/("""$('#btnSend').click(function () """),format.raw/*533.37*/("""{"""),format.raw/*533.38*/("""
        """),format.raw/*534.9*/("""var message = $('#txtMessage').val();
        $('#txtMessage').val('');
        if (message != "") """),format.raw/*536.28*/("""{"""),format.raw/*536.29*/("""
            """),format.raw/*537.13*/("""var data = JSON.stringify("""),format.raw/*537.39*/("""{"""),format.raw/*537.40*/("""
                """),format.raw/*538.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*541.27*/("""{"""),format.raw/*541.28*/(""""username": username"""),format.raw/*541.48*/("""}"""),format.raw/*541.49*/("""
            """),format.raw/*542.13*/("""}"""),format.raw/*542.14*/(""");
            socket.send(data);
        """),format.raw/*544.9*/("""}"""),format.raw/*544.10*/("""
    """),format.raw/*545.5*/("""}"""),format.raw/*545.6*/(""");

    var sendChatMessage = function (message) """),format.raw/*547.46*/("""{"""),format.raw/*547.47*/("""
        """),format.raw/*548.9*/("""if (message != "") """),format.raw/*548.28*/("""{"""),format.raw/*548.29*/("""
            """),format.raw/*549.13*/("""var data = JSON.stringify("""),format.raw/*549.39*/("""{"""),format.raw/*549.40*/("""
                """),format.raw/*550.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*553.27*/("""{"""),format.raw/*553.28*/(""""username": username"""),format.raw/*553.48*/("""}"""),format.raw/*553.49*/("""
            """),format.raw/*554.13*/("""}"""),format.raw/*554.14*/(""");
            socket.send(data);
        """),format.raw/*556.9*/("""}"""),format.raw/*556.10*/("""
    """),format.raw/*557.5*/("""}"""),format.raw/*557.6*/("""

    """),format.raw/*559.5*/("""$('#btnLeave').click(function (e) """),format.raw/*559.39*/("""{"""),format.raw/*559.40*/("""

        """),format.raw/*561.9*/("""var data = JSON.stringify("""),format.raw/*561.35*/("""{"""),format.raw/*561.36*/(""""type": "leaving", "player": """),format.raw/*561.65*/("""{"""),format.raw/*561.66*/(""""username": username"""),format.raw/*561.86*/("""}"""),format.raw/*561.87*/("""}"""),format.raw/*561.88*/(""");
        socket.send(data);

        $.ajax("""),format.raw/*564.16*/("""{"""),format.raw/*564.17*/("""
            """),format.raw/*565.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*567.19*/("""{"""),format.raw/*567.20*/("""'username': username"""),format.raw/*567.40*/("""}"""),format.raw/*567.41*/(""",
            success: function (data) """),format.raw/*568.38*/("""{"""),format.raw/*568.39*/("""
                """),format.raw/*569.17*/("""window.location.replace("/");
            """),format.raw/*570.13*/("""}"""),format.raw/*570.14*/("""
        """),format.raw/*571.9*/("""}"""),format.raw/*571.10*/(""");
    """),format.raw/*572.5*/("""}"""),format.raw/*572.6*/(""");


    $('#btnSkip').click(function () """),format.raw/*575.37*/("""{"""),format.raw/*575.38*/("""
        """),format.raw/*576.9*/("""timeout = true;
        sendSkipTurnMessage();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
        //In case of timeout, next player should get his turn
        publishTurnNumber();
    """),format.raw/*584.5*/("""}"""),format.raw/*584.6*/(""");

    $('#txtMessage').keyup(function (event) """),format.raw/*586.45*/("""{"""),format.raw/*586.46*/("""

        """),format.raw/*588.9*/("""if (event.keyCode == 13) """),format.raw/*588.34*/("""{"""),format.raw/*588.35*/("""

            """),format.raw/*590.13*/("""//check if length is more than 150
            if ($(this).val().length <= 150) """),format.raw/*591.46*/("""{"""),format.raw/*591.47*/("""
                """),format.raw/*592.17*/("""sendChatMessage($(this).val());
                $('#txtMessage').val('');
                return;
            """),format.raw/*595.13*/("""}"""),format.raw/*595.14*/("""
        """),format.raw/*596.9*/("""}"""),format.raw/*596.10*/("""

        """),format.raw/*598.9*/("""var length = $(this).val().length;
        if (length > 150) """),format.raw/*599.27*/("""{"""),format.raw/*599.28*/("""
            """),format.raw/*600.13*/("""$(this).css('color', 'red');
        """),format.raw/*601.9*/("""}"""),format.raw/*601.10*/("""
        """),format.raw/*602.9*/("""else """),format.raw/*602.14*/("""{"""),format.raw/*602.15*/("""
            """),format.raw/*603.13*/("""$(this).css('color', 'black');
        """),format.raw/*604.9*/("""}"""),format.raw/*604.10*/("""
    """),format.raw/*605.5*/("""}"""),format.raw/*605.6*/(""");


    $('#lnkLeave').click(function () """),format.raw/*608.38*/("""{"""),format.raw/*608.39*/("""
       """),format.raw/*609.8*/("""// alert("her2");
        // var obj = """),format.raw/*610.22*/("""{"""),format.raw/*610.23*/("""'username' : username, 'gameid' : gameid"""),format.raw/*610.63*/("""}"""),format.raw/*610.64*/(""";
        // $.ajax("""),format.raw/*611.19*/("""{"""),format.raw/*611.20*/("""
        """),format.raw/*612.9*/("""//     type: 'POST',
        //     url: '/leave',
        //     data: JSON.stringify(obj),
        //     contentType: 'application/json',
        //     success: function (data) """),format.raw/*616.41*/("""{"""),format.raw/*616.42*/("""
        """),format.raw/*617.9*/("""//         if(data=="success")"""),format.raw/*617.39*/("""{"""),format.raw/*617.40*/("""
        """),format.raw/*618.9*/("""//             notifyOthers();
        //             $('#dashform').submit();
        //         """),format.raw/*620.20*/("""}"""),format.raw/*620.21*/("""
        """),format.raw/*621.9*/("""//     """),format.raw/*621.16*/("""}"""),format.raw/*621.17*/("""
        """),format.raw/*622.9*/("""// """),format.raw/*622.12*/("""}"""),format.raw/*622.13*/(""");//ajax call ends here
        notifyOthers();
    """),format.raw/*624.5*/("""}"""),format.raw/*624.6*/(""");

    var notifyOthers = function () """),format.raw/*626.36*/("""{"""),format.raw/*626.37*/("""
        """),format.raw/*627.9*/("""var turn = $('#turn').val();

        var isActivePlayer = myTurn == "true" ? true : false;

        var data = JSON.stringify("""),format.raw/*631.35*/("""{"""),format.raw/*631.36*/("""
            """),format.raw/*632.13*/(""""gameid": gameid,
            "type": "LeaveGame",
            "active": isActivePlayer,
            "turnNumber": turn,
            "player": """),format.raw/*636.23*/("""{"""),format.raw/*636.24*/(""""username": username"""),format.raw/*636.44*/("""}"""),format.raw/*636.45*/("""
        """),format.raw/*637.9*/("""}"""),format.raw/*637.10*/(""");
        socket.send(data);
    """),format.raw/*639.5*/("""}"""),format.raw/*639.6*/("""
"""),format.raw/*640.1*/("""}"""),format.raw/*640.2*/(""");"""))
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
                  DATE: Sun Jul 30 02:10:24 EDT 2017
                  SOURCE: /Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/gamejs.scala.html
                  HASH: 0e2e437923e18114e993f775dfa4a5938a3b74ef
                  MATRIX: 829->0|870->14|898->15|930->21|1308->371|1337->372|1373->381|1480->460|1509->461|1551->475|1605->501|1634->502|1662->503|1820->633|1849->634|1894->651|2244->974|2273->975|2314->988|2343->989|2379->998|2408->999|2440->1004|2468->1005|2610->1119|2639->1120|2675->1129|2755->1182|2783->1183|2816->1189|2875->1220|2904->1221|2940->1230|2992->1255|3020->1256|3053->1262|3109->1290|3138->1291|3174->1300|3243->1342|3271->1343|3304->1349|3361->1378|3390->1379|3426->1388|3499->1434|3527->1435|3560->1441|3647->1500|3676->1501|3712->1510|3857->1627|3886->1628|3961->1675|3990->1676|4039->1696|4069->1697|4099->1698|4451->2023|4479->2024|4512->2030|4578->2068|4607->2069|4643->2078|4788->2195|4817->2196|4893->2244|4922->2245|4971->2265|5001->2266|5031->2267|5369->2578|5397->2579|5430->2585|5849->2976|5865->2982|5928->3023|6105->3171|6135->3172|6172->3181|6381->3361|6411->3362|6454->3376|6743->3637|6773->3638|6819->3655|6892->3699|6922->3700|6972->3721|7077->3797|7107->3798|7153->3815|7183->3816|7225->3830|7255->3831|7338->3885|7368->3886|7411->3900|7990->4451|8020->4452|8066->4469|8132->4506|8162->4507|8205->4521|8270->4557|8300->4558|8346->4575|8403->4603|8433->4604|8476->4618|8528->4641|8558->4642|8604->4659|8706->4732|8736->4733|8779->4747|9012->4951|9042->4952|9088->4969|9161->5013|9191->5014|9241->5035|9346->5111|9376->5112|9422->5129|9452->5130|9494->5144|9524->5145|9562->5155|9626->5190|9656->5191|9698->5204|9760->5238|9790->5239|9828->5249|9901->5293|9931->5294|9973->5307|10276->5583|10306->5584|10424->5673|10454->5674|10496->5687|10909->6073|10939->6074|11047->6153|11077->6154|11119->6167|11372->6392|11402->6393|11485->6447|11515->6448|11557->6461|11796->6672|11826->6673|11907->6725|11937->6726|11979->6739|12261->6994|12291->6995|12373->7048|12403->7049|12445->7062|12716->7304|12746->7305|12775->7306|12935->7437|12965->7438|12994->7439|13173->7589|13203->7590|13253->7611|13330->7659|13360->7660|13389->7661|13418->7662|13460->7675|13490->7676|13523->7680|13553->7681|13582->7682|13688->7760|13718->7761|13747->7762|13776->7763|13864->7822|13894->7823|13936->7836|14207->8080|14237->8081|14283->8098|14397->8183|14427->8184|14470->8198|14504->8203|14534->8204|14580->8221|14682->8294|14712->8295|14756->8310|14820->8345|14850->8346|14896->8363|14969->8407|14999->8408|15049->8429|15123->8474|15153->8475|15207->8500|15328->8592|15358->8593|15409->8615|15443->8620|15473->8621|15527->8646|15636->8726|15666->8727|15712->8744|15742->8745|15788->8762|15818->8763|15861->8778|15891->8779|15947->8806|15977->8807|16019->8820|16178->8951|16208->8952|16241->8957|16270->8958|16304->8964|16387->9018|16417->9019|16455->9029|16506->9051|16536->9052|16579->9113|16621->9168|16663->9228|16701->9238|16731->9239|16761->9240|16795->9245|16825->9246|16868->9260|16952->9356|16994->9415|17031->9424|17061->9425|17096->9432|17125->9433|17208->9487|17238->9488|17268->9490|17319->9512|17349->9513|17380->9562|17410->9605|17440->9653|17470->9655|17499->9656|17528->9657|17561->9662|17590->9663|17621->9711|17651->9753|17680->9754|17751->9797|17780->9798|17811->9801|17840->9802|17914->9847|17944->9848|17981->9857|18036->9883|18066->9884|18108->9897|18211->9971|18241->9972|18306->10008|18336->10009|18373->10018|18403->10019|18465->10053|18494->10054|18528->10060|18595->10098|18625->10099|18662->10108|18769->10187|18798->10188|18832->10194|18901->10234|18931->10235|18968->10244|19014->10261|19044->10262|19086->10275|19138->10299|19168->10300|19201->10304|19231->10305|19273->10318|19347->10364|19377->10365|19410->10370|19439->10371|19473->10377|19637->10512|19667->10513|19704->10522|19886->10676|19915->10677|19949->10683|20019->10724|20049->10725|20086->10734|20197->10816|20227->10817|20269->10830|20368->10900|20398->10901|20463->10937|20493->10938|20530->10947|20560->10948|20622->10982|20651->10983|20685->10989|20752->11027|20782->11028|20819->11037|20930->11119|20960->11120|21031->11162|21061->11163|21123->11197|21152->11198|21186->11204|21434->11423|21464->11424|21502->11434|21639->11542|21669->11543|21724->11569|21754->11570|22137->11925|22166->11926|22279->12010|22309->12011|22347->12021|22447->12092|22477->12093|22555->12142|22585->12143|22635->12163|22666->12164|22697->12165|22759->12199|22788->12200|22926->12309|22956->12310|22993->12319|23041->12339|23070->12340|23190->12431|23220->12432|23257->12441|23767->12923|23796->12924|23868->12967|23898->12968|23932->12974|24260->13274|24289->13275|24367->13324|24397->13325|24435->13335|24644->13516|24673->13517|24707->13523|24781->13568|24811->13569|24849->13579|25240->13941|25270->13942|25312->13955|25392->14007|25422->14008|25459->14017|25493->14022|25523->14023|25565->14036|25648->14091|25678->14092|25715->14101|25794->14152|25823->14153|25891->14192|25921->14193|25958->14202|26014->14229|26044->14230|26086->14243|26145->14273|26175->14274|26221->14291|26252->14331|26298->14348|26372->14393|26402->14394|26439->14403|26469->14404|26504->14411|26533->14412|26567->14418|26629->14451|26659->14452|26696->14461|26816->14552|26846->14553|26950->14628|26980->14629|27026->14646|27056->14647|27098->14660|27159->14693|27175->14699|27232->14734|27385->14858|27415->14859|27461->14876|27529->14915|27559->14916|27596->14925|27626->14926|27682->14954|27711->14955|27745->14961|27810->14997|27840->14998|27877->15007|27975->15076|28005->15077|28099->15141|28130->15142|28192->15176|28221->15177|28255->15183|28326->15225|28356->15226|28393->15235|28448->15261|28478->15262|28520->15275|28655->15381|28685->15382|28734->15402|28764->15403|28801->15412|28831->15413|28893->15447|28922->15448|28956->15454|29045->15514|29075->15515|29112->15524|29167->15550|29197->15551|29239->15564|29390->15686|29420->15687|29469->15707|29499->15708|29536->15717|29566->15718|29628->15752|29657->15753|29691->15759|29752->15791|29782->15792|29819->15801|29947->15900|29977->15901|30019->15914|30074->15940|30104->15941|30150->15958|30291->16070|30321->16071|30370->16091|30400->16092|30442->16105|30472->16106|30542->16148|30572->16149|30605->16154|30634->16155|30712->16204|30742->16205|30779->16214|30827->16233|30857->16234|30899->16247|30954->16273|30984->16274|31030->16291|31171->16403|31201->16404|31250->16424|31280->16425|31322->16438|31352->16439|31422->16481|31452->16482|31485->16487|31514->16488|31548->16494|31611->16528|31641->16529|31679->16539|31734->16565|31764->16566|31822->16595|31852->16596|31901->16616|31931->16617|31961->16618|32036->16664|32066->16665|32108->16678|32195->16736|32225->16737|32274->16757|32304->16758|32372->16797|32402->16798|32448->16815|32519->16857|32549->16858|32586->16867|32616->16868|32651->16875|32680->16876|32750->16917|32780->16918|32817->16927|33061->17143|33090->17144|33167->17192|33197->17193|33235->17203|33289->17228|33319->17229|33362->17243|33471->17323|33501->17324|33547->17341|33686->17451|33716->17452|33753->17461|33783->17462|33821->17472|33911->17533|33941->17534|33983->17547|34048->17584|34078->17585|34115->17594|34149->17599|34179->17600|34221->17613|34288->17652|34318->17653|34351->17658|34380->17659|34451->17701|34481->17702|34517->17710|34585->17749|34615->17750|34684->17790|34714->17791|34763->17811|34793->17812|34830->17821|35040->18002|35070->18003|35107->18012|35166->18042|35196->18043|35233->18052|35360->18150|35390->18151|35427->18160|35463->18167|35493->18168|35530->18177|35562->18180|35592->18181|35672->18233|35701->18234|35769->18273|35799->18274|35836->18283|35992->18410|36022->18411|36064->18424|36236->18567|36266->18568|36315->18588|36345->18589|36382->18598|36412->18599|36474->18633|36503->18634|36532->18635|36561->18636
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|52->21|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|69->38|69->38|70->39|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|79->48|81->50|81->50|83->52|83->52|83->52|84->53|86->55|86->55|88->57|90->59|90->59|91->60|95->64|95->64|95->64|95->64|95->64|95->64|95->64|105->74|105->74|107->76|107->76|107->76|108->77|112->81|112->81|112->81|112->81|112->81|112->81|112->81|122->91|122->91|124->93|134->103|134->103|134->103|139->108|139->108|140->109|145->114|145->114|147->116|153->122|153->122|154->123|154->123|154->123|155->124|156->125|156->125|157->126|157->126|158->127|158->127|160->129|160->129|162->131|173->142|173->142|174->143|175->144|175->144|177->146|177->146|177->146|178->147|179->148|179->148|181->150|181->150|181->150|182->151|184->153|184->153|186->155|190->159|190->159|191->160|191->160|191->160|192->161|193->162|193->162|194->163|194->163|195->164|195->164|197->166|197->166|197->166|198->167|199->168|199->168|201->170|201->170|201->170|202->171|209->178|209->178|211->180|211->180|212->181|222->191|222->191|224->193|224->193|225->194|232->201|232->201|234->203|234->203|235->204|242->211|242->211|245->214|245->214|246->215|254->223|254->223|256->225|256->225|257->226|261->230|261->230|262->231|264->233|264->233|265->234|269->238|269->238|270->239|271->240|271->240|272->241|272->241|273->242|273->242|273->242|273->242|274->243|278->247|278->247|279->248|279->248|281->250|281->250|282->251|288->257|288->257|289->258|290->259|290->259|292->261|292->261|292->261|293->262|294->263|294->263|297->266|297->266|297->266|298->267|298->267|298->267|299->268|299->268|299->268|300->269|301->270|301->270|303->272|303->272|303->272|304->273|305->274|305->274|306->275|306->275|307->276|307->276|309->278|309->278|311->280|311->280|312->281|315->284|315->284|316->285|316->285|318->287|318->287|318->287|320->289|320->289|320->289|322->291|323->292|324->293|326->295|326->295|326->295|326->295|326->295|328->297|329->298|330->299|331->300|331->300|334->303|334->303|336->305|336->305|338->307|338->307|338->307|340->309|341->310|342->311|344->313|344->313|344->313|344->313|344->313|346->315|347->316|348->317|349->318|349->318|352->321|352->321|354->323|354->323|355->324|355->324|355->324|356->325|358->327|358->327|358->327|358->327|359->328|359->328|361->330|361->330|363->332|363->332|363->332|364->333|367->336|367->336|369->338|369->338|369->338|370->339|370->339|370->339|371->340|372->341|372->341|372->341|372->341|373->342|375->344|375->344|376->345|376->345|378->347|379->348|379->348|380->349|386->355|386->355|388->357|388->357|388->357|389->358|390->359|390->359|391->360|393->362|393->362|393->362|393->362|394->363|394->363|396->365|396->365|398->367|398->367|398->367|399->368|400->369|400->369|400->369|400->369|402->371|402->371|404->373|411->380|411->380|413->382|417->386|417->386|417->386|417->386|430->399|430->399|434->403|434->403|436->405|437->406|437->406|437->406|437->406|437->406|437->406|437->406|439->408|439->408|442->411|442->411|443->412|444->413|444->413|447->416|447->416|448->417|464->433|464->433|467->436|467->436|469->438|477->446|477->446|480->449|480->449|482->451|492->461|492->461|494->463|494->463|494->463|496->465|504->473|504->473|505->474|506->475|506->475|507->476|507->476|507->476|508->477|509->478|509->478|510->479|512->481|512->481|514->483|514->483|515->484|515->484|515->484|516->485|516->485|516->485|517->486|517->486|518->487|519->488|519->488|520->489|520->489|521->490|521->490|523->492|523->492|523->492|524->493|526->495|526->495|526->495|526->495|527->496|527->496|528->497|529->498|529->498|529->498|532->501|532->501|533->502|534->503|534->503|535->504|535->504|536->505|536->505|538->507|538->507|538->507|539->508|540->509|540->509|540->509|540->509|542->511|542->511|544->513|544->513|544->513|545->514|545->514|545->514|546->515|549->518|549->518|549->518|549->518|550->519|550->519|552->521|552->521|554->523|554->523|554->523|555->524|555->524|555->524|556->525|559->528|559->528|559->528|559->528|560->529|560->529|562->531|562->531|564->533|564->533|564->533|565->534|567->536|567->536|568->537|568->537|568->537|569->538|572->541|572->541|572->541|572->541|573->542|573->542|575->544|575->544|576->545|576->545|578->547|578->547|579->548|579->548|579->548|580->549|580->549|580->549|581->550|584->553|584->553|584->553|584->553|585->554|585->554|587->556|587->556|588->557|588->557|590->559|590->559|590->559|592->561|592->561|592->561|592->561|592->561|592->561|592->561|592->561|595->564|595->564|596->565|598->567|598->567|598->567|598->567|599->568|599->568|600->569|601->570|601->570|602->571|602->571|603->572|603->572|606->575|606->575|607->576|615->584|615->584|617->586|617->586|619->588|619->588|619->588|621->590|622->591|622->591|623->592|626->595|626->595|627->596|627->596|629->598|630->599|630->599|631->600|632->601|632->601|633->602|633->602|633->602|634->603|635->604|635->604|636->605|636->605|639->608|639->608|640->609|641->610|641->610|641->610|641->610|642->611|642->611|643->612|647->616|647->616|648->617|648->617|648->617|649->618|651->620|651->620|652->621|652->621|652->621|653->622|653->622|653->622|655->624|655->624|657->626|657->626|658->627|662->631|662->631|663->632|667->636|667->636|667->636|667->636|668->637|668->637|670->639|670->639|671->640|671->640
                  -- GENERATED --
              */
          