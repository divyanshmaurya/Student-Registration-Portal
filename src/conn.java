/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anki0
 */
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.*; //used for implementing jdbc.. it have many interface like drive interface,  most imp class driver manager class.


public class conn {
    Connection c;
    Statement s;
    
    public conn(){
        String JdbcURL= "jdbc:mysql://localhost:3308/onlinecourse?useSSL=false";
        String Username= "root";
        String password ="";
        Connection c = null;
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
             c=DriverManager.getConnection(JdbcURL, Username, password);
             System.out.println(" Connection Established");
             s=c.createStatement(); // for executing mysql query..
             
             
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

