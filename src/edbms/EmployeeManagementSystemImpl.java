package edbms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customException.EmployeeNotFoundException;
import customException.InvalidChoiceException;

//3
public class EmployeeManagementSystemImpl implements EmployeeManagementSystem{
	
	
	Scanner sc = new Scanner(System.in);
	Map<String, Employee> db = new LinkedHashMap<>();
	@Override
	public void addEmployee() {
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the age");
		int age = sc.nextInt();
		System.out.println("enter the salary");
		double Sal = sc.nextDouble();
		Employee emp = new Employee( name, age, Sal);
		db.put(emp.getid(), emp);
		System.out.println("employee record inserted succesfully");
		System.out.println("employee id is "+emp.getid());

	}
	@Override
	public void displayEmployee() {
          System.out.println("enter the employee id");
          String id = sc.next();
          id=id.toUpperCase();
          if(id.contains(id)) {
//        	  System.out.println(db.get(id));
        	  Employee emp = db.get(id);
        	  System.out.println("employee details are as follows");
        	  System.out.println("--------------------------------");
        	  System.out.println("Id: "+emp.getid());
        	  System.out.println("name"+emp.getname());
        	  System.out.println("Age"+emp.getname());
        	  System.out.println("Salary"+emp.getSal());
//        	  System.out.println(emp);
          }
          else {
        	  String message ="Kindly enter vaid Employeee id";
        	  try {
        	  throw new EmployeeNotFoundException(message);
          }
        	  catch(Exception e) {
        		  System.out.println(e.getMessage());
        	  }
          }
	}
	@Override
	public void displayAllEmployees() {
		System.out.println("Employee Details Are as Follows");
		System.out.println("------------------------------");
		Set<String> keys=db.keySet();
		for(String key:keys) {
			System.out.println(db.get(key));
			
		}

	}
	@Override
	public void removeEmployee() {
		System.out.println("Enter Employee Id");
		String id = sc.next().toUpperCase();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Employee Record Deleted Succesfully!");
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee with Id "+id+" is not found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void removeAllEmployees() {
		if(db.size()!=0) {
			System.out.println("Available Employee Records:"+db.size());
			db.clear();
			System.out.println("All employee Object Removed");
		}
		else {
			try {
				throw new EmployeeNotFoundException("No Employee Record to delete");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		

	}
	@Override
	public void updateEmployee() {
		System.out.println("Enter Student Id");
		String id = sc.nextLine().toUpperCase();
		if(db.containsKey(id)) {
			Employee emp = db.get(id);
			System.out.println("1:update Age\n2:update name\n3:update salary");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1: 
				System.out.println("enter age");
				int age = sc.nextInt();
				emp.setage(age);
				System.out.println("Age Updated Suceesfully");
				break;
			case 2:
				System.out.println("Enter Name");
				String name= sc.next();
				emp.setname(name);
				System.out.println("Name updtaed succesfully");
				break;
			case 3:
				System.out.println("Enter salary");
				double sal = sc.nextDouble();
				emp.setSal(sal);
				System.out.println("Sal updated succesfully");
				break;
				
				default:
					try {
						throw new InvalidChoiceException("kindly enter valid choice");
					}
					catch(Exception e) {
						
						System.out.println(e.getMessage());
					}

			}
			
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee with id"+id+"is not found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		

	}
	@Override
	public void countEmployee() {
		System.out.println("the count of employees are"+db.size());
		
		

	}
	@Override
	public void sortEmployees() {
		       Set<String> keys=db.keySet();
		       List<Employee>list = new ArrayList<>();
		       for(String key:keys) {
		    	   Employee emp = db.get(key);
		    	   list.add(emp);
		    	   
		       }
		       System.out.println("1:sort employee by Id\n2:Sort Employee by name\n3:Sort EMployee by Age\n4:Sort employee by salary");
		       System.out.println("Enter Choice");
		       int choice = sc.nextInt();
		       switch(choice) {
		       
		       case 1: 
		    	   
		    	   break;
		       case 2:
		    	   
		    	   break;
		       case 3:
		    	   
		    	   break;
		    	   default:
		    		   try {
		    			   throw new  InvalidChoiceException("kindly ENter Valid Choice");
		    		   }
		    		   catch(Exception e) {
		    			   System.out.println(e.getMessage());
		    		   }
		       
		       
		       }
		       
		       
		

	}
	public static void helper(List<Employee>list) {
		for(Employee key:list) {
			System.out.println(key);
			
		}
		
	}
	
	@Override
	public void getEmployeeWithHighestSalary() {

	}
	@Override
	public void getEmployeeWithLowestSalary() {

	}

}
