package Packages.A;
import static Packages.B.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("we import message() methode from another package");
        message();
    }
}
