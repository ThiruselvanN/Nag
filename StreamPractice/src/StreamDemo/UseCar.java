package StreamDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		
		
		Car car1 = new Car("audi",5000000,"black",8,"A8","TN15",2000);
		Car car2 = new Car("benz",5500000,"white",9,"B8","TN10",2500);
		Car car3 = new Car("ford",4000000,"blue",7,"F8","TN19",1500);
		Car car4 = new Car("ferrari",6000000,"red",8,"FF8","TN96",2600);
		Car car5 = new Car("BMW",5500000,"black",7,"A8","AP08",2000);
		Car car6 = new Car("hyndai",5000000,"black",4,"Q8","PU10",2200);
		Car car7 = new Car("HONDA",5000000,"black",4,"A8","KL15",2000);
		Car car8 = new Car("kia",5000000,"black",7,"A8","MH15",2000);
		Car car9 = new Car("nissan",5000000,"black",4,"A8","MG15",2000);
		Car car10 = new Car("Reanault",1000000,"blue",5,"R8","TN15",1000);
		
		ArrayList <Car> cars = new ArrayList<>();

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		
//		System.out.println(cars);
		
//		cars.stream().filter(x-> x.getRating() >=4 && x.getRating() <= 8).forEach(x-> System.out.println(x));
		
//		List <Car> whiteColor = cars.stream().filter(x -> x.getColor().equalsIgnoreCase("white") && x.getPrice()>800000).collect(Collectors.toList());
//		whiteColor.forEach(x -> System.out.println(x));
		
//		List <String> tnCars = cars.stream().filter(x-> x.getNoPlate().startsWith("TN")).map(x->x.getBrand()).collect(Collectors.toList());
//		tnCars.forEach(x -> System.out.println(x));
//		
//		Map <String,Car> m = cars.stream().filter(x-> x.getCc()<2000 && x.getCc()>1000).collect(Collectors.toMap(x-> x.getNoPlate(), y->y));
//		m.values().forEach(x -> System.out.println(x));
		
//		Car max = cars.stream().max(Comparator.comparingInt(Car::getPrice)).get();
//		System.out.println(max);
		
		
		cars.stream().sorted(Comparator.comparingInt(Car::getPrice).reversed()).forEach(x->System.out.println(x));
			
	}
	
	
}
