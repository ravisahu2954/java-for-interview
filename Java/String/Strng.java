import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       HashMap<String ,Integer> hm = new HashMap<>(); 
       String str = "Hey";
       hm.put(str,1);
       String str1 = "Hey";
       System.out.print(hm.containsKey(str1));      //true; 
     }
}
