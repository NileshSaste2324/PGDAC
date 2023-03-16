package oct26assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ShoppingDetail {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\Assignment\\shopping.dat");
		ObjectInputStream ois = new ObjectInputStream(fis)){
			Shopping s = (Shopping)ois.readObject();
		
			
				System.out.println(s);
			
		}
	}

}
