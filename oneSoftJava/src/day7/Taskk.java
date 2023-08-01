package day7;

public class Taskk {
	public static void main(String[] args) {
		
		String [] name = {"oslo","bergen","wales","munich","geneva"};
		
		for (int i = 0; i<name.length; i++) {
			
			if(name[i].length()%2==0) {
				System.out.println(name[i]);
			}
		}
		
	}

}
