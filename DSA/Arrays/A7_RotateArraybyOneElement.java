//ARRAY - 7
//Rotate Array by one
import java.util.*;
public class A7_RotateArraybyOneElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);;
        System.out.println("Enter the length of array: ");
        int n=s.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a=new int[n];
        int[] a2=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println();
        for(int i=0; i<n; i++){
            if(i==0){
                a2[0]=a[n-1];
            }
            else if(i>=1 && i<n ){
                a2[i]=a[i-1];
            }
            System.out.println(a2[i]);
        }
        s.close();
    }
}
