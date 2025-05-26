package jp.ssie.ocjp;

public class Staff {
	int age;
	String name;
	
	String getAge() {
		String sign = "歳";
		return age + sign;
	}
	
	String getName() {
		return name;
	}

}
