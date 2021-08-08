//CONVERSION IN JAVA
//there are two type of conversion first one is implicit (widing ) or second one is explicit(narrow)

package variable_practice;

public class Example3 {

	public static void main(String[] args) {
       int i=10;
       long t=i; //implicit or widing conversion
       long t1=100;
      // int i1=t; //it will give error
       int i1=(int)t; // explicit converion
       char c='A';
       int a=c;   //implicit or widing conversion
       long s=c; //thats fine
       float f=c;//65.0
       System.out.print(a + " "+ f);
       int a1=65;
       char ch=a1; //char can not convert directly in int .we have to do type casting exlicitly
       char ct=(char)a1; //65
       boolean tt=true;
       char cf=tt; //connot convert boolean to any data type even if we perform type casting 
       
       
       

	}

}
