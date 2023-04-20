package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeBySal implements Comparator<Employee>{
	
	public int compare(Employee x,Employee y) {
		Double i=x.getSal();
		Double j = y.getSal();
		return i.compareTo(j);
	}

}
//return x.getsalary().compareTo(y.getsalary());->getsalary() returns Double
