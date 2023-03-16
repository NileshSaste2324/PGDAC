package oct26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;


public class Deserialization {

	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Employee emp = (Employee)ois.readObject();
					System.out.println(emp);
			
		}
		System.out.println("\nDone");
	}

}
