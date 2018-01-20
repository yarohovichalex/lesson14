package by.htp.FlowerShopLs7;

public class Bud {
	private Leaf leaves[];
	private String color;
	private int size;
	
	public Bud(int size) {
		this.size = size;
		this.color = "green";
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void addFreshLeaves(int num) {
		if(num >= 0) {
			leaves = new Leaf[num];
			for (int i = 0; i < num; i++) {
			leaves[i] = new Leaf("white","elipse");
			}
		}
	}
	
	public void deleteOneLeaves() {
		if(leaves != null) {
			leaves = new Leaf[leaves.length - 1];
			for (int i = 0; i < leaves.length; i++) {
				leaves[i] = new Leaf("white","elipse");
			}
		}		
	}
	
	public void deleteLeaves() {
		leaves = new Leaf[0];
	}

	public Leaf[] getLeaves() {
		return leaves;
	}


}
