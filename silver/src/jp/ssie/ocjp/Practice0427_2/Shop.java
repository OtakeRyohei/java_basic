package jp.ssie.ocjp.Practice0427_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	
	ArrayList<Food> menuList = new ArrayList<>();
	
	public void add(Food f) {
		menuList.add(f);
	}
	
	public void select() {
		System.out.println("===メニュー一覧===");
		for(int i = 0; i < menuList.size(); i++) {
			Food f = menuList.get(i);
			System.out.println(i + "：" + f.getName() + "(" + f.getVolume() + "：" + f.getPrice() + "円)");
		}
		System.out.println("==================");
		System.out.print("商品を選んで下さい=>");
		
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		sc.nextLine();
		Food f = menuList.get(ans);
		f.buy();
		sc.close();
		
	}

}
