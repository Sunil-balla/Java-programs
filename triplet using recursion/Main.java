/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
static int tripletCount(int[] arr, int target, int count, int dummy, int dummy1, int dummy2) {
        
        if(dummy == arr.length-2 && dummy1 == dummy+1 && dummy2 == dummy1+1){
        //System.out.println("Hi");
        return count;
        }
        
        // if(dummy2 == arr.length){
        // dummy2--;
        // //System.out.println("Hi");
        // }
        
        if(arr[dummy] + arr[dummy1] + arr[dummy2] <= target) {
            count++;
        }
        
        if(dummy2 < arr.length-1){
        dummy2+=1;
        return tripletCount(arr, target, count, dummy, dummy1, dummy2);
        }
        
        if(dummy1 < arr.length-2){
            dummy1+=1;
        dummy2 = dummy1+1;
        return tripletCount(arr, target, count, dummy, dummy1, dummy2);
        }
        
        if(dummy < arr.length-3){
        dummy+=1;
        dummy1 = dummy + 1;
        dummy2 = dummy1 + 1;
        return tripletCount(arr, target, count, dummy, dummy1, dummy2);
        }
        return count;
        
    }
    
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 9, 12, 5, 13, 22};
		int target = 10;
		System.out.println(tripletCount(arr, target, 0, 0, 1, 2));
	}
}
