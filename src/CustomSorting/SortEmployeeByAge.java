package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeByAge implements Comparator<Employee>{
	
	public int compare(Employee x,Employee y) {
		
		return x.getage()-y.getage();
	}

}
