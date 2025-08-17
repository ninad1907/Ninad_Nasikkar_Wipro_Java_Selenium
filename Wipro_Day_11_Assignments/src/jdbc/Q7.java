package jdbc;

//Q7. Design a Java application to perform all CRUD (Create, Read, Update, Delete) operations on an Employee table using JDBC.

import java.sql.*;
import java.util.Scanner;

public class Q7 {
 static String url = "jdbc:mysql://localhost:3306/company";
 static String user = "username";
 static String password = "*****";

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     while (true) {
         System.out.println("1. Insert\n2. View\n3. Update\n4. Delete\n5. Exit");
         int choice = sc.nextInt();
         switch (choice) {
             case 1 -> insertEmployee();
             case 2 -> viewEmployees();
             case 3 -> updateEmployee();
             case 4 -> deleteEmployee();
             case 5 -> { return; }
         }
     }
 }

 static void insertEmployee() {
     String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, 1);
         ps.setString(2, "John");
         ps.setDouble(3, 50000);
         ps.executeUpdate();
         System.out.println("Inserted!");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void viewEmployees() {
     String sql = "SELECT * FROM employee";
     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         while (rs.next()) {
             System.out.println(rs.getInt("id")+" | "+rs.getString("name")+" | "+rs.getDouble("salary"));
         }
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void updateEmployee() {
     String sql = "UPDATE employee SET salary=? WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setDouble(1, 60000);
         ps.setInt(2, 1);
         ps.executeUpdate();
         System.out.println("Updated!");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void deleteEmployee() {
     String sql = "DELETE FROM employee WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, 1);
         ps.executeUpdate();
         System.out.println("Deleted!");
     } catch (Exception e) { e.printStackTrace(); }
 }
}

