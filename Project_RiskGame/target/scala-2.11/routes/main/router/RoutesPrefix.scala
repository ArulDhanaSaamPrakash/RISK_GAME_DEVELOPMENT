
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dineshp/Desktop/Project/RISK_GAME_DEVELOPMENT/Project_RiskGame/conf/routes
// @DATE:Fri Jul 28 11:04:11 EDT 2017


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
