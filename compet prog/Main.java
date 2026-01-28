/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//package q14919;
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		for(int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
		}

		for(int i = 0; i < m; i++) {
			arr2[i] = in.nextInt();
		}

		//System.out.println( validNumCount(arr1, arr2, n, m) );
		int[] arr3 = new int[7];
		int i = 0;
		
		for( Object x: validNumCount(arr1, arr2, n, m) ) {
		    //System.out.println(x);
		    arr3[i] = (int) x;
		    i++;
		}
		
		int len = arr3.length;
		
		for(int j = 1; j < arr3.length; j++) {
		    for(int o = 0; o < arr1.length; o++) {
		        if(arr3[j] % arr1[o] != 0) {
		            len--;
		        }
		    }
		}
		
		System.out.println(--len);
	}
	static Object[] validNumCount(int[] arr11, int[] arr22, int size1, int size2) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();

		for(int i = 0; i < arr22.length; i++) {
			for(int j = 1; j <= arr22[i]; j++) {
				if(arr22[i] % j == 0) {
					arr2.add(j);
				}
			}
		}

		Collections.sort(arr2);

		for(int i = 0; i < arr2.size()-size2; i++) {
			int x = 1;
			int counter = 0;
			while(x <= size2) {
				if(arr2.get(i) == arr2.get(i+1))
					counter++;
				x++;
			}
			if(counter == size2) {
				arr1.add(arr2.get(i));
			}
		}
		Object[] finalArr = arr1.toArray();
		return finalArr;
            /*
		int counter2 = 0;

		for(int x: arr2) {
			InnerLoop :
			for(int y: arr11) {
				if(x % y != 0) {
					counter2++;
					break InnerLoop;
				}
			}
		}*/
	//return arr1.size()-counter2-1;
	}
}