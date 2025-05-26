package jp.ssie.ocjp.practice0422;

public class Word {
	private String ja;
	private String en;
	
	public Word(String j, String e) {
		ja = j;
		en = e;
	}
	
	public void getWord(){
		System.out.println("ja:" + ja + "en:" + en);
	}
	
	public String getJp() {
		return ja;
	}
	
	public String getEn() {
		return en;
	}
	
	public void setWord(String j, String e) {
		ja = j;
		en = e;
	}
	
	public boolean check(String c) {
		if(en.equals(c)) {
			return true;
		}
		else {
			return false;
		}
	}
	 

}
