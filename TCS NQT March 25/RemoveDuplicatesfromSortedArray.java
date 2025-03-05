import java.util.*;
class RemoveDuplicatesfromSortedArray{
static int removeduplicates(int[] nums){
if(nums.length==0) return 0;
int index=1;
for(int i=1; i<nums.length; i++){
if(nums[i]!=nums[i-1]){
nums[index++]=nums[i];
}
}
return index;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of elements in the array: ");
int n=s.nextInt();
System.out.println("Enter the elements in the array: ");
int[] a=new int[n];
for(int i=0; i<n; i++){
a[i]=s.nextInt();
}

Arrays.sort(a);
int newLength=removeduplicates(a);

System.out.println("The elements after removing the duplicates :");
for(int i=0; i<newLength; i++){
System.out.print(a[i]+" ");
}
System.out.println();
s.close();
}
}