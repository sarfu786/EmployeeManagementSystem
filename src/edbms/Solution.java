package edbms;
//1
import java.util.Scanner;

import customException.InvalidChoiceException;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Employee ManagementSystem");
		System.out.println("-------------------------------------"); 
		EmployeeManagementSystem Ei = new EmployeeManagementSystemImpl();
		while(true) {
			System.out.println("1:addEmployee\n2:displayEmployee\n3:displayAllEmployee\n4:removeEmployee\n5:removeAllEmployees\n6:updateEmployee");
			System.out.println("7:countEmployee\n8:sortEmployee\n9:getEmployeeWithHighestSalaray\n10:getEmployeeWithLowestSalary");
			int choice= sc.nextInt();
			System.out.println("enter your choice");
			
			switch(choice) {
			case 1:Ei.addEmployee();
			break;
			
			case 2:Ei.displayEmployee();
			break;
			
			case 3:Ei.displayAllEmployees();
			break;
			
			case 4:Ei.removeEmployee();
			break;
			
			case 5:Ei.removeAllEmployees();
			break;
			
			case 6:Ei.updateEmployee();
			break;
			
			case 7:Ei.countEmployee();
			break;
			
			case 8:Ei.sortEmployees();
			break;
			
			case 9:Ei.getEmployeeWithHighestSalary();
			break;
			
			case 10:Ei.getEmployeeWithLowestSalary();
			break;
			
			case 11:System.out.println("Thank You");
			System.exit(0);
			
			default:
				try {
					String message="Invalid Choice,Kindly enter Valid choice";
					throw new InvalidChoiceException(message);
				}
				catch(Exception e) {
				System.out.println(e.getMessage())	;			
				}
				
			
			}
			System.out.println("-------------------");
			
		}
		
	}

}
