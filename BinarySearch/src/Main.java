
//find the index of the target element
public class Main {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,2,3,4,5,6,7,8,93,34,56,78,};
        int target=2;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }

    // return the index
    static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find middle element
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}





