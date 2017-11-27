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

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**z
 * Two reports would be generated in this controller. One is GameStatsReport.xls and the other is RiskVsProblemReport.xls
 */
public class DownloadExcelController extends Controller {

    public static final Logger logger = Logger.getLogger(GameController.class.getName());
    public File GameReport = new File("GameReport.xls");
    public HSSFWorkbook wb = new HSSFWorkbook();
    public HSSFSheet sheet = wb.createSheet("GameReport");
    public HSSFSheet sheetDesc = wb.createSheet("GameDescription");
    public HSSFSheet sheetRiskDesc = wb.createSheet("RiskDescription");
    public int index = 0,indexDesc = 0;
    
    public static Result exportReports(String exportReportInput)
    {
        /* Takes gameid as input and calls the function which would download the report*/
        try{
                  DownloadExcelController dec = new DownloadExcelController();
                  String input=exportReportInput;
                  String filename="GameReport-"+input+".xls";
                  Controller.response().setContentType("application/vnd.ms-excel");
                  Controller.response().setHeader("Content-Disposition","attachment;filename="+filename);
                  dec.downloadExcel(input);
                  dec.downloadExcelForRiskProblem(input);
                  dec.fillRiskInformation();
                  
        }catch (Exception e){
                e.getMessage();
        }
        return ok(new DownloadExcelController().GameReport);
    }
    
    public String downloadExcel(String input){
           
            String strQuery;
            Connection con;
            try {
      
            	    ArrayList<String> players = new ArrayList<String>();
            	    con = DB.getConnection();
            	    Statement st;
                    ResultSet rs;
            	    
            	    HSSFRow rowhead = sheet.createRow((short) index);
                    rowhead.createCell((short) 0).setCellValue("Game Configuration");
                    index++;
            	    rowhead = sheet.createRow((short) index);
                    rowhead.createCell((short) 0).setCellValue("Game_Id");
                    rowhead.createCell((short) 1).setCellValue("Start_Time");
                    rowhead.createCell((short) 2).setCellValue("End_Time");
                    rowhead.createCell((short) 3).setCellValue("Max_Time");
                    rowhead.createCell((short) 4).setCellValue("Steps_For_Each_Player");
                    rowhead.createCell((short) 5).setCellValue("Number_Of_Players");
                    index++;
                    
                    HSSFRow rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Game_Id");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the unique id that represents every game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Start_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the time at which the game has started");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("End_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the time at which the game has ended");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Max_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the duration of the game that was set by the host before starting the game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Steps_For_Each_Player");
                    rowheadDesc.createCell((short) 1).setCellValue("Maximum number of steps that can be played by a player. This would have been set by the host before starting the game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Number_Of_Players");
                    rowheadDesc.createCell((short) 1).setCellValue("Total number of players playing the game");
                    indexDesc++;
                    
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("PlayerId");
                    rowheadDesc.createCell((short) 1).setCellValue("Unique Id for each player in the game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Avg_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("Average amount of time taken per step");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Max_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the maximum amount of time taken for any move for that player in the entire game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Min_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the minumum amount of time taken for any move for that player in the entire game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Total_Time");
                    rowheadDesc.createCell((short) 1).setCellValue("This is the total duration of the time the player has played in the game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Skipped_Turn");
                    rowheadDesc.createCell((short) 1).setCellValue("Total number of skip turns including timeouts");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Timeouts");
                    rowheadDesc.createCell((short) 1).setCellValue("Total number of time outs in the game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Number of moves played");
                    rowheadDesc.createCell((short) 1).setCellValue("Total number of moves made in the game");
                    
                    indexDesc++;
                    
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
                            index=index+2;
                    }
                    
                    rowhead = sheet.createRow((short) index++);
                    rowhead.createCell((short) 0).setCellValue("Game Statistics");
                   
                    rowhead = sheet.createRow((short) index);
                    rowhead.createCell((short) 0).setCellValue("PlayerId");
                    rowhead.createCell((short) 1).setCellValue("Avg_Time (sec)");
                    rowhead.createCell((short) 2).setCellValue("Max_Time (sec)");
                    rowhead.createCell((short) 3).setCellValue("Min_Time (sec)");
                    rowhead.createCell((short) 4).setCellValue("Total_Time (sec)");
                    rowhead.createCell((short) 5).setCellValue("Skipped_Turn");
                    rowhead.createCell((short) 6).setCellValue("Timeouts");
                    rowhead.createCell((short) 7).setCellValue("Number of moves Played");
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
                    
