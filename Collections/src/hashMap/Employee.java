package hashMap;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String designation;
	private int salary;
	private int experience;
	
	public void set(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String id) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setExperience(int experience) {
		this.experience=experience;
	}
	public int getExperience() {
		return experience;
	}
	public Employee(int id,String name,int age,String gender,String designation,int salary,int experience) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.designation=designation;
		this.salary=salary;
		this.experience=experience;
	}
	public String toString() {
		return id+" "+name+" "+age+" "+gender+" "+designation+" "+salary+" "+experience;
	}

}
