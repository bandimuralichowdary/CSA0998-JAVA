import java.util.Scanner;
class MaxProductofThreeNumbers{
static int MaxProduct(int[] a){
int maxpro=1;
for(int i=0; i<a.length; i++){
maxpro*=a[i];
}
return maxpro;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter no of terms: ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the "+n+" terms : ");
for(int i=0; i<n; i++){
a[i]=s.nextInt();
}
System.out.println("Maximum Product is: "+MaxProduct(a));
s.close();
}
}