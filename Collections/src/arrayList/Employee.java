package arrayList;

public class Employee {
	
	private String name;
	private String gender;
	private int age;
	private int id;
	private int salary;
	private String designation;
	private int experience;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setExperience(int experience) {
		this.experience=experience;
	}
	public int getExperience() {
		return experience;
	}
	
	public Employee(String name,String gender,int age,int id,int salary,String designation,int experience) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.id=id;
		this.salary=salary;
		this.designation=designation;
		this.experience=experience;
	}
	
	public String toString() {
		return name+" "+gender+" "+age+" "+id+" "+salary+" "+designation+" "+experience;
	}

}
