
// Stack and Queue data structure
import java.util.*;

public class InbuildExample {
    public static void main(String[] args) {

//        Stack<Integer> stack =new Stack<>();    // FILO
//        stack.push(23);
//        stack.push(25);
//        stack.push(43);
//        stack.push(76);
//        stack.push(13);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();     //FIFO (imagine queue for ticket )
//        queue.add(12);
//        queue.add(13);
//        queue.add(14);
//        queue.add(15);
//        queue.add(16);
//        queue.add(17);

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();// can insert and remove from both side
        deque.add(35);
        deque.addLast(48);
        deque.removeFirst();
    }
}