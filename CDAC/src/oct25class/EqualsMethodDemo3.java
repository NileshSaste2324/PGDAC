package oct25class;
class Employee{
	private int empID;
	private String empname;
	public Employee(int empID, String empname) {
		super();
		this.empID = empID;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return empID+ " " + empID;
	}
	
}
public class EqualsMethodDemo3 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Nilesh");
		Employee e2 = e1;
		Employee e3 = new Employee(101,"Nilesh");
		Employee e4 = new Employee(102,"Shubham");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
