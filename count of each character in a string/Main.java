/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String str = "compcom";
	    
	    System.out.println(str + ":");
	    
	    for(int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        int counter = 0;
	        for(int j = 0; j < str.length(); j++) {
	            if(ch == str.charAt(j)) {
	                counter++;
	            }
	        }
	        System.out.println("count of " + ch + ": " + counter);
	            //str = str.replaceAll(String.valueOf(ch), "");
	    }
	}
}
