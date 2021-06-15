/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

/**
 *
 * @author Bui Hoan
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hoan
 */
public class MyConnection {
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/QL_KHACHSAN?zeroDateTimeBehavior=convertToNull";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
     public static void main(String [] args)
     {
         Connection conn=getConnection();
         if(conn!=null)
             System.out.print("thanh cong");
         else
             System.out.print("that bai");
     }
    
}
