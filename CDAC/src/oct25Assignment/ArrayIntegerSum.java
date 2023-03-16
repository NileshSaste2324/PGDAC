package oct25Assignment;

public class ArrayIntegerSum {

	public static void main(String[] args) {
		String s = "67,89,23,67,12,55,66";
		String ar[] = s.split(",");
		for(String a:ar) {
		System.out.println(a);
		}
		double sum =0;
		for(String aa:ar) {
			int i = Integer.parseInt(aa);
			sum+=i;
		}
		System.out.println("Sum of Array Element Is "+sum);
	}	

}
