package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("thiru");
		names.add("dhana");
		names.add("aji");
		names.add("kumar");
		names.add("doly");
		names.add("rithus");
		names.add("meow");
		names.add("nag");
		names.add("raj");
		names.add("tom");
		
		System.out.println("hgfghj");
		
		names.stream().filter(x -> x.startsWith("a")).forEach(x -> System.out.println(x));
		
		List<String> rNames = names.stream().filter(x -> x.startsWith("r")).collect(Collectors.toList());
		rNames.forEach(x -> System.out.println(x));
		
		long c = names.stream().filter(x -> x.length()>5).count();
		System.out.println(c);
		

		

	}

}
