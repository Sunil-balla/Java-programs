

interface First {
    
    public void method1();
    public void method2();
}

interface Third {
    
    public void method3();
    public void method4();
}

class Second implements First, Third {
    public void method1() {
        System.out.println("This is interface method");
    }
    public void method2() {
        System.out.println("This is interface method2");
    }
    
    public void method3() {
        System.out.println("This is interface method3");
    }
    public void method4() {
        System.out.println("This is interface method4");
    }
}

public class Main {
	public static void main(String[] args) {
	
// 	Second obj1 = new Second();
// 	obj1.method3();
		
    Second obj = new Second();
    obj.method1();
    obj.method2();
    obj.method3();
    obj.method4();
	}
}

