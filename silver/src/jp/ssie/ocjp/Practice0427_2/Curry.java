package jp.ssie.ocjp.Practice0427_2;

public class Curry extends Food implements Topping, Spice{
	
	public Curry() {
		super("カレー",500,"並");
	}
	
	@Override
	public void buy() {
		System.out.println("カレーの" + super.getVolume() +"は" + super.getPrice() + "円です");
	}
	
	public void addTopping(String topping) {
		System.out.println("カレーに" + topping + "を追加しました");
		super.setPrice(getPrice() + 100);
		this.buy();
	}
	
	public void setSpice(int spice) {
		System.out.println(spice + "辛に変更しました");
		super.setPrice(getPrice() + spice * 50); 
		this.buy();
	}
}
