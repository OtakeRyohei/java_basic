package excercise;

public class AbSample2 extends AbSample {
	
	String name;
	String  from;
	int age;
	String[] favorite = new String [3];

	public void setName(String name) {
		this.name = name;
	}
	
//	public String getName() {
//		return this.name;
//	}
	
	public void name() {
		System.out.println("名前は" + name + "です");
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
//	public String getFrom() {
//		return this.from;
//	}
	
	public void from() {
		System.out.println("出身地は" + from + "です");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
//	public int getAge() {
//		return this.age;
//	}
	
	public void age() {
		System.out.println("年齢は" + age + "歳です");
	}
	
	public void setFavorite(String f, String s, String t) {
		favorite[0] = f;
		favorite[1] = s;
		favorite[2] = t;
	}
	
	public void favorite() {
		for(String f : favorite) {
			System.out.println("好きなもの" + f + "です");
		}
	}
	
}
