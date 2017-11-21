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
              String query6="DELETE FROM GAME_PLAYER_RISK_STATUS";
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
	}