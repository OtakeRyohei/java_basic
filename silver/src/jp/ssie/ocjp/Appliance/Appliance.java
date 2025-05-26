package jp.ssie.ocjp.Appliance;

public class Appliance {
	
	String brand;
	int power;
	boolean swch;
	
	public Appliance(String b, int p){
		this.brand = b;
		this.power = p;
	}
	
	public void turnOn() {
		swch = true;
	}
	
	public void turnOff() {
		swch = false;
	}
	
	public String getInfo() {
		return "ブランド：" + brand + "\n" + "消費電力：" + power + "w\n";
	}

	
}
