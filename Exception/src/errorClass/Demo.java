package errorClass;

public class Demo {
	
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.findA();
	}
	
		


}
