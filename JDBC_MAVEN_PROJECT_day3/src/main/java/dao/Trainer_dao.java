package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Trainer;

public class Trainer_dao {
	public void insertTrainer(Trainer trainer) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdb", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into trainer values(?,?,?,?,?,?)");
		preparedStatement.setInt(1, trainer.getTrainerId());
		preparedStatement.setString(2, trainer.getTrainerName());
		preparedStatement.setString(3, trainer.getTrainerSkill());
		preparedStatement.setString(4, trainer.getTrainerAddress());
		preparedStatement.setLong(6, trainer.getTrainerPhone());
		preparedStatement.setDouble(5, trainer.getTrainerSalary());
		preparedStatement.execute();

		connection.close();
		System.out.println("Inserted Sucessfully ");
	}
	
	
	public void deleteTrainer(Trainer trainer) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdb", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("delete from trainer where trainerid=? ");
		preparedStatement.setInt(1, trainer.getTrainerId());
		preparedStatement.execute();
		connection.close();
		
		
//		if()
//		{
			System.out.println("Bugga data poyyindhi poo");
//		}
//		else {
//			System.out.println("Adhi avvadhu mama! veredhi cheyyi");
//		}
//		
		
	}
	
	public void UpdateTrainer(Trainer trainer) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdb", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("update trainer set trainersalary= ? where trainerid=? ");
		preparedStatement.setDouble(1, trainer.getTrainerSalary());
		preparedStatement.setInt(2, trainer.getTrainerId());
		preparedStatement.execute();
		connection.close();
		
		System.out.println("Successfully Updated");
		
	}
	public void FetchSingle(Trainer trainer) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdb", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("Select * from trainer where trainerid=? ");
		preparedStatement.setInt(1, trainer.getTrainerId());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			System.out.println("Trainer Id : "+resultSet.getInt(1));
			System.out.println("Trainer Name : "+resultSet.getString(2));
			System.out.println("Trainer Skills : "+resultSet.getString(3));
			System.out.println("Trainer Address : "+resultSet.getString(4));
			System.out.println("Trainer Salary : "+resultSet.getDouble(5));
			System.out.println("Trainer Phone : "+resultSet.getLong(6));
		}
		connection.close();
	}
	public void FetchAll(Trainer trainer) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdb", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("Select * from trainer");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println("Trainer Id : "+resultSet.getInt(1));
			System.out.println("Trainer Name : "+resultSet.getString(2));
			System.out.println("Trainer Skills : "+resultSet.getString(3));
			System.out.println("Trainer Address : "+resultSet.getString(4));
			System.out.println("Trainer Salary : "+resultSet.getDouble(5));
			System.out.println("Trainer Phone : "+resultSet.getLong(6));
		}
		connection.close();
		
		
		
	}

}
