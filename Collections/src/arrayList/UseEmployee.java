package arrayList;

import java.util.ArrayList;

public class UseEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Thiru","Male",26,1192,50000,"Student",2);
		Employee e2 = new Employee("Dhana","Male",23,1193,48000,"Student",3);
		Employee e3 = new Employee("Ajith","Male",23,1194,46000,"Student",2);
		Employee e4 = new Employee("Naveen","Male",20,1195,44000,"Student",4);
		Employee e5 = new Employee("Praveen","Male",27,1196,42000,"Student",3);
		Employee e6 = new Employee("Rafik","Male",25,1197,4000,"Student",5);
		
		ArrayList<Employee> emp = new ArrayList<>();
		ArrayList<Employee> expEmp = new ArrayList<>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		for(int i = 0; i<emp.size(); i++) {
			if(emp.get(i).getExperience()>2) {
				emp.get(i).setSalary(emp.get(i).getSalary()+10000); 
			    //System.out.println(emp.get(i));
			    expEmp.add(emp.get(i));
			}
		}System.out.println(expEmp);

	}

}
