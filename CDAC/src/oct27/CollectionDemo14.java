package oct27;
//import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.ListIterator;
//import java.util.TreeSet;
import java.util.Objects;

class Employee2{
	int empId;
	String empName;
	public Employee2(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " "+ empName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return empId == other.empId;
	}
	
}
public class CollectionDemo14 {

	public static void main(String[] args) {
		HashSet<Employee2> al = new HashSet<>();
		al.add(new Employee2(12,"Ns"));
		al.add(new Employee2(22,"Nps"));
		al.add(new Employee2(52,"Ds"));
		al.add(new Employee2(72,"Dns"));
		System.out.println(al);
	}

}
