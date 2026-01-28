/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String name = "abcdef";
		name = name.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		for(int i = 0; i < name.length(); i++) {
		    char ch = name.charAt(i);
		    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		    vowels++;
		    else
		    consonants++;
		}
		System.out.println("Vowels: " + vowels + ", consonants: " + consonants);
	}
}
