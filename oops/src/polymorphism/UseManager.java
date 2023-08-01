package polymorphism;

public class UseManager {
	
	public static void main(String[] args) {
		
		Manager m = new Manager("thiru",26,1192,40000,10000);
		
		System.out.println(m);
		System.out.println(m.timing());
	}

}
