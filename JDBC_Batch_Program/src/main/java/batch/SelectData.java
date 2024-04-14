package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement statement = connection.createStatement();
		System.out.println("This is an select Query");
		ResultSet resultSet=statement.executeQuery("select * from employee");
	
		while(resultSet.next()) {
			System.out.println("Employee Id: "+resultSet.getInt(1));
			System.out.println("Employee Name: "+resultSet.getString(2));
			System.out.println("Employee Age: "+resultSet.getInt(3));
			System.out.println("Employee Salary: "+resultSet.getInt(4));
			System.out.println("Employee Email: "+resultSet.getString(5));
			System.out.println("------------------------------------------------------");
		}
		connection.close();

	}
}
