
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Arul/Downloads/Project_RiskGame/conf/routes
// @DATE:Thu Jul 06 14:56:01 EDT 2017


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
