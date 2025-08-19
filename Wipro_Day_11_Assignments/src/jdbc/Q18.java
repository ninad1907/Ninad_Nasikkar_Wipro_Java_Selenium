package jdbc;

//Q18. Write a JDBC-based report generator that exports data from a MySQL table to a text or CSV file.

import java.sql.*;
import java.io.FileWriter;

public class Q18 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";
     String sql = "SELECT * FROM students";

     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql);
          FileWriter fw = new FileWriter("students_report.csv")) {

         fw.write("ID,Name,Marks\n");
         while (rs.next()) {
             fw.write(rs.getInt("id")+","+rs.getString("name")+","+rs.getDouble("marks")+"\n");
         }
         System.out.println("Report generated as students_report.csv");
     } catch (Exception e) { e.printStackTrace(); }
 }
}

