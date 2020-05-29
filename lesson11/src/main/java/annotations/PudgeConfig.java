package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PudgeConfig {

//	@Bean
//	public Item item() {
//		Item item = new Item("myItem");
//		return item;
//	}

	@Bean
	public Pudge pudge() {
		Pudge pudge = new Pudge();
		return pudge;
	}

	@Bean
	public BootSoftTravel bootSoftTravel() {
		return new BootSoftTravel();
	}

	@Bean
	public Satanic satanic() {
		return new Satanic();
	}
}
