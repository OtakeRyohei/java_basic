package jp.ssie.ocjp;

public class Athlete {
	
	int athlete_id;
	String name1;
	String name2;
	int event_id;
	String gender;
	
	public Athlete(int athlete_id, String name1, String name2, int event_id, String gender) {
		this.athlete_id = athlete_id;
		this.name1 = name1;
		this.name2 = name2;
		this.event_id = event_id;
		this.gender = gender;
	}
	
	public String getName1() {
		
		return name1;

	}
	
	
}
