package java8Feautures;

public class UseCalculator {
	
	public static void main(String[] args) {
		
		Calculator add = (num1,num2)->num1+num2;
		System.out.println(add.find(100, 200));
		
		Calculator sub = (a,b)-> a-b;
		System.out.println(sub.find(100, 50));
		
		Calculator mul = (a,b)-> a*b;
		System.out.println(mul.find(5, 5));
		
		Calculator div = (a,b)-> a%b;
		System.out.println(div.find(10, 2));
		
		
		System.out.println(Calculator.manipulation());
		
		add.referranceType();
		
	}

}
