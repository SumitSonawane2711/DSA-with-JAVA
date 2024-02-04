public class Square_root {

    public static void main(String[] args) {
       int n =2147395599;
       int sqr = sqrt(n);
        System.out.println(sqr);
    }

    public static int sqrt(int n){
        int  s = 1;
        int e = n;
        while( s <= e){
            int m = s + (e-s)/2;
            long sqr = (long) m*m;
            if (sqr == n){
                return m;
            }
            else if(sqr > n){
                e = m -1;
            }
            else {
                s=m+1;
            }
        }
        return e;
    }
}
