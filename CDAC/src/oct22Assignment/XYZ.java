package oct22Assignment;

import java.util.Objects;
import java.util.Scanner;

class Employee{
	int empID;
	String name;
	double salary;
	public Employee(int empID, String name, double salary) {
		
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj==null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empID == other.empID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class XYZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee ar[]= new Employee[5];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter Employee ID :");
			int empID = sc.nextInt();
			System.out.println("Enter Employee Name :");
			String empName = sc.next();
			System.out.println("Enter Employee salary :");
			double salary = sc.nextDouble();
//			for(Employee e1 :ar) {
//				if(e1.equals(empID))
//					System.out.println("These Employee ID already exists");
//			}
//		for(int j=0;j<ar.length;j++) {
//			int k = ar[j].empID;
//			if(k==empID){
//				System.out.println("These Employee ID already exists");
//			}
//		}
			ar[i]=new Employee(empID,empName,salary);
		}
		for(Employee e : ar) {
			System.out.println(e.toString());
		}
	}

}
