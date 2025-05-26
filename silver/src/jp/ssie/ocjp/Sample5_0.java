package jp.ssie.ocjp;

public class Sample5_0 {
	public static void main(String[] args) {
		Staff s1 = new Staff();
		
		s1.age = 12;
		s1.name ="佐藤";
		
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
	}

}
