package arrayList;

public class Student {
	
	String name;
	int marks;
	int age;
	boolean isMale;
	
	public Student(String name,int marks, int age,boolean isMale) {
		this.name=name;
		this.marks=marks;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+marks+" "+age+" "+isMale;
	}
	

}
