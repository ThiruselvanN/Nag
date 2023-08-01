package encpsulation;

public class UseMobile {
	public static void main(String[] args) {
		
		Sim s1 = new Sim();
		s1.setbrandName("jio");
		s1.setIs5g(true);
		
		Mobile m1 = new Mobile();
		m1.setBrand("redmi");
		m1.setPrice(20000);
		m1.setColor("black");
		m1.setSim(s1);
		
		System.out.println(m1.getBrand()+" "+m1.getPrice()+" "+m1.getColor());
		System.out.println(m1.getSim().getbrandName()+" "+m1.getSim().getIs5g());
	}

}
