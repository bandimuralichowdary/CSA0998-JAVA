import java.util.*;
public class LL4_LinkedListBasics4{
    public static void main(String[] args){
        //offerFirst(), offerLast() examples
        System.out.println("\nofferFirst(), offerLast() Examples: \n");
        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(11);
        ll1.add(10);
        ll1.add(2);
        ll1.add(4);
        ll1.add(7);
        ll1.add(15);
        System.out.println("Before prioritizing : "+ll1);
        LinkedList<Integer> ll2=new LinkedList<>();
        int thres=10;
        while(!ll1.isEmpty()){
            int ele=ll1.poll();
            if(ele<=thres){
                ll2.offerFirst(ele);
            }
            else{
                ll2.offerLast(ele);
            }
        }
        System.out.println("After Prioritizing : "+ll2);

        //Spliterator method
        System.out.println("\nSpliterator Example: \n");
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Okkadu");
        ll.add("Athadu");
        ll.add("Pokiri");
        ll.add("Khaleja");
        ll.add("Dookudu");
        ll.add("BusinessMan");
        System.out.println(""+ll+"\n");

        Spliterator<String> movies = ll.spliterator();
        movies.forEachRemaining((n)->System.out.println("Movie Name: "+n));
        
        //ListIterator method
        System.out.println("\nListIterator Example: \n");
        ListIterator<String> li=ll.listIterator(2);
        System.out.println("List is as follows: ");
        while(li.hasNext()){
            System.out.println(li.next());
        }

        //descendingIterator method
        System.out.println("\nDescending Iterator method: \n");
        Iterator<String> x=ll.descendingIterator();
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }
}
