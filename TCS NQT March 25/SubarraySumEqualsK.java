import java.util.Scanner;
class SubarraySumEqualsK{
static int sumofsubarray(int[] nums, int k){
int count=0;
for(int i=0; i<nums.length; i++){
int sum=0;
for(int j=i; j<nums.length; j++){
sum+=nums[j];
if(sum==k){
count++;
}
}
}
return count;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of elements in the array: ");
int n=s.nextInt();
System.out.println("Enter the elements: ");
int a[]=new int[n];
for(int i=0; i<n; i++){
a[i]=s.nextInt();
}
System.out.println("Enter the k value: ");
int k=s.nextInt();
int count=sumofsubarray(a, k);
System.out.println(count);
s.close();
}
}