//MEDIUM-2
//Mth maximum and Nth Minimum numbers
import java.util.*;
class MthMaxNthMin_02{
public static void main(String[] args){
int size;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array: ");
size=s.nextInt();
int arr[]=new int[size];
System.out.println("Enter the Array elements: ");
for(int i=0; i<size; i++){
arr[i]=s.nextInt();
}
int length=arr.length;
int m, n, max=0, min=0;
System.out.println("Enter the Mth value :");
m=s.nextInt();
System.out.println("Enter the Nth value :");
n=s.nextInt();
if(m==0||n==0){
System.out.println("Enter a positive value: ");
}
else{
max=arr[length-m];
min=arr[n-1];
System.out.println("Mth Maximum is:"+max);
System.out.println("Nth Minimum is:"+min);
System.out.println("Sum is:"+(max+min));
System.out.println("Difference is:"+(max-min));
}
}
}
