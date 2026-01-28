import java.util.Scanner;
public class Main {

	static void patternPrint(int num) {
	    
	    int spaces = (num * 2) - 2;
	    
	    int n = 0;
	    
	    for(int i = 1; i <= num; i++) {
	        
	        //spaces
	        for(int j = 1; j <= spaces; j++) {
	        System.out.print(" ");    
	        }
	        
	        spaces -= 2;
	        int temp = 1; 
	        //half pyramid
	        for(n = i; temp <= i; n++) {
	            System.out.print(n + " ");
	            temp++;
	        }
	        
	        n -= 2;
	        
	        //second half pyramid
	        for(int o = n; o >= i; o--) {
	            System.out.print(o + " ");
	        }
	        
	        //new line
	        System.out.println();
	    }
	    
	    
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    patternPrint(num);
	}
}













































// class FirstParentClass extends Object{
    
// //     public FirstParentClass() {
        
// //         System.out.println("First Parent class zero parameterized constructor");
// //     }
    
// //     public FirstParentClass(String str) {
// //     super();
// //         System.out.println("First Parent class one parameterized constructor: " + str);
// //     }
    
// // }
