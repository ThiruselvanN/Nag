package forclass2;

public class VowelsEnhanced {
	
	public static void main(String[] args) {
		
		String [] a = {"thiru","bhvv","rithsk","nggssh","fmlyyyee"};
		
		for(String s : a) {
			
			if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
				System.out.println(s);
				
			}

			
		}
	}

}
