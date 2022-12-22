package com.ty.jdbc_crud_with_statement.Controller;

import com.ty.jdbc_crud_with_statement.Service.Service;
import com.ty.jdbc_crud_with_statement.dto.Customer;
import java.util.*;

public class Controller {
	public static void main(String args[]) {
		Customer cus = new Customer();
		Service service = new Service();
		Scanner sc = new Scanner(System.in);
		cus.setCustomerId(1);
		cus.setCustomerName("Ravita");
		cus.setCustomerEmail("ravita@gmail.com");
		service.insertion(cus);
		
		
	}
}
