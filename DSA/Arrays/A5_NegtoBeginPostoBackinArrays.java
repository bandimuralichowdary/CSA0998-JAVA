//ARRAY - 5
//Negative to begin and Positive to end
import java.util.*;
import java.util.Arrays;
public class A5_NegtoBeginPostoBackinArrays {
    public static void move(int[] arr){
        Arrays.sort(arr);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=s.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        move(a);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
        s.close();
    }
}
