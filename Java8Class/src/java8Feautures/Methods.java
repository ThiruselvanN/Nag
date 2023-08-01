package java8Feautures;

public class Methods {
	
	public int findMax(int[]a) {
		
		int max = a[0];
		for(int i : a) {
			if(max<i) {
				max=i;
			}
		}
		return max;
	}
	
	public static int findMin(int[]a) {
		
		int min = a[0];
		for(int i : a) {
			if(min>i) {
				min=i;
			}
		}
		return min;
	}

}
