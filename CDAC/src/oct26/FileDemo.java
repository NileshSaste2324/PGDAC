package oct26;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh");
		System.out.println(f.exists());
		boolean b = f.mkdir();
		if(b) {
			System.out.println("Created");
		
		}else {
			System.out.println("already Exists");
		}
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	
	}

}
