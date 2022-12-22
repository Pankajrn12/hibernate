package jdbc_crud_operation_statement_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CarConnection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/jdbc-crud-operation-statement-car";
			String user = "root";
			String pass = "ravita";
			Connection con = DriverManager.getConnection(url, user, pass);
			if(con!=null) {
				return con;
			}
			else {
				System.out.println("Please check your url");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
}
