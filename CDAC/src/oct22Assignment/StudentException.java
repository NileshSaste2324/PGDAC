package oct22Assignment;
import java.util.Scanner;


interface StudentFee{
	void getFee() throws InvalidFeeException;
}
class Student implements StudentFee{
	String name;
	float fees;

	@Override
	public void getFee()throws InvalidFeeException {
		if(fees>5000) {
			System.out.println("Student Fee = "+fees);
		}else {
			throw new InvalidFeeException();
		}
		
	}
}
class InvalidFeeException extends Exception{
	
}
public class StudentException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Student s = new Student();
			System.out.println("Enter Student Name");
			s.name= sc.next();
			System.out.println("Enter Student Fee");
			s.fees = sc.nextFloat();
			s.getFee();
		}catch (InvalidFeeException e) {
			System.out.println(e);
		}
		
	}
	
}