//Escape sequence in java
package input_practice;

public class Example8 {

	public static void main(String[] args) {
		
		System.out.print("my name is "ravi "");
		//it will not print as -> my name is "ravi" .
	    //because after second double quotes line is over for compiler 
		System.out.println("my name is \"ravi \"");
		//we can use \" for this type of output -> my name is "ravi"
		System.out.println("my name is \\ravi \\"); //output : my name is \ravi\
		System.out.println("my name is \\ravi \""); // output: my name is \ravi"

	}

}
