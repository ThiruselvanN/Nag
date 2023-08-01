package lmsTask;

public class UseSketch {
	public static void main(String[] args) {
		
		Sketch s1 = new Sketch();
		s1.setBrand("thh");
		s1.setPrice(50);
		s1.setColor("black");
		s1.setMaterial("plastic");
		
		Sketch s2 = new Sketch();
		s2.setBrand("bhh");
		s2.setPrice(60);
		s2.setColor("blue");
		s2.setMaterial("wooden");
		
		Sketch s3 = new Sketch();
		s3.setBrand("kas");
		s3.setPrice(70);
		s3.setColor("red");
		s3.setMaterial("normal");
		
		Sketch [] ss = {s1,s2,s3};
		
		for(int i = 0; i<ss.length; i++) {
			System.out.println(ss[i].getBrand());
		}
	}

}
