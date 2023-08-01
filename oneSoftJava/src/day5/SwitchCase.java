package day5;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		String direction = "north";
		
		switch(direction) {
		case "south" : System.out.println("The direction is south");
		break;
		case "east" : System.out.println("The direction is west");
		break;
		case "north" : System.out.println("The direction is north");
		break;
		case "west" : System.out.println("The direction is west");
		break;
		default : System.out.println("It is not a direction");
		}
	}

}
