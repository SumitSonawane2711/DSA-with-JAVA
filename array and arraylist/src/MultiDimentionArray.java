import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //2D Array
        /*
          [ 1 2 3 ]
          [ 4 5 6 ]
          [ 7 8 9 ]
         */



        int[][] arr={  {1,2,3},
                       {4,5,6},
                       {7,8,9}   };

        for(int row=1;row< arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
               // System.out.print(arr[row][col] + " ");
                int sum=arr[row][col]+arr[row-1][col-1];
            }
            System.out.println();
        }

        //input

        int[][] nums=new int[3][3];

        for(int row=0;row< nums.length;row++){
            for(int col=0; col<nums[row].length;col++){
                nums[row][col]=sc.nextInt();
            }
        }

        //Output

        for(int row=0;row< nums.length;row++){
            for(int col=0; col<nums[row].length;col++){
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }

        //output using inhance for loop
        for(int row=0; row<nums.length;row++){
            System.out.println(Arrays.toString(nums[row]));
        }
    }
}
