//package q35935;
import java.util.*;
class Main {
	
	static void fibonacci(int counter, int num, int first, int second, int sum) {
		//int sum = 0;
		if(num == 1) {
			if(counter == 0) {
			System.out.print(first + " ");
			return;
			}
			System.out.print(sum + " ");
			return;
		} else if(num == 2) {
			//int first = 0;
			//int second = 1;
			if(counter == 0) {
			System.out.print(first + " " + second + " ");
			return;
			}
			System.out.print(sum + " ");
			num = num - 1;
			if(num == 1) {
				first = second;
				second = sum;
				sum = first + second;
				fibonacci(counter, num--, first, second, sum);
			}
			return;
		} else {
			if(counter == 0) {
				int temp = num;
				System.out.print(first + " " + second + " ");
				sum = first + second;
				num = num - 2;
			}
			counter = 1;
			System.out.print(sum + " ");
			num = num - 1;
			first = second;
			second = sum;
			sum = first + second;
			if(num > 0)
			fibonacci(counter, num, first, second, sum);
		}
		/*if(sum > 2)
			System.out.println((second + sum) + " ");*/
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		fibonacci(0, in.nextInt(), 0, 1, 0+1);
	}
}