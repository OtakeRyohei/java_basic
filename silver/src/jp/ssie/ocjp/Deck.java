package jp.ssie.ocjp;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> lists = new ArrayList<>();
	
	public Deck(){
		for(int j=1; j<=13; j++) {
			lists.add(new Card(j,'\u2663'));
		}
		for(int j=1; j<=13; j++) {
			lists.add(new Card(j,'\u2664'));
		}
		for(int j=1; j<=13; j++) {
			lists.add(new Card(j,'\u2665'));
		}
		for(int j=1; j<=13; j++) {
			lists.add(new Card(j,'\u2666'));
		}
	}
	
	void shuffle() {
		Collections.shuffle(lists);
	}
	
	void getCard(int c){
		for(int j=0; j<c; j++) {
			lists.get(j).show();
		}
	}
}


