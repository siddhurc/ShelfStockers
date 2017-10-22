/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstockers;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author siddharthachoudhary
 */
public class UpdateBill {
    String dbname="jdbc:derby://localhost:1527/sstockers";
        String uname="shelf";
       String password="shelf";
       Connection conn;
       String sql;
       PreparedStatement ps;
         
       ResultSet rs;
       int res=0;
    public int m1(String name)
    {
    
    try{
       sql = "SELECT id FROM stock where name=?";
            conn=DriverManager.getConnection(dbname,uname,password);
            conn.setAutoCommit(false);
            ps=conn.prepareStatement(sql);
            ps.setString(1, name);
            rs=ps.executeQuery();
            rs.next();
            res=rs.getInt("id");
            conn.commit();
            conn.close();
    }
catch(SQLException ex){
    ex.printStackTrace();
}
    
    return res;
    }
    
    
    public int m2(String name)
    {
    
    
    
    try{
        sql = "SELECT price FROM stock where name=?";
            conn=DriverManager.getConnection(dbname,uname,password);
            conn.setAutoCommit(false);
            ps=conn.prepareStatement(sql);
            ps.setString(1, name);
            rs=ps.executeQuery();
            rs.next();
            res=rs.getInt("price");
            conn.commit();
            conn.close();
    }
catch(SQLException ex){
    ex.printStackTrace();
}
    
    return res;
    }
}
