

package com.ibm.jdbc_crud_operation_statement.controller;

import java.util.Scanner;

import com.ibm.jdbc_crud_operation_statement.dto.Laptop;
import com.ibm.jdbc_crud_operation_statement.service.LaptopService;

public class Controller {
	public static void main(String args[]) {
		Laptop laptop = new Laptop();
		LaptopService laptopservice = new LaptopService();
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
				laptop.setId(sc.nextInt());
				System.out.println("Enter the laptop name");
				laptop.setName(sc.next());
				System.out.println("Enter the price ");
				laptop.setPrice(sc.nextDouble());
				System.out.println("Enter the color");
				laptop.setColor(sc.next());
				laptopservice.insertLaptop(laptop);
			}break;
			case 2:{
				System.out.println("Enter the laptop id");
				int id = sc.nextInt();
//				laptop.setId(sc.nextInt());
				System.out.println("Enter the laptop name");
				String name = sc.next();
//				laptop.setName(sc.next());
				laptopservice.update1(id, name);
			
			}break;
			case 3:
			{
				laptopservice.display();
			}break;
			case 4:
			{
				System.out.println("enter the id");
				int id = sc.nextInt();
				laptopservice.delete(id);
			}break;
				
			}
			
				
			
		}
	}
}
