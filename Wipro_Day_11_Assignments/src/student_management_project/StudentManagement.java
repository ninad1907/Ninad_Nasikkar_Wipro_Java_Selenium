package student_management_project;

import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    static final String URL = "jdbc:mysql://localhost:3306/StudentDB";
    static final String USER = "root";
    static final String PASSWORD = "*****"; // Change this to your MySQL password

    static Connection conn;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;
            do {
                System.out.println("\n--- Student Management ---");
                System.out.println("1. Insert Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Drop Table");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> insertStudent();
                    case 2 -> viewStudents();
                    case 3 -> updateStudent();
                    case 4 -> deleteStudent();
                    case 5 -> dropTable();
                    case 6 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice.");
                }

            } while (choice != 6);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insertStudent() throws SQLException {
        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter grade: ");
        sc.nextLine();
        String grade = sc.nextLine();

        String sql = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setInt(2, age);
        pst.setString(3, grade);

        int rows = pst.executeUpdate();
        System.out.println(rows + " student inserted.");
    }

    static void viewStudents() throws SQLException {
        String sql = "SELECT * FROM students";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println("\n--- Student List ---");
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getInt("age") + " | " +
                rs.getString("grade")
            );
        }
    }

    static void updateStudent() throws SQLException {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        System.out.print("Enter new name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter new age: ");
        int age = sc.nextInt();

        System.out.print("Enter new grade: ");
        sc.nextLine();
        String grade = sc.nextLine();

        String sql = "UPDATE students SET name = ?, age = ?, grade = ? WHERE id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setInt(2, age);
        pst.setString(3, grade);
        pst.setInt(4, id);

        int rows = pst.executeUpdate();
        System.out.println(rows + " student(s) updated.");
    }

    static void deleteStudent() throws SQLException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);

        int rows = pst.executeUpdate();
        System.out.println(rows + " student(s) deleted.");
    }

    static void dropTable() throws SQLException {
        System.out.print("Are you sure you want to drop the table? (yes/no): ");
        sc.nextLine();
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            String sql = "DROP TABLE IF EXISTS students";
            Statement st = conn.createStatement();
            st.execute(sql);
            System.out.println("Table dropped.");
        } else {
            System.out.println("Drop cancelled.");
        }
    }
}
