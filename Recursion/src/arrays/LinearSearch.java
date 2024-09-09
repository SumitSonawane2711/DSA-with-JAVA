package arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6,7,2};
        int target = 2;
        System.out.println(search(arr,target,0));
        System.out.println(searchIndex(arr,target,0));

        FindAllIndex(arr,target,0);
        System.out.println(list);

        System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));

        System.out.println(findAllIndex2(arr,target,0));
    }

    static boolean search(int []arr,int target,int index){
        if(arr.length == index){
            return false;
        }

        return arr[index] == target || search(arr,target,index+1);
    }

    static int searchIndex(int []arr,int target,int index){
        if(arr.length == index){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else{
            return searchIndex(arr, target, index+1);
        }
    }

    // return the index of target in an array , there are two approaches
    //approach 1 :
    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int []arr,int target,int index){
        if(arr.length == index){
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        FindAllIndex(arr, target,index+1);
    }

    //approach 2 :
    static  ArrayList<Integer> findAllIndex(int []arr, int target,int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    //approach 3 : not used this , because we create list object at every recursion call
    static  ArrayList<Integer> findAllIndex2(int []arr, int target,int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
