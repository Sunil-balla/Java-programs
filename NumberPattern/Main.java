/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	
	static void method1(int num) {
	    int num1 = num;
	    int n = 0;
	    for(int i = 1; i <= num; i++) {
	        int spaces = (num1 + 1);
	        for(int j = 1; j <= spaces; j++) {
	        System.out.print(" ");
	        }
	        num1 -= 2;
	            for(n = i; n >= 1; n--) {
	                System.out.print(n + " ");
	            }
	            
	            n += 2;
	            
	            for(int o = n; o <= i; o++) {
	                System.out.print(o + " ");
	            }
	            System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		method1(in.nextInt());
		
		//System.out.println("Hello World");
	}
}