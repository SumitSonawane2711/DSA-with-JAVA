public class lenearsearch {
    public static void main(String[] args) {
        int[] nums={22,34,57,86,99,12,37,44};
        int target=8;
        int ans=simple_search(nums,target);
        System.out.println(ans);
    }
    //search in the array if the element found then return the index otherwise return -1
    static int simple_search(int []arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            //check for elelment at every index
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;

    }
}
