package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Fetch_Data {

	public static void main(String[] args)  throws SQLException, IOException  {



		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fileInputStream = new FileInputStream("configuration.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		Connection connection = DriverManager.getConnection(properties.getProperty("url")
				,properties.getProperty("username"),
				properties.getProperty("password"));
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("Select * from person");
		
		
		while(resultSet.next())
		{
			System.out.println("------------------------------------------------------");
			System.out.println("PersonId : "+resultSet.getInt(1));
			System.out.println("PersonName : "+resultSet.getString(2));
			System.out.println("PersonAge : "+resultSet.getInt(3));
			System.out.println("PersonAddress : "+resultSet.getString(4));
			System.out.println("PersonPhone : "+resultSet.getLong(5));
		}
		

		connection.close();

	}

}
