package jp.ssie.ocjp.Appliance;

public class Refrigerator extends Appliance {
	
	int size;
	
	public Refrigerator(String brand, int power, int s) {
		super(brand, power);
		this.size = s;
	}
	
	@Override
	public String getInfo() {
		String s1 = super.getInfo();
		
		s1 += "冷蔵庫の容量：" + this.size + "L\n";
		
		return s1;
	}
}
