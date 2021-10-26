
//primitive and non primitive variable
class Exam{
	int x ;
	int y;
}
public class Example1 {

	  
	public static void main(String[] args) {
		//variable are two type primitive or nonprimitive
		//primitive(int ,byte,etc) , nonprimitive(class ,Sting ,array)
		/*by default value of non primitive is default value
		 but in case of primitive if we didnt intialize we get compiler error
		 */
		int i; //primitive variable
		//System.out.print(i); //get error we have to intialize first 
         Exam obj= new Exam();
         System.out.print(obj.x +" "+ obj.y);
         // will print 0 0 because default value of non primitive is default value
                
	}

}
