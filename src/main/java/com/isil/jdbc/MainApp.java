package com.isil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {
    public static void  main(String[] args)throws Exception

    {
        String jdbcurl = "jdbc:mysql://localhost:3306/DESAI";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbcurl, "root", "root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Users");
        while(rs.next()){System.out.println(rs.getString("idUser")+ " " +rs.getString("name"));
        }
        }


    }



