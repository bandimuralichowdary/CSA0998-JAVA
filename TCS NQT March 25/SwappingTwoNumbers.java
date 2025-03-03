import java.util.Scanner;
class SwappingTwoNumbers{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter 1st Number: ");
int a=s.nextInt();
System.out.print("Enter 2nd Number: ");
int b=s.nextInt();
int c=a;
a=b;
b=c;
System.out.println("First Number: "+a+"\nSecond Number: "+b);
s.close();
}
}