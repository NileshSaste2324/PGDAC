package oct27;
class Employee{
	private int empId;
	void set(int empId) {
		if(empId>0)
			this.empId=empId;
	}
	int get() {
		return empId;
	}
}
public class Boxing {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.set(-100);
		System.out.println(e.get());
//		e.empid=-123
	}

}
