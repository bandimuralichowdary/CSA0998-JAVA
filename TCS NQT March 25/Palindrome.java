import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice:1 for Number\nEnter choice:2 for String");
System.out.println("Enter your choice: ");
int choice=sc.nextInt();
System.out.println("Enter the string: ");
String value=sc.next();
switch(choice){
case 1:
int n=Integer.parseInt(value);
int n2=n, rem, rev=0;
while(n!=0){
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(n2==rev){
System.out.println("The given number is a Palindrome");
}
else{
System.out.println("The given number is Not a Palindrome");
}
break;
case 2:
StringBuffer s1=new StringBuffer(value);
s1.reverse();
String s2=s1.toString();
if(value.equals(s2)){
System.out.println("The given string is a Palindrome");
}
else{
System.out.println("The given string is Not a Palindrome");
}
break;
default:
System.out.println("Enter correct choice:");
}
}
}