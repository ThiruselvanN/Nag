package java8Feautures;

public interface HomeAppliance {
	
	public static void onOff(boolean isOn) {
		if(isOn==true) {
			System.out.println("working");
		}
		else {
			System.out.println("not working");
		}
	}

}
