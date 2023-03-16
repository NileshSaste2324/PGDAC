package oct28;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}


	@Override
	public String toString() {
		return  empId + " " + empName ;
	}


	@Override
	public int compareTo(Employee o) {
		return empId - o.empId;
	//	return empName.compareTo(o.empName);
	}



	
}
public class CollectionDemo {

	public static void main(String[] args) {
		TreeSet<Employee> coll = new TreeSet<>();
		coll.add(new Employee(23,"Nilesh"));
		coll.add(new Employee(33,"Rahul"));
		coll.add(new Employee(43,"Dhanu"));
		coll.add(new Employee(13,"Shubham"));
		coll.add(new Employee(73,"Riteesh"));
		System.out.println(coll);
	}

}
