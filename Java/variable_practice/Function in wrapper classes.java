//Function in wrapper classes
package variable_practice;

public class Example5 {

	public static void main(String[] args) {
		
		 int f=10;
		double t=5.6;
		Double bOb = Double.valueOf(t); //bob=5.6
		Double bt = Double.valueOf(f); //10.0
		Integer pt = Integer.valueOf(f);// pt =10
		Integer st = new Integer(5);    //st=5
		System.out.println(pt+bOb+" "+pt+st); // pt+bob=15.6
		 double t = 5.0;
                 Double f = t; //it is also work
		
		 // creates objects of wrapper class
	        Integer aObj = Integer.valueOf(23);
	        Double bObj = Double.valueOf(5.55);

	        // converts into primitive types
	        int a = aObj.intValue();
	        double b = bObj.doubleValue();

	       System.out.println("The value of a: " + a);
	       System.out.println("The value of b: " + b);
		

	}

}
