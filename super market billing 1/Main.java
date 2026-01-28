import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        char ch;
	    double total_bill = 0;
		do {
		    
		    System.out.println("Enter item name: ");
		    
		    String item = in.nextLine();
		    
		    System.out.println("Enter item price: ");
		    double price = in.nextDouble();
		    
		    System.out.println("Enter item quantity: ");
		    int quantity = in.nextInt();
		    
		    double current_price = price * quantity;
		    System.out.println("Current Item price: " + current_price);
		    
		    total_bill += current_price;
		    
		    System.out.println("Do you want to add one more item (y / n) ?");
		    ch = in.next().charAt(0);
		    in.nextLine();
		}while(ch == 'y' || ch == 'Y');
		
		
		System.out.println("Total bill: " + total_bill);
		System.out.println("Thank you visit again...");
			    
		
	}
}













