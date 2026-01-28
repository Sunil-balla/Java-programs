/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

//Implement a function to check if a string contains only digits

public class Main
{
    static boolean onlyDigits(String str) {
        for(int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if(Character.isDigit(ch)) {
		    } else {
		      //  System.out.println(str + " contains digits with letters or symbols");
		        return false;
		    }
		}
		return true;
    }
    
	public static void main(String[] args) {
		String str = "2569841";
		if(onlyDigits(str)) {
		System.out.println("String contains only digits");
		} else {
		System.out.println(str + " contains digits with letters or symbols");
		}
	}
}
