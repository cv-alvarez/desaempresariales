package com.isil.jdbc;

import java.sql.*;

public class MainApp {
    public static void  main(String[] args)throws Exception

    {
        String jdbcurl = "jdbc:mysql://localhost:3306/DESAI";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbcurl, "root", "root");
        Statement st = con.createStatement();
        st.executeUpdate("insert into Users value('1','juan','9875646213','Vancuver')");
        PreparedStatement preparedStatement2 = con.prepareStatement("SELECT * FROM USERS WHERE idUser=?");

        st.executeUpdate("update  Users set name='christian' where name='jose'");
        preparedStatement2.setInt(1,2);
        ResultSet rs = preparedStatement2.executeQuery();


        while(rs.next()){System.out.println(rs.getString("idUser")+ " " +rs.getString("name"));}
        }


    }



