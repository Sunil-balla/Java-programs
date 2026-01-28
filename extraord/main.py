//package q15043;
import java.util.*;
class Main {
	
	static long extraOrdNums(long num) {
		while(true) {
		if(num == 1 || num == 2 || num == 3 || num == 5) {
			return num;
		} else {
			if(factorofNum(num)) {
				return num;
			} else {
			    num += 1;
			}
		}
	}
		//return 0;
	}

	static boolean factorofNum(long num) {
		if(num % 2 == 0) {
		if(num / 2 == 2 || num / 2 == 3 || num / 2 == 4 || num / 2 == 5 || num / 2 == 6) {
				return true;
			}
			if(num / 2 > 6) {
				num /= 2;
				if(num % 2 == 0) {
				    return true;
				}
				factorofNum(num);
			}
	    }
	    
	    if(num % 3 == 0) {
		if(num / 3 == 2 || num / 3 == 3 || num / 3 == 4 || num / 3 == 5 || num / 3 == 6) {
				return true;
			}
			if(num / 3 > 6) {
				num = num / 3;
				if(num % 2 == 0) {
				    return true;
				}
				factorofNum(num);
			}
	    }
	    
	    if(num % 5 == 0) {
		if(num / 5 == 2 || num / 5 == 3  || num / 5 == 4 || num / 5 == 5 || num / 5 == 6 ) {
				return true;
			}
			if(num / 5 > 6) {
				num = num / 5;
				if(num % 2 == 0) {
				    return true;
				}
				factorofNum(num);
			}
	    }
	    
	    return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[10000];
		long j = 1;
		for(int i = 0; i < 10000; i++) {
			arr[i] = extraOrdNums(j);
			j = arr[i]+1;
			System.out.println(arr[i]);
		}

		/*int[] arr1 = new int[in.nextInt()];

		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
			System.out.print(arr[arr1[i]] + " ");
		}*/
		
	    }
    }