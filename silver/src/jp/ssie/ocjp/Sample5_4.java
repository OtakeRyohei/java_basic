package jp.ssie.ocjp;

public class Sample5_4 {
	public static void main(String[] args) {
		MetTest mt = new MetTest();
		MetTest.metTest1(mt);
		
		System.out.println();
		
		//mt.metTest1(mt);
		mt.metTest2();
	}

}

class MetTest{
	
	int number;
	static void metTest1(MetTest m1) {
		System.out.println(m1.number);
		System.out.println("staticメソッドが呼ばれました");
	}
	void metTest2() {
		System.out.println(number);
		System.out.println("インスタンスメソッドが呼ばれました");
	}
}
