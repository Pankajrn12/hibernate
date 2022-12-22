package com.ibm.jdbc_crud_operation_statement.service;

import com.ibm.jdbc_crud_operation_statement.dao.LaptopDao;
import com.ibm.jdbc_crud_operation_statement.dto.Laptop;

public class LaptopService {
	LaptopDao dao = new LaptopDao();
	public void insertLaptop(Laptop laptop) {
//	if(laptop.getPrice()<=40000) {
		dao.insertLaptop(laptop);
		System.out.println("inserted");
	}
//	else {
//		System.out.println("price is too high");
//	}
//	
//	}

//	public void updateLaptop(Laptop laptop) {
//		// TODO Auto-generated method stub
//		dao.updateLaptop(laptop);
//		System.out.println("updated");
//	}
	public void update1(int id, String name) {
		int id1 = dao.getById(id);
		if(id == id1) {
			dao.update1(id1, name);
		}
		else {
			System.out.println("unvalid");
		}
	}
	
	public void display() {
		
		dao.display();
	}
	
	public void delete(int id) {
		dao.delete(id);
		System.out.println("deleted");
	}
}
