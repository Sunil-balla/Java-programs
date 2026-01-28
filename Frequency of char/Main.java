/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    String str = "Hello Java";
	    str = str.toLowerCase();
	    str = str.replace(" ", "");
	    int[] arr = new int[256];
	    //System.out.println(arr[15]);
	    for(int i = 0; i < str.length(); i++) {
	        int temp = (int)str.charAt(i);
	        arr[temp]++;
	    }
	    
	    for(int j = 0; j < arr.length; j++) {
	        if(arr[j] > 0) {
	            System.out.println( (char)j + " -> " + arr[j] );
	        }
	    }
	    //System.out.println(str);
	}
}