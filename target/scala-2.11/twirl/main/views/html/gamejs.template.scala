
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

            // activityLog.find('p').first().remove();
            // activityLog.find('hr').first().remove();

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

            var txt = playerName + " skipped a turn!";

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
"""),format.raw/*444.1*/("""}"""),format.raw/*444.2*/(""");

    
    var funcChangeTurn = function(title)"""),format.raw/*447.41*/("""{"""),format.raw/*447.42*/("""

        """),format.raw/*449.9*/("""updateActivityLogs(title);
        publishTurnNumber();

        takeSnapshot();

        stopTimer();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
    """),format.raw/*459.5*/("""}"""),format.raw/*459.6*/("""

    """),format.raw/*461.5*/("""$('#updateactivity').on("click", function () """),format.raw/*461.50*/("""{"""),format.raw/*461.51*/("""

        """),format.raw/*463.9*/("""var topModal = $(this).closest('div.modal'),
            parentModal = topModal.find('div.modal-content'),
            header = parentModal.find('div.modal-header'),
            title = header.find('.modal-title').html();

        var isoops = $('#isoops').val();
        var otitle = "";
        var oopsmsg = $('#oopsmsg').val();
        if (isoops == "true") """),format.raw/*471.31*/("""{"""),format.raw/*471.32*/("""
            """),format.raw/*472.13*/("""otitle = "You got an OOPS card." + oopsmsg;
        """),format.raw/*473.9*/("""}"""),format.raw/*473.10*/("""
        """),format.raw/*474.9*/("""else """),format.raw/*474.14*/("""{"""),format.raw/*474.15*/("""
            """),format.raw/*475.13*/("""otitle = "You got an Surprise card" + oopsmsg;
        """),format.raw/*476.9*/("""}"""),format.raw/*476.10*/("""
        """),format.raw/*477.9*/("""updateActivityLogsWithSurpriseOrOops(otitle);

    """),format.raw/*479.5*/("""}"""),format.raw/*479.6*/(""");

    var takeSnapshot = function () """),format.raw/*481.36*/("""{"""),format.raw/*481.37*/("""
        """),format.raw/*482.9*/("""html2canvas(document.body, """),format.raw/*482.36*/("""{"""),format.raw/*482.37*/("""
            """),format.raw/*483.13*/("""onrendered: function (canvas) """),format.raw/*483.43*/("""{"""),format.raw/*483.44*/("""
                """),format.raw/*484.17*/("""//"""),format.raw/*484.57*/("""
                """),format.raw/*485.17*/("""uploadImage(canvas.toDataURL());
            """),format.raw/*486.13*/("""}"""),format.raw/*486.14*/("""
        """),format.raw/*487.9*/("""}"""),format.raw/*487.10*/(""");
    """),format.raw/*488.5*/("""}"""),format.raw/*488.6*/("""

    """),format.raw/*490.5*/("""var uploadImage = function (url) """),format.raw/*490.38*/("""{"""),format.raw/*490.39*/("""
        """),format.raw/*491.9*/("""var turnNo = parseInt($('#turnNo').html());
        turnNo = turnNo - 1;
        var obj = """),format.raw/*493.19*/("""{"""),format.raw/*493.20*/("""'image-data': url, 'username': username, 'gameid': gameid, 'turnNo': turnNo"""),format.raw/*493.95*/("""}"""),format.raw/*493.96*/(""";
        $.ajax("""),format.raw/*494.16*/("""{"""),format.raw/*494.17*/("""
            """),format.raw/*495.13*/("""type: 'POST',
            url: '"""),_display_(/*496.20*/routes/*496.26*/.GameController.saveImageSnapshot()),format.raw/*496.61*/("""',
            data: JSON.stringify(obj),
            contentType: 'application/json',
            success: function (data) """),format.raw/*499.38*/("""{"""),format.raw/*499.39*/("""
                """),format.raw/*500.17*/("""//alert("Image uploaded");
            """),format.raw/*501.13*/("""}"""),format.raw/*501.14*/("""
        """),format.raw/*502.9*/("""}"""),format.raw/*502.10*/(""");//ajax call ends here
    """),format.raw/*503.5*/("""}"""),format.raw/*503.6*/("""

    """),format.raw/*505.5*/("""var publishTurnNumber = function () """),format.raw/*505.41*/("""{"""),format.raw/*505.42*/("""
        """),format.raw/*506.9*/("""var turnNumber = $('#turn').val();
        var data = JSON.stringify("""),format.raw/*507.35*/("""{"""),format.raw/*507.36*/(""""gameid": gameid, "turnNumber": turnNumber, "type": "ChangeTurn""""),format.raw/*507.100*/("""}"""),format.raw/*507.101*/(""");
        socket.send(data);
    """),format.raw/*509.5*/("""}"""),format.raw/*509.6*/("""

    """),format.raw/*511.5*/("""var updateActivityLogs = function (title) """),format.raw/*511.47*/("""{"""),format.raw/*511.48*/("""
        """),format.raw/*512.9*/("""var data = JSON.stringify("""),format.raw/*512.35*/("""{"""),format.raw/*512.36*/("""
            """),format.raw/*513.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStep",
            "player": """),format.raw/*516.23*/("""{"""),format.raw/*516.24*/(""""username": username"""),format.raw/*516.44*/("""}"""),format.raw/*516.45*/("""
        """),format.raw/*517.9*/("""}"""),format.raw/*517.10*/(""");
        socket.send(data);
    """),format.raw/*519.5*/("""}"""),format.raw/*519.6*/("""

    """),format.raw/*521.5*/("""var updateActivityLogsWithSurpriseOrOops = function (title) """),format.raw/*521.65*/("""{"""),format.raw/*521.66*/("""
        """),format.raw/*522.9*/("""var data = JSON.stringify("""),format.raw/*522.35*/("""{"""),format.raw/*522.36*/("""
            """),format.raw/*523.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStepWithOopsSurprise",
            "player": """),format.raw/*526.23*/("""{"""),format.raw/*526.24*/(""""username": username"""),format.raw/*526.44*/("""}"""),format.raw/*526.45*/("""
        """),format.raw/*527.9*/("""}"""),format.raw/*527.10*/(""");
        socket.send(data);
    """),format.raw/*529.5*/("""}"""),format.raw/*529.6*/("""

    """),format.raw/*531.5*/("""$('#btnSend').click(function () """),format.raw/*531.37*/("""{"""),format.raw/*531.38*/("""
        """),format.raw/*532.9*/("""var message = $('#txtMessage').val();
        $('#txtMessage').val('');
        if (message != "") """),format.raw/*534.28*/("""{"""),format.raw/*534.29*/("""
            """),format.raw/*535.13*/("""var data = JSON.stringify("""),format.raw/*535.39*/("""{"""),format.raw/*535.40*/("""
                """),format.raw/*536.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*539.27*/("""{"""),format.raw/*539.28*/(""""username": username"""),format.raw/*539.48*/("""}"""),format.raw/*539.49*/("""
            """),format.raw/*540.13*/("""}"""),format.raw/*540.14*/(""");
            socket.send(data);
        """),format.raw/*542.9*/("""}"""),format.raw/*542.10*/("""
    """),format.raw/*543.5*/("""}"""),format.raw/*543.6*/(""");

    var sendChatMessage = function (message) """),format.raw/*545.46*/("""{"""),format.raw/*545.47*/("""
        """),format.raw/*546.9*/("""if (message != "") """),format.raw/*546.28*/("""{"""),format.raw/*546.29*/("""
            """),format.raw/*547.13*/("""var data = JSON.stringify("""),format.raw/*547.39*/("""{"""),format.raw/*547.40*/("""
                """),format.raw/*548.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*551.27*/("""{"""),format.raw/*551.28*/(""""username": username"""),format.raw/*551.48*/("""}"""),format.raw/*551.49*/("""
            """),format.raw/*552.13*/("""}"""),format.raw/*552.14*/(""");
            socket.send(data);
        """),format.raw/*554.9*/("""}"""),format.raw/*554.10*/("""
    """),format.raw/*555.5*/("""}"""),format.raw/*555.6*/("""

    """),format.raw/*557.5*/("""$('#btnLeave').click(function (e) """),format.raw/*557.39*/("""{"""),format.raw/*557.40*/("""

        """),format.raw/*559.9*/("""var data = JSON.stringify("""),format.raw/*559.35*/("""{"""),format.raw/*559.36*/(""""type": "leaving", "player": """),format.raw/*559.65*/("""{"""),format.raw/*559.66*/(""""username": username"""),format.raw/*559.86*/("""}"""),format.raw/*559.87*/("""}"""),format.raw/*559.88*/(""");
        socket.send(data);

        $.ajax("""),format.raw/*562.16*/("""{"""),format.raw/*562.17*/("""
            """),format.raw/*563.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*565.19*/("""{"""),format.raw/*565.20*/("""'username': username"""),format.raw/*565.40*/("""}"""),format.raw/*565.41*/(""",
            success: function (data) """),format.raw/*566.38*/("""{"""),format.raw/*566.39*/("""
                """),format.raw/*567.17*/("""window.location.replace("/");
            """),format.raw/*568.13*/("""}"""),format.raw/*568.14*/("""
        """),format.raw/*569.9*/("""}"""),format.raw/*569.10*/(""");
    """),format.raw/*570.5*/("""}"""),format.raw/*570.6*/(""");


    $('#btnSkip').click(function () """),format.raw/*573.37*/("""{"""),format.raw/*573.38*/("""
        """),format.raw/*574.9*/("""timeout = true;
        sendSkipTurnMessage();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
        //In case of timeout, next player should get his turn
        publishTurnNumber();
    """),format.raw/*582.5*/("""}"""),format.raw/*582.6*/(""");

    $('#txtMessage').keyup(function (event) """),format.raw/*584.45*/("""{"""),format.raw/*584.46*/("""

        """),format.raw/*586.9*/("""if (event.keyCode == 13) """),format.raw/*586.34*/("""{"""),format.raw/*586.35*/("""

            """),format.raw/*588.13*/("""//check if length is more than 150
            if ($(this).val().length <= 150) """),format.raw/*589.46*/("""{"""),format.raw/*589.47*/("""
                """),format.raw/*590.17*/("""sendChatMessage($(this).val());
                $('#txtMessage').val('');
                return;
            """),format.raw/*593.13*/("""}"""),format.raw/*593.14*/("""
        """),format.raw/*594.9*/("""}"""),format.raw/*594.10*/("""

        """),format.raw/*596.9*/("""var length = $(this).val().length;
        if (length > 150) """),format.raw/*597.27*/("""{"""),format.raw/*597.28*/("""
            """),format.raw/*598.13*/("""$(this).css('color', 'red');
        """),format.raw/*599.9*/("""}"""),format.raw/*599.10*/("""
        """),format.raw/*600.9*/("""else """),format.raw/*600.14*/("""{"""),format.raw/*600.15*/("""
            """),format.raw/*601.13*/("""$(this).css('color', 'black');
        """),format.raw/*602.9*/("""}"""),format.raw/*602.10*/("""
    """),format.raw/*603.5*/("""}"""),format.raw/*603.6*/(""");


    $('#lnkLeave').click(function () """),format.raw/*606.38*/("""{"""),format.raw/*606.39*/("""
       """),format.raw/*607.8*/("""// alert("her2");
        // var obj = """),format.raw/*608.22*/("""{"""),format.raw/*608.23*/("""'username' : username, 'gameid' : gameid"""),format.raw/*608.63*/("""}"""),format.raw/*608.64*/(""";
        // $.ajax("""),format.raw/*609.19*/("""{"""),format.raw/*609.20*/("""
        """),format.raw/*610.9*/("""//     type: 'POST',
        //     url: '/leave',
        //     data: JSON.stringify(obj),
        //     contentType: 'application/json',
        //     success: function (data) """),format.raw/*614.41*/("""{"""),format.raw/*614.42*/("""
        """),format.raw/*615.9*/("""//         if(data=="success")"""),format.raw/*615.39*/("""{"""),format.raw/*615.40*/("""
        """),format.raw/*616.9*/("""//             notifyOthers();
        //             $('#dashform').submit();
        //         """),format.raw/*618.20*/("""}"""),format.raw/*618.21*/("""
        """),format.raw/*619.9*/("""//     """),format.raw/*619.16*/("""}"""),format.raw/*619.17*/("""
        """),format.raw/*620.9*/("""// """),format.raw/*620.12*/("""}"""),format.raw/*620.13*/(""");//ajax call ends here
        notifyOthers();
    """),format.raw/*622.5*/("""}"""),format.raw/*622.6*/(""");

    var notifyOthers = function () """),format.raw/*624.36*/("""{"""),format.raw/*624.37*/("""
        """),format.raw/*625.9*/("""var turn = $('#turn').val();

        var isActivePlayer = myTurn == "true" ? true : false;

        var data = JSON.stringify("""),format.raw/*629.35*/("""{"""),format.raw/*629.36*/("""
            """),format.raw/*630.13*/(""""gameid": gameid,
            "type": "LeaveGame",
            "active": isActivePlayer,
            "turnNumber": turn,
            "player": """),format.raw/*634.23*/("""{"""),format.raw/*634.24*/(""""username": username"""),format.raw/*634.44*/("""}"""),format.raw/*634.45*/("""
        """),format.raw/*635.9*/("""}"""),format.raw/*635.10*/(""");
        socket.send(data);
    """),format.raw/*637.5*/("""}"""),format.raw/*637.6*/("""
"""),format.raw/*638.1*/("""}"""),format.raw/*638.2*/(""");"""))
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
                  DATE: Thu Nov 09 13:59:56 EST 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/app/views/gamejs.scala.html
                  HASH: 8511fd2986708147536ee77dd9a0ce9f1ea608ae
                  MATRIX: 829->0|870->14|898->15|930->21|1308->371|1337->372|1373->381|1480->460|1509->461|1551->475|1605->501|1634->502|1662->503|1820->633|1849->634|1894->651|2244->974|2273->975|2314->988|2343->989|2379->998|2408->999|2440->1004|2468->1005|2610->1119|2639->1120|2675->1129|2755->1182|2783->1183|2816->1189|2875->1220|2904->1221|2940->1230|2992->1255|3020->1256|3053->1262|3109->1290|3138->1291|3174->1300|3243->1342|3271->1343|3304->1349|3361->1378|3390->1379|3426->1388|3499->1434|3527->1435|3560->1441|3647->1500|3676->1501|3712->1510|3857->1627|3886->1628|3961->1675|3990->1676|4039->1696|4069->1697|4099->1698|4451->2023|4479->2024|4512->2030|4578->2068|4607->2069|4643->2078|4788->2195|4817->2196|4893->2244|4922->2245|4971->2265|5001->2266|5031->2267|5369->2578|5397->2579|5430->2585|5849->2976|5865->2982|5928->3023|6105->3171|6135->3172|6172->3181|6381->3361|6411->3362|6454->3376|6743->3637|6773->3638|6819->3655|6892->3699|6922->3700|6972->3721|7077->3797|7107->3798|7153->3815|7183->3816|7225->3830|7255->3831|7338->3885|7368->3886|7411->3900|7990->4451|8020->4452|8066->4469|8132->4506|8162->4507|8205->4521|8270->4557|8300->4558|8346->4575|8403->4603|8433->4604|8476->4618|8528->4641|8558->4642|8604->4659|8706->4732|8736->4733|8779->4747|9012->4951|9042->4952|9088->4969|9161->5013|9191->5014|9241->5035|9346->5111|9376->5112|9422->5129|9452->5130|9494->5144|9524->5145|9562->5155|9626->5190|9656->5191|9698->5204|9760->5238|9790->5239|9828->5249|9901->5293|9931->5294|9973->5307|10276->5583|10306->5584|10424->5673|10454->5674|10496->5687|10915->6079|10945->6080|11053->6159|11083->6160|11125->6173|11378->6398|11408->6399|11491->6453|11521->6454|11563->6467|11798->6674|11828->6675|11909->6727|11939->6728|11981->6741|12263->6996|12293->6997|12375->7050|12405->7051|12447->7064|12718->7306|12748->7307|12777->7308|12937->7439|12967->7440|12996->7441|13175->7591|13205->7592|13255->7613|13332->7661|13362->7662|13391->7663|13420->7664|13462->7677|13492->7678|13525->7682|13555->7683|13584->7684|13690->7762|13720->7763|13749->7764|13778->7765|13866->7824|13896->7825|13938->7838|14209->8082|14239->8083|14285->8100|14399->8185|14429->8186|14472->8200|14506->8205|14536->8206|14582->8223|14684->8296|14714->8297|14758->8312|14822->8347|14852->8348|14898->8365|14971->8409|15001->8410|15051->8431|15125->8476|15155->8477|15209->8502|15330->8594|15360->8595|15411->8617|15445->8622|15475->8623|15529->8648|15638->8728|15668->8729|15714->8746|15744->8747|15790->8764|15820->8765|15863->8780|15893->8781|15949->8808|15979->8809|16021->8822|16180->8953|16210->8954|16243->8959|16272->8960|16306->8966|16389->9020|16419->9021|16457->9031|16508->9053|16538->9054|16581->9115|16623->9170|16665->9230|16703->9240|16733->9241|16763->9242|16797->9247|16827->9248|16870->9262|16954->9358|16996->9417|17033->9426|17063->9427|17098->9434|17127->9435|17210->9489|17240->9490|17270->9492|17321->9514|17351->9515|17382->9564|17412->9607|17442->9655|17472->9657|17501->9658|17530->9659|17563->9664|17592->9665|17623->9713|17653->9755|17682->9756|17753->9799|17782->9800|17813->9803|17842->9804|17916->9849|17946->9850|17983->9859|18038->9885|18068->9886|18110->9899|18213->9973|18243->9974|18308->10010|18338->10011|18375->10020|18405->10021|18467->10055|18496->10056|18530->10062|18597->10100|18627->10101|18664->10110|18771->10189|18800->10190|18834->10196|18903->10236|18933->10237|18970->10246|19016->10263|19046->10264|19088->10277|19140->10301|19170->10302|19203->10306|19233->10307|19275->10320|19349->10366|19379->10367|19412->10372|19441->10373|19475->10379|19639->10514|19669->10515|19706->10524|19888->10678|19917->10679|19951->10685|20021->10726|20051->10727|20088->10736|20199->10818|20229->10819|20271->10832|20370->10902|20400->10903|20465->10939|20495->10940|20532->10949|20562->10950|20624->10984|20653->10985|20687->10991|20754->11029|20784->11030|20821->11039|20932->11121|20962->11122|21033->11164|21063->11165|21125->11199|21154->11200|21188->11206|21436->11425|21466->11426|21504->11436|21641->11544|21671->11545|21726->11571|21756->11572|22139->11927|22168->11928|22281->12012|22311->12013|22349->12023|22449->12094|22479->12095|22557->12144|22587->12145|22637->12165|22668->12166|22699->12167|22761->12201|22790->12202|22928->12311|22958->12312|22995->12321|23043->12341|23072->12342|23192->12433|23222->12434|23259->12443|23769->12925|23798->12926|23870->12969|23900->12970|23934->12976|24239->13253|24268->13254|24346->13303|24376->13304|24414->13314|24623->13495|24652->13496|24686->13502|24760->13547|24790->13548|24828->13558|25219->13920|25249->13921|25291->13934|25371->13986|25401->13987|25438->13996|25472->14001|25502->14002|25544->14015|25627->14070|25657->14071|25694->14080|25773->14131|25802->14132|25870->14171|25900->14172|25937->14181|25993->14208|26023->14209|26065->14222|26124->14252|26154->14253|26200->14270|26231->14310|26277->14327|26351->14372|26381->14373|26418->14382|26448->14383|26483->14390|26512->14391|26546->14397|26608->14430|26638->14431|26675->14440|26795->14531|26825->14532|26929->14607|26959->14608|27005->14625|27035->14626|27077->14639|27138->14672|27154->14678|27211->14713|27364->14837|27394->14838|27440->14855|27508->14894|27538->14895|27575->14904|27605->14905|27661->14933|27690->14934|27724->14940|27789->14976|27819->14977|27856->14986|27954->15055|27984->15056|28078->15120|28109->15121|28171->15155|28200->15156|28234->15162|28305->15204|28335->15205|28372->15214|28427->15240|28457->15241|28499->15254|28634->15360|28664->15361|28713->15381|28743->15382|28780->15391|28810->15392|28872->15426|28901->15427|28935->15433|29024->15493|29054->15494|29091->15503|29146->15529|29176->15530|29218->15543|29369->15665|29399->15666|29448->15686|29478->15687|29515->15696|29545->15697|29607->15731|29636->15732|29670->15738|29731->15770|29761->15771|29798->15780|29926->15879|29956->15880|29998->15893|30053->15919|30083->15920|30129->15937|30270->16049|30300->16050|30349->16070|30379->16071|30421->16084|30451->16085|30521->16127|30551->16128|30584->16133|30613->16134|30691->16183|30721->16184|30758->16193|30806->16212|30836->16213|30878->16226|30933->16252|30963->16253|31009->16270|31150->16382|31180->16383|31229->16403|31259->16404|31301->16417|31331->16418|31401->16460|31431->16461|31464->16466|31493->16467|31527->16473|31590->16507|31620->16508|31658->16518|31713->16544|31743->16545|31801->16574|31831->16575|31880->16595|31910->16596|31940->16597|32015->16643|32045->16644|32087->16657|32174->16715|32204->16716|32253->16736|32283->16737|32351->16776|32381->16777|32427->16794|32498->16836|32528->16837|32565->16846|32595->16847|32630->16854|32659->16855|32729->16896|32759->16897|32796->16906|33040->17122|33069->17123|33146->17171|33176->17172|33214->17182|33268->17207|33298->17208|33341->17222|33450->17302|33480->17303|33526->17320|33665->17430|33695->17431|33732->17440|33762->17441|33800->17451|33890->17512|33920->17513|33962->17526|34027->17563|34057->17564|34094->17573|34128->17578|34158->17579|34200->17592|34267->17631|34297->17632|34330->17637|34359->17638|34430->17680|34460->17681|34496->17689|34564->17728|34594->17729|34663->17769|34693->17770|34742->17790|34772->17791|34809->17800|35019->17981|35049->17982|35086->17991|35145->18021|35175->18022|35212->18031|35339->18129|35369->18130|35406->18139|35442->18146|35472->18147|35509->18156|35541->18159|35571->18160|35651->18212|35680->18213|35748->18252|35778->18253|35815->18262|35971->18389|36001->18390|36043->18403|36215->18546|36245->18547|36294->18567|36324->18568|36361->18577|36391->18578|36453->18612|36482->18613|36511->18614|36540->18615
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|52->21|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|69->38|69->38|70->39|72->41|72->41|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|79->48|81->50|81->50|83->52|83->52|83->52|84->53|86->55|86->55|88->57|90->59|90->59|91->60|95->64|95->64|95->64|95->64|95->64|95->64|95->64|105->74|105->74|107->76|107->76|107->76|108->77|112->81|112->81|112->81|112->81|112->81|112->81|112->81|122->91|122->91|124->93|134->103|134->103|134->103|139->108|139->108|140->109|145->114|145->114|147->116|153->122|153->122|154->123|154->123|154->123|155->124|156->125|156->125|157->126|157->126|158->127|158->127|160->129|160->129|162->131|173->142|173->142|174->143|175->144|175->144|177->146|177->146|177->146|178->147|179->148|179->148|181->150|181->150|181->150|182->151|184->153|184->153|186->155|190->159|190->159|191->160|191->160|191->160|192->161|193->162|193->162|194->163|194->163|195->164|195->164|197->166|197->166|197->166|198->167|199->168|199->168|201->170|201->170|201->170|202->171|209->178|209->178|211->180|211->180|212->181|222->191|222->191|224->193|224->193|225->194|232->201|232->201|234->203|234->203|235->204|242->211|242->211|245->214|245->214|246->215|254->223|254->223|256->225|256->225|257->226|261->230|261->230|262->231|264->233|264->233|265->234|269->238|269->238|270->239|271->240|271->240|272->241|272->241|273->242|273->242|273->242|273->242|274->243|278->247|278->247|279->248|279->248|281->250|281->250|282->251|288->257|288->257|289->258|290->259|290->259|292->261|292->261|292->261|293->262|294->263|294->263|297->266|297->266|297->266|298->267|298->267|298->267|299->268|299->268|299->268|300->269|301->270|301->270|303->272|303->272|303->272|304->273|305->274|305->274|306->275|306->275|307->276|307->276|309->278|309->278|311->280|311->280|312->281|315->284|315->284|316->285|316->285|318->287|318->287|318->287|320->289|320->289|320->289|322->291|323->292|324->293|326->295|326->295|326->295|326->295|326->295|328->297|329->298|330->299|331->300|331->300|334->303|334->303|336->305|336->305|338->307|338->307|338->307|340->309|341->310|342->311|344->313|344->313|344->313|344->313|344->313|346->315|347->316|348->317|349->318|349->318|352->321|352->321|354->323|354->323|355->324|355->324|355->324|356->325|358->327|358->327|358->327|358->327|359->328|359->328|361->330|361->330|363->332|363->332|363->332|364->333|367->336|367->336|369->338|369->338|369->338|370->339|370->339|370->339|371->340|372->341|372->341|372->341|372->341|373->342|375->344|375->344|376->345|376->345|378->347|379->348|379->348|380->349|386->355|386->355|388->357|388->357|388->357|389->358|390->359|390->359|391->360|393->362|393->362|393->362|393->362|394->363|394->363|396->365|396->365|398->367|398->367|398->367|399->368|400->369|400->369|400->369|400->369|402->371|402->371|404->373|411->380|411->380|413->382|417->386|417->386|417->386|417->386|430->399|430->399|434->403|434->403|436->405|437->406|437->406|437->406|437->406|437->406|437->406|437->406|439->408|439->408|442->411|442->411|443->412|444->413|444->413|447->416|447->416|448->417|464->433|464->433|467->436|467->436|469->438|475->444|475->444|478->447|478->447|480->449|490->459|490->459|492->461|492->461|492->461|494->463|502->471|502->471|503->472|504->473|504->473|505->474|505->474|505->474|506->475|507->476|507->476|508->477|510->479|510->479|512->481|512->481|513->482|513->482|513->482|514->483|514->483|514->483|515->484|515->484|516->485|517->486|517->486|518->487|518->487|519->488|519->488|521->490|521->490|521->490|522->491|524->493|524->493|524->493|524->493|525->494|525->494|526->495|527->496|527->496|527->496|530->499|530->499|531->500|532->501|532->501|533->502|533->502|534->503|534->503|536->505|536->505|536->505|537->506|538->507|538->507|538->507|538->507|540->509|540->509|542->511|542->511|542->511|543->512|543->512|543->512|544->513|547->516|547->516|547->516|547->516|548->517|548->517|550->519|550->519|552->521|552->521|552->521|553->522|553->522|553->522|554->523|557->526|557->526|557->526|557->526|558->527|558->527|560->529|560->529|562->531|562->531|562->531|563->532|565->534|565->534|566->535|566->535|566->535|567->536|570->539|570->539|570->539|570->539|571->540|571->540|573->542|573->542|574->543|574->543|576->545|576->545|577->546|577->546|577->546|578->547|578->547|578->547|579->548|582->551|582->551|582->551|582->551|583->552|583->552|585->554|585->554|586->555|586->555|588->557|588->557|588->557|590->559|590->559|590->559|590->559|590->559|590->559|590->559|590->559|593->562|593->562|594->563|596->565|596->565|596->565|596->565|597->566|597->566|598->567|599->568|599->568|600->569|600->569|601->570|601->570|604->573|604->573|605->574|613->582|613->582|615->584|615->584|617->586|617->586|617->586|619->588|620->589|620->589|621->590|624->593|624->593|625->594|625->594|627->596|628->597|628->597|629->598|630->599|630->599|631->600|631->600|631->600|632->601|633->602|633->602|634->603|634->603|637->606|637->606|638->607|639->608|639->608|639->608|639->608|640->609|640->609|641->610|645->614|645->614|646->615|646->615|646->615|647->616|649->618|649->618|650->619|650->619|650->619|651->620|651->620|651->620|653->622|653->622|655->624|655->624|656->625|660->629|660->629|661->630|665->634|665->634|665->634|665->634|666->635|666->635|668->637|668->637|669->638|669->638
                  -- GENERATED --
              */
          