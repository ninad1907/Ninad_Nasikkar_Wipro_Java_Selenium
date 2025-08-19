package jdbc;

//Q3. Write a JDBC program to fetch and display all student records from the database.

import java.sql.*;

public class Q3 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM students";

     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         while (rs.next()) {
             System.out.println(rs.getInt("id") + " , " +
                                rs.getString("name") + " , " +
                                rs.getDouble("marks"));
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
