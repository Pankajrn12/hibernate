package jdbc_crud_operation_statement_college_controller;
import java.util.*;
import jdbc_crud_operation_statement_college_dto.CollegeDto;
import jdbc_crud_operation_statement_college_service.CollegeService;
public class CollegeController {
	public static void main(String args[]) {
		CollegeDto dto = new CollegeDto();
		CollegeService service = new CollegeService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for insertion");
			System.out.println("Press 2 for updation");
			System.out.println("Press 3 for deletion");
			System.out.println("Press 4 for display");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("how many cars you want to store");
				int size = sc.nextInt();
				List<CollegeDto> college = new ArrayList<CollegeDto>();
				for(int i =0;i<size; i++) {
					CollegeDto dto1 = new CollegeDto();
					System.out.println("Enter the college id");
					dto1.setCollegeId(sc.nextInt());
					System.out.println("Enter the college name");
					dto1.setCollegeName(sc.next());
					System.out.println("Enter the college location");
					dto1.setCollegeLocation(sc.next());
					System.out.println("Enter the college contact");
					dto1.setCollegeContact(sc.next());
					college.add(dto1);
					
				}
				service.insertAddBatch(college);
				break;
			case 2:
				System.out.println("Enter the college id");
				int id = sc.nextInt();
				System.out.println("Enter the college name");
				String name = sc.next();
				
				service.update(id, name);
				break;
				
			case 3:
				System.out.println("Enter the college id");
				int id1 = sc.nextInt();
				service.delete(id1);
				break;
				
			case 4:
				service.display();
				break;
			}
		}
	}
}
