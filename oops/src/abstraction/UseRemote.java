package abstraction;

public class UseRemote {
	public static void main(String[] args) {
		
		AcRemote rem = new AcRemote();
		System.out.println(rem.baterryLife());
		System.out.println(rem.findDistance());
		System.out.println(rem.OnOffSwitch());
	}

}
