/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    // Function to find the longest palindromic substring
    static String longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int start = 0; // Start index of the longest palindrome found
        int maxLength = 1; // Length of the longest palindrome found

        for (int i = 0; i < str.length(); i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(str, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(str, i, i + 1);

            // Find the longest palindrome
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2; // Update the start index of the palindrome
            }
        }

        // Return the longest palindromic substring
        return str.substring(start, start + maxLength);
    }

    // Helper function to expand around the center
    static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
