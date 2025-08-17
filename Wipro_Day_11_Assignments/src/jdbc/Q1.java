package jdbc;

//Q1. Write a Java program to connect to a MySQL database using JDBC.

import java.sql.Connection;
import java.sql.DriverManager;

public class Q1 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     try (Connection con = DriverManager.getConnection(url, user, password)) {
         System.out.println("Connected successfully!");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
