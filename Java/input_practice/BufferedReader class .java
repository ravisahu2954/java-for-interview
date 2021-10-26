package input_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//input stream in java
//there are two way to take input in java 1.BufferReader class 2. Scanner class

public class Example6 {

	public static void main(String[] args) throws IOException {
        
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String s = br.readLine();
		 int t = Integer.parseInt(br.readLine());
		 double d = Double.parseDouble(br.readLine());
		 System.out.println(s + t + d) ;
		 
		
	}

}
