
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Arul/Documents/RISK_GAME_DEVELOPMENT/Project_RiskGame/conf/routes
// @DATE:Fri Jul 28 15:10:15 EDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRegisterController RegisterController = new controllers.ReverseRegisterController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGameController GameController = new controllers.ReverseGameController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDashboardController DashboardController = new controllers.ReverseDashboardController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRegisterController RegisterController = new controllers.javascript.ReverseRegisterController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGameController GameController = new controllers.javascript.ReverseGameController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDashboardController DashboardController = new controllers.javascript.ReverseDashboardController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
