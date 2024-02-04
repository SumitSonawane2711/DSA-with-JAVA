import java.util.Arrays;
//https://leetcode.com/problems/missing-number/submissions/
//find the missing number
public class MissingNo {
    public static void main(String[] args) {
        int[] arr={4,0,2,1,3,6};
        int ans= cyclic(arr);
        System.out.println(ans);
    }
    public static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
            //search for first missing element
            for(int index = 0; index<arr.length; index++){
                if(arr[index]!=index){
                    return index;
                }
            }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
