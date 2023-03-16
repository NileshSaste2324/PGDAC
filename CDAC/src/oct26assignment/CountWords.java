package oct26assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) throws IOException {
		String line;  
        int count = 0;  
          
       
        FileReader file = new FileReader("D:\\PG_DAC\\Class\\Concepts of Programming\\oct26\\Assignment\\String.txt");  
        BufferedReader br = new BufferedReader(file);  
              
          
        while((line = br.readLine()) != null) {  
             
            String words[] = line.split(" ");  
             
            count = count + words.length;  
        }  
       
        System.out.println("Number of Words Present in File : " + count);  
        br.close();

	}

}
