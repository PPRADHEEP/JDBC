package com.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/student";
        String username = "root";
        String password = "pradheep";

        //Establishing connection
        Connection c = DriverManager.getConnection(url, username, password);
//
        //executing sql statement
//		Statement st = c.createStatement();
//
//		String str = "delete from student where id=1";
//		int executeUpdate = st.executeUpdate(str);
//
//		System.out.println("success - " + executeUpdate);
//
        String str = "delete from user where id=?";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id value where name to be deleted");
        int id = s.nextInt();
        //s.nextLine();
//		System.out.println("Enter the name to be deleted");
//		String name = s.nextLine();

        //Ceating the statment
        PreparedStatement p = c.prepareStatement(str);

        p.setInt(1, id);
        //p.setString(1,name);

        int e = p.executeUpdate();
        if(e > 0) {
            System.out.println("Deletiontion Sucessfull");
        }
        else {
            System.out.println("Deletion Failiure");
 }

    }
}
