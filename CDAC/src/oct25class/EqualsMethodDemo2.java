package oct25class;
class Employee1{
	private int empID;
	private String empname;
	public Employee1(int empID, String empname) {
		super();
		this.empID = empID;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return empID+ " " + empID;
	}
	
}
public class EqualsMethodDemo2 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(101,"Nilesh");
		Employee1 e2 = e1;
		Employee1 e3 = new Employee1(101,"Nilesh");
		Employee1 e4 = new Employee1(102,"Shubham");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}

}
