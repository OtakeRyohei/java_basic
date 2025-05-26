package jp.ssie.ocjp.packege0423;

public class Fukusyu {
	
	public int rensyu1(){
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public int rensyu2(int j) {
		int sum = 0;
		
		for(int i=1; i<=j; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public void rensyu3(int j) {
		
		for(int i=1; i<=100; i++) {
			if(i%j == 0) {
				System.out.println(i);
			}
		}
	}
}
