package springxmlcontent;

public class App {
	public static void main(String[] args) {
		MessageFactory messageFactory = MessageFactory.getInstance();
		MessageProvider messageProvider = messageFactory.getMessageProvider();
		MessageRender messageRender = messageFactory.getMessageRender();

		messageRender.setMessage(messageProvider);
		messageRender.render();
	}
}
