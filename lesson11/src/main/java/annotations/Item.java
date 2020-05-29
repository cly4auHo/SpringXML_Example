package annotations;

public class Item {
	private String itemName;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + "]";
	}

	public Item(String itemName) {
		this.itemName = itemName;
	}

	public Item() {
	}
}
