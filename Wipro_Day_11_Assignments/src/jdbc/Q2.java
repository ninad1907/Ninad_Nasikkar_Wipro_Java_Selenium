package jdbc;

//Q2. Create a Java class to insert student records into a database table.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Q2 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, 101);
         ps.setString(2, "Rishabh");
         ps.setDouble(3, 85.6);
         ps.executeUpdate();
         System.out.println("Record inserted!");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

