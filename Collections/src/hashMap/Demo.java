package hashMap;

import java.util.HashMap;

public class Demo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> names = new HashMap<>();
		
		names.put(1, "Thiru");
		names.put(2, "dhana");
		names.put(3, "ajith");
		names.remove(3);
		
//		System.out.println(names.get(1));
//		System.out.println(names.keySet());
//		System.out.println(names.values());
//		System.out.println(names);
		
		for(Integer k : names.keySet()) {
			System.out.println(k+names.get(k));
		}
//		for(String v : names.values()) {
//			System.out.println(v);
//		}
//		for(Integer key : names.keySet()) {
//			System.out.println(names.get(key));
//		}
//		names.keySet().forEach((x)-> System.out.println(x));
//		names.values().forEach((x)-> System.out.println(x));
//		names.keySet().forEach((y)-> System.out.println(names.get(y)));
		//names.keySet().forEach((x)-> System.out.println(x+"="+names.get(x)));
	}

}
