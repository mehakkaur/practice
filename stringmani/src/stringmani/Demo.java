//package stringmani;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//class Employee implements Comparator<Employee>{
//	String name;
//	int age;
//	public Employee(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	public int compare(Object o1, Object o2) {
//	Employee emp1=	(Employee) o1;
//	Employee emp2=	(Employee) o2;
//		if(emp1.age<emp2.age)
//		return 1;
//		else if(emp1.age>emp2.age)
//			return -1;
//		else {
//			//logic if equals
//			return 0;
//		}
//	}
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
//public class Demo {
//
//	public static void main(String[] args) {
//		List<Employee> list=new ArrayList<>();
//		list.add(new Employee("mehak",11));
//		list.add(new Employee("tintin",2));
//		list.add(new Employee("bella",3));
//		list.add(new Employee("tintin3",4));
//		//Collection.sort(new Comparator<>
//		list.sort((Comparator<? super Employee>) list);
//		for(Employee emp:list) {
//			System.out.println("age "+emp.age+ "name "+emp.name);
//		}
//
//	}
//
//}
