package forclass3;

public class UseFan {
	public static void main(String[] args) {
		
		Fan fan1 = new Fan();
		fan1.brand = "usha";
		fan1.price = 2000;
		fan1.noOfWings = 5;
		fan1.taxPercent = 5;
		
		Fan fan2 = new Fan();
		fan2.brand = "crompton";
		fan2.price = 3000;
		fan2.noOfWings = 4;
		fan2.taxPercent = 10;
		
		Fan fan3 = new Fan();
		fan3.brand = "havells";
		fan3.price = 1000;
		fan3.noOfWings = 3;
		fan3.taxPercent = 15;
		
		Fan [] fans = {fan1,fan2,fan3};
		Fan max = fans[0];
		Fan min = fans[0];
		int sum = 0;
		int count = 0;
		
		for(Fan f : fans) {
			f.taxAmout =(f.price*f.taxPercent)/100;
			f.netPrice = f.price+f.taxAmout;
			System.out.println(f.netPrice+", "+f.brand.toUpperCase());
			sum = sum+f.netPrice;
			count = count+1;
		
		if(max.price<f.price) {
			max=f;	
		}
		else if(min.price>f.price) {
			min=f;
		}
		}
		System.out.println("max: " +max.price);
		System.out.println("min: " +min.price);
		System.out.println("avg :" +sum/count);
		
	}

}
