package by.htp.FlowerShopLs7;

public class Flower {
	
	private String title;
	private Bud bud;
	private Stem stem;
	private Divination div;
	public Flower(String title) {
		bud = new Bud(2);
		this.title = title;
		stem = new Stem(10, 1);
		
	}
	public String getTitle() {
		return title;
	}
	public Bud getBud() {
		return bud;
	}
	public Stem getStem() {
		return stem;
	}
	public void bloom() {
		this.bud.setSize(12);
		this.bud.setColor("yellow");
		this.bud.addFreshLeaves(3);
	}
	public void withering() {
		this.bud.setSize(bud.getSize()-2);
		this.bud.setColor("black");
		this.bud.deleteLeaves();
	}
	public void grow() {
		this.stem.setHeigth(25);
		this.stem.setWidth(3);		
		this.bud.setSize(8);
	}
	
}
