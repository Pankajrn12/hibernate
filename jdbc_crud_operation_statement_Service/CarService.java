package jdbc_crud_operation_statement_Service;

import java.util.List;

import jdbc_crud_operation_statement_CarDto.CarDto;
import jdbc_crud_operation_statement_Dao.CarDao;

public class CarService {
	CarDao dao = new CarDao();
	public void insert(CarDto car ) {
		dao.insert(car);
		System.out.println("Inserted");
	}
	
	public void update(int id, String  name, int price) {
		dao.update(id, name, price);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
	
	public void display() {
		dao.display();
	}
	
	public void insertAddBatch(List<CarDto> car) {
		dao.insertAddBatch(car);
	}
}
