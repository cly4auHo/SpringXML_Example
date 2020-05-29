package springxmlcontent;

public class ConsoleMessageRender implements MessageRender{
	
	private MessageProvider message;

	@Override
	public void render() {
		System.out.println(message.getMessage());
	}

	@Override
	public void setMessage(MessageProvider mProvider) {
		this.message = mProvider;	
	}	
}
