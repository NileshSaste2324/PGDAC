package oct26;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\class\\Nilesh\\Ns.txt");
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
	
	}

}
