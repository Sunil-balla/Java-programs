import java.util.Scanner;
public class Main {
    
    public void add() {
     System.out.println("Without parameters");   
    }
    
    public void add(int a) {
     System.out.println("With 1 parameters: " + a);   
    }
    
    public void add(int a, int b) {
     System.out.println("With 2 parameters (" + a + ", " + b + ") sum: " + (a + b) );   
    }
    
    public void add(float a, float b) {
     System.out.println("With 2 parameters (" + a + ", " + b + ") sum: " + (a + b) );   
    }
    
    public void add(int a, int b, int c) {
     System.out.println("With 3 parameters (" + a + ", " + b + ", " + c + ")sum: " + (a + b + c) );   
    }
    
	public static void main(String[] args) {
	    Main obj = new Main();
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter Three numbers: ");
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int c = in.nextInt();
	    float f1 = in.nextFloat();
	    float f2 = in.nextFloat();
	    obj.add();
	    obj.add(a);
		obj.add(a, b);
		obj.add(f1, f2);
		obj.add(a, b, c);
	}
	
	
	
}
