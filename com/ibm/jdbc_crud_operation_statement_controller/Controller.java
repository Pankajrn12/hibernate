package com.ibm.jdbc_crud_operation_statement_controller;
import java.util.*;
import com.ibm.jdbc_crud_operation_statement_dto.Teacher;
import com.ibm.jdbc_crud_operation_statement_service.Service;

public class Controller {
	public static void main(String args[]) {
		Teacher th = new Teacher();
		Service teacherservice = new Service();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for insertion");
			System.out.println("Press 2 for updation");
			System.out.println("Press 3 for display");
			System.out.println("Press 4 for deletion");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter the laptop id");
				th.setId(sc.nextInt());
				System.out.println("Enter the laptop name");
				th.setName(sc.next());
				System.out.println("Enter the Email ");
				th.setEmail(sc.next());
				System.out.println("Enter the phone");
				th.setPhone(sc.nextInt());
				teacherservice.insertTeacher(th);
			}break;
			case 2:{
				System.out.println("Enter the laptop id");
				th.setId(sc.nextInt());
				System.out.println("Enter the laptop name");
				th.setName(sc.next());
				teacherservice.updateTeacher(th);
			
			}break;
			case 3:
			{
				teacherservice.display();
			}break;
			case 4:
			{
				System.out.println("enter the id");
				int id = sc.nextInt();
				teacherservice.delete(id);
			}break;
				
			}
	}

	}
}
	