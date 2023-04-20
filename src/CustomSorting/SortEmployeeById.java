package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeById implements Comparator<Employee> {
	
	public int compare(Employee e1,Employee e2) {
		
		return e1.getid().compareTo(e2.getid());
	}

}
