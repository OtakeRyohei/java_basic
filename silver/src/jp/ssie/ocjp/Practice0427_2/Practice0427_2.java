package jp.ssie.ocjp.Practice0427_2;

public class Practice0427_2 {

	public static void main(String[] args) {
		
		Gyudon g1 = new Gyudon();
		Curry c1 = new Curry();
		Shop s1 = new Shop();
		
		s1.add(c1);
		s1.add(g1);
		
		//s1.select();
		
		g1.setVolume();
		g1.addTopping("たまご");
		
		c1.addTopping("チーズ");
		c1.setSpice(3);
		
	}
}
