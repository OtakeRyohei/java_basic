package jp.ssie.ocjp;

import java.util.Scanner;

public class TicketVendingMachine {

	static int manageId;
	
	static Suica publish(int type) {
		
		manageId ++;
		
		if(type == 1) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("姓：");
			String last = sc.nextLine();
			
			System.out.print("名：");
			String first = sc.nextLine();
		
			System.out.print("年齢：");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("電話番号：");
			String tel = sc.nextLine();
			
			System.out.print("残高：");
			int remain = sc.nextInt();
			
			sc.close();
			
			Suica s1 = new Suica(manageId,remain,last,first,age,tel);
			
			return s1;
		}
		
		else {
			
			Suica s1 = new Suica(manageId,0);
			
			return s1;
			
		}
		
		
	}
	
	static void getInfo(Suica s) {
		System.out.println("id：" + s.id + "残高：" + s.remain + "姓：" +  s.last + "名：" + s.first + "年齢：" + s.age +"名：" + "電話番号：" + s.tel);
	}
}
