/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{

    boolean b = false;
    String fStr = "";
    String str = null;
    int x = 0;
    int temp = 0;
    public String countAndSay(int n) {
            fStr = "";
            if(n == 1) {
                return "1";
            }

        if(!b) {
            temp = n;
           x = 1;
            b = true;
        str = String.valueOf(x);
        }
            
            if(str.length() == 1) {
                fStr = "11";
                str = fStr;
            } else {

            
            int counter = 1;
            boolean firstItr = true;
            char ch1 = 'y';
            char ch2 = 'z';
        for(int i = 0; i < str.length()-1; i++) {
            ch1 = str.charAt(i);
            ch2 = str.charAt(i+1);

            if(ch1 == ch2) {
                counter++;
            } else {
                
                if(firstItr) {
                fStr = String.valueOf(counter);
                firstItr = false;
                } else {
                    fStr += counter;
                }
                fStr += ch1;
                counter = 1;
            }
        }
        fStr += counter;
        fStr += ch2;
    }
        x += 1;
        if(x == temp)
        return fStr;
        //System.out.println(x);
        str = fStr;
        return countAndSay(x);
    }
	
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Main obj = new Main();
		System.out.println(obj.countAndSay(5));
	}
}