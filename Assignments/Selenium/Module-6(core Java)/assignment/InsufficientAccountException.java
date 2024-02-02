package assignment;

public class InsufficientAccountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String message;

	public InsufficientAccountException(String message) {
		this.message = message;

	}

	public String getMessage() {

		return this.message;
	}

}
