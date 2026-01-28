class Human {
       
//static return type method with parameters
static int add(int num1, int num2) {
    //System.out.println("Sum: " + (num1 + num2) );
    return num1 + num2;
}

//return type method without parameters
int add1() {
    return 5 + 5;
}

//without return type method without parameters
void add2() {
    System.out.println("This is add method");
}
//without return type method with parameters
void add3(int num1, int num2) {
    System.out.println("Sum: " + (num1 + num2) );
}
//return type method with parameters
int add4(int num1, int num2) {
    return num1 + num2;
}

public static void main(String[] args) {
 Human obj = new Human();
 System.out.println(add(5, 5));
 System.out.println(obj.add1());
 obj.add2();
 obj.add3(6, 6);
 System.out.println(obj.add4(5, 10));
}
}