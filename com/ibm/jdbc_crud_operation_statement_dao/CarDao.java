package com.ibm.jdbc_crud_operation_statement_dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.ibm.jdbc_crud_operation_statement_dto.CarDto;

public class CarDao {
	Connection con = null;
	public void insert(CarDto car) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement-car";
			String user = "root";
			String pass = "ravita";
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
