package com.ibm.jdbc_crud_operation_statement_service;

import com.ibm.jdbc_crud_operation_statement_dao.TeacherDao;
import com.ibm.jdbc_crud_operation_statement_dto.Teacher;

public class Service {
	TeacherDao dao = new TeacherDao();
	public void insertTeacher(Teacher teacher) {
		dao.insertTeacher(teacher);
		System.out.println("data is inserted");
	}
	public void updateTeacher(Teacher teacher) {
		dao.updateTeacher(teacher);
		System.out.println("data is updated");
	}
	public void display() {
		dao.display();
		System.out.println("data is displayed");
	}
	public void delete(int id) {
		dao.delete(id);
		System.out.println("data is deleted");
	}
}
