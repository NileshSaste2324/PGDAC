package oct22;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ar[]= {"Sunday","Monday","Tuesday","Wednesday","Thursdy","Friday","Staurday"};
		try{
			
			int a = sc.nextInt();
			
				System.out.println(ar[a]);
					
				
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Given Array  Index is out of Bound");
	
		}

	}

}
