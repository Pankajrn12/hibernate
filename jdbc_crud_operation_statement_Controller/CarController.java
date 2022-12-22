package jdbc_crud_operation_statement_Controller;

import jdbc_crud_operation_statement_Service.CarService;
import java.util.*;

import jdbc_crud_operation_statement_CarDto.CarDto;

public class CarController {
	public static void main(String args[]) {
		CarDto dto = new CarDto();
		CarService service = new CarService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for insertion");
			System.out.println("Press 2 for updation");
			System.out.println("Press 3 for deletion");
			System.out.println("Press 4 for display");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the id of car");
				dto.setId(sc.nextInt());
				System.out.println("Enter the name of car");
				dto.setName(sc.next());
				System.out.println("Enter the price of car");
				dto.setPrice(sc.nextInt());
				System.out.println("Enter the color of car");
				dto.setColor(sc.next());
				service.insert(dto);
				break;
			case 2:
				System.out.println("Enter the id");
				int id = sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the price");
				int price = sc.nextInt();
				service.update(id, name, price);
				break;
				
			case 3:
				System.out.println("Enter thr id");
				int id1 = sc.nextInt();
				service.delete(id1);
				break;
				
			case 4:
				service.display();
				break;
				
			case 5:
				System.out.println("how many cars you want to store");
				int size = sc.nextInt();
				List<CarDto> car = new ArrayList<CarDto>();
				for(int i =0;i<size; i++) {
					CarDto dto1 = new CarDto();
					System.out.println("Enter the car id");
					dto1.setId(sc.nextInt());
					System.out.println("Enter the car name");
					dto1.setName(sc.next());
					System.out.println("Enter the car price");
					dto1.setPrice(sc.nextInt());
					System.out.println("Enter the car color");
					dto1.setColor(sc.next());
					car.add(dto1);
					
				}
				service.insertAddBatch(car);
			}
		}
	}
}
