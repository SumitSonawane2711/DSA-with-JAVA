import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
       int[] ans= merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] add = new int[0];
        int k=m+n;
        for(int i=1;i<=m;i++){
            add[i]=nums1[i];
        }
        for(int i=1;i<=n;i++){
            add[m+1]=nums2[i];
        }
        return add;

    }
}
