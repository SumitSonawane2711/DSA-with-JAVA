/*
//**searching an array
public class Main {
     public static void main(String[] args) {
         int[] arr={11,22,4,56,3,4-7,7,-43,89,-90};
         int target=30;
         int ans= LenearSearch(arr,target);
         System.out.println(ans);

     }

     static int LenearSearch(int[] arr,int target){
         //if array is empty it return -1
         if(arr.length==0){
             return -1;
         }
         //searching an elements one by one to satisfy the if condition
         for(int i=0;i<arr.length;i++){    //here i represents the array index
             if(arr[i]==target){
                 return i;                 //if condition is true it returns indext of the perticular element
             }
         }
         return -1;
     }
} */

//**searching of string

import java.util.Arrays;

public class SearchingArrayExample{
    public static void main(String[] args) {
        String name="Sonawane";
        char target='i';
        System.out.println(Arrays.toString((name.toCharArray())));
        System.out.println(search(name,target));
    }
    static boolean search(String s,char target){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(target==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
        }




