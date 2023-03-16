package oct25class;

import java.util.Objects;

class Employee2{
	private int empID;
	private String empname;
	public Employee2(int empID, String empname) {
		super();
		this.empID = empID;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return empID+ " " + empID;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return empID == other.empID;
	}
	
	
}
public class EqualsMethodDemo {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(101,"Nilesh");
		Employee2 e2 = e1;
		Employee2 e3 = new Employee2(101,"Nilesh");
		Employee2 e4 = new Employee2(102,"Shubham");
		System.out.println(e1.equals("ab"));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
