package student.controller;

import student.service.StudentService;
import studentdto.Student;
import java.util.*;

public class Controller {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StudentService src = new StudentService();
		Student st = new Student();
		
		while(true) {
			System.out.println("Press 1 for Insertion");
			System.out.println("Press 2 for Deletion");
			System.out.println("Press 3 for Updation");
			System.out.println("Press 4 for Display");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the RollNo");
				st.setRollno(sc.nextInt());
				System.out.println("Enter the name");
				st.setName(sc.next());
				System.out.println("Enter the city");
				st.setCity(sc.next());
				src.insert(st);
				break;
				
			case 2:
				System.out.println("Enter the rollNo");
				int rollNo = sc.nextInt();
				src.delete(rollNo);
				break;
				
			case 3:
				System.out.println("Enter the roll no");
				int rollno = sc.nextInt();
				System.out.println("Enter the name of student");
				String name = sc.next();
				src.update(rollno, name);
				break;
			case 4:
				src.display();
				break;

			}
		}
	}
}
