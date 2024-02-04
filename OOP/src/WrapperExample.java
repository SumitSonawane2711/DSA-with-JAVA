// wrapper class , final keyword, finalized method

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;// this is a primitive data type
        int b =30;

        Integer num1 = 45;                 //Integer is Wrapper class : is basically convert the num into object,it is final
        Integer num2 = 67;
        swap(a,b);   // it cant be swap cause there is only pass the value of variable not a variable
        swap1(num1,num2);// it still not swap the object num1 and num2 cause Integer is final class


        //Final keyword : you cant change the value in case of primitive data types
        //                in case of object you can change the value of object but cant reassign the object


        final int A = 28; // you cant change the value of A
         //A = 6;     this shows an error

        final final_ex rohan = new final_ex("Rohan");
        rohan.name = "sumit";                     // you can change the values

        // rohan = new final_ex("new object");    // this shows an error you cant create new object cause of final
    }

    // this swap functions variables valid under the scope it cant swap the outer variables
    static void swap(int x, int y){
        int temp = x ;
        x = y;
        y = temp;
    }

    // it still not swap the object num1 and num2 cause Integer is final class
    static void swap1(Integer n1 , Integer n2){
        Integer temp = n1;
        n1 = n2;
        n2 = temp;
    }
}

class final_ex{
    String name;
     final_ex( String n){                //constructor
         this.name = n;
     }

     // finalize() method:  call when  any object of the class is destroyed

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}
