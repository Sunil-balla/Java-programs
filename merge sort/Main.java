/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[] arr = {2002, 4456, 8258, 3235, 3234, 9000};
		sortArr(0, arr.length-1, arr);
		for(int i: arr) {
		    System.out.println(i);
		}
	}




public static void sortArr(int start, int end, int[] arr) {
            int mid = (start + end)/ 2;
        if(start < end) {
            sortArr(start, mid, arr);
            sortArr(mid+1, end, arr);
        }
            mergeSort(start, mid, end, arr);
    }

    public static void mergeSort(int start, int mid, int end, int[] arr) {
        
        int[] mergeArr = new int[end - start + 1];
        
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end) {
            if(arr[idx1] <= arr[idx2]) {
                mergeArr[x++] = arr[idx1++];
            } else {
                mergeArr[x++] = arr[idx2++];
            }
        }

            while(idx1 <= mid) {
                mergeArr[x++] = arr[idx1++];
            }

            while(idx2 <= end) {
                mergeArr[x++] = arr[idx2++];
            }

            for(int i = 0, j = start; i < mergeArr.length; i++, j++) {
                arr[j] = mergeArr[i];
            }
        }
    }