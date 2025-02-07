package com.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/student";
        String username = "root";
        String password = "pradheep";

        //Establishing connection
        Connection c = DriverManager.getConnection(url, username, password);

        //executing sql statement
//		Statement st = c.createStatement();
//
//		String str = "update student set name='Laishu' where id=5";
//		int executeUpdate = st.executeUpdate(str);
//
//		System.out.println("success - " + executeUpdate);

        String str = "update user set name=? where id=?";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id value where name to be updated");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the name name to set");
        String name = s.nextLine();

        //Ceating the statment
        PreparedStatement p = c.prepareStatement(str);
        p.setInt(2, id);
        p.setString(1,name);

        int e = p.executeUpdate();
        if(e > 0) {
            System.out.println("Updation Sucessfull");
        }
        else {
            System.out.println("Updation Failiure");
  }


    }
}
