/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Nikhil
 */
public class DatabaseManager {
    private static final String dburl = "jdbc:mysql://localhost:3306/royal recipes";
    private static final String dbname="root";
    private static final String dbpassword="";
    private static final String dbdriver="com.mysql.jdbc.Driver";
            
            
    public static ResultSet executeQuery(String qry){
        try{
        Class.forName(dbdriver);
          Connection   conn= DriverManager.getConnection(dburl,dbname,dbpassword);
          Statement s= conn.createStatement();
             return s.executeQuery(qry);
        }
        catch(Exception e){
            
        }
        return null;
    }
    
    public static void executeUpdate(String qry) {
        try{
        Class.forName(dbdriver);
        Connection conn= DriverManager.getConnection(dburl,dbname,dbpassword);
        Statement s = conn.createStatement();
         s.executeUpdate(qry);
        }
        catch(Exception e){
            
        }
     
    }
}
