//ARRAY - 1
//Array Reverse
import java.util.*;
public class A1_ArrayReverse{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        int[] rev=new int[n];
        System.out.println("Reversed array: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
        s.close();
    }
}
