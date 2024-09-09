package easy;

public class Sum {
    public static void main(String[] args) {
        int ans = sumOfDigit(5305);
        System.out.println(ans);
    }

    static  int  sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return  0;
        }
        return sumOfDigit(n/10) + (n%10);
    }
}
