package jdbc;

//Q4. Develop a program to search a student by ID using JDBC.

import java.sql.*;
import java.util.Scanner;

public class Q4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter student ID: ");
     int id = sc.nextInt();

     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM students WHERE id=?";

     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, id);
         ResultSet rs = ps.executeQuery();
         if (rs.next()) {
             System.out.println(rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getDouble("marks"));
         } else {
             System.out.println("Student not found!");
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

