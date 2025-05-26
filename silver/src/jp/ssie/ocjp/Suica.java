package jp.ssie.ocjp;

public class Suica {
	int id;
	int remain;
	String last;
	String first;
	int age;
	String tel;

	public Suica(int id, int remain) {
		this.id = id;
		this.remain = remain;
	}
	
	public Suica(int id, int remain, String last, String first, int age, String tel) {
		this.id = id;
		this.remain = remain;
		this.last = last;
		this.first = first;
		this.age = age;
		this.tel = tel;
	}
	
}
