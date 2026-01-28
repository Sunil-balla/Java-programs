/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
		int[] arr1 = {1, 22, 3, 4, 5};
		int[] arr2 = {12, 3, 5, 6, 7};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++) {
		arr3[i] = arr1[i];
		}
		
		int x = 0;
		for(int i = arr1.length; i < arr3.length; i++) {
		arr3[i] = arr2[x];
		x++;
		}
		
		for(int i = 0; i < arr3.length; i++) {
		    for(int j = 0; j < arr3.length-1; j++) {
		        if(arr3[j] > arr3[j+1]) {
		            int temp = arr3[j];
		            arr3[j] = arr3[j+1];
		            arr3[j+1] = temp;
		        }
		    }
		}
		
		for(int i = 0; i < arr3.length; i++) {
		System.out.println(arr3[i]);    
		}
	}
}
