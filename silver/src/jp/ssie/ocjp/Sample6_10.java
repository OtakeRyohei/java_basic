package jp.ssie.ocjp;

public class Sample6_10 {

	public static void main(String[] args) {
		
		Cars a1 = new CarA();
		System.out.println("ライトは" + a1.setLight() + "を取り付けました");
		
		System.out.println();
		
		Cars b1 = new CarB();
		System.out.println("ライトは" + b1.setLight() + "を取り付けました");
		
		Cars [] cars = { new CarA(), new CarB() };
		
		for(Cars car : cars) {
			System.out.println(car.setLight());
		}
	}
}
