package jp.ssie.ocjp;

public class Card {
	
	int num; 
	char mark;
	
	Card(int n, char m){
		num = n;
		mark = m;
	}
	
	void show() {
		System.out.println(mark + ":" + num);
	}

}
