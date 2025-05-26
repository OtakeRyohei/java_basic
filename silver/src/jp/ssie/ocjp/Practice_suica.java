package jp.ssie.ocjp;

public class Practice_suica {
	public static void main(String[] args) {
		
		Suica s1 = TicketVendingMachine.publish(1);
		TicketVendingMachine.getInfo(s1);
		
		
		Suica s2 = TicketVendingMachine.publish(1);
		TicketVendingMachine.getInfo(s2);
	}

}
