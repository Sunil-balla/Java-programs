
class Person11 {
    
} 

public class Person
{
    String name;
    int age;
    
    public Person() {
        System.out.println("Non parameters");
    }
    
    public Person(String str) {
        System.out.println("parameters");
    }
    
     public Person(String name, int age) {
        //  this();
        this.name = name;
        this.age = age;
        this.personDetails();
        
     }
    
    public void personDetails() {
        // String name = "sdfghjkl";
        // int age = 789;
        
        System.out.println(name + " is " + age + " years old");
    }
    
    static int tre() {
        System.out.println(i);
    }
    
	public static void main(String[] args) {
        
        Person person1 = new Person("Sunil", 25);
        Person person4 = new Person("Sunil");
        Person person5 = new Person();
        // person1.name = "Sunil";
        // person1.age = 25;
        // person1.personDetails();
        
        Person person2 = new Person("Nithin", 23);
        // person2.name = "Nithin";
        // person2.age = 23;
        // person2.personDetails();
        
        Person person3 = new Person("Basheer", 27);
        // person3.name = "Basheer";
        // person1.age = 28;
        // person1.personDetails();
        
	}
	
}