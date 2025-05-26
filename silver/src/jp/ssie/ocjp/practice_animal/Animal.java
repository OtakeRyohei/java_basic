package jp.ssie.ocjp.practice_animal;

public class Animal {
	
	String name;
	int age;
	double weight;
	
	public Animal(String n, int a, double w) {
		name = n;
		age = a;
		weight = w;
	}
	
	public void eat (String food, double kcal) {
		if(kcal > 1000) {
			weight += 5;
		}
		else if(kcal > 600) {
			weight += 2;
		}
		else if(kcal > 300) {
			weight += 1;
		}
		else if(kcal >100) {
			weight += 0.5;
		}
		else {
			weight += 0;
		}
		
		System.out.println(food + "を食べて" + weight + "kgになりました");
		
	}
	
	public void run (double distance) {
		if(distance > 10) {
			weight -= 5;
		}
		else if(distance > 6) {
			weight -= 2;
		}
		else if(distance > 3) {
			weight -= 1;
		}
		else if(distance >1) {
			weight -= 0.5;
		}
		else {
			weight += 0;
		}
		
		System.out.println(distance + "km走って" + weight + "kgになりました");
		
	}
	
	public void makeSound() {
		System.out.println("泣いています");
		
	}
	

}
