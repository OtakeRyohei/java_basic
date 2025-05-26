package jp.ssie.ocjp.practice_animal;

public class Practice_animal {
	
	public static void main(String[] args) {
		
		Animal dog = new Animal("イヌ",5,10);
		
		dog.eat("魚", 3000);
		dog.run(7);
		dog.makeSound();
	}

}
