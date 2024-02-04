//442. Find All Duplicates in an Array
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class All_Duplicate {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> ans=new ArrayList<>(findDuplicates(nums));
        System.out.println(ans);
    }
        public static List<Integer> findDuplicates(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if( nums[i]!=nums[correct]){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }
                else{i++;}
            }
            List<Integer> ans=new ArrayList<>();
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    ans.add(nums[index]);
                }
            }
            return ans;

        }
    }

