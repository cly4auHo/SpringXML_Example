package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(PudgeConfig.class);

		Pudge pudge = (Pudge) appContext.getBean("pudge");
		System.out.println(pudge);

//		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//		
//		MyBean myBean = (MyBean) appContext.getBean("myBean");
//		System.out.println(myBean);

//		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//		context.load("anno.xml");
//		context.refresh();
//		MyBean myBean = (MyBean) context.getBean("myBean");
//		System.out.println(myBean);
	}
}
