package java8Feautures;

public interface Vehicle {
	
	public default int calculateSpeed(int cc) {
		return cc;
	}
	public static String engineType() {
		return "All vehicles are combustion engine";
	}
	public String fuelUsage();
	

}
