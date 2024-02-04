import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];

        //input using for loop
        for(int i=0;i< num.length;i++){
            num[i]=sc.nextInt();

        }
        //output using for loop
        for(int i=0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }

    //Inhance for loop / foe each loop
        int[] arr={2,4,3,5,6,54};

        for(int no : arr) {                 //for every element in array , print the element
            System.out.print(no + " ");   //here no represents elements of the array
        }

        //output using toString metods
        System.out.println(Arrays.toString(arr));

        //Array of object
        String[] str=new String[5];
        for(int i=0;i< str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
