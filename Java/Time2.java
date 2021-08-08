//SECOND PROGRAM :Implement a Program to Handle Exception In a Super Class Methods
class Parent{
    public int divide(int a, int b) throws Exception{
        return a / b;
    }
}

class Child extends Parent{
    public void divideNum(int a, int b){
        try{
             divide(a, b);
        }catch(Exception e){
        	System.out.println("catching exception");
        }
        finally {
        	System.out.println("exception handle by child class ");
        }
    }
}
public class Time2 {
    public static void main(String args[]) {
        Child c = new Child();
         c.divideNum(10, 0);
        
    }
}