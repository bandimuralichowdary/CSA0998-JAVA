import java.util.*;
import java.io.*;
class SumofEvenFib
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int i,n,sum=0;
System.out.println("enter the number");
n=sc.nextInt();
int fib[] = new int[2*n+1];
fib[0]=0;
fib[1]=1;
for(i=2;i<=2*n;i++)
{
fib[i]=fib[i-1]+fib[i-2];
if(i%2==0)
{
sum+=fib[i];
}
}
System.out.println("Even sum of fibonacci series is:- "+sum );
}
}
