package graduation.core;

/**
 * @author jiangyukun
 * @since 2014-03-27
 */
public class JsonMessage {
	private String message = "";

	public JsonMessage() {
	}

	public JsonMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
