package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import play.db.DB;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import static play.mvc.Http.Context.Implicit.request;
import static play.mvc.Http.Context.Implicit.session;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;


import utility.Constants;
import utility.GameUtility;
import views.html.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.Play;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utility.Constants;
import utility.GameUtility;
import utility.StartGameUtility;
import play.db.DB;
import java.sql.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by srijithkarippure on 9/25/16.
 */


public class LoginController extends Controller{

    public static final Logger logger = Logger.getLogger(LoginController.class.getName());

    /**
     * Method called when login route is hit
     * Creates a user session and returns a cookie as part of response
     * @return
     */
    @BodyParser.Of(BodyParser.Json.class)
    public static Result login(){

        JsonNode data = request().body().asJson();
        String userName = data.get(Constants.USERNAME).asText();
        String password = data.get("password").asText();
        if (session().isEmpty() ) {


            Connection conn = DB.getConnection();
            PreparedStatement stmt = null;
            try {
                String query = "SELECT first_name,isAdmin from USERS where player_id = ? and password = ?";
                stmt = conn.prepareStatement(query);
                stmt.setString(1, userName);
                stmt.setString(2, password);

                ResultSet rs = stmt.executeQuery();


                while (rs.next()) {
                    logger.log(Level.FINE, "Creating session");
                    session().put("firstname",rs.getString("first_name"));
                    if(rs.getBoolean("isAdmin")){
                        session().put("admin","true");
                    }
                    session().put("username",userName);

                    //change -- to main dashboard page
                    return ok("success");
                }
                 return ok("Credentials wrong");
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Exception while login :" + e);
            }
            finally {
                GameUtility.cleanUp(stmt,conn);
            }

        }
        else {
            String value = session().get(Constants.USERNAME);
            if(value.equalsIgnoreCase(userName)) {
                logger.log(Level.FINE, "User already logged in");
                return ok("success");
            }
        }

            return ok("Contact System Admin");

        }


    /**
     * Method called when logout route is hit
     * @return
     */
    public static Result logout(){

        if(session().isEmpty()){
            logger.log(Level.FINE, "Please login to use this logout function");
            return badRequest("You are not logged in to perform this action");
        }
        else{
            session().clear();
            logger.log(Level.FINE, "Username:" + session().get(Constants.USERNAME));
            logger.log(Level.FINE, "Successfully logged out");
            return ok(views.html.index.render());
        }
    }

/**
     * Method called when speciallogout route is hit
     * @return
     */
 @BodyParser.Of(BodyParser.Json.class)
    public static Result speciallogout(){
JsonNode data = request().body().asJson();
        if(session().isEmpty()){
            logger.log(Level.FINE, "Please login to use this logout function");
            return badRequest("You are not logged in to perform this action");
        }
        else{
           
        Connection conn = null;
        PreparedStatement checkStmt = null;
        Statement stmt = null;
        String game_ID =data.get("gameID").asText();
        try {
              conn = DB.getConnection();
              conn.setAutoCommit(false);
              String  query = "DELETE FROM RISK_GAME_DB.GAME WHERE game_id='"+game_ID+"'";
               String  query1 = "DELETE FROM RISK_GAME_DB.GAME_PLAYER WHERE game_id='"+game_ID+"'";
              stmt=conn.createStatement();
              stmt.addBatch(query1);
              stmt.addBatch(query);
              
              stmt.executeBatch(); // Returns 1 if successfully inserted
              conn.commit();
              System.out.println("I am here ");

              logger.log(Level.FINE, "Username:" + session().get(Constants.USERNAME));
            logger.log(Level.FINE, "Successfully logged out");
              return ok("sucess");
        }
        catch(Exception e){
            logger.log(Level.SEVERE,"Error while DELETING DATA FROM DATABASE:"  +  e);
            return ok(views.html.index.render()); //Even during Failure We go out. 
        }
        finally {
            if(stmt!=null)
                try {
                    stmt.close();
                    conn.close();
                } catch (SQLException e) {
                    logger.log(Level.SEVERE, "Error while closing stmt" + e);
                }
        }

        }
    }



    /**
     * Used for testing purpose.
     * @return
     */
    @BodyParser.Of(BodyParser.Json.class)
    public static Result testMethod1()
    {
        String node = request().body().asJson().get("firstname").toString();
        return ok(node);
    }

    }





