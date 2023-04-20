package customException;
//4
public class InvalidChoiceException extends RuntimeException {
	
	private String message;
	
	public InvalidChoiceException(String message) {
		this.message= message;
	}
	
	public String getmessage() {
		return message;
	}

}
