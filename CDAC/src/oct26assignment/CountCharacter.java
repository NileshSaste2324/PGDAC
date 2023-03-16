package oct26assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CountCharacter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\Assignment\\String.txt");
		String str = "India is a Great Nation ";
		byte b[] = str.getBytes();
		fos.write(b);
		int count = 0;
		FileInputStream fis = new FileInputStream("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\Assignment\\String.txt");
		
		int  i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			if((char)i == 't')
			{
				count++;
			}
			i=fis.read();
		}
		System.out.println();
		System.out.println("Total count of 't':"+count);

	}

}
