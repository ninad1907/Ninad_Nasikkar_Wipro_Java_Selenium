package jdbc;

//Q15. Implement a Java application to take dynamic input from the user and perform insertion, search, or update using menu-driven logic.

import java.sql.*;
import java.util.Scanner;

public class Q15 {
 static String url = "jdbc:mysql://localhost:3306/school";
 static String user = "username";
 static String password = "*****";

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     while (true) {
         System.out.println("1. Insert\n2. Search\n3. Update\n4. Exit");
         int choice = sc.nextInt();
         switch (choice) {
             case 1 -> insert();
             case 2 -> search();
             case 3 -> update();
             case 4 -> { return; }
         }
     }
 }

 static void insert() {
     String sql = "INSERT INTO students VALUES (?, ?, ?)";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, 301);
         ps.setString(2, "Rahul");
         ps.setDouble(3, 80);
         ps.executeUpdate();
         System.out.println("Inserted!");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void search() {
     String sql = "SELECT * FROM students WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, 301);
         ResultSet rs = ps.executeQuery();
         if (rs.next()) System.out.println(rs.getString("name"));
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void update() {
     String sql = "UPDATE students SET marks=? WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setDouble(1, 95);
         ps.setInt(2, 301);
         ps.executeUpdate();
         System.out.println("Updated!");
     } catch (Exception e) { e.printStackTrace(); }
 }
}

