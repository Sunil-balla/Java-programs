/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static void add(int... x) {
        int sum = 0;
        for(int i: x) {
            sum += i;
        }
        System.out.println(sum);
    }
	public static void main(String[] args) {
		add(2, 2, 2, 2, 2, 15, 25);
	}
}
