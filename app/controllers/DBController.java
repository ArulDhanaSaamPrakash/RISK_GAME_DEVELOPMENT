package controllers;

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

public class DBController extends Controller {


public static final Logger logger = Logger.getLogger(DBController.class.getName());
  @BodyParser.Of(BodyParser.Json.class)
    public static Result DeleteAllGameData(){
        Connection conn = null;
        PreparedStatement checkStmt = null;
        Statement stmt = null;
        try {
              conn = DB.getConnection();
         	  conn.setAutoCommit(false);
 			  String  query = "DELETE FROM AVOIDED_RISKS";
              String query1="DELETE FROM GAME_MOVES_SNAPSHOT";
              String query2="DELETE FROM GAME_ORDERING";
              String query3="DELETE FROM GAME_PLAYER";
              String query4="DELETE FROM GAME";
              String query5="DELETE FROM GAME_PLAYER_RISK_STATUS";
              String query6="DELETE FROM GAME_PLAYER_PROJECT_STEP_STATUS";
	  		  stmt=conn.createStatement();
              stmt.addBatch(query1);
              stmt.addBatch(query2);
              stmt.addBatch(query3);
              stmt.addBatch(query4);
              stmt.addBatch(query5);
              stmt.addBatch(query6);
             // stmt.addBatch(query7);
              stmt.executeBatch(); // Returns 1 if successfully inserted
              conn.commit();
              System.out.println("I am here ");
              return ok("success");// : ok("Failure");
        }
        catch(Exception e){
            logger.log(Level.SEVERE,"Error while DELETING DATA FROM DATABASE:"  +  e);
            return ok("Failure");
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

@BodyParser.Of(BodyParser.Json.class)
    public static Result DeleteSingleGameData(){
    	       JsonNode data = request().body().asJson();
        String gameID = data.get("game_ID").asText();
        Connection conn = null;
        PreparedStatement checkStmt = null;
        Statement stmt = null;
          ResultSet rs;
        try {
              conn = DB.getConnection();

         	  conn.setAutoCommit(false);
         	   stmt=conn.createStatement();
         	   String strquerry="select *from GAME where game_id=\""+gameID+"\"";
         	       rs=stmt.executeQuery(strquerry);
         	       boolean flag=false;
         	       if (!rs.next()){
         	       	flag=true;
					}
         	  if(flag)
         	  {
  				return ok("GAME_ID NOT PRESENT");
         	  }else
         	  {
         	  	String  query = "delete from RISK_GAME_DB.AVOIDED_RISKS where game_player_id like \"%"+gameID+"\"";
              String query1="delete FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT where game_player_id like \"%"+gameID+"\"";
              String query2="delete from RISK_GAME_DB.GAME_ORDERING where game_id=\""+gameID+"\"";
              
              String query3="DELETE FROM GAME_PLAYER_PROJECT_STEP_STATUS where game_player_id like \"%"+gameID+"\"";
              String query4="DELETE FROM GAME_PLAYER_RISK_STATUS where game_player_id like \"%"+gameID+"\"";
              String query5="delete from RISK_GAME_DB.GAME_PLAYER where game_id=\""+gameID+"\"";
              String query6="delete from RISK_GAME_DB.GAME where game_id=\""+gameID+"\"";
	  		 
              stmt.addBatch(query1);
              stmt.addBatch(query2);
              stmt.addBatch(query3);
              stmt.addBatch(query4);
              stmt.addBatch(query5);
              stmt.addBatch(query6);
             // stmt.addBatch(query7);
              stmt.executeBatch(); // Returns 1 if successfully inserted
              conn.commit();
              
              return ok("success");// : ok("Failure");
         	  }
 			  
        }
        catch(Exception e){
            logger.log(Level.SEVERE,"Error while DELETING DATA FROM DATABASE:"  +  e);
            return ok("Failure");
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