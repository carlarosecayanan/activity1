package Programming2;

public class containdigits {

   public static void main(String[] args){
		String str = "2357897890";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
		System.out.println("Does string contain only Digits? : " + result);
	}
}
  