                    /* Database query to get the Number of moves played*/
                    /*strQuery = "select max(turn_no) " +
                    		   "FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT " +
                    		   "WHERE GAME_PLAYER_ID =" +"\"" + players.get(i) + "\" " +
                    		   "and move_type != 'production' ";*/
                    		
                    strQuery = "select "
                               + "case when "
                               + "(SELECT count(*) FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT "
                               + "where GAME_PLAYER_ID =" +"\"" + players.get(i) + "\" " 
                               + "and move_type='production') >0 "
                               + "then max(turn_no)+1 "
                               + "else max(turn_no) "
                               + "end as turns "
                               + "from RISK_GAME_DB.GAME_MOVES_SNAPSHOT "
                               + "where GAME_PLAYER_ID =" +"\"" + players.get(i) + "\" " 
                               + "and move_type!='production';";
                               
                    rs=st.executeQuery(strQuery);
                 
                    /* Retrieve timeouts information*/
                    while (rs.next()) {
                            row.createCell((short) 7).setCellValue(Integer.parseInt(rs.getString(1)));
                    }
            }
                wb.write(GameReport);
                st.close();
                rs.close();
                con.close();
                return "File downloaded successfully";
            }catch (Exception e) {
                  e.printStackTrace();
                 return "File not downloaded successfully";
            }
      }
      
       public String downloadExcelForRiskProblem(String input){
           
            String strQuery;
            Connection con;
            try {
      
            	    ArrayList<String> players = new ArrayList<String>();
            	    con = DB.getConnection();
            	    Statement st;
                    ResultSet rs; 
            	    
                    HSSFRow rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Game_Player_Id");
                    rowheadDesc.createCell((short) 1).setCellValue("Unique Id for each player in the game");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Risk_ID");
                    rowheadDesc.createCell((short) 1).setCellValue("Unique ID of the risk");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Status");
                    rowheadDesc.createCell((short) 1).setCellValue("This represents whether a risk is mitigated or not mitigated");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("Mitigation_Turn_No");
                    rowheadDesc.createCell((short) 1).setCellValue("If the risk is mitigated, this field would let us know at what turn_no of the player, the risk was mitigated");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("OOPS_Generated");
                    rowheadDesc.createCell((short) 1).setCellValue("The total number of OOPS that were generated including and before the OOPS_Generated_Turn_No");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("OOPS_Generated_Turn_No");
                    rowheadDesc.createCell((short) 1).setCellValue("The turn number when the OOPS was generated");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("OOPS_Avoided");
                    rowheadDesc.createCell((short) 1).setCellValue("The total number of OOPS that were avoided including and before the OOPS_Avoided_Turn_No");
                    rowheadDesc = sheetDesc.createRow((short) indexDesc++);
                    rowheadDesc.createCell((short) 0).setCellValue("OOPS_Avoided_Turn_No");
                    rowheadDesc.createCell((short) 1).setCellValue("The turn number when the OOPS was avoided");
                    
                    /* Database query for fetching all the game player id's associated with the gameid*/               
                    strQuery = "SELECT DISTINCT (GAME_PLAYER_ID) FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT "+
                               "WHERE GAME_PLAYER_ID LIKE \"%"+input+"\" ";
                    st=con.createStatement();
                    rs=st.executeQuery(strQuery);
                    
                    HSSFRow row = sheet.createRow((short) ++index);
                    /* Retrive all the game player ids and add it to the players list*/
                    while (rs.next()) {
                    	players.add(rs.getString(1));
                    }
                    
                	for(int i=0;i<players.size();i++,index++){
                    
                    HSSFRow rowhead;
                    rowhead = sheet.createRow((short) index++);
                    rowhead.createCell((short) 0).setCellValue("Player Risks");
                    rowhead = sheet.createRow((short) index++);
                    rowhead.createCell((short) 0).setCellValue("Game_Player_Id");
                    rowhead.createCell((short) 1).setCellValue("Risk_ID");
                    rowhead.createCell((short) 2).setCellValue("Status");
                    rowhead.createCell((short) 3).setCellValue("RiskDescription");
                    
                    strQuery = "SELECT game_player_id,CONFIG_RISK_MAPPING.risk_id, "+
                               "CASE WHEN status=1 THEN \"MITIGATED\" ELSE \"NOT MITIGATED\" END AS STATUS, description "+
                               "FROM RISK_GAME_DB.GAME_PLAYER_RISK_STATUS GAME_PLAYER_RISK_STATUS "+
                               "INNER JOIN RISK_GAME_DB.CONFIG_RISK_MAPPING CONFIG_RISK_MAPPING "+
                               "ON CONFIG_RISK_MAPPING.CONFIG_RISK_MAPPING_id=GAME_PLAYER_RISK_STATUS.risk_id "+
                               "AND game_player_id =" +"\"" + players.get(i) + "\" " +
                               "INNER JOIN RISK_GAME_DB.RISKS RISKS "+
                               "ON RISKS.risk_id=CONFIG_RISK_MAPPING.risk_id "+
                               "order by LENGTH(CONFIG_RISK_MAPPING.risk_id), CONFIG_RISK_MAPPING.risk_id ";
                    
                    rs=st.executeQuery(strQuery);
                 
                    while (rs.next()) {
 
                    	    row = sheet.createRow((short) index);
                    	    row.createCell((short) 0).setCellValue(rs.getString(1));
                            row.createCell((short) 1).setCellValue(rs.getString(2));
                            row.createCell((short) 2).setCellValue(rs.getString(3));
                            row.createCell((short) 3).setCellValue(rs.getString(4));
                            index++;
                    }
                    
                    index++;
                    rowhead = sheet.createRow((short) index++);
                    rowhead.createCell((short) 0).setCellValue("Player Risk Events");
                    rowhead = sheet.createRow((short) index++);
                    rowhead.createCell((short) 0).setCellValue("Game_Player_Id");
                    rowhead.createCell((short) 1).setCellValue("Risk_ID");
                    rowhead.createCell((short) 2).setCellValue("Status");
                    rowhead.createCell((short) 3).setCellValue("Mitigation_Turn_No");
                    rowhead.createCell((short) 4).setCellValue("OOPS_Generated");
                    rowhead.createCell((short) 5).setCellValue("OOPS_Generated_Turn_No");
                    rowhead.createCell((short) 6).setCellValue("OOPS_Avoided");
                    rowhead.createCell((short) 7).setCellValue("OOPS_Avoided_Turn_No");
                    
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
                               "from RISK_GAME_DB.GAME_PLAYER_RISK_STATUS GAME_PLAYER_RISK_STATUS "+
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
                               "from RISK_GAME_DB.GAME_PLAYER_RISK_STATUS GAME_PLAYER_RISK_STATUS "+
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
                            index=index+2;
                    }
                   
            }       
                    wb.write(GameReport);
                    st.close();
                    rs.close();
                    con.close();
                    return "File downloaded successfully";
            }catch (Exception e) {
                  e.printStackTrace();
                 return "File not downloaded successfully";
            }
      }
      
      public String fillRiskInformation(){
           
            String strQuery;
            Connection con;
            int indexRisk=1;
            try {
      
            	con = DB.getConnection();
            	Statement st;
                ResultSet rs;
            	    
            	HSSFRow rowhead = sheetRiskDesc.createRow((short) 0);
                rowhead.createCell((short) 0).setCellValue("RiskId");
                rowhead.createCell((short) 1).setCellValue("RiskDescription");
                rowhead.createCell((short) 2).setCellValue("Budget");
                rowhead.createCell((short) 3).setCellValue("Personnel");
                    
                /* Database query for fetching risk related information */
                strQuery="select * from RISK_GAME_DB.RISKS order by LENGTH(risk_id), risk_id";
                             
                st=con.createStatement();
                rs=st.executeQuery(strQuery);
                    
                /* Retrive the data related to RISKS*/
                HSSFRow row;
                while (rs.next()) {
                    	row = sheetRiskDesc.createRow((short) indexRisk);
                    	row.createCell((short) 0).setCellValue(rs.getString(1));
                        row.createCell((short) 1).setCellValue(rs.getString(2));
                        row.createCell((short) 2).setCellValue(rs.getString(3));
                        row.createCell((short) 3).setCellValue(rs.getString(4));
                        indexRisk++;
                }
                wb.write(GameReport);
                st.close();
                rs.close();
                // con.close();
                wb.close();
                return "File downloaded successfully";
            }catch (Exception e) {
                  e.printStackTrace();
                 return "File not downloaded successfully";
            }
      }
      
}