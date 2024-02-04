// Newton Raphson Method

// root = ( squar root of (X + n/x) )/2
// root = 0.5 * (x + (n/x))

public class Sqrt_newton_method {
    public static void main(String[] args) {
        int n =25;
        System.out.printf("%.3f", Newtonsqrt(n));
    }

    public static double Newtonsqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x)< 1){
                break;
            }

            x=root;
        }
        return root;
    }
}
