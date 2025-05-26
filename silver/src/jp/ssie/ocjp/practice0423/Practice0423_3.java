package jp.ssie.ocjp.practice0423;

public class Practice0423_3 {
	
	public static void main(String[] args) {
		
		Fruits f1 = new Fruits("みかん","オレンジ",200);
		Fruits f2 = new Fruits("ばなな","黄",100);
		Fruits f3 = new Fruits("りんご","あか",150);
		
		f1.show();
		f2.show();
		f3.show();
		
		FruitsBascket b1 = new FruitsBascket();
		
		b1.put(f3);
		Fruits x = b1.take(0);
		x.show();
	}

}
