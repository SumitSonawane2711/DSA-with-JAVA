package StaticExample;

public class Staticblock {
    static  int a = 4;
    static int b;

    //it will run only once when first obj is created
    static {
        System.out.println("I am a static block");
        b = a + 5;
    }
    public static void main(String[] args) {
        Staticblock obj=new Staticblock();
        System.out.println(Staticblock.a + " "+ Staticblock.b);

        Staticblock.b += 3;
        System.out.println(Staticblock.a + " "+ Staticblock.b);

        //here we create a second object that will not run
        Staticblock obj2 = new Staticblock() ;
        System.out.println(Staticblock.a + " "+ Staticblock.b);


    }
}
