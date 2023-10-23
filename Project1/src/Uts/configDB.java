package Uts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class configDB {
    private static Connection mysqlConfig;
    
    public static Connection koneksi(){
        try{
            String url = "jdbc:mysql://localhost:3306/UTS";
            //nama databse yang login akademikdb
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            System.err.println("gagal koneksi "+e.getMessage());
        }
        return mysqlConfig;
    }
}
