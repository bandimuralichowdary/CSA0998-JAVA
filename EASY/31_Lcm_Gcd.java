import java.util.*;
import java.io.*;
class Practice
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
int num1,num2;
System.out.println("enter the first num");
num1=sc.nextInt();
System.out.println("Enter the second number");
num2=sc.nextInt();
int small=(num1<num2)?num1:num2;
int count=1,gcd=0;
while(count<=small)
{
if(num1%count == 0 && num2%count == 0)
{
gcd=count;
}
count++;
}
int lcm=(num1*num2)/gcd;
System.out.println("the lcm is:"+lcm);
System.out.println("the gcd is:"+gcd);
}
catch(Exception e)
{
System.out.println("Invalid input");
}
}
}
