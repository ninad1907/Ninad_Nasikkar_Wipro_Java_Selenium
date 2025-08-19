package jdbc;

//Q14. Create a login system using JDBC where user credentials are verified from the database.

import java.sql.*;
import java.util.Scanner;

public class Q14 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter username: ");
     String uname = sc.next();
     System.out.print("Enter password: ");
     String pass = sc.next();

     String url = "jdbc:mysql://localhost:3306/appdb";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM users WHERE username=? AND password=?";

     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setString(1, uname);
         ps.setString(2, pass);
         ResultSet rs = ps.executeQuery();
         if (rs.next()) {
             System.out.println("Login successful!");
         } else {
             System.out.println("Invalid credentials.");
         }
     } catch (Exception e) { e.printStackTrace(); }
 }
}

