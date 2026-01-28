/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Arrays;
public class Main
{
    static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(char x: arr) {
            set.add(x);
        }
        return set.size();
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}