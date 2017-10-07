
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Arul/Documents/RISK_GAME_DEVELOPMENT/conf/routes
// @DATE:Thu Sep 28 18:39:29 EDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseRegisterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegisterController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseGameController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def getRiskCards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.getRiskCards",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "riskdashboard"})
        }
      """
    )
  
    // @LINE:29
    def getSnapshotDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.getSnapshotDetails",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snapshotDetails"})
        }
      """
    )
  
    // @LINE:19
    def saveImageSnapshot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.saveImageSnapshot",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadimage"})
        }
      """
    )
  
    // @LINE:33
    def getProjectSteps: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.getProjectSteps",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projectsteps"})
        }
      """
    )
  
    // @LINE:21
    def hostGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.hostGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "host"})
        }
      """
    )
  
    // @LINE:22
    def joinGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.joinGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "join"})
        }
      """
    )
  
    // @LINE:46
    def getMitigationSteps: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.getMitigationSteps",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "risk"})
        }
      """
    )
  
    // @LINE:27
    def observeGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.observeGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "observegame"})
        }
      """
    )
  
    // @LINE:23
    def leaveGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.leaveGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "leave"})
        }
      """
    )
  
    // @LINE:44
    def updateTimeOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.updateTimeOut",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "performTimeOut"})
        }
      """
    )
  
    // @LINE:43
    def performStep: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.performStep",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "performstep"})
        }
      """
    )
  
    // @LINE:7
    def startGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.startGame",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "config"})
          }
        
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseDashboardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def viewDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.viewDashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:25
    def completedGames: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.completedGames",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Completegames"})
        }
      """
    )
  
    // @LINE:40
    def viewHostGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.viewHostGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "hostgame"})
        }
      """
    )
  
    // @LINE:26
    def joinGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.joinGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "joingame"})
        }
      """
    )
  
    // @LINE:24
    def activeGames: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DashboardController.activeGames",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Activegames"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:12
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def wsJs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.wsJs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets.javascript.ws.js"})
        }
      """
    )
  
    // @LINE:37
    def gameJs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.gameJs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets.javascript.gamejs.js"})
        }
      """
    )
  
    // @LINE:15
    def playerJoin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.playerJoin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "playerjoin"})
        }
      """
    )
  
    // @LINE:38
    def wsInterface: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.wsInterface",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wsInterface"})
        }
      """
    )
  
    // @LINE:36
    def hostJs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.hostJs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets.javascript.hostjs.js"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}