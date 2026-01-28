/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class B {
    protected int a; 
    protected void add(int a, int b) {
      System.out.println(a + b);
    }
    Main obj = new Main("a", "a");
}

public class Main
{
    private String a;
    private String b;
    public Main(String a, String b) {
        this.a = a;
        this.b = b;
    }
    
    private void add(int a, int b) {
      System.out.println(a + b);
    }
    
	public static void main(String[] args) {
		/*Main obj = new Main("Chennai", "Hyderabad");
		System.out.println(obj.a + ", " + obj.b);*/
		B b = new B();
		b.a = 5;
		System.out.println(b.a);
		//b.add(5, 5);
		Main obj = new Main("d", "d");
		b.add(5, 5);
		
	}
}
