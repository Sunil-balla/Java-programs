/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	static void numbers(int n) {
	    int num1 = 0;
	    int spaces = (n * 2) - 2;
	    
	    for(int i = 1; i <= n; i++) {
	        
	        for(int j = 1; j <= spaces; j++) {
	            System.out.print(" ");
	        }
	        
	        spaces -= 2;
	        
	        for(num1 = i; num1 >= 1; num1--) {
	            System.out.print(num1 + " ");
	        }
	        
	        num1 += 2;
	        
	        for(int o = num1; o <= i; o++) {
	            System.out.print(o + " ");
	        }
	        
	        System.out.println();
	    }
	} 
	
	public static void main(String[] args) {
		numbers(7);
	}
}
