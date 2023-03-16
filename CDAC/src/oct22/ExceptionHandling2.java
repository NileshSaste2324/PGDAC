package oct22;
import java.util.Scanner;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		String ar[]= {"Sunday","Monday","Tuesday","Wednesday","Thursdy","Friday","Staurday"};
		
			int a = sc.nextInt();
			for(int i=0;i<8;i++){
				if(i==(a)) {
					System.out.println(ar[i]);
				
				}	
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("Given Array  Index is out of Bound");
	
		}

	}

}
