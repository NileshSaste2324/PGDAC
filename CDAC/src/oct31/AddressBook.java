package oct31;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Write a class Address that represents a person’s mailing address.
 *  It should have separate fields for the name, streetAddress,
 *   city, state and ZIPcode. 
 *   Write an program AddressBook to incorporate address
 *    book application where an array of the Address class 
 *    is created . Provisions for the following to be
 *     implemented as a menu driven program:-
(a)	To add addresses.
(b)	Search address of a person
(c)	Print all addresses.*/
class Address implements Serializable{
	String name;
	String streetAddress;
	String city;
	String state;
	int Zipcode;
	public Address(String name, String streetAddress, String city, String state, int zipcode) {
		super();
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		Zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state
				+ ", Zipcode=" + Zipcode + "]";
	}
	
	
}
public class AddressBook {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct31\\Class\\AddressBook.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
				Address ar[] = new Address[3];
				
				ar[0]=new Address("Nilesh","Ram Road","Phaltan","MH",415523);
				ar[1]= new Address("shubham","Hill Range","Pune","MH",410512);
				ar[2]=new Address("Rahul","R Road","Satara","MH",454523);
				for(Address a: ar) {
				oos.writeObject(a);
				}
				for(int i=0; i<ar.length;i++) {
					fos.equals(ar[i].name=="Rahul");
					System.out.println(ar);
				}
				System.out.println(" ");
				for(Address ad : ar) {
					System.out.println(ad.toString());
				}
				
	
		}
	}

}
