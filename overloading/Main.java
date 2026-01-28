import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        		int[][] marks = {
        		   //0, 1, 2
        		    {1,  2,  3},  //0
        		   //0,0 0,1 0,2
        		    {4,  5,  6},  //1
        		   //1,0 1,1 1,2
        		    {7,  8,  9}   //2
        		   //2,0 2,1 2,2
        		};
        		
        	//System.out.println(marks.length);
                for(int rows = 0; rows < marks.length; rows++) {
                    for(int cols = 0; cols < marks[rows].length; cols++) {
                        System.out.print(marks[rows][cols] + " ");
                    }
                    System.out.println();
                }
	}
}
