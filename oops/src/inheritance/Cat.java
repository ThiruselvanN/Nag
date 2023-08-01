package inheritance;

public class Cat extends Animal{
	
	String food;
	String sound;
	String colour;
	
	public Cat(String type,int noOfLegs,String food,String sound,String colour) {
		super(type,noOfLegs);
			this.food=food;
			this.sound=sound;
			this.colour=colour;
		}
	
	public String toString() {
		return food+" "+sound+" "+colour+" "+super.toString();
		
	}

}
