
//extract word from string it will work for multiple space

public class Main
{

	public static void main(String args[]) 
	{ 
		String str = "Hey   this   is Ram"; 
		String [] words = str.split(" "); 
        	System.out.println(words.length);       
		for (int i=0 ;i<words.length;i++) 
		{
        	if(!words[i].isEmpty())	
        	System.out.println(words[i]); 
		}
		
		    
} 
