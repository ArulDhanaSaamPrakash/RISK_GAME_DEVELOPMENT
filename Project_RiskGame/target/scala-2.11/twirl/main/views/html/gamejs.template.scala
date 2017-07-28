
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
    var title = "Risk with id " + title + " mitigated.";
    funcChangeTurn(title);

"""),format.raw/*442.1*/("""}"""),format.raw/*442.2*/(""");

    var funcChangeTurn = function(title)"""),format.raw/*444.41*/("""{"""),format.raw/*444.42*/("""

        """),format.raw/*446.9*/("""updateActivityLogs(title);
        publishTurnNumber();

        takeSnapshot();

        stopTimer();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
    """),format.raw/*456.5*/("""}"""),format.raw/*456.6*/("""

    """),format.raw/*458.5*/("""$('#updateactivity').on("click", function () """),format.raw/*458.50*/("""{"""),format.raw/*458.51*/("""

        """),format.raw/*460.9*/("""var topModal = $(this).closest('div.modal'),
            parentModal = topModal.find('div.modal-content'),
            header = parentModal.find('div.modal-header'),
            title = header.find('.modal-title').html();

        var isoops = $('#isoops').val();
        var otitle = "";
        var oopsmsg = $('#oopsmsg').val();
        if (isoops == "true") """),format.raw/*468.31*/("""{"""),format.raw/*468.32*/("""
            """),format.raw/*469.13*/("""otitle = "You got an OOPS card." + oopsmsg;
        """),format.raw/*470.9*/("""}"""),format.raw/*470.10*/("""
        """),format.raw/*471.9*/("""else """),format.raw/*471.14*/("""{"""),format.raw/*471.15*/("""
            """),format.raw/*472.13*/("""otitle = "You got an Surprise card" + oopsmsg;
        """),format.raw/*473.9*/("""}"""),format.raw/*473.10*/("""
        """),format.raw/*474.9*/("""updateActivityLogsWithSurpriseOrOops(otitle);

    """),format.raw/*476.5*/("""}"""),format.raw/*476.6*/(""");

    var takeSnapshot = function () """),format.raw/*478.36*/("""{"""),format.raw/*478.37*/("""
        """),format.raw/*479.9*/("""html2canvas(document.body, """),format.raw/*479.36*/("""{"""),format.raw/*479.37*/("""
            """),format.raw/*480.13*/("""onrendered: function (canvas) """),format.raw/*480.43*/("""{"""),format.raw/*480.44*/("""
                """),format.raw/*481.17*/("""//"""),format.raw/*481.57*/("""
                """),format.raw/*482.17*/("""uploadImage(canvas.toDataURL());
            """),format.raw/*483.13*/("""}"""),format.raw/*483.14*/("""
        """),format.raw/*484.9*/("""}"""),format.raw/*484.10*/(""");
    """),format.raw/*485.5*/("""}"""),format.raw/*485.6*/("""

    """),format.raw/*487.5*/("""var uploadImage = function (url) """),format.raw/*487.38*/("""{"""),format.raw/*487.39*/("""
        """),format.raw/*488.9*/("""var turnNo = parseInt($('#turnNo').html());
        turnNo = turnNo - 1;
        var obj = """),format.raw/*490.19*/("""{"""),format.raw/*490.20*/("""'image-data': url, 'username': username, 'gameid': gameid, 'turnNo': turnNo"""),format.raw/*490.95*/("""}"""),format.raw/*490.96*/(""";
        $.ajax("""),format.raw/*491.16*/("""{"""),format.raw/*491.17*/("""
            """),format.raw/*492.13*/("""type: 'POST',
            url: '"""),_display_(/*493.20*/routes/*493.26*/.GameController.saveImageSnapshot()),format.raw/*493.61*/("""',
            data: JSON.stringify(obj),
            contentType: 'application/json',
            success: function (data) """),format.raw/*496.38*/("""{"""),format.raw/*496.39*/("""
                """),format.raw/*497.17*/("""//alert("Image uploaded");
            """),format.raw/*498.13*/("""}"""),format.raw/*498.14*/("""
        """),format.raw/*499.9*/("""}"""),format.raw/*499.10*/(""");//ajax call ends here
    """),format.raw/*500.5*/("""}"""),format.raw/*500.6*/("""

    """),format.raw/*502.5*/("""var publishTurnNumber = function () """),format.raw/*502.41*/("""{"""),format.raw/*502.42*/("""
        """),format.raw/*503.9*/("""var turnNumber = $('#turn').val();
        var data = JSON.stringify("""),format.raw/*504.35*/("""{"""),format.raw/*504.36*/(""""gameid": gameid, "turnNumber": turnNumber, "type": "ChangeTurn""""),format.raw/*504.100*/("""}"""),format.raw/*504.101*/(""");
        socket.send(data);
    """),format.raw/*506.5*/("""}"""),format.raw/*506.6*/("""

    """),format.raw/*508.5*/("""var updateActivityLogs = function (title) """),format.raw/*508.47*/("""{"""),format.raw/*508.48*/("""
        """),format.raw/*509.9*/("""var data = JSON.stringify("""),format.raw/*509.35*/("""{"""),format.raw/*509.36*/("""
            """),format.raw/*510.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStep",
            "player": """),format.raw/*513.23*/("""{"""),format.raw/*513.24*/(""""username": username"""),format.raw/*513.44*/("""}"""),format.raw/*513.45*/("""
        """),format.raw/*514.9*/("""}"""),format.raw/*514.10*/(""");
        socket.send(data);
    """),format.raw/*516.5*/("""}"""),format.raw/*516.6*/("""

    """),format.raw/*518.5*/("""var updateActivityLogsWithSurpriseOrOops = function (title) """),format.raw/*518.65*/("""{"""),format.raw/*518.66*/("""
        """),format.raw/*519.9*/("""var data = JSON.stringify("""),format.raw/*519.35*/("""{"""),format.raw/*519.36*/("""
            """),format.raw/*520.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStepWithOopsSurprise",
            "player": """),format.raw/*523.23*/("""{"""),format.raw/*523.24*/(""""username": username"""),format.raw/*523.44*/("""}"""),format.raw/*523.45*/("""
        """),format.raw/*524.9*/("""}"""),format.raw/*524.10*/(""");
        socket.send(data);
    """),format.raw/*526.5*/("""}"""),format.raw/*526.6*/("""

    """),format.raw/*528.5*/("""$('#btnSend').click(function () """),format.raw/*528.37*/("""{"""),format.raw/*528.38*/("""
        """),format.raw/*529.9*/("""var message = $('#txtMessage').val();
        $('#txtMessage').val('');
        if (message != "") """),format.raw/*531.28*/("""{"""),format.raw/*531.29*/("""
            """),format.raw/*532.13*/("""var data = JSON.stringify("""),format.raw/*532.39*/("""{"""),format.raw/*532.40*/("""
                """),format.raw/*533.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*536.27*/("""{"""),format.raw/*536.28*/(""""username": username"""),format.raw/*536.48*/("""}"""),format.raw/*536.49*/("""
            """),format.raw/*537.13*/("""}"""),format.raw/*537.14*/(""");
            socket.send(data);
        """),format.raw/*539.9*/("""}"""),format.raw/*539.10*/("""
    """),format.raw/*540.5*/("""}"""),format.raw/*540.6*/(""");

    var sendChatMessage = function (message) """),format.raw/*542.46*/("""{"""),format.raw/*542.47*/("""
        """),format.raw/*543.9*/("""if (message != "") """),format.raw/*543.28*/("""{"""),format.raw/*543.29*/("""
            """),format.raw/*544.13*/("""var data = JSON.stringify("""),format.raw/*544.39*/("""{"""),format.raw/*544.40*/("""
                """),format.raw/*545.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*548.27*/("""{"""),format.raw/*548.28*/(""""username": username"""),format.raw/*548.48*/("""}"""),format.raw/*548.49*/("""
            """),format.raw/*549.13*/("""}"""),format.raw/*549.14*/(""");
            socket.send(data);
        """),format.raw/*551.9*/("""}"""),format.raw/*551.10*/("""
    """),format.raw/*552.5*/("""}"""),format.raw/*552.6*/("""

    """),format.raw/*554.5*/("""$('#btnLeave').click(function (e) """),format.raw/*554.39*/("""{"""),format.raw/*554.40*/("""

        """),format.raw/*556.9*/("""var data = JSON.stringify("""),format.raw/*556.35*/("""{"""),format.raw/*556.36*/(""""type": "leaving", "player": """),format.raw/*556.65*/("""{"""),format.raw/*556.66*/(""""username": username"""),format.raw/*556.86*/("""}"""),format.raw/*556.87*/("""}"""),format.raw/*556.88*/(""");
        socket.send(data);

        $.ajax("""),format.raw/*559.16*/("""{"""),format.raw/*559.17*/("""
            """),format.raw/*560.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*562.19*/("""{"""),format.raw/*562.20*/("""'username': username"""),format.raw/*562.40*/("""}"""),format.raw/*562.41*/(""",
            success: function (data) """),format.raw/*563.38*/("""{"""),format.raw/*563.39*/("""
                """),format.raw/*564.17*/("""window.location.replace("/");
            """),format.raw/*565.13*/("""}"""),format.raw/*565.14*/("""
        """),format.raw/*566.9*/("""}"""),format.raw/*566.10*/(""");
    """),format.raw/*567.5*/("""}"""),format.raw/*567.6*/(""");


    $('#btnSkip').click(function () """),format.raw/*570.37*/("""{"""),format.raw/*570.38*/("""
        """),format.raw/*571.9*/("""timeout = true;
        sendSkipTurnMessage();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
        //In case of timeout, next player should get his turn
        publishTurnNumber();
    """),format.raw/*579.5*/("""}"""),format.raw/*579.6*/(""");

    $('#txtMessage').keyup(function (event) """),format.raw/*581.45*/("""{"""),format.raw/*581.46*/("""

        """),format.raw/*583.9*/("""if (event.keyCode == 13) """),format.raw/*583.34*/("""{"""),format.raw/*583.35*/("""

            """),format.raw/*585.13*/("""//check if length is more than 150
            if ($(this).val().length <= 150) """),format.raw/*586.46*/("""{"""),format.raw/*586.47*/("""
                """),format.raw/*587.17*/("""sendChatMessage($(this).val());
                $('#txtMessage').val('');
                return;
            """),format.raw/*590.13*/("""}"""),format.raw/*590.14*/("""
        """),format.raw/*591.9*/("""}"""),format.raw/*591.10*/("""

        """),format.raw/*593.9*/("""var length = $(this).val().length;
        if (length > 150) """),format.raw/*594.27*/("""{"""),format.raw/*594.28*/("""
            """),format.raw/*595.13*/("""$(this).css('color', 'red');
        """),format.raw/*596.9*/("""}"""),format.raw/*596.10*/("""
        """),format.raw/*597.9*/("""else """),format.raw/*597.14*/("""{"""),format.raw/*597.15*/("""
            """),format.raw/*598.13*/("""$(this).css('color', 'black');
        """),format.raw/*599.9*/("""}"""),format.raw/*599.10*/("""
    """),format.raw/*600.5*/("""}"""),format.raw/*600.6*/(""");


    $('#lnkLeave').click(function () """),format.raw/*603.38*/("""{"""),format.raw/*603.39*/("""
       """),format.raw/*604.8*/("""// alert("her2");
        // var obj = """),format.raw/*605.22*/("""{"""),format.raw/*605.23*/("""'username' : username, 'gameid' : gameid"""),format.raw/*605.63*/("""}"""),format.raw/*605.64*/(""";
        // $.ajax("""),format.raw/*606.19*/("""{"""),format.raw/*606.20*/("""
        """),format.raw/*607.9*/("""//     type: 'POST',
        //     url: '/leave',
        //     data: JSON.stringify(obj),
        //     contentType: 'application/json',
        //     success: function (data) """),format.raw/*611.41*/("""{"""),format.raw/*611.42*/("""
        """),format.raw/*612.9*/("""//         if(data=="success")"""),format.raw/*612.39*/("""{"""),format.raw/*612.40*/("""
        """),format.raw/*613.9*/("""//             notifyOthers();
        //             $('#dashform').submit();
        //         """),format.raw/*615.20*/("""}"""),format.raw/*615.21*/("""
        """),format.raw/*616.9*/("""//     """),format.raw/*616.16*/("""}"""),format.raw/*616.17*/("""
        """),format.raw/*617.9*/("""// """),format.raw/*617.12*/("""}"""),format.raw/*617.13*/(""");//ajax call ends here
        notifyOthers();
    """),format.raw/*619.5*/("""}"""),format.raw/*619.6*/(""");

    var notifyOthers = function () """),format.raw/*621.36*/("""{"""),format.raw/*621.37*/("""
        """),format.raw/*622.9*/("""var turn = $('#turn').val();

        var isActivePlayer = myTurn == "true" ? true : false;

        var data = JSON.stringify("""),format.raw/*626.35*/("""{"""),format.raw/*626.36*/("""
            """),format.raw/*627.13*/(""""gameid": gameid,
            "type": "LeaveGame",
            "active": isActivePlayer,
            "turnNumber": turn,
            "player": """),format.raw/*631.23*/("""{"""),format.raw/*631.24*/(""""username": username"""),format.raw/*631.44*/("""}"""),format.raw/*631.45*/("""
        """),format.raw/*632.9*/("""}"""),format.raw/*632.10*/(""");
        socket.send(data);
    """),format.raw/*634.5*/("""}"""),format.raw/*634.6*/("""
"""),format.raw/*635.1*/("""}"""),format.raw/*635.2*/(""");"""))
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
                  DATE: Fri Jul 28 15:10:19 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/gamejs.scala.html
                  HASH: ad52da37c8b17300aa48eae7008b24f0aa000c81
                  MATRIX: 829->0|870->14|898->15|930->21|1308->371|1337->372|1373->381|1480->460|1509->461|1551->475|1605->501|1634->502|1662->503|1820->633|1849->634|1894->651|2244->974|2273->975|2314->988|2343->989|2379->998|2408->999|2440->1004|2468->1005|2610->1119|2639->1120|2675->1129|2755->1182|2783->1183|2816->1189|2875->1220|2904->1221|2940->1230|2992->1255|3020->1256|3053->1262|3109->1290|3138->1291|3174->1300|3243->1342|3271->1343|3304->1349|3361->1378|3390->1379|3426->1388|3499->1434|3527->1435|3560->1441|3647->1500|3676->1501|3712->1510|3857->1627|3886->1628|3961->1675|3990->1676|4039->1696|4069->1697|4099->1698|4451->2023|4479->2024|4512->2030|4578->2068|4607->2069|4643->2078|4788->2195|4817->2196|4893->2244|4922->2245|4971->2265|5001->2266|5031->2267|5369->2578|5397->2579|5430->2585|5849->2976|5865->2982|5928->3023|6105->3171|6135->3172|6172->3181|6381->3361|6411->3362|6454->3376|6743->3637|6773->3638|6819->3655|6892->3699|6922->3700|6972->3721|7077->3797|7107->3798|7153->3815|7183->3816|7225->3830|7255->3831|7338->3885|7368->3886|7411->3900|7990->4451|8020->4452|8066->4469|8132->4506|8162->4507|8205->4521|8270->4557|8300->4558|8346->4575|8403->4603|8433->4604|8476->4618|8528->4641|8558->4642|8604->4659|8706->4732|8736->4733|8779->4747|9012->4951|9042->4952|9088->4969|9161->5013|9191->5014|9241->5035|9346->5111|9376->5112|9422->5129|9452->5130|9494->5144|9524->5145|9562->5155|9626->5190|9656->5191|9698->5204|9760->5238|9790->5239|9828->5249|9901->5293|9931->5294|9973->5307|10276->5583|10306->5584|10424->5673|10454->5674|10496->5687|10909->6073|10939->6074|11047->6153|11077->6154|11119->6167|11372->6392|11402->6393|11485->6447|11515->6448|11557->6461|11796->6672|11826->6673|11907->6725|11937->6726|11979->6739|12261->6994|12291->6995|12373->7048|12403->7049|12445->7062|12716->7304|12746->7305|12775->7306|12935->7437|12965->7438|12994->7439|13173->7589|13203->7590|13253->7611|13330->7659|13360->7660|13389->7661|13418->7662|13460->7675|13490->7676|13523->7680|13553->7681|13582->7682|13688->7760|13718->7761|13747->7762|13776->7763|13864->7822|13894->7823|13936->7836|14207->8080|14237->8081|14283->8098|14397->8183|14427->8184|14470->8198|14504->8203|14534->8204|14580->8221|14682->8294|14712->8295|14756->8310|14820->8345|14850->8346|14896->8363|14969->8407|14999->8408|15049->8429|15123->8474|15153->8475|15207->8500|15328->8592|15358->8593|15409->8615|15443->8620|15473->8621|15527->8646|15636->8726|15666->8727|15712->8744|15742->8745|15788->8762|15818->8763|15861->8778|15891->8779|15947->8806|15977->8807|16019->8820|16178->8951|16208->8952|16241->8957|16270->8958|16304->8964|16387->9018|16417->9019|16455->9029|16506->9051|16536->9052|16579->9113|16621->9168|16663->9228|16701->9238|16731->9239|16761->9240|16795->9245|16825->9246|16868->9260|16952->9356|16994->9415|17031->9424|17061->9425|17096->9432|17125->9433|17208->9487|17238->9488|17268->9490|17319->9512|17349->9513|17380->9562|17410->9605|17440->9653|17470->9655|17499->9656|17528->9657|17561->9662|17590->9663|17621->9711|17651->9753|17680->9754|17751->9797|17780->9798|17811->9801|17840->9802|17914->9847|17944->9848|17981->9857|18036->9883|18066->9884|18108->9897|18211->9971|18241->9972|18306->10008|18336->10009|18373->10018|18403->10019|18465->10053|18494->10054|18528->10060|18595->10098|18625->10099|18662->10108|18769->10187|18798->10188|18832->10194|18901->10234|18931->10235|18968->10244|19014->10261|19044->10262|19086->10275|19138->10299|19168->10300|19201->10304|19231->10305|19273->10318|19347->10364|19377->10365|19410->10370|19439->10371|19473->10377|19637->10512|19667->10513|19704->10522|19886->10676|19915->10677|19949->10683|20019->10724|20049->10725|20086->10734|20197->10816|20227->10817|20269->10830|20368->10900|20398->10901|20463->10937|20493->10938|20530->10947|20560->10948|20622->10982|20651->10983|20685->10989|20752->11027|20782->11028|20819->11037|20930->11119|20960->11120|21031->11162|21061->11163|21123->11197|21152->11198|21186->11204|21434->11423|21464->11424|21502->11434|21639->11542|21669->11543|21724->11569|21754->11570|22137->11925|22166->11926|22279->12010|22309->12011|22347->12021|22447->12092|22477->12093|22555->12142|22585->12143|22635->12163|22666->12164|22697->12165|22759->12199|22788->12200|22926->12309|22956->12310|22993->12319|23041->12339|23070->12340|23190->12431|23220->12432|23257->12441|23767->12923|23796->12924|23868->12967|23898->12968|23932->12974|24083->13097|24112->13098|24185->13142|24215->13143|24253->13153|24462->13334|24491->13335|24525->13341|24599->13386|24629->13387|24667->13397|25058->13759|25088->13760|25130->13773|25210->13825|25240->13826|25277->13835|25311->13840|25341->13841|25383->13854|25466->13909|25496->13910|25533->13919|25612->13970|25641->13971|25709->14010|25739->14011|25776->14020|25832->14047|25862->14048|25904->14061|25963->14091|25993->14092|26039->14109|26070->14149|26116->14166|26190->14211|26220->14212|26257->14221|26287->14222|26322->14229|26351->14230|26385->14236|26447->14269|26477->14270|26514->14279|26634->14370|26664->14371|26768->14446|26798->14447|26844->14464|26874->14465|26916->14478|26977->14511|26993->14517|27050->14552|27203->14676|27233->14677|27279->14694|27347->14733|27377->14734|27414->14743|27444->14744|27500->14772|27529->14773|27563->14779|27628->14815|27658->14816|27695->14825|27793->14894|27823->14895|27917->14959|27948->14960|28010->14994|28039->14995|28073->15001|28144->15043|28174->15044|28211->15053|28266->15079|28296->15080|28338->15093|28473->15199|28503->15200|28552->15220|28582->15221|28619->15230|28649->15231|28711->15265|28740->15266|28774->15272|28863->15332|28893->15333|28930->15342|28985->15368|29015->15369|29057->15382|29208->15504|29238->15505|29287->15525|29317->15526|29354->15535|29384->15536|29446->15570|29475->15571|29509->15577|29570->15609|29600->15610|29637->15619|29765->15718|29795->15719|29837->15732|29892->15758|29922->15759|29968->15776|30109->15888|30139->15889|30188->15909|30218->15910|30260->15923|30290->15924|30360->15966|30390->15967|30423->15972|30452->15973|30530->16022|30560->16023|30597->16032|30645->16051|30675->16052|30717->16065|30772->16091|30802->16092|30848->16109|30989->16221|31019->16222|31068->16242|31098->16243|31140->16256|31170->16257|31240->16299|31270->16300|31303->16305|31332->16306|31366->16312|31429->16346|31459->16347|31497->16357|31552->16383|31582->16384|31640->16413|31670->16414|31719->16434|31749->16435|31779->16436|31854->16482|31884->16483|31926->16496|32013->16554|32043->16555|32092->16575|32122->16576|32190->16615|32220->16616|32266->16633|32337->16675|32367->16676|32404->16685|32434->16686|32469->16693|32498->16694|32568->16735|32598->16736|32635->16745|32879->16961|32908->16962|32985->17010|33015->17011|33053->17021|33107->17046|33137->17047|33180->17061|33289->17141|33319->17142|33365->17159|33504->17269|33534->17270|33571->17279|33601->17280|33639->17290|33729->17351|33759->17352|33801->17365|33866->17402|33896->17403|33933->17412|33967->17417|33997->17418|34039->17431|34106->17470|34136->17471|34169->17476|34198->17477|34269->17519|34299->17520|34335->17528|34403->17567|34433->17568|34502->17608|34532->17609|34581->17629|34611->17630|34648->17639|34858->17820|34888->17821|34925->17830|34984->17860|35014->17861|35051->17870|35178->17968|35208->17969|35245->17978|35281->17985|35311->17986|35348->17995|35380->17998|35410->17999|35490->18051|35519->18052|35587->18091|35617->18092|35654->18101|35810->18228|35840->18229|35882->18242|36054->18385|36084->18386|36133->18406|36163->18407|36200->18416|36230->18417|36292->18451|36321->18452|36350->18453|36379->18454
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|52->21|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|69->38|69->38|70->39|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|79->48|81->50|81->50|83->52|83->52|83->52|84->53|86->55|86->55|88->57|90->59|90->59|91->60|95->64|95->64|95->64|95->64|95->64|95->64|95->64|105->74|105->74|107->76|107->76|107->76|108->77|112->81|112->81|112->81|112->81|112->81|112->81|112->81|122->91|122->91|124->93|134->103|134->103|134->103|139->108|139->108|140->109|145->114|145->114|147->116|153->122|153->122|154->123|154->123|154->123|155->124|156->125|156->125|157->126|157->126|158->127|158->127|160->129|160->129|162->131|173->142|173->142|174->143|175->144|175->144|177->146|177->146|177->146|178->147|179->148|179->148|181->150|181->150|181->150|182->151|184->153|184->153|186->155|190->159|190->159|191->160|191->160|191->160|192->161|193->162|193->162|194->163|194->163|195->164|195->164|197->166|197->166|197->166|198->167|199->168|199->168|201->170|201->170|201->170|202->171|209->178|209->178|211->180|211->180|212->181|222->191|222->191|224->193|224->193|225->194|232->201|232->201|234->203|234->203|235->204|242->211|242->211|245->214|245->214|246->215|254->223|254->223|256->225|256->225|257->226|261->230|261->230|262->231|264->233|264->233|265->234|269->238|269->238|270->239|271->240|271->240|272->241|272->241|273->242|273->242|273->242|273->242|274->243|278->247|278->247|279->248|279->248|281->250|281->250|282->251|288->257|288->257|289->258|290->259|290->259|292->261|292->261|292->261|293->262|294->263|294->263|297->266|297->266|297->266|298->267|298->267|298->267|299->268|299->268|299->268|300->269|301->270|301->270|303->272|303->272|303->272|304->273|305->274|305->274|306->275|306->275|307->276|307->276|309->278|309->278|311->280|311->280|312->281|315->284|315->284|316->285|316->285|318->287|318->287|318->287|320->289|320->289|320->289|322->291|323->292|324->293|326->295|326->295|326->295|326->295|326->295|328->297|329->298|330->299|331->300|331->300|334->303|334->303|336->305|336->305|338->307|338->307|338->307|340->309|341->310|342->311|344->313|344->313|344->313|344->313|344->313|346->315|347->316|348->317|349->318|349->318|352->321|352->321|354->323|354->323|355->324|355->324|355->324|356->325|358->327|358->327|358->327|358->327|359->328|359->328|361->330|361->330|363->332|363->332|363->332|364->333|367->336|367->336|369->338|369->338|369->338|370->339|370->339|370->339|371->340|372->341|372->341|372->341|372->341|373->342|375->344|375->344|376->345|376->345|378->347|379->348|379->348|380->349|386->355|386->355|388->357|388->357|388->357|389->358|390->359|390->359|391->360|393->362|393->362|393->362|393->362|394->363|394->363|396->365|396->365|398->367|398->367|398->367|399->368|400->369|400->369|400->369|400->369|402->371|402->371|404->373|411->380|411->380|413->382|417->386|417->386|417->386|417->386|430->399|430->399|434->403|434->403|436->405|437->406|437->406|437->406|437->406|437->406|437->406|437->406|439->408|439->408|442->411|442->411|443->412|444->413|444->413|447->416|447->416|448->417|464->433|464->433|467->436|467->436|469->438|473->442|473->442|475->444|475->444|477->446|487->456|487->456|489->458|489->458|489->458|491->460|499->468|499->468|500->469|501->470|501->470|502->471|502->471|502->471|503->472|504->473|504->473|505->474|507->476|507->476|509->478|509->478|510->479|510->479|510->479|511->480|511->480|511->480|512->481|512->481|513->482|514->483|514->483|515->484|515->484|516->485|516->485|518->487|518->487|518->487|519->488|521->490|521->490|521->490|521->490|522->491|522->491|523->492|524->493|524->493|524->493|527->496|527->496|528->497|529->498|529->498|530->499|530->499|531->500|531->500|533->502|533->502|533->502|534->503|535->504|535->504|535->504|535->504|537->506|537->506|539->508|539->508|539->508|540->509|540->509|540->509|541->510|544->513|544->513|544->513|544->513|545->514|545->514|547->516|547->516|549->518|549->518|549->518|550->519|550->519|550->519|551->520|554->523|554->523|554->523|554->523|555->524|555->524|557->526|557->526|559->528|559->528|559->528|560->529|562->531|562->531|563->532|563->532|563->532|564->533|567->536|567->536|567->536|567->536|568->537|568->537|570->539|570->539|571->540|571->540|573->542|573->542|574->543|574->543|574->543|575->544|575->544|575->544|576->545|579->548|579->548|579->548|579->548|580->549|580->549|582->551|582->551|583->552|583->552|585->554|585->554|585->554|587->556|587->556|587->556|587->556|587->556|587->556|587->556|587->556|590->559|590->559|591->560|593->562|593->562|593->562|593->562|594->563|594->563|595->564|596->565|596->565|597->566|597->566|598->567|598->567|601->570|601->570|602->571|610->579|610->579|612->581|612->581|614->583|614->583|614->583|616->585|617->586|617->586|618->587|621->590|621->590|622->591|622->591|624->593|625->594|625->594|626->595|627->596|627->596|628->597|628->597|628->597|629->598|630->599|630->599|631->600|631->600|634->603|634->603|635->604|636->605|636->605|636->605|636->605|637->606|637->606|638->607|642->611|642->611|643->612|643->612|643->612|644->613|646->615|646->615|647->616|647->616|647->616|648->617|648->617|648->617|650->619|650->619|652->621|652->621|653->622|657->626|657->626|658->627|662->631|662->631|662->631|662->631|663->632|663->632|665->634|665->634|666->635|666->635
                  -- GENERATED --
              */
          