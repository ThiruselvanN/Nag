package forclass2;

public class Vowels {
	
	public static void main(String[] args) {
		
		String [] a = {"thiru","bhvv","rithsk","nggssh","fmlyyyee"};
		
		for(int i = 0; i<a.length; i++) {
			if(a[i].contains("a")||a[i].contains("e")||a[i].contains("i")||a[i].contains("o")||a[i].contains("u")) {
				
			System.out.println(a[i]);
			}
			
		}
	
	}

}
