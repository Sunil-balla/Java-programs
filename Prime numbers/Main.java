/*4. Write a java program to check whether given number is prime or not.*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		
		int factors = 0;
		
		for(int i = 1; i <= num; i++) {
		    if(num % i == 0) {
		        factors++;  // factor = 1;
		    }
		}
		
		if(factors == 2) {
		    System.out.println("The given number " + num + " is prime");
		} else {
		    System.out.println("The given number " + num + " is not prime");
		}
	}
}


// 21 / 2
// Dividend = divisor * quotient + remainder
//       7 = 1 * 7 + 0;
//       7 = 2 * 3 + 1
//       7 = 3 * 2 + 1
//       7 = 4 * 1 + 3
//       7 = 5 * 1 + 2
//       7 = 6 * 1 + 1
//       7 = 7 * 1 + 0










