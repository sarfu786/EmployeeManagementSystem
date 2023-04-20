package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeByName implements Comparator<Employee> {
	public int compare(Employee x,Employee y) {
		
		return x.getname().compareTo(y.getname());
	}

}
