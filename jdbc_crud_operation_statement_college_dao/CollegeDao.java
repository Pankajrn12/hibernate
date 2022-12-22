package jdbc_crud_operation_statement_college_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import jdbc_crud_operation_statement_college_connection.CollegeConnection;
import jdbc_crud_operation_statement_college_dto.CollegeDto;

public class CollegeDao {
	public void insertAddBatch(List<CollegeDto> college1 ) {
		Connection connection = CollegeConnection.getConnection();
		String insert1 = "insert into college_detail values(?,?,?,?)";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(insert1);
			for(CollegeDto college2 : college1) {
				prepareStatement.setInt(1, college2.getCollegeId());
				prepareStatement.setString(2, college2.getCollegeName());
				prepareStatement.setString(3, college2.getCollegeLocation());
				prepareStatement.setString(4, college2.getCollegeContact());
				
				prepareStatement.addBatch();
			}
			
			prepareStatement.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void update(int id, String  name) {
		Connection connection = CollegeConnection.getConnection();
		String update1 = "update college_detail set college_name = ? where id = ?";
		try {
			PreparedStatement prepareStatement = connection.prepareCall(update1);
			prepareStatement.setInt(2, id);
			prepareStatement.setString(1, name);
			prepareStatement.executeUpdate();
			System.out.println("updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(int id) {
		Connection connection = CollegeConnection.getConnection();
		String del = "delete from college_detail where id = ?";
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
	
	public void display() {
		Connection connection = CollegeConnection.getConnection();
		String print = "select * from college_detail";
		PreparedStatement preparestmt;
		try {
			preparestmt = connection.prepareStatement(print);
			ResultSet resultset = preparestmt.executeQuery(print);
//			ResultSet resultset = statement.executeQuery(select);
			while(resultset.next()) {
				System.out.println("id = "+resultset.getInt("id"));
				System.out.println("college name = "+resultset.getString("college_name"));
				System.out.println("college location = "+resultset.getString("college_location"));
				System.out.println("college contact = "+resultset.getString("college_contact"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
