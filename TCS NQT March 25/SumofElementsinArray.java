import java.util.Scanner;
class SumofElementsinArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the no of elements in the array: ");
int n=s.nextInt();
int sum=0;
int a[]=new int[n];
System.out.println("Enter the elements in the array: ");
for(int i=0; i<n; i++){
a[i]=s.nextInt();
sum+=a[i];
}
System.out.println(sum);
s.close();
}
}