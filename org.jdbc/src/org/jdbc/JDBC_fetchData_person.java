package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_fetchData_person {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet=statement.executeQuery("Select * from person");
		while(resultSet.next())
		{
			System.out.println("Person ID ="+resultSet.getInt(1));
			System.out.println("Person Name ="+resultSet.getString(2));
			System.out.println("Person Age ="+resultSet.getInt(3));
			System.out.println("Person Address ="+resultSet.getString(4));
			System.out.println("Person PhoneNumber ="+resultSet.getLong(5));
			
	
		}
		connection.close();
	}

}
