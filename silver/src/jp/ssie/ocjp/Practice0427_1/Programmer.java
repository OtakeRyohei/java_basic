package jp.ssie.ocjp.Practice0427_1;

abstract class Programmer extends Human implements Programming{
	
	private int level;
	
	public Programmer(String name, int age, int gender) {
		super(name, age, gender);
	}
	
	public void setLevel() {
		System.out.println(level);
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void showProgramSkills(int sum) {
		if(sum > 80) {
			System.out.println("スキルレベルは[" + sum + ": Java超上級者]です！");
		}
		else if(sum > 60) {
			System.out.println("スキルレベルは[" + sum + ": Java上級者]です！");
		}
		else if(sum > 40) {
			System.out.println("スキルレベルは[" + sum + ": Java中級者]です！");
		}
		else if(sum > 20) {
			System.out.println("スキルレベルは[" + sum + ": Java初級者]です！");
		}
		else {
			System.out.println("スキルレベルは[" + sum + ": Javaかけだし]です！");
		}
	}
	
}