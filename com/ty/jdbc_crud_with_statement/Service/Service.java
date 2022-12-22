package com.ty.jdbc_crud_with_statement.Service;

import com.ty.jdbc_crud_with_statement.dao.CustomerDao;
import com.ty.jdbc_crud_with_statement.dto.Customer;

public class Service {
	CustomerDao dao = new CustomerDao();
	public void insertion(Customer customer) {
		dao.insertion(customer);
		System.out.println("inserted");
	}
	
}
