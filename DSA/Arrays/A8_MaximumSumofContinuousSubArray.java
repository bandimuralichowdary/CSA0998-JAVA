//ARRAY - 8
//Maximum continuous sum in subarray (or) KADANE'S ALGORITHM
import java.util.*;
public class A8_MaximumSumofContinuousSubArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        int sum=a[0],maxsum=a[0];
        for(int i=1; i<n; i++){
            sum=Math.max(a[i], sum+a[i]);
            maxsum=Math.max(maxsum, sum);
        }
        System.out.println("Maximum possible sum of subarray: "+maxsum);
        s.close();
    }
}
