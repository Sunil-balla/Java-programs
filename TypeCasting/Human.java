public class Human
{
	public static void main(String[] args) {
        // The process of converting from smaller data type 
        // value into larger data type value
        int age = 35;
        long age1 = age;
        System.out.println(age1);
        
        // The process of converting from larger data type 
        // value into smaller data type value
        
        long personAge = 55;
        int personAge1 = (int)personAge;
        System.out.println(personAge1);
	}
}



