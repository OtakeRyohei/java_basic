package jp.ssie.ocjp.packege0423;

public class Drink {

	private String name;
	private int volume;
	
	public Drink(String n, int v) {
		name = n;
		volume = v;
	}
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
		return name;
	}
	
	void setVolume(int v) {
		volume = v;
	}
	
	int getVolume() {
		return volume;
	}
	
	public void show() {
		System.out.println(name + "：" + "残り" + volume + "ml");
	}
	
	public void consume(int v) {
		volume -= v;
		
		if(volume < 0) {
			volume = 0;
		}
	}
	
}
