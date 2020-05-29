package xmlcontentobjects;

public class Cat extends Animal {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat(String name, int age) {
		super(new Owner());
		this.name = name;
		this.age = age;
	}

	public Cat() {
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}
