package lmsTask;

public class UseTelephone {
	
	public static void main(String[] args) {
		
		Telephone t1 = new Telephone();
		t1.setBrand("thh");
		t1.setPrice(2000);
		t1.setColor("black");
		t1.setIswireless(false);
		
		Telephone t2 = new Telephone();
		t2.setBrand("bhh");
		t2.setPrice(2500);
		t2.setColor("blue");
		t2.setIswireless(true);
		
		Telephone t3 = new Telephone();
		t3.setBrand("kas");
		t3.setPrice(3000);
		t3.setColor("yellow");
		t3.setIswireless(true);
		
		
		Telephone [] tt = {t1,t2,t3};
		int count = 0;
		for(int i = 0; i<tt.length; i++) {
			System.out.println(tt[i].getBrand());
			if(tt[i].getIswireless()==false) {
				count = count+1;
			}
		}
			System.out.println(count);
		
	}

}
