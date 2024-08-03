//ARRAY - 10
//Minimum number of steps to reach end of the array
/*
Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}, n = 11
Output: 3 
Explanation:First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
Input: arr = {1, 4, 3, 2, 6, 7}, n = 6
Output: 2 
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
Input: arr = {0, 10, 20}, n = 3
Output: -1
Explanation: We cannot go anywhere from the 1st element.
*/
package DSA;
import java.util.*;
public class A10_MinNumofStepstoReachendofArray {
    public static int minjumps(int[] a, int n){
        if(n<=0){
            return 0;
        }
        if(a[0]==0){
            return -1;
        }
        int jumps=1;
        int far=a[0];
        int end=a[0];
        for(int i=1; i<n; i++){
            if(i==n-1){
                return jumps;
            }
            far=Math.max(far, i+a[i]);
            if(i==end){
                jumps++;
                end=far;
                if(end>=n-1){
                    return jumps;
                }
                if(i>=end){
                    return -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=s.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("No of steps: "+minjumps(a, n));
        s.close();
    }
}
