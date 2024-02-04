
// Ceiling=Smallest element in array greater or  equal to target

public class Ceiling {
    public static void main(String[] args) {
        int[] nums={2,3,5,9,14,16,18};
        int target=8;
        int ans=nums[searchInsert(nums,target)];
        System.out.println(ans);
    }
//ceiling : return the index of  (smallest no >= target)
    public static int searchInsert(int[] nums, int target) {

 //if the target is greater than the greatest no in the array
        if(target>nums[nums.length-1]){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
