package hospital_management_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.cj.jdbc.CallableStatement;

public class Callable_3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hospital";
        String user = "root";
        String password = "*****";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created....");
        CallableStatement cs = (CallableStatement) con.prepareCall("{CALL arrange_patients()}");
        ResultSet rs = cs.executeQuery();

        System.out.println("Patients arranged by admission date:");
        while (rs.next()) {
            String name = rs.getString("name");
            Date date = rs.getDate("new_date");
            System.out.println("Name: " + name + " Admission Date: " + date);
        }

	}

}
