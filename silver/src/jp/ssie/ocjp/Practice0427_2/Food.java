package jp.ssie.ocjp.Practice0427_2;

public abstract class Food {

	private String name;
	private int price;
	private String volume;
	
	public Food(String name, int price, String volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	public String getName() {
		return name;
	}
	
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	public String getVolume() {
		return this.volume;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public abstract void buy();
}
