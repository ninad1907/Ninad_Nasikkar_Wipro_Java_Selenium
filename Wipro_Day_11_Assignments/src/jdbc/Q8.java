package jdbc;

//Q8. Create a JDBC-based program to count the total number of rows in a table.

import java.sql.*;

public class Q8 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT COUNT(*) FROM students";

     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         if (rs.next()) {
             System.out.println("Total rows: " + rs.getInt(1));
         }
     } catch (Exception e) { e.printStackTrace(); }
 }
}
