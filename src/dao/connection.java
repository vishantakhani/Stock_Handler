package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

/**
 *
 * @author Kapil Thakkar
 */
public class connection {
    Connection con ;
    ResultSet rs;
    Statement st;
    
    
    Config c = new Config();
    
    public void openDb()
    {
         try
        {
            Class.forName(c.driver);
             con=DriverManager.getConnection(c.url);
             if(con!=null)
             System.out.println("ok....");
            
             st = con.createStatement(1004,1008);
            
            
        }
        catch(Exception ee)
        {
        
            System.out.println(ee);
        }
    }
    private void  writeError(Exception ee) throws IOException
    {
        
        
       
    }
    public void closeDb()
    {
        try{
        con.commit();
        con.close();
        }
        catch(Exception ee)
        {
            
            
        }
             
    }
    public String exMyQuery(String qry)
    {  
       int rw = 0;
       String str = "1";
      
       
       
       
        try
        {
          //  System.out.println(qry);
            rw = st.executeUpdate(qry);
        }
            catch(Exception ee)
            {
                str = ee.toString();

                //System.out.println(str);
            }
        finally
        {
            closeDb();
        }
        
    return str;
    }
    public ResultSet selectQuery(String qry)
      { 
          try
        {
            rs = st.executeQuery(qry);
        }
      catch(Exception ee)
      {}
          
        
        return rs;
    }
    
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




