package jp.ssie.ocjp.Appliance;

public class Microwave extends Appliance{
	
	int price;
	
	public Microwave(String brand, int power, int p) {
		super(brand, power);
		this.price = p;
	}

	@Override
	public String getInfo() {
		String s1 = super.getInfo();
		
		s1 += "電子レンジの値段：" + this.price + "万円\n";
		
		return s1;
	}
	
	public void turnOn(int s) {
		System.out.println(s + "秒後に電源を入れる");
		swch = true;
	}
}
