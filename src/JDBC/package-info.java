import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		Employee ravi = new Employee(10, "Aman Gupta", "Male", 67000);
		
//		Way-2
		Properties ps = new Properties();
		ps.put("user", "root");
		ps.put("password", "root");
		

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", ps);

		Statement statement = connection.createStatement();

		statement.executeUpdate("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");

		
		
		System.out.println("insert into employee(id,name,gender,salary) values (" + ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query executed...............");

	}

}