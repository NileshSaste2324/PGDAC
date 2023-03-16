package oct26;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutPutStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt");
				DataOutputStream dos= new DataOutputStream(fos)){
			dos.writeInt(123);
			dos.writeUTF("abc");
			dos.writeFloat(909.50f);
					
		}
		System.out.println("Done");
	}
	
	
}
