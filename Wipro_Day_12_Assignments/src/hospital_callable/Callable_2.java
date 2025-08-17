package hospital_callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class Callable_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hospital";
        String user = "root";
        String password = "*****";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created....");
        
        CallableStatement cs = (CallableStatement) con.prepareCall("{CALL same_ward()}");
        ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            int ward = rs.getInt("ward");
            String name = rs.getString("name"); 
            System.out.println("Ward: " + ward + "Patients: " + name);
        }

	}

}
