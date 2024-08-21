import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
class MyStack{
    Queue<Integer> q=new LinkedList<>();
    public MyStack(){

    }
    public void push(int n){
        q.add(n);
        for(int i=1; i<q.size(); i++){
            q.add(q.poll());
        }
    }
    public int pop(){
        return q.poll();
    }
    public int top(){
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
}
public class Stack01_ImplementingStackusingQueues{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        MyStack mystack=new MyStack();
        boolean continueLoop = true;
        while(continueLoop){
            System.out.println("1. Push\n2. Pop\n3. Top\n4. Empty\n5. Exit\n");
            int n=s.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the element to push into stack :");
                    int x=s.nextInt();
                    mystack.push(x);
                    System.out.println(x+" is pushed into stack");
                    break;
                case 2:
                    if(mystack.empty()){
                        System.out.println("Stack is empty!!");
                    }
                    else{
                        System.out.println(mystack.pop()+" element popped from stack!");
                    }break;
                case 3:
                    if(mystack.empty()){
                        System.out.println("Stack is empty!!");
                    }
                    else{
                        System.out.println(mystack.top()+" element is the top of stack!");
                    }break;
                case 4:
                    if(mystack.empty()){
                        System.out.println("Stack is empty!!");
                    }
                    else{
                        System.out.println("Stack is not empty!!");
                    }break;
                case 5:
                    continueLoop=false;
                    System.out.println("Exiting loop...");
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }
        }
        s.close();
    }
}
