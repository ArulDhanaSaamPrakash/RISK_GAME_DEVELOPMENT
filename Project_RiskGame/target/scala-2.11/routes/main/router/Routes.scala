
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/conf/routes
// @DATE:Sat Jul 29 21:49:47 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """config""", """controllers.GameController.startGame()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """playerjoin""", """controllers.Application.playerJoin()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegisterController.register()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """uploadimage""", """controllers.GameController.saveImageSnapshot()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """host""", """controllers.GameController.hostGame()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """join""", """controllers.GameController.joinGame()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leave""", """controllers.GameController.leaveGame()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Activegames""", """controllers.DashboardController.activeGames()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Completegames""", """controllers.DashboardController.completedGames()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """joingame""", """controllers.DashboardController.joinGame()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """observegame""", """controllers.GameController.observeGame()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snapshotDetails""", """controllers.GameController.getSnapshotDetails()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """start""", """controllers.GameController.startGame()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectsteps""", """controllers.GameController.getProjectSteps()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets.javascript.ws.js""", """controllers.Application.wsJs()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets.javascript.hostjs.js""", """controllers.Application.hostJs()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets.javascript.gamejs.js""", """controllers.Application.gameJs()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wsInterface""", """controllers.Application.wsInterface()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hostgame""", """controllers.DashboardController.viewHostGame()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.DashboardController.viewDashboard()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """performstep""", """controllers.GameController.performStep()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """riskdashboard""", """controllers.GameController.getRiskCards()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """risk""", """controllers.GameController.getMitigationSteps()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_GameController_startGame1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("config")))
  )
  private[this] lazy val controllers_GameController_startGame1_invoker = createInvoker(
    controllers.GameController.startGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "startGame",
      Nil,
      "GET",
      """""",
      this.prefix + """config"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_at2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LoginController_login3_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login3_invoker = createInvoker(
    controllers.LoginController.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LoginController_logout4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout4_invoker = createInvoker(
    controllers.LoginController.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_playerJoin5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("playerjoin")))
  )
  private[this] lazy val controllers_Application_playerJoin5_invoker = createInvoker(
    controllers.Application.playerJoin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "playerJoin",
      Nil,
      "GET",
      """""",
      this.prefix + """playerjoin"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_RegisterController_register6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegisterController_register6_invoker = createInvoker(
    controllers.RegisterController.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegisterController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_GameController_saveImageSnapshot7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadimage")))
  )
  private[this] lazy val controllers_GameController_saveImageSnapshot7_invoker = createInvoker(
    controllers.GameController.saveImageSnapshot(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "saveImageSnapshot",
      Nil,
      "POST",
      """""",
      this.prefix + """uploadimage"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GameController_hostGame8_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("host")))
  )
  private[this] lazy val controllers_GameController_hostGame8_invoker = createInvoker(
    controllers.GameController.hostGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "hostGame",
      Nil,
      "POST",
      """""",
      this.prefix + """host"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_GameController_joinGame9_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("join")))
  )
  private[this] lazy val controllers_GameController_joinGame9_invoker = createInvoker(
    controllers.GameController.joinGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "joinGame",
      Nil,
      "POST",
      """""",
      this.prefix + """join"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_GameController_leaveGame10_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leave")))
  )
  private[this] lazy val controllers_GameController_leaveGame10_invoker = createInvoker(
    controllers.GameController.leaveGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "leaveGame",
      Nil,
      "POST",
      """""",
      this.prefix + """leave"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_DashboardController_activeGames11_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Activegames")))
  )
  private[this] lazy val controllers_DashboardController_activeGames11_invoker = createInvoker(
    controllers.DashboardController.activeGames(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "activeGames",
      Nil,
      "POST",
      """""",
      this.prefix + """Activegames"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_DashboardController_completedGames12_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Completegames")))
  )
  private[this] lazy val controllers_DashboardController_completedGames12_invoker = createInvoker(
    controllers.DashboardController.completedGames(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "completedGames",
      Nil,
      "POST",
      """""",
      this.prefix + """Completegames"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_DashboardController_joinGame13_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("joingame")))
  )
  private[this] lazy val controllers_DashboardController_joinGame13_invoker = createInvoker(
    controllers.DashboardController.joinGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "joinGame",
      Nil,
      "POST",
      """""",
      this.prefix + """joingame"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_GameController_observeGame14_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("observegame")))
  )
  private[this] lazy val controllers_GameController_observeGame14_invoker = createInvoker(
    controllers.GameController.observeGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "observeGame",
      Nil,
      "POST",
      """""",
      this.prefix + """observegame"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_GameController_getSnapshotDetails15_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("snapshotDetails")))
  )
  private[this] lazy val controllers_GameController_getSnapshotDetails15_invoker = createInvoker(
    controllers.GameController.getSnapshotDetails(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "getSnapshotDetails",
      Nil,
      "POST",
      """""",
      this.prefix + """snapshotDetails"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_GameController_startGame16_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("start")))
  )
  private[this] lazy val controllers_GameController_startGame16_invoker = createInvoker(
    controllers.GameController.startGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "startGame",
      Nil,
      "POST",
      """""",
      this.prefix + """start"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_GameController_getProjectSteps17_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectsteps")))
  )
  private[this] lazy val controllers_GameController_getProjectSteps17_invoker = createInvoker(
    controllers.GameController.getProjectSteps(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "getProjectSteps",
      Nil,
      "POST",
      """""",
      this.prefix + """projectsteps"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_wsJs18_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets.javascript.ws.js")))
  )
  private[this] lazy val controllers_Application_wsJs18_invoker = createInvoker(
    controllers.Application.wsJs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "wsJs",
      Nil,
      "GET",
      """""",
      this.prefix + """assets.javascript.ws.js"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_hostJs19_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets.javascript.hostjs.js")))
  )
  private[this] lazy val controllers_Application_hostJs19_invoker = createInvoker(
    controllers.Application.hostJs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "hostJs",
      Nil,
      "GET",
      """""",
      this.prefix + """assets.javascript.hostjs.js"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_gameJs20_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets.javascript.gamejs.js")))
  )
  private[this] lazy val controllers_Application_gameJs20_invoker = createInvoker(
    controllers.Application.gameJs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "gameJs",
      Nil,
      "GET",
      """""",
      this.prefix + """assets.javascript.gamejs.js"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_wsInterface21_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wsInterface")))
  )
  private[this] lazy val controllers_Application_wsInterface21_invoker = createInvoker(
    controllers.Application.wsInterface(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "wsInterface",
      Nil,
      "GET",
      """""",
      this.prefix + """wsInterface"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_DashboardController_viewHostGame22_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hostgame")))
  )
  private[this] lazy val controllers_DashboardController_viewHostGame22_invoker = createInvoker(
    controllers.DashboardController.viewHostGame(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "viewHostGame",
      Nil,
      "POST",
      """""",
      this.prefix + """hostgame"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_DashboardController_viewDashboard23_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_DashboardController_viewDashboard23_invoker = createInvoker(
    controllers.DashboardController.viewDashboard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DashboardController",
      "viewDashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_GameController_performStep24_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performstep")))
  )
  private[this] lazy val controllers_GameController_performStep24_invoker = createInvoker(
    controllers.GameController.performStep(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "performStep",
      Nil,
      "POST",
      """""",
      this.prefix + """performstep"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_GameController_getRiskCards25_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riskdashboard")))
  )
  private[this] lazy val controllers_GameController_getRiskCards25_invoker = createInvoker(
    controllers.GameController.getRiskCards(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "getRiskCards",
      Nil,
      "POST",
      """""",
      this.prefix + """riskdashboard"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_GameController_getMitigationSteps26_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("risk")))
  )
  private[this] lazy val controllers_GameController_getMitigationSteps26_invoker = createInvoker(
    controllers.GameController.getMitigationSteps(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "getMitigationSteps",
      Nil,
      "POST",
      """""",
      this.prefix + """risk"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
      }
  
    // @LINE:7
    case controllers_GameController_startGame1_route(params) =>
      call { 
        controllers_GameController_startGame1_invoker.call(controllers.GameController.startGame())
      }
  
    // @LINE:10
    case controllers_Assets_at2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
      }
  
    // @LINE:12
    case controllers_LoginController_login3_route(params) =>
      call { 
        controllers_LoginController_login3_invoker.call(controllers.LoginController.login())
      }
  
    // @LINE:13
    case controllers_LoginController_logout4_route(params) =>
      call { 
        controllers_LoginController_logout4_invoker.call(controllers.LoginController.logout())
      }
  
    // @LINE:15
    case controllers_Application_playerJoin5_route(params) =>
      call { 
        controllers_Application_playerJoin5_invoker.call(controllers.Application.playerJoin())
      }
  
    // @LINE:17
    case controllers_RegisterController_register6_route(params) =>
      call { 
        controllers_RegisterController_register6_invoker.call(controllers.RegisterController.register())
      }
  
    // @LINE:19
    case controllers_GameController_saveImageSnapshot7_route(params) =>
      call { 
        controllers_GameController_saveImageSnapshot7_invoker.call(controllers.GameController.saveImageSnapshot())
      }
  
    // @LINE:21
    case controllers_GameController_hostGame8_route(params) =>
      call { 
        controllers_GameController_hostGame8_invoker.call(controllers.GameController.hostGame())
      }
  
    // @LINE:22
    case controllers_GameController_joinGame9_route(params) =>
      call { 
        controllers_GameController_joinGame9_invoker.call(controllers.GameController.joinGame())
      }
  
    // @LINE:23
    case controllers_GameController_leaveGame10_route(params) =>
      call { 
        controllers_GameController_leaveGame10_invoker.call(controllers.GameController.leaveGame())
      }
  
    // @LINE:24
    case controllers_DashboardController_activeGames11_route(params) =>
      call { 
        controllers_DashboardController_activeGames11_invoker.call(controllers.DashboardController.activeGames())
      }
  
    // @LINE:25
    case controllers_DashboardController_completedGames12_route(params) =>
      call { 
        controllers_DashboardController_completedGames12_invoker.call(controllers.DashboardController.completedGames())
      }
  
    // @LINE:26
    case controllers_DashboardController_joinGame13_route(params) =>
      call { 
        controllers_DashboardController_joinGame13_invoker.call(controllers.DashboardController.joinGame())
      }
  
    // @LINE:27
    case controllers_GameController_observeGame14_route(params) =>
      call { 
        controllers_GameController_observeGame14_invoker.call(controllers.GameController.observeGame())
      }
  
    // @LINE:29
    case controllers_GameController_getSnapshotDetails15_route(params) =>
      call { 
        controllers_GameController_getSnapshotDetails15_invoker.call(controllers.GameController.getSnapshotDetails())
      }
  
    // @LINE:31
    case controllers_GameController_startGame16_route(params) =>
      call { 
        controllers_GameController_startGame16_invoker.call(controllers.GameController.startGame())
      }
  
    // @LINE:33
    case controllers_GameController_getProjectSteps17_route(params) =>
      call { 
        controllers_GameController_getProjectSteps17_invoker.call(controllers.GameController.getProjectSteps())
      }
  
    // @LINE:35
    case controllers_Application_wsJs18_route(params) =>
      call { 
        controllers_Application_wsJs18_invoker.call(controllers.Application.wsJs())
      }
  
    // @LINE:36
    case controllers_Application_hostJs19_route(params) =>
      call { 
        controllers_Application_hostJs19_invoker.call(controllers.Application.hostJs())
      }
  
    // @LINE:37
    case controllers_Application_gameJs20_route(params) =>
      call { 
        controllers_Application_gameJs20_invoker.call(controllers.Application.gameJs())
      }
  
    // @LINE:38
    case controllers_Application_wsInterface21_route(params) =>
      call { 
        controllers_Application_wsInterface21_invoker.call(controllers.Application.wsInterface())
      }
  
    // @LINE:40
    case controllers_DashboardController_viewHostGame22_route(params) =>
      call { 
        controllers_DashboardController_viewHostGame22_invoker.call(controllers.DashboardController.viewHostGame())
      }
  
    // @LINE:41
    case controllers_DashboardController_viewDashboard23_route(params) =>
      call { 
        controllers_DashboardController_viewDashboard23_invoker.call(controllers.DashboardController.viewDashboard())
      }
  
    // @LINE:43
    case controllers_GameController_performStep24_route(params) =>
      call { 
        controllers_GameController_performStep24_invoker.call(controllers.GameController.performStep())
      }
  
    // @LINE:44
    case controllers_GameController_getRiskCards25_route(params) =>
      call { 
        controllers_GameController_getRiskCards25_invoker.call(controllers.GameController.getRiskCards())
      }
  
    // @LINE:45
    case controllers_GameController_getMitigationSteps26_route(params) =>
      call { 
        controllers_GameController_getMitigationSteps26_invoker.call(controllers.GameController.getMitigationSteps())
      }
  }
}