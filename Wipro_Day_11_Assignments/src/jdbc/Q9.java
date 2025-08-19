package jdbc;

//Q9. Develop a program to sort student data in ascending order by name using SQL in JDBC.

import java.sql.*;

public class Q9 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM students ORDER BY name ASC";

     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         while (rs.next()) {
             System.out.println(rs.getInt("id")+" , "+rs.getString("name")+" , "+rs.getDouble("marks"));
         }
     } catch (Exception e) { e.printStackTrace(); }
 }
}
