package com.demo.util;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DbConn {
    private static DbConn obj;
    private Connection conn;
    private String url="jdbc:mysql://localhost:3306/sakshamdb";
    private String username="root";
    private String password="root@2024";
    private DbConn(){
        try{
            this.conn=DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static DbConn getInstance(){
        if (obj == null) {
            synchronized (DbConn.class) {
                if (obj == null) {
                    obj = new DbConn();
                }
            }
        }
        return obj;
    }
    public Connection getConn(){
        return conn;
    }
    }





















