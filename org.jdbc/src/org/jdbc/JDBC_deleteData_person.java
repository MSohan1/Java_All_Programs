package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_deleteData_person {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("delete from person where idperson=1");
		connection.close();
		System.out.println("Sucessfully executed the qwery");

	}
}
