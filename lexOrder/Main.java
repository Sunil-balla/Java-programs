/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
    
   /* public String lexOrder(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }*/
    
    static String getLongestCommonPrefix(String[] arr) {
        String prefix = arr[0];
        for(int i = 1; i < arr.length; i++) {
        while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    
	public static void main(String[] args) {
	//	Main obj = new Main();
		//String str = obj.lexOrder("dcba");
		String str = "dcba";
		System.out.println(str);
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		String str1 = new String(arr);
		System.out.println(str1);
	}
}
