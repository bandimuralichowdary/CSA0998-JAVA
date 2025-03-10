import java.util.Scanner;
import java.util.Arrays;

class SecondLargestNumberinArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the no of terms: ");
int n=s.nextInt();

if(n<2){
System.out.println("The second largest number is: -1");
return;
}

int[] arr=new int[n];
System.out.println("Enter all elements "+n+" of array: ");
for(int i=0; i<n; i++){
arr[i]=s.nextInt();
}

Arrays.sort(arr);

int largest=arr[n-1];
int secondLargest=-1;

for(int i=n-2;i>=0; i--){
if(arr[i]<largest){
secondLargest=arr[i];
break;
}
}

System.out.println("Second largest number is: "+secondLargest);
}
}