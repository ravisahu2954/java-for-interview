// WRAPPER CLASSES
package variable_practice;

public class Example2 {

	public static void main(String[] args) {
		Integer obj = 10;
		int sc=10;
		if(sc==obj)
		  System.out.print("same");  //output=same
		else
			System.out.print("not same");
		
		Integer ob=20;
		if(ob==obj)
			  System.out.print("same");  
			else
				System.out.print("not same");//output= not same(because object are diffrent )
			
		
		class X{ int t;}
		X o=new X();
		System.out.print(o.t); //0

	}

}
