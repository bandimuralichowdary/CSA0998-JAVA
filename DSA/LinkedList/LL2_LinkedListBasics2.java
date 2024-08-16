import java.util.Collection;
import java.util.ArrayList;
import java.util.*;
public class LL2_LinkedListBasics2 {
    public static void main(String[] args){
        LinkedList<Integer> ll1=new LinkedList<>();
        Collection<Integer> c=new ArrayList<Integer>();
        c.add(2);
        c.add(3);
        c.add(4);
    
        //addAll() Example
        System.out.println("\naddAll Example: ");
        ll1.addAll(c);
        ll1.addFirst(1);
        ll1.addLast(5);
        System.out.println(c);
        System.out.println(ll1);

        //get() example
        System.out.println("\nget() Example: ");
        System.out.println(ll1.get(2));

        //clear() example
        LinkedList<Integer> ll2=new LinkedList<>(ll1);
        System.out.println("\nclear() Example: ");
        ll2.clear();
        System.out.println(ll2);

        //clone() example
        System.out.println("\nclone() Example: ");
        @SuppressWarnings("unchecked")
        LinkedList<Integer> ll3= (LinkedList<Integer>) ll1.clone();
        System.out.println(ll3);

        //contains() example
        System.out.println("\ncontains() Example: ");
        System.out.println(ll1.contains(2));
        System.out.println(ll3.contains(6));

        //get(), getFirst(), getLast() examples
        System.out.println("\nget(), getFirst(), getLast() Examples: ");
        System.out.println(ll1.get(2));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());

        //indexOf() example {Always returns the first occurence index of an object}
        System.out.println("\nindexOf() Example: ");
        System.out.println("Index of 2 in LinkedList 1 is: "+ll1.indexOf(2));

        //lastIndexOf() example {Always returns the last occurence index of an object}
        ll1.add(2);
        System.out.println("\nlastIndexOf() Example: ");
        System.out.println("Last index of 2 is : "+ll1.lastIndexOf(2));

        //element() example
        System.out.println("\nelement() Example: ");
        int ele=ll1.element();
        System.out.println("Head of LinkedList 1 is: "+ele);

        //push() example
        System.out.println("\npush() Example: ");
        ll1.push(0);
        ll1.push(0);
        System.out.println(ll1);
        
        //pop() example
        System.out.println("\npop() Example: ");
        ll1.pop();
        System.out.println(ll1);

        //removeFirst() example
        System.out.println("\nremoveFirst() example: ");
        ll1.removeFirst();
        System.out.println(ll1);

        //removeLastOccurence() example
        System.out.println("\nremoveFirstOccurence() example: ");
        ll1.removeLastOccurrence(2);
        System.out.println(ll1);

        //removeLast() example
        System.out.println("\nremoveLast() example: ");
        ll1.removeLast();
        System.out.println(ll1);

        //removeLastOccurence() example
        ll1.push(1);
        System.out.println("\nremoveLastOccurence() Example: ");
        System.out.println(ll1);
        ll1.removeLastOccurrence(1);
        System.out.println(ll1);

        //size() example
        System.out.println("\nsize() Example: ");
        System.out.println(ll1.size());
    }
}
