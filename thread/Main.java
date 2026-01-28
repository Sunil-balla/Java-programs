/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Main1 obj = new Main1();
		//Thread t1 = new Thread();
		//Main obj = new Main();
		//obj.method(3);
		obj.start();
		for(int i = 0; i < 2; i++) {
		System.out.println("Main" + i);
		try {
		    Thread.sleep(100);
		} catch (Exception e) {
		    
		}
		}
	}
}
	class Main1 extends Thread {
	public void run() {
	    for(int i = 0; i < 3; i++) {
	            System.out.println("Thread: " + i);
	        try {
	            Thread.sleep(100);
	        } catch(Exception e) {
	  
	        }
	    }
	}
	
}
