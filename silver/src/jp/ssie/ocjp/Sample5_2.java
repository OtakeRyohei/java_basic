package jp.ssie.ocjp;

public class Sample5_2 {
	public static void main(String[] args) {
//		Dog dog1 = new Dog("メロン","柴犬");
//		Dog dog2 = new Dog("ポチ","ミニチュアダックス");
//		Dog dog3 = new Dog("まさお","ラブラドール・レトリーバー");
		
//		ArrayList<Dog> dogs = new ArrayList<>();
//		dogs.add(new Dog("メロン","柴犬"));
//		dogs.add(new Dog("ポチ","ミニチュアダックス"));
//		dogs.add(new Dog("まさお","ラブラドール・レトリーバー"));
		
		Dog[] dogs = {new Dog("メロン","柴犬"),
				new Dog("ポチ","ミニチュアダックス"),
				new Dog("まさお","ラブラドール・レトリーバー")};
		
//		System.out.println("名前は" + dog1.getName() + "で、犬種は" + dog1.getKensyu() + "です");
//		System.out.println("名前は" + dog2.getName() + "で、犬種は" + dog2.getKensyu() + "です");
//		System.out.println("名前は" + dog3.getName() + "で、犬種は" + dog3.getKensyu() + "です");
		
		for(Dog dog : dogs) {
			//System.out.println("名前は" + dog.getName() + "で、犬種は" + dog.getKensyu() + "です");
			dog.showInfo();
		}
		
		System.out.println("数:" + Dog.count + "匹です");
	}

}
