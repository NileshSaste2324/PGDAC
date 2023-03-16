package oct28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee3 implements Comparable<Employee3>{
	int empId;
	String empName;
	public Employee3(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	@Override
	public int compareTo(Employee3 o) {
		return empId-o.empId;
	}
	
}


public class CollectionDemo5 {

	public static void main(String[] args) {
		ArrayList<Employee3> al = new ArrayList<>();
		al.add(new Employee3(12,"Ns"));
		al.add(new Employee3(52,"Rs"));
		al.add(new Employee3(32,"Ss"));
		al.add(new Employee3(72,"Bs"));
		al.add(new Employee3(12,"Cs"));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		List<Employee3> sl = Collections.synchronizedList(al);
		
	}

}
