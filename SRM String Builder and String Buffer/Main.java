/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" java");
		System.out.println(sb);
		String name = sb.toString();
		System.out.println(name);
		StringBuilder sb1 = new StringBuilder(name);
		System.out.println(sb1);
		String name1 = sb1.toString();
	}
}
