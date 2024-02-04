// find the element in infinite array

public class infinite_array {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7,12,23,34};
        int target=6;
        System.out.println(ans(nums,target));
    }

    //start with the box of size of two
    public static int ans(int[] nums,int target){
        //start with the box of size of two
        int start=0;
        int end=1;

        //condition for the target to in the range
        if(target>nums[end]){
            int newStart=end+1;
            //end =previous end +sizeofbox*2 {end-(start-1)}
             end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(nums,target,start,end);
    }

    static int binarySearch(int[] nums,int target,int start,int end){


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
        return -1;
    }
}
