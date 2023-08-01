package day7;

public class Taskkk {
	
	public static void main(String[] args) {
		
		String [] name = {"oslo","bergen","wales","munich","geneva"};
		String max = name[0];
		
		for(int i = 0 ; i<name.length; i++) {
			if(name[i].length()>=max.length()) {
				max = name[i];
				
			}
			
		}System.out.println(max);
	}

}
