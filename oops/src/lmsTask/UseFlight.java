package lmsTask;

public class UseFlight {
	public static void main(String[] args) {
		
		Flight f1 = new Flight();
		f1.setBrand("thh");
		f1.setPrice(50000000);
		f1.setColor("red");
		f1.setMaterial("steel");
		f1.setNoOfSeats(500);
		
		Flight f2 = new Flight();
		f2.setBrand("bhh");
		f2.setPrice(60000000);
		f2.setColor("white");
		f2.setMaterial("copper");
		f2.setNoOfSeats(800);
		
		Flight f3 = new Flight();
		f3.setBrand("kas");
		f3.setPrice(70000000);
		f3.setColor("blue");
		f3.setMaterial("gold");
		f3.setNoOfSeats(1000);
		
		Flight [] ff = {f1,f2,f3};
		for(int i = 0; i<ff.length; i++) {
			System.out.println(ff[i].getBrand());
		}
		for(int i = 0; i<ff.length; i++) {
			if(ff[i].getNoOfSeats()>800) {
		     System.out.println("Super Jumbo");
			}
		     else {
			 System.out.println("minimum Seat");
			}
			
		}
	}

}
