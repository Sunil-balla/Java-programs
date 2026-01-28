
class Parent {
    
    public Parent() {
        System.out.println("Parent constructor");
    }
    
    public Parent(String name) {
        System.out.println("Parent parameter constructor: " + name);
    }
    
    String str = "Parent variable";
    
    public void method1() {
        System.out.println("Parent method");
    }
}

class Child extends Parent{
    String str = "child variable";
    
    public Child() {
        System.out.println("Child constructor");
    }
    
    public Child(String name) {
        super("java");
        System.out.println("Child parameterized constructor: " + name);
    }
    
    public void method1() {
        System.out.println("Child method");
    }
    
    public void printSome() {
        super.method1();
        //System.out.println(str);    
    }
    
}




public class Main
{
	public static void main(String[] args) {
		Child obj = new Child("java");
		//obj.printSome();
	}
}
