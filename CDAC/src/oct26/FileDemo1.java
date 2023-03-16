package oct26;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt");
		System.out.println(f.exists());
		boolean b = f.createNewFile();
		if(b) {
			System.out.println("Created");
		
		}else {
			System.out.println("already Exists");
		}
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	
	}

}
