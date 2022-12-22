package com.ty.jdbc_crud_with_statement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ty.jdbc_crud_with_statement.dto.Customer;

public class CustomerDao {
	public void insertion(Customer customer) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-with-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String insert = "insert into customer values("+customer.getCustomerId()+",'"+customer.getCustomerName()+"','"+customer.getCustomerEmail()+"')";
			statement.execute(insert);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void customerupdate(Customer customer) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-with-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String update = "update customer set name = '"+customer.getCustomerName()+"'"+"WHERE id = "+customer.getCustomerId()+"";
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
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-with-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String select = "SELECT * FROM customer";
			ResultSet resultset = statement.executeQuery(select);
			while(resultset.next()) {
				System.out.println("id = "+resultset.getInt("id"));
				System.out.println("name = "+resultset.getString("name"));
				System.out.println("eamil = "+resultset.getString("email"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(int id){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-with-statement";
			String user = "root";
			String pass = "ravita";
			Connection connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			String select = "DELETE FROM customer WHERE id = ("+id+")";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
