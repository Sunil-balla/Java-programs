
final class Sunil {
    
    final void show() {
    System.out.println("This is sunil method");    
    }
    
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

public class Main extends Sunil
{
    void show() {
        System.out.println("This is john method");
    }
    
	public static void main(String[] args) {
		final int num = 10;
		num = 9;
		System.out.println(num);
		
	    Main obj = new Main();
		obj.show();
		obj.add(5, 5);
	}
}
