package oct26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutPutStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt")){
			String s = "-1 I am the Boss.";
					for(int i=0;i<s.length();i++) {
						fos.write(s.charAt(i));
					}
		}
		System.out.println("Done");
	}
	
	
}
