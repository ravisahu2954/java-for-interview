// WRAPPER CLASSES
package variable_practice;

public class Example2 {

	public static void main(String[] args) {
		 
                Integer obj = 10;
		int sc=10;
		if(sc==obj)
		  System.out.println("same");  //output=same
		else
			System.out.println("not same");
		
		Integer ob=10;
		if(ob==obj)
			  System.out.println("same");//output=same  
		else
		    System.out.println("not same");
			
		
		class X{ int t;}
		X o=new X();
		System.out.print(o.t); //0

	}

}
