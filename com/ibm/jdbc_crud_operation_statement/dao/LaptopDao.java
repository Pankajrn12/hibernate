package com.ibm.jdbc_crud_operation_statement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.jdbc_crud_operation_statement.dto.Laptop;

public class LaptopDao {
	LaptopDao dao = new LaptopDao();
	public void insertLaptop(Laptop laptop) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String insert = "insert into laptop values("+laptop.getId()+",'"+laptop.getName()+"',"+laptop.getPrice()+",'"+laptop.getColor()+"')";
			statement.execute(insert);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateLaptop(Laptop laptop){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String update = "update laptop set name = '"+laptop.getName()+"'"+"WHERE id = "+laptop.getId()+"";
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
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String select = "SELECT * FROM laptop";
			ResultSet resultset = statement.executeQuery(select);
			while(resultset.next()) {
				System.out.println("id = "+resultset.getInt("id"));
				System.out.println("name = "+resultset.getString("name"));
				System.out.println("price = "+resultset.getDouble("price"));
				System.out.println("color = "+resultset.getString("id"));
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
			String select = "DELETE FROM laptop WHERE id = ("+id+")";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass); 
			Statement statement = connection.createStatement();
			String insert = "Select * from customer where id = "+id+"";
			ResultSet resultSet = statement.executeQuery(insert);
			resultSet.next();
			try {
				int id1 = resultSet.getInt("id");
				return id1;
			}catch(Exception e) {
				System.out.println("resultset is empty");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public void update1(int id, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass); 
			Statement statement = connection.createStatement();
			String update = "update laptop set name = '"+name+"'"+"WHERE id = "+id+"";
			statement.execute(update);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
