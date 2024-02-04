package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4);
        Box box2 = new Box(box1);
        System.out.println(box2.h);

        BoxWeight box3 = new BoxWeight(3,5,3,4);

        Box box4 = new BoxWeight(2,3,4,5);
        System.out.println(box4.h);
    }
}
