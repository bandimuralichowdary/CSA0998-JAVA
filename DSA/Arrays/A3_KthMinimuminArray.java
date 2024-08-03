//ARRAY - 3
//Kth min element in an Array
import java.util.*;
import java.util.Arrays;
public class A3_KthMinimuminArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N=s.nextInt();
        int[] a=new int[N];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<N; i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the Kth value: ");
        int k=s.nextInt();
        int min=0;
        for(int i=0; i<N; i++){
            min=a[k-1];
        }
        System.out.println(k+"th Minimum element: "+min);
        s.close();
    }
}
