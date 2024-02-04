import java.util.Arrays;

public class searchin2DArray {
    public static void main(String[] args) {
        int [][] arr={{22,43,56},
                {76,54,83},
                {12,21,44,98}};
        int target=98;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
