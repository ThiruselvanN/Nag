package arrayList;

import java.util.ArrayList;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Thiru",90,15,true);
		Student s2 = new Student("dhana",100,15,true);
		Student s3 = new Student("aji",100,15,true);
		Student s4 = new Student("kumar",100,15,true);
		Student s5 = new Student("doly",100,15,true);
		Student s6 = new Student("dilse",90,15,false);
		Student s7 = new Student("chand",95,15,false);
		
		ArrayList<Student> stu = new ArrayList<>();
		ArrayList<Student> top = new ArrayList<>();
		
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);
		stu.add(s7);
		
		for(int i = 0; i<stu.size(); i++) {
			if(stu.get(i).marks==100) {
				top.add(stu.get(i));
			}
		}
		   System.out.println(top);
		

	}

}
