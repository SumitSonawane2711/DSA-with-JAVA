//287. Find the Duplicate Number , one duplicate element
//Input: nums = [1,3,4,2,2]
//Output: 2

//https://leetcode.com/problems/find-the-duplicate-number/

class FindDuplicate{
    public static void main(String[] args) {
        int[] nums={4,3,5,2,4,6};
        int ans=findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{i++;}
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
               int ans=nums[index];
               return ans;
            }
        }
        return -1;
    }
}