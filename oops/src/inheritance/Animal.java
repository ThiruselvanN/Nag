package inheritance;

public class Animal {
	
	String type;
	int noOfLegs;
	
	public Animal(String type,int noOfLegs) {
		this.type=type;
		this.noOfLegs=noOfLegs;
	}
	public String toString() {
		return type+" "+noOfLegs;
	}

}
