package hospital_callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class Callable_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hospital";
        String user = "root";
        String password = "*****";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created....");

        CallableStatement cs = (CallableStatement) con.prepareCall("{CALL patient_count()}");
        ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            double avg = rs.getDouble("avg_patient_per_day"); 
            System.out.println("Average patient count per day = " + avg);
        }

	}

}
