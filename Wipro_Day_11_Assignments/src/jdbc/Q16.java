package jdbc;

//Q16. Design the schema for a Library Management System and write JDBC programs for:
//• Adding a book
//• Viewing all books
//• Issuing a book to a member
//• Returning a book

import java.sql.*;

public class Q16 {
 static String url = "jdbc:mysql://localhost:3306/library";
 static String user = "username";
 static String password = "*****";

 public static void main(String[] args) {
     addBook(1, "Java Basics", "Author A");
     viewBooks();
     issueBook(1, "Member1");
     returnBook(1);
 }

 static void addBook(int id, String title, String author) {
     String sql = "INSERT INTO books VALUES (?, ?, ?)";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, id);
         ps.setString(2, title);
         ps.setString(3, author);
         ps.executeUpdate();
         System.out.println("Book added.");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void viewBooks() {
     String sql = "SELECT * FROM books";
     try (Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {
         while (rs.next()) System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void issueBook(int bookId, String member) {
     String sql = "UPDATE books SET issued_to=? WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setString(1, member);
         ps.setInt(2, bookId);
         ps.executeUpdate();
         System.out.println("Book issued.");
     } catch (Exception e) { e.printStackTrace(); }
 }

 static void returnBook(int bookId) {
     String sql = "UPDATE books SET issued_to=NULL WHERE id=?";
     try (Connection con = DriverManager.getConnection(url, user, password);
          PreparedStatement ps = con.prepareStatement(sql)) {
         ps.setInt(1, bookId);
         ps.executeUpdate();
         System.out.println("Book returned.");
     } catch (Exception e) { e.printStackTrace(); }
 }
}
