package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {



		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement statement = connection.createStatement();
		statement.addBatch("insert into employee values(1,'Sohan',21,40000,'mallelasohan2002@gmail.com')");
		statement.addBatch("insert into employee values(2,'vinay',21,140000,'Vinay@gmail.com')");
		statement.addBatch("insert into employee values(3,'Chanikya',22,140000,'Chanikya@gmail.com')");
		statement.addBatch("insert into employee values(4,'Krishna',22,240000,'Krishna@gmail.com')");
		statement.addBatch("insert into employee values(5,'Shivaji',21,340000,'Shivaji@gmail.com')");
		statement.addBatch("insert into employee values(6,'Madhu',20,400000,'Madhu@gmail.com')");
		statement.addBatch("insert into employee values(7,'Ranadheer',22,340000,'Ranadheer@gmail.com')");
		statement.addBatch("insert into employee values(8,'Sainath',22,550000,'Sainath@gmail.com')");
		statement.addBatch("insert into employee values(9,'Madhan',25,940000,'Madhan@gmail.com')");
		statement.addBatch("insert into employee values(10,'JayaSree',21,1140000,'KothaJayasree266@gmail.com')");
		statement.addBatch("insert into employee values(11,'Rishitha',21,1540000,'RishithaMallapu@gmail.com')");
		statement.executeBatch();
		connection.close();
		System.out.println("Successflly Created");

	}

}
