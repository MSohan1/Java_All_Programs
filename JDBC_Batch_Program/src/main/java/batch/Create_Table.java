package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute(
				"Create table Employee (employeeId int primary key,employeeName varchar(30),employeeAge int ,employeeSalary decimal,employeeEmail varchar(30))");
		connection.close();
		System.out.println("Successflly Created");

	}
}