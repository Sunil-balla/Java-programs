import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		
		double totalPrice = 0;
		char option;
		
		do {
		 System.out.print("\nEnter item name: ");
		 String name = in.nextLine();
		 
		 System.out.print("Enter item price: ₹");
		 double price = in.nextDouble();
		 
		 System.out.print("Enter quantitty: ");
		 int quantity = in.nextInt();
		 
		 price *= quantity;
		 
		 totalPrice += price;
		 
		 System.out.println("Current itemprice: ₹" + price);
		 System.out.println("\nDo you want to add one more item(y / n) ?");
		 option = in.next().charAt(0);
		 in.nextLine();
		}while( (option == 'y') || (option == 'Y') );
		
		System.out.println("\n\nTotal bill: " + totalPrice);
		System.out.println("Thank you visit again.....");
	}
}
