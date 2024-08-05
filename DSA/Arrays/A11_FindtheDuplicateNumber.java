//ARRAY - 11
//Find the Duplicate Number

/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
*/
import java.util.*;
public class A11_FindtheDuplicateNumber{
    public static int findDup(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:arr){
            int count=map.getOrDefault(num, 0);
            count++;
            if(count==2){
                return num;
            }
            map.put(num,count);
        }
        throw new IllegalArgumentException("No duplicate found in the array");
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=s.nextInt();
        System.out.println("Enter the array elements: ");
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        for(int num:a){
            if(num<1 || num>n){
                System.out.println("Enter only numbers in the range ["+1+","+n+"]");
                s.close();
                return;
            }
        }
        System.out.println("Duplicate Number : "+findDup(a));
        s.close();
    }
}
