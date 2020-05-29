package xmlcontentobjects;

public class Animal {
	protected Owner owner;

	public Animal(Owner owner) {
		this.owner = owner;
	}

	public Animal() {
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
