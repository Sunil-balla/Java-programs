/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println(sum(10000));
	}
	
	static long sum(int n) {
	return n * (n + 1) / 2;
	}
	
	static long sum1(int n) {
	    int sum = 0;
	    for(int i = 1; i <= n; i++)
	    sum += i;
	    return sum;
	}
}
