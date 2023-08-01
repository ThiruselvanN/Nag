package polymorphism;

public class Manager extends Employee {
	
	int salary;
	int bonus;
	
	public int timing() {
		return 9;
	}
	public Manager(String name,int age,int id,int salary,int bonus) {
		super(name,age,id);
		this.salary=salary;
		this.bonus=bonus;
	}
	public String toString() {
		return salary+" "+bonus+" "+super.toString();
	}

}
