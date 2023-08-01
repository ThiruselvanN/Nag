package forclass3;

public class UseCar {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.brand = "audi";
		car1.model = "qu";
		car1.price= 5000000;
		car1.taxPercent = 10;
		car1.discountPercent=15;
		//car1.taxAmount = (car1.price*car1.taxPercent)/100;
		//car1.discountAmount= (car1.price*car1.discountAmount)/100;
		//car1.netPrice= (car1.price+car1.taxAmount)-car1.discountAmount;
		
		Car car2 = new Car();
		car2.brand = "bmw";
		car2.model = "qu";
		car2.price= 4000000;
		car2.taxPercent = 10;
		car2.discountPercent=15;
		//car2.taxAmount = (car2.price*car2.taxPercent)/100;
		//car2.discountAmount= (car2.price*car2.discountAmount)/100;
		//car2.netPrice= (car2.price+car2.taxAmount)-car2.discountAmount;
		
		Car car3 = new Car();
		car3.brand = "benz";
		car3.model = "qu";
		car3.price= 6000000;
		car3.taxPercent = 10;
		car3.discountPercent=15;
		//car3.taxAmount = (car3.price*car3.taxPercent)/100;
		//car3.discountAmount= (car3.price*car3.discountAmount)/100;
		//car3.netPrice= (car3.price+car3.taxAmount)-car3.discountAmount;
		
		Car [] cars = {car1,car2,car3};
		
		for(int i = 0; i<cars.length; i++) {
			cars[i].taxAmount = (cars[i].price*cars[i].taxPercent)/100;
			cars[i].discountAmount= (cars[i].price*cars[i].discountPercent)/100;
			cars[i].netPrice= (cars[i].price+cars[i].taxAmount)-cars[i].discountAmount;
			
			System.out.println(cars[i].brand+","+cars[i].netPrice);
		}
		Car max = cars[0];
		for(int i = 0; i<cars.length; i++) {
			if(max.netPrice<cars[i].netPrice) {
				max=cars[i];
			}
		}System.out.println(max.netPrice);
		
		
		
		
		
		
		
		
	}

}
