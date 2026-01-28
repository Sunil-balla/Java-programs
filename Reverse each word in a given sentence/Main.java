/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

//Reverse each word in a given sentence

public class Main
{
	public static void main(String[] args) {
		
		String str = "My name is Sunil balla";
		System.out.println(str);
		String arr[] = str.split(" ");
		
		    String strRev = "";
		for(int i = 0; i < arr.length; i++) {
		   
		    for(int j = arr[i].length()-1; j >= 0; j--) {
		        char ch = arr[i].charAt(j);
		        strRev += ch;
		    }
		    
		    strRev += " ";
		}
		System.out.println(strRev);
	}
}
