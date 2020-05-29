package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public MyBean myBean() {
		MyBean myBean = new MyBean();
		myBean.setName("miniMax");
		return myBean;
	}
}
