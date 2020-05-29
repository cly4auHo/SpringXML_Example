package springxmlcontent;

import org.springframework.context.support.GenericXmlApplicationContext;
import springxmlcontent.MessageRender;

public class RenderMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("renderContext.xml");
		context.refresh();

		MessageRender messageRender = (MessageRender) context.getBean("render.class");

		messageRender.render();
	}
}
