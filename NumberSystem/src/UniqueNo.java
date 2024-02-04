public class UniqueNo {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,6,6,7,3,4,5,5,7,8};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for( int n=0;n< arr.length;n++){
            unique =unique^arr[n];
        }
        return unique;
    }
}
