package jdbc;

//Q11. Use PreparedStatement to insert multiple student records into the database.

import java.sql.*;

public class Q11 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {

         ps.setInt(1, 102); ps.setString(2, "Alice"); ps.setDouble(3, 78.5); ps.addBatch();
         ps.setInt(1, 103); ps.setString(2, "Bob"); ps.setDouble(3, 88.2); ps.addBatch();
         ps.setInt(1, 104); ps.setString(2, "Charlie"); ps.setDouble(3, 92.0); ps.addBatch();

         ps.executeBatch();
         System.out.println("Multiple records inserted!");
     } catch (Exception e) { e.printStackTrace(); }
 }
}
