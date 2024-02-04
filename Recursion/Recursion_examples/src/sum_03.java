//Sum of digits
// N = 43256
// sum = 4+3+2+5+6

public class sum_03 {
    public static void main(String[] args) {
      int ans = sum(1234);
        System.out.println(ans);
    }

    static int sum(int n){
        if (n==0){
            return 0;
        }
        int r = n%10;
        return r + sum((n/10));
    }
}
