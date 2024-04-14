package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_udateData_Person {

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		Statement statement = connection.createStatement();
		statement.execute("update person set personage=25 where personname='sohan'");
		connection.close();
		System.out.println("Statment Executed Successfully");
	}
}
