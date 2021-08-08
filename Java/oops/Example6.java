package oops;
//in this program we implemented inheritacne , this super keyboard , encapsulation ,constructor overloading
class Led{
	 
	  private String name;
	  private int price , size ,dis;
	  Led(String name , int price , int size)
	  {
		  this.name = name ;
		  this.price = price;
		  this.size = size;
	  }
	  Led(String name , int price , int size,int d)//contructor overloading
	  {
		  this.name = name ;
		 // this.price = price;
		  this.size = size;
		  this.dis=d;
		  this.price=price-dis;
	  }
	 
	  public void show()
	  {
		  System.out.println("Led name is + : " +this.name );
		  System.out.println("after dis Led price is + : " +this.price );
		  System.out.println("Led size is + : " +this.size );
	  }
	  
}
class Samsung extends Led{
	 
 //   private int internet_led , mobile_access;
	
	Samsung(String name, int price, int size ,int discount) {
		super(name, price, size ,discount); //calling constructor of super class
	   
	   // super(name, price, size); YOU cant call super constructor here constructor must be call in fisrt line of child constructor. class
	    super.show();
	    if(name.equals("Samsung Smart"))
	    {
	    	this.smrt();
	    }
	}

	private void smrt() {
		System.out.println("you can use internet \n mobile acces also availabe");
		
	}
    
}
class Sony extends Led{
  
	//sony tv is not providing any discount
	  Sony(String name, int price, int size) {
		super(name, price, size);
		super.show(); //calling super class show function. 
	    
	}
	
}
public class Example6 {

	public static void main(String[] args) {
		Samsung s1 = new Samsung("Samsung" , 22000,32,1999);
		Samsung s2 = new Samsung("Samsung Smart" , 30000,34,1999);
		Sony s3 = new Sony("Sony" ,20000,32);
		

	}

}
