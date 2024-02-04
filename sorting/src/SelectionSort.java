import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,3,0,5,6,4,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        int[] num1={1,2,3,4};
        int[] nums2={5,6,7,8};
    }

    static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            //find the max element in the remaining array and swap with correct index
            int start=0;
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,start,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];

        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int[] add;
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
