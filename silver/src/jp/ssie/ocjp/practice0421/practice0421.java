package jp.ssie.ocjp.practice0421;

import java.util.ArrayList;

public class practice0421 {
	public static void main(String[] args) {
		
		Student s1 = new Student("中田,",45,65,80);
		Student s2 = new Student("野沢,",80,89,72);
		Student s3 = new Student("木村,",23,12,32);
		
		ArrayList<Student> lists = new ArrayList<>();
		
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
		
		Student bunkeiStudent = s1;
		Student rikeiStudent = s1;
		
		int jpn_sum = 0;
		int math_sum = 0;
		int eng_sum = 0;
		
		
		for(Student s : lists) {
			//各生徒のshowメソッドの実行
			s.show();
			
			//文系の比較
			if(bunkeiStudent.bunkei() < s.bunkei()) {
				bunkeiStudent = s;
			}
			
			//理系の比較
			if(rikeiStudent.rikei() < s.rikei()) {
				rikeiStudent = s;
			}
			
			//平均点の計算
			jpn_sum += s.jpn;
			math_sum += s.math;
			eng_sum += s.eng;

		}
		
		System.out.println("文系のトップ =>" + bunkeiStudent.name + ":" + bunkeiStudent.bunkei() + "点");
		System.out.println("理系のトップ =>" + rikeiStudent.name + ":" + rikeiStudent.rikei() + "点");
		System.out.println("平均点 => 国語:" +jpn_sum/3 + "点 数学:" + math_sum/3 + "点 英語:" + eng_sum/3 + "点");
	}

}
