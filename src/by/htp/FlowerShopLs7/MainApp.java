package by.htp.FlowerShopLs7;

public class MainApp {

	public static void main(String[] args) {
		//blinov 126 #16
		
		Flower flower = new Flower("Cammomile");
		Divination div = new Divination();
		System.out.println();
		System.out.println();
		printFlower("New Flower was born ", flower);
		
		flower.grow();
		printFlower("Flower grown", flower);
		flower.bloom();
		printBloomingFlower(flower);
		//flower.withering();
		//printWitheringFlower(flower);
		div.choiceOfDivinationOption(flower);



	}
	private static void printWitheringFlower(Flower flower) {
		System.out.println("the flower is withering ");
		System.out.println("new bad color: " + flower.getBud().getColor());
		printBudLeaves(flower.getBud());
	}
	private static void printBloomingFlower(Flower flower) {
		System.out.println("the flower is blooming ");
		System.out.println("new bad color: " + flower.getBud().getColor());
		printBudLeaves(flower.getBud());
	}
	private static void printBudLeaves(Bud bud) {
		Leaf[] leaves = bud.getLeaves();
		if(bud!=null && leaves != null) {
			for (Leaf leaf: leaves) {
				System.out.println(" Leaf color shape " + leaf.getColor()+ ", "+ leaf.getShape());
			}
		}
		System.out.println("===========================");
	}
	private static void printFlower(String message, Flower flower) {
		System.out.println(message);
		System.out.println("Flower title " + flower.getTitle());
		System.out.println("stem " + flower.getStem());
		System.out.println("bud size, color " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
		System.out.println("===========================");


	}

}
