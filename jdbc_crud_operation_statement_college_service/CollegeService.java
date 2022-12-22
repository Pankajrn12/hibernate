package jdbc_crud_operation_statement_college_service;

import java.util.List;

import jdbc_crud_operation_statement_college_dao.CollegeDao;
import jdbc_crud_operation_statement_college_dto.CollegeDto;

public class CollegeService {
	CollegeDao dao = new CollegeDao();
	public void insertAddBatch(List<CollegeDto> college1 ) {
		dao.insertAddBatch(college1);
	}
	
	public void update(int id, String  name) {
		dao.update(id, name);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
	
	public void display() {
		dao.display();
	}
}
