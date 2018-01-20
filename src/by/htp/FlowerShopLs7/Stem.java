package by.htp.FlowerShopLs7;

public class Stem {
	
	private int heigth;
	private int width;
	
	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Stem(int heigth, int width) {
		this.heigth = heigth;
		this.width = width;
		
	}
	
	@Override
	public String toString() {
		return "width " + getWidth() + ", heigth " + getHeigth(); 
	}
	
}
