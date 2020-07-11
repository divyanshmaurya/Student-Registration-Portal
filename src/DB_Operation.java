/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankita
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class DB_Operation {
   
    
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    
    public Connection getConnection()
    {
        try{
            String url = "jdbc:mysql://localhost:3308/onlinecourse?useSSL=false";
            String user= "root";
            String pass="";
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("COnnected");
            conn=DriverManager.getConnection(url,user,pass);
            System.out.println("COnnected");
        }catch(SQLException ex){
            System.out.println("Exception1  "+ex.getMessage());
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Exception2  "+ex.getMessage());
        }
        finally
        {
            return conn;
        }
    }
    
//    private void btnConnectorActionPermormed(java.awt.event.ActionEvent evt)
//    {
//        Connection conn= getConnection();
//        
//    }
    
    public ResultSet searchQuery(String sql)
    {
       
        try
        {
            getConnection();
            st=conn.createStatement();
            rs=st.executeQuery(sql);
        }
        catch(SQLException ex)
        {
            System.out.println("Exception"+ex.getMessage());
        }
                
        return rs;
    }
    
}

 