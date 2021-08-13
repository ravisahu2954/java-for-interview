public class String_s {

	public static void main(String[] args) {
	
		String name="ravi";
		String ne="";
		for(int i=0;i<name.length();i++)
		{
			ne+=name.charAt(i);
			for(int j=0;j<=i;j++)
			{
			//	name = name.substring(0, i+1)+ "*" +name.substring(i+1);
			    ne+="*";
			}
		}
		System.out.print(ne);
	
	}
}
input:ravi
output: r*a**v***i****


//***************//
public class String_s {

	public static void main(String[] args) {
	
		String name="ravi";
		String ne="";
		for(int i=0;i<name.length();i++)
		{
			ne+=name.charAt(i)+"*";
	        }
		System.out.print(ne);
	
	}
	

}
input:ravi
output: r*a*v*i*

