package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Methods {
	public static void main(String[] args) {
		
		Set<Object> s = new TreeSet<Object>();
		
		//add 
		s.add(12);
		s.add(4);
		s.add(34);
		s.add(5);
		System.out.println("s: "+s);
		
		//size
		int a = s.size();
		System.out.println("size: "+a);
		
		//contains
		boolean b = s.contains(5);
		System.out.println("contains: "+b);
		
		//clear
//		s.clear();
//		System.out.println("s: "+s);
		
		//isEmpty
		boolean c = s.isEmpty();
		System.out.println("isEmpty: "+c);
		
		Set<Object> s1 = new HashSet <Object>();
		s1.add(6);
		s1.add(12);
		s1.add(5);
		s1.add(26);
		System.out.println("s1: "+s1);
		
		//addAll
	//	s.addAll(s1);
	//	System.out.println("addAll: "+s);
		
		//retainAll
	//	s.retainAll(s1);
	//	System.out.println("retainAll: "+s);
		
		//removeAll
	//	s.removeAll(s1);
	//	System.out.println("removeAll: "+s);
		
		//remove
		s.remove(5);
		System.out.println("remove: "+s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
