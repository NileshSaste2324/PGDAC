package oct28;

import java.util.Comparator;
import java.util.TreeSet;

import oct28.Employee1.EmployeeComparator;

class Employee1{
	int empId;
	String empName;
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	static class EmployeeComparator implements Comparator<Employee1>{

		@Override
		public int compare(Employee1 o1, Employee1 o2) {
			return o1.empId-o2.empId;
		}
	}
	static class EmployeeComparator1 implements Comparator<Employee1>{

		@Override
		public int compare(Employee1 o1, Employee1 o2) {
			return o1.empName.compareTo(o2.empName);
		}
		
	
		
	}
}
public class CollectionDemo1 {

	public static void main(String[] args) {
		TreeSet<Employee1> coll = new TreeSet<>(new Employee1.EmployeeComparator());
		coll.add(new Employee1(23,"Nilesh"));
		coll.add(new Employee1(33,"Rahul"));
		coll.add(new Employee1(43,"Dhanu"));
		coll.add(new Employee1(13,"Shubham"));
		coll.add(new Employee1(73,"Riteesh"));
		System.out.println(coll);
		System.out.println("   ");
		coll = new TreeSet<>(new Employee1.EmployeeComparator1());
		coll.add(new Employee1(23,"Nilesh"));
		coll.add(new Employee1(33,"Rahul"));
		coll.add(new Employee1(43,"Dhanu"));
		coll.add(new Employee1(13,"Shubham"));
		coll.add(new Employee1(73,"Riteesh"));
		System.out.println(coll);
	}

}
