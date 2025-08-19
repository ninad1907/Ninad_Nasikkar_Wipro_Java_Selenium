package jdbc;

//Q12. Implement a program using transaction management in JDBC (i.e., commit and rollback).

import java.sql.*;

public class Q12 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/school";
     String user = "username";
     String password = "*****";

     try (Connection con = DriverManager.getConnection(url, user, password)) {
         con.setAutoCommit(false);

         try (Statement st = con.createStatement()) {
             st.executeUpdate("INSERT INTO students VALUES (201,'David',70)");
             st.executeUpdate("INSERT INTO students VALUES (202,'Eve',85)");

             con.commit();
             System.out.println("Transaction committed.");
         } catch (Exception e) {
             con.rollback();
             System.out.println("Transaction rolled back.");
         }
     } catch (Exception e) { e.printStackTrace(); }
 }
}
