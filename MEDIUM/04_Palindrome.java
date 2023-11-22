//MEDIUM-4
//Palindrome String and Number
import java.util.*;
class Palindrome_04{
public static void main(String[] args){
int choice;
String value;
Scanner s=new Scanner(System.in);
System.out.println("Enter the choice: ");
choice=s.nextInt();
System.out.println("Enter the String: ");
value=s.next();
switch(choice){
case 1:
int num=Integer.parseInt(value);
int num1=num, rev=0, rem;
while(num>0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(num1==rev){
System.out.println("It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
break;
case 2:
StringBuffer s1=new StringBuffer(value);
s1.reverse();
String s2=s1.toString();
if(value.equals(s2)){
System.out.println("It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
break;
default:
System.out.println("Enter a valid choice i.e., 1or2");
}
}
}
