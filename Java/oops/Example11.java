package oops;
/*Runtime polymorphism: It is also known as Dynamic Method Dispatch. It is a process in which a function call to
the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.*/

class Parent {
	  
    void Print()
    {
        System.out.println("parent class");
    }
}
  
class subclass1 extends Parent {
  
    void Print()
    {
        System.out.println("subclass1");
    }
}
  
class subclass2 extends Parent {
  
    void Print()
    {
        System.out.println("subclass2");
    }
}
public class Example11 {

	public static void main(String[] args) {
		Parent a;
		  
        a = new subclass1();
        a.Print();
  
        a = new subclass2();
        a.Print();

	}

}
