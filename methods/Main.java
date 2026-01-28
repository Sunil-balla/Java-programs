/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
public String greeting() {
    return "Hello";
}
	public static void main(String[] args) {
	Main obj = new Main();
	String greet = obj.greeting();
	System.out.println(greet);
	}
}