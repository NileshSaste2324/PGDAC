package oct26assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shopping implements Serializable{
	String itemName;
	float price;
	int quantity;
	public Shopping(String itemName, float price, int quantity) {
		
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Shopping Details:( itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ")";
	}
	
}
public class ShoppingDetails {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		try(FileOutputStream fos = new FileOutputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\Assignment\\shopping.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			 Shopping s= new Shopping("Fruits",79.43f,30);
		
				oos.writeObject(s);
			
			
				System.out.println(s.toString());
			
		}
	}

}
