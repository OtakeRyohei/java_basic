package jp.ssie.ocjp.sample;

public class Sample3_3 {
	public static void main(String[] args) {
		int x = 65;
		if (x == 100) {
			System.out.println("満点です！");
		}
		else if (x >= 80) {
			System.out.println("合格です！");
		}
		else if (x >= 60) {
			System.out.println("がんばりました。");
		}
		else {
			System.out.println("もっとがんばりましょう。");
		}
	}

}
