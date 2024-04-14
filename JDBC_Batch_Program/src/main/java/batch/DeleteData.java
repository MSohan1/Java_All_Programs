package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement statement = connection.createStatement();
		System.out.println("This is an Delete Query");
		statement.execute("Delete from employee where employeeId=1");
		System.out.println("Query Executed Successfully!!");
		connection.close();

	}

}
