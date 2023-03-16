package oct26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class FileInputSreamDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		try(FileInputStream fis = new FileInputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt")) {
			
	
				int ch = -1 ;
	
				while((ch=fis.read())!=-1) {

					System.out.println((char)ch);
				}	
		}
		System.out.println("\nDone");
	}

}
