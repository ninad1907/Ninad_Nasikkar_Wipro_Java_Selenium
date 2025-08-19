package jdbc;

//Q13. Write a JDBC program to handle exceptions (like invalid ID, connection errors) gracefully.

import java.sql.*;

public class Q13 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM students WHERE id=999";

     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         if (rs.next()) {
             System.out.println("Found student: " + rs.getString("name"));
         } else {
             System.out.println("No student found with that ID.");
         }
     } catch (SQLException e) {
         System.out.println("Database error: " + e.getMessage());
     }
 }
}

