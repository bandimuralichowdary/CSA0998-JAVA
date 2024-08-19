import java.util.*;
import java.util.LinkedList;
public class LL06_ReversingLinkedList1 {
    public static void main(String[] args){
        try{
            Scanner s=new Scanner(System.in);
            LinkedList<Integer> ll=new LinkedList<>();
            System.out.println("Enter the size of the LinkedList: ");
            int n=s.nextInt();
            for(int i=1; i<=n; i++){
                int ele=s.nextInt();
                ll.add(ele);
            }
            s.close();
            System.out.println(ll);
            Iterator<Integer> x=ll.descendingIterator();
            while(x.hasNext()){
                System.out.print(x.next()+"->");
            }
            System.out.println("NULL");
        }catch(NullPointerException e){
            System.out.println("Exception thrown: "+e);
        }
    }
}
