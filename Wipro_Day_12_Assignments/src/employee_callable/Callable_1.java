package employee_callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class Callable_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mycollege";
        String user = "root";
        String password = "*****";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created....");
        
        CallableStatement cs=(CallableStatement) con.prepareCall("{CALL  add_bonus()}");
        
        ResultSet rs=cs.executeQuery();
        
        System.out.println("ID\tName\t\tSalary");
        System.out.println("-----------------------------------");
        
        while(rs.next()){
        	int id=rs.getInt("id");
        	String name=rs.getString("name");
        	int salary=rs.getInt("salary");
        	System.out.println(id+"\t"+name+"\t\t"+salary);
        }
	}

}
