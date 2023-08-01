package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1192,"Thiru",26,"Male","Student",40000,3);
		Employee e2 = new Employee(1193,"Dhana",22,"Male","Student",45000,2);
		Employee e3 = new Employee(1194,"Ajith",22,"Male","Student",50000,4);
		Employee e4 = new Employee(1195,"doly",26,"Female","Student",43000,2);
		Employee e5 = new Employee(1196,"kumar",17,"Male","Student",44000,2);
		Employee e6 = new Employee(1197,"tom",25,"Female","Student",45000,2);
		Employee e7 = new Employee(1198,"ram",25,"Male","Student",19000,2);
		Employee e8 = new Employee(1199,"sekar",18,"Male","Student",15000,2);
		
		HashMap<Integer,Employee> emp = new HashMap<>();
		HashMap<Integer,Employee> fememp = new HashMap<>();
		HashMap<Integer,Employee> expemp = new HashMap<>();
		
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);
		emp.put(e5.getId(), e5);
		emp.put(e6.getId(), e6);
		emp.put(e7.getId(), e7);
		emp.put(e8.getId(), e8);
		
		for(Integer k : emp.keySet()) {
			System.out.println(emp.get(k));
		}
//		for(Employee v : emp.values()) {
//			if(v.getSalary()>20000 && v.getSalary()<50000) {
//				System.out.println(v);
//			}
//		}
//		for(Integer k : emp.keySet()) {
//			if(emp.get(k).getGender().equalsIgnoreCase("Female")) {
//			fememp.put(k, emp.get(k));
//			System.out.println(fememp.get(k));
//			}
//		}
		
//		for(Employee v : emp.values()) {
//			if(v.getGender().equalsIgnoreCase("Female")) {
//				fememp.put(v.getId(), v);
//				System.out.println(v);
//			}
//		}
//		Employee max = e1;
//		for(Employee v : emp.values()) {
//			if(v.getSalary()>=max.getSalary()) {
//				max = v;
//			}
//		}System.out.println(max);
		
//		for(Employee v : emp.values()) {
//			if(v.getExperience()>2 && v.getGender().equalsIgnoreCase("Male")) {
//				v.setSalary(v.getSalary()+10000);
//				expemp.put(v.getId(), v);
//			}
//		}System.out.println(expemp);
		
//		for(Integer k : emp.keySet()) {
//			if(emp.get(k).getAge()<18) {
//				
//				emp.remove(k);
//			}
//		}
		
//		Iterator <Employee> x = emp.values().iterator();
//		while(x.hasNext()) {
//			if(x.next().getAge()<18) {
//				x.remove();
//				System.out.println(emp.values());
//			}
//		}
	}
	

}
