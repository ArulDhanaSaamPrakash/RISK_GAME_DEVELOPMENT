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
import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Two reports would be generated in this controller. One is GameStatsReport.xls and the other is RiskVsProblemReport.xls
 */
public class DownloadExcelController extends Controller {

    public static final Logger logger = Logger.getLogger(GameController.class.getName());
    public static File GameStatsReport = new File("GameStatsReport.xls");
    public static File RiskVsProblemReport = new File("RiskVsProblemReport.xls");
    
    public static Result exportReports(String exportReportInput)
    {
        /* Takes gameid as input and calls the function which would download the report*/
        try{
                  String input=exportReportInput;
                  Controller.response().setContentType("application/vnd.ms-excel");
                  Controller.response().setHeader("Content-Disposition","attachment;filename=GameStatsReport.xls");
                  downloadExcel(input);
        }catch (Exception e){
                e.getMessage();
        }
        return ok(GameStatsReport);
    }
    
    public static String downloadExcel(String input){
           
            String strQuery;
            Connection con;
            try {
      
            	    ArrayList<String> players = new ArrayList<String>();
            	    con = DB.getConnection();
            	    Statement st;
                    ResultSet rs;
            	    int index = 1;
            	    
                    HSSFWorkbook wb = new HSSFWorkbook();
                    HSSFSheet sheet = wb.createSheet("GameStatsReport");
                    HSSFRow rowhead = sheet.createRow((short) 0);
                    rowhead.createCell((short) 0).setCellValue("Game_Id");
                    rowhead.createCell((short) 1).setCellValue("Start_Time");
                    rowhead.createCell((short) 2).setCellValue("End_Time");
                    rowhead.createCell((short) 3).setCellValue("Max_Time");
                    rowhead.createCell((short) 4).setCellValue("Steps_For_Each_Player");
                    rowhead.createCell((short) 5).setCellValue("Number_Of_Players");
                    
                    /* Database query for fetching the game configurations */
                    strQuery="SELECT GAME.game_id,GAME.start_time,max(turn_end_time) as end_time, "+
                             "time_for_each_move*60 AS max_time,steps_for_each_player, "+
                             "count(distinct game_player_id) num_of_players "+
                             "FROM RISK_GAME_DB.GAME GAME INNER JOIN RISK_GAME_DB.GAME_STATS_V GAME_STATS_V "+
                             "on GAME.GAME_ID LIKE \"%"+input+"\" "+
                             " and GAME.GAME_ID=GAME_STATS_V.GAME_ID "+
                             "GROUP BY 1,2,time_for_each_move,4";
                             
                    st=con.createStatement();
                    rs=st.executeQuery(strQuery);
                    
                    /* Retrive the data related to Game configuration*/
                    HSSFRow row = sheet.createRow((short) index);
                    while (rs.next()) {
                    	    row.createCell((short) 0).setCellValue(rs.getString(1));
                            row.createCell((short) 1).setCellValue(rs.getString(2));
                            row.createCell((short) 2).setCellValue(rs.getString(3));
                            row.createCell((short) 3).setCellValue(rs.getString(4));
                            row.createCell((short) 4).setCellValue(rs.getString(5));
                            row.createCell((short) 5).setCellValue(rs.getString(6));
                            index=index+3;
                    }
                    
                    rowhead = sheet.createRow((short) index);
                    rowhead.createCell((short) 0).setCellValue("PlayerId");
                    rowhead.createCell((short) 1).setCellValue("Avg_Time");
                    rowhead.createCell((short) 2).setCellValue("Max_Time");
                    rowhead.createCell((short) 3).setCellValue("Min_Time");
                    rowhead.createCell((short) 4).setCellValue("Total_Time");
                    rowhead.createCell((short) 5).setCellValue("Skipped_Turn");
                    rowhead.createCell((short) 6).setCellValue("Timeouts");
                    index++;
                    
                    /* Database query for fetching all the game player id's associated with the gameid*/               
                    strQuery = "SELECT DISTINCT (GAME_PLAYER_ID) FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT " + 
                               "WHERE GAME_PLAYER_ID LIKE \"%"+input+"\" ";
                    
                    rs=st.executeQuery(strQuery);
               
                    /* Retrive all the game player ids and add it to the players list*/
                    while (rs.next()) {
                    	players.add(rs.getString(1));
                    }
                    
                    for(int i=0;i<players.size();i++){
                	   
                	/* Database query to get all the metrics like average, minimum, maximum, total time and skip turns*/
                    strQuery = "SELECT " +
                    		   "avg (TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as avg_time " +
                    		   ",max(TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as max_time " +
                    		   ",min(TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as min_time " +
                    		   ",sum(TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as total_time " +
                    		   ",sum(skip_turn_status) as skipped_turn " + 
                    		   "FROM RISK_GAME_DB.GAME_STATS_V GAME_STATS_V " +
                    		   "WHERE GAME_PLAYER_ID like \"%" + players.get(i) + "\"";
                    		
                    rs=st.executeQuery(strQuery);
                 
                    /* Retrieve all the metrics like average, minimum, maximum, total time and skip turns*/
                    row = sheet.createRow((short) index);
                    while (rs.next()) {
                    	    row.createCell((short) 0).setCellValue(players.get(i));
                            row.createCell((short) 1).setCellValue(rs.getString(1));
                            row.createCell((short) 2).setCellValue(rs.getString(2));
                            row.createCell((short) 3).setCellValue(rs.getString(3));
                            row.createCell((short) 4).setCellValue(rs.getString(4));
                            row.createCell((short) 5).setCellValue(rs.getString(5));
                            index++;
                    }
                    
                    /* Database query to get the timeouts*/
                    strQuery = "SELECT COUNT(*) AS TIMEOUTS " +
                    		   "FROM RISK_GAME_DB.GAME_STATS_V V1 " +
                    		   "INNER JOIN RISK_GAME_DB.GAME AS GAME ON GAME.GAME_ID=V1.GAME_ID " +
                    		   "WHERE TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)>GAME.TIME_FOR_EACH_MOVE*60-2 " +
                    		   "AND GAME_PLAYER_ID like \"%" + players.get(i) + "\"";
                    		
                    rs=st.executeQuery(strQuery);
                 
                    /* Retrieve timeouts information*/
                    while (rs.next()) {
                            row.createCell((short) 6).setCellValue(rs.getString(1));
                    }
            }
                wb.write(DownloadExcelController.GameStatsReport);
                wb.close();
                return "File downloaded successfully";
            }catch (Exception e) {
                  e.printStackTrace();
                 return "File not downloaded successfully";
            }
      }
      
