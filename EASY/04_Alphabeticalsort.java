//Easy 04 *
import java.util.*;
class Alphabeticalsort_04{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String temp;
        int n;
        System.out.println("Enter no of words:");
        n=s.nextInt();
        String a[]=new String[n];
        System.out.println("Enter "+n+" words: ");
        for(int i=0;i<n;i++){
            a[i]=s.next();
        }
        System.out.println("Enter your choice: (A/D)");
        char ch=s.next().charAt(0);
        if(ch=='A'){
            for(int i=0;i<n+1;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i].compareTo(a[j])>0){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
        else if(ch=='D'){
            for(int i=0;i<n+1;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i].compareTo(a[j])<0){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
        else{
            System.out.println("Enter a valid choice!!");
            return;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
