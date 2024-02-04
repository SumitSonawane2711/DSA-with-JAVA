
// factorial of 5 - 5*4*3*2*1 = 120
public class factorial_02 {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n){
        if(n<=1){
            return 1; //fact of 0 and 1 is 1
        }
        return n * fact(n-1);
    }
}
