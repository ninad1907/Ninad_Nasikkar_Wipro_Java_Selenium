package jdbc;

//Q6. Write a Java program to delete a student record from the database using JDBC.

import java.sql.*;

public class Q6 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "user";
     String password = "*****";
     String sql = "DELETE FROM students WHERE id=?";

     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, 101);
         int rows = ps.executeUpdate();
         System.out.println(rows + " record(s) deleted.");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

