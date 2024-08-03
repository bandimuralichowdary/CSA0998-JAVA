/*ARRAY - 9
Minimize the Maximum difference between heights
Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}. 
The difference between 
the largest and the smallest is 8-3 = 5.*/
package DSA;
import java.util.*;
public class A9_MinimizetheMaximumDifferenceBetweenHeights{
    public static int smallestdiff(int[] a, int n, int k){
        if (n==1)
            return 0;
        Arrays.sort(a);
        int ans=a[n-1]-a[0];
        int smallest=a[0]+k;
        int largest=a[n-1]-k;
        if(smallest>largest){
            int temp=smallest;
            smallest=largest;
            largest=temp;
        }
        for(int i=1; i<n-1; i++){
            int add=a[i]+k;
            int sub=a[i]-k;
            if(sub>=smallest || add<=largest){
                continue;
            }
            if(largest-sub <= smallest+add){
                smallest=sub;
            }
            else{
                largest=add;
            }
        }
        return Math.min(ans, largest-smallest);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int n=s.nextInt();
        System.out.println("Enter the K value: ");
        int k=s.nextInt();
        System.out.println("Enter the Array elements: ");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println(smallestdiff(a, n, k));
        s.close();
    }
}
