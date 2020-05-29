package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class Pudge {
	
	@Autowired 
	@Qualifier("satanic")
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Pudge(Item item) {
		this.item = item;
	}

	public Pudge() {
	}

	@Override
	public String toString() {
		return "Pudge [item=" + item + "]";
	}
}
