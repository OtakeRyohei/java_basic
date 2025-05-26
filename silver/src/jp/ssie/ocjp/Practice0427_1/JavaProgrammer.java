package jp.ssie.ocjp.Practice0427_1;

import java.util.Scanner;

public class JavaProgrammer extends Programmer{
	
	public JavaProgrammer(String name, int age, int gender) {
		
		super(name, age, gender);
		
	}
	
	public void showProgramSkills(int sum) {
		super.showProgramSkills(sum);
	}
	
	@Override
	public void setLevel() {
		int sum = 0;
		
		String q1 = "1：Silver持っているよ!";
		String q2 = "2：Gold持っているよ!";
		String q3 = "3：JSP/Servletわかるよ!";
		String q4 = "4：Androidアプリ作れるよ!";
		String q5 = "5：String使えるよ!";
		
		boolean[] selected = new boolean[5];
		String[] questions = {q1, q2, q3, q4, q5};
		
        Scanner sc = new Scanner(System.in);
        boolean finish = true;
        
		while(finish) {
			System.out.println("=============================");
			System.out.println( super.name + "のJavaスキルは？");

			for(int i = 0; i < selected.length; i++) {
				if(selected[i] == false) {
					System.out.println(questions[i]);
				}
			}
			System.out.println("9：入力完了");
			System.out.print("あなたのスキル=>");
			
			int input =sc.nextInt();
			switch(input) {
			case 1:
				if(selected[input - 1] == false) {
					sum += 20;
					selected[input - 1] = true;
				}
				break;
				
			case 2:
				if(selected[input - 1] == false) {
					sum += 30;
					selected[input - 1] = true;
				}
				break;
				
			case 3:
				if(selected[input - 1] == false) {
					sum += 30;
					selected[input - 1] = true;
				}
				break;
				
			case 4:
				if(selected[input - 1] == false) {
					sum += 30;
					selected[input - 1] = true;
				}
				break;
				
			case 5:
				if(selected[input - 1] == false) {
					sum += 40;
					selected[input - 1] = true;
				}
				break;
				
			case 9:
				finish = false;
				sc.close();
				break;
			}	
			
		}
		System.out.println("入力完了しました");
		this.showProgramSkills(sum);

	}

}
