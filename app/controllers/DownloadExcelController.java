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
 * All game related routes implemented in this class
 */
public class DownloadExcelController extends Controller {

    public static final Logger logger = Logger.getLogger(GameController.class.getName());
    public static File data = new File("Data.xls");
    
    public static Result exportReports()
    {
        try
            {
                  Controller.response().setContentType("application/vnd.ms-excel");
                  Controller.response().setHeader("Content-Disposition","attachment;filename=Data.xls");
                  //downloadExcel(out);
            }catch (Exception e)
            {
                  e.getMessage();
            }
           //return ok(new java.io.File("Data.xls"));
         //return Ok.sendFile(new File("abc.csv"), inline=true).withHeaders(CACHE_CONTROL->"max-age=3600",CONTENT_DISPOSITION->"attachment; filename=abc.csv", CONTENT_TYPE->"application/x-download");
         //return ok(downloadExcel(new java.io.File("Data.xls")));
         return ok(data);
    }
    
    public static String downloadExcel(){
           
            String strQuery = null;
            Connection con = null;
            try {
      
            	  ArrayList<String> players = new ArrayList<String>();
            	  System.out.println("Before connection");
            	  con = DB.getConnection();
                  //Class.forName("com.mysql.jdbc.Driver");
                  //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/risk_game_db","root","root");
                  System.out.println("After connection");
                  
                  /* Database Query */               
                  strQuery = "SELECT DISTINCT (GAME_PLAYER_ID) FROM RISK_GAME_DB.GAME_MOVES_SNAPSHOT WHERE GAME_PLAYER_ID LIKE \"%631551\" ";
                  System.out.println(strQuery);
                  Statement st=con.createStatement();
                  ResultSet rs=st.executeQuery(strQuery);
               
                	
                    HSSFWorkbook wb = new HSSFWorkbook();
                    HSSFSheet sheet = wb.createSheet("Game Report");
                    HSSFRow rowhead = sheet.createRow((short) 0);
                    rowhead.createCell((short) 0).setCellValue("PlayerId");
                    rowhead.createCell((short) 1).setCellValue("Avg_Time");
                    rowhead.createCell((short) 2).setCellValue("Max_Time");
                    rowhead.createCell((short) 3).setCellValue("Min_Time");
                    rowhead.createCell((short) 4).setCellValue("Total_Time");
                    rowhead.createCell((short) 5).setCellValue("Skipped_Turn");
                    rowhead.createCell((short) 6).setCellValue("Timeouts");

                    int index = 1;
                    while (rs.next()) {
                    	players.add(rs.getString(1));
                    }
                    
                    st.close();
                    rs.close();
                    System.out.println(players);
                    
                   for(int i=0;i<players.size();i++){
                	   
                    strQuery = "SELECT " +
                    		   "avg (TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as avg_time " +
                    		   ",max(TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as max_time " +
                    		   ",min(TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as min_time " +
                    		   ",sum(TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)) as total_time " +
                    		   ",sum(skip_turn_status) as skipped_turn " + 
                    		   "FROM RISK_GAME_DB.GAME_STATS_V GAME_STATS_V " +
                    		   "WHERE GAME_PLAYER_ID like \"%" + players.get(i) + "\"";
                    		
                    System.out.println(strQuery);
                    st=con.createStatement();
                    rs=st.executeQuery(strQuery);
                 
                    HSSFRow row = sheet.createRow((short) index);
                    while (rs.next()) {

                    	    row.createCell((short) 0).setCellValue(players.get(i));
                            row.createCell((short) 1).setCellValue(rs.getString(1));
                            row.createCell((short) 2).setCellValue(rs.getString(2));
                            row.createCell((short) 3).setCellValue(rs.getString(3));
                            row.createCell((short) 4).setCellValue(rs.getString(4));
                            row.createCell((short) 5).setCellValue(rs.getString(5));
                            
                            System.out.println(rs.getString(1));
                            System.out.println(rs.getString(2));
                            System.out.println(rs.getString(3));
                            System.out.println(rs.getString(4));
                            System.out.println(rs.getString(5));
                            index++;
                    }
                    
                    st.close();
                    rs.close();
                    
                    strQuery = "SELECT COUNT(*) AS TIMEOUTS " +
                    		   "FROM RISK_GAME_DB.GAME_STATS_V V1 " +
                    		   "INNER JOIN RISK_GAME_DB.GAME AS GAME ON GAME.GAME_ID=V1.GAME_ID " +
                    		   "WHERE TIMESTAMPDIFF(SECOND , turn_start_time,turn_end_time)>GAME.TIME_FOR_EACH_MOVE*60-2 " +
                    		   "AND GAME_PLAYER_ID like \"%" + players.get(i) + "\"";
                    		
                    System.out.println(strQuery);
                    st=con.createStatement();
                    rs=st.executeQuery(strQuery);
                 
                   
                    while (rs.next()) {

                            row.createCell((short) 6).setCellValue(rs.getString(1));
                            System.out.println(rs.getString(1));
                            index++;
                    }
                    
            }
                    
                    wb.write(DownloadExcelController.data);
                    wb.close();
                    return "File downloaded successfully";
            }
            catch (Exception e) {
                  e.printStackTrace();
                 return "File not downloaded successfully";
            }
      }
}