      public static Result exportRiskProblemReport(String exportRiskProblemReport)
      {
            /* Takes gameid as input and calls the function which would download the report*/
            try{
                  String input=exportRiskProblemReport;
                  Controller.response().setContentType("application/vnd.ms-excel");
                  Controller.response().setHeader("Content-Disposition","attachment;filename=RiskVsProblemReport.xls");
                  downloadExcelForRiskProblem(input);
            }catch (Exception e){
                  e.getMessage();
            }
          return ok(RiskVsProblemReport);
       }
       
       public static String downloadExcelForRiskProblem(String input){
           
            String strQuery;
            Connection con;
            try {
      
            	    ArrayList<String> players = new ArrayList<String>();
            	    con = DB.getConnection();
            	    Statement st;
                    ResultSet rs;
            	    int index = 1;
            	    
                    HSSFWorkbook wb = new HSSFWorkbook();
                    HSSFSheet sheet = wb.createSheet("RiskVsProblemReport");
                    HSSFRow rowhead = sheet.createRow((short) 0);
                    rowhead.createCell((short) 0).setCellValue("Game_Id");
                    rowhead.createCell((short) 1).setCellValue("Start_Time");
                    rowhead.createCell((short) 2).setCellValue("End_Time");
                    rowhead.createCell((short) 3).setCellValue("Max_Time");
                    rowhead.createCell((short) 4).setCellValue("Steps_For_Each_Player");
                    rowhead.createCell((short) 5).setCellValue("Number_Of_Players");
                    
                    /* Database query for fetching the game configurations */
                    strQuery="SELECT GAME.game_id,GAME.start_time,max(turn_end_time) as end_time, "+
                             "time_for_each_move*60 AS max_time,steps_for_each_player, "+
                             "count(distinct game_player_id) num_of_players "+
                             "FROM RISK_GAME_DB.GAME GAME INNER JOIN RISK_GAME_DB.GAME_STATS_V GAME_STATS_V "+
                             "on GAME.GAME_ID LIKE \"%"+input+"\" "+
                             " and GAME.GAME_ID=GAME_STATS_V.GAME_ID "+
                             "GROUP BY 1,2,time_for_each_move,4";
                             
                    st=con.createStatement();
                    rs=st.executeQuery(strQuery);
                    
                    /* Retrive the data related to Game configuration*/
                    HSSFRow row = sheet.createRow((short) index);
                    while (rs.next()) {
                    	    row.createCell((short) 0).setCellValue(rs.getString(1));
                            row.createCell((short) 1).setCellValue(rs.getString(2));
                            row.createCell((short) 2).setCellValue(rs.getString(3));
                            row.createCell((short) 3).setCellValue(rs.getString(4));
                            row.createCell((short) 4).setCellValue(rs.getString(5));
                            row.createCell((short) 5).setCellValue(rs.getString(6));
                            index=index+3;
                    }
                    /* Database query for fetching all the game player id's associated with the gameid*/               
                    strQuery = "SELECT DISTINCT (GAME_PLAYER_ID) FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT "+
                               "WHERE GAME_PLAYER_ID LIKE \"%"+input+"\" ";
                    rs=st.executeQuery(strQuery);
                    
                    /* Retrive all the game player ids and add it to the players list*/
                    while (rs.next()) {
                    	players.add(rs.getString(1));
                    }
                    
                	/* Setting the headings for the report*/
                    rowhead = sheet.createRow((short) index);
                    rowhead.createCell((short) 0).setCellValue("Game_Player_Id");
                    rowhead.createCell((short) 1).setCellValue("Risk_ID");
                    rowhead.createCell((short) 2).setCellValue("Status");
                    rowhead.createCell((short) 3).setCellValue("Mitigation_Turn_No");
                    rowhead.createCell((short) 4).setCellValue("OOPS_Generated");
                    rowhead.createCell((short) 5).setCellValue("OOPS_Generated_Turn_No");
                    rowhead.createCell((short) 6).setCellValue("OOPS_Avoided");
                    rowhead.createCell((short) 7).setCellValue("OOPS_Avoided_Turn_No");
                    index++;
                    
                    for(int i=0;i<players.size();i++){
                	
                	/* Database query to retrieve the results of risk vs problem*/
                    strQuery = "SELECT  GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID,CONFIG_RISK_MAPPING.risk_id, "+
                               "CASE "+
                               "WHEN RISK_MITIGATION_TURN.MITIGATION_TURN_NO< GAME_MOVES_SNAPSHOT.TURN_NO THEN \"MITIGATED\" "+
                               "ELSE \"NOT MITIGATED\" END AS STATUS, "+
                               "NULL AS 'MITIGATION TURN NO',"+
                               "(select count(turn_no) from RISK_GAME_DB.GAME_MOVES_SNAPSHOT temp "+
                               "LEFT JOIN RISK_GAME_DB.AVOIDED_RISKS AVOIDED_RISKS "+
                               "ON  AVOIDED_RISKS.game_player_id=temp.game_player_id "+
                               "AND AVOIDED_RISKS.tur_no!=temp.turn_no "+
                               "WHERE temp.GAME_PLAYER_ID= GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID "+
                               "and GAME_MOVES_SNAPSHOT.turn_no>= temp.turn_no "+
                               "AND MOVE_TYPE='OOPS' "+
                               ") as 'OOPS GENERATED',"+
                               "GAME_MOVES_SNAPSHOT.turn_no as 'OOPS GENERATED TURN NO', "+
                               "null AS 'OOPS AVOIDED', "+
                               "null AS 'OOPS AVOIDED TURN NO' "+
                               "from risk_game_db.GAME_PLAYER_RISK_STATUS GAME_PLAYER_RISK_STATUS "+
                               "INNER JOIN RISK_GAME_DB.CONFIG_RISK_MAPPING CONFIG_RISK_MAPPING "+
                               "ON CONFIG_RISK_MAPPING.CONFIG_RISK_MAPPING_ID= GAME_PLAYER_RISK_STATUS.RISK_ID "+
                               "AND GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID =" +"\"" + players.get(i) + "\" " +
                               "INNER JOIN RISK_GAME_DB.GAME_MOVES_SNAPSHOT GAME_MOVES_SNAPSHOT "+
                               "ON GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID=GAME_MOVES_SNAPSHOT.game_player_id "+
                               "AND MOVE_TYPE='OOPS' "+
                               "INNER JOIN RISK_GAME_DB.RISK_OOPS_MAPPING RISK_OOPS_MAPPING "+
                               "ON RISK_OOPS_MAPPING.OOPS_ID = GAME_MOVES_SNAPSHOT.OOPS_ID "+
                               "AND RISK_OOPS_MAPPING.risk_id=CONFIG_RISK_MAPPING.RISK_ID "+
                               "LEFT OUTER JOIN RISK_GAME_DB.AVOIDED_RISKS AVOIDED_RISKS "+
                               "ON  GAME_MOVES_SNAPSHOT.game_player_id=AVOIDED_RISKS.game_player_id "+
                               "AND AVOIDED_RISKS.tur_no!=GAME_MOVES_SNAPSHOT.turn_no "+
                               "LEFT OUTER JOIN RISK_GAME_DB.RISK_MITIGATION_TURN RISK_MITIGATION_TURN "+
                               "ON GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID=RISK_MITIGATION_TURN.GAME_PLAYER_ID "+
                               "AND RISK_OOPS_MAPPING.risk_id=RISK_MITIGATION_TURN.risk_id "+
                               "UNION "+
                               "SELECT  GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID,CONFIG_RISK_MAPPING.risk_id, "+
                               "CASE "+
                               "WHEN RISK_MITIGATION_TURN.MITIGATION_TURN_NO< GAME_MOVES_SNAPSHOT.TURN_NO THEN \"MITIGATED\" "+
                               "ELSE \"NOT MITIGATED\" END AS STATUS, "+
                               "NULL AS 'MITIGATION TURN NO',"+
                               "null AS 'OOPS GENERATED', "+
                               "null AS 'OOPS GENERATED TURN NO', "+
                               "(select count(tur_no) from RISK_GAME_DB.AVOIDED_RISKS temp "+
                               "where temp.GAME_PLAYER_ID= GAME_MOVES_SNAPSHOT.GAME_PLAYER_ID "+
                               "and GAME_MOVES_SNAPSHOT.turn_no>= temp.tur_no ) as 'OOPS AVOIDED', "+
                               "AVOIDED_RISKS.tur_no AS 'OOPS AVOIDED TURN NO' "+
                               "from risk_game_db.GAME_PLAYER_RISK_STATUS GAME_PLAYER_RISK_STATUS "+
                               "INNER JOIN RISK_GAME_DB.CONFIG_RISK_MAPPING CONFIG_RISK_MAPPING "+
                               "ON CONFIG_RISK_MAPPING.CONFIG_RISK_MAPPING_ID= GAME_PLAYER_RISK_STATUS.RISK_ID "+
                               "AND GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID =" +"\"" + players.get(i) + "\" " +
                               "INNER JOIN RISK_GAME_DB.GAME_MOVES_SNAPSHOT GAME_MOVES_SNAPSHOT "+
                               "ON GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID=GAME_MOVES_SNAPSHOT.game_player_id "+
                               "AND MOVE_TYPE='OOPS' "+
                               "INNER JOIN RISK_GAME_DB.RISK_OOPS_MAPPING RISK_OOPS_MAPPING "+
                               "ON RISK_OOPS_MAPPING.OOPS_ID = GAME_MOVES_SNAPSHOT.OOPS_ID "+
                               "AND RISK_OOPS_MAPPING.risk_id=CONFIG_RISK_MAPPING.RISK_ID "+
                               "INNER JOIN RISK_GAME_DB.AVOIDED_RISKS AVOIDED_RISKS "+
                               "ON AVOIDED_RISKS.oops_id=GAME_MOVES_SNAPSHOT.oops_id "+
                               "and AVOIDED_RISKS.game_player_id=GAME_MOVES_SNAPSHOT.game_player_id "+
                               "and AVOIDED_RISKS.tur_no=GAME_MOVES_SNAPSHOT.turn_no "+
                               "LEFT OUTER JOIN RISK_GAME_DB.RISK_MITIGATION_TURN RISK_MITIGATION_TURN "+
                               "ON GAME_PLAYER_RISK_STATUS.GAME_PLAYER_ID=RISK_MITIGATION_TURN.GAME_PLAYER_ID "+
                               "AND RISK_OOPS_MAPPING.risk_id=RISK_MITIGATION_TURN.risk_id "+
                               "UNION "+
                               "SELECT  GAME_PLAYER_ID,risk_id,\"MITIGATED\" AS STATUS,MITIGATION_TURN_NO,null as 'OOPS GENERATED',"+
                               "null as 'OOPS GENERATED TURN NO',null AS 'OOPS AVOIDED',null AS 'OOPS AVOIDED TURN NO' "+
                               "from RISK_GAME_DB.RISK_MITIGATION_TURN "+
                               "WHERE GAME_PLAYER_ID =" +"\"" + players.get(i) + "\" ";
                    		
                   rs=st.executeQuery(strQuery);
                 
                    /* Retrieve all the metrics like Mitigation_Turn_No,OOPS_Generated.OOPS_Generated_Turn_No,OOPS_Avoided, OOPS_Avoided_Turn_No */
                    while (rs.next()) {

                    	    row = sheet.createRow((short) index);
                    	    row.createCell((short) 0).setCellValue(rs.getString(1));
                            row.createCell((short) 1).setCellValue(rs.getString(2));
                            row.createCell((short) 2).setCellValue(rs.getString(3));
                            row.createCell((short) 3).setCellValue(rs.getString(4));
                            row.createCell((short) 4).setCellValue(rs.getString(5));
                            row.createCell((short) 5).setCellValue(rs.getString(6));
                            row.createCell((short) 6).setCellValue(rs.getString(7));
                            row.createCell((short) 7).setCellValue(rs.getString(8));
                            index++;
                    }
                    
                    st.close();
                    rs.close();
                    
            }       
                    wb.write(DownloadExcelController.RiskVsProblemReport);
                    wb.close();
                    return "File downloaded successfully";
            }catch (Exception e) {
                  e.printStackTrace();
                 return "File not downloaded successfully";
            }
      }
}