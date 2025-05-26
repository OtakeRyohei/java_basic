package jp.ssie.ocjp.repetition;

public class Practice0416_14 {
	public static void main(String[] args) {
		int n =4;
		for(int x=0; x<n; x++) {
			for (int y=0; y<x; y++) {
				System.out.print(" ");
			}
			for (int z=0; z<n-x; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
