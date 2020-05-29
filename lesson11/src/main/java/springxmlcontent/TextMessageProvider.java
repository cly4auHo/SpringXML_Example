package springxmlcontent;

public class TextMessageProvider implements MessageProvider {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
