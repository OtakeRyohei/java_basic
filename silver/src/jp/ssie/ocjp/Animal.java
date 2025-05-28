package jp.ssie.ocjp;

public class Animal {

	private String voice;
	private String name;
	
	public Animal () {
		System.out.println("宮田竜希");
	}
	
	public void setAnimal(String n, String v) {
		name = n;
		voice = v;
	}
	
	public void showAnimal() {
		System.out.println("武0000" + name + "で" + voice + "と鳴きます");
	}
}
