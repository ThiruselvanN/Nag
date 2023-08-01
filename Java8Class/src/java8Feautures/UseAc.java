package java8Feautures;

public class UseAc {
	
	public static void main(String[] args) {
		
		HomeAppliance.onOff(true);
		
		Ac ac1 = new Ac();
		
		System.out.println(ac1.appliance());
	}

}
