//
////write the code that print "hello world" five times
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("hellow world");
//         print1();
//    }
//    static void print1(){
//        System.out.println("hellow world");
//        print2();
//    }
//    static void print2(){
//        System.out.println("hellow world");
//        print3();
//    }
//    static void print3(){
//        System.out.println("hellow world");
//        print4();
//    }
//    static void print4(){
//        System.out.println("hellow world");
//    }
//    static void print5(){
//        System.out.println("hellow world");
//    }
//}

//with recursion functions
public class Main {
   public static void main(String[] args){
print("hello world",0);
   }

   static String print(String a,int n){
       if(n==5){
           return a;
       }
       System.out.println(a);
       return print(a,n+1);
   }
}