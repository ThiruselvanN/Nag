package polymorphism;

public class Employee {

	String name;
	int age;
	int id;
	
	public int timing() {
		return 10;
	}
	public Employee(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
		
	}
	public String toString() {
		return name+" "+age+" "+id;
	}
}
