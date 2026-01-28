
public class Main {
	
	public static void main(String[] args) {
        
        String str = "JAVA";
        
        // int count = 0;
        
        // for(int i = 0; i < str.length(); i++) {
        //     count++;
        // }
        
        //length()
        //charAt
        //indexOf
        //lastIndexOf
        //toUpperCase
        //ValueOf
        //toString()
        //trim
        
        int i = 5;
        
        StringBuilder sb = new StringBuilder("Python");
        
        String str1 = sb.toString();
        
        str = "            java           ".trim();
        
        String str5 = str + "language";
         System.out.println(str5);
	}
}








































// //methods
//         // 1. Non return type methods
//         //    * Non parametrized method
//         //    * Parametrized method
        
//         public void printHello() {
//             System.out.println("Hello from non return method");
//         }
        
//         public void printHello1(String str) {
//             System.out.println("Hello from non return Parametrized method " + str);
//         }
        
//         // 2. return type methods
//         //    * Non parametrized method
//         //    * Parametrized method
        
//         public int add() {
//             return 5 + 5;
//         }







//  Scanner in = new Scanner(System.in);
// 	   int[][] arr = new int[3][3];
// 	   int negSum = 0;
// 	   int posSum = 0;
	   
// 	   for(int i = 0; i < arr.length; i++) {
// 	       for(int j = 0; j < arr[i].length; j++) {
// 	            arr[i][j] = in.nextInt();        
// 	            if(arr[i][j] < 0) {
// 	               negSum += arr[i][j];
// 	           } else {
// 	               posSum += arr[i][j];
// 	           }
// 	       } 
// 	   }
	   
// 		   for(int i = 0; i < arr.length; i++) {
// 	       for(int j = 0; j < arr[i].length; j++) {
// 	           if(arr[i][j] < 0) {
// 	               arr[i][j] = negSum;
// 	           } else {
// 	               arr[i][j] = posSum;
// 	           }
// 	       }
// 	   }
	   
// 	   System.out.println("Result: array");
	   
// 	   for(int i = 0; i < arr.length; i++) {
// 	       for(int j = 0; j < arr[i].length; j++) {
// 	           System.out.print(arr[i][j] + " ");
// 	       }
// 	       System.out.println();
// 	   }