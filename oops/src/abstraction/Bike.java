package abstraction;

public class Bike implements Vehicle{
	
	public String color() {
		return "blue";
	}
	
	public int wheel() {
		return 2;
	}
	public int price() {
		return 200000;
	}
	public int milege(int speed) {
		if(speed>80) {
			return 35;
		}
		else {
			return 45;
		}
		
	}

}
