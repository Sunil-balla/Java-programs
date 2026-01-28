
class Parent {
    
    
    int num1 = 10;
    void add1() {
        System.out.println("Parent add1 method");
    }
    
    void add() {
        //super.add();
        //System.out.println(super.num);
     //   super.add();
     System.out.println("Super add method");
    }
}

public class Main extends Parent
{
    int num1 = 5;
    
    void add1() {
        //super.add1();
        System.out.println("child add1 method");
    }
    
    void add() {
        //super.add();
        //System.out.println(super.num);
        //super.add();
        //System.out.println("Child add method");
        System.out.println(super.num1);
        //this.add1();
    }
    
	public static void main(String[] args) {
	Main obj = new Main();
	obj.add();
	//obj.add();
	//this.()
	}
}
