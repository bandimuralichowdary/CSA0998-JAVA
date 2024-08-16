import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Solution{
    static boolean search(int n, int key, Node head){
        Node curr=head;
        while(curr!=null){
            if(curr.data==key) return true;
            curr=curr.next;
        }
        return false;
    }
}
class LL5_SearchForAnElementInLinkedList{
    Node head;
    public void insert(int n){
        Node new_data=new Node(n);
        if(head==null){
            head=new_data;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_data;
        }
    }
    public void print(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        LL5_SearchForAnElementInLinkedList ll=new LL5_SearchForAnElementInLinkedList();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of linkedlist: ");
        int n=s.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i+" : ");
            int ele=s.nextInt();
            ll.insert(ele);
        }
        System.out.println("Enter Key: ");
        int key=s.nextInt();
        s.close();
        ll.print();
        if(Solution.search(n, key, ll.head)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
