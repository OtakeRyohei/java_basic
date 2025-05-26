package jp.ssie.ocjp.repetition;

public class Practice0416_12 {
	public static void main(String[] args) {
		int n = 4;
		for (int x=0; x<n; x++) {
			for (int y=1; y<=n-x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
