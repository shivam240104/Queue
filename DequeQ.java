import java.util.*;
public class DequeQ {
public static void main(String[] args) {
        Deque<Integer> deque= new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        System.out.println(deque);
    }
}
