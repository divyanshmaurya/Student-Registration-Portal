
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anki0
 */
public class databaseConnection {
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3308/student?useSSL=false";
    
    final static String USER= "root";
    final static String PASS = "";
    
    public static Connection connection()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.print("connected");
            return conn;
        }
        catch(Exception e)
        {
            System.out.print(e);
            return null;
        }
        
    }
           
}
