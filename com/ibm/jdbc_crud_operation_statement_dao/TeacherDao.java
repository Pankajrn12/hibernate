package com.ibm.jdbc_crud_operation_statement_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.jdbc_crud_operation_statement_dto.Teacher;

public class TeacherDao {
	public void insertTeacher(Teacher teacher) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement-teacher";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String insert = "insert into teacher values("+teacher.getId()+",'"+teacher.getName()+"','"+teacher.getEmail()+"',"+teacher.getPhone()+")";
			statement.execute(insert);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateTeacher(Teacher teacher) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement-teacher";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String update = "update teacher set name = '"+teacher.getName()+"'"+"WHERE id = "+teacher.getId()+"";
			int id = statement.executeUpdate(update);
			if(id!=0) {
				System.out.println("data is updated");
			}
			else {
				System.out.println("id is not correct");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void display() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement-teacher";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String select = "SELECT * FROM teacher";
			ResultSet resultset = statement.executeQuery(select);
			while(resultset.next()) {
				System.out.println("id = "+resultset.getInt("id"));
				System.out.println("name = "+resultset.getString("name"));
				System.out.println("eamil = "+resultset.getString("email"));
				System.out.println("phone = "+resultset.getInt("phone"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void delete(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String select = "DELETE FROM teacher WHERE id = ("+id+")";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
