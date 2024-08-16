import java.util.*;
public class LL3_LinkedListBasics3 {
    public static void main(String[] args){
        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(2);
        ll1.add(3);
        ll1.addLast(4);
        ll1.addFirst(1);
        System.out.println(ll1);

        //peek() example
        System.out.println("\npeek() Example: ");
        System.out.println(ll1.peek());

        //peekFirst() example
        System.out.println("\npeekFirst() Example: ");
        System.out.println(ll1.peekFirst());

        //peekLast() example
        System.out.println("\npeekLast() Example: ");
        System.out.println(ll1.peekLast());

        //poll() example
        System.out.println("\npoll() Example: ");
        System.out.println(ll1.poll());
        System.out.println(ll1);

        //pollFirst() example
        System.out.println("\npollFirst() Example: ");
        System.out.println(ll1.pollFirst());
        System.out.println(ll1);

        //pollLast() example
        System.out.println("\npollLast() Example: ");
        System.out.println(ll1.pollLast());
        System.out.println(ll1);
    }
}
