//645. Set Mismatch (find the duplicate and missing number in an array)
//Input: nums = [1,2,2,4]
//Output: [2,3]
//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums={3,1,2,1,5};
        int[] ans=findErrorNums(nums);
        System.out.println(Arrays.toString(ans));

    }
        public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int coreect=nums[i]-1;
            if(nums[i]!=nums[coreect]){
                swap(nums,i,coreect);
            }
            else {i++;}
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
