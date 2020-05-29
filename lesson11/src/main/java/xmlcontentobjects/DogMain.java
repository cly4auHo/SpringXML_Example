package xmlcontentobjects;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DogMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("appContext.xml");
		context.refresh();
		Animal animal = (Animal) context.getBean("dog");
				
		System.out.println(animal);
			
//		System.out.println(dog);
//		System.out.println(dog2);
	}
}
