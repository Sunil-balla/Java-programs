/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class A {
    int i = 5;
    
    public void method1() {
        System.out.println("Hi");
    }
}

public class Main extends A
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		A obj = new Main();
		
	}
}
