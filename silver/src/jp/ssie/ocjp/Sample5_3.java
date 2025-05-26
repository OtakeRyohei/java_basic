package jp.ssie.ocjp;

public class Sample5_3 {
	
	public static void main(String[] args) {
		
		//佐藤さんのオブジェクトを作成
		Teacher s1 = new Teacher();
		s1.setName("佐藤さん");
		
		//田中さんのオブジェクトを作成
		Teacher s2 = new Teacher();
		s2.setName("田中さん");
		
		//名前の表示
		System.out.println("名前:" + s1.getName());
		System.out.println("名前:" + s2.getName());
	}

}
