/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    Main obj;
    int i;
    
    Main(int i) {
        this.i = i;
    }
	public static void main(String[] args) {
	    Main obj1 = new Main(5);
	    String i = new String("5");
	    obj1.obj = obj1;
		System.out.println(obj1.obj);
	}
}
