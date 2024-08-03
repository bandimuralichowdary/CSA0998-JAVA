package DSA;
//ARRAY - 2
//Min max element in an Array
import java.util.*;
public class A2_MinMaxElementsinArray {
    public static int setmax(int[] a, int N){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static int setmin(int[] a, int N){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N=s.nextInt();
        int[] a=new int[N];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<N; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Maximum element is: "+setmax(a, N));
        System.out.println("Minimum element is: "+setmin(a, N));
        s.close();
    }
}


//OR

/*
import java.util.*;
import java.util.Arrays;
public class A2_MinMaxElementsinArray {
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
        int min=0, max=0;
        for(int i=0; i<N; i++){
            min=a[0];
            max=a[N-1];
        }
        System.out.println("Minimum element: "+min);
        System.out.println("Maximum element: "+max);
        s.close();
    }
}
 */
