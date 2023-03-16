package oct25class;

import java.util.Objects;

class Employee3{
	private int empID;
	private String empname;
	public Employee3(int empID, String empname) {
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee3 other = (Employee3) obj;
		return empID == other.empID;
	}
	
	
}
public class EqualsMethodDemo4 {

	public static void main(String[] args) {
		Employee3 e1 = new Employee3(101,"Nilesh");
		Employee3 e2 = e1;
		Employee3 e3 = new Employee3(101,"Nilesh");
		Employee3 e4 = new Employee3(102,"Shubham");
		System.out.println(e1.equals("ab"));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
