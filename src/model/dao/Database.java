/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dracu
 */
public class Database {
    private Connection conn;
    private String db = "trungtambds";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/"+ db +"?useUnicode=true&characterEncoding=UTF-8";
    public Connection getConnection(){
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
            }
            return conn;
    }
    public void closeConnection() {
            if(conn!=null){
                    try {
                            conn.close();
                    } catch (SQLException e) {
                            e.printStackTrace();
                    }
            }
    }
    
    public static void main(String[] args) {
        Database db = new Database();
        Connection conn = db.getConnection();
    }
   
}

