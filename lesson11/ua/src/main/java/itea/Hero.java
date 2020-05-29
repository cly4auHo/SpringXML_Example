package itea;

public class Hero {
	private String name;
	private String ultimate;
	private int lvl;
	int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUltimate() {
		return ultimate;
	}
	public void setUltimate(String ultimate) {
		this.ultimate = ultimate;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public Hero(String name, String ultimate, int lvl) {
		this.name = name;
		this.ultimate = ultimate;
		this.lvl = lvl;
	}
	public Hero() {
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", ultimate=" + ultimate + ", lvl=" + lvl + ", id=" + id + "]";
	}
	
	
	
}
