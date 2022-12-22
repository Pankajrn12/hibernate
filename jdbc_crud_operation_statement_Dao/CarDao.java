package jdbc_crud_operation_statement_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jdbc_crud_operation_statement_CarDto.CarDto;
import jdbc_crud_operation_statement_Connection.CarConnection;

public class CarDao {
	Connection connection = null;
	public void insert(CarDto car ) {
		connection = CarConnection.getConnection();
		String insert = "INSERT INTO car_detail VALUES(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, car.getId());
			preparedStatement.setString(2, car.getName());
			preparedStatement.setInt(3, car.getPrice());
			preparedStatement.setString(4, car.getColor());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(int id, String  name, int price) {
		connection = CarConnection.getConnection();
		String update1 = "update car_detail set name = ?, price = ? where id = ?";
		try {
			PreparedStatement prepareStatement = connection.prepareCall(update1, price, id, price);
			prepareStatement.setInt(3, id);
			prepareStatement.setString(1, name);
			prepareStatement.setInt(2, price);
			prepareStatement.executeUpdate();
			System.out.println("updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(int id) {
		connection = CarConnection.getConnection();
		String del = "delete from car_detail where id = ?";
		try {
			PreparedStatement preparestmt = connection.prepareStatement(del);
			preparestmt.setInt(1, id);
			preparestmt.executeUpdate();
			System.out.println("deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertAddBatch(List<CarDto> car ) {
		connection = CarConnection.getConnection();
		String insert1 = "insert into car_detail values(?,?,?,?)";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(insert1);
			for(CarDto car1 : car) {
				prepareStatement.setInt(1, car1.getId());
				prepareStatement.setString(2, car1.getName() );
				prepareStatement.setInt(3, car1.getPrice());
				prepareStatement.setString(4, car1.getColor());
				
				prepareStatement.addBatch();
			}
			
			prepareStatement.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void display() {
		connection = CarConnection.getConnection();
		String print = "select * from car_detail";
		PreparedStatement preparestmt;
		try {
			preparestmt = connection.prepareStatement(print);
			ResultSet resultset = preparestmt.executeQuery(print);
//			ResultSet resultset = statement.executeQuery(select);
			while(resultset.next()) {
				System.out.println("id = "+resultset.getInt("id"));
				System.out.println("name = "+resultset.getString("name"));
				System.out.println("price = "+resultset.getInt("price"));
				System.out.println("color = "+resultset.getString("color"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
