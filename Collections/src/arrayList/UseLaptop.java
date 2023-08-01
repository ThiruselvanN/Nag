package arrayList;

import java.util.ArrayList;

public class UseLaptop {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("hp","black","i7","10gen",50000,8,true);
		
		Laptop l2 = new Laptop("dell","blue","i5","9gen",40000,6,false);
		
		Laptop l3 = new Laptop("lenova","black","i9","10gen",60000,8,false);
		
		Laptop l4 = new Laptop("acer","ash","i7","5gen",4400000,6,false);
		
		Laptop l5 = new Laptop("infinix","black","i7","10gen",42000,8,false);
		
		Laptop l6 = new Laptop("mi","black","i7","8gen",41000,6,false);
		
		Laptop l7 = new Laptop("app","blue","i7","10gen",70000,8,true);
		
		ArrayList <Laptop> laps = new ArrayList<>();
		ArrayList <Laptop> touchLap = new ArrayList<>();
		laps.add(l1);
		laps.add(l2);
		laps.add(l3);
		laps.add(l4);
		laps.add(l5);
		laps.add(l6);
		laps.add(l7);
		
		//System.out.println(laps.get(0).getBrand());
//		
//		for(int i = 0; i<laps.size(); i++) {
//			//System.out.println(laps.get(i));
//		}
//		for(int i = 0; i<laps.size(); i++) {
//			if(laps.get(i).getPrice()>50000 && laps.get(i).getPrice()<100000) {
//				System.out.println(laps.get(i));
//			}
//		}
//        for(Laptop l : laps) {
//        	if(l.getRam()<8) {
//        		System.out.println(l.getBrand());
//        	}
//        }
//		for(int i = 0; i<laps.size(); i++) {
//			if(laps.get(i).getIsTouch()==true) {
//				touchLap.add(laps.get(i));
//			}
//		}
//		System.out.println(touchLap);
		
		laps.forEach((l) -> {   
			if(l.getIsTouch()==true) {
				System.out.println(l.getBrand());
			}
					
		});
	
	}

}
