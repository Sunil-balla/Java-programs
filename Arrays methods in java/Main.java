import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		int[] arr1 = {3, 2, 1, 8};
		
		Arrays.sort(arr);
		String str = Arrays.toString(arr);
		System.out.println(Arrays.equals(arr, arr1));
	}
}


//Arrays.sort(arr);
//Arrays.toString(arr)
//Arrays.fill(arr, 10);
//Arrays.equals(arr, arr1)
