package lmsTask;

public class UsePrinter {
	
	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		p1.setBrand("td");
		p1.setModel("nb");
		p1.setColor("black");
		p1.setPrice(6000);
		//System.out.println(p1.getBrand());
		Printer p2 = new Printer();
		p2.setBrand("dt");
		p2.setModel("bn");
		p2.setColor("blue");
		p2.setPrice(4500);
		
		
		Printer [] p = {p1,p2};
	
		for(int i = 0; i<p.length; i++) {
			if(p[i].getPrice()>5000) {
			System.out.println(p[i].getPrice());
			}		
		}
		
		
	}
}
