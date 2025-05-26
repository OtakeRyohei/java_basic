package jp.ssie.ocjp.Appliance;

public class test {
	
	public static void main(String[] args) {
		
		Appliance fridge = new Refrigerator("Panasonic", 150, 300);
        Appliance microwave = new Microwave("Sharp", 1200, 800);
        Appliance washer = new WashingMachine("Toshiba", 500, 7);
        
        System.out.println(fridge.getInfo());
        System.out.println(microwave.getInfo());
        System.out.println(washer.getInfo());

	}

}
