package student.service;

import studentdao.StudentDao;
import studentdto.Student;

public class StudentService {
	StudentDao dao = new StudentDao();
	public void insert(Student student) {
		dao.insert(student);
		System.out.println("Inserted");
	}

public void delete(int rollno) {
	dao.delete(rollno);
}

public void update(int rollno, String name){
	dao.update(rollno, name);
}

public void display() {
	dao.display();
}
}
