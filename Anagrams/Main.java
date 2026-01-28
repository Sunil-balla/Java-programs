    /******************************************************************************
    
    Welcome to GDB Online.
    GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
    C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
    Code, Compile, Run and Debug online from anywhere in world.
    
    *******************************************************************************/
    
    //Check whether two strings are anagrams
    
    import java.util.Arrays;
    public class Main
    {
    	public static void main(String[] args) {
    		String str = "liSten".toLowerCase();
    		String str1 = "silent".toLowerCase();
    		
    		if(str.length() != str1.length()) {
    		    System.out.println("Not an anagrams");
    		    return;
    		}
    		
    		char arr1[] = str.toCharArray();
    		char arr2[] = str1.toCharArray();
    		
    		Arrays.sort(arr1);
    		Arrays.sort(arr2);
    		
    		for(int i = 0; i < arr1.length; i++) {
    		    if(arr1[i] != arr2[i]) {
    		        System.out.println("Two Strings are not anagrams");
    		        return;
    		    }
    		}
    		System.out.println("Two Strings are anagrams");
    		
    	}
    }
