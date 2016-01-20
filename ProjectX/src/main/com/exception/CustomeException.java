package main.com.exception;




public class CustomeException extends RuntimeException{
 
	private static final long serialVersionUID = 1L;

	private String message;
	private String code;
	
	public CustomeException() {
		System.out.println("The custom exception has occured");
	}
	
	public CustomeException(String message) {
		super();
		this.message = message;
	}

	public CustomeException(String message, String code) {
		super();
		this.message = message;
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
