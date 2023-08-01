package java8Feautures;

public class UseStringManipulation {
	
	public static void main(String[] args) {
		
		String val = "Dhana";
		
		StringManipulation equal = val::equals;
		System.out.println(equal.manipulate("Dhana"));
		
		StringManipulation start = val::startsWith;
		System.out.println(start.manipulate("D"));
		
	}

}
