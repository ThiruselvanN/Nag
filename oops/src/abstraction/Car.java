package abstraction;

public class Car implements Vehicle{
	
	
	public String color() {
		return "black";
	}
	public int wheel() {
		return 4;
	}
	public int price() {
		return 1000000;
	}
	//int speed =90;
	public int milege(int speed) {
		if(speed>100) {
			return 20;
		}
		else {
			return 25;
		}
	}

	
	

}
