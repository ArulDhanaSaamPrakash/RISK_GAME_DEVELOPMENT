
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Arul/Documents/RISK_GAME_DEVELOPMENT/conf/routes
// @DATE:Fri Oct 20 13:05:29 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
