/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstockers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author siddharthachoudhary
 */
public class ModifyClass {
String dbname="jdbc:derby://localhost:1527/sstockers";
        String uname="shelf";
       String password="shelf";
       Connection conn;
       int count=0;
String sql;

    /**
     *
     * @param id
     * @param name
     * @param quantity
     * @param price
    
     * @throws java.sql.SQLException
     */
    public int add(String id,String name,String quantity,String price) throws SQLException
    {
        
                
        int iid,qty,pr;
        iid=Integer.parseInt(id);
        qty=Integer.parseInt(quantity);
        pr=Integer.parseInt(price);
        
        
        try{
            conn=DriverManager.getConnection(dbname,uname,password);
            sql = "INSERT INTO stock (id, name, quantity, price) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, iid);
            statement.setString(2, name);
            statement.setInt(3, qty);
            statement.setInt(4, pr);
            statement.execute();
            count = statement.executeUpdate();
            conn.close();
            

        }
        catch(SQLException ex)
        {
        }
       
     return count; 
    }
public int delete(String id)
{
    
    int iid=Integer.parseInt(id);
    
    try
    {
        
         conn=DriverManager.getConnection(dbname,uname,password);
         sql = "DELETE FROM stock WHERE id=?";
         PreparedStatement stmt=conn.prepareStatement(sql);
         stmt.setInt(1,iid);
         count=stmt.executeUpdate();
         conn.close();
         
    }
    catch(SQLException ex){}
 return count;   
}








    
    
}

