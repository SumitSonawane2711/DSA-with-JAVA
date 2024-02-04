
//return the index of  (largest no <= target)

public class Floor {
    public static void main(String[] args) {
        int[] nums={2,3,5,9,14,16,18};
        int target=8;
        int ans=searchInsert(nums,target);
        System.out.println(ans);
    }
    //Floor : return the index of  (largest no <= target)
    public static int searchInsert(int[] nums, int target) {
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
        return end;
    }
}
