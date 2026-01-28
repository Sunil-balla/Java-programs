// Online Java Compiler
// Use this editor to write, compile and run your Java code online

interface I1 {
    void int1Method();
}

interface I2 extends I1 {
    void int2Method(); 
}

interface I3 {
    void int3Method();
}

class C1 implements I3{
    public void int3Method() {
        System.out.println("int3Method");
    }
}

class C2 extends C1 implements I2 {
    public void int2Method() {
        System.out.println("int2Method");
    }
    
    public void int1Method() {
        System.out.println("int1Method");
    }
}

class Main extends C2{
    public static void main(String[] args) {
        Main obj = new Main();
        obj.int1Method();
        obj.int2Method();
        obj.int3Method();
    }
}