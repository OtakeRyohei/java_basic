package jp.ssie.ocjp;

class Human{
	
	private String name = "名無し";
	private int age = 0;
	
	public void setData() {
		
	}
	
	public void setData(String n) {
		name = n;
	}
	
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	public void showData() {
		System.out.println("名前は" + name + "さんです。年齢は" + age + "歳です。");
	}
}

public class Sample6_2 {
	
	public static void main(String[] args) {
		Human h1 = new Human();
		
		h1.setData();
		h1.showData();
		
		h1.setData("高橋");
		h1.showData();
		
		h1.setData("鈴木",25);
		h1.showData();
	}
}
