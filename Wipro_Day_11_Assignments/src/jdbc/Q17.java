package jdbc;

//Q17. Create a Hospital Management System database. Using JDBC, implement:
//• Register new patient
//• Assign doctor
//• Generate billing

import java.sql.*;

public class Q17 {
 static String url = "jdbc:mysql://localhost:3306/hospital";
 static String user = "username";
 static String password = "*****";

 public static void main(String[] args) {
     registerPatient(1,"Ravi");
     assignDoctor(1,"Dr. Sharma");
     generateBill(1,5000);
 }

 static void registerPatient(int id, String name) {
     String sql = "INSERT INTO patients VALUES (?, ?)";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, id);
         ps.setString(2, name);
         ps.executeUpdate();
         System.out.println("Patient registered.");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void assignDoctor(int pid, String doctor) {
     String sql = "UPDATE patients SET doctor=? WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setString(1, doctor);
         ps.setInt(2, pid);
         ps.executeUpdate();
         System.out.println("Doctor assigned.");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void generateBill(int pid, double amount) {
     String sql = "INSERT INTO billing (pid, amount) VALUES (?, ?)";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, pid);
         ps.setDouble(2, amount);
         ps.executeUpdate();
         System.out.println("Bill generated.");
     } catch (Exception e) { e.printStackTrace(); }
 }
}

