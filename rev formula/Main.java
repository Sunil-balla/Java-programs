/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {


	public static void main(String[] args) {
	//	String i = "945";
	//	int num = Integer.parseInt(i);
	//int i = 1534236469;
	int rev = 0;
	int x = 1256789;
	while (x > 0){
	    int temp = x % 10;
	    rev = (rev * 10) + temp;
	    x = x/10;
	}
	
	
	System.out.println(rev);
	}
}
