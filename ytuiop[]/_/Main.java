/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		String str = "aabbccdde";
		
		for(int i = 0; i < str.length(); i++) {
		  //  int count = 0;
		  //  for(int j = 0; j < str.length(); j++) {
		  //      if(str.charAt(i) == str.charAt(j)) {
		  //          count++;
		  //      }
		  //  }
		  char ch = str.charAt(i);
		  
		    if(str.indexOf(ch) == str.lastIndexOf(ch)) {
		        System.out.println("first non repeating character is: " + str.charAt(i));
		        break;
		    }
		} 
            
            // for(int i = 1; i <= 2; i++) {
            //     System.out.println("Outer loop " + i);
            //     for(int j = 1; j <= 2; j++) {
            //     System.out.println("Inner loop " + j);    
            //     }
            // }
		
	}
}