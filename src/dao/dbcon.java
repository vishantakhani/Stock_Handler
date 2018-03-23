/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class dbcon {
   
 
     
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
     try{
       
         connection cn = new connection();
         
         cn.openDb();
         String query = "insert into stk values(2,'bbb')";
         
         String n= cn.exMyQuery(query);
         System.out.println("error " + n);
          System.out.println(query);
     }catch (Exception e ){
     System.out.println(e);
     }
    }
    
} 
