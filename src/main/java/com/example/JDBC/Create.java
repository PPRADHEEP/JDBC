package com.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello");



        //connection infrormation
        String url = "jdbc:mysql://localhost/student";
        String username = "root";
        String password = "pradheep";

        //Establishing connection
        Connection c = DriverManager.getConnection(url, username, password);
//
        //executing sql statement
        Statement st = c.createStatement();
        st.execute("create table user(id int, name varchar(20))");
        System.out.println("success");
    }
}
