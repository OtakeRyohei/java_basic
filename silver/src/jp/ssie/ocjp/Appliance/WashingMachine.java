package jp.ssie.ocjp.Appliance;

public class WashingMachine extends Appliance{
	
	int weight;
	
	public WashingMachine(String brand, int power, int w) {
		super(brand, power);
		this.weight = w;
	}
	
	@Override
	public String getInfo() {
		String s1 = super.getInfo();
		
		s1 += "洗濯機の重量：" + this.weight + "kg\n";
		
		return s1;
	}
}
