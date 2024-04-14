package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;


public class Insert_Data {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fileInputStream = new FileInputStream("configuration.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		Connection connection = DriverManager.getConnection(properties.getProperty("url")
				,properties.getProperty("username"),
				properties.getProperty("password"));
		Statement statement = connection.createStatement();
		statement.execute("insert into person values(1,'Sohan',21,'HYD',9347500905)");
		connection.close();
		System.out.println("Inserted Successfully");

	}

}
