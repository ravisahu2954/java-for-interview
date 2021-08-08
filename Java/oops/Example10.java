package oops;
//polyporphism : 1.run time polyporphism 2. compile time polymorphism
/* Compile-time polymorphism: It is also known as static polymorphism. This type of polymorphism 
is achieved by function overloading or operator overloading. But Java doesn’t support the Operator Overloading.*/
class First{
	public void f1()
	{
		System.out.print("this is the first f1 function without ");
	}
	public void f1(int t)//this is called compile time polyporphism(achieved by function overloading)
	{
		System.out.print("this is the first f1 function without ");
	}
}
public class Example10 extends First {
	

	public static void main(String[] args) {
	   
		First o;
		o = new Example10();
   
	}

}
