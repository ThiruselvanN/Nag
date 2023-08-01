package abstraction;

public class UseCentralGovernment {
	
	public static void main(String[] args) {
		
		TnGovernment tn = new TnGovernment();
		System.out.println("Tamil nadu :");
		System.out.println(tn.joint());
		System.out.println(tn.licenceid());
		System.out.println(tn.platecolor());
		System.out.println(tn.lettercolor());
		System.out.println(" ");
		
		KeralaGovernment ker = new KeralaGovernment();
		System.out.println("kerala :");
		System.out.println(ker.joint());
		System.out.println(ker.licenceid());
		System.out.println(ker.platecolor());
		System.out.println(ker.lettercolor());
		System.out.println(" ");
		
		ApGovernment ap = new ApGovernment();
		System.out.println("Andhra pradesh :");
		System.out.println(ap.joint());
		System.out.println(ap.licenceid());
		System.out.println(ap.platecolor());
		System.out.println(ap.lettercolor());
		
	}

}
