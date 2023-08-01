package forclass3;

public class UsePen {
	
	public static void main(String[] args) {
		
		Pen pen1 = new Pen();
		pen1.colour = "blue";
		pen1.price = 10;
		pen1.inkType = true;
		pen1.brand = "Camlin";
		
		Pen pen2 = new Pen();
		pen2.colour = "black";
		pen2.price = 12;
		pen2.inkType = false;
		pen2.brand = "Reynolds";
		
		Pen pen3 = new Pen();
		pen3.colour = "red";
		pen3.price = 15;
		pen3.inkType = true;
		pen3.brand = "cello";
		
		Pen [] pens = {pen1,pen2,pen3};
		
		
//		for(int i =0; i<pens.length; i++) {
//			System.out.println("colour: "+pens[i].colour+","+"price: "+pens[i].price+","+"inkType: "+pens[i].inkType+","+"brand: "+pens[i].brand);
//		}
		
	Pen min = pens[0];
	for(int i = 0; i<pens.length; i++) {
		if(min.price>pens[i].price) {
			min=pens[i];
		}
	}System.out.println(min.price);
			
	}

}
