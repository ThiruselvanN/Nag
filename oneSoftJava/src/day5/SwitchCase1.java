package day5;

public class SwitchCase1 {
	
	public static void main(String[] args) {
		
		String days = "friday";
		
		switch (days) {
		case "monday" : System.out.println("its monday");
		break;
		case "tuesday" : System.out.println("its tuesday");
		break;
		case "wednesday" : System.out.println("its wednesday");
		break;
		case "thursday" : System.out.println("its thursday");
		break;
		case "friday" : System.out.println("its friday");
		break;
		case "saturday" : System.out.println("its saturday");
		break;
		case "sunday" : System.out.println("its sunday");
		break;
		default : System.out.println("its not a day");
		}
	}

}
