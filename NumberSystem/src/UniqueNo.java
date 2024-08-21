public class UniqueNo {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,6,7,3,4,5,5,7};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for( int n : arr){
            unique = unique^n;
        }
        return unique;
    }
}
