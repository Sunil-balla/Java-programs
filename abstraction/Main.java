abstract class Main1 {
    public abstract void method1();
    public void method2() {
        System.out.println("This is an abstract method2");
    }
}

class Main2 extends Main1 {
    public void method1() {
        System.out.println("This is an abstract method");
    }
}
 
public class Main
{
	public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.method1();
        obj.method2();
	}
}
