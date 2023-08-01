package inheritance;

public class Vegetable {
	
	String name;
	String nutriants;
	
	public Vegetable(String name,String nutriants) {
		this.name=name;
		this.nutriants=nutriants;
	}
	public String toString() {
		return name+" "+nutriants;
	}
	

}
