package composition;

public class UseCar {

	public static void main(String[] args) {
		
		Engine e1 = new Engine();
		e1.Stokes = 4;
		e1.isPetrol = true;
		
		Car c1 = new Car();
		c1.brand = "Audi";
		c1.color = "Black";
		c1.price = 5000000;
		c1.cc = 2000;
		c1.engine = e1;
		
		System.out.println(c1.brand+" "+c1.color+" "+c1.price+" "+c1.cc+" "+c1.engine.Stokes+" "+c1.engine.isPetrol);
	}
}
