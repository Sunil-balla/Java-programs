// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    int a = 10;
    int b = 10;
    static int x = 10;
    static int y = 10;
    
    void add() {
        System.out.println("Addition: ");
        System.out.println(a + b + "\n");
    }
    
    static void sub() {
        int j = 10;
        System.out.println("Subtraction");
        System.out.println(x-j + "\n");
    }
    
    void mul() {
        System.out.println("Multiplication: ");
        System.out.println(a * b);
        System.out.println(x * y + "\n");
    }
    
    void div() {
        float p = 10;
        float q = 20;
        System.out.println("division: ");
        System.out.println(p / q + "\n");
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        j = 25;
        obj.add();
        sub();
        obj.mul();
        obj.div();
    }
}