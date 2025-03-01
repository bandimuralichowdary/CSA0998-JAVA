import java.util.*;
class SumofArrayElements{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of terms in the array: ");
int n=sc.nextInt();
int sum=0;
int a[]=new int[n];
System.out.println("Enter the elements one by one: ");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
sum+=a[i];
}
System.out.println(sum);
}
}