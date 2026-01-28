/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    //To check whether number is Prime or not
    static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    if(isPrime(num)) { // Using isPrime method //if num is prime then my program will enter into if statement
	        StringBuilder sb = new StringBuilder(String.valueOf(num)); //Converting number into String
	        sb.reverse(); //Reversing the String
	        int revNum = Integer.parseInt(sb.toString()/*Converting StringBuilder into String*/);
	        if(isPrime(revNum)) // Using isPrime method
	        System.out.println(num + " is twisted prime");
	        else
	        System.out.println(num + " is not twisted prime");
	    } else {
	        System.out.println(num + " is not twisted prime"); // if num is not prime then i am printing this statement
	    }
	}
}
