import java.util.*;
public class LL1_LinkedListBasics{
    public static void main(String[] args){
        LinkedList<String> ll1=new LinkedList<>();
        LinkedList<Integer> ll2=new LinkedList<>();
        LinkedList<Character> ll3=new LinkedList<>();
        //Adding
        System.out.println("Adding Elements: \n");
        ll1.add("Murali");
        ll1.addLast("Chowdary");
        ll1.add(1, "Krishna");
        ll1.addFirst("Bandi");
        System.out.println(ll1);
        ll2.add(2);
        ll2.addLast(4);
        ll2.addFirst(1);
        ll2.add(2,3);
        System.out.println(ll2);
        ll3.add('b');
        ll3.addLast('d');
        ll3.addFirst('a');
        ll3.add(2,'c');
        System.out.println(ll3);

        //Changing Elements
        System.out.println("\nChanging Elements: \n");
        ll1.set(1,"Mohana");
        ll1.set(2,"Sudha");
        System.out.println(ll1);
        ll2.set(1,5);
        ll2.set(2,6);
        System.out.println(ll2);
        ll3.set(1,'e');
        ll3.set(2,'f');
        System.out.println(ll3);

        //Removing Elements
        System.out.println("\nRemoving Elements: \n");
        ll1.remove("Mohana");
        ll1.remove(1);
        System.out.println(ll1);
        ll2.remove(2);
        ll2.remove(1);
        System.out.println(ll2);
        ll3.remove(Character.valueOf('e'));//Just to ensure character is removed
        ll3.remove(1);
        System.out.println(ll3);

        //Iterating through Linked List
        System.out.println("\nIterating through Linked List:");
        //1st method of iterating
        System.out.println("\n1st Method of Iterating: ");
        for(int i=0; i<ll1.size(); i++){
            System.out.print(ll1.get(i)+" ");
        }
        System.out.println();
        for(int i=0; i<ll2.size(); i++){
            System.out.print(ll2.get(i)+" ");
        }
        System.out.println();
        for(int i=0; i<ll3.size(); i++){
            System.out.print(ll3.get(i)+" ");
        }
        System.out.println();
        System.out.println("\n2nd Method of Iterating: ");
        //2nd method of iterating
        for(String str: ll1){
            System.out.print(str+" ");
        }
        System.out.println();
        for(int i:ll2){
            System.out.print(i+" ");
        }
        System.out.println();
        for(char ch: ll3){
            System.out.print(ch+" ");
        }
        System.out.println();

        //LinkedList to Array
        System.out.println("\nLinkedList to Array: \n");
        Object arr1[]=ll1.toArray();
        for(Object str:arr1){
            System.out.print(str+" ");
        }
        System.out.println();
        Object arr2[]=ll2.toArray();
        for(Object in:arr2){
            System.out.print(in+" ");
        }
        System.out.println();
        Object arr3[]=ll3.toArray();
        for(Object ch:arr3){
            System.out.print(ch+" ");
        }
        System.out.println();

        //SizeOf Function
        System.out.println("\nGetting Size of the LinkedLists: \n");
        System.out.println("Size of 1st LinkedList is : "+ll1.size());
        System.out.println("Size of 2nd LinkedList is : "+ll2.size());
        System.out.println("Size of 3rd LinkedList is : "+ll3.size());

        //RemoveFirst and RemoveLast Function
        System.out.println("\nRemoving first and Removing Last: \n");
        System.out.println(ll1.removeFirst());
        System.out.println(ll2.removeLast());
        System.out.println(ll3.removeFirst());

        //Displaying the Remaining elements in LinkedLists
        System.out.println("\nDisplaying remaining elements in Linked Lists: \n");
        System.out.println("Linked List 1: "+ll1);
        System.out.println("Linked List 2: "+ll2);
        System.out.println("Linked List 3: "+ll3);
    }
}
