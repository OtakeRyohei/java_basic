package jp.ssie.ocjp.repetition;

public class Practice0416_13 {
	public static void main(String[] args) {
		int n = 4;
		
		for(int x=1; x<=n; x++) {
			for(int y=0; y<n-x; y++) {
				System.out.print(" ");
			}
			for(int z=0; z<x; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
