/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	
	String str1 = "Listen";
	String str2 = "silent";
	
	if(areAnagrams(str1.toLowerCase(), str2.toLowerCase()))
	System.out.println(str1 + " and " + str2 + " are anagrams");
	else
	System.out.println(str1 + " and " + str2 + " are not anagrams");
	
	}
	
	static boolean areAnagrams(String str1, String str2) {
	    if(str1.length() != str2.length())
	    return false;
	    
	    int[] count1 = new int[26];
	    int[] count2 = new int[26];
	    
	    for(int i = 0; i < str1.length(); i++) {
	        count1[str1.charAt(i) - 'a']++;
	        count2[str2.charAt(i) - 'a']++;
	    }
	    
	    for(int i = 0; i < 26; i++) {
	        if(count1[i] != count2[i])
	        return false;
	    }
	    
	    return true;
	}
}
