
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gamejsbackup_Scope0 {
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

class gamejsbackup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                """),format.raw/*18.17*/("""timeout = true;
                sendTimeoutMessage();
                $('#btnSkipTimeout').trigger('click');
                setTimer(timerTime);
                resetTimer();
                timer.hide();
                //In case of timeout, next player should get his turn
                publishTurnNumber();
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
    """),format.raw/*28.5*/("""}"""),format.raw/*28.6*/(""");


    //This function should be called whenever each player gets his/her turn
    var startTimer = function () """),format.raw/*32.34*/("""{"""),format.raw/*32.35*/("""
        """),format.raw/*33.9*/("""clock.setTime(timerTime);
        clock.start();
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""var setTimer = function (time) """),format.raw/*37.36*/("""{"""),format.raw/*37.37*/("""
        """),format.raw/*38.9*/("""clock.setTime(time);
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""

    """),format.raw/*41.5*/("""var stopTimer = function () """),format.raw/*41.33*/("""{"""),format.raw/*41.34*/("""
        """),format.raw/*42.9*/("""stopped = true;
        clock.stop();
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""

    """),format.raw/*46.5*/("""var resetTimer = function () """),format.raw/*46.34*/("""{"""),format.raw/*46.35*/("""
        """),format.raw/*47.9*/("""stopped = false;
        timeout = false;
    """),format.raw/*49.5*/("""}"""),format.raw/*49.6*/("""

    """),format.raw/*51.5*/("""// startTimer();

    var sendTimeoutMessage = function () """),format.raw/*53.42*/("""{"""),format.raw/*53.43*/("""
        """),format.raw/*54.9*/("""myTurn = "false";
        stopTimer();
        resetTimer();
        timer.hide();
        var data = JSON.stringify("""),format.raw/*58.35*/("""{"""),format.raw/*58.36*/(""""gameid": gameid, "type": "Timeout", "player": """),format.raw/*58.83*/("""{"""),format.raw/*58.84*/(""""username": username"""),format.raw/*58.104*/("""}"""),format.raw/*58.105*/("""}"""),format.raw/*58.106*/(""");
        socket.send(data);

        //updates turns completed count because missed turn is a lost turn
        var turnNo = parseInt($('#turnNo').html());
        // turnNo = turnNo+1;
        $('#turnNo').html(turnNo);

        //capture screen after timeout once turn Number field is updated
        takeSnapshot();
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""

    """),format.raw/*70.5*/("""var sendSkipTurnMessage = function () """),format.raw/*70.43*/("""{"""),format.raw/*70.44*/("""
        """),format.raw/*71.9*/("""myTurn = "false";
        stopTimer();
        resetTimer();
        timer.hide();
        var data = JSON.stringify("""),format.raw/*75.35*/("""{"""),format.raw/*75.36*/(""""gameid": gameid, "type": "SkipTurn", "player": """),format.raw/*75.84*/("""{"""),format.raw/*75.85*/(""""username": username"""),format.raw/*75.105*/("""}"""),format.raw/*75.106*/("""}"""),format.raw/*75.107*/(""");
        socket.send(data);

//updates turns completed count because skipped turn is a lost turn
        var turnNo = parseInt($('#turnNo').html());
        turnNo = turnNo + 1;
        $('#turnNo').html(turnNo);

//capture screen after timeout once turn Number field is updated
        takeSnapshot();
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/("""var username = $('#username').val();
    var gameid = $('#gameid').val();
    var activePlayersList = $('#activePlayersList');
    var timer = $('.mytimer');
    var turn = $('#turn').val();

    // get websocket class, firefox has a different way to get it
    var WS = window['MozWebSocket'] ? window['MozWebSocket'] : WebSocket;

    // open socket on page load
    var socket = new WS('"""),_display_(/*97.27*/routes/*97.33*/.Application.wsInterface().webSocketURL()),format.raw/*97.74*/("""');

    //this list will be used to append joining players
    var userList = $('#list-active-players');

    var writeMessages = function (event) """),format.raw/*102.42*/("""{"""),format.raw/*102.43*/("""
        """),format.raw/*103.9*/("""var model = event.data;

        //model is not coming as Json so have to use this jquery json parser
        model = jQuery.parseJSON(model);

        if (model.type == "joined") """),format.raw/*108.37*/("""{"""),format.raw/*108.38*/("""

            """),format.raw/*110.13*/("""var tmp_username = username.split("@")[0];

            var users = model.joinedUsers;
            activePlayersList.html("");
            activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');

            for (i = 0; i < users.length; i++) """),format.raw/*116.48*/("""{"""),format.raw/*116.49*/("""
                """),format.raw/*117.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*117.61*/("""{"""),format.raw/*117.62*/("""
                    """),format.raw/*118.21*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                """),format.raw/*119.17*/("""}"""),format.raw/*119.18*/("""//if
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/("""//for
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/("""//joined

        else if (model.type == "LeaveGame") """),format.raw/*123.45*/("""{"""),format.raw/*123.46*/("""

            """),format.raw/*125.13*/("""var users = model.joinedUsers;
            var leavinguser = model.leavingUser;
            var activityLog = $('#activity-log');
            var txt = leavinguser + " left the game!";
            activityLog.prepend('<p>' + txt + '</p><hr/>');
            var deadTurn = parseInt(model.turnToSkip);
            var myTurn = parseInt($('#turn').val());
            var tmp_username = username.split("@")[0];
            var active = model.active;
            var turnNumber = parseInt(model.turnNumber);

            if (tmp_username == leavinguser) """),format.raw/*136.46*/("""{"""),format.raw/*136.47*/("""
                """),format.raw/*137.17*/("""$('#dashform').submit();
            """),format.raw/*138.13*/("""}"""),format.raw/*138.14*/("""

            """),format.raw/*140.13*/("""if (active && myTurn == turnNumber) """),format.raw/*140.49*/("""{"""),format.raw/*140.50*/("""
                """),format.raw/*141.17*/("""enableMyTurn();
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/("""

            """),format.raw/*144.13*/("""if (myTurn > deadTurn) """),format.raw/*144.36*/("""{"""),format.raw/*144.37*/("""
                """),format.raw/*145.17*/("""myTurn = myTurn - 1;
                $('#turn').val(myTurn);
            """),format.raw/*147.13*/("""}"""),format.raw/*147.14*/("""

            """),format.raw/*149.13*/("""var users = model.joinedUsers;
            activePlayersList.html("");
            activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');

            for (i = 0; i < users.length; i++) """),format.raw/*153.48*/("""{"""),format.raw/*153.49*/("""
                """),format.raw/*154.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*154.61*/("""{"""),format.raw/*154.62*/("""
                    """),format.raw/*155.21*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                """),format.raw/*156.17*/("""}"""),format.raw/*156.18*/("""//if
            """),format.raw/*157.13*/("""}"""),format.raw/*157.14*/("""//for
        """),format.raw/*158.9*/("""}"""),format.raw/*158.10*/("""

        """),format.raw/*160.9*/("""else if (model.type == "redirect") """),format.raw/*160.44*/("""{"""),format.raw/*160.45*/("""
            """),format.raw/*161.13*/("""$('#frmHidden').submit();
        """),format.raw/*162.9*/("""}"""),format.raw/*162.10*/("""

        """),format.raw/*164.9*/("""else if (model.type == "UpdateActivityLog") """),format.raw/*164.53*/("""{"""),format.raw/*164.54*/("""
            """),format.raw/*165.13*/("""var stepName = model.stepName,
                playerName = model.player.split("@")[0];

            var activityLog = $('#activity-log');
            var txt = playerName + " performed step: " + stepName;

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*172.9*/("""}"""),format.raw/*172.10*/("""//UpdateActivityLog

        else if (model.type == "Timeout") """),format.raw/*174.43*/("""{"""),format.raw/*174.44*/("""
            """),format.raw/*175.13*/("""var playerName = model.player;

            var activityLog = $('#activity-log');

            var txt = playerName + " missed their turn due to timeout!";

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/("""//Timeout

        else if (model.type == "SkipTurn") """),format.raw/*184.44*/("""{"""),format.raw/*184.45*/("""
            """),format.raw/*185.13*/("""var playerName = model.player;

            var activityLog = $('#activity-log');

            var txt = playerName + " skipped their turn!";

            activityLog.prepend('<p>' + txt + '</p><hr/>');
        """),format.raw/*192.9*/("""}"""),format.raw/*192.10*/("""//SkipTurn


        else if (model.type == "Chat") """),format.raw/*195.40*/("""{"""),format.raw/*195.41*/("""
            """),format.raw/*196.13*/("""var playerName = model.player.split("@")[0],
                message = model.message;

            var chatArea = $('#chatArea');

            var txt = "<b>" + playerName + "</b>: " + message;

            chatArea.append('<p>' + txt + '</p>');
        """),format.raw/*204.9*/("""}"""),format.raw/*204.10*/("""//Chat

        else if (model.type == "ChangeTurn") """),format.raw/*206.46*/("""{"""),format.raw/*206.47*/("""
            """),format.raw/*207.13*/("""var turnNumber = model.turnNumber,
                playerTurn = $('#turn').val();

            //alert("CTurn: " + turnNumber + ", PTurn: " + playerTurn + ", EStatus: " + (turnNumber == playerTurn));
            if (turnNumber == playerTurn) """),format.raw/*211.43*/("""{"""),format.raw/*211.44*/("""
                """),format.raw/*212.17*/("""enableMyTurn();
                publishMyTurn();
                if ($('#btnIsProduction').val() == "true") """),format.raw/*214.60*/("""{"""),format.raw/*214.61*/("""
                    """),format.raw/*215.21*/("""$('#btnSkip').trigger('click');
                """),format.raw/*216.17*/("""}"""),format.raw/*216.18*/("""
            """),format.raw/*217.13*/("""}"""),format.raw/*217.14*/("""

            """),format.raw/*219.13*/("""//publishMyTurn();

        """),format.raw/*221.9*/("""}"""),format.raw/*221.10*/("""//ChangeTurn

        else if (model.type == "TurnUpdate") """),format.raw/*223.46*/("""{"""),format.raw/*223.47*/("""
            """),format.raw/*224.13*/("""var currentPlayer = model.currentPlayer.split("@")[0];
            var tmp_username = username.split("@")[0];

            var users = model.joinedUsers;
            activePlayersList.html("");

            if (tmp_username == currentPlayer) """),format.raw/*230.48*/("""{"""),format.raw/*230.49*/("""
                """),format.raw/*231.17*/("""activePlayersList.append('<b>' + tmp_username + ' (you)' + '</b><br/>');
            """),format.raw/*232.13*/("""}"""),format.raw/*232.14*/("""

            """),format.raw/*234.13*/("""else """),format.raw/*234.18*/("""{"""),format.raw/*234.19*/("""
                """),format.raw/*235.17*/("""activePlayersList.append(tmp_username + ' (you)' + '<br/>');
            """),format.raw/*236.13*/("""}"""),format.raw/*236.14*/("""


            """),format.raw/*239.13*/("""for (i = 0; i < users.length; i++) """),format.raw/*239.48*/("""{"""),format.raw/*239.49*/("""
                """),format.raw/*240.17*/("""if (users[i].split("-")[0] != tmp_username) """),format.raw/*240.61*/("""{"""),format.raw/*240.62*/("""
                    """),format.raw/*241.21*/("""if (users[i].split("-")[0] == currentPlayer) """),format.raw/*241.66*/("""{"""),format.raw/*241.67*/("""
                        """),format.raw/*242.25*/("""activePlayersList.append('<b>' + users[i].split("-")[0] + '</b><br/>');
                    """),format.raw/*243.21*/("""}"""),format.raw/*243.22*/("""

                    """),format.raw/*245.21*/("""else """),format.raw/*245.26*/("""{"""),format.raw/*245.27*/("""
                        """),format.raw/*246.25*/("""activePlayersList.append(users[i].split("-")[0] + '<br/>');
                    """),format.raw/*247.21*/("""}"""),format.raw/*247.22*/("""
                """),format.raw/*248.17*/("""}"""),format.raw/*248.18*/("""//if
            """),format.raw/*249.13*/("""}"""),format.raw/*249.14*/("""//for

        """),format.raw/*251.9*/("""}"""),format.raw/*251.10*/("""//TurnUpdate

        else """),format.raw/*253.14*/("""{"""),format.raw/*253.15*/("""
            """),format.raw/*254.13*/("""var name = model.name;
            $('#lblCount').text(count);
            $('#divJoined').prepend('<p>' + name + '</p>');
        """),format.raw/*257.9*/("""}"""),format.raw/*257.10*/("""
    """),format.raw/*258.5*/("""}"""),format.raw/*258.6*/("""

    """),format.raw/*260.5*/("""$('#editTodoDialog').on('shown.bs.modal', function () """),format.raw/*260.59*/("""{"""),format.raw/*260.60*/("""

        """),format.raw/*262.9*/("""if (myTurn == "true") """),format.raw/*262.31*/("""{"""),format.raw/*262.32*/("""

            """),format.raw/*264.13*/("""$(".perform-step").attr("disabled", false);
            $("#btnSkip").attr("disabled", false);
            $(".perform-risk").attr("disabled", false);

        """),format.raw/*268.9*/("""}"""),format.raw/*268.10*/(""" """),format.raw/*268.11*/("""else """),format.raw/*268.16*/("""{"""),format.raw/*268.17*/("""

            """),format.raw/*270.13*/("""$(".perform-step").attr("disabled", true);
            $("#btnSkip").attr("disabled", true);
            $(".perform-risk").attr("disabled", true);
        """),format.raw/*273.9*/("""}"""),format.raw/*273.10*/("""


    """),format.raw/*276.5*/("""}"""),format.raw/*276.6*/(""");

    var publishMyTurn = function (event) """),format.raw/*278.42*/("""{"""),format.raw/*278.43*/("""
        """),format.raw/*279.9*/("""var data = JSON.stringify("""),format.raw/*279.35*/("""{"""),format.raw/*279.36*/("""
            """),format.raw/*280.13*/(""""gameid": gameid,
            "type": "TurnUpdate",
            "player": """),format.raw/*282.23*/("""{"""),format.raw/*282.24*/(""""name": username, "team": "somecode""""),format.raw/*282.60*/("""}"""),format.raw/*282.61*/("""
        """),format.raw/*283.9*/("""}"""),format.raw/*283.10*/(""");
        socket.send(data);
    """),format.raw/*285.5*/("""}"""),format.raw/*285.6*/("""

    """),format.raw/*287.5*/("""var initConnection = function (event) """),format.raw/*287.43*/("""{"""),format.raw/*287.44*/("""
        """),format.raw/*288.9*/("""registerGameId();
        publishMyPresence();
        checkIfFirstTurn();
    """),format.raw/*291.5*/("""}"""),format.raw/*291.6*/("""

    """),format.raw/*293.5*/("""var checkIfFirstTurn = function (event) """),format.raw/*293.45*/("""{"""),format.raw/*293.46*/("""
        """),format.raw/*294.9*/("""if (turn == "1") """),format.raw/*294.26*/("""{"""),format.raw/*294.27*/("""
            """),format.raw/*295.13*/("""enableMyTurn();
        """),format.raw/*296.9*/("""}"""),format.raw/*296.10*/("""
    """),format.raw/*297.5*/("""}"""),format.raw/*297.6*/("""

    """),format.raw/*299.5*/("""//put all code inside this method to setup the stage for player who is having the current turn
    var enableMyTurn = function (event) """),format.raw/*300.41*/("""{"""),format.raw/*300.42*/("""
        """),format.raw/*301.9*/("""myTurn = "true";
        timer.show();
        setTimer(timerTime);
        resetTimer();
        startTimer();
    """),format.raw/*306.5*/("""}"""),format.raw/*306.6*/("""

    """),format.raw/*308.5*/("""var publishMyPresence = function (event) """),format.raw/*308.46*/("""{"""),format.raw/*308.47*/("""
        """),format.raw/*309.9*/("""//push to socket on first page load of any user
        var data = JSON.stringify("""),format.raw/*310.35*/("""{"""),format.raw/*310.36*/("""
            """),format.raw/*311.13*/(""""gameid": gameid,
            "type": "joined",
            "player": """),format.raw/*313.23*/("""{"""),format.raw/*313.24*/(""""name": username, "team": "somecode""""),format.raw/*313.60*/("""}"""),format.raw/*313.61*/("""
        """),format.raw/*314.9*/("""}"""),format.raw/*314.10*/(""");
        socket.send(data);
    """),format.raw/*316.5*/("""}"""),format.raw/*316.6*/("""

    """),format.raw/*318.5*/("""var registerGameId = function (event) """),format.raw/*318.43*/("""{"""),format.raw/*318.44*/("""
        """),format.raw/*319.9*/("""//push to socket on first page load of any user
        var data = JSON.stringify("""),format.raw/*320.35*/("""{"""),format.raw/*320.36*/(""""gameid": gameid, "type": "RegisterGameId""""),format.raw/*320.78*/("""}"""),format.raw/*320.79*/(""");
        socket.send(data);
    """),format.raw/*322.5*/("""}"""),format.raw/*322.6*/("""

    """),format.raw/*324.5*/("""//read message from socket
    socket.onmessage = writeMessages;

    //without this I am getting exception that CONNECTION NOT ESTABLISHED
    socket.onopen = initConnection;


    $('#btnJoin').click(function (event) """),format.raw/*331.42*/("""{"""),format.raw/*331.43*/("""

        """),format.raw/*333.9*/("""var name = $('#txtName').val();
        var code = $('#txtCode').val();


        var data = JSON.stringify("""),format.raw/*337.35*/("""{"""),format.raw/*337.36*/(""""name": name, "team": code"""),format.raw/*337.62*/("""}"""),format.raw/*337.63*/(""");

        //push to socket
        socket.send(data);

        $('#txtName').val('');
        $('#txtCode').val('');

        $('#txtName').attr('hidden', true);
        $('#txtCode').attr('hidden', true);
        $('#divPlayerStatus').attr('hidden', false);
        $('#btnLeave').attr('hidden', false);
        $('#btnJoin').attr('hidden', true);
    """),format.raw/*350.5*/("""}"""),format.raw/*350.6*/(""");


    //Event handler for start game event
    $('#btnStart').click(function (e) """),format.raw/*354.39*/("""{"""),format.raw/*354.40*/("""

        """),format.raw/*356.9*/("""var username = $('#username').val();
        var data = JSON.stringify("""),format.raw/*357.35*/("""{"""),format.raw/*357.36*/(""""gameid": gameid, "type": "StartGame", "player": """),format.raw/*357.85*/("""{"""),format.raw/*357.86*/(""""username": username"""),format.raw/*357.106*/("""}"""),format.raw/*357.107*/("""}"""),format.raw/*357.108*/(""");
        socket.send(data);
    """),format.raw/*359.5*/("""}"""),format.raw/*359.6*/(""");

    //take snapshot only when modal is closed
    $('#editTodoDialog').on('hidden.bs.modal', function () """),format.raw/*362.60*/("""{"""),format.raw/*362.61*/("""
        """),format.raw/*363.9*/("""takeSnapshot();
    """),format.raw/*364.5*/("""}"""),format.raw/*364.6*/(""");

    //Perform step button event handler
    $('.perform-step').on("click", function () """),format.raw/*367.48*/("""{"""),format.raw/*367.49*/("""
        """),format.raw/*368.9*/("""myTurn = "false";
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
    """),format.raw/*384.5*/("""}"""),format.raw/*384.6*/(""");

    $('#updateactivity').on("click", function () """),format.raw/*386.50*/("""{"""),format.raw/*386.51*/("""

        """),format.raw/*388.9*/("""var topModal = $(this).closest('div.modal'),
            parentModal = topModal.find('div.modal-content'),
            header = parentModal.find('div.modal-header'),
            title = header.find('.modal-title').html();

//this will hide the modal
//topModal.modal('toggle');
        var isoops = $('#isoops').val();
        var otitle = "";
        var oopsmsg = $('#oopsmsg').val();
        if (isoops == "true") """),format.raw/*398.31*/("""{"""),format.raw/*398.32*/("""
            """),format.raw/*399.13*/("""otitle = "You got an OOPS card." + oopsmsg;
        """),format.raw/*400.9*/("""}"""),format.raw/*400.10*/("""
        """),format.raw/*401.9*/("""else """),format.raw/*401.14*/("""{"""),format.raw/*401.15*/("""
            """),format.raw/*402.13*/("""otitle = "You got an Surprise card" + oopsmsg;
        """),format.raw/*403.9*/("""}"""),format.raw/*403.10*/("""
        """),format.raw/*404.9*/("""updateActivityLogs(otitle);
//alert("testting oops");
//publishTurnNumber();

//stopTimer();

//setTimer(timerTime);
//resetTimer();
//timer.hide();
    """),format.raw/*413.5*/("""}"""),format.raw/*413.6*/(""");

    var takeSnapshot = function () """),format.raw/*415.36*/("""{"""),format.raw/*415.37*/("""
        """),format.raw/*416.9*/("""html2canvas(document.body, """),format.raw/*416.36*/("""{"""),format.raw/*416.37*/("""
            """),format.raw/*417.13*/("""onrendered: function (canvas) """),format.raw/*417.43*/("""{"""),format.raw/*417.44*/("""
                """),format.raw/*418.17*/("""//"""),format.raw/*418.57*/("""
                """),format.raw/*419.17*/("""uploadImage(canvas.toDataURL());
            """),format.raw/*420.13*/("""}"""),format.raw/*420.14*/("""
        """),format.raw/*421.9*/("""}"""),format.raw/*421.10*/(""");
    """),format.raw/*422.5*/("""}"""),format.raw/*422.6*/("""

    """),format.raw/*424.5*/("""var uploadImage = function (url) """),format.raw/*424.38*/("""{"""),format.raw/*424.39*/("""
        """),format.raw/*425.9*/("""var turnNo = parseInt($('#turnNo').html());
        turnNo = turnNo - 1;
        var obj = """),format.raw/*427.19*/("""{"""),format.raw/*427.20*/("""'image-data': url, 'username': username, 'gameid': gameid, 'turnNo': turnNo"""),format.raw/*427.95*/("""}"""),format.raw/*427.96*/(""";
        $.ajax("""),format.raw/*428.16*/("""{"""),format.raw/*428.17*/("""
            """),format.raw/*429.13*/("""type: 'POST',
            url: '"""),_display_(/*430.20*/routes/*430.26*/.GameController.saveImageSnapshot()),format.raw/*430.61*/("""',
            data: JSON.stringify(obj),
            contentType: 'application/json',
            success: function (data) """),format.raw/*433.38*/("""{"""),format.raw/*433.39*/("""
                """),format.raw/*434.17*/("""//alert("Image uploaded");
            """),format.raw/*435.13*/("""}"""),format.raw/*435.14*/("""
        """),format.raw/*436.9*/("""}"""),format.raw/*436.10*/(""");//ajax call ends here
    """),format.raw/*437.5*/("""}"""),format.raw/*437.6*/("""

    """),format.raw/*439.5*/("""var publishTurnNumber = function () """),format.raw/*439.41*/("""{"""),format.raw/*439.42*/("""
        """),format.raw/*440.9*/("""var turnNumber = $('#turn').val();
        var data = JSON.stringify("""),format.raw/*441.35*/("""{"""),format.raw/*441.36*/(""""gameid": gameid, "turnNumber": turnNumber, "type": "ChangeTurn""""),format.raw/*441.100*/("""}"""),format.raw/*441.101*/(""");
        socket.send(data);
    """),format.raw/*443.5*/("""}"""),format.raw/*443.6*/("""

    """),format.raw/*445.5*/("""var updateActivityLogs = function (title) """),format.raw/*445.47*/("""{"""),format.raw/*445.48*/("""
        """),format.raw/*446.9*/("""var data = JSON.stringify("""),format.raw/*446.35*/("""{"""),format.raw/*446.36*/("""
            """),format.raw/*447.13*/(""""gameid": gameid,
            "stepName": title,
            "type": "PerformStep",
            "player": """),format.raw/*450.23*/("""{"""),format.raw/*450.24*/(""""username": username"""),format.raw/*450.44*/("""}"""),format.raw/*450.45*/("""
        """),format.raw/*451.9*/("""}"""),format.raw/*451.10*/(""");
        socket.send(data);
    """),format.raw/*453.5*/("""}"""),format.raw/*453.6*/("""

    """),format.raw/*455.5*/("""$('#btnSend').click(function () """),format.raw/*455.37*/("""{"""),format.raw/*455.38*/("""
        """),format.raw/*456.9*/("""var message = $('#txtMessage').val();
        $('#txtMessage').val('');
        if (message != "") """),format.raw/*458.28*/("""{"""),format.raw/*458.29*/("""
            """),format.raw/*459.13*/("""var data = JSON.stringify("""),format.raw/*459.39*/("""{"""),format.raw/*459.40*/("""
                """),format.raw/*460.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*463.27*/("""{"""),format.raw/*463.28*/(""""username": username"""),format.raw/*463.48*/("""}"""),format.raw/*463.49*/("""
            """),format.raw/*464.13*/("""}"""),format.raw/*464.14*/(""");
            socket.send(data);
        """),format.raw/*466.9*/("""}"""),format.raw/*466.10*/("""
    """),format.raw/*467.5*/("""}"""),format.raw/*467.6*/(""");

    var sendChatMessage = function (message) """),format.raw/*469.46*/("""{"""),format.raw/*469.47*/("""
        """),format.raw/*470.9*/("""if (message != "") """),format.raw/*470.28*/("""{"""),format.raw/*470.29*/("""
            """),format.raw/*471.13*/("""var data = JSON.stringify("""),format.raw/*471.39*/("""{"""),format.raw/*471.40*/("""
                """),format.raw/*472.17*/(""""gameid": gameid,
                "message": message,
                "type": "Chat",
                "player": """),format.raw/*475.27*/("""{"""),format.raw/*475.28*/(""""username": username"""),format.raw/*475.48*/("""}"""),format.raw/*475.49*/("""
            """),format.raw/*476.13*/("""}"""),format.raw/*476.14*/(""");
            socket.send(data);
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/("""
    """),format.raw/*479.5*/("""}"""),format.raw/*479.6*/("""

    """),format.raw/*481.5*/("""$('#btnLeave').click(function (e) """),format.raw/*481.39*/("""{"""),format.raw/*481.40*/("""

        """),format.raw/*483.9*/("""var data = JSON.stringify("""),format.raw/*483.35*/("""{"""),format.raw/*483.36*/(""""type": "leaving", "player": """),format.raw/*483.65*/("""{"""),format.raw/*483.66*/(""""username": username"""),format.raw/*483.86*/("""}"""),format.raw/*483.87*/("""}"""),format.raw/*483.88*/(""");
        socket.send(data);

        $.ajax("""),format.raw/*486.16*/("""{"""),format.raw/*486.17*/("""
            """),format.raw/*487.13*/("""type: "GET",
            url: '/leave',
            data: """),format.raw/*489.19*/("""{"""),format.raw/*489.20*/("""'username': username"""),format.raw/*489.40*/("""}"""),format.raw/*489.41*/(""",
            success: function (data) """),format.raw/*490.38*/("""{"""),format.raw/*490.39*/("""
                """),format.raw/*491.17*/("""window.location.replace("/");
            """),format.raw/*492.13*/("""}"""),format.raw/*492.14*/("""
        """),format.raw/*493.9*/("""}"""),format.raw/*493.10*/(""");
    """),format.raw/*494.5*/("""}"""),format.raw/*494.6*/(""");


    $('#btnSkip').click(function () """),format.raw/*497.37*/("""{"""),format.raw/*497.38*/("""
        """),format.raw/*498.9*/("""timeout = true;
        sendSkipTurnMessage();

        setTimer(timerTime);
        resetTimer();
        timer.hide();
        //In case of timeout, next player should get his turn
        publishTurnNumber();
    """),format.raw/*506.5*/("""}"""),format.raw/*506.6*/(""");

    $('#txtMessage').keyup(function (event) """),format.raw/*508.45*/("""{"""),format.raw/*508.46*/("""

        """),format.raw/*510.9*/("""if (event.keyCode == 13) """),format.raw/*510.34*/("""{"""),format.raw/*510.35*/("""

            """),format.raw/*512.13*/("""//check if length is more than 150
            if ($(this).val().length <= 150) """),format.raw/*513.46*/("""{"""),format.raw/*513.47*/("""
                """),format.raw/*514.17*/("""sendChatMessage($(this).val());
                $('#txtMessage').val('');
                return;
            """),format.raw/*517.13*/("""}"""),format.raw/*517.14*/("""
        """),format.raw/*518.9*/("""}"""),format.raw/*518.10*/("""

        """),format.raw/*520.9*/("""var length = $(this).val().length;
        if (length > 150) """),format.raw/*521.27*/("""{"""),format.raw/*521.28*/("""
            """),format.raw/*522.13*/("""$(this).css('color', 'red');
        """),format.raw/*523.9*/("""}"""),format.raw/*523.10*/("""
        """),format.raw/*524.9*/("""else """),format.raw/*524.14*/("""{"""),format.raw/*524.15*/("""
            """),format.raw/*525.13*/("""$(this).css('color', 'black');
        """),format.raw/*526.9*/("""}"""),format.raw/*526.10*/("""
    """),format.raw/*527.5*/("""}"""),format.raw/*527.6*/(""");


    $('#lnkLeave').click(function () """),format.raw/*530.38*/("""{"""),format.raw/*530.39*/("""

        """),format.raw/*532.9*/("""// var obj = """),format.raw/*532.22*/("""{"""),format.raw/*532.23*/("""'username' : username, 'gameid' : gameid"""),format.raw/*532.63*/("""}"""),format.raw/*532.64*/(""";
        // $.ajax("""),format.raw/*533.19*/("""{"""),format.raw/*533.20*/("""
        """),format.raw/*534.9*/("""//     type: 'POST',
        //     url: '/leave',
        //     data: JSON.stringify(obj),
        //     contentType: 'application/json',
        //     success: function (data) """),format.raw/*538.41*/("""{"""),format.raw/*538.42*/("""
        """),format.raw/*539.9*/("""//         if(data=="success")"""),format.raw/*539.39*/("""{"""),format.raw/*539.40*/("""
        """),format.raw/*540.9*/("""//             notifyOthers();
        //             $('#dashform').submit();
        //         """),format.raw/*542.20*/("""}"""),format.raw/*542.21*/("""
        """),format.raw/*543.9*/("""//     """),format.raw/*543.16*/("""}"""),format.raw/*543.17*/("""
        """),format.raw/*544.9*/("""// """),format.raw/*544.12*/("""}"""),format.raw/*544.13*/(""");//ajax call ends here
        notifyOthers();
    """),format.raw/*546.5*/("""}"""),format.raw/*546.6*/(""");

    var notifyOthers = function () """),format.raw/*548.36*/("""{"""),format.raw/*548.37*/("""
        """),format.raw/*549.9*/("""var turn = $('#turn').val();

        var isActivePlayer = myTurn == "true" ? true : false;

        var data = JSON.stringify("""),format.raw/*553.35*/("""{"""),format.raw/*553.36*/("""
            """),format.raw/*554.13*/(""""gameid": gameid,
            "type": "LeaveGame",
            "active": isActivePlayer,
            "turnNumber": turn,
            "player": """),format.raw/*558.23*/("""{"""),format.raw/*558.24*/(""""username": username"""),format.raw/*558.44*/("""}"""),format.raw/*558.45*/("""
        """),format.raw/*559.9*/("""}"""),format.raw/*559.10*/(""");
        socket.send(data);
    """),format.raw/*561.5*/("""}"""),format.raw/*561.6*/("""
"""),format.raw/*562.1*/("""}"""),format.raw/*562.2*/(""");"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object gamejsbackup extends gamejsbackup_Scope0.gamejsbackup
              /*
                  -- GENERATED --
                  DATE: Sat Jul 29 22:13:30 EDT 2017
                  SOURCE: /Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/app/views/gamejsbackup.scala.html
                  HASH: f462c4c25f97e5f70bd3d3cfabf1f43a9f49e3f0
                  MATRIX: 841->0|882->14|910->15|942->21|1320->371|1349->372|1385->381|1492->460|1521->461|1563->475|1617->501|1646->502|1691->519|2044->844|2073->845|2109->854|2138->855|2170->860|2198->861|2340->975|2369->976|2405->985|2485->1038|2513->1039|2546->1045|2605->1076|2634->1077|2670->1086|2722->1111|2750->1112|2783->1118|2839->1146|2868->1147|2904->1156|2973->1198|3001->1199|3034->1205|3091->1234|3120->1235|3156->1244|3229->1290|3257->1291|3290->1297|3377->1356|3406->1357|3442->1366|3587->1483|3616->1484|3691->1531|3720->1532|3769->1552|3799->1553|3829->1554|4181->1879|4209->1880|4242->1886|4308->1924|4337->1925|4373->1934|4518->2051|4547->2052|4623->2100|4652->2101|4701->2121|4731->2122|4761->2123|5097->2432|5125->2433|5158->2439|5576->2830|5591->2836|5653->2877|5830->3025|5860->3026|5897->3035|6106->3215|6136->3216|6179->3230|6468->3491|6498->3492|6544->3509|6617->3553|6647->3554|6697->3575|6802->3651|6832->3652|6878->3669|6908->3670|6950->3684|6980->3685|7063->3739|7093->3740|7136->3754|7715->4305|7745->4306|7791->4323|7857->4360|7887->4361|7930->4375|7995->4411|8025->4412|8071->4429|8128->4457|8158->4458|8201->4472|8253->4495|8283->4496|8329->4513|8431->4586|8461->4587|8504->4601|8737->4805|8767->4806|8813->4823|8886->4867|8916->4868|8966->4889|9071->4965|9101->4966|9147->4983|9177->4984|9219->4998|9249->4999|9287->5009|9351->5044|9381->5045|9423->5058|9485->5092|9515->5093|9553->5103|9626->5147|9656->5148|9698->5161|10001->5437|10031->5438|10123->5501|10153->5502|10195->5515|10448->5740|10478->5741|10561->5795|10591->5796|10633->5809|10872->6020|10902->6021|10983->6073|11013->6074|11055->6087|11337->6342|11367->6343|11449->6396|11479->6397|11521->6410|11792->6652|11822->6653|11868->6670|12005->6778|12035->6779|12085->6800|12162->6848|12192->6849|12234->6862|12264->6863|12307->6877|12363->6905|12393->6906|12481->6965|12511->6966|12553->6979|12824->7223|12854->7224|12900->7241|13014->7326|13044->7327|13087->7341|13121->7346|13151->7347|13197->7364|13299->7437|13329->7438|13373->7453|13437->7488|13467->7489|13513->7506|13586->7550|13616->7551|13666->7572|13740->7617|13770->7618|13824->7643|13945->7735|13975->7736|14026->7758|14060->7763|14090->7764|14144->7789|14253->7869|14283->7870|14329->7887|14359->7888|14405->7905|14435->7906|14478->7921|14508->7922|14564->7949|14594->7950|14636->7963|14795->8094|14825->8095|14858->8100|14887->8101|14921->8107|15004->8161|15034->8162|15072->8172|15123->8194|15153->8195|15196->8209|15384->8369|15414->8370|15444->8371|15478->8376|15508->8377|15551->8391|15735->8547|15765->8548|15800->8555|15829->8556|15903->8601|15933->8602|15970->8611|16025->8637|16055->8638|16097->8651|16200->8725|16230->8726|16295->8762|16325->8763|16362->8772|16392->8773|16454->8807|16483->8808|16517->8814|16584->8852|16614->8853|16651->8862|16758->8941|16787->8942|16821->8948|16890->8988|16920->8989|16957->8998|17003->9015|17033->9016|17075->9029|17127->9053|17157->9054|17190->9059|17219->9060|17253->9066|17417->9201|17447->9202|17484->9211|17628->9327|17657->9328|17691->9334|17761->9375|17791->9376|17828->9385|17939->9467|17969->9468|18011->9481|18110->9551|18140->9552|18205->9588|18235->9589|18272->9598|18302->9599|18364->9633|18393->9634|18427->9640|18494->9678|18524->9679|18561->9688|18672->9770|18702->9771|18773->9813|18803->9814|18865->9848|18894->9849|18928->9855|19176->10074|19206->10075|19244->10085|19381->10193|19411->10194|19466->10220|19496->10221|19879->10576|19908->10577|20021->10661|20051->10662|20089->10672|20189->10743|20219->10744|20297->10793|20327->10794|20377->10814|20408->10815|20439->10816|20501->10850|20530->10851|20668->10960|20698->10961|20735->10970|20783->10990|20812->10991|20932->11082|20962->11083|20999->11092|21509->11574|21538->11575|21620->11628|21650->11629|21688->11639|22134->12056|22164->12057|22206->12070|22286->12122|22316->12123|22353->12132|22387->12137|22417->12138|22459->12151|22542->12206|22572->12207|22609->12216|22790->12369|22819->12370|22887->12409|22917->12410|22954->12419|23010->12446|23040->12447|23082->12460|23141->12490|23171->12491|23217->12508|23248->12548|23294->12565|23368->12610|23398->12611|23435->12620|23465->12621|23500->12628|23529->12629|23563->12635|23625->12668|23655->12669|23692->12678|23812->12769|23842->12770|23946->12845|23976->12846|24022->12863|24052->12864|24094->12877|24155->12910|24171->12916|24228->12951|24381->13075|24411->13076|24457->13093|24525->13132|24555->13133|24592->13142|24622->13143|24678->13171|24707->13172|24741->13178|24806->13214|24836->13215|24873->13224|24971->13293|25001->13294|25095->13358|25126->13359|25188->13393|25217->13394|25251->13400|25322->13442|25352->13443|25389->13452|25444->13478|25474->13479|25516->13492|25651->13598|25681->13599|25730->13619|25760->13620|25797->13629|25827->13630|25889->13664|25918->13665|25952->13671|26013->13703|26043->13704|26080->13713|26208->13812|26238->13813|26280->13826|26335->13852|26365->13853|26411->13870|26552->13982|26582->13983|26631->14003|26661->14004|26703->14017|26733->14018|26803->14060|26833->14061|26866->14066|26895->14067|26973->14116|27003->14117|27040->14126|27088->14145|27118->14146|27160->14159|27215->14185|27245->14186|27291->14203|27432->14315|27462->14316|27511->14336|27541->14337|27583->14350|27613->14351|27683->14393|27713->14394|27746->14399|27775->14400|27809->14406|27872->14440|27902->14441|27940->14451|27995->14477|28025->14478|28083->14507|28113->14508|28162->14528|28192->14529|28222->14530|28297->14576|28327->14577|28369->14590|28456->14648|28486->14649|28535->14669|28565->14670|28633->14709|28663->14710|28709->14727|28780->14769|28810->14770|28847->14779|28877->14780|28912->14787|28941->14788|29011->14829|29041->14830|29078->14839|29322->15055|29351->15056|29428->15104|29458->15105|29496->15115|29550->15140|29580->15141|29623->15155|29732->15235|29762->15236|29808->15253|29947->15363|29977->15364|30014->15373|30044->15374|30082->15384|30172->15445|30202->15446|30244->15459|30309->15496|30339->15497|30376->15506|30410->15511|30440->15512|30482->15525|30549->15564|30579->15565|30612->15570|30641->15571|30712->15613|30742->15614|30780->15624|30822->15637|30852->15638|30921->15678|30951->15679|31000->15699|31030->15700|31067->15709|31277->15890|31307->15891|31344->15900|31403->15930|31433->15931|31470->15940|31597->16038|31627->16039|31664->16048|31700->16055|31730->16056|31767->16065|31799->16068|31829->16069|31909->16121|31938->16122|32006->16161|32036->16162|32073->16171|32229->16298|32259->16299|32301->16312|32473->16455|32503->16456|32552->16476|32582->16477|32619->16486|32649->16487|32711->16521|32740->16522|32769->16523|32798->16524
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|57->26|57->26|58->27|58->27|59->28|59->28|63->32|63->32|64->33|66->35|66->35|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|75->44|75->44|77->46|77->46|77->46|78->47|80->49|80->49|82->51|84->53|84->53|85->54|89->58|89->58|89->58|89->58|89->58|89->58|89->58|99->68|99->68|101->70|101->70|101->70|102->71|106->75|106->75|106->75|106->75|106->75|106->75|106->75|116->85|116->85|118->87|128->97|128->97|128->97|133->102|133->102|134->103|139->108|139->108|141->110|147->116|147->116|148->117|148->117|148->117|149->118|150->119|150->119|151->120|151->120|152->121|152->121|154->123|154->123|156->125|167->136|167->136|168->137|169->138|169->138|171->140|171->140|171->140|172->141|173->142|173->142|175->144|175->144|175->144|176->145|178->147|178->147|180->149|184->153|184->153|185->154|185->154|185->154|186->155|187->156|187->156|188->157|188->157|189->158|189->158|191->160|191->160|191->160|192->161|193->162|193->162|195->164|195->164|195->164|196->165|203->172|203->172|205->174|205->174|206->175|213->182|213->182|215->184|215->184|216->185|223->192|223->192|226->195|226->195|227->196|235->204|235->204|237->206|237->206|238->207|242->211|242->211|243->212|245->214|245->214|246->215|247->216|247->216|248->217|248->217|250->219|252->221|252->221|254->223|254->223|255->224|261->230|261->230|262->231|263->232|263->232|265->234|265->234|265->234|266->235|267->236|267->236|270->239|270->239|270->239|271->240|271->240|271->240|272->241|272->241|272->241|273->242|274->243|274->243|276->245|276->245|276->245|277->246|278->247|278->247|279->248|279->248|280->249|280->249|282->251|282->251|284->253|284->253|285->254|288->257|288->257|289->258|289->258|291->260|291->260|291->260|293->262|293->262|293->262|295->264|299->268|299->268|299->268|299->268|299->268|301->270|304->273|304->273|307->276|307->276|309->278|309->278|310->279|310->279|310->279|311->280|313->282|313->282|313->282|313->282|314->283|314->283|316->285|316->285|318->287|318->287|318->287|319->288|322->291|322->291|324->293|324->293|324->293|325->294|325->294|325->294|326->295|327->296|327->296|328->297|328->297|330->299|331->300|331->300|332->301|337->306|337->306|339->308|339->308|339->308|340->309|341->310|341->310|342->311|344->313|344->313|344->313|344->313|345->314|345->314|347->316|347->316|349->318|349->318|349->318|350->319|351->320|351->320|351->320|351->320|353->322|353->322|355->324|362->331|362->331|364->333|368->337|368->337|368->337|368->337|381->350|381->350|385->354|385->354|387->356|388->357|388->357|388->357|388->357|388->357|388->357|388->357|390->359|390->359|393->362|393->362|394->363|395->364|395->364|398->367|398->367|399->368|415->384|415->384|417->386|417->386|419->388|429->398|429->398|430->399|431->400|431->400|432->401|432->401|432->401|433->402|434->403|434->403|435->404|444->413|444->413|446->415|446->415|447->416|447->416|447->416|448->417|448->417|448->417|449->418|449->418|450->419|451->420|451->420|452->421|452->421|453->422|453->422|455->424|455->424|455->424|456->425|458->427|458->427|458->427|458->427|459->428|459->428|460->429|461->430|461->430|461->430|464->433|464->433|465->434|466->435|466->435|467->436|467->436|468->437|468->437|470->439|470->439|470->439|471->440|472->441|472->441|472->441|472->441|474->443|474->443|476->445|476->445|476->445|477->446|477->446|477->446|478->447|481->450|481->450|481->450|481->450|482->451|482->451|484->453|484->453|486->455|486->455|486->455|487->456|489->458|489->458|490->459|490->459|490->459|491->460|494->463|494->463|494->463|494->463|495->464|495->464|497->466|497->466|498->467|498->467|500->469|500->469|501->470|501->470|501->470|502->471|502->471|502->471|503->472|506->475|506->475|506->475|506->475|507->476|507->476|509->478|509->478|510->479|510->479|512->481|512->481|512->481|514->483|514->483|514->483|514->483|514->483|514->483|514->483|514->483|517->486|517->486|518->487|520->489|520->489|520->489|520->489|521->490|521->490|522->491|523->492|523->492|524->493|524->493|525->494|525->494|528->497|528->497|529->498|537->506|537->506|539->508|539->508|541->510|541->510|541->510|543->512|544->513|544->513|545->514|548->517|548->517|549->518|549->518|551->520|552->521|552->521|553->522|554->523|554->523|555->524|555->524|555->524|556->525|557->526|557->526|558->527|558->527|561->530|561->530|563->532|563->532|563->532|563->532|563->532|564->533|564->533|565->534|569->538|569->538|570->539|570->539|570->539|571->540|573->542|573->542|574->543|574->543|574->543|575->544|575->544|575->544|577->546|577->546|579->548|579->548|580->549|584->553|584->553|585->554|589->558|589->558|589->558|589->558|590->559|590->559|592->561|592->561|593->562|593->562
                  -- GENERATED --
              */
          