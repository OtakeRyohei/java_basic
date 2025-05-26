package jp.ssie.ocjp.packege0423;

public class Practice0423_2 {
	public static void main(String[] args) {
		
		Drink wtr = new Drink("水",500);
		
		wtr.show();
		wtr.consume(100);
		wtr.show();
		wtr.consume(300);
		wtr.show();
		wtr.consume(300);
		wtr.show();
	}
	
}
