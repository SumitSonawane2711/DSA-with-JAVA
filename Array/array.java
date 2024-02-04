public class Main {
    public static void main(String[] args){
        int[]A={4,5,6,7,3,9};
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]+" ");
        }
        int total=0;
        for(int i=0;i<A.length;i++)
        {
            total+=A[i];
        }
        System.out.println("total= "+total);
        char[]B={'h','e','l','l','o','.'};
        String S=new String(B);
        System.out.println(S);

        for(int n=0;n< A.length;n++)
        {
            for(int m=n+1;m<A.length;m++)
            {
                if(A[n]>A[m])
                {
                    int temp=A[n];
                    A[n]=A[m];
                    A[m]=temp;
                }
            }
        }
        System.out.println("sorted array is : ");
        for(int i=0;i< A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
}
