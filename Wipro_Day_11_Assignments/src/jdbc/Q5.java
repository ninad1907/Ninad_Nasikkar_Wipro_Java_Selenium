package jdbc;

//Q5. Implement an update operation to modify student details in the database using JDBC.

import java.sql.*;

public class Q5 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "UPDATE students SET marks=? WHERE id=?";

     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setDouble(1, 90.0);
         ps.setInt(2, 101);
         int rows = ps.executeUpdate();
         System.out.println(rows + " record(s) updated.");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
