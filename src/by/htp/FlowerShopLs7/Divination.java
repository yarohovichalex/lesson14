package by.htp.FlowerShopLs7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Divination {	
	private String str;
	private String str2;
	
	
	public void choiceOfDivinationOption(Flower flower) {
		Scanner in = new Scanner(System.in);
		int answer = 0;
		int number = 0;
		
		Map<String, Set<String>> map = new HashMap<>();		
		do {
			map.put("1", Divination.satGenerate("Вы купите авто", "Вы не купите авто, сор"));
			map.put("2", Divination.satGenerate("Вы устроитесь на работу", "Вы не устроитесь на работу"));
			map.put("3", Divination.satGenerate("Любит", "Не любит"));
			System.out.println("На что хотите гадать?\n 1 - на авто "
					+ "\n 2 - на работу \n 3 - на любовь\n Введите нужное число");
			try {				
				number = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Вы ввели не верное число ");
				//e.printStackTrace();				
			}	
				
				switch(number) {
				case 1: Divination.toTheCar(flower, map.get("1"));
					System.out.println();
					break;
				case 2: Divination.toWork(flower, map.get("2"));
					System.out.println();
					break;
				case 3: Divination.divinationByLove(flower, map.get("3"));
					System.out.println();
				break;
				default: 
					System.out.println("введено верное число!");
				}					
			System.out.println("Хотите погодать еще?\nда-1\nнет-любое число");
			try {
				answer = in.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Введено неверное число");
			}
					
		}while(answer == 1);
		System.out.println("\nпрограмма окончена");		
	}
	
	public static void toTheCar(Flower flower, Set<String> set) {		
		int numberLeaves = 5 + (int)(Math.random()*9);
		flower.getBud().addFreshLeaves(numberLeaves);				
		int oldNum = numberLeaves;
		if(numberLeaves%2 == 0) {
			for(int i = numberLeaves; i > 0; i--) {
				flower.getBud().addFreshLeaves(--numberLeaves);				
			}
			set.remove("Вы не купите авто, сор");
			flower.getBud().addFreshLeaves(--numberLeaves);
			for(String s: set) {
				System.out.println(s);
			}
		}else {
			for(int i = numberLeaves; i > 0; i--) {
				flower.getBud().addFreshLeaves(--numberLeaves);				
			}
			set.remove("Вы купите авто");
			flower.getBud().addFreshLeaves(--numberLeaves);
			for(String s: set) {
				System.out.println(s);
			}
		}		
	}
	public static void toWork(Flower flower, Set<String> set) {
		int numberLeaves = 5 + (int)(Math.random()*9);
		flower.getBud().addFreshLeaves(numberLeaves);				
		int oldNum = numberLeaves;
		if(numberLeaves%2 == 0) {
			for(int i = numberLeaves; i > 0; i--) {
				flower.getBud().addFreshLeaves(--numberLeaves);				
			}
			set.remove("Вы не устроитесь на работу");
			flower.getBud().addFreshLeaves(--numberLeaves);
			for(String s: set) {
				System.out.println(s);
			}
		}else {
			for(int i = numberLeaves; i > 0; i--) {
				flower.getBud().addFreshLeaves(--numberLeaves);				
			}
			set.remove("Вы устроитесь на работу");
			flower.getBud().addFreshLeaves(--numberLeaves);
			for(String s: set) {
				System.out.println(s);
			}
		}		
	}
	public static void divinationByLove(Flower flower, Set<String> set) {
		int numberLeaves = 5 + (int)(Math.random()*9);
		flower.getBud().addFreshLeaves(numberLeaves);				
		int oldNum = numberLeaves;
		if(numberLeaves%2 == 0) {
			for(int i = numberLeaves; i > 0; i--) {
				flower.getBud().addFreshLeaves(--numberLeaves);				
			}
			set.remove("Не любит");
			flower.getBud().addFreshLeaves(--numberLeaves);
			for(String s: set) {
				System.out.println(s);
			}
		}else {
			for(int i = numberLeaves; i > 0; i--) {
				flower.getBud().addFreshLeaves(--numberLeaves);				
			}
			set.remove("Любит");
			flower.getBud().addFreshLeaves(--numberLeaves);
			for(String s: set) {
				System.out.println(s);
			}
		}
	}
public static Set<String> satGenerate(String str, String str2) {
		
	Set<String> set = new HashSet<>();	
		set.add(str);
		set.add(str2);
		
	return set;
}	
}
