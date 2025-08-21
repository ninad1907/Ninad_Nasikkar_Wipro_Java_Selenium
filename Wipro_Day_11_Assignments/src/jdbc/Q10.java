package jdbc;

//Q10. Write a program to display all students whose percentage is greater than 75 using JDBC and SQL WHERE clause.

import java.sql.*;

public class Q10 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM students WHERE marks > 75";

     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         while (rs.next()) {
             System.out.println(rs.getInt("id")+" , "+rs.getString("name")+" , "+rs.getDouble("marks"));
         }
     } catch (Exception e) { e.printStackTrace(); }
 }
}

