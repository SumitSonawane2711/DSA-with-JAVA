import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//      int[][] arr=new int[3][3];
//      for(int row=0;row<arr.length;row++){
//          for(int col=0;col<arr[row].length;col++){
//              arr[row][col]=sc.nextInt();
//          }
//      }
////        for(int row=0;row<arr.length;row++){
////            for(int col=0;col<arr[row].length;col++){
////                System.out.print(arr[row][col]+ " ");
////            }
////            System.out.println();
////        }
//
////        for(int row=0;row<arr.length;row++){
////            System.out.println(Arrays.toString(arr[row]));
////        }
//        for(int[] a :arr){
//            System.out.println(Arrays.toString(a));
//        }

        ArrayList<Integer> list=new ArrayList<>   (10);
//        list.add(23);
//        list.add(25);
//        list.add(28);
//        list.add(21);
//        list.add(20);
//        System.out.println(list);
//        System.out.println(list.get(1));
        //input
//        for(int i=0;i<5;i++){
//            list.add(sc.nextInt());
//        }
//        //output
//        for(int i=0;i<5;i++){
//            System.out.print(list.get(i));
//        }
//        //multidimention arraylist
//        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
//
//       // initialization
//        for(int i=0;i<4;i++){
//            list1.add(new ArrayList<>());
//        }
//
//        //input
//        ;for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                list1.get(i).add(sc.nextInt());
//            }
//            System.out.println(list1);
//        }

        //swapping
        int[] arr={1,2,3,4,5,6};
        swap(arr,0,5);

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static void swap(int[] arr,int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    //find out maximum value
    static int max(int arr[]) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;

        }

    }
}