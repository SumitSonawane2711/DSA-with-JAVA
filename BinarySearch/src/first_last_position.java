import java.util.Arrays;

//leetcode 34
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//find the first and last index of target element
public class first_last_position {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,5,5,6,7,7,7,9,9,9,22,25};
        int target=5;
       int[] ans=searchIndex(nums,target);
       System.out.println(Arrays.toString(ans));
    }

    public static int[] searchIndex(int[] nums, int target){

        int[] ans={-1,-1};
        //check for first occurrence if target first
        int start =search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;

    }
   //below function just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]>target){
                end=mid-1;
            }
            else if (nums[mid]<target) {
                start=mid+1;
            }
            else {
                //potential ans is found
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }
                else {
                        start=mid+1;
                    }
                }
            }
        return ans;
    }
}