package jp.ssie.ocjp.Sample6_4;

public class Sample6_4 {
	
	public static void main(String[] args) {
		StaffOv s1 = new StaffOv();
		System.out.println("-----------スーパークラス-----------");
		System.out.println("名前：" + s1.getName());
		
		System.out.println();
		
		ManagerOv m1 = new ManagerOv();
		System.out.println("-----------サブクラス-----------");
		m1.setName("田中");
		System.out.println("名前：" + m1.getName());
		System.out.println("給与：" + m1.getSalary());
		
	}
}
