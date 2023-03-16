package oct26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class DataInputSreamDemo2 {

	public static void main(String[] args) throws FileNotFoundException,IOException,EOFException{
		try(FileInputStream fis = new FileInputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt");
				DataInputStream dis = new DataInputStream(fis)) {
					int i = dis.readInt();
					String s = dis.readUTF();
					float f = dis.readFloat();
					System.out.println(i+ " "+s+" "+f);
				}
		
		System.out.println("\nDone");
	}

}
