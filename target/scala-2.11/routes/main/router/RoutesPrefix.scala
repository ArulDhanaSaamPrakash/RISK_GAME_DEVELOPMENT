
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/nivas/IdeaProjects/Project_RiskGame/conf/routes
// @DATE:Sat Dec 03 19:23:55 EST 2016


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
