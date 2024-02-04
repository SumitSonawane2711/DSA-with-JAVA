import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={5,43,4,6,7,8,9,0,1};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }

   public static void bubblesort(int[] nums){
        //run the step n-1 times
       boolean swap;
       for(int i=0;i<nums.length-1;i++){
           swap=false;
           for(int j=1;j<nums.length-i;j++){
               if(nums[j]<nums[j-1]){
                   int temp=nums[j];
                   nums[j]=nums[j-1];
                   nums[j-1]=temp;
                   swap=true;
                   }
               }
           //
           if (!swap){
               break;
           }
           }
       }
   }

