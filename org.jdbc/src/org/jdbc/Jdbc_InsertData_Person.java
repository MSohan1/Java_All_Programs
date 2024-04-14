package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc_InsertData_Person {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into person values(3,'Chanikya',25,'Dubai',9776541233)");
		connection.close();
		System.out.println("Sucessfully executed the qwery");

	}

}
