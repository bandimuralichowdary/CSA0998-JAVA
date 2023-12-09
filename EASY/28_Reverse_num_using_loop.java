import java.util.*;
class Reversenum{
public static int reverse(int n){
int rev=0, rem;
while(n>0){
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
return rev;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter the number :");
n=s.nextInt();
System.out.println("Number "+n+" after reversing is "+reverse(n));
}
}
