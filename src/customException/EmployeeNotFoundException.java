package customException;

public class EmployeeNotFoundException extends Exception {
	String message;
	public EmployeeNotFoundException(String message) {
		
		this.message= message;
	}
	public String getmessage() {
		return message;
	}
	
	

}
