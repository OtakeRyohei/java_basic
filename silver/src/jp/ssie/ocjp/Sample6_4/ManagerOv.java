package jp.ssie.ocjp.Sample6_4;

public class ManagerOv extends StaffOv{
	
	int salary = 5000000;

	public int getSalary() {
		return salary;
	}

	@Override
	public String getName() {
		return "【マネージャー】" + name;
	}
	
}
