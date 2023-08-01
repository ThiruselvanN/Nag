package lmsTask;

public class UseStapler {
	public static void main(String[] args) {
		
		Stapler s1 = new Stapler();
		s1.setBrand("thh");
		s1.setPrice(500);
		s1.setColour("black");
		s1.setMaterial("steel");
		
		Stapler s2 = new Stapler();
		s2.setBrand("bhh");
		s2.setPrice(400);
		s2.setColour("blue");
		s2.setMaterial("wood");
		
		Stapler s3 = new Stapler();
		s3.setBrand("kass");
		s3.setPrice(600);
		s3.setColour("white");
		s3.setMaterial("plastic");
		
		Stapler [] ss = {s1,s2,s3};
		for(int i = 0; i<ss.length; i++) {
			System.out.println(ss[i].getBrand()+", "+ss[i].getPrice()+", "+ss[i].getColour()+", "+ss[i].getMaterial());
		}
		
	}

}
