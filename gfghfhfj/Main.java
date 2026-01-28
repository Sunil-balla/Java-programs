/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    
    static void method1() {
        System.out.println("Hi");
        method1();
    }
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//int[] arr = {1, 2, 3};
// 		try{
// 		int i = in.nextInt();
// 		System.out.println("try block");
// 		} catch(Exception e) {
// 		    System.out.println(e);
// 		    System.out.println("catch block excuted only when exception occurs");
// 		} finally {
// 		    System.out.println("finally block always excuted");
// 		}
		
// 		System.out.println("Out side of try catch and finally block");
        method1();
	}
}
