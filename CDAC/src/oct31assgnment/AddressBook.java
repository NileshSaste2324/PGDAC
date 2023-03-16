package oct31assgnment;

import java.io.Serializable;
import java.util.Scanner;



class Address implements Serializable{
	String name;
	String streetAddress;
	String city;
	String state;
	int zipcode;
	public Address(String name, String streetAddress, String city, String state, int zipcode) {
		
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state
				+ ", Zipcode=" + zipcode + "]";
	}
	
	
}
public class AddressBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Total Number Of Persons");
		int size = sc.nextInt();
		Address ar[] = new Address[size];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter Person Name :");
			String name = sc.next();
			System.out.println("Enter Street Address :");
			String streetAddress = sc.next();
			System.out.println("Enter City :");
			String city = sc.next();
			System.out.println("Enter State:");
			String state = sc.next();
			System.out.println("Enter Zipcode:");
			int zipcode = sc.nextInt();
			ar[i] = new Address(name,streetAddress,city,state,zipcode);
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter Person Name to Find his Address:");
			String name =sc.next();
			if(ar[i].name==name) 
			System.out.println(ar[i]);
			
		}
		System.out.println(" ");
		for(Address ad : ar) {
			System.out.println(ad.toString());
		}
	}

}
