package jp.ssie.ocjp.practice0421;

public class Student {
	
	String name;
	int jpn;
	int math;
	int eng;
	static int count;
	
	public Student(String n, int j, int m, int e){
		name = n;
		jpn = j;
		math = m;
		eng = e;
		count++;
	}
	
	public void show(){
		System.out.println("名前:" + name + " 国語:" + jpn + "点" + " 数学:" + math + "点" + " 英語:" + eng + "点");
	}
	
	public int all() {
		int sum = jpn + math + eng;
		return sum;
	}
	
	public int bunkei() {
		int bunkei = jpn + eng;
		return bunkei;
	}
	
	public int rikei() {
		int rikei = math + eng;
		return rikei;
	}
	
	
	
}
