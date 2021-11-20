import java.util.*;
import java.io.*;
public class Test{
  
    public static void main(String args[])
    {    
          int sum=0;
          
     /    for(int i=1 , j=1;i<=10 && j<=10;i++,j++)
             sum=i+j;
          System.out.println("sum1" + " "+sum);   
          
          for(int i=1 ,j=1 ;i<=10 && j<=5;i++,j++)
             sum=i+j;              
          System.out.println("sum2" + " "+sum);    
          
          for(int i=1 ,j=1 ;i<=10 || j<=5;i++,j++)
             sum=i+j;              
          System.out.println("sum3" + " "+sum);    
          
          for(int i=1 , j=1 ;i<=10 || j<=5;i++,j++)
             sum=i+j;              
          System.out.println("sum4" + " "+sum);
          
          for(int i=1 ,j=1 ;i<=10 || j<=5;)
             sum=i+j;              
          System.out.println("sum5" + " "+sum); 
          
          for(int i=1 ,j=1 ; ;i++ ,j++)
             sum=i+j;              
          System.out.println("sum6" + " "+sum); 
         
     }

}   