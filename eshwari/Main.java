
import java.util.Arrays;
public class Main
{
	public static void main(String... a) {
	    
	    int[] arr = {100, 2, 33, 4, 5, 1, 6, 7};
	   //Arrays.sort(arr);
	   
	    int[][] arr1 = {
	        {1, 2, 3, 4, 5, 6, 7},
	        {11, 2, 3, 24, 5, 6, 7},
	        {1, 2, 3, 4, 5, 6, 77}
	    };
	    
	   for(int[] x: arr1) {
	       for(int y: x) {
	       System.out.print(y + " ");
	       }
	       System.out.println();
	   }
	   
	   System.out.println("Single dimensional array");
	   
	   for(int z: arr) {
	       System.out.print(z + " ");
	   }
	}
}




























// int number = 1634;
// int number1 = number;
		
// 		int rev = 0;
// 		String str = "";
// 		int sum = 0;
// 		int count = 0;
// 		int temp = number;
		
// 		//counting for digits
		
// 		do {
// 		    count++;
// 		    temp /= 10;
// 		}while(temp != 0);
	
//         // sum of all powers of each digit
// 		while(number != 0) {
// 		    int remainder = number % 10;
// 		    sum += Math.pow(remainder, count);
// 		    number /= 10; // number / 10;
// 		}
		
//         if(number1 == sum) 
//             System.out.println(number1 + " is an Armstromg");
//             else
//             System.out.println(number1 + " is not a Armstromg");















