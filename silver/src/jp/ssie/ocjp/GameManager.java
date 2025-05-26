package jp.ssie.ocjp;

public class GameManager {
	public static void main(String[] args) {
		
//		Card s1 = new Card(1,'\u2663');
//		Card s2 = new Card(2,'\u2664');
//		Card s3 = new Card(3,'\u2665');
//		Card s4 = new Card(4,'\u2666');

//		s1.show();
//		s2.show();
//		s3.show();
//		s4.show();
		
		Deck s5 = new Deck();
		s5.shuffle();
		s5.getCard(12);
	}

}
