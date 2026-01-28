/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Phone {
    public void makeCall();
}

interface Phone1 {
    public void browseInternet();
}

class Samsung implements Phone, Phone1 {
    public void makeCall() {
        System.out.println("aaaa");
    }
    
    public void browseInternet() {
        System.out.println("bbb");
    }
}

public class Main
{
	public static void main(String[] args) {
		Phone s = new Samsung();
		s.makeCall();
		Phone1 s1 = new Samsung();
		s.browseInternet();
	}
}
