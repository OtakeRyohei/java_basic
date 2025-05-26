package jp.ssie.ocjp.sample;

public class Sample4_2 {
	public static void main(String[] args) {
		int[][] array = {
				{1,2,3},
				{4,5,6}
		};
		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				System.out.println("array["+ i +"]["+ j +"]="+ array[i][j]);
//			}
//		}
		
		for(int[] row : array) {
			for(int z : row) {
				System.out.print(z+" ");
			}
		}
	}

}
