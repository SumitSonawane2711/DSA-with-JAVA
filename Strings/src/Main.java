import java.lang.reflect.GenericDeclaration;

public class Main {
    public static void main(String[] args) {

        String a = new String("sumit") ;
        String b = new String("sumit");

        //==
        System.out.println(a == b);

        System.out.println(a.equals(b));
        System.out.println(a.charAt(1)) ;

        //concatenation
        System.out.println('a');
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('d'+3));

        //String palindrome

        String letter = "abcdcba";
        int start = 1;
        int end = 7;

        while(start<=end){
            if (letter.charAt(start)==letter.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println(false);
            }
        }


    }
}