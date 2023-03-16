package oct22Assignment;

import java.util.Scanner;

class Voter{
	int voterID;
	String name;
	int age;
	public Voter(int votterID, String name, int age) {
		super();
		this.voterID = votterID;
		this.name = name;
		this.age = age;
	}
	 void getAge(int age)throws InvlidAgeforVoter{
		if(age>18) {
			System.out.println("Person Can vote");
		}else {
			throw new InvlidAgeforVoter();
		}
	}
}
class InvlidAgeforVoter extends Exception{
	
}
public class VoterAge {
	
	public static void main(String[] args) throws InvlidAgeforVoter {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Voter ID :");
		int voterID = sc.nextInt();
		System.out.println("Enter Person Name :");
		String name = sc.next();
		System.out.println("Enter Voter Age :");
		int age = sc.nextInt();
		try {
			Voter v = new Voter(voterID,name,age);
			v.getAge(age);
		}catch (InvlidAgeforVoter e) {
			System.out.println(e);
		}
		}

}
