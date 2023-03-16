package ns;
import java.util.Scanner;

class SalaryException extends Exception{
	
}
public class Emp {
	private static void salary(float sal)throws SalaryException {
		if(sal>90000) {
			System.out.println("sal = "+sal);
		}else {
			throw new SalaryException();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		float s = sc.nextFloat();
		try {
			salary(s);
		}catch (SalaryException e) {
			System.out.println(e);
		}
		
	}
	
}