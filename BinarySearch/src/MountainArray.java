//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//find maximum value or index from the array (mountain array)
public class MountainArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,8,4,3,2,1};
         int ans=nums[PeakIndex(nums)];
        System.out.println(ans);

    }
    public static int PeakIndex(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //your in decending part of array
                //you have to check lefthand side of array
                end =mid;
            } else {
                //your are in ascending part of the array
                start=mid+1;
            }
        }
        return start;
    }
}
