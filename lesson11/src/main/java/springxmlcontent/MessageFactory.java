package springxmlcontent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import springxmlcontent.MessageProvider;
import springxmlcontent.MessageRender;

public class MessageFactory {
	private static MessageFactory instance;

	private MessageRender messageRender;
	private MessageProvider messageProvider;

	public static MessageFactory getInstance() {

		if (instance == null) {
			instance = new MessageFactory();
		}

		return instance;
	}

	public MessageRender getMessageRender() {
		return messageRender;
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

	private MessageFactory() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("D:\\lesson11\\target\\classes\\File.properties"));
			String providerClass = properties.getProperty("provider.class");
			String renderClass = properties.getProperty("render.class");

			try {
				messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();
				messageRender = (MessageRender) Class.forName(renderClass).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
