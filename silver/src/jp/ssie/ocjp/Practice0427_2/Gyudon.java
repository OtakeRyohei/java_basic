package jp.ssie.ocjp.Practice0427_2;

import java.util.Scanner;

public class Gyudon extends Food implements VolumeChange ,Topping{
	
	public Gyudon() {
		super("牛丼",380,"並");
	}
	
	@Override
	public void buy() {
		System.out.println("牛丼の" + super.getVolume() +"は" + super.getPrice() + "円です");
	}
	
	public void addTopping(String topping) {
		System.out.println("牛丼に" + topping + "を追加しました");
		super.setPrice(getPrice() + 100);
		this.buy();
	}
	
	public void setVolume() {
		System.out.println("サイズを選択して下さい");
		System.out.println("0 : 並（380円）");
		System.out.println("1 : 大盛り（550円）");
		System.out.println("2 : 特盛り（700円）");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力=>");
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input) {
		case 0:
			super.setVolume("並");
			super.setPrice(380);
			break;
			
		case 1:
			super.setVolume("大盛り");
			super.setPrice(550);
			break;
			
		case 2:
			super.setVolume("特盛り");
			super.setPrice(700);
			break;
			
		default:
			break;
			
		}
		sc.close();
		
	}
		
}
