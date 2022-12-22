package studentdao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import studentdto.Student;

public class StudentDao {
	public void insert(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/new_student";
			String user = "root";
			String pass = "ravita";
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String insert = "insert into std values("+student.getRollno()+",'"+student.getName()+"','"+student.getCity()+"')";
			stmt.execute(insert);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(int rollno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/new_student";
			String user = "root";
			String pass = "ravita";
			Connection con = DriverManager.getConnection(url, user, pass);
			String del = "DELETE FROM std WHERE rollno = "+rollno+"";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(del);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(int rollno, String name){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/new_student";
			String user = "root";
			String pass = "ravita";
			Connection con = DriverManager.getConnection(url, user, pass);
			String update = "UPDATE std SET name = '"+name+"' WHERE rollno = ("+rollno+")";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(update);
			System.out.println("data is updated");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void display() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3307/new_student";
			String user = "root";
			String pass = "ravita";
			Connection con = DriverManager.getConnection(url, user, pass);
			String dis = "SELECT * FROM std";
			Statement stmt = con.createStatement();
			ResultSet resultset = stmt.executeQuery(dis);
			while(resultset.next()) {
				System.out.println("RollNo = "+resultset.getInt("rollno"));
				System.out.println("name = "+resultset.getString("name"));
				System.out.println("City = "+resultset.getString("city"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
