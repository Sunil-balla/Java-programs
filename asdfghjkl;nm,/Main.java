public class Main {
    static int i = 5;
    
    public static void method1() {
        System.out.println(i);
    }
    
    public static void main(String[] args) {
	
        Main obj = new Main();
        obj.method1();
    }
}























// static int binarySearch(int[] arr, int target, int start, int end) {
        
//         if(start > end){
//             return -1;
//         }
        
//         int middle = (start + end) / 2;
        
//         if(arr[middle] == target)
//         return middle;
        
//         if(arr[middle] > target){
//         end = middle - 1;
//         return binarySearch(arr, target, start, end);
//         }
        
//         if(arr[middle] < target) {
//             start = middle + 1;
//             return binarySearch(arr, target, start, end);
//         }
        
//         /* while(start <= end) {
//             int middle = (start + end) / 2;
            
//             if(target < arr[middle]){
//                 end = middle - 1;
//             } else if(target > arr[middle]) {
//                 start = middle + 1;
//             } else {
//                 return middle;
//             }
//         } */
        
//         return -1;
        
//     }
//     public void method1() {
//     static int i = 5;
//     }





// 	int[] arr = {11, 23, 33, 45, 55};
// 	Arrays.sort(arr);
// 	int target = 11;
	
	//int i = 5;
	
// 	if(binarySearch(arr, target, 0, arr.length-1) == -1){
// 	    System.out.println("Element not found");
// 	    System.exit(1);
// 	}
	
// 	System.out.println(binarySearch(arr, target, 0, arr.length-1));
	
