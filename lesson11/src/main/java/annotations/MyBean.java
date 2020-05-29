package annotations;

import org.springframework.stereotype.Service;

//@Service("myService")
@Service
public class MyBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyBean(String name) {
		this.name = name;
	}

	public MyBean() {
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}
}
