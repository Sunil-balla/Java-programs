/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String num = in.nextLine();
       int decimal = 0;
       int length = num.length();
        for(int i = 0; i < num.length(); i++) {
            char bit = num.charAt(i);
            if(bit == '0' || bit == '1') {
                int bit1 = bit - 48;
                decimal += bit1 * Math.pow(2, length-1);
                length--;
            } else {
                System.out.println("Invalid number");
                return;
            }
        }
        System.out.println("Decimal number: " + decimal);
      }
    }