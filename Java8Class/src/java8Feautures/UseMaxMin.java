package java8Feautures;

public class UseMaxMin {
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		
		MaxMin max = m::findMax;
		
		 int[]nums = {10,20,30,40,50,12,8};
		 
		 System.out.println(m.findMax(nums));
		 
		 
		 
		 MaxMin min = Methods::findMin;
		 
		 System.out.println(min.find(nums));
	}

}
