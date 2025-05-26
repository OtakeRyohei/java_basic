package jp.ssie.ocjp.array;

public class Practice0420_4 {
	public static void main(String[] args) {
		int [][] arrays = {
				{1,2,3,4,5,6,7,8,9},
				{2,4,6,8,10,12,14,16,18},
				{3,6,9,12,15,18,21,24,27},
				{4,8,12,16,20,24,28,32,36},
				{5,10,15,20,25,30,35,40,45},
				{6,12,18,24,30,36,42,48,54},
				{7,14,21,28,35,42,49,56,63},
				{8,16,24,32,40,48,56,64,72}
		};
		
		for(int[] row : arrays) {
			for(int z : row) {
				if(z<10) {
					System.out.print("  "+ z);
				}else {
					System.out.print(" "+z);
				}
			}
			System.out.println();
		}
	}

}
