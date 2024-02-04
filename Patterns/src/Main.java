public class Main {
    public static void main(String[] args) {
       pattern3(5);
    }

    public static void pattern1(int n){
        /*    *
              * *
              * * *
              * * * *
              * * * * *
         */
        for(int row =1; row<=n; row++){
            //for every row start a loop for column
            for(int col=1;col<=row; col++){
                System.out.print("* ");
            }
            //after every row print a new line
            System.out.println();
        }
    }

    public static void pattern2(int n){
        /*
                * * * * *
                * * * * *
                * * * * *
                * * * * *
         */
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        /*
                 1
                 1 2
                 1 2 3
                 1 2 3 4
                 1 2 3 4 5
         */
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}