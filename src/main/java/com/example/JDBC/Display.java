package com.example.JDBC;

import java.sql.*;

public class Display {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connection infrormation
        String url = "jdbc:mysql://localhost/student";
        String username = "root";
        String password = "pradheep";

        //Establishing connection
        Connection c = DriverManager.getConnection(url, username, password);
//
        //executing sql statement
        Statement st = c.createStatement();

        String str = "select * from user";

        ResultSet rs = st.executeQuery(str);

        while(rs.next()) {
            System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
 }

    }
}
