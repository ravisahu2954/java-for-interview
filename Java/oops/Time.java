//FIRST PROGRAM : Implement a program to demonstrate use of super keyword with constructors in multilevel inheritance. 
class C{
	 
	C(int a)
	 {
		 System.out.println("this is super class of B class , value pass by child class constructor :" + a);
	 }
}
class B extends C{
	 B(int a)
	 {  
		 super(5);
		 System.out.println("this is super class OF A class , value pass by child class constructor :" + a);
	 }
}
class A extends B{
	A()
	{ 
		super(10);
		System.out.print("this is child class constructor");
	}
}
public class Time {

	public static void main(String[] args) {
	      A obj = new A();
	     
    }
}
