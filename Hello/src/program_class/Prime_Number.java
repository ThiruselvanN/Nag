package program_class;

public class Prime_Number {
	public static void main(String[] args) {

		int n = 7;

		boolean flag = true;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				flag = false;

			}

		}

		if (flag == true) {
			System.out.println(n + "is a prime ");
		} else {
			System.out.println(n + "is not a prime");
		}
	}

}
