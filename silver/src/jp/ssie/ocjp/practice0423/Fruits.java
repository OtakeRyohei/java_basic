package jp.ssie.ocjp.practice0423;

public class Fruits {
	
	String name;
	String color;
	int price;
	
	public Fruits(String n, String c, int p) {
		name = n;
		color = c;
		price = p;
	}
	
	String getName() {
		return name;
	}
	
	String getColor() {
		return color;
	}
	
	int getPrice() {
		return price;
	}
	
	public void show() {
		System.out.println("名前：" + name + " 色：" + color + " 価格：" + price);
	}
	
}
