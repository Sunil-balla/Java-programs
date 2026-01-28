import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min_attempts = 1;
		int max_attempts = 3;
		int correct_pin = 12345;
		while(min_attempts <= max_attempts) {
		    System.out.println("\nEnter your pin: ");
		    int entered_pin = in.nextInt();
		    if(entered_pin == correct_pin) {
		        System.out.println("Access granted");
		        break;
		    } else {
		        System.out.println("You Entered wrong pin");
		        min_attempts++;
		    }
		}
		
		if(min_attempts >= max_attempts) {
		    System.out.println("\nYour ATM is blocked");
		}
	}
}
