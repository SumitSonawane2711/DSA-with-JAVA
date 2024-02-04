package StaticExample;

public class Main {
    public static void main(String[] args) {
       Human sumit = new Human(22,"sumit",100000,false);
       Human kunal = new Human(32,"kunal",150000,true);

        System.out.println(sumit.name);
        System.out.println(Human.poppulation);       //static variable accessed by class name
        System.out.println(Human.poppulation);

        fun();                            //only static function can be accessible inside static methode
    }

    static void fun(){                   //if this methode not declared as static it shows error
        System.out.println("fun");
    }
}
