//package q15043;
import java.util.*;
class Main {
	
	static long extraOrdNums(long num) {
		while(true) {
		if(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6) {
			return num;
		} else {
			if(factorofNum(num)) {
				return num;
			} else {
				num+=1;
			}
		}
	}
	//	return 0;
	}

	static boolean factorofNum(long num) {
		if(num % 2 == 0) {
			if(num / 2 == 2 || num / 2 == 3 || num / 2 == 4 || num / 2 == 5 || num / 2 == 6) {
				return true;
			}
			if(num / 2 > 6) {
				num /= 2;
				if(num % 2 == 0 && num <= 6) {
				return true;
				}
				return factorofNum(num);
			}
		}

		if(num % 3 == 0) {
			if(num / 3 == 2 || num / 3 == 3 || num / 3 == 4 || num / 3 == 5 || num / 3 == 6) {
				return true;
			}
			if(num / 3 > 6) {
				num /= 3;
				if(num % 2 == 0 && num <= 6) {
				return true;
				}
				return factorofNum(num);
			}
		}

		if(num % 5 == 0) {
			if(num / 5 == 2 || num / 5 == 3 || num / 5 == 4 || num / 5 == 5 || num / 5 == 6) {
				return true;
			}
			if(num / 5 > 6) {
				num /= 5;
				if(num % 2 == 0 && num <= 6) {
				return true;
				}
				return factorofNum(num);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[10000];
		long j = 1;
		for(int i = 0; i < 1700; i++) {
		    //System.out.print(i + " ");
			arr[i] = extraOrdNums(j);
			j = arr[i]+1;
			//System.out.print(arr[i] + " ");
		}
			//System.out.println(arr[999]);
			
			System.out.println("\n\nEnter index number: ");
int index = in.nextInt();

System.out.println(arr[index-1]);
		
// 		int[] arr1 = new int[len];

// 		for(int i = 0; i < len; i++) {
// 			arr1[i] = in.nextInt();
// 			arr1[i] = arr1[i]-1;
// 			//int temp = arr1[i]-1;
// 			System.out.print(arr[arr1[i]] + " ");
// 		}
		
	}
